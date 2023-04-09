package A30_Encapsulation.JavaEncapsulation;

public class User {

    private int id;
    private String username;
    private String password;
    private boolean active;
    private Boolean signedIn;
    private boolean certificate;

    // Constructors
    public User() {

    }
    public User(int id, String username, String password) {
        setId(id);
        setUsername(username);
        setPassword(password);
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setPassword(String password) {
        if(password.length()<6){
            throw new IllegalArgumentException("Your password is too short.");
        }
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        if(this.id == 1){
            throw new RuntimeException("You can not see admin password.");
        }
        return password;
    }

    // Boolean und boolean getters setters
        // for primitive boolean instead of "get" prefix, we use "is", sometimes "has"
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
        // example for "has" prefix
    public boolean hasCertificate() {
        return certificate;
    }
    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }
        // for the wrapper Boolean "get" prefix
    public Boolean getSignedIn() {
        return signedIn;
    }
    public void setSignedIn(Boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
