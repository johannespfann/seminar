public class JobCenter implements Subject {

    @Override
    public void notifyObservers(Offer aOffer) {
        for(Observer observer : mObserver){
            observer.update(aOffer);
        }
    }

    public void addAngebot(Offer aOffer){
        notifyObservers(aOffer);
    }
}

