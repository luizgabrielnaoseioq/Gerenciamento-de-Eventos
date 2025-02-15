package com.eventmanagement.controller;

import com.eventmanagement.entity.Organizer;
import com.eventmanagement.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizer")
public class OrganizerController {

    @Autowired
    private OrganizerService organizerService;

    @GetMapping
    public List<Organizer> findAll(){
        return organizerService.listAll();
    }

    @GetMapping("/{id}")
    public Organizer findById(@PathVariable Long id) {
        return organizerService.findById(id);
    }

    @PostMapping
    public Organizer createOrganizer(@RequestBody Organizer organizer) {
        return organizerService.saveOrganizer(organizer);
    }

    @DeleteMapping("/{id}")
    public void deleteOrganizer(@PathVariable Long id) {
        organizerService.deleteOrganizer(id);
    }
}