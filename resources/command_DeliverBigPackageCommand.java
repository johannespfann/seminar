public class DeliverBigPackageCommand implements Command {	
    ...
    public DeliverBigPackageCommand(Company aCompany,Package aPackage){
        mCompany = aCompany;
        mPackage = aPackage
    }
    @Override
    public void execute() {
        mCompany.checkPackage(mPackage);
        mCompany.deliverPackage(mPackage);
    }
}
