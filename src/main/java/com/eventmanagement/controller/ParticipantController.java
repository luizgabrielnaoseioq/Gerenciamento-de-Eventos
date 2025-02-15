package com.eventmanagement.controller;

import com.eventmanagement.entity.Participant;
import com.eventmanagement.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping
    public List<Participant> findAll() {
        return participantService.findAll();
    }

    @PostMapping
    public Participant save(Participant participant) {
        return participantService.saveParticipant(participant);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        participantService.deleteParticipant(id);
    }

    @GetMapping("/{id}")
    public Participant findById(Long id) {
        return participantService.findById(id);
    }
}