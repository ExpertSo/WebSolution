package com.expertso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Cheick on 09/02/16.
 */
@Controller
public class ServicesController {

    @RequestMapping("/")
    public String welcome() {

        return "redirect:/acceuil";
    }

    @RequestMapping("/acceuil")
    public String acceuil() {

        return "acceuil/index";
    }

    @RequestMapping("/expertso")
    public String expertso() {

        return "expertso/index";
    }

    @RequestMapping("/formation")
    public String formation() {

        return "formation/index";
    }

    @RequestMapping("/langue")
    public String langue() {

        return "langue/index";
    }

    @RequestMapping("/ntica")
    public String ntica() {

        return "acceuil/index";
    }

    @RequestMapping("/partenaire")
    public String partenaire() {

        return "partenaire/index";
    }

    @RequestMapping("/produit")
    public String produit() {

        return "produit/index";
    }

    @RequestMapping("/solution")
    public String solution() {

        return "solution/index";
    }
}
