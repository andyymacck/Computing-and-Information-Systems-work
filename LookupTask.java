/**
 * title: MultiFileHttpServer.java
 * description: 
 * date: December, 16th 2022
 * @author Andrew Mackay
 * @version 1.0
 * @copyright Andrew Mackay
 */

/**
 * DOCUMENTATION...
 * I declare that this assignment is my own work and that all material previously written or published in any source by any other person has been duly acknowledged in the assignment. 
 * I have not submitted this work, or a significant part thereof, previously as part of any academic program. 
 * In submitting this assignment I give permission to copy it for assessment purposes only.
 */

/**                                                                               
 *
 *<H1> MultiFileHttpServer </H1>
 *
 *<H3> Purpose and Description </H3>
 *
 *<P>
 * An application which takes
 *</P>
 *<P>
 * This program uses a Graphical User Interface (GUI) based on Frames to interact with the user.
 * The program includes a text field, and numerous labels to present the user interface.
 * User input is processed when the user presses the ENTER key while the focus is in the
 * input temperature text field.
 *</P>
 *<P>
 * This program uses the Java Swing API for GUI programming, and requires the
 * Sun Java SDK version 1.3 or better.
 *</P>
 *                                                                              
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming SDK 1.3 (or later) and the CLASSPATH are set up properly.</DT>
 *<DT> cd (change directory) to file folder containing the file</DT>
 *<DD> Compile:    javac LoggingServer.java</DD>
 *<DD> Run:        java LoggingServer</DD>
 *<DD> Document:   javadoc GoodDocs.java</DD>
 *</DL>
 */

 /**
 *
 * <H3>Classes</H3>
 *
 *<P>
 * public class GoodDocs extends JFrame {<BR>
 * This is the main public class for this application. It extends (inherits from) JFrame
 * to provide access to Java Swing Frame methods for the GUI.
 *</P>
 *
 *<P>
   private class TextFieldHandler implements ActionListener {<BR>
   Class TextFieldHandler implements ActionListner to provide the event handling
   for this application.  It is a private inner class, which gives it access to 
   all of the GoodDocs instance variables
 *</P>
 *
 * <H3>GoodDocs Methods</H3>
 *
 *<P>
   public GoodDocs() {<BR>
   Constructor for GoodDocs class -  this method is used to set up the GUI
 *</P>
 *<P>
   public static void main(String args[]) {<BR>
   This "main" method is used to execute the application, args specifies the command line argument
 *</P>
 *<P>
   private String convertFtoC(String input) {<BR>
   This method performs the actual conversion from Fahrenheit to Celcius.  The method
   takes input as a String, and returns a String to provide better coordination with
   GUI components, which return or require Strings
 *</P>
 * <H3>TextFieldHandler Methods</H3>
 *
 *<P>
 * public void actionPerformed(ActionEvent event) (<BR>
 * This method is required for an ActionListener to process the events
 *
 * <H3>GoodDocs Instance Variables</H3>
 *
 *<P>
 * private JTextField degreesF; - JTextField to hold input degrees F.
 * private JLabel degreesC; - JLabel to hold output results, degrees C.
 *</P>
 */

/**
 *
 * <H3>Test Plan</H3>
 *
 *<P>
 * 1. Run the application.
 * EXPECTED:
 * Compile and run the server file but specify which port to use when running the program in CMD   

 * ACTUAL:
 * Visual studio code reports no errors, however when compiling and running in CMD there are several..
 * When compiling this program all "Server" and "Socket" instances are error prone with unfound symbols 
 *</P>
 *<P>
 * 2. Good data cases:
 * EXPECTED:

 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 *    Run the following test cases by typing the input value and pressing enter:
 *    'q' -> output should be -17.777777...
 *    (note - this will be true for any non-numeric input)
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 */ 

/**
 * CODE...
 */



import java.util.concurrent.Callable;
import java.net.*;


public class LookupTask implements Callable<String>{
    private String line;
    public LookupTask(String line){
        this.line = line;
    }
    @Override
    public String call(){
    try{
        int index = line.indexOf(' ');
        String address = line.substring(0, index);
        String theRest = line.substring(index);
        String hostname = InetAddress.getByName(address).getHostName();
        return hostname + " " + theRest;
    }   catch (Exception ex) {
        return line;
     }
 }
}  
