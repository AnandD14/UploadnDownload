/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.UploadnDownloaddao;
import com.model.BIM1stSem;
import com.oreilly.servlet.MultipartRequest;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.*;
import java.io.FileInputStream;
import java.util.List;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpSession;
/**
 *
 * @author AAAD3
 */
public class UploadnDownload extends HttpServlet {
final String FileLocation="E:/upload/";
final String[][] ContentTypes={{"pdf","application/pdf"},{"xml","text/xml"},{"docx","application/vnd.openxmlformats-officedocument.wordprocessingml.document"},{"doc","application/msword"}};
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
              UploadnDownloaddao upd=new UploadnDownloaddao();
           String contype=request.getContentType();
           if(contype != null && contype.indexOf("multipart/form-data")>=0 ){
               MultipartRequest m=new MultipartRequest(request,"E:/upload",20*1024*1024);
               File f=m.getFile("filetoupload");
              
                
               if(m.getParameter("semester")!=null && m.getParameter("semester").equals("1stSemester") ){
                   BIM1stSem b1=new BIM1stSem();
                   b1.setFilename(f.getName());
                  upd.insertBIM1stSem(b1);
               }
              else  if(m.getParameter("semester")!=null && m.getParameter("semester").equals("2ndSemester") ){
                   BIM2ndSem b2=new BIM2ndSem();
                   b2.setFilename(f.getName());
                  upd.insertBIM2ndSem(b2);
               }
                 else  if(m.getParameter("semester")!=null && m.getParameter("semester").equals("3rdSemester") ){
                   BIM3rdSem b3=new BIM3rdSem();
                   b3.setFilename(f.getName());
                  upd.insertBIM3rdSem(b3);
               }
                 else  if(m.getParameter("semester")!=null && m.getParameter("semester").equals("4thSemester") ){
                   BIM4thSem b4=new BIM4thSem();
                   b4.setFilename(f.getName());
                  upd.insertBIM4thSem(b4);
               }
                 else  if(m.getParameter("semester")!=null && m.getParameter("semester").equals("5thSemester") ){
                   BIM5thSem b5=new BIM5thSem();
                   b5.setFilename(f.getName());
                  upd.insertBIM5thSem(b5);
               }
                 else  if(m.getParameter("semester")!=null && m.getParameter("semester").equals("6thSemester") ){
                   BIM6thSem b6=new BIM6thSem();
                   b6.setFilename(f.getName());
                  upd.insertBIM6thSem(b6);
               }
                 else  if(m.getParameter("semester")!=null && m.getParameter("semester").equals("7thSemester") ){
                   BIM7thSem b7=new BIM7thSem();
                   b7.setFilename(f.getName());
                  upd.insertBIM7thSem(b7);
               }
                 else {
                   BIM8thSem b8=new BIM8thSem();
                   b8.setFilename(f.getName());
                  upd.insertBIM8thSem(b8);
               }
               response.sendRedirect("home.jsp");
           }
           if(request.getParameter("down")!=null && request.getParameter("down").equals("download")){
               Object requestObject=request.getParameter("filename");
               String fileName=(String) requestObject;
               FileInputStream filetodownload=new FileInputStream(FileLocation + fileName);
               ServletOutputStream out=response.getOutputStream();
               String contentType=getContentType(fileName.split("\\.")[1]);
               response.setContentType(contentType);
               response.setHeader("Content-Disposition","attachment; filename="+ fileName);
               response.setContentLength(filetodownload.available());
               int c;
               while((c=filetodownload.read())!= -1){
                   out.write(c);
               }
               out.flush();
               out.close();
               filetodownload.close();
           }
           
           if(request.getParameter("sub")!=null && request.getParameter("sub").equals("Login")){
              
              if(request.getParameter("adminame").equals("anand") && request.getParameter("password").equals("dayanand")){
        
                  String aname=request.getParameter("adminame");
                 String pass=request.getParameter("password");
                       HttpSession sess=request.getSession();
                       sess.setAttribute("Admin", aname);
                       response.sendRedirect("upload.jsp");
           }
                   else{
                       response.sendRedirect("adminLogin.jsp");

                   }
                       
           
           }
          
                   
           
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String getContentType(String file) {
       String returnType=null;
for(int i=0;i<ContentTypes.length;i++){
if(file.equals(ContentTypes[i][0]))
    returnType=ContentTypes[i][1];
    }
return returnType;
}}
