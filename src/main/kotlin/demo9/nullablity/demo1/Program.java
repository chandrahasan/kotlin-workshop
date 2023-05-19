package demo9.nullablity.demo1;

public class Program {
    public static void main(String[] args) {
        OrganizerJava org = new OrganizerJava();
        org.closeMeeting(null);
    }
}

class OrganizerJava {
    public boolean closeMeeting(MeetingJava m) {
        return m.close();
    }
}

class MeetingJava {
    public boolean close() {return true;}
}
