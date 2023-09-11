# Strategy 
Strategy is a behavioral design pattern that turns a set of behaviors into objects and makes them interchangeable 
inside original context object.

## Lambda Strategy
java 8 brouth the support of lambda funcions, which can serve as simple alternatives to the strategy pattern.

## Strategy overview
The Original Object, called context, holds a reference to a strategy object . The context delegates executing the 
behavior to the linked strategy object . In order to change the way the way the context performs its work, other objects 
may repalce the correntyle linked strategy object with another one.

## Applicability
*  java.util.Comparator#compare() called from Collections#sort()
*  javax.servlet.http.HttpServlet: service() method, 
* javax.servlet.Filter#doFilter()

## Payment method in an e-commerce app
In this example, the Strategy pattern is used to implement the varios pyment methods in an e-commerce application.
after selection a product to purchase, a custome picks a payment method: paypal or credit card.

