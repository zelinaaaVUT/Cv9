import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DogImpl implements Animal{
    private byte age;
    public DogImpl(byte age){
        this.age = age;
    }
    @Override
    public void sound() {
        System.out.println("haf");
    }

    @Override
    public String toString() {
        return "DogImpl{" +
                "age=" + age +
                '}';
    }
    @Override
    public void Save(){
        try {
            FileWriter fw = new FileWriter("file.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("haf");
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
