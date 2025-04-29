package com.mar.simple.service;

import com.mar.simple.entitie.Client;
import com.mar.simple.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClient(UUID id) {
        return clientRepository.findById(id).get();
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(UUID id, Client client) {
        client.setId(id);
        return clientRepository.save(client);
    }

    public void deleteClient(UUID id) {
        clientRepository.deleteById(id);
    }
}
