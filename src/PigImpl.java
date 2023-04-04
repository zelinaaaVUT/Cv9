import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PigImpl implements Animal{
    private byte age;
    public PigImpl(byte age){
        this.age = age;
    }
    @Override
    public void sound() {
        System.out.println("oink");
    }

    @Override
    public String toString() {
        return "PigImpl{" +
                "age=" + age +
                '}';
    }
    @Override
    public void Save(){
        try {
            FileWriter fw = new FileWriter("file.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("oink");
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
