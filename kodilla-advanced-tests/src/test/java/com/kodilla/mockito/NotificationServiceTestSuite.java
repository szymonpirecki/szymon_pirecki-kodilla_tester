package com.kodilla.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {

    Notification notification = Mockito.mock(Notification.class);
    Client client = Mockito.mock(Client.class);
    Client firstClient = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);

    NotificationService notificationService = new NotificationService();



    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        notificationService.addSubscriber(client);
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        notificationService.addSubscriber(firstClient);
        notificationService.addSubscriber(secondClient);
        notificationService.addSubscriber(thirdClient);

        notificationService.sendNotification(notification);

        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);


    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        notificationService.addSubscriber(client);
        notificationService.removeSubscriber(client);
        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.never()).receive(notification);

    }
}