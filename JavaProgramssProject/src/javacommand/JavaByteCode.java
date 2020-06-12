package javacommand;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class JavaByteCode {

 public static void main(String[] args) throws InstantiationException, IllegalAccessException {
  try {
/*   List<String> cmdList = new ArrayList<String>();
   cmdList.add("C:\\Program Files\\Java\\jdk1.8.0_131\\bin\\javap.exe");
   cmdList.add("-c");
   cmdList.add("C:\\Users\\mrpillai\\git\\JavaPrograms\\JavaProgramssProject\\src\\StringHand.class");
   
   // Constructing ProcessBuilder with List as argument
   ProcessBuilder pb = new ProcessBuilder(cmdList);
   
   Process p = pb.start();
   p.waitFor();
   InputStream fis = p.getInputStream();
   */
	  StringHandling str = new StringHandling();
	  JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
	  // Compiling the code
	  int result = compiler.run(null, null, null, 
	     "C:\\Users\\mrpillai\\git\\JavaPrograms\\JavaProgramssProject\\src\\StringHandling.java");
	  System.out.println("result " + result);
	   
	  File classesDir = new File("C:\\Users\\mrpillai\\git\\JavaPrograms\\JavaProgramssProject\\src");
	  // Load and instantiate compiled class.
	  URLClassLoader classLoader;

	  // Loading the class 
	   classLoader = URLClassLoader.newInstance(new URL[] { classesDir.toURI().toURL() });
	   Class<?> cls;
	   
	   cls = Class.forName("javacommand.StringHandling", true, classLoader);
	  System.out.println("class:"+cls.getClass());
	  System.out.println("name:"+cls.getName());

	  System.out.println("canonical:"+cls.getCanonicalName());
	  System.out.println("classloader:"+cls.getClassLoader());
	  System.out.println("mthd:"+cls.getMethods());
	 System.out.println("resoue:"+cls.getAnnotations());
	 System.out.println("classes:"+cls.getClasses());




	  javacommand.StringHandling instance = (javacommand.StringHandling)cls.newInstance();
	   instance.main(args);;
	  

	  
	  
	  System.out.println("oyh");
	  List<String> cmdList = new ArrayList<String>();
	   cmdList.add("C:\\Program Files\\Java\\jdk1.8.0_131\\bin\\javac.exe");
	   cmdList.add("--version");
	  cmdList.add("C:\\Users\\mrpillai\\git\\JavaPrograms\\JavaProgramssProject\\src\\StringHandling.java");
	   
	   // Constructing ProcessBuilder with List as argument
	   ProcessBuilder pb = new ProcessBuilder(cmdList);
	   
	   Process p = pb.start();
	   p.waitFor();
	   InputStream fis = p.getInputStream();
	 
   DisplayClassStructure(fis);
  } catch (InterruptedException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
  } catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 }
 
 // Method used for displaying the disassembled class
 private static void DisplayClassStructure(InputStream is){
  
  InputStream stream;
  
  try {
   
   BufferedReader reader = new BufferedReader(new InputStreamReader(is));
   String line;   
   while ((line = reader.readLine()) != null) {   
        System.out.println(line);   
   }
   // Better put it in finally
   reader.close();
  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}
