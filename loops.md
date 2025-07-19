loops:-
loops are used to reapet a block of code multiple times until a certain condition is met.


1.for loop:-
used when you know how many times to loop

e.g.,for(let i=1; i<=5; i++) {
    consol.log("number:",i);
}

2.while loop:-
used when the number of iterations is not fixed and depends on a conditions.

e.g., let i=1;
      while(i<=5) {
        consol.log("while loop:",i);
              }

3.do..while loop:-
runs the code at least once,even if the condition is false

e.g., let i=6;
      do{
        consol.log("do while loop:",i);
        i++;
              } while (i<=5>);

4.nested if..else:-
it means writing an if..else block inside another if..else. this is used when you need to check multiple levels of conditions.

e.g., if (condition1) {
      if (condition2) {
      }else{

      }
      }else{

      }