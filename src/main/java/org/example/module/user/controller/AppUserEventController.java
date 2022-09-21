package org.example.module.user.controller;

import org.example.common.ApiResponse;
import org.example.module.user.model.UserEvent;
import org.example.module.user.service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/event")
public class EventController {
    @Autowired
    private EventServiceImpl locationService;

    @GetMapping
    public ResponseEntity<ApiResponse> getEvent(){
        ApiResponse<List<UserEvent>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(locationService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{eventId}")
    public ResponseEntity<ApiResponse> getEventById(@PathVariable("eventId") Integer eventId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(eventId);
        locationService.findById(eventId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addEvent(@RequestBody UserEvent userEvent) {
        ApiResponse<UserEvent> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        locationService.insert(userEvent);
        apiResponse.setBody(userEvent);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{eventId}")
    public ResponseEntity<ApiResponse> updateEvent(@RequestBody UserEvent userEvent) {
        ApiResponse<UserEvent> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        locationService.update(userEvent);
        apiResponse.setBody(userEvent);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
