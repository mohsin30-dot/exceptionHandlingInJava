
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

3. Say that a method catches an IOException in a catch{ } block.
Is it possible for that block to do some processing and then throw the same exception to the caller?

>> Yes---as long as the method also has a throws clause for that exception.

4. What method of an Exception object returns a message string?>> getMessage()

5. You are writing a program to check people into a hotel.
 People over 65 get a 10 percent discount. How would you write the program?
 >> Normal  if else programming language will be use

6. What method of an Exception object prints a list of methods that were called before the exception
was thrown? - printStackTrace()

7. What is the only type of exception that is NOT checked?
>>Class RunTimeException and its subclasses.

8. methodX() encountered an IOException and an SQLException but handles neither.
How should the signature for methodX() be written?
>> ... methodX(...) throws IOException, AWTException

9. Say that methodA() calls methodB(), and methodB() calls methodC(). methodC() might throw
a NumberFormatException.Can the program be written so that methodA() handles the exception? How?
 >>Yes, if the headers for methodC and methodB say ...throws NumberFormatException

 10. What exception will be thrown from the following block of code?
try{  throw new TryException(); }
catch {      throw new CatchException(); }
finally {       throw new FinallyException(): }

>>> Output: FinallyException

In the try block, an exception was thrown and the catch block handled the exception perfectly.
So that, the program will compile without any problem. Finally the “finally” will be executed.
No matter what happens in the try-catch block, “finally block” will always be executed.


11. What will be the output of the following program?

public class X {public static void main(String [] args)
{ Try { bad Method(); System.out.print("A");}
catch (Exception ex){System.out.print("B");}
finally{ System.out.print("C");} System.out.print("D");}
public static void badMethod(){throw new RuntimeException();} }

>>> Output: BCD

Explanation:

(a) A RuntimeException is thrown, this is a subclass of exception.

(b) The exception causes the try to complete abruptly in bad method() under the try block. Therefore System.out.print(“A”) is never executed.

(c) The exception is caught in catch block and "B" is output

(d) The finally block is always executed, no matter what happens in the try and catch block and "C" is output.

(e) The exception was caught, so the program continues further and outputs "D".


12. What will be the output of the following program?

public class X{public static void main(String [] args)
{try{ bad Method();System.out.print(“A"); }
catch (Exception ex){ System.out.print("B") }
finally{System.out.print("C");}
System.out.print("D");     }
public static void badMethod( ){
    throw new Error( );     } }

>>>Output: C is printed with an error message.

Explanation:

Error is thrown, but not recognised by the catch block,
 because it attempts to catch an Exception and Exception is not a superclass of Error.
 Exception is a subclass of throwable. Therefore only the code in the “finally statement” can be run,
 before exiting with a runtime error (Exception in thread "main" java.lang.Error).
 The “finally statement” will always be executed, no matter what happens in the try and catch block.

13. What will be the output of the following program?

public class Foo{ public static void main(String[] args){
    try{      return; } finally{
       System.out.println("Finally"); }      } }

>>> Output: Finally

Explanation: The "return;" statement in the try block has to send the control back
 to the calling method (main) without returning any value (because it is allowed only in void methods).
 So without searching for catch blocks control going to the calling method.
 If we put a finally block after a try and its associated catch blocks,
 then once execution enters the try block,
 the code in that finally block will definitely be executed no matter what happened beforehand.

14. What will be the output of the following program?

public class Test{
public static void a Method throws Exception{
try{     throw new Exception(); } finally{
    System.out.print("finally “); }      }           public static void main(String args[]){
     try{     aMethod(); } catch (Exception e){
      System.out.print("exception "); } System.out.print(“finished");     } }

>>>>Answer: finally exception finished

Explanation:

This is what happens:

(a) aMethod was called in the try block of the main method.
That brings to the “aMethod” method. The execution of the try block (inside aMethod) completes abruptly because of the throw statement.

(b) The exception cannot be handled as there is no Catch block.
Therefore the finally block is executed and "finally" is the first output..

(c) The exception is propagated up the call stack and is caught by the catch in the main method.
This prints "exception".

(d) Lastly program execution continues, because the exception has been caught, and "finished" is output.

15. What will be the output of the following program?

try{      int x = 0;      int y = 5/x; } catch (Exception e){
     System.out.println("Exception"); } catch (ArithmeticException e){
          System.out.println(" Arithmetic Exception"); } System.out.println(“finished");

>>>Output: Compilation fails.

Explanation: Compilation fails because ArithmeticException has already been caught inside the try block.
 ArithmeticException is a subclass of java.lang.Exception,
  by the time the ArithmeticException has been specified it has already been caught by the Exception class.

If ArithmeticException appears before Exception, then the file will compile.
When catching exceptions the more specific exceptions must be listed before the more general
(the subclasses must be caught before the superclasses).

16. What will be the output of the following program?

public class X{     public static void main(String [] args)
{ try{      badMethod();      System.out.print("A"): } catch (RuntimeException ex)
{     System.out.print("B"); } catch (Exception ex1){     System.out.print("C"); }
finally{     System.out.print("D"); } System.out.print("E"):     }
     public static void badMethod(){ throw new RuntimeException();     } }

>>>Output: BDE

Explanation:
A Runtime exception is thrown and caught in the first catch statement.
Then the next catch statement is not executed. As the exception has been caught,
so that the code after the finally statement has been executed perfectly (including the finally statement).


 17. What will be the output of the following program?

public class RTExcept{     public static void throwit()
{     System.out.print(“throwit: ");      throw new RuntimeException();
    }      public static void main(String [] args)
    {      try{                System.out.print("hello ");        throwit();          }
              catch (Exception re){           System.out.print("caught ");          }
                        finally{     System.out.print("finally ");          }
                              System.out.println("after");     } }

>>>> Output: hello throwit: caught finally after

Explanation:
The main() method properly catches and handles the RuntimeException in the catch block,
finally runs (as it always does), and then the code returns to normal.

18. What Exception will the following code throw:
float num = 5/0;

19. We know that the method printStackTrace() of an exception prints the stack
of methods that were called when that exception occurred.
What stack trace will be printed after calling method1()in the following program?
public void method1 throws Exception
 {       method2(); } public void method2() throws Exception
  {       throw method3() } public Exception method3()
  {       return new Exception(); }

  >>
20. How many finally{} blocks can there be in a try/catch structure?
>> There can be zero or one, following the last catch{} block.

21. Both class Error and class Exception are children of which parent class?
>> Throwable

22. When is a finally{} block executed?
>> The finally block always executes when the try block exits.
This ensures that the finally block is executed even if an unexpected exception occurs.
But finally is useful for more than just
exception handling — it allows the programmer to avoid having cleanup code accidentally
bypassed by a return,continue, or break.
Putting cleanup code in a finally block is always a good practice, even when no exceptions are anticipated.

23. From which problems is it possible for a program to recover?
>> Exceptions

24. What happens in a method if an exception is thrown in a try{} block and there is
NO MATCHING catch{} block?
>>  The method throws the exception to its caller, exactly if there were no try{} block.

25. What type of exception is thrown by parseInt() if it gets illegal data?
>> NumberFormatException

26. Is a program required to catch all exceptions that might occur?
>>  No. You can write a program to catch just the exceptions you want.



















 */
