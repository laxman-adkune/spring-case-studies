package petstoreproject.petstore;

public class PetHelpLineService {
	private String HelpLineNumber;
	

	public String getPetHelpLineNumber() {
		return HelpLineNumber;
	}

	private static PetHelpLineService pethelp  = new PetHelpLineService();
	private	PetHelpLineService()
	{
		this.HelpLineNumber="8390444909";
	}
	public static PetHelpLineService createPetHelpLineServiceInstance()
	{
		return pethelp;
	}
}
