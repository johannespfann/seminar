public class Element implements Element{
   public void accept(Visitor aVisitor){
	aVisitor.visitElement(this)
	for(Element element : mElements){
		element.accept(aVisitor)
	}
   }
}




