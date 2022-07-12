package com.kodilla.mockito.homework;

import java.util.HashSet;
import java.util.Set;

public class GeneralNotificationOnStatuteChangesService implements GeneralNotificationOnStatuteChanges {

    Set<Client> clients = new HashSet<>();

    public void addSubscribersSet(Set<Client> clientsSet) {
        this.clients.addAll(clientsSet);
    }

    @Override
    public void sendGeneralNotification(GeneralNotification generalNotification) {
        this.clients.forEach(client -> client.receiveGeneralNotification(generalNotification));
    }
}
