package com.mycompany.spring_mvc_project_final.controller;

import com.mycompany.spring_mvc_project_final.entities.SendMailEntity;
import com.mycompany.spring_mvc_project_final.repository.SendMailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
    @Autowired
    private SendMailRepository sendMailRepository;
    @RequestMapping(value = {"/contact"}, method = RequestMethod.GET)
    public String contactHotel(Model model) {
        return "contact";
    }
    @RequestMapping(value = {"/contact"}, method = RequestMethod.POST)
    public String sendMail(Model model,  SendMailEntity sendMailEntity ){
        sendMailRepository.save(sendMailEntity);
        model.addAttribute("mailSent", true);
        return "contact";
    }

}
