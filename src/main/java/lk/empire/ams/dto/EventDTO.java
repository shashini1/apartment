package lk.empire.ams.dto;

import lk.empire.ams.dao.Event;
import org.springframework.beans.BeanUtils;

import java.sql.Time;
import java.time.LocalDate;

public class EventDTO {

    private int id;
    private String name;
    private LocalDate date;
    private Time startTime;
    private Time endTime;
    private String description;

    public static EventDTO valueOf(Event event){
        EventDTO eventDTO = new EventDTO();
        BeanUtils.copyProperties(event, eventDTO);
        return eventDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
