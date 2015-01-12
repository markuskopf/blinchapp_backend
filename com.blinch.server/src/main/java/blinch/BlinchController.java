package blinch;
/**
 * Created by markuskopf on 05/01/15.
 */


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
public class BlinchController {

    @RequestMapping(value = "/v1/status")
    public StatusResponse status() {
        final StatusResponse response = new StatusResponse();
        response.setMessage("Blinch status: Up and running.... ;)");
        response.setStatus(200);

        return response;
    }

    @RequestMapping(value = "/v1/login", method = RequestMethod.POST)
    public LoginResponse login(@RequestBody LoginRequest request) {

        if (!request.getMail().equals("user")) {
            throw new UserNotFoundException("not found");
        }

        final LoginResponse response = new LoginResponse();
        response.setName(request.getMail());

        return response;
    }


    @RequestMapping(value = "/v1/logout", method = RequestMethod.POST)
    public LogoutResponse logout(@RequestBody LoginRequest request) {

        final LogoutResponse logoutResponse = new LogoutResponse();
        logoutResponse.setMessage("Good bye....");
        logoutResponse.setStatus(200);

        return logoutResponse;
    }


    @RequestMapping(value = "/v1/checkin", method = RequestMethod.POST)
    public CheckinResponse checkin(@RequestBody CheckinRequest request) {

        CheckinResponse response = new CheckinResponse();
        response.setStatus(200);
        response.setMessage("Checkin successful.");


        return response;
    }

    @RequestMapping(value = "/v1/checkout", method = RequestMethod.POST)
    public void checkout() {
        throw new NotYetImplementedException("not yet implemented");
    }

    @RequestMapping(value = "/v1/lotteryimages", method = RequestMethod.POST)
    public void lotteryimages() {
        throw new NotYetImplementedException("not yet implemented");
    }

    @RequestMapping(value = "/v1/history")
    public HistoryResponse history() {

        final HistoryResponse response = new HistoryResponse();
        response.setStatus(200);
        response.setMessage("You have 20 entries.");


        BlinchAppointment app1 = new BlinchAppointment();
        app1.setName("Tanja");
        app1.setMyName("Markus");

        BlinchAppointment app2 = new BlinchAppointment();
        app2.setName("Foo");
        app2.setMyName("Fritz");

        BlinchAppointment app3 = new BlinchAppointment();
        app3.setName("Hugo");
        app3.setMyName("Markus");

        BlinchAppointment[] appointments = new BlinchAppointment[3];
        appointments[0] = app1;
        appointments[1] = app2;
        appointments[2] = app3;

        response.setAppointments(appointments);

        return  response;
    }

    @RequestMapping(value = "/v1/accounts", method = RequestMethod.GET)
    public void account() {
        throw new NotYetImplementedException("not yet implemented");
    }


    @RequestMapping(value = "/v1/registration", method = RequestMethod.POST)
    public RegisterResponse registration(@RequestBody RegisterRequest request) {
        RegisterResponse response = new RegisterResponse();
        response.setStatus(200);
        response.setMessage("Successful registered.");

        return response;
    }


}
