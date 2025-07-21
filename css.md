# java_batch
# java_batch 
1.introduction to css(cascading style sheet)
2.how to style web page
    there are 3 ways of styling:
    1.External
    2.internal
    3.inline
    we need to use "link" tag for linking style sheet to the main index file.

3.how to change font style as per our choice:
    1.Your Default Font can be Different Based on your OS and Browser Being Used 
    2.to change font:
       -open google
       -search google fonts
       -choose font as per choice
       -get the font
       -get embedded code
       -copy code from import
       -paste it in the style sheet without style tag
       -edit font family and font weight 
       -save and run.

4.how to change colors:
if we want to change the color,Use "color" property to change the color of text  
   eg:-
   ./# class/id name{
    color:red;
   }
if we want to change background color,Use "background color" property
   eg:-
   ./# class/id name{
    background color:red;
   }

5.what are selectors:
 A css selectors tells the browser which html elements to apply styling too.
    there are 3 types of selectors:-
   1.ID selector-indicates with symbol "#" (hash)
   2.Class selectors-indicates with symbol "." (dot)
   3.Universal selector-indicates with symbol "*" (star)
   4. id vs Classes:
 id --> less Used  --> Dont Use Same id Twice on One Page.
 class --> most Used --> Classes Can be used multiple times.
   
6. Utility Classes(pre-made classes for multi use):

7.Attributes  selectors:-
   -how to create Form page:
    <form>
        <label for="fname">First Name : </label><br>
        <input type="text" id="fname"> <br>
        <label for="lname">Last Name : </label><br>
        <input type="text" id="lname"> <br>
        <label for="pass">password : </label><br>
        <input type="password" id="pass"> <br> <br>
        <input type = "button" value="submit">
    </form>
   -how to style this:
   open style.css file and give color,background color,font,font size as per your choice.

 8.CSS specificity:-
 CSS specificity is a system used by the browser to decide which CSS rule should be applied when multiple rules target the same HTML element

 e.g., p{
     color:blue;
 }
      .text{
         color:green;
      }
      #main{
         color:red;
      }
   <p style="color: orange;">hello</p>
   in the above example the final color is orange because inline styles have the highest specificity.


9.CSS border:-
for e.g. we have to craete the page on which we want to add image,paragraph,and use of border.
    1.make a style tag and give name and position as per choice resp.
    2.with the help of img tag add image.
    3.then add paragraph in a p tag.
    4.style it as per choice.

    Span tag:
    the span tag is an inline level container in HTML used to apply styles,classes,id or scripts to a specific piece of content without breaking the flow of text

10.CSS box-model:-
we use box-model for creating box for the text
every HTML element is treated as a box and this box has four layers:

1.content-the actual text,image or element
e.g.,width,height

2.padding-space inside the box,between content and border
e.g.,padding: 10px;

3.border-edge around the padding/content
e.g., border: 2px solid black;

4.margin-space outside the box,between this element and others
e.g., margin: 20px;

11.margin collapsing:-
in this style method when two vertical margins meet, and instead of adding up, only the larger one is used.

e.g.,HTML
     <div class="box1"></div>
     <div class="box2"></div>
      
     CSS
     .box1{
      margin-bottom:40px;
      height:100px;
      background:red;
     } 
     .box2{
      margin-top:30px;
      height:100px;
      background:blue;
     }
   in the above code, the larger margin will be considered
   margin collapse to avoid unnecessary extra space and to keep vertical spacing consistent and clean.  

   12.image element:-
   in this styling method we can apply border to the image.
   e.g, 1.in the Html file use img tag and add images.
        2. in the Css file set:
           1.border
           2.display flex
           3.margin
           4.padding etc.

    13.inline block display:-
    e.g., 1.in the Html file make an anchor tag and add links
          2.in the Css file target anchor tag and style it.give display,margin,border,padding,width and height.


    14.box sizing border box:-
    The <hr> tag defines a thematic break in an HTML page (e.g. a shift of topic).
     The <hr> element is most often displayed as a horizontal rule that is used to separate content (or define a change) in an HTML page.
         1.make two classes in HTML file and add a random paragraph.
         2.in CSS file, style it.
    
    15.CSS inheritance:-
    CSS inheritance means that some CSS properties are passed down from a parent element to its child elements automatically.

    e.g.,Html file
         <div style="color: blue;">
         <p>this text is blue because it inherits from the parent</p>
         </div>

         Css file
         .child{
            border: inherit;
            background-color: inherit;
         }

    16.text align:-
    the text align property in CSS is used to control the horizontal alignment of text within a block-level element.  

    17.font weight:-
    the font-weight property in CSS is used to control the thickness of text.

    e.g., CSS file
          p{
            font-weight:bold;
          }   
          h1{
            font-weight:900px;
          }
          span.light{
            font-weight:300px;
          }

     18.   pseudo classes:- 
          pseudo classes are keywords in CSS that target elements based on their state, position or interaction not by name or class. they are written with a colon before the name.

          e.g.,selector:pseudo-class{
            /style
          }  

      19.CSS units:-
         units defines the size,spacing,position and layout of element
            there are two types of units

            1.absolute units:-px,cm,mm,in,pt are mostly used for print or fixed designs
            2.relative units:-%,em,rem,vw,vh,vmin,vmax are the most used to make your site responsive.

      20.em,rem:-
      InCase font-size: Use rem
       InCase font-size: if px are used More media queries Required to be responsive.

       1em=16px
       1rem=16px  

      21.viewport units:-
      it let you size elements relative to the users screen. the viewport is the visible area of a web page in the browser window
      types of viewport units:-
      1.vw-viewport width
      2.vh-viewport height
      3.vmin-viewport minimum
      4.vmax-viewport maximum   

      22.CSS floats:-
      the float property in css is used to push an element to the left or right, allowing text and inline elements to wrap around it

      float values:-
      1.left
      2.right
      3.none
      4.inherit  

      23.animation:-
      CSS animation allows you to create smooth transitions and motion effects without javascript.we can animate properties like position,color,size,opacity.

      some properties of animation:-
      1.animation-name
      2.animation-duration
      3.animation-delay
      4.animation-iteration-count
      5.animation-direction
      6.animation-timing-function

      24.CSS flex box:-
      flexbox in css is used to create responsive and flexible layouts without floats or positioning.it makes aligning and distributing space super easy

      flex terminology:-
      1.flex container
      2.flex items
      3.main axis
      4.cross axis

      key properties:-
      1.flex-direction-defines main axis direction.

      2.justify-content-controls how are spaced horizontly.

      3.align-items-aligns items vertically.

      4.flex-wrap-allows items to wrap to next line if needed.

      5.flex-tells the item how much to grow,shrink or stay fixed

      25.grid:-
      CSS drid lets you design 2D layouts with ease.its powerful,clean and made for building responsive web.

      key properties:-
       1.grid-template-columns-defines how many columns and their widths.

       2.grid-template-rows-defines the height of rows.

       3.gap-adds spacing between rows and columns

       4.grid-row
       5.grid-column
       6.grid-area

      26.media queries:-
      media queries in CSS allows your web to adapt to different screen sizes and devices like mobiles,tablets and desktops

      basic syntax:
      @media (condition){
         /CSS rules
      } 

      27.transforms:-
      the transform property in CSS lets you visually manipulate an element in 2D or 3D space without changing the document flow.

      some common functions:-
      1.translate
      2.scale
      3.rotate
      4.skew
      5.matrix.
