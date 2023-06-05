package az.mypractisesecond.mypractisespringboot.service;

import az.mypractisesecond.mypractisespringboot.model.MyUser;

import java.util.Set;

public interface UserService {

     MyUser create(MyUser user);

     void delete(Long id);

     Set<MyUser> users();

     default MyUser update(Long id, MyUser user){
        return null;
    }
}
