package lk.empire.ams.service;

import lk.empire.ams.dao.Client;
import lk.empire.ams.dto.ClientDTO;
import lk.empire.ams.repository.ClientRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service class for managing client.
 */

@Service
public class ClientService {

    @Autowired
    private ClientRepostory clientRepostory;

    /**
     * Get all the Client. return clientDto list
     */
    public List<ClientDTO> getAllClient() {
        List<Client> clientList = (List<Client>) clientRepostory.findAll();

        // create a new object. And assign iterative value in to this obect
        List< ClientDTO> clientDTOList = new ArrayList<ClientDTO>();

        for (Client clientDAO : clientList){
            ClientDTO clientDTO = ClientDTO.valueOf(clientDAO);
            clientDTOList.add(clientDTO);
        }
        return clientDTOList;
    }
}
