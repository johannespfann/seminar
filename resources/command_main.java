public class main {

    public final static void main(String[] args){
        DeliverService deliverService = new DeliverService();
        DeliverBigPackageCommand commandDeliverToDATEV = 
		new DeliverBigPackageCommand(new Company());
        DeliverLetterCommand commandDeliverToJohannes = 
		new DeliverLetterCommand(new PrivatePerson());

        deliverService.sendObject(
		commandDeliverToDATEV, new Package());
        deliverService.sendObject(
		commandDeliverToJohanes, new Letter());
    }
}
