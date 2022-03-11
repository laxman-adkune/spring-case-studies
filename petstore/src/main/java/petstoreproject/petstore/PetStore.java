package petstoreproject.petstore;

public class PetStore {
	private String storeName;
	private String address;
	
	
	public PetStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PetStore(String storeName, String address) {
		super();
		this.storeName = storeName;
		this.address = address;
	}
	
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
