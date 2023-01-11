package com.example.phone_repair_center_service.service.impl;

import com.example.phone_repair_center_service.model.Event;
import com.example.phone_repair_center_service.repository.EventRepository;
import com.example.phone_repair_center_service.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {
    ///@Autowired
    EventRepository eventRepository;
    @Override
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event getEventById(long id) {
        return eventRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Event updateEvent(Event event, long id) {
        Event existingEvent = eventRepository.findById(id).orElseThrow(null);

        existingEvent.setTitle(event.getTitle());
        existingEvent.setText(event.getText());

        eventRepository.save(existingEvent);

        return existingEvent;
    }

    @Override
    public void deleteEvent(long id) {
        eventRepository.findById(id).orElseThrow(null);

        eventRepository.deleteById(id);
    }

    public void deleteAllEvents() {
        eventRepository.deleteAll();
    }
}
