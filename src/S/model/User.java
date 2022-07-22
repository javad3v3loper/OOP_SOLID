package S.model;

public class User {

    private S.model.Role role;
    private String password;

    public S.model.Role getRole() {
        return this.role;
    }

    public void setRole(S.model.Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void sendMoney(User user, int amount) {
        // send money functionality...
    }
}
