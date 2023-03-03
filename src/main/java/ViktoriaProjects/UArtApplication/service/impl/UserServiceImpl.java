package ViktoriaProjects.UArtApplication.service.impl;

import ViktoriaProjects.UArtApplication.model.User;
import ViktoriaProjects.UArtApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);

        if (user != null) {
            return user;
        }

        throw new UsernameNotFoundException("user not found with username: " + username);
    }
}
