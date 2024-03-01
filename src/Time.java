import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time {
    private LocalTime arrivalTime;
    private LocalTime departurTime;

    public void setArrivalTime() {
        arrivalTime = LocalTime.now();
    }

    public void setDepartueTime() {
        departurTime = LocalTime.now();
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departurTime;
    }

    public double calculateTime() {
        double time = java.time.Duration.between(arrivalTime, departurTime).toMillis();//calc time by milli secound
        time = Math.ceil((double) time / 3600000);  //turn it to hours and ciel it up if times 1.1 hours we ciel it up to 2
        return time;
    }
}
