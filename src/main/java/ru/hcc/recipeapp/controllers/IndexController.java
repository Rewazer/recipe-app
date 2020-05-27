package ru.hcc.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Created by SS on 28/05/2020.
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {
        return "index";
    }
}
