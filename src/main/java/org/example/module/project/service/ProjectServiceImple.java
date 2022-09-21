package org.example.module.project.service;

import org.example.module.project.model.Project;
import org.example.module.project.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepo projectRepo;
    @Override
    public List<Project> findAll(){
        ArrayList<Project> projects = (ArrayList<Project>) projectRepo.findAll();
        return projects;
    }



    public Optional<Project> findById(Integer projectId){
        return projectRepo.findById(projectId);
    }

    public Project insert(Project project){
        return projectRepo.save(project);

    }
    public boolean update(Project project){
        try {
            projectRepo.save(project);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
