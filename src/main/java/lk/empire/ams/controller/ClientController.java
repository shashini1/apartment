package lk.empire.ams.controller;

import lk.empire.ams.dto.ClientDTO;
import lk.empire.ams.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

@RestController
@CrossOrigin
public class ClientController {

    @Autowired
    private ClientService clientService;

//    @PostMapping("")
//    public String save(ClientDTO dto){
//
//    }

    @GetMapping("/client")
    public List<ClientDTO> getMappingClient(){
        return clientService.getAllClient();
    }
}
