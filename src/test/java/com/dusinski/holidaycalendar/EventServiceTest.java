package com.dusinski.holidaycalendar;

import com.dusinski.holidaycalendar.repository.CalendarEventRepository;
import com.dusinski.holidaycalendar.repository.EventConfirmationTokenRepository;
import com.dusinski.holidaycalendar.services.EmailSenderService;
import com.dusinski.holidaycalendar.services.EventService;
import com.dusinski.holidaycalendar.services.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class EventServiceTest {

    @InjectMocks
    private EventService eventService;

    @Mock
    private EmailSenderService emailSenderService;

    @Value("${server.port}")
    private int serverPort;

    @Test
    public void shouldSendEmail() throws UnknownHostException {
        //given
        String testConfirmationToken = "cnfToken";
        String testEmailAdress = "dusiud@gmail.com";
        ArgumentCaptor<SimpleMailMessage>emailMessageCaptor = ArgumentCaptor.forClass(SimpleMailMessage.class);

        //when

        eventService.sendEmail(testConfirmationToken, testEmailAdress);
        Mockito.verify(emailSenderService, Mockito.times(1)).sendEmail(emailMessageCaptor.capture());

        //then
        SimpleMailMessage sentMessage = emailMessageCaptor.getValue();

        assertEquals(sentMessage.getTo()[0],testEmailAdress);
        assertEquals(sentMessage.getFrom(),"confirmationholiday@gmail.com");
        assertNotNull(sentMessage.getText());
    }






}
