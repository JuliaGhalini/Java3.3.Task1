package domain;

public class GroupsInfo {

    private int id;
    private String name;
    private int isClosed;
    private int isAdmin;
    private int isMember;
    private String type;
    private GroupsInfo photosInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(int isClosed) {
        this.isClosed = isClosed;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getIsMember() {
        return isMember;
    }

    public void setIsMember(int isMember) {
        this.isMember = isMember;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GroupsInfo getPhotosInfo() {
        return photosInfo;
    }

    public void setPhotosInfo(GroupsInfo photosInfo) {
        this.photosInfo = photosInfo;
    }

}
