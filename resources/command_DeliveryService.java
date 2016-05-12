public class DeliveryService {
    public void sendObject(Command aCommand, Object aObject){
        aCommand.execute(aObject);
    }
}

