/**
 * title: MyPooledWebLog.java
 * description: 
 * date: November, 12th 2022
 * @author Andrew Mackay
 * @version 1.0
 * @copyright Andrew Mackay
 */

/**
 * DOCUMENTATION...
 *  I declare that this assignment is my own work and that all material previously written or published in any source by any other person has been duly acknowledged in the assignment. 
 * I have not submitted this work, or a significant part thereof, previously as part of any academic program. 
 * In submitting this assignment I give permission to copy it for assessment purposes only.
 */

/**                                                                               
 *
 *<H1> Pooled Web Log </H1>
 *
 *<H3> Purpose and Description </H3>
 *
 *<P>
 *This program parses a log file and returns results based on the accesses and bytes of the remotehost.
 *</P>
 *<P>
 *</P>
 *                                                                              
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming SDK 1.3 (or later) and the CLASSPATH are set up properly.</DT>
 *<DT> cd (change directory) to file folder containing the file</DT>
 *<DD> Compile:    javac MyPooledWebLog.java</DD>
 *<DD> Run:        java MyPooledWebLog</DD>
 *<DD> Document:   javadoc GoodDocs.java</DD>
 *</DL>
 */

/**
 * CODE...
 */



import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;



public class MyPooledWeblog {


  private final static int NUM_THREADS = 10;
  
  public static void main(String[] args) throws IOException {
    ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
    Queue<LogEntry> results = new LinkedList<LogEntry>();

    HashMap<String, Integer> hostAccesses = new HashMap<String, Integer>();
    HashMap<String, Integer> hostBytes = new HashMap<String, Integer>();
    int totalBytes = 0;
   
    
    if(args.length < 2 || !(args[1].equals("1") || args[1].equals("2") || args[1].equals("3"))) {
      if(args.length <1){
        System.out.println("log file not specified");
    } else {
        System.out.println("Invalid Entry");
    }
      System.out.println("Usage: MyPooledWebLog access_log option");
      System.out.println("Options:");
      System.out.println("1 - Accesses by each remotehost");
      System.out.println("2 - Total bytes transmitted");
      System.out.println("3 - Bytes transmitted by remotehost");
      System.exit(0);

    } else {
      System.out.println("Processing"+args[0]+"...");
    }




    try (BufferedReader in = new BufferedReader(
      new InputStreamReader(new FileInputStream(args[0]), "UTF-8"));) {
      for (String entry = in.readLine(); entry != null; entry = in.readLine()) {
        LookupTask task = new LookupTask(entry);
        Future<String> future = executor.submit(task);
        LogEntry result = new LogEntry(entry, future);
        results.add(result);
      }
    }
  

    // Start printing the results. This blocks each time a result isn't ready.
    for (LogEntry result : results) {
      String line;
      try {
        line = result.future.get();
        
      } catch (InterruptedException | ExecutionException ex) {
        line = result.original;
       
      }
    
  //option1
  int index = line.indexOf(' ');
  String address = line.substring(0, index);
  
  if (hostAccesses.containsKey(address)){
    hostAccesses.put(address, hostAccesses.get(address)+1);
  }else {
    hostAccesses.put(address, 1);
  }
  
  String lineBytesStr = line.replaceAll(".*\\s(\\d+))", "$1");
  try{
    int lineBytes = Integer.parseInt(lineBytesStr);
    totalBytes += lineBytes;

    if (hostBytes.containsKey(address)){
      hostBytes.put(address, hostBytes.get(address)+lineBytes);
    }else{
      hostBytes.put(address, lineBytes);
    }

  } catch(NumberFormatException ex) {}
  
    }
  
if (args[1].equals("1")) {
    System.out.println("Accesses for each host:");
     Set addressSet = hostAccesses.entrySet();
     Iterator it = addressSet.iterator();
    while(it.hasNext()) {
      Map.Entry ment = (Map.Entry)it.next();
      System.out.println(" Accesses: " + ment.getValue()+ "\t"+ ment.getKey());
    }
  }  
    
  //option2
    else if (args[1].equals("2")){
      System.out.println("\nTotal bytes transmitted: "+ totalBytes);
  }


//option 3
else if(args[1].equals("3")) {
  System.out.println("Bytes transferred to each host:");
  Set addressBytesSet = hostBytes.entrySet();
  Iterator itb = addressBytesSet.iterator();
  while(itb.hasNext()){
    Map.Entry mentb = (Map.Entry)itb.next();
    System.out.println(" Bytes: " +mentb.getValue()+ "\t"+ mentb.getKey());
  }
   
}
  
executor.shutdown();
  }
    
  private static class LogEntry {
    String original;
    Future<String> future;
  
    LogEntry(String original, Future<String> future) {
    this.original = original;
    this.future = future;
      }
    }
  }


