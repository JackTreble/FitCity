package oneandahalfbeards.fitcity.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WardsController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/wards")
    public Ward wards(@RequestParam(value="name", defaultValue="World") String name) {
        return new Ward(counter.incrementAndGet(),
                String.format(template, name));
    }
}
