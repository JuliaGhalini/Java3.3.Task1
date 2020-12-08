package domain;

public class CommentsInfo {
    private int id;
    private int fromId;
    private int date;
    private int text;
    private int likesInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public int getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(int likesInfo) {
        this.likesInfo = likesInfo;
    }

}
