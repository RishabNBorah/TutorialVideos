package interfaces;

public interface IPet {

	public String getOwner();
	
	public String getName();
	
	public default String getFullName() {
		return getName() + " of " + getOwner();
	}
}
