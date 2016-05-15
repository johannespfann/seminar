public class CleanVisitor implements Visitor {
	...
    public CleanVisitor(List<Element> aElement){
        mElement = aElement;
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
