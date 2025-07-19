conditional statements:-
 conditional statements are used to perform different actions based on different conditions. they help your code make decisions.

 types of conditional statements:-

 1.if 
 executes a block of code only if a condition is true.

 e.g., let age=18;
       if (age>=18) {
        consol.log("you are an adult");
       }

2.if..else
executes one block if the condition is true, another if false.

e.g., let time=20;
      if (time< 18) {
        consol.log("good day");
      }else{
        consol.log("good evening");
      }

3.if..else if..else
checks multiple condition in order

e.g., let marks=85;
      if (marks>=90){
        consol.log("grade A");
      }else if (marks>=75) {
        consol.log("grade B");
      }else {
        consol.log("grade C);
      }

4.switch statement
used to test multiple values for a single variable

e.g., let day=3;
      switch (day) {
        case 1:
        consol.log("monday");
        break;

        case 2:
        consol.log("tuesday");
        break;

        case 3:
        consol.log("wednesday");
        break;

        default:
        consol.log("invalid");
      }
