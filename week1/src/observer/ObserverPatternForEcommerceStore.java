package observer;

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


