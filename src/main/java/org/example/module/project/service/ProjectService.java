package org.example.module.project.service;

import org.example.module.project.model.Project;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProjectServiceImpl {
    List<Project> findAll();

    Optional<Project> findById(Integer projectId);
    Project insert(Project project);
    boolean update(Project project);


}
