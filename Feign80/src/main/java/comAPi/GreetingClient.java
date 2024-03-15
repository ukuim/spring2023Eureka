package comAPi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("Eureka-Provider")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
    @GetMapping("/hello")
    String getGreeting();
}