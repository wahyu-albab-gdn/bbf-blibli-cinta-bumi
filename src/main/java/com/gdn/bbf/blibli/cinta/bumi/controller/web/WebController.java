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

    @GetMapping("/kardus-bekas")
    String kardus(Model model){
        return "kardus-bekas";
    }

    @GetMapping("/ramah-lingkungan")
    String isiUlang(Model model){
        return "ramah-lingkungan";
    }

    @GetMapping("/pengiriman-hemat-kemasan")
    String hematKemasan(Model model){
        return "pengiriman-hemat-kemasan";
    }

    @GetMapping("/seller-eco-friendly")
    String belanja(Model model){
        return "seller-eco-friendly";
    }
}
