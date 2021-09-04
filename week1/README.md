## Week 1 Assignment

### Observer Pattern

I have selected Ecommerce store to implement observer pattern. The subject is an Online Ecommerce store. The observers are all sellers, customers and third party associates.

The observer pattern is a major behavioral design pattern. It allows observers that have subscribed to an event to wait for input and react to it when notified. This means they don’t have to continuously keep checking whether the input has been provided or not. The main subject maintains a list of all the observers and whenever the event occurs, it notifies the observers so they can update their states accordingly

In my program I have taken the example of Ecommerce store that notify the sellers, customers and third party associates regarding the exact location of the package. The observers does not have to check with the subject for the tracking details of the parcel. Whenever the location of the parcel is updated the observers are automatically notified regarding the tracking details of the parcel.
