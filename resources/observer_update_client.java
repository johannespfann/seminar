public class Main {

    public static void main(String[] args) {
        mArbeitsvermittlung.addAngebot(new InformatikJob());
        mArbeitsvermittlung.addAngebot(new InformatikJob());
        mArbeitsvermittlung.addAngebot(new InformatikJob());
        mArbeitsvermittlung.notifyObservers();
    }
}
