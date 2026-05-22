package jar.controller;

import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Math {

    @GetMapping("/api/fib")
    public static List<Integer> fib(@RequestParam int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= n; i++) {
            int v = f(i);
            list.add(v);
        }
        return list;

    }

    public static int f(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;

        }
        return b;
    }

}
