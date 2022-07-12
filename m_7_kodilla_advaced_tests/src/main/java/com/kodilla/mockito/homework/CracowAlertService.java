package com.kodilla.mockito.homework;

import java.util.HashSet;
import java.util.Set;

public class CracowAlertService implements AlertService {
    private Set<Client> clients = new HashSet<>();

    public Set<Client> getClients() {
        return clients;
    }

    @Override
    public void addSubscriber(Client client) {
        this.clients.add(client);
    }

    @Override
    public void sendAlert(Alert alert) {
        this.clients.forEach(client -> client.receiveAlert(alert));
    }

    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }
}
