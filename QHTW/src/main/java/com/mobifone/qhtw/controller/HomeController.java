package com.mobifone.qhtw.controller;

import com.mobifone.qhtw.model.*;
import com.mobifone.qhtw.service.ICshtService;
import com.mobifone.qhtw.service.IDaiVtService;
import com.mobifone.qhtw.service.ILoaiRouterService;
import com.mobifone.qhtw.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashSet;
import java.util.List;

@Controller

public class HomeController {
    @Autowired
    private ICshtService cshtService;
    @Autowired

    private IDaiVtService daiVtService;
    @Autowired
    private IVendorService vendorService;
    @Autowired
    private ILoaiRouterService loaiRouterService;
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
        List<Site> listSite = cshtService.findAll();
        model.addAttribute("listCsht", listSite);
        return "csht-list";
    }
    @GetMapping("/daivt")
    public void getDai(){
        List<TelecomCenter> telecomCenters = daiVtService.findAll();
        System.out.println();

    }
    @GetMapping("/save")
    public void save(){
       Vendor v1= new Vendor();
       v1.setId(1);
       v1.setName("Nokia");
       v1.setRouterTypes(new HashSet<RouterType>());
       RouterType l1= new RouterType();
       l1.setId(1);
       l1.setName("SARX");
       l1.setVendor(v1);
        loaiRouterService.save(l1);

    }
}
