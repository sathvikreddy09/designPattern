package observer;

public class Customer implements Observer {

	 private String location;

	  @Override
	  public void update(String location) {
	    this.location = location;
	    locationDisplay();
	  }

	  public void locationDisplay() {
	    System.out
	        .println("Successfully sent notification to the Customer : The Current Location of the Parcel is: " + location);
	  }

}
