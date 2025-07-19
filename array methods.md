
1.push()
add an element at the end of an array 

e.g., let colors=["yellow" , "red", "orange"];
      colors.push("pink");
      cosole.log(colors);

2.pop()
removes the last element from an array

e.g., colors.pop();
      cosole.log(colors);

3.unshift()
adds one or more elements to the start of an array

e.g., colors.unshift("voilet");
      cosole.log(colors);

4.shift()
removes elements to the start of an array

e.g., colors.shift();
      cosole.log(colors);

5.concat()
merge two or more aarays and returns a new array

e.g., let veg=["potato", "okra"];
      let combo=colors.concat(veg);
      cosole.log(combo);

6.slice()
returns a portion of the array without modifying it

e.g., consol.log(colors.slice(0,1));

7.splice()
aads/removes/replace element in the array modifies the original

e.g., colors.splice(1,1,"brown");
      consol.log(colors);

8.filter()
returns the element in the array with modified

e.g., let num=[9,8,7];
      let even=num.filter(n=>n%2===0);
      consol.log(even);

9.map()
creates a new array by applying a function to each element

e.g., let squares = numbers.map(n=>n*n);
      consol.log(squares);

10.forEach()
executes a function for each element

e.g., numbers.forEach(n=>consol.log(n));

11.some()
returns true if any element passes a condition

e.g., consol.log(numbers.some(n=>n>3));

12.sort()  
sorts the element in the array. can be customized with a compare function. 

e.g., let num=[3,2,1];
      consol.log(num.sort());
