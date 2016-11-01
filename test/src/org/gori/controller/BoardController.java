package org.gori.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gori.dao.BoardDAO;
import org.gori.dto.Board;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("*.board")
public class BoardController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String path = req.getContextPath();		
		String pattern = uri.substring(path.length()+1);
		String viewName = "";
		System.out.println(pattern);
		if(pattern.equals("boardList.board")){
			List<Board> list =  BoardDAO.list();
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i).toString());
			}
			req.setAttribute("list", list);
			viewName="/Board/boardList.jsp";
		}
		else if(pattern.equals("boardWrite.board")){
			
			viewName="/Board/boardWrite.jsp";			
		}
		RequestDispatcher view = req.getRequestDispatcher(viewName);
		view.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String path = req.getContextPath();		
		String pattern = uri.substring(path.length()+1);
		String viewName = "";
		System.out.println(pattern);		
		if(pattern.equals("boardWrite.board")){
			System.out.println("boardWrite");
			String realFolder = "";
			 String filename1 = "";
			 int maxSize = 1024*1024*5;
			 String encType = "UTF-8";
			 String savefile = "img";
			 ServletContext scontext = getServletContext();
			 realFolder = "C:\\eclipse-jee-neon-R-win32-x86_64\\eclipse\\BoardImg";
			 System.out.println(realFolder);
			 try{
			  MultipartRequest multi=new MultipartRequest(req, realFolder, maxSize, encType, new DefaultFileRenamePolicy());
			  Enumeration<?> files = multi.getFileNames();
			     String file1 = (String)files.nextElement();
			     filename1 = multi.getFilesystemName(file1);
			     String title=multi.getParameter("title");
			     String content=multi.getParameter("content");
			     String tags=multi.getParameter("tags");
			     String fullpath = realFolder + "\\" + filename1;
				 BoardDAO.insert(new Board(title, content, tags, fullpath, 0, ""));

			 } catch(Exception e) {
				 e.printStackTrace();
			 }			 

			 resp.sendRedirect("boardList.board");		 
		}
		
		
	}
}
