package lk.empire.ams.controller;

import lk.empire.ams.dao.Event;
import lk.empire.ams.dto.EventDTO;
import lk.empire.ams.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class EventController {

    @Autowired
    private EventService eventService;

    @CrossOrigin
    @GetMapping("/event")
    public List<Event> getMappingEvent(){
        List<Event> events = eventService.getAllEvent();
        return events;
    }
}
