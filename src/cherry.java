public class cherry extends  Frugt implements Konserver, Bearbejde{


    boolean moden = false;

    @Override
    public void konserver() {
        System.out.println("The cherry are mashed to jam.");
    }

    @Override
    public void bearbejde() {
        System.out.println("The cherry´s stone are removed.");
    }

}
