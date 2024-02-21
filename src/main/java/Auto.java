import java.time.format.;

public class Auto {
    private String auto;
    private String status;
    private String änderung;
    private DateTimeFormatter zeit;
public Auto(String auto, String status, String änderung, DateTimeFormatter zeit){
    this.auto = auto;
    this.status = status;
    this.änderung = änderung;
    this.zeit = zeit;
}

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getÄnderung() {
        return änderung;
    }

    public void setÄnderung(String änderung) {
        this.änderung = änderung;
    }

    public DateTimeFormatter getZeit() {
        return zeit;
    }

    public void setZeit(DateTimeFormatter zeit) {
        this.zeit = zeit;
    }
}



