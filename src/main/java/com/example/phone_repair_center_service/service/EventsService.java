package com.example.phone_repair_center_service.service;

import com.example.phone_repair_center_service.model.Events;

import java.util.List;
public interface EventsService {
    Events saveEmployee(Events event);
    List<Events> getAllEvents();
    Events getEventById(long id);
    Events updateEvent(Events event, long id);
    void deleteEvent(long id);
    void deleteAllEvents();
}
