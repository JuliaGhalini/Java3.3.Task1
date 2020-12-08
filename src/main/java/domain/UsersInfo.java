package domain;

public class UsersInfo {

    private int id;
    private String firstName;
    private String lastName;
    private String deactivatedUser;
    private boolean isClosedUser;
    private boolean canAccessClosed;

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

    public boolean isClosedUser() {
        return isClosedUser;
    }

    public void setClosedUser(boolean closedUser) {
        isClosedUser = closedUser;
    }

    public boolean isCanAccessClosed() {
        return canAccessClosed;
    }

    public void setCanAccessClosed(boolean canAccessClosed) {
        this.canAccessClosed = canAccessClosed;
    }
}
