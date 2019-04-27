package lk.empire.ams.service;

import lk.empire.ams.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public String getTest() {

        return testRepository.testRepo();
    }

}
