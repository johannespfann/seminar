public class Client implements Observer {
    
    public void update(Offer aOffer) {
        if(aOffer instanceof DeveloperJob){
            doSomething(aOffer);
        }
    }
}
