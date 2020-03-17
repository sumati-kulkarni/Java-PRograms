import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
	    int i;
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>\n<title>Hello World</title>\n</head>\n");
		out.println("<body>\n");
		out.println("<h1>Hello World From First Servlet Program<h1>");
		out.println("</body></html>");
	}
}
