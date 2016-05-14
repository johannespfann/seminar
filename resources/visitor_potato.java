public class Potato implements Element {
    @Override
    public void accept(Visitor aVisitor) {
        aVisitor.visitPotato(this);
    }
}
