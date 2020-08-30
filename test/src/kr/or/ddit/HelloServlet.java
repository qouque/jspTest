package kr.or.ddit;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello.do")
public class HelloServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException
	{
		
		resp.setContentType("text/html;charset=utf-8");
		String data = "Hello Servlet";
		String contents = "<html><body>" + data + "</body></html>";
		
		PrintWriter out = resp.getWriter();
		out.println(contents);
		out.close();
	}

}