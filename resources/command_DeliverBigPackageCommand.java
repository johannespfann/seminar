public class DeliverBigPackageCommand implements Command {	
    ...
    public DeliverBigPackageCommand(Company aCompany){
        mCompany = aCompany;
    }
    @Override
    public void execute(Object aObject) {
        mCompany.cheackPackage((Package)aObject);
        mCompany.deliverPackage((Package)aObject);
    }
}
