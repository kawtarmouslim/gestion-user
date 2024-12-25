import user.Direction;
import user.Roles;
import user.User;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Direction direction =new Direction();
        while (true){
            System.out.println("1-Add User ");
            System.out.println("2-Get User ");
            System.out.println("3-Get Par User par id ");
            System.out.println("-5_Update User ");
            System.out.println("4-Remover User ");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter username :");
                    String username=sc.nextLine();
                    System.out.println("Enter city :");
                    String city=sc.nextLine();

                    System.out.println("Enter mail :");
                    String mail=sc.nextLine();

                    System.out.println("Enter phone number :");
                    String phone=sc.nextLine();
                    System.out.println("Enter password :");
                    String password=sc.nextLine();
                    System.out.println("Enter Role (employé, administrateur, cliente):");
                    String inputRole = sc.nextLine().toLowerCase();
                    Roles role = Roles.valueOf(inputRole);
                    User user = new User(username, city, mail, phone, password, role);
                    User user1=direction.addUser(user);
                    System.out.println(user1);
                    break;
                case  2:
                    for (User user2:direction.getUsers())
                        System.out.println(user2);
                    break;
                case  3:
                    System.out.println("Enter ID");
                    int gid=sc.nextInt();
                    User user3=direction.getUserId(gid);
                    System.out.println(user3);
                    break;
                case  4:
                    System.out.println("Enter id");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter username :");
                    String username2=sc.nextLine();
                    System.out.println("Enter city :");
                    String city2=sc.nextLine();

                    System.out.println("Enter mail :");
                    String mail2=sc.nextLine();

                    System.out.println("Enter phone number :");
                    String phone2=sc.nextLine();
                    System.out.println("Enter password :");
                    String password2=sc.nextLine();
                    System.out.println("Enter Role (employé, administrateur, cliente):");
                    String inputRole2 = sc.nextLine().toLowerCase();
                    Roles role2= Roles.valueOf(inputRole2);
                    User user2 = new User(username2, city2, mail2, phone2, password2, role2);
                    direction.updateUser(id,user2);
                    break;
                case 5:
                    System.out.println("Entrez l'ID du user :");
                    int id1= sc.nextInt();

                    direction.removeUser(id1);

                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}