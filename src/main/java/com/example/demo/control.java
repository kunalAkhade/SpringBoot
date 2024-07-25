package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class control {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public void get(Alien alien) {

        // can use HttpSession, req.getParameter(), req.setAttribute(),
        // session.setAttribute()

        // ModelAndView mv = new ModelAndView("res.jsp");
        // mv.addObject("alien", alien);
        // mv.setViewName("home");
        // return mv;

        repo.save(alien);

    }

}
