package domain;

public class UsersInfo {
    private int id;
    private String firstName;
    private String lastName;
    private String deactivatedUser;
    private String isClosedUser;
    private String canAccessClosed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDeactivatedUser() {
        return deactivatedUser;
    }

    public void setDeactivatedUser(String deactivatedUser) {
        this.deactivatedUser = deactivatedUser;
    }

    public String getIsClosedUser() {
        return isClosedUser;
    }

    public void setIsClosedUser(String isClosedUser) {
        this.isClosedUser = isClosedUser;
    }

    public String getCanAccessClosed() {
        return canAccessClosed;
    }

    public void setCanAccessClosed(String canAccessClosed) {
        this.canAccessClosed = canAccessClosed;
    }

}
