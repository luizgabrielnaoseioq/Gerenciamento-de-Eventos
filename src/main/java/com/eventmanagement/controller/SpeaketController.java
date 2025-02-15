package com.eventmanagement.controller;

import com.eventmanagement.entity.Speaker;
import com.eventmanagement.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/speaker")
public class SpeaketController {

    @Autowired
    private SpeakerService speakerService;

    @GetMapping
    public List<Speaker> findAll(){
        return speakerService.findAll();
    }

    @GetMapping("/{id}")
    public Speaker findById(Long id){
        return speakerService.findById(id);
    }

    @PostMapping
    public Speaker createSpeaker(@RequestBody Speaker speaker) {
        return speakerService.saveSpeaker(speaker);
    }

    @DeleteMapping("/{id}")
    public void deleteSpeaker(@PathVariable Long id) {
        speakerService.deleteSpeaker(id);
    }
}
