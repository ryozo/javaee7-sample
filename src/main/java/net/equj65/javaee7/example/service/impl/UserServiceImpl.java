package net.equj65.javaee7.example.service.impl;

import net.equj65.javaee7.example.domain.User;
import net.equj65.javaee7.example.repository.UserRepository;
import net.equj65.javaee7.example.service.UserService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * ユーザに関する操作を提供するStatelessSessionBeanです。
 * @author ryozo
 */
@Stateless
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
