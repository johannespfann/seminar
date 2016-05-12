public class Super {
    public void addValue(int aValue){
        sum = sum + aValue;
        notifyObservers();
    }
}

public class Sub extends Super {
    public void addValue(int aValue){
        super.addValue(aValue);
        sum = sum + aValue;
        // upss... 
    }
}
