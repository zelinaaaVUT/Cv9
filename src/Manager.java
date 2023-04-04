import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private String nickname;
    private String email;
    char[] password;
    //enum employeeType {ACTIVE, INACTIVE, DELETED};
    private List<Employee> listOfEmployees;
    private List<Secretarian> listOfRelationships;

    public Manager(String nickname, String email, char[] password){
        super(nickname, email, password);
        listOfEmployees = new ArrayList<>();
        listOfRelationships = new ArrayList<>();
    }

    public void AddEmployee(Employee a){
        listOfEmployees.add(a);
    }
    public void AddRelation(Secretarian a){
        listOfRelationships.add(a);
    }
    public void printAllEmployess(){
        System.out.println("Zaměstnanci manažera:");
        listOfEmployees.forEach((value) ->{
          System.out.println(String.format("Jméno: %s, Email: %s", value.getNickname(), value.getEmail()));
        });
    }
    public void printAllRelations(){
        System.out.println("Vztahy manažera:");
        listOfRelationships.forEach((value) ->{
            System.out.println(String.format("Jméno: %s, Email: %s", value.getNickname(), value.getEmail(), value.getNickname()));
        });
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
