public class Klient implements Observer {
    
    public void update(Angebot aAngebot) {
        if(aAngebot instanceof InformatikJob){
            doSomething(aAngebot);
        }
    }
}
