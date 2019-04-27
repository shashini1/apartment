package lk.empire.ams.controller;

import lk.empire.ams.dao.Payment;
import lk.empire.ams.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment")
    public List<Payment> getMappingPayment(){
       return paymentService.getAllPayment();
    }
}
