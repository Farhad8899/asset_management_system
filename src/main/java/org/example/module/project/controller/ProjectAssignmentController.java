package org.example.module.user.controller;

import org.example.common.ApiResponse;
import org.example.module.user.model.ProjectAssignment;
import org.example.module.user.service.ProjectAssignmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/projectAssignments")
public class ProjectAssignmentController {
    @Autowired
    private ProjectAssignmentServiceImpl projectAssignmentService;

    @GetMapping
    public ResponseEntity<ApiResponse> getProjectAssignment(){
        ApiResponse<List<ProjectAssignment>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(projectAssignmentService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{projectAssignId}")
    public ResponseEntity<ApiResponse> getProjectAssignmentById(@PathVariable("projectAssignId") Integer projectAssignId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(projectAssignId);
        projectAssignmentService.findById(projectAssignId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addProjectAssignment(@RequestBody ProjectAssignment projectAssignment) {
        ApiResponse<ProjectAssignment> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        projectAssignmentService.insert(projectAssignment);
        apiResponse.setBody(projectAssignment);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{projectAssignId}")
    public ResponseEntity<ApiResponse> updateProjectAssignment(@RequestBody ProjectAssignment projectAssignId) {
        ApiResponse<ProjectAssignment> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        projectAssignmentService.update(projectAssignId);
        apiResponse.setBody(projectAssignId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
