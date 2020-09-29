package Ieti.taskplanner.PersistenceServices;


import Ieti.taskplanner.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServices implements UserServicePersistence {
    List<User> users = new ArrayList<User>(Arrays.asList(new User("1","Juliana","juligardu@gmail.com","1234"),new User("2","Sofia","sofia@gmail.com","5678"),new User("3","Oliver","oliver@gmail.com","91011")));

    @Override
    public List<User> getAll() {


        return users;
    }

    @Override
    public User getById(String userId) {
        User res=null;
        for(int i=0 ;i<users.size();i++){
            if (users.get(i).getId().equals(userId)){
              res= users.get(i);

            }
        }
        return res;
    }

    @Override
    public User create(User user) {

        users.add(user);


        return user;
    }

    @Override
    public User update(User user) {


        return null;
    }

    @Override
    public void remove(String userId) {

        for(int i=0 ;i<users.size();i++){
            if (users.get(i).getId().equals(userId)){
                users.remove(users.get(i));
            }
        }

    }
}
