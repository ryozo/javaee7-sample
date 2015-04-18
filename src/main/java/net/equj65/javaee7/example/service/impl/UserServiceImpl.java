package net.equj65.javaee7.example.service.impl;

import net.equj65.javaee7.example.domain.User;
import net.equj65.javaee7.example.service.UserService;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * ユーザに関する操作を提供するStatelessSessionBeanです。
 * @author ryozo
 */
@Stateless
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<User>() {{
            add(new User("id1", "user1", 20, "user1@example.com", "address1"));
            add(new User("id2", "user2", 20, "user2@example.com", "address2"));
            add(new User("id3", "user3", 20, "user3@example.com", "address3"));
            add(new User("id4", "user4", 20, "user4@example.com", "address4"));
            add(new User("id5", "user5", 20, "user5@example.com", "address5"));
            add(new User("id6", "user6", 20, "user6@example.com", "address6"));
        }};
        return userList;
    }
}
