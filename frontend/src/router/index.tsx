import {createBrowserRouter} from "react-router-dom";
import PageNotFound from "@/pages/PageNotFound.tsx";


export const router = createBrowserRouter([
    {path: "*", element: <PageNotFound/>},
]);