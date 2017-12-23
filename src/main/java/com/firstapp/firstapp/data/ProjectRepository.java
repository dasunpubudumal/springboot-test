package com.firstapp.firstapp.data;

import com.firstapp.firstapp.model.Project;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class ProjectRepository {
    //Arrays.asList converts an array into a list.
    private static final List<Project> projectList = Arrays.asList(
            new Project("P1", LocalDate.of(2016,12,14), "Nimal"),
            new Project("P2",LocalDate.of(2015,5,3), "Kamal")
    );

    public Project findByName(String name)
    {
        for(Project projects: projectList)
        {
            if(projects.getProjectName().equals(name))
            {
                return projects;
            }
        }
        return null;
    }
}
