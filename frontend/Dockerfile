# 1) Build
FROM node:20-alpine AS build
WORKDIR /app

# Copiamos primero manifests para aprovechar caché
COPY package.json package-lock.json* pnpm-lock.yaml* yarn.lock* ./

# Instalación (elige el que corresponda según lockfile)
RUN if [ -f package-lock.json ]; then npm ci; \
    elif [ -f pnpm-lock.yaml ]; then corepack enable && pnpm i --frozen-lockfile; \
    elif [ -f yarn.lock ]; then yarn install --frozen-lockfile; \
    else npm i; fi

# Copiamos el resto y compilamos
COPY . .

RUN if [ -f package-lock.json ]; then npm run build; \
    elif [ -f pnpm-lock.yaml ]; then corepack enable && pnpm build; \
    elif [ -f yarn.lock ]; then yarn build; \
    else npm run build; fi

# 2) Runtime (Nginx)
FROM nginx:1.27-alpine
# Vite genera dist/
COPY --from=build /app/dist /usr/share/nginx/html

# Opcional: para SPA (React Router) sirve index.html en rutas no existentes
# Si no usas routing en cliente, puedes quitar esto.
RUN printf '%s\n' \
  'server {' \
  '  listen 80;' \
  '  server_name _;' \
  '  root /usr/share/nginx/html;' \
  '  index index.html;' \
  '  location / {' \
  '    try_files $uri $uri/ /index.html;' \
  '  }' \
  '}' > /etc/nginx/conf.d/default.conf

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]