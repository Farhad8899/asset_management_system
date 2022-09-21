package org.example.module.project.service;

import org.example.module.project.model.ProjectAssignment;
import org.example.module.project.repo.ProjectAssignmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectAssignmentServiceImpl implements ProjectAssignmentService {

    @Autowired
    ProjectAssignmentRepo projectAssignmentRepo;
    @Override
    public List<ProjectAssignment> findAll(){
        ArrayList<ProjectAssignment> projectAssignments = (ArrayList<ProjectAssignment>) projectAssignmentRepo.findAll();
        return projectAssignments;
    }



    public Optional<ProjectAssignment> findById(Integer projectAssignId){
        return projectAssignmentRepo.findById(projectAssignId);
    }

    public ProjectAssignment insert(ProjectAssignment projectAssignment){
        return projectAssignmentRepo.save(projectAssignment);

    }
    public boolean update(ProjectAssignment projectAssignment){
        try {
            projectAssignmentRepo.save(projectAssignment);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
