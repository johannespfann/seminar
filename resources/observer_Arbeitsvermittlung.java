public class Arbeitsvermittlung implements Subject {

    List<Observer> mObserver = new LinkedList<Observer>();
    
    public void attach(Observer aObserver) {
        mObserver.add(aObserver);
    }
    public void detach(Observer aObserver) {
        mObserver.remove(aObserver);
    }
    public void notifyObservers(Angebot aAngebot) {
        for(Observer observer : mObserver){
            observer.update(aAngebot);
        }
    }
}
