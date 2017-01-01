package com.service;

import com.domain.Ticket;

import java.util.List;

/**
 * Created by Michał on 2016-11-12.
 */
public interface TicketService {
    Ticket save(Ticket ticket);

    List<Ticket> findTicketsByWasSentFalse();
}