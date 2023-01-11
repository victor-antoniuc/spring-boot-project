package com.example.phone_repair_center_service.controller;

import com.example.phone_repair_center_service.model.Event;
import com.example.phone_repair_center_service.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/events")
@AllArgsConstructor
public class EventController {
    private EventService eventService;

    @PostMapping("add")
    public ResponseEntity<Event> saveEmployee(@Valid @RequestBody Event event){
        return new ResponseEntity<Event>(eventService.saveEvent(event), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    @GetMapping("{id}")
    public ResponseEntity<Event> getEventById(@PathVariable("id") long eventId){
        return new ResponseEntity<Event>(eventService.getEventById(eventId), HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Event> updateEvent(@Valid @PathVariable("id") long id, @RequestBody Event event){
        return new ResponseEntity<Event>(eventService.updateEvent(event, id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteEvent(@PathVariable("id") long id){
        eventService.deleteEvent(id);

        return new ResponseEntity<String>("Event deleted successfully!.", HttpStatus.OK);
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteEmployee(){
        eventService.deleteAllEvents();

        return new ResponseEntity<String>("All Events deleted successfully!.", HttpStatus.OK);
    }
}
