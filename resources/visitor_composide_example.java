public void accept(Visitor aVisitor){
	visitElement(aVisitor)
	for(Element element : mElements){
		element.accept(aVisitor)
	}
}




