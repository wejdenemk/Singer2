package com.wej.singer.service;
import java.util.List;

import com.wej.singer.entities.User;

public interface UserService {
    List <User> findAll();
    User saveUser(User u);
    User updateUser(User u);
    void deleteUser(User u);
     void deleteUserById(Long id);
     User getUser(Long idU);

}
