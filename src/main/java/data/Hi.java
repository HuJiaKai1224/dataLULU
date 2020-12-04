package data;

public class Hi {
    public static void main(String[] args) {
//        System.out.println("helloWW");
//        new papaya().xd();
        papaya t = new papaya("King",1.8f,60f);
        t.xd();
        t.height=1.8f;
        t.weight=60f;
        System.out.println(t.bmi());
    }
}
