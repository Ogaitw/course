package resource;

import entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findall(){
        User u = new User(1L, "Maria", "maria@gmail.com","99999", "123456");
        return ResponseEntity.ok().body(u);
    }

}
