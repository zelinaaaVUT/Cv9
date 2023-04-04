import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GoatImpl implements Animal{
    private byte age;
    public GoatImpl(byte age){
        this.age = age;
    }
    @Override
    public void sound() {
        System.out.println("mee");
    }

    @Override
    public String toString() {
        return "GoatImpl{" +
                "age=" + age +
                '}';
    }
    @Override
    public void Save(){
        try {
            FileWriter fw = new FileWriter("file.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("bee");
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
