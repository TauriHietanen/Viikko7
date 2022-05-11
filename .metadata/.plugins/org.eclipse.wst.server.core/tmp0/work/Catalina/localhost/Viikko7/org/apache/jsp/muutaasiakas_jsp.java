/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.20
 * Generated at: 2022-05-11 19:47:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class muutaasiakas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<script src=\"scripts/main.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\r\n");
      out.write("<title>Asiakkaan muutos</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body onkeydown=\"tutkiKey(event)\">\r\n");
      out.write("<form id=\"tiedot\">\r\n");
      out.write("	<table>\r\n");
      out.write("	<thead>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th colspan=\"3\" id=\"ilmo\"></th>\r\n");
      out.write("			<th colspan=\"2\" class=\"oikealle\"><a href=\"listaaasiakkaat.jsp\" id=\"takaisin\">Takaisin listaukseen</a></th>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>Etunimi</th>\r\n");
      out.write("			<th>Sukunimi</th>\r\n");
      out.write("			<th>Puhelin</th>\r\n");
      out.write("			<th>Sähköposti</th>\r\n");
      out.write("			<th></th>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</thead>\r\n");
      out.write("	<tbody>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td><input type=\"text\" name=\"etunimi\" id=\"etunimi\"></td>\r\n");
      out.write("			<td><input type=\"text\" name=\"sukunimi\" id=\"sukunimi\"></td>\r\n");
      out.write("			<td><input type=\"text\" name=\"puhelin\" id=\"puhelin\"></td>\r\n");
      out.write("			<td><input type=\"text\" name=\"sposti\" id=\"sposti\"></td> \r\n");
      out.write("			<td><input type=\"button\" id=\"tallenna\" value=\"Hyväksy\" onclick=\"vieTiedot()\"></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<input type=\"hidden\" name=\"asiakas_id\" id=\"asiakas_id\">\r\n");
      out.write("</form>\r\n");
      out.write("<span id=\"ilmo\"></span>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("function tutkiKey(event){\r\n");
      out.write("	if(event.keyCode==13){//Enter\r\n");
      out.write("		vieTiedot();\r\n");
      out.write("	}			\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("document.getElementById(\"etunimi\").focus();//viedään kursori rekno-kenttään sivun latauksen yhteydessä\r\n");
      out.write("\r\n");
      out.write("//Haetaan muutettavan asiakkaan tiedot. Kutsutaan backin GET-metodia ja välitetään kutsun mukana muutettavan tiedon id\r\n");
      out.write("//GET /asiakkaat/haeyksi/id\r\n");
      out.write("var asiakas_id = requestURLParam(\"asiakas_id\"); //Funktio löytyy scripts/main.js \r\n");
      out.write("fetch(\"asiakkaat/haeyksi/\" + asiakas_id,{//Lähetetään kutsu backendiin\r\n");
      out.write("    method: 'GET'	      \r\n");
      out.write("  })\r\n");
      out.write(".then( function (response) {//Odotetaan vastausta ja muutetaan JSON-vastausteksti objektiksi\r\n");
      out.write("	return response.json()\r\n");
      out.write("})\r\n");
      out.write(".then( function (responseJson) {//Otetaan vastaan objekti responseJson-parametrissä	\r\n");
      out.write("	console.log(responseJson);\r\n");
      out.write("	document.getElementById(\"etunimi\").value = responseJson.etunimi;		\r\n");
      out.write("	document.getElementById(\"sukunimi\").value = responseJson.sukunimi;	\r\n");
      out.write("	document.getElementById(\"puhelin\").value = responseJson.puhelin	\r\n");
      out.write("	document.getElementById(\"sposti\").value = responseJson.sposti;	\r\n");
      out.write("	document.getElementById(\"asiakas_id\").value = responseJson.asiakas_id;	\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("/Funktio tietojen muuttamista varten. Kutsutaan backin PUT-metodia ja välitetään kutsun mukana muutetut tiedot json-stringinä.\r\n");
      out.write("//PUT /autot/\r\n");
      out.write("function vieTiedot(){	\r\n");
      out.write("	var ilmo=\"\";\r\n");
      out.write("	if(document.getElementById(\"etunimi\").value.length<2){\r\n");
      out.write("		ilmo=\"Etunimi ei kelpaa!\";		\r\n");
      out.write("	}else if(document.getElementById(\"sukunimi\").value.length<2){\r\n");
      out.write("		ilmo=\"Sukunimi ei kelpaa!\";		\r\n");
      out.write("	}else if(document.getElementById(\"puhelin\").value.length<5){\r\n");
      out.write("		ilmo=\"Puhelinnumero ei kelpaa!\";		\r\n");
      out.write("	}else if(document.getElementById(\"sposti\").value.length>6){\r\n");
      out.write("		ilmo=\"Sähköposti ei kelpaa!\";				\r\n");
      out.write("	}\r\n");
      out.write("	if(ilmo!=\"\"){\r\n");
      out.write("		document.getElementById(\"ilmo\").innerHTML=ilmo;\r\n");
      out.write("		setTimeout(function(){ document.getElementById(\"ilmo\").innerHTML=\"\"; }, 3000);\r\n");
      out.write("		return;\r\n");
      out.write("	}\r\n");
      out.write("	document.getElementById(\"etunimi\").value=siivoa(document.getElementById(\"etunimi\").value);\r\n");
      out.write("	document.getElementById(\"sukunimi\").value=siivoa(document.getElementById(\"sukunimi\").value);\r\n");
      out.write("	document.getElementById(\"puhelin\").value=siivoa(document.getElementById(\"puhelin\").value);\r\n");
      out.write("	document.getElementById(\"sposti\").value=siivoa(document.getElementById(\"sposti\").value);\r\n");
      out.write("	\r\n");
      out.write("	var formJsonStr=formDataToJSON(document.getElementById(\"tiedot\")); //muutetaan lomakkeen tiedot json-stringiksi\r\n");
      out.write("	console.log(formJsonStr);\r\n");
      out.write("	//Lähetään muutetut tiedot backendiin\r\n");
      out.write("	fetch(\"asiakkaat\",{//Lähetetään kutsu backendiin\r\n");
      out.write("	      method: 'PUT',\r\n");
      out.write("	      body:formJsonStr\r\n");
      out.write("	    })\r\n");
      out.write("	    .then( function (response) {//Odotetaan vastausta ja muutetaan JSON-vastaus objektiksi\r\n");
      out.write("			return response.json();\r\n");
      out.write("		})\r\n");
      out.write("		.then( function (responseJson) {//Otetaan vastaan objekti responseJson-parametrissä	\r\n");
      out.write("		var vastaus = responseJson.response;		\r\n");
      out.write("		if(vastaus==0){\r\n");
      out.write("			document.getElementById(\"ilmo\").innerHTML= \"Tietojen päivitys epäonnistui\";\r\n");
      out.write("        }else if(vastaus==1){	        	\r\n");
      out.write("        	document.getElementById(\"ilmo\").innerHTML= \"Tietojen päivitys onnistui\";			      	\r\n");
      out.write("		}	\r\n");
      out.write("		setTimeout(function(){ document.getElementById(\"ilmo\").innerHTML=\"\"; }, 5000);\r\n");
      out.write("		});	\r\n");
      out.write("		document.getElementById(\"tiedot\").reset(); //tyhjennetään tiedot -lomake\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
