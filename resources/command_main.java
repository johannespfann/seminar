public class main {
    public final static void main(String[] args){
        DeliverService deliverService = new DeliverService();
        DeliverBigPackageCommand commandDeliverToDATEV = 
		new DeliverBigPackageCommand(new Company(),
                                     new Package());
        DeliverLetterCommand commandDeliverToJohannes = 
		new DeliverLetterCommand(new PrivatePerson(), 
                                 new Letter());

        deliverService.sendObject(
		commandDeliverToDATEV);
        deliverService.sendObject(
		commandDeliverToJohanes);
    }
}
