public class CleanVisitor implements Visitor {

    @Override
    public void visitBroccoli(Broccoli aBroccoli) {
        System.out.println("Clean broccoli");
        modifyBroccoli(aBroccoli);
    }

    @Override
    public void visitPotato(Potato aPotato) {
        System.out.println("Clean potatoes");
        modifyPotato(aPotato);
    }
}
