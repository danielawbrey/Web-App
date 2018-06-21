package dao.user;

public interface UserLoginDao {
    boolean validate(String username, String password);
}
