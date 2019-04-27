package lk.empire.ams.service;

import lk.empire.ams.dao.Notification;
import lk.empire.ams.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getAllNotification(){

        List<Notification> notifications = notificationRepository.findAll();
        return notifications;

    }

}
