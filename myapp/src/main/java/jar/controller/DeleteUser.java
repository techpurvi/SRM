package jar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jar.repo.UserRepo;

@RestController
public class DeleteUser {

    @Autowired
    UserRepo db;

    @DeleteMapping("/api/delete/{id}")
    public String deleteUser(@PathVariable int id) {

        if (db.existsById(id)) {
            db.deleteById(id);
            return "User deleted successfully ✅";
        } else {
            return "User not found ❌";
        }
    }
}