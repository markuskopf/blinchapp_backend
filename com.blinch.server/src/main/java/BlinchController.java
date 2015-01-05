
/**
 * Created by markuskopf on 05/01/15.
 */

import org.springframework.web.bind.annotation.*;

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


        //TODO: Markus - how to send back a array of.....


        return  response;
    }

    @RequestMapping(value = "/v1/accounts", method = RequestMethod.POST)
    public void account() {
        throw new NotYetImplementedException("not yet implemented");
    }


    @RequestMapping(value = "/v1/register", method = RequestMethod.POST)
    public RegisterResponse register(@RequestBody RegisterRequest request) {
        RegisterResponse response = new RegisterResponse();
        response.setStatus(200);
        response.setMessage("Successful registered.");

        return response;
    }


}
