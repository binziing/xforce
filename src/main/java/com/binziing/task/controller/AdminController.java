package com.binziing.task.controller;

import com.binziing.task.jooq.tables.pojos.TAdmin;
import com.binziing.task.service.AdminService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private com.binziing.task.service.AdminService adminService;

    @RequestMapping("/display")
    public ModelAndView display(){
        ModelAndView modelAndView = new ModelAndView();
        List<TAdmin> admins = adminService.queryAll();
        modelAndView.addObject("adminList",admins);
        modelAndView.setViewName("display");
        return modelAndView;
    }

    @RequestMapping("/delete")
    public ModelAndView delete(HttpServletRequest request){
        int deleteId = Integer.parseInt(request.getParameter("id"));
        adminService.delete(deleteId);
        return new ModelAndView("redirect:/display");
    }

    @GetMapping("/addPage")
    public ModelAndView addPage(Model model){
        model.addAttribute("admin",new TAdmin());
        return new ModelAndView("add","adminModel",model);
    }

    @PostMapping("/add")
    public ModelAndView add(TAdmin tadmin){
        adminService.add(tadmin);
        return new ModelAndView("redirect:/display");
    }

    @GetMapping("/sendAdminId")
    public ModelAndView sendAdminId(HttpServletRequest request,Model model){
        int updateId = Integer.parseInt(request.getParameter("id"));
        TAdmin tadmin = adminService.selectByPrimaryKey(updateId);
        model.addAttribute("admin",tadmin);
        return new ModelAndView("update","adminModel",model);
    }

    @PostMapping("edit")
    public ModelAndView edit(TAdmin tadmin){
        adminService.update(tadmin);
        return new ModelAndView("redirect:/display");
    }
}
