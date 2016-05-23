public class DeliverBigPackageCommand implements Command {	
    ...
    public DeliverBigPackageCommand(Company aCompany){
        mCompany = aCompany;
    }
    @Override
    public void execute(Deliverable aObject) {
        mCompany.checkPackage((Package)aObject);
        mCompany.deliverPackage((Package)aObject);
    }
}
