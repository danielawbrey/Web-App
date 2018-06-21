package dao.user;

public class UserLoginDaoImpl implements UserLoginDao {

    @Override
    public boolean validate(String username, String password) {
        // Establish DB connection
        // Query DB for password associated with a unique username
        // Pass the password submitted by user through hash
        // Compared user submitted password to DB stored password return a boolean accordingly
        return false;
    }
}
