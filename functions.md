-functions:
functions are reusable blocks of code designed to perform specific tasks.they allow you to organize,reuse and modularize code.
it takes inputs,perform actions and return outputs.

functions sum(x,y){
    return x+y;
}
consol.log(sum(6,9));

-return statement:
a function can return a result using the return keyword.this is optional but useful when you want to send data back from the function.

-calling functions:
after defining a function the next step is to call them/
we can call a function by using the function name separated by the value of parameters enclosed between the parenthesis.

function welcomeMsg(name){
    return("hello"+name+"how are you");
}
let nameVal="user";
consol.log(welcomeMsg(nameVal));

-arrow functions:
arrow functions are a concise syntax for writing functions and they do not bind their own this context.

-syntax:
let function_name=(argument1,argument2,..)=> expression

-callback functions:
a callback function is passed as an argument to another function and is executed after the completion of that function.

function num(n,callback) {
    return callback(n);
}
const double=(n)=>n*2;
consol.log(num(5,double));

-anonymous functions:
anonymous functions are functions without a name.they are often used as arguments to other functions.

-setTimeout(function(){
    consol.log("anonymous function executed");
},1000);

