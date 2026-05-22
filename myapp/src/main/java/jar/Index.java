package jar;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.Res;

@RestController
public class Index {

    @GetMapping("/")
    public Res m1() {
        return new Res();
    }

    @PostMapping("/fruits")
    public HashMap<Object, Object> m2() {

        HashMap<Object, Object> res = new HashMap<>();
        res.put("msg", "welcome fruits api");
        res.put("mango", "🥭🥭");
        res.put("apple", "🍎🍏");
        res.put("status", "200k");
        return res;

    }
}
