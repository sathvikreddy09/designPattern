package observer;

import java.util.ArrayList;
import java.util.List;

// Flipkart is the subject
interface Flipkart {
  void subscribe(Observer obj);

  void unsubscribe(Observer obj);

  void sendNotification();
}

class ItemData implements Flipkart {

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
}

interface Observer {
  public void update(String location);
}

class FlipkartSeller implements Observer {
  private String location;

  @Override
  public void update(String location) {
    this.location = location;
    locationDisplay();
  }

  public void locationDisplay() {
    System.out.println(
        "Successfully sent notification to Flipkart Seller : The Current Location of the Parcel is: " + location);
  }
}

class Customer implements Observer {
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

class ThirdPartyAssociate implements Observer {
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

public class ObserverPatternForEcommerceStore {

  public static void main(String[] args) {
    ItemData order = new ItemData();

    Observer obj1 = new FlipkartSeller();
    Observer obj2 = new Customer();
    Observer obj3 = new ThirdPartyAssociate();

    order.subscribe(obj1);
    order.subscribe(obj2);
    order.subscribe(obj3);

    order.trackLocation("1 Universiddty Pkwy, Romeoville, IL 60446, United States");
    order.unsubscribe(obj2);
    System.out.println("The Customer has unsubscribe from the notifications");
    order.trackLocation("21 Pkwy, Romeoville, IL 32346, United States");

  }
}