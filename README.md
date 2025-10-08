[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)

Group members:

Kyle Siwazalian 100922895
Kaira Subramaniam 100920227
Mesoma Onumaegbu 100827675


Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

Question 1:
Swing is a GUI toolkit for Java. The JFC library extends AWT and offers about four times the number of UI components. While it includes standard components such as buttons, checkboxes, and labels, it also introduces new elements like scroll panes, trees, tables, and lists. Its heavy customizability, lightweight components, and rich controls make Swing a favourable toolkit to implement. Swing fits with MVC architecture: each visual component has three aspects—the way it appears when rendered, the way it reacts to user interaction, and the state information it maintains.


<img width="722" height="723" alt="image" src="https://github.com/user-attachments/assets/a6c13b1c-f5d3-4bb4-9cd2-0ac892894960" />

Question 2:
The example utilizes the swing framework and implements the MVC pattern. The Model.java file is responsible for storing the name that is entered in the field, the View.java file is responsible for displaying the interface by utilizing the swing framework, and the Controller.java file is responsible for connecting the Model.java file and the View.java file; when a user interacts with an entity from the View.java file, like pressing a button for instance, the controller would capture that input, and update the model, and then shows feedback through the view.
It differs from the conventional MVC pattern as discussed in the lectures because 

Question 4: Sequence Diagram of a button press
<img width="1315" height="765" alt="image" src="https://github.com/user-attachments/assets/9dd019de-57bc-4082-b17e-40f73fbbd50e" />
