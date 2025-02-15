package com.eventmanagement.service;

import com.eventmanagement.entity.Organizer;
import com.eventmanagement.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrganizerService {

    @Autowired
    private OrganizerRepository organizerRepository;

    public List<Organizer> listAll(){
        return organizerRepository.findAll();
    }

    public Organizer findById(Long id){
        return organizerRepository.findById(Math.toIntExact(id)).orElseThrow(() -> new RuntimeException("Organizador não encontrado!"));
    }

    public Organizer saveOrganizer(Organizer organizer){
        return organizerRepository.save(organizer);
    }

    public void deleteOrganizer(Long id){
        organizerRepository.deleteById(Math.toIntExact(id));
    }
}