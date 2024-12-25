package user;

import java.util.ArrayList;
import java.util.List;

public class Direction {
    List<User> users=new ArrayList<>();
    public User addUser(User e){
        users.add(e);
        return e;
    }
    public List<User> getUsers(){
        return users;
    }
    public User getUserId(int id) {
        for (User u: users){
            if (u.getId()==(id)){
                return u;
            }
        }
        System.out.println("cette id introuvable");
        return users.get(id);
    }
    public User updateUser(int id ,User user){
        for (User u:users){
            if (u.getId()==id){
                u.setName(user.getName());
                u.setCity(user.getCity());
                u.setMail(user.getMail());
                u.setPhone(user.getPhone());
                u.setPassword(user.getPassword());
                u.setRle(user.getRle());
            }
        }
        return user;
    }

    public void removeUser(int id){
        for (User ur:users){
            if (ur.getId()==id){
                users.remove(ur);
                System.out.println("remove");
        }
             else System.out.println("not remove");
             }
            }


}
