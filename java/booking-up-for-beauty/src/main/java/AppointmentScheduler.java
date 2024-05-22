import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return "You have an appointment on " + appointmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + ", " + appointmentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH)
                + " " + appointmentDate.getDayOfMonth() + ", " + appointmentDate.getYear() + ", at " + ((appointmentDate.getHour() % 12 == 0) ? 12 : appointmentDate.getHour() % 12) + ":" + ((appointmentDate.getMinute() < 10) ? "0" + appointmentDate.getMinute() : String.valueOf(appointmentDate.getMinute()) ) + ((appointmentDate.getHour() < 12) ? " AM." : " PM.");

    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
