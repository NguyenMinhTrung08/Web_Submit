<<<<<<< HEAD
package Automation.Web.controllers;

import java.io.IOException;

import Automation.Web.models.UserModel;
import Automation.Web.services.InterFaceUserService;
import Automation.Web.services.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/changepassword" })
public class ChangePSWController extends HttpServlet {


	private static final long serialVersionUID = 1L;
    InterFaceUserService service = new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/changepsw.jsp").forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// mã hóa UTF-8
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        // lấy tham số từ view
        String username = req.getParameter("uname");
        String newPassword = req.getParameter("newPsw");

        String alertMsg = "";

        if (username.isEmpty() || newPassword.isEmpty()) {
            alertMsg = "Tài khoản hoặc mật khẩu mới không được rỗng";
            req.setAttribute("alert", alertMsg);
            req.getRequestDispatcher("/views/changepsw.jsp").forward(req, resp);
            return;
        }

        // Xử lý thay đổi mật khẩu
        UserModel user = service.FindByUserName(username);

        if (user != null) {
            service.ChangePassword(username, newPassword);
            alertMsg = "Mật khẩu đã được thay đổi thành công";
            req.setAttribute("alert", alertMsg);
            req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
        } else {
            alertMsg = "Tài khoản không tồn tại";
            req.setAttribute("alert", alertMsg);
            req.getRequestDispatcher("/views/changepsw.jsp").forward(req, resp);
        }
    }
	

}
=======
package Automation.Web.controllers;

import java.io.IOException;

import Automation.Web.models.UserModel;
import Automation.Web.services.InterFaceUserService;
import Automation.Web.services.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/changepassword" })
public class ChangePSWController extends HttpServlet {


	private static final long serialVersionUID = 1L;
    InterFaceUserService service = new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/changepsw.jsp").forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// mã hóa UTF-8
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        // lấy tham số từ view
        String username = req.getParameter("uname");
        String newPassword = req.getParameter("newPsw");

        String alertMsg = "";

        if (username.isEmpty() || newPassword.isEmpty()) {
            alertMsg = "Tài khoản hoặc mật khẩu mới không được rỗng";
            req.setAttribute("alert", alertMsg);
            req.getRequestDispatcher("/views/changepsw.jsp").forward(req, resp);
            return;
        }

        // Xử lý thay đổi mật khẩu
        UserModel user = service.FindByUserName(username);

        if (user != null) {
            service.ChangePassword(username, newPassword);
            alertMsg = "Mật khẩu đã được thay đổi thành công";
            req.setAttribute("alert", alertMsg);
            req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
        } else {
            alertMsg = "Tài khoản không tồn tại";
            req.setAttribute("alert", alertMsg);
            req.getRequestDispatcher("/views/changepsw.jsp").forward(req, resp);
        }
    }
	

}
>>>>>>> 8c1f23247e42ea9e6c00a664fd37eba6dc83c1d7
