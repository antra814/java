-what is DOM:-
1.DOM stands for Document Object Model.
2.it is a programming interface for web document.
3.it represents the structure of HTML or XML document as a tree of objects,where each element,attribute or piece of text becomes a node in that tree.

e.g., in html
    <html>
         <body>
           <h1 id="title">Hello , DOM!</h1>
        <body>  
    </html>  

    in js
    document.getElementById("title").innerHTML="welcome to DOM!";

-DOM tree structure:
-document is the root of everything.
-inside html:head and body
-inside body:h1,p,div.
-each tag is a node and each text inside tag is also a node called text node.

-types of nodes:
-element node-e.g., <p>,<div>,<ul>.
-text node-e.g., the text inside elements.
-attribute nodes-element attributes like class,id
-comment nodes:comments in HTML
