# Lambdas
## What are Lambdas
- A lambda expression is a concise way to represent a single-method interface (functional interface) using a more compact syntax. It provides a clear and expressive way to write anonymous functions, making it easier to work with functional programming concepts.
- A functional interface is an interface that contains exactly one abstract method

### Uses of Lambdas
- To provide less coding
- To provide implementation of a functional interface
```...Example of functional interface...
  '''// Before Java 8
Runnable runnableOld = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello from old way!");
    }
};

// With lambda expression
Runnable runnableLambda = () -> System.out.println("Hello from lambda!");

```


> **Ideal Use Case for Lambda Expressions**
- Approach 1: Create Methods That Search for Members That Match One Characteristic
- Approach 2: Create More Generalized Search Methods
- Approach 3: Specify Search Criteria Code in a Local Class
- Approach 4: Specify Search Criteria Code in an Anonymous Class
- Approach 5: Specify Search Criteria Code with a Lambda Expression
- Approach 6: Use Standard Functional Interfaces with Lambda Expressions
- Approach 7: Use Lambda Expressions Throughout Your Application
- pproach 8: Use Generics More Extensively
- Approach 9: Use Aggregate Operations That Accept Lambda Expressions as Parameters

### More Work
- Lambda Expressions in GUI Applications
- *Syntax of Lambda Expressions*
- *Accessing Local Variables of the Enclosing Scope*
- *Target Typing*p
- *Target Types and Method Arguments*
- *Serialization*