package demo10.javainteroperability.demo4;

public class Meeting {
    private String title;

    public Meeting(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Meeting(title='" + title + "')";
    }

    public void backgroundSave(Saveable saveable) {
        // do some work
        saveable.saved(this);
    }
}
