package com.eventmanagement.service;

import com.eventmanagement.entity.Speaker;
import com.eventmanagement.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerService {

    @Autowired
    private SpeakerRepository speakerRepository;

    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }

    public Speaker findById(Long id){
        return speakerRepository.findById(id).orElseThrow(() -> new RuntimeException("Não foi possivel encontrar este Palestrante!"));
    }

    public Speaker saveSpeaker(Speaker speaker){
        return speakerRepository.save(speaker);
    }

    public void deleteSpeaker(Long id){
        speakerRepository.deleteById(id);
    }
}
