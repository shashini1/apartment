package lk.empire.ams.service;

import lk.empire.ams.dao.Event;
import lk.empire.ams.dto.EventDTO;
import lk.empire.ams.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

/**
 * Service class for managing event.
 */

public class EventService {

    @Autowired
    private EventRepository eventRepository;

    /**
     * Get all the events. return eventDto list
     */
    public List<Event> getAllEvent(){
        List<Event> eventList = eventRepository.findAll();

        // create a new object. And assign iterative value in to this obect
//        List<EventDTO> eventDTOList = new ArrayList<EventDTO>();
//
//        for (Event event : eventDAOList){
//            EventDTO eventDTO = EventDTO.valueOf(event);
//            eventDTOList.add(eventDTO);
//        }
        return eventList;
    }
}
