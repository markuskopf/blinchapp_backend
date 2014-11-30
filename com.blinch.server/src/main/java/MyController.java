import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @RequestMapping(value = "/ping")
    public MyResponse hello() {

        final MyResponse test = new MyResponse();
        test.setName("Hello Blinchn hgjhgjgh");
        test.setValue(42);

        return test;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public MyResponse login(@RequestBody LoginRequest request) {

        if (!request.getMail().equals("user")) {
            throw new UserNotFoundException("not found");
        }

        final MyResponse test = new MyResponse();
        test.setName("my name");

        return test;
    }

}
