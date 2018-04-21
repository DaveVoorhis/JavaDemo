A lambda is notionally an anonymous (un-named) function, which can be assigned
to a variable, passed as an argument to a method, or returned by a method.

This means it is what is sometimes called a "higher order function", which is
a key ingredient in functional programming.

In Java, it is implemented in Java as syntactic sugar around an (un-named) inner class 
definition inherited from an interface annotated as having a @FunctionalInterface. 

Whew.

An interface can be a @FunctionalInterface if it defines a single method, which
defines the parameter and return types of associated lambdas.

