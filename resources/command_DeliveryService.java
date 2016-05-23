public class DeliveryService {
    public void sendObject(Command aCommand, Deliverable aObject){
        aCommand.execute(aObject);
    }
}

