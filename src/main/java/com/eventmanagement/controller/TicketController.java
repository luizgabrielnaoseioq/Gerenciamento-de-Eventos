package com.eventmanagement.controller;

import com.eventmanagement.entity.Ticket;
import com.eventmanagement.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public List<Ticket> findAll() {
        return ticketService.findAll();
    }

    @GetMapping("/{id}")
    public Ticket findById(Long id){
        return ticketService.findById(id);
    }

    @PostMapping
    public Ticket saveTicket(@RequestBody Ticket ticket){
        return ticketService.saveTicket(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id){
        ticketService.deleteTicket(id);
    }
}
