package lk.empire.ams.controller;

import lk.empire.ams.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping("/test")
    public String testRequest(){

//       String res = testService.getTest();
//       return res;

        return testService.getTest();
    }
}


