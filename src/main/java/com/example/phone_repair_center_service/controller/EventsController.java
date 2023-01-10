package com.example.phone_repair_center_service.controller;

import com.example.phone_repair_center_service.model.Events;
import com.example.phone_repair_center_service.service.EventsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/events")
@AllArgsConstructor
public class EventsController {
    private EventsService eventsService;

    @PostMapping("add")
    public ResponseEntity<Events> saveEmployee(@Valid @RequestBody Events events){
        return new ResponseEntity<Events>(eventsService.saveEmployee(events), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Events> getAllEvents(){
        return eventsService.getAllEvents();
    }

    @GetMapping("{id}")
    public ResponseEntity<Events> getEventById(@PathVariable("id") long eventId){
        return new ResponseEntity<Events>(eventsService.getEventById(eventId), HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Events> updateEvent(@Valid @PathVariable("id") long id, @RequestBody Events event){
        return new ResponseEntity<Events>(eventsService.updateEvent(event, id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteEvent(@PathVariable("id") long id){
        eventsService.deleteEvent(id);

        return new ResponseEntity<String>("Event deleted successfully!.", HttpStatus.OK);
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteEmployee(){
        eventsService.deleteAllEvents();

        return new ResponseEntity<String>("All Events deleted successfully!.", HttpStatus.OK);
    }
}
