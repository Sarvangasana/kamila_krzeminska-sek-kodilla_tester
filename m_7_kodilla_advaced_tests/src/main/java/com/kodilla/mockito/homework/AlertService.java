package com.kodilla.mockito.homework;

public interface AlertService {
    void addSubscriber(Client client);

    void sendAlert(Alert alert);
}
