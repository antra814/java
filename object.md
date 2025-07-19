-object:-
an object is a data structure used to store related data collections.it stores data as key value pairs,where each key is a unique identifier for the associated value.

there are two ways to create object in JS:-

1.object literal:
e.g., let obj={
      name="antara",
      age=19,
      job="fullstack developer"
};
      consol.log(obj);
     
2.object constructor:-
let obj=new object()
obj.name="antara",
obj.age=19,
obj.job="fullstack developer"
consol.log(obj);

-basic operations on JS objects:

1.accessing object properties:
-we can access an objects properties using either dot natation or bracket notation

let obj={ name:"antara",age:19};

//using dot notation
consol.log(obj.name);

//using bracket notation
consol.log(obj["age"]);

2.modifying object properties:
properties in an object can be modified by reassigning their values.

let obj={name:"antara",age:19};
consol.log(obj);
obj.age=19;
consol.log(obj);

3.adding properties to an object:
you can dynamically add new properties to an object using dot or bracket notation.

let obj={model:"toyota"};
obj.color="red";
consol.log(obj);

4.removing properties from an object:
the delete operator removes properties from an object.

let obj={model:"tesla",color:"red"};
delete obj.color;
consol.log(obj);

5.merging object:
for combined object

let obj1={name:"antara"};
let obj2={age:19};
let obj3={...obj1,...obj2};
consol.log(obj3);
