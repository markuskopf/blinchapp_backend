package blinch;

import java.util.Date;

/**
 * Created by markuskopf on 05/01/15.
 */
public class CheckinRequest {

    private String name;
    private String email;
    private Date date;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
