package com.eventmanagement.service;

import com.eventmanagement.entity.Event;
import com.eventmanagement.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> listAll(){
        return eventRepository.findAll();
    }

    public Event findById(Long id){
        return eventRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new RuntimeException("Evento não encontrado!"));
    }

    public Event saveEvent(Event event){
        return eventRepository.save(event);
    }

    public void deleteEvent(Long id){
        eventRepository.deleteById(Math.toIntExact(id));
    }
}