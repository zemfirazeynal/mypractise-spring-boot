package az.mypractisesecond.mypractisespringboot.service.impl;

import az.mypractisesecond.mypractisespringboot.model.MyUser;
import az.mypractisesecond.mypractisespringboot.repository.UserRepository;
import az.mypractisesecond.mypractisespringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public MyUser create(MyUser user){

        return userRepository.save(user);
    }

    @Override
    public void delete(Long id){
        MyUser user = userRepository.findById(id)
                        .orElseThrow(()->new RuntimeException("User Not Found!"));
        userRepository.delete(user);
    }

    @Override
    public Set<MyUser> users(){
        List<MyUser> all = userRepository.findAll();
        return new HashSet<MyUser>(all);
    }

    @Override
    public MyUser update(Long id, MyUser userNew){
        MyUser user = userRepository.findById(id)
                .orElseThrow(()->new RuntimeException("User Not Found!"));
        user.setName(userNew.getName());
        user.setSurname(userNew.getSurname());
        return userRepository.save(user);
    }
}
