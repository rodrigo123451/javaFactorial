package FactorialServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FactorialService.FactorialService;


/**
 * Servlet implementation class FactorialServlet
 */
@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer n1=Integer.parseInt(request.getParameter("Numero"));
		Integer resultado=0;
		FactorialService service=new FactorialService(); 
		resultado=service.factorial(n1);
		//reporte
		response.setContentType("text/hyml;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>factorial</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>FACTORIAL</h1>");
		out.println("<p>numero 1:"+n1+"</p>");
		
		out.println("<p>resultado:"+resultado+"</p>");
		out.println("<p><a href='index.html'>nueva operacion</a></p>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}

}
