package lk.empire.ams.service;

import lk.empire.ams.dao.User;
import lk.empire.ams.dto.UserDTO;
import lk.empire.ams.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Get all the Client. return clientDto list
     */
    public List<User> getAllUser() {
        List<User> userList = userRepository.findAll();

        // create a new object. And assign iterative value in to this obect
//        List<UserDTO> userDTOList = new ArrayList<UserDTO>();
//
//        for (User user : userList){
//            UserDTO userDTO = UserDTO.valueOf(user);
//            userDTOList.add(userDTO);
//        }
        return userList;
    }


}
