package org.example.module.project.service;

import org.example.module.project.model.ProjectAssignment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProjectAssignmentServiceImpl {
    List<ProjectAssignment> findAll();

    Optional<ProjectAssignment> findById(Integer projectAssignId);
    ProjectAssignment insert(ProjectAssignment projectAssignment);
    boolean update(ProjectAssignment projectAssignment);


}
