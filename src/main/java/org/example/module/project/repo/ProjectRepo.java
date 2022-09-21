package org.example.module.user.repo;

import org.example.module.user.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,Integer> {


}
