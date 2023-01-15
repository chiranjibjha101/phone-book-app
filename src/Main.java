public class Main {
    public static void main(String[] args) {

        LandLine l1=new LandLine("999");
        LandLine l2 =new LandLine("455");

        l1.callNumber("455");
        l2.receiveCall("455");
        System.out.println(l2.answerCall());

    }

}