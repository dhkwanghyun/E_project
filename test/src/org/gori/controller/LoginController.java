package org.gori.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gori.dao.LoginDAO;
import org.gori.dto.SignUp;
import org.omg.CORBA.Request;

import net.sf.json.JSONObject;

@WebServlet("*.login")
public class LoginController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String path = req.getContextPath();
		String pattern = uri.substring(path.length()+1);
		System.out.println(pattern);
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String email=req.getParameter("email");
		String signUpId=req.getParameter("signUpId");
		String signUpPassword=req.getParameter("signUpPassword");
		
		
				
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String path = req.getContextPath();
		String pattern = uri.substring(path.length()+1);
		String viewName="";
		System.out.println(pattern);
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String email=req.getParameter("email");
		String signUpId=req.getParameter("signUpId");
		String signUpPassword=req.getParameter("signUpPassword");
		
//		if(pattern.equals("idCheck.login")){						
//			//System.out.println(req.getParameter("signUpId"));
//			boolean idCheck = idCheck(signUpId);
//			resp.getWriter().print(idCheck);
//						
//		}
		if(pattern.equals("signUp.login")){
			System.out.println(name+" , "+age+" , "+email+" , "+signUpId+" , "+signUpPassword);
			boolean idCheck = idCheck(signUpId);
			if(!idCheck){
				resp.getWriter().print("err101901");
			}
			else{
				resp.getWriter().print("success");
			}
			
		}
		
		
		System.out.println("dopost.....");
		
	}

	private boolean idCheck(String id) {		
		return LoginDAO.idCheck(id);
	}
	
	
}
