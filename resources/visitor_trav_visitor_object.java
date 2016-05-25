public class CleanVisitor implements Visitor {
	...
    public CleanVisitor(List<Element> aElements){
        mElement = aElements;
    }

    @Override
    public void traverse(){
        traverseBroccoli();
        traversePotato();
    }

    @Override
    public void visitBroccoli(Broccoli aBroccoli) {
        ...
    }

    @Override
    public void visitPotato(Potato aPotato) {
       ...
    }
}
