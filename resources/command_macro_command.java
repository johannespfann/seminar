public class MacroCommand implements Command {

    public MacroCommand(Company aCompany, 
		PrivatePerson aPrivatePerson){
        mCompany = aCompany;
        mPrivatePerson = aPrivatePerson;
    }
    @Override
    public void execute(Deliverable aObject) {
        mCompany.cheackPackage(aObject);
        mCompany.deliverPackage(aObject);

        mPrivatePerson.deliverLetter(aObject);
    }
}
