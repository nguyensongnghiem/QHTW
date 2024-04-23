package com.mobifone.qhtw.controller;

import com.mobifone.qhtw.model.Csht;
import com.mobifone.qhtw.service.ICshtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class HomeController {
    @Autowired
    private ICshtService cshtService;
    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/buttons")
    public String buttons() {
        return "buttons";
    }
    @GetMapping("/cards")
    public String cards() {
        return "cards";
    }
    @GetMapping("/csht")
    public String csht(Model model) {
        List<Csht> listCsht = cshtService.findAll();
        model.addAttribute("listCsht",listCsht);
        return "csht-list";
    }
}
