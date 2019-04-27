package lk.empire.ams.service;

import lk.empire.ams.dao.Inquiry;
import lk.empire.ams.repository.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class InquiryService {

    @Autowired
    private InquiryRepository inquiryRepository;

    public List<Inquiry> getAllInquiry(){
        List<Inquiry> inquiryList = inquiryRepository.findAll();
        return inquiryList;
    }
}
