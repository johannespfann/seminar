public class main {
    public final static void main(String[] args){
        DeliveryService deliveryService = new DeliveryService();
        DeliverBigPackageCommand commandDeliverToDATEV = 
		new DeliverBigPackageCommand(new Company(),
                                     new Package());
        DeliverLetterCommand commandDeliverToJohannes = 
		new DeliverLetterCommand(new PrivatePerson(), 
                                 new Letter());

        deliveryService.sendObject(
		commandDeliverToDATEV);
        deliveryService.sendObject(
		commandDeliverToJohanes);
    }
}
