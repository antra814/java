-callback function:-
    a callback function is a function passed as an argument to another function and it is executed after the completion of that function.

-Why callback function:-
1.to control the sequence of code execution.
2.to perform an action after a task finishes.

-e.g., function greet(name,callback) {
          consol.log("Hi"+name);
          callback();
}
        function sayBye() {
            consol.log("GoodBye");      
              }
              geet("Anu",sayBye);

-common use cases:-
-asynchronous tasks like:
1.API calls
2.Timers (setTimeout, setInterval)              
3.Event handling (addEventListener)
-Functional programming (map, filter, forEach)