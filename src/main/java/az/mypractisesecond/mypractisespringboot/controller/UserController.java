package az.mypractisesecond.mypractisespringboot.controller;

import az.mypractisesecond.mypractisespringboot.model.MyUser;
import az.mypractisesecond.mypractisespringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

  @PostMapping
  public MyUser create(@RequestBody MyUser user){
       log.info("call create!");
        return userService.create(user);
   }

    @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id){
       log.info("call delete:"+id);
       userService.delete(id);
   }

   @GetMapping
  public Set<MyUser> users(){
        log.info("call users!");
      return userService.users();
   }

   @PutMapping("/{id}")
  public MyUser update(@PathVariable Long id, @RequestBody MyUser user){
        log.info("call update:"+id);
        return userService.update(id,user);
  }
}

