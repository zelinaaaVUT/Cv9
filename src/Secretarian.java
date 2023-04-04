public class Secretarian extends Employee {
    private String nickname;
    private String email;
    char[] password;
    //enum employeeType {ACTIVE, INACTIVE, DELETED};
    Integer age;

    public Secretarian(String nickname, String email, char[] password){
        super(nickname, email, password);
    }

    @Override
    public String toString() {
        return "Secretarian{" +
                "nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
