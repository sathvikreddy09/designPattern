package observer;

public class FlipkartSeller implements  Observer {

	 private String location;

	  public void update(String location) {
	    this.location = location;
	    locationDisplay();
	  }

	  public void locationDisplay() {
	    System.out.println(
	        "Successfully sent notification to Flipkart Seller : The Current Location of the Parcel is: " + location);
	  }

}
