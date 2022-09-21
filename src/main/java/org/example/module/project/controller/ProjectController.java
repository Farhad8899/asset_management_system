package org.example.module.user.controller;

import org.example.common.ApiResponse;
import org.example.module.user.model.Project;
import org.example.module.user.service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {
    @Autowired
    private ProjectServiceImpl projectService;

    @GetMapping
    public ResponseEntity<ApiResponse> getProject(){
        ApiResponse<List<Project>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(projectService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{projectId}")
    public ResponseEntity<ApiResponse> getProjectById(@PathVariable("projectId") Integer projectId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(projectId);
        projectService.findById(projectId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addProject(@RequestBody Project project) {
        ApiResponse<Project> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        projectService.insert(project);
        apiResponse.setBody(project);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{accountId}")
    public ResponseEntity<ApiResponse> updateProject(@RequestBody Project project) {
        ApiResponse<Project> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        projectService.update(project);
        apiResponse.setBody(project);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
