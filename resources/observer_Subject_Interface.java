public interface Subject{
  void attach(Observer aObserver);
  void detach(Observer aObserver);
  void notifyObservers();
}
