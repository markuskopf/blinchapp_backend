import java.util.Date;

/**
 * Created by markuskopf on 05/01/15.
 */
public class CheckinResponse extends DefaultResponse{

    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

}
