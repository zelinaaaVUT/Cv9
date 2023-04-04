import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CatImpl implements Animal{
    private byte age;
    public CatImpl(byte age){
        this.age = age;
    }
    @Override
    public void sound() {
        System.out.println("mňau");
    }

    @Override
    public String toString() {
        return "CatImpl{" +
                "age=" + age +
                '}';
    }
    @Override
    public void Save(){
        try {
            FileWriter fw = new FileWriter("file.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("mňau");
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
