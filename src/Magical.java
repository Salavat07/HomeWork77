public class Magical extends Player implements Hero {

    private String superPower;


    @Override
    public void usePower() {
        System.out.println("Magic применил суперспобосность");
    }
}