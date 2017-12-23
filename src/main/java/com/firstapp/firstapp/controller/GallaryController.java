package com.firstapp.firstapp.controller;

import com.firstapp.firstapp.data.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ProjectRepository projectRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(ModelMap modelMap)
    {
        //Model Instance.
        Project projects = projectRepository.findByName("P1");

        //Making the instance accessible to the view.
        modelMap.addAttribute("projects", projects);

        //Return to the page.
        return "home";
    }

}
