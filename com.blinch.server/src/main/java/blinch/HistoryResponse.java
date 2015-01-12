package blinch;

/**
 * Created by markuskopf on 05/01/15.
 */
public class HistoryResponse extends  DefaultResponse {

    private BlinchAppointment[] appointments;


    public BlinchAppointment[] getAppointments() {
        return appointments;
    }

    public void setAppointments(BlinchAppointment[] appointments) {
        this.appointments = appointments;
    }

}
