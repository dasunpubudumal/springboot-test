package com.firstapp.firstapp.controller;

import org.springframework.stereotype.Controller;
import com.firstapp.firstapp.model.Project;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GallaryController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(ModelMap modelMap)
    {
        //Model Instance.
        Project projects = new Project("Project One" , LocalDate.of(2017,05,12), "Dasun");

        //Making the instance accessible to the view.
        modelMap.addAttribute("projects", projects);

        //Return to the page.
        return "home";
    }

}
