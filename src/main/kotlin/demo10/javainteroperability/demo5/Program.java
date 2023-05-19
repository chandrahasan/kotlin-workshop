package demo10.javainteroperability.demo5;


public class Program {
    public static void main(String[] args) {
        Meeting m = new Meeting();

//        demo10.javainteroperability.demo5.UtilsKt.saveMeeting(m);
      Utils.saveMeeting(m);

//        Meeting.Companion.build();
      Meeting.build();

//        m.setTitle("Title");
//        System.out.println(m.getTitle());

//        m.title = "Emergency";
        System.out.println(m.title);

    }
}
