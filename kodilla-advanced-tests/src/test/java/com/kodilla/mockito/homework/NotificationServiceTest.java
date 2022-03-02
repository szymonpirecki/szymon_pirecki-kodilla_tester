package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NotificationServiceTest {

    NotificationService notificationService = new NotificationService();

    User firstUser = Mockito.mock(User.class);
    User secondUser = Mockito.mock(User.class);
    User thirdUser = Mockito.mock(User.class);
    User fourthUser = Mockito.mock(User.class);
    Monit monit = Mockito.mock(Monit.class);

    @Test
    public void notSubscribedUserShouldNotReceiveMonit() {
        notificationService.notifyUserFrom(monit, "north");
        notificationService.sendMonitToAllSubscribers(monit);
        Mockito.verify(firstUser, Mockito.never()).receive(monit);
        Mockito.verify(secondUser, Mockito.never()).receive(monit);
        Mockito.verify(thirdUser, Mockito.never()).receive(monit);
        Mockito.verify(fourthUser, Mockito.never()).receive(monit);

    }

    @Test
    public void subscribedUserShouldReceiveMonit() {
        notificationService.addUser(firstUser, "south");
        notificationService.notifyUserFrom(monit, "south");
        Mockito.verify(firstUser, Mockito.times(1)).receive(monit);
    }

    @Test
    public void monitShouldBeSentToAllSubscribers() {
        notificationService.addUser(firstUser, "west");
        notificationService.addUser(secondUser, "south");
        notificationService.addUser(thirdUser, "east");
        notificationService.addUser(fourthUser, "north");

        notificationService.sendMonitToAllSubscribers(monit);

        Mockito.verify(firstUser, Mockito.times(1)).receive(monit);
        Mockito.verify(secondUser, Mockito.times(1)).receive(monit);
        Mockito.verify(thirdUser, Mockito.times(1)).receive(monit);
        Mockito.verify(fourthUser, Mockito.times(1)).receive(monit);
    }

    @Test
    public void monitShouldBeSentToNorthSubscribers() {
        notificationService.addUser(firstUser, "north");
        notificationService.addUser(secondUser, "south");
        notificationService.addUser(thirdUser, "east");
        notificationService.addUser(fourthUser, "north");

        notificationService.notifyUserFrom(monit, "north");

        Mockito.verify(firstUser, Mockito.times(1)).receive(monit);
        Mockito.verify(secondUser, Mockito.never()).receive(monit);
        Mockito.verify(thirdUser, Mockito.never()).receive(monit);
        Mockito.verify(fourthUser, Mockito.times(1)).receive(monit);

    }

    @Test
    public void shouldSendOnlyOneMonitToMultiTimeSubscriber() {
        notificationService.addUser(firstUser, "north");
        notificationService.addUser(firstUser, "north");

        notificationService.notifyUserFrom(monit, "north");

        Mockito.verify(firstUser, Mockito.times(1)).receive(monit);
    }

    @Test
    public void unsubscribedUserShouldNotReceiveMonit() {
        notificationService.addUser(firstUser, "north");
        notificationService.removeUserFrom(firstUser, "north");

        notificationService.notifyUserFrom(monit, "north");

        Mockito.verify(firstUser, Mockito.never()).receive(monit);
    }

    @Test
    public void archivedUserShouldNotReceiveMonitSentToAllSubscribers() {
        notificationService.addUser(firstUser, "north");
        notificationService.archiveUser(firstUser);

        notificationService.sendMonitToAllSubscribers(monit);

        Mockito.verify(firstUser, Mockito.never()).receive(monit);
    }


}