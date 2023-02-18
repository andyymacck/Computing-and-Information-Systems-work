/**
 * title: SourceViewer.java
 * description: 
 * date: November, 12th 2022
 * @author Andrew Mackay
 * @version 1.0
 * @copyright Andrew Mackay
 */

/**
 * DOCUMENTATION...
 * 
 * I declare that this assignment is my own work and that all material previously written or published in any source by any other person has been duly acknowledged in the assignment. 
 * I have not submitted this work, or a significant part thereof, previously as part of any academic program. 
 * In submitting this assignment I give permission to copy it for assessment purposes only.
 */

/**                                                                               
 *
 *<H1> Source Viewer </H1>
 *
 *<H3> Purpose and Description </H3>
 *
 *<P>
 * Web server variation of Grep in Java
 *</P>
 *<P>
 * Is meant to take a URL in command line and and searches for a string or pattern within the given URL. 
 *</P>
 *                                                                              
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming SDK 1.3 (or later) and the CLASSPATH are set up properly.</DT>
 *<DT> cd (change directory) to file folder containing the file</DT>
 *<DD> Compile:    javac SourceViewer.java</DD>
 *<DD> Run:        java SourceViewer</DD>
 *<DD> Document:   javadoc GoodDocs.java</DD>
 *</DL>
 */








import java.io.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class SourceViewer {

    public static void main (String[] args){
        if(args.length >= 1) {
            InputStream in = null;
            Pattern ptn = null;
            String encoding = "ISO-8859-1";
            if (args.length > 1){
                ptn = Pattern.compile(args[1]); //args[1] 
            }try {
            URL u = new URL(args[0]);// args[0] is the second command line argument in contrast to main string args
            in = u.openStream();
            Reader r = new InputStreamReader(in);
            in = new BufferedInputStream(in);
            int c;
           
            StringBuilder sb = new StringBuilder(); //string builder is instantiated, and chosen in preference of StringBuffer 
            int lineNumber = 0;
            while ((c = r.read()) != -1)  {
                if (c == 10) continue;
                else if (c == 13){
                    lineNumber++;
                    if (args.length > 1){
                        Matcher m = ptn.matcher(sb);//pattern matcher is paired with the string builder
                        if (m.find()){
                            System.out.println(lineNumber+":\t"+sb);
                        }
                    } else {
                        System.out.println(sb);
                    }
                    sb.setLength(0);
                }else {
                    sb.append((char)c);
                }
            }     
       
         System.out.print(sb);
        }catch (MalformedURLException ex) {
            System.err.println(args[0] + " Cannot parse URL");
        } catch (UnknownHostException ex) {
            System.err.println(args[0]+ " Cannot find URL.");
        } catch (IOException ex){
            System.err.println(ex);
        } finally {
            if (in != null)
            try{
                in.close();
            } catch (IOException e) {

            }
         }
    }else{
        System.out.println("error");
            }
        }
    }



                
       
    
