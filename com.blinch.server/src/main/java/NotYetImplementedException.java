import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by markuskopf on 05/01/15.
 */

@ResponseStatus(value = HttpStatus.NOT_IMPLEMENTED)
public class NotYetImplementedException extends RuntimeException {

    public NotYetImplementedException(final String message) {
        super(message);
    }

}
