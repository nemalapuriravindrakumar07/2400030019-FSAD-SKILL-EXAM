package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Transport;
import com.klef.fsad.exam.repository.TransportRepository;

@Service
public class TransportService 
{
    @Autowired
    private TransportRepository repo;

    public Transport addTransport(Transport t)
    {
        return repo.save(t);
    }

    public void deleteTransport(int id)
    {
        repo.deleteById(id);
    }
}