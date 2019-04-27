package lk.empire.ams.controller;

import lk.empire.ams.dao.Notification;
import lk.empire.ams.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/notification")
    public List<Notification> getMappingNotification(){
        return notificationService.getAllNotification();
    }
}
