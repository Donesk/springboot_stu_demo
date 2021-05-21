package com.sd.controller;

import com.sd.entity.Student;
import com.sd.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private StuService stuService;

    @RequestMapping("/list")
    public String list(Model model){
        //
        List<Student> list = stuService.list();
        model.addAttribute("stuList",list);
        return "stuList";
    }

    @RequestMapping("/insert")
    public String insert(Student stu){
        stuService.save(stu);
        return "redirect:/stu/list";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        stuService.removeById(id);
        return "redirect:/stu/list";
    }
}
