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
    public User getUserId(int id,User user) {
        for (User u: users){
            if (u.getId()==(id)){
                return u;
            }
        }
        System.out.println("cette id introuvable");
        return users.get(id);
    }
    public void removeUser(int id){

                users.remove(id);

            }


}
