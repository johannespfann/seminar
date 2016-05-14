public class main {

    public static final void main(String[] args){
        Visitor cleanVisitor = new CleanVisitor();
        Visitor cookVisitor = new CookVisitor();
        Element[] elements = new Element[2];
        elements[0] = new Broccoli();
        elements[1] = new Potato();

        for(int i = 0; i < elements.length;i++){
            elements[i].accept(cleanVisitor);
        }

        for(int i = 0; i < elements.length;i++){
            elements[i].accept(cookVisitor);
        }
    }

}
