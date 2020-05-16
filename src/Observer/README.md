
There are two ways to implement Observer pattern, Push and Pull.

## Push
We use `Subject` and `Observer`, where `Subject` would push all its updates to its observers.


## Pull
We use `Observable` and `Observer` provided by `java.util` instead. 


## Push vs Pull
Note that the notified orders are different between Push and Pull mode due to the different implementations. One of the 
disadvantage of `java.util.Observable` is that it's a class other than an interface, which constrains its reusage and 
flexibility.
 

