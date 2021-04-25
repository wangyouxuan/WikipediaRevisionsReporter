# Project Report

Youxuan Wang 


## Challenge #1 Complete

I made changes the code bind(QueryEngine.class).to(FakeQueryEngine.class) to bind(QueryEngine.class).to(WikipediaQueryEngine.class). Since the first default application configuration uses FakeQueryEngine to simulate the network, I only need to change it to FakeQueryEngine so that the application uses the real WikipediaQueryEngine instead.

## Challenge #2 Complete

Because the default presentation of the datetime results is not very attractive,  I created another class named NewRevisionFormatter, and created a new time formatter which is localDateTime with a changed patter"dd-MM-yyyy HH:mm:ss" which is more attractive. Then, I introduced a new interface Formatter that is implemented by these two formatters, the NewRevisionFormatter and RevisionFormatter. In order to show the new time formatter in the UI, I created a Formattermodule that injects the correct dependency at runtime, and added the Formattermodule to the Guice injector. Finally, because the formatter is still RevisionFormatter in WikipediaAnalyzer, I changed RevisionFormatter to NewRevisionFormatter, and it could run successfully. 

## Challenge #3 Complete

I called stream() on the list and useed higher-order functions to replace the for loop. To be specific, in runQuery function of class WikipediaAnalyzer, I called stream() to represent a sequence of objects in response.revisions(). Then, using  :: operator in map(), I get the format in formatter. Finally, I used collect( Collectors.joining()) to repack them and connect with each other. Becaseu this allows to use string, so I made the variable String output, and set it in setText().

## Reflection Question #1: Functional vs OO

(Write one or more paragraphs comparing and contrasting the iterative and functional  
approaches to string concatenation you explored in challenge #3. Which do you
prefer, and why?)
The iterative and functional approches can both run the prgram successfully, and both of them are easy to understand and create. However, I prefer the fuctional approches. In fact, in challenge 3, I only used one line to finish the for loop iteration which occupied for five lines. And in the progress of creating the code, I just needed to add new things in the call, like using map() and collect(). Besides, What I know there is a call named filter(), and it is easy and convinient for programmers to add new data and functions in it, with only one line. Due to the convineince of adding new data, I like to use it. But for the iterative approches, though it uses many code and lines to implement, it uses some variables and functions making programmers more easy 

## Reflection Question #2: Polymorphism and Dependency Inversion

(Explain how polymorphism engendered dependency inversion in this little
application. Be clear and precise here, as this is, in part, an assessment of
your correct use of technical terminology.
Consider, for example, where exactly is polymorphism used?
Where exactly is a dependency inverted?)

