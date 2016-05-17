public class JobCenter implements Subject {

    List<Observer> mObserver = new LinkedList<Observer>();
    
    public void attach(Observer aObserver) {
        mObserver.add(aObserver);
    }
    public void detach(Observer aObserver) {
        mObserver.remove(aObserver);
    }
    public void notifyObservers(Offer aOffer) {
        for(Observer observer : mObserver){
            observer.update(aOffer);
        }
    }
}
