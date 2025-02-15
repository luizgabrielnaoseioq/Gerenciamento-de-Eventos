package com.eventmanagement.service;

import com.eventmanagement.entity.Participant;
import com.eventmanagement.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public Participant findById(long id) {
        return participantRepository.findById(id).orElseThrow(() -> new RuntimeException("Não foi possivel encontrar este participante!"));
    }

    public List<Participant> findAll() {
        return participantRepository.findAll();
    }

    public Participant saveParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    public void deleteParticipant(long id) {
        participantRepository.findById(id);
    }
}
