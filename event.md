-What are Events in JavaScript?
An event is an action or occurrence that happens in the browser — such as:

-Clicking a button

-Moving the mouse

-Pressing a key

-Submitting a form

-Page loading

-types of events:-

1.Mouse events:

-click:	Fires when an element is clicked

-dblclick: Fires when an element is double-clicked

-mousedown:	Fires when the mouse button is pressed

-mouseup: Fires when the mouse button is released

-mouseover:	Fires when the mouse enters an element

-mouseout: Fires when the mouse leaves an element

-mousemove:	Fires when the mouse moves within an element

-contextmenu: Fires when right-click is pressed (shows context menu)

2.Keyboard Events:

-keydown: Fires when a key is pressed down

-keyup:	Fires when a key is released

-keypress	(Deprecated) Fires when a key is pressed (for character keys on)

-addEventListener():
addEventListener() is a method used to attach an event handler to an element — meaning you tell JavaScript what to do when something (an event) happens.

-Syntax:
element.addEventListener(event, callback, useCapture);

event: The type of event ("click", "submit", "keydown" etc.)

callback: The function to run when the event happens

useCapture:	Boolean (default is false). Set to true for capturing phase


-Why use addEventListener()?

1.Allows multiple events on the same element

2.Keeps HTML and JS separate

3.Supports event capturing and bubbling

4.Cleaner and modular code

-<button id="btn">Click me</button>

<script>
  const button = document.getElementById("btn");

  button.addEventListener("click", function () {
    alert("Button clicked!");
  });
</script>







