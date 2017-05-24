package guitarCrud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seanmcdermott on 5/23/17.
 */
@RestController
@RequestMapping("/donuts")
public class DonutController {
    private final DonutRepository repository;
    public DonutController(DonutRepository repository) { this.repository = repository; }
}
