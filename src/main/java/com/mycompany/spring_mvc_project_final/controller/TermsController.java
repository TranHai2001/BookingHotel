package com.mycompany.spring_mvc_project_final.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class TermsController {
    @RequestMapping(value = {"/terms_and_conditions"}, method = RequestMethod.GET)
    public String termHotel(Model model) {
        return "terms_and_conditions";
    }
}
