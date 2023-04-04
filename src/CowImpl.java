import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CowImpl implements Animal{
    private byte age;
    public CowImpl(byte age){
        this.age = age;
    }
    @Override
    public void sound() {
        System.out.println("buu");
    }

    @Override
    public String toString() {
        return "CowImpl{" +
                "age=" + age +
                '}';
    }
    @Override
    public void Save(){
        try {
            FileWriter fw = new FileWriter("file.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("buu");
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
