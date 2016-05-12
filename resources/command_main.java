public class main {

    public final static void main(String[] args){
        DeliverBigPackageCommand commandDeliverToDATEV = 
		new DeliverBigPackageCommand(new Company());
        DeliverLetterCommand commandDeliverToJohanes = 
		new DeliverLetterCommand(new PrivatePerson());

        mDeliverService.sendObject(
		commandDeliverToDATEV, new Package());
        mDeliverService.sendObject(
		commandDeliverToJohanes, new Letter());
    }
}
