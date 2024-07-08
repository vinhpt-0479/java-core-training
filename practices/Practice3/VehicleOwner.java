package Practice3;

public class VehicleOwner {
    private String cccd;
    private String fullname;
    private String email;

    public VehicleOwner(String cccd, String fullname, String email) {
        this.cccd = cccd;
        this.fullname = fullname;
        this.email = email;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
