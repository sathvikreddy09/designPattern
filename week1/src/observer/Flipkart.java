package observer;

public interface Flipkart {
	 void subscribe(Observer obj);

	  void unsubscribe(Observer obj);

	  void sendNotification();

}
