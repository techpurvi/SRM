package jar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.userData;
import jar.model.User;
import jar.repo.UserRepo;

@RestController
public class Signup {

    @Autowired
    UserRepo db;

    @GetMapping("/api/signup")
    public String signup(@RequestBody userData ud) {

        User data = new User();
        data.setName(ud.getName());
        data.setEmail(ud.getEmail());
        data.setPassword(ud.getPassword());
        db.save(data);

        return "signup sucess ✅" + ud.toString();
    }

}
