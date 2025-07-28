types of callback function:-

1.Synchronous Callback:-
These are executed immediately, in the order they're called — during the execution of the parent function

e.g.,function processUserInput(callback) {
  let name = "Anu";
  callback(name);  
}

function greet(name) {
  console.log("Hello " + name);
}

processUserInput(greet);

- Use Case: Array operations like map, filter, reduce, forEach.

e.g., let arr = [1, 2, 3];
arr.forEach(function(num) {
  console.log(num * 2);
});


2.Asynchronous Callback:-
These run after a task completes, like after a timer, API call, file read, etc.

e.g., with setTimeout:
    function showMessage() {
  console.log("This runs after 2 seconds");
}

setTimeout(showMessage, 2000);


3.Anonymous Callback:
Instead of defining a function separately, you pass it directly as an unnamed (anonymous) function.

e.g.,setTimeout(function() {
  console.log("Anonymous callback running!");
}, 1000);



-SetTimeout:-
setTimeout() is a built-in JavaScript function that allows you to delay the execution of a function by a specific number of milliseconds.

-syntax:
setTimeout(function, delay, param1, param2, ...);

--function – The code to execute after the delay.

--delay – Time in milliseconds (1 second = 1000 ms).

--param1, param2, ... – Optional values passed to the function.

-how to cancle setTimeout():
You can stop the timeout using clearTimeout().

e.g., let timeoutId = setTimeout(() => {
  console.log("You won't see this message.");
}, 3000);

clearTimeout(timeoutId); 

setTimeout(() => {
  clearInterval(intervalId); // after 5 seconds
  console.log("Stopped!");
}, 5000);


--Difference Between setTimeout and setInterval:-
| Feature    | `setTimeout()`   | `setInterval()`  
| Executes   | Once after delay | Repeatedly after delay |
| Stops with | `clearTimeout()` | `clearInterval()` 
