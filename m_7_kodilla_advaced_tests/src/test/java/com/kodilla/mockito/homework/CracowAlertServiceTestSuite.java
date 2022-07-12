package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CracowAlertServiceTestSuite {

    @Test
    public void clientNotSubscribedForCracowAlertShouldNotReceiveCracowAlert() {
        CracowAlertService cracowAlertService = new CracowAlertService();
        Client client = Mockito.mock(Client.class);
        Alert alert = Mockito.mock(Alert.class);

        cracowAlertService.sendAlert(alert);
        Mockito.verify(client, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void clientSubscribedForCracowAlertShouldReceiveCracowAlert () {
        CracowAlertService cracowAlertService = new CracowAlertService();
        Client client = Mockito.mock(Client.class);
        cracowAlertService.addSubscriber(client);
        Alert alert = Mockito.mock(Alert.class);

        cracowAlertService.sendAlert(alert);
        Mockito.verify(client, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void shouldSendCracowAlertToAllClientsSubscribedForCracowAlert() {
        CracowAlertService cracowAlertService = new CracowAlertService();
        Client client = Mockito.mock(Client.class);
        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);
        cracowAlertService.addSubscriber(client);
        cracowAlertService.addSubscriber(secondClient);
        cracowAlertService.addSubscriber(thirdClient);
        Alert alert = Mockito.mock(Alert.class);

        cracowAlertService.sendAlert(alert);
        Mockito.verify(client, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(secondClient, Mockito.times(1)).receiveAlert(alert);
        Mockito.verify(thirdClient, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void shouldSendOnlyOneCracowAlertToMultiTimeSubscriber() {
        CracowAlertService cracowAlertService = new CracowAlertService();
        Client client = Mockito.mock(Client.class);
        cracowAlertService.addSubscriber(client);
        cracowAlertService.addSubscriber(client);
        cracowAlertService.addSubscriber(client);
        Alert alert = Mockito.mock(Alert.class);

        cracowAlertService.sendAlert(alert);
        Mockito.verify(client, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void clientUnsubscribedForCracowAlertShouldNotReceiveCracowAlert() {
        CracowAlertService cracowAlertService = new CracowAlertService();
        Client client = Mockito.mock(Client.class);
        cracowAlertService.addSubscriber(client);
        Alert alert = Mockito.mock(Alert.class);
        cracowAlertService.removeSubscriber(client);

        cracowAlertService.sendAlert(alert);
        Mockito.verify(client, Mockito.never()).receiveAlert(alert);
    }


}