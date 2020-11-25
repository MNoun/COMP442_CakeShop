package Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(
        name = "loginservlet",
        urlPatterns = "/login"
)

public class BakeryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("Username");
        String password = req.getParameter("Password");

        List list = new ArrayList();

        list.add(username);
        list.add(password);

        req.setAttribute("brands", list);
        RequestDispatcher view = req.getRequestDispatcher("results.jsp");
        view.forward(req, resp);

    }
}