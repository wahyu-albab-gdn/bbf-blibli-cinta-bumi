package com.gdn.bbf.blibli.cinta.bumi.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    String index(Model model){
        return "index";
    }
}
