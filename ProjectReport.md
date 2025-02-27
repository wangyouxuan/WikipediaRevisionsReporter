# Project Report

Youxuan Wang 


## Challenge #1 Complete

I made changes the code bind(QueryEngine.class).to(FakeQueryEngine.class) to bind(QueryEngine.class).to(WikipediaQueryEngine.class). Since the first default application configuration uses FakeQueryEngine to simulate the network, I only need to change it to FakeQueryEngine so that the application uses the real WikipediaQueryEngine instead.

## Challenge #2 Complete

Because the default presentation of the datetime results is not very attractive,  I created another class named NewRevisionFormatter, and created a new time formatter which is localDateTime with a changed patter"dd-MM-yyyy HH:mm:ss" which is more attractive. Then, I introduced a new interface Formatter that is implemented by these two formatters, the NewRevisionFormatter and RevisionFormatter. In order to show the new time formatter in the UI, I created a Formattermodule that injects the correct dependency at runtime, and added the Formattermodule to the Guice injector. Finally, because the formatter is still RevisionFormatter in WikipediaAnalyzer, I changed RevisionFormatter to NewRevisionFormatter, and it could run successfully. 

## Challenge #3 Complete

I called stream() on the list and used higher-order functions to replace the for loop. To be specific, in runQuery function of class WikipediaAnalyzer, I called stream() to represent a sequence of objects in response.revisions(). Then, using  :: operator in map(), I get the format in formatter. Finally, I used collect( Collectors.joining()) to repack them and connect with each other. Because this allows to use string, so I made the variable String output, and set it in setText().

## Reflection Question #1: Functional vs OO

The iterative and functional approaches can both run the program successfully, and both are easy to understand and create. However, I prefer the functional approaches. In fact, in challenge 3, I only used one line to finish the for-loop iteration which occupied for five lines. And in the progress of creating the code, I just needed to add new things in the call, like using map () and collect (). Besides, What I know there is a call named filter (), and it is easy and convenient for programmers to add new data and functions in it, with only one line. Due to the convenience of adding new data, I like to use it. But for the iterative approaches, though it uses many code and lines to implement, it uses some variables and functions making programmers easier to understand. As a matter of fact, when writing the one line, there will be many complicated and nested call in the functional approach, but the new data added will not this is still convenient to me. Therefore, though both ways have their advantages and disadvantages, as far as I am concerned, the functional is more attract me. 

## Reflection Question #2: Polymorphism and Dependency Inversion

In this little application, take the class FakeQueryEngine and class WikipediaQueryEngine for example, they are two separate QueryEngines, but both belong to QueryEngine. In this sense, the interface QueryEngine is created to connect these two dependencies. By splitting the interface QueryEngine into a fake queryEngien and a real queryEngine, enables these two implementations are interchangeable. Thus, this is where polymorphism use, when having many classes which can belong to single class, we can just create an interface and unify the functions in each class.  As for the dependency inversion, rather than working with the specific classes like FakeQueryEngine and WikipediaQueryEngine, I want to work with a standard queryEngien interface that connect with both classes. Moreover, the code relying on the interface should only ever know about the interface. It should not know about any of the specific classes that implement the interface. Therefore, finally I can run either FakeQueryEngine or WikipediaQueryEngine by using the interface queryEngien but not themselves. 

