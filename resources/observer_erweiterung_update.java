    public void update(Subject aSubject, Offer aOffer) {
        if(aSubject instanceof JobCenterA){
            doSomethingA(aOffer);
        }
        if(aSubject instanceof JobCenterB){
            doSomethingB(aOffer);
        }
		...
    }

