
/*
1. A method must do either of two things with a checked exception. What are those two things?
a. Handle the exception in a catch{}block
b. throw the exception to the caller of the method
{exception handling in java is one of the powerful mechanism to handle the runtime errors so that normal
flow of the application can be maintained. exception is an abnormal condition, its disrupt the normal flow
of the program such as ClassNotFoundException, IOException, SQLException, RemoteException, etc}

2. What happens during execution if a negative value is used for an array index?
>>If a negative value is used for an array index, then the IndexOutOfBoundsException() class is
performed during execution of the program. This function takes a string as its input parameter and
returns the message to be displayed. If no input parameter is specified, then no message is displayed.

3. Say that a method catches an IOException in a catch{ } block. Is it possible for that block to
do some processing and then throw the same exception to the caller?
>> Yes---as long as the method also has a throws clause for that exception.

4. What method of an Exception object returns a message string?

5. You are writing a program to check people into a hotel. People over 65 get a 10 percent discount. How would you write the program?

6. What method of an Exception object prints a list of methods that were called before the exception was thrown?

7. What is the only type of exception that is NOT checked?

8. methodX() encountered an IOException and an SQLException but handles neither. How should the signature for methodX() be written?

9. Say that methodA() calls methodB(), and methodB() calls methodC(). methodC() might throw a NumberFormatException. Can the program be written so that methodA() handles the exception? How?

10. What exception will be thrown from the following block of code?

try {       throw new TryException(); } catch {       throw new CatchException(); } finally {       throw new FinallyException(): }
11. What will be the output of the following program?

public class X {      public static void main(String [] args){            Try{              bad Method();               System.out.print("A");        }        catch (Exception ex){              System.out.print("B");        }        finally{              System.out.print("C");        }        System.out.print("D");      }
      public static void badMethod(){        throw new RuntimeException();      } }
12. What will be the output of the following program?

public class X{      public static void main(String [] args){      try{             bad Method();              System.out.print(“A"); }           catch (Exception ex){                  System.out.print("B");           }     finally{           System.out.print("C");     }     System.out.print("D");     }
     public static void badMethod( ){     throw new Error( );     } }
13. What will be the output of the following program?

public class Foo{ public static void main(String[] args){      try{      return; } finally{      System.out.println("Finally"); }      } }
14. What will be the output of the following program?

public class Test{      public static void a Method throws Exception{ try{     throw new Exception(); } finally{     System.out.print("finally “); }      }           public static void main(String args[]){ try{     aMethod(); } catch (Exception e){     System.out.print("exception "); } System.out.print(“finished");     } }
15. What will be the output of the following program?

try{      int x = 0;      int y = 5/x; } catch (Exception e){      System.out.println("Exception"); } catch (ArithmeticException e){      System.out.println(" Arithmetic Exception"); } System.out.println(“finished");
16. What will be the output of the following program?

public class X{     public static void main(String [] args){ try{      badMethod();      System.out.print("A"): } catch (RuntimeException ex){     System.out.print("B"); } catch (Exception ex1){     System.out.print("C"); } finally{     System.out.print("D"); } System.out.print("E"):     }
     public static void badMethod(){ throw new RuntimeException();     } }

 17. What will be the output of the following program?

public class RTExcept{     public static void throwit(){     System.out.print(“throwit: ");      throw new RuntimeException();     }      public static void main(String [] args){      try{                System.out.print("hello ");        throwit();          }          catch (Exception re){           System.out.print("caught ");          }           finally{     System.out.print("finally ");          }          System.out.println("after");     } }
18. What Exception will the following code throw:

float num = 5/0;

19. We know that the method printStackTrace() of an exception prints the stack of methods that were called when that exception occurred. What stack trace will be printed after calling method1()in the following program?

public void method1 throws Exception {       method2(); } public void method2() throws Exception {       throw method3() } public Exception method3() {       return new Exception(); }
20. How many finally{} blocks can there be in a try/catch structure?

21. Both class Error and class Exception are children of which parent class?

22. When is a finally{} block executed?

23. From which problems is it possible for a program to recover?

24. What happens in a method if an exception is thrown in a try{} block and there is NO MATCHING catch{} block?

25. What type of exception is thrown by parseInt() if it gets illegal data?

26. Is a program required to catch all exceptions that might occur?



















 */
