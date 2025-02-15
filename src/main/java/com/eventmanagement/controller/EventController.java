package com.eventmanagement.controller;

import com.eventmanagement.entity.Event;
import com.eventmanagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/all")
    public List<Event> findAll() {
        return eventService.listAll();
    }

    @GetMapping("/search/{id}")
    public Event findById(Long id) {
        return eventService.findById(id);
    }

    @PostMapping("/create")
    public Event createEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
    }
}