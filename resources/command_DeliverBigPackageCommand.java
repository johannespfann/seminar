public class DeliveryBigPackageCommand implements Command {	
    ...
    public DeliveryBigPackageCommand(Company aCompany,
                  Package aPackage){
        mCompany = aCompany;
        mPackage = aPackage
    }
    @Override
    public void execute() {
        mCompany.checkPackage(mPackage);
        mCompany.deliverPackage(mPackage);
    }
}
