    public void update(Subject aSubject, Offer aOffer) {
        if(aSubject instanceof JobCenterA){
            doSomething(aOffer);
        }
        if(aSubject instanceof JobCenterB){
            doSomething(aOffer);
        }
		...
    }

