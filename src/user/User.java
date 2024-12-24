package user;

public class User extends Persone{
    Roles role;

    public User(String name, String city, String mail, String phone, String password, Roles role) {
        super(name, city, mail, phone, password);
        this.role = role;
    }

    public Roles getRle() {
        return role;
    }

    public void setRle(Roles rle) {
        this.role = rle;
    }

    @Override
    public String toString() {
        return  super.toString()+"User{" +
                "role=" + role +
                '}';
    }
}
