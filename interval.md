-SetInterval:-
setInterval() is a built-in JavaScript method used to repeatedly execute a function at a fixed time interval (in milliseconds).

-syntax:
setInterval(function, delay, param1, param2, ...);

--function – The function to execute.

--delay – The time interval between each call (in milliseconds).

--param1, param2, ... – Optional values passed to the function.

e.g., setInterval(function() {
  console.log("This message repeats every 2 seconds");
}, 2000);

-how to cancle setInterval():
Use clearInterval() with the interval ID.

e.g., let intervalId = setInterval(() => {
  console.log("Running...");
}, 1000);