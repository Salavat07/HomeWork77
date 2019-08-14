public class Mental extends Player implements  Hero{

    private String superPower;


    @Override
    public void usePower() {
        System.out.println("Mental used a superPower ");
    }
}