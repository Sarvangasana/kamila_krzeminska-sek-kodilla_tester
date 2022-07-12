package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GeneralNotificationServiceTestSuite {

    @Test
    public void everyClientShouldReceiveOneGeneralNotification() {
    GeneralNotificationOnStatuteChangesService generalNotificationService = new GeneralNotificationOnStatuteChangesService();
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    CracowAlertService cracowAlertService = new CracowAlertService();
    cracowAlertService.addSubscriber(client1);
    cracowAlertService.addSubscriber(client2);
    cracowAlertService.addSubscriber(client3);
    WarsawAlertService warsawAlertService = new WarsawAlertService();
    Client client4 = Mockito.mock(Client.class);
    Client client5 = Mockito.mock(Client.class);
    warsawAlertService.addSubscriber(client1);
    warsawAlertService.addSubscriber(client4);
    warsawAlertService.addSubscriber(client5);
    KatowiceAlertService katowiceAlertService = new KatowiceAlertService();
    Client client6 = Mockito.mock(Client.class);
    Client client7 = Mockito.mock(Client.class);
    katowiceAlertService.addSubscriber(client1);
    katowiceAlertService.addSubscriber(client4);
    katowiceAlertService.addSubscriber(client6);
    katowiceAlertService.addSubscriber(client7);

    GeneralNotification generalNotification = Mockito.mock(GeneralNotification.class);

    generalNotificationService.addSubscribersSet(cracowAlertService.getClients());
    generalNotificationService.addSubscribersSet(warsawAlertService.getClients());
    generalNotificationService.addSubscribersSet(katowiceAlertService.getClients());

    generalNotificationService.sendGeneralNotification(generalNotification);
    Mockito.verify(client1, Mockito.times(1)).receiveGeneralNotification(generalNotification);
    Mockito.verify(client2, Mockito.times(1)).receiveGeneralNotification(generalNotification);
    Mockito.verify(client3, Mockito.times(1)).receiveGeneralNotification(generalNotification);
    Mockito.verify(client4, Mockito.times(1)).receiveGeneralNotification(generalNotification);
    Mockito.verify(client5, Mockito.times(1)).receiveGeneralNotification(generalNotification);
    Mockito.verify(client6, Mockito.times(1)).receiveGeneralNotification(generalNotification);
    Mockito.verify(client7, Mockito.times(1)).receiveGeneralNotification(generalNotification);
    }
}