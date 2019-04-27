package lk.empire.ams.controller;

import lk.empire.ams.dao.Inquiry;
import lk.empire.ams.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class InquiryController {

    @Autowired
    private InquiryService inquiryService;

    @GetMapping("/inquiry")
    public List<Inquiry> getMappingInquiry(){
        return inquiryService.getAllInquiry();
    }
}
