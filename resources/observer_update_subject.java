public class Arbeitsvermittlung implements Subject {

    @Override
    public void notifyObservers(Angebot aAngebot) {
        for(Observer observer : mObserver){
            observer.update(aAngebot);
        }
    }

    public void addAngebot(Angebot aAngebot){
        notifyObservers(aAngebot);
    }
}

