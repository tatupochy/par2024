/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-20 00:10:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class factorial_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <title>Cálculo del factorial</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>Cálculo del factorial</h1>\n");
      out.write("<!-- Formulario que solicita al usuario el número a usar en el cálculo -->\n");
      out.write("<form action=\"factorial.jsp\" method=\"get\">\n");
      out.write("  <p>Número: <input type=\"text\" name=\"numero\">\n");
      out.write("    <input type=\"submit\" value=\"Calcular\"></p>\n");
      out.write("</form>\n");

  // A través del objeto request se obtiene el valor pasado por el formulario
  String numeroGet = request.getParameter("numero");
  if(numeroGet!=null) {
    int numero=0;
    double factorial=1;
    boolean error = false;
    try {
      numero = Integer.valueOf(numeroGet);
      if(numero<1) {
        error = true;
      } else {
        for(int i=numero; i>1; i--) {
          factorial *= i;
        }
      }
    } catch(NumberFormatException e) {
      error = true;
    }
    if(error) {
      out.println("<p>Debe indicar un número entero mayor que 0</p>");
    } else {
      // Mostrar el resultado en la página usando el objeto out
      out.println("<p>Resultado: "+numero + "! = " + factorial+"</p>");
    }
  }

  // Uso del objeto session para contar las veces que se ejecuta la aplicación
  Integer contador = (Integer)session.getAttribute("contadorVisitas");
  if(contador!=null) {
    contador = Integer.valueOf(contador);
  } else {
    contador = 0;
  }
  if(contador!=0) {
    out.println("<p>Ejecuciones de la aplicación en esta sesión: "+contador+
            "</p>");
  }
  contador++;
  session.setAttribute("contadorVisitas", contador);

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
