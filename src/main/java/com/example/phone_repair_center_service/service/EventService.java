package com.example.phone_repair_center_service.service;

import com.example.phone_repair_center_service.model.Event;

import java.util.List;
public interface EventService {
    Event saveEvent(Event event);
    List<Event> getAllEvents();
    Event getEventById(long id);
    Event updateEvent(Event event, long id);
    void deleteEvent(long id);
    void deleteAllEvents();
}
