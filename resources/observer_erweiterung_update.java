    public void update(Subject aSubject, Angebot aAngebot) {
        if(aSubject instanceof ArbeitsvermittlungA){
            doSomething(aAngebot);
        }
        if(aSubject instanceof ArbeitsvermittlungB){
            doSomething(aAngebot);
        }
		...
    }

