package com.kundana.SpringBootWeb1;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {


    @RequestMapping("/")
    public String home(){

        System.out.println("home method called");
        return "index";
    }
    @RequestMapping("add")
   // public String add(HttpServletRequest req, HttpSession session){
//    int num1= Integer.parseInt(req.getParameter("num1"));
//    int num2= Integer.parseInt(req.getParameter("num2"));
//    int result=num1+num2;
//
//        session.setAttribute("result", result);
//
  //      return "result.jsp";



    public String add(int num1, int num2, Model model){

        int result=num1+num2;

        model.addAttribute("result", result);
//
        return "result";
    }
}
