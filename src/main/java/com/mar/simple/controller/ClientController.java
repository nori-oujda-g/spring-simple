package com.mar.simple.controller;

import com.mar.simple.entitie.Client;
import com.mar.simple.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin("*")
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @GetMapping("/clients/{id}")
    public Client getClient(@PathVariable(name = "id") UUID id) {
        return clientService.getClient(id);
    }

    @PostMapping("/clients")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PutMapping("/clients/{id}")
    public Client updateClient(@PathVariable(name = "id") UUID id, @RequestBody Client client) {
        return clientService.updateClient(id, client);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable(name = "id") UUID id) {
        clientService.deleteClient(id);
    }
}
