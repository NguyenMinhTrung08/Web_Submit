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
import jakarta.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/register"})
public class RegisterController extends HttpServlet {


	private static final long serialVersionUID = 1L;
	InterFaceUserService service = new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/register.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// mã hóa UTF-8
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");

		// lấy tham số từ view
		String username = req.getParameter("uname");
		String password = req.getParameter("psw");

		// Kiểm tra thông số
		String alertMsg = "";
		if (username.isEmpty() || password.isEmpty()) {
		    alertMsg = "Tài khoản hoặc mật khẩu không được rỗng";
		    req.setAttribute("alert", alertMsg);
		    req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
		    return;
		}


		UserModel existingUser = service.FindByUserName(username);
		if (existingUser != null) {

		    alertMsg = "Tài khoản đã tồn tại";
		    req.setAttribute("alert", alertMsg);
		    req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
		} else {

		    UserModel newUser = new UserModel();
		    newUser.setUsername(username);
		    newUser.setPassword(password);
		    
		    service.Register(newUser); 

		    HttpSession session = req.getSession(true);
		    session.setAttribute("account", newUser);
		    resp.sendRedirect(req.getContextPath() + "/waiting");
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
import jakarta.servlet.http.HttpSession;


@WebServlet(urlPatterns = {"/register"})
public class RegisterController extends HttpServlet {


	private static final long serialVersionUID = 1L;
	InterFaceUserService service = new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/register.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// mã hóa UTF-8
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");

		// lấy tham số từ view
		String username = req.getParameter("uname");
		String password = req.getParameter("psw");

		// Kiểm tra thông số
		String alertMsg = "";
		if (username.isEmpty() || password.isEmpty()) {
		    alertMsg = "Tài khoản hoặc mật khẩu không được rỗng";
		    req.setAttribute("alert", alertMsg);
		    req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
		    return;
		}


		UserModel existingUser = service.FindByUserName(username);
		if (existingUser != null) {

		    alertMsg = "Tài khoản đã tồn tại";
		    req.setAttribute("alert", alertMsg);
		    req.getRequestDispatcher("/views/register.jsp").forward(req, resp);
		} else {

		    UserModel newUser = new UserModel();
		    newUser.setUsername(username);
		    newUser.setPassword(password);
		    
		    service.Register(newUser); 

		    HttpSession session = req.getSession(true);
		    session.setAttribute("account", newUser);
		    resp.sendRedirect(req.getContextPath() + "/waiting");
		}

	}
}
>>>>>>> 8c1f23247e42ea9e6c00a664fd37eba6dc83c1d7
