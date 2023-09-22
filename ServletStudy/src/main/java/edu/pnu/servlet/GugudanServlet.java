package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String type = req.getParameter("type");
		String snum = req.getParameter("num");

//		System.out.println(type);
//		System.out.println(snum);

		res.setContentType("text/html; charset = utf-8");
		
		int num = 2;
		if (snum != null)
			num = Integer.parseInt(snum);
		try (PrintWriter out = res.getWriter();) {

			out.println("<h2>구구단 타입 3 (Servlet)</h2>");
\
			if (type == null || type.equals("list")) {
				out.printf("<h3>%d단입니다.</h3>", num);
				out.println("<ul>");
				for (int i = 1; i < 10; i++) {
					out.printf("<li>%d * %d = %d</li>", num, i, num * i);
				}
				out.println("</ul>");
			} else {
				out.println("<table border = \"1\" style = \"width : 200px; text-align : center;\">");
				out.println("<tr><td>" + num + "단입니다.</td></tr>");
				for (int i = 1; i < 10; i++) {
					out.printf("<tr><td>%d * %d = %d</td></tr>\n", num, i, num * i);
				}
				out.println("</table>");
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
