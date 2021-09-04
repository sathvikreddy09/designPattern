package observer;
import java.util.ArrayList;
import java.util.List;
public  class ItemData implements Flipkart {


	  private List<Observer> observers;
	  private String location;

	  public ItemData() {
	    this.observers = new ArrayList<>();
	  }

	  @Override
	  public void subscribe(Observer obj) {
	    observers.add(obj);
	  }

	  @Override
	  public void unsubscribe(Observer obj) {
	    observers.remove(obj);
	  }

	  @Override
	  public void sendNotification() {
	    for (Observer obj : observers) {
	      obj.update(location);
	    }
	  }

	  public void trackLocation(String location) {
	    this.location = getLocation(location);
	    sendNotification();
	  }

	  public String getLocation(String currentLocation) {
	    return currentLocation;
	  }

	@Override
	public void update(String location) {
		// TODO Auto-generated method stub
		
	}

}
