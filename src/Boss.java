public class Boss extends Player implements  Hero{
    private String protect;

    @Override
    public void usePower() {
        System.out.println("Boss takes protect");
    }
}