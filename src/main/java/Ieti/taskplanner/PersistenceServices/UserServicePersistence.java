package Ieti.taskplanner.PersistenceServices;

import Ieti.taskplanner.Model.User;

import java.util.List;

public interface UserServicePersistence {
    List<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}
