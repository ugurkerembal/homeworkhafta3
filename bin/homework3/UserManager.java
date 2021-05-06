package homework3;

public class UserManager {
    public void createAccount(User user) {
        System.out.println(user.getFirstName() + " isimli kullan�c� kay�t oldu");
    }

    public void delete(User user) {
        System.out.println(user.getFirstName() + " kullan�c�s�n�n kayd� silindi");
    }

    public void signIn(User user) {
        System.out.println(user.getFirstName() + " isimli kullan�c� giri� yapt�");
    }

    public void logOut(User user) {
        System.out.println(user.getFirstName() + " isimli kullan�c� ��k�� yapt�");
    }

    public void profileEdit(User user) {
        System.out.println(user.getFirstName() + " kullan�s�n�n bilgileri g�ncellendi");
    }
}
