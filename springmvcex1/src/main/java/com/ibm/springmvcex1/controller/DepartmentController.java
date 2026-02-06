package com.ibm.springmvcex1.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.springmvcex1.model.Department;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("department", new Department());
        return "department-form";
    }

    @PostMapping("/save")
    public String saveDepartment(
            @Valid @ModelAttribute("department") Department department,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            return "department-form";
        }

        model.addAttribute("department", department);
        return "list-department";
    }
}
