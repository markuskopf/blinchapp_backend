package blinch;

import java.util.Date;

/**
 * Created by markuskopf on 05/01/15.
 */
public class BlinchAppointment {

    private String name;

    private String myName;

    private Date appointmentDate;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

}
