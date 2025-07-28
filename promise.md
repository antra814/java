-Promise:-
a promise is an object in JavaScript that represents the result of an asynchronous operation-which may be completed now,later or never.

-why:-
Before promises, we used callback functions, which often led to callback hell — hard-to-read nested functions. Promises solve that.

-How to create Promise:-
let promise = new Promise(function(resolve, reject) {
  let success = true;

  if (success) {
    resolve("Task done!");
  } else {
    reject("Something went wrong");
  }
});

-Promise has 3 states:-
--pending:- initial state,not fulfilled or rejected.
--fulfilled:-Operation completed successfully.
--rejected:-opearation failed.

-new Promise():-Creates a promise.
-resolve():-Marks it as successful.
-reject():-Marks it as failed.
-.then():-Runs on success.
-.catch():-Runs on failure.


	

