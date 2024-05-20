<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Galería de Imágenes</title>
    <style>
        .gallery img {
            width: 200px;
            height: auto;
            margin: 10px;
        }
        .gallery {
            display: flex;
            flex-wrap: wrap;
        }
    </style>
</head>
<body>
<h1>Galería de Imágenes</h1>
<div class="gallery">
    <%
        String imagePath = application.getRealPath("/images");
        java.io.File imageDir = new java.io.File(imagePath);
        if (imageDir.exists() && imageDir.isDirectory()) {
            String[] images = imageDir.list(new java.io.FilenameFilter() {
                @Override
                public boolean accept(java.io.File dir, String name) {
                    String lowercaseName = name.toLowerCase();
                    return lowercaseName.endsWith(".jpg") || lowercaseName.endsWith(".jpeg") || lowercaseName.endsWith(".png") || lowercaseName.endsWith(".gif");
                }
            });
            if (images != null) {
                for (String image : images) {
                    out.println("<img src='images/" + image + "' alt='" + image + "' />");
                }
            } else {
                out.println("<p>No se encontraron imágenes en el directorio.</p>");
            }
        } else {
            out.println("<p>El directorio de imágenes no existe.</p>");
        }
    %>
</div>
</body>
</html>
