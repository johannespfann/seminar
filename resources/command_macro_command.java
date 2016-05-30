public class MacroCommand implements Command {

    public MacroCommand(Company aCompany, 
		PrivatePerson aPrivatePerson,Package aPackage){
        mCompany = aCompany;
        mPrivatePerson = aPrivatePerson;
        mPackage = aPackage;
    }
    @Override
    public void execute() {
        mCompany.cheackPackage(mPackage);
        mCompany.deliverPackage(mPackage);

        mPrivatePerson.deliverLetter(mPackage);
    }
}
