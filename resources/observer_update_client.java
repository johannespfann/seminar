public class Main {

    public static void main(String[] args) {
        mJobCenter.addOffer(new DeveloperJob());
        mJobCenter.addOffer(new DeveloperJob());
        mJobCenter.addOffer(new DeveloperJob());
        mJobCenter.notifyObservers();
    }
}
