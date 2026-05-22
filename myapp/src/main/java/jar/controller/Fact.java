package jar.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Fact {
    @GetMapping("/api/fact")
    public static int factApi(@RequestParam int n ){
        return fact(n);
    }

    public static int fact(int n){
        
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

}
