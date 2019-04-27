package lk.empire.ams.service;

import lk.empire.ams.dao.Payment;
import lk.empire.ams.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayment(){
        List<Payment> paymentList = paymentRepository.findAll();
        return paymentList;
    }
}
