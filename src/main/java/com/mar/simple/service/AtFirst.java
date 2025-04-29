package com.mar.simple.service;

import com.mar.simple.entitie.Client;
import com.mar.simple.entitie.Open;
import com.mar.simple.entitie.Status;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@Service
public class AtFirst {

    @Bean
    CommandLineRunner go(ClientService clientService) {
        return a -> {
            try {
                //  File file = ResourceUtils.getFile("classpath:clients.csv");
                File file = ResourceUtils.getFile("src/main/resources/clients1.csv");
                Scanner sc = new Scanner(file);
                SimpleDateFormat format = new SimpleDateFormat(Open.pattern);
                if(clientService.getClients().isEmpty())
                    while (sc.hasNext()) {
                        String line = sc.nextLine();
                        String[] lineClient = line.split(",");
                        Status status = Status.valueOf(lineClient[2]);
                        Date date = format.parse(lineClient[3]);
                        Client client = new Client(null, lineClient[0], lineClient[1], status, date);
                        clientService.addClient(client);
                        System.out.println(client);
                    }
            } catch (Exception e) {
//                throw new RuntimeException(e);
            }
            finally {
                System.out.println("done !");
            }
        };
    }

}
