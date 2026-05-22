package jar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sum {
    @GetMapping("/sum")
    public static int sum(@RequestParam int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }
}

