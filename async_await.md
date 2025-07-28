-Async and Await:-
async and await are modern ways to handle asynchronous code in JavaScript — introduced in ES8 (2017).

They make your asynchronous code look and behave like synchronous code, which is easier to read, write, and debug.

-async Keyword:-
1.Used before a function to make it return a Promise.
2.Inside an async function, you can use the await keyword.

e.g., async function greet() {
  return "Hello Anu!";
}

greet().then(msg => console.log(msg)); 


-await Keyword:-
1.Can only be used inside async functions.
2.Pauses execution until a Promise is resolved or rejected.

e.g., async function getData() {
  let response = await fetch("https://api.example.com/data");
  let data = await response.json();
  console.log(data);
}

--async:-Makes a function return a Promise.
--await:-Waits for a Promise to resolve before continuing.
