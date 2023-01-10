package com.example.phone_repair_center_service.service.impl;

import com.example.phone_repair_center_service.model.Events;
import com.example.phone_repair_center_service.repository.EventsRepository;
import com.example.phone_repair_center_service.service.EventsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventsServiceImpl implements EventsService {
    ///@Autowired
    EventsRepository eventsRepository;
    @Override
    public Events saveEmployee(Events event) {
        return eventsRepository.save(event);
    }

    @Override
    public List<Events> getAllEvents() {
        return eventsRepository.findAll();
    }

    @Override
    public Events getEventById(long id) {
        return eventsRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Events updateEvent(Events event, long id) {
        Events existingEmployee = eventsRepository.findById(id).orElseThrow(null);

        existingEmployee.setTitle(event.getTitle());
        existingEmployee.setText(event.getText());

        eventsRepository.save(existingEmployee);

        return existingEmployee;
    }

    @Override
    public void deleteEvent(long id) {
        eventsRepository.findById(id).orElseThrow(null);

        eventsRepository.deleteById(id);
    }

    public void deleteAllEvents() {
        eventsRepository.deleteAll();
    }
}
