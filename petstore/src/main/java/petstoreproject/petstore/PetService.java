package petstoreproject.petstore;

public class PetService {
	private PetStore petStore;
	private PetHelpLineService petHelpLineService;
	
	public PetService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PetService(PetStore petStore) {
		super();
		this.petStore = petStore;
	}

	public PetStore getPetStore() {
		return petStore;
	}

	public void setPetStore(PetStore petStore) {
		this.petStore = petStore;
	}

	public PetHelpLineService getPetHelpLineService() {
		return petHelpLineService;
	}

	public void setPetHelpLineService(PetHelpLineService petHelpLineService) {
		this.petHelpLineService = petHelpLineService;
	}
	
	
	
}
