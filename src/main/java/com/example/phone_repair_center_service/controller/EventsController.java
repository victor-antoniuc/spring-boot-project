package com.example.phone_repair_center_service.controller;

import com.example.phone_repair_center_service.service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventsController {
    @Autowired
    EventsService eventsService;
}
