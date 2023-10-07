package SimpleRhythmGame;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

// Class used to help debug. Not created by me.

/** 
 * Class which controls System.out prints in console <br/>
 * this class will helps developers to control prints in console
 * @implSpec
 * <pre><code>
 * System.out.println("Default"); //print normally
 * 
 * SysOutController.setSysOutLocationAddressor();
 * System.out.println("With Address"); //prints with calling location
 * 
 * SysOutController.ignoreSysout();
 * System.out.println("Ignored"); //this line will never prints
 * 
 * SysOutController.resetSysOut();
 * System.out.println("Default"); //print normally as it is (reset)
 * </code></pre>
 */
public class SysOutController {

    private static void setOut(OutputStream out){
        System.setOut(new PrintStream(out));
    }

    private static final OutputStream CONSOLE = new FileOutputStream(FileDescriptor.out);

    /**
     * Reset System.out.print* method
     * @author Dharmendrasinh Chudasama
     */
    public static void resetSysOut() { setOut(CONSOLE); }

    /**
     * System.out.print* will not print anything in console
     * @author Dharmendrasinh Chudasama
     */
    public static void ignoreSysout() {
        setOut(new OutputStream() {
            @Override public void write(int b) throws IOException {}
        });
    }

    /**
     * Address/location of calling System.out.* method will append in console
     * @author Dharmendrasinh Chudasama
     */
    public static void setSysOutLocationAddressor() {
        setOut(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                if(b=='\n'){ //if newLine
                    final StackTraceElement callerStEl = new Throwable().getStackTrace()[9];
                    String pathData =
                        "\u001B[37m"    //low-visibality
                        + "\t :: ("+callerStEl.getFileName()+":"+callerStEl.getLineNumber()+") ["+callerStEl+"]"  //code path
                        + "\u001B[0m ";  //reset
                    CONSOLE.write(pathData.getBytes());

                }

                CONSOLE.write(b);
            }
        });
    }
}