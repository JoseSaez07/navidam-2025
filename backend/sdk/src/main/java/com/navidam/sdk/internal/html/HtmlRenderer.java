package com.navidam.sdk.internal.html;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.StringTemplateResolver;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class HtmlRenderer {

    private final TemplateEngine engineFromPath;
    private final TemplateEngine engineFromText;

    public HtmlRenderer() {
        ClassLoaderTemplateResolver classpathResolver = new ClassLoaderTemplateResolver();
        classpathResolver.setPrefix("templates/");
        classpathResolver.setSuffix(".html");
        classpathResolver.setTemplateMode("HTML");
        classpathResolver.setCharacterEncoding("UTF-8");
        classpathResolver.setCacheable(false);

        engineFromPath = new TemplateEngine();
        engineFromPath.setTemplateResolver(classpathResolver);

        // 2) Resolver para plantillas pasadas como String
        StringTemplateResolver stringResolver = new StringTemplateResolver();
        stringResolver.setTemplateMode("HTML");
        stringResolver.setCacheable(false);

        engineFromText = new TemplateEngine();
        engineFromText.setTemplateResolver(stringResolver);
    }

    /** Renderiza una plantilla por nombre: templates/<templateName>.html */
    public String render(String templateName, Object model) {
        Context ctx = new Context(new Locale("es", "ES"));
        ctx.setVariable("m", model);
        return engineFromPath.process(templateName, ctx);
    }

    /** Renderiza una plantilla HTML pasada como texto (String) */
    public String renderText(String templateHtml, Object model) {
        Context ctx = new Context(new Locale("es", "ES"));
        ctx.setVariable("m", model);
        return engineFromText.process(templateHtml, ctx);
    }

    public Path renderToFile(String templateName, Object model, Path outputFile) throws Exception {
        String html = render(templateName, model);
        Files.createDirectories(outputFile.getParent());
        Files.writeString(outputFile, html, StandardCharsets.UTF_8);
        return outputFile;
    }

    public Path renderTextToFile(String templateHtml, Object model, Path outputFile) throws Exception {
        String html = renderText(templateHtml, model);
        Files.createDirectories(outputFile.getParent());
        Files.writeString(outputFile, html, StandardCharsets.UTF_8);
        return outputFile;
    }
}