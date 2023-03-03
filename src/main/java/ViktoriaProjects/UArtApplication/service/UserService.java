package ViktoriaProjects.UArtApplication.service;

import ViktoriaProjects.UArtApplication.model.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User readById(long id);
    User update(User user);
    void delete(long id);
    List<User> getAll();

}
