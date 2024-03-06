import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/login-main")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usr = req.getParameter("user");
        String pass = req.getParameter("password");
        System.out.println(usr+" "+pass);
        if(usr.equals("admin") && pass.equals("1234")){
            resp.setStatus(resp.SC_ACCEPTED);
            resp.setHeader("Location", "/Shopping-Cart/");
            resp.sendRedirect("/Shopping-Cart/");
            return;
        }

    }
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException
    {

        doGet(request, response);
    }
}
