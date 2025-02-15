package com.eventmanagement.service;

import com.eventmanagement.entity.Ticket;
import com.eventmanagement.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> findAll(){
        return ticketRepository.findAll();
    }

    public Ticket findById(Long id){
        return ticketRepository.findById(id).orElseThrow(() -> new RuntimeException("Ticket não encontrado!"));
    }

    public Ticket saveTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }

    public void deleteTicket(Long id){
        ticketRepository.deleteById(id);
    }
}