package observer;

public class ThirdPartyAssociate implements Observer {
	 private String location;

	  @Override
	  public void update(String location) {
	    this.location = location;
	    locationDisplay();
	  }

	  public void locationDisplay() {
	    System.out
	        .println("Successfully sent notification to Third Party Associates : The Current Location of the Parcel is: "
	            + location);
	  }

}
