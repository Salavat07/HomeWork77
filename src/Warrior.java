public class Warrior extends Player implements Hero {

    private String superPower;


    @Override
    public void usePower() {
        System.out.println("Warrior used a superPower ");
    }
}

