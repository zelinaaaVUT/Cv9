import java.util.Arrays;

public class Employee {
    private String nickname;
    private String email;
    char[] password;
    enum employeeType {ACTIVE, INACTIVE, DELETED};

    public Employee(String nickname, String email, char[] password){
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public String getNickname(){
        return nickname;
    }
    public String getEmail(){
        return email;
    }
    public char[] getPassword(){
        return password;
    }
    public int compare(Employee a){
        return this.getEmail().compareTo(a.getEmail());
    }

    @Override
    public String toString() {
        return "Employee{" + "nickname='" + nickname + '\'' + ", email='" + email + "'}";
    }
}
