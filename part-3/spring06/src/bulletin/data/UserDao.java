package bulletin.data;

import bulletin.User;

public interface UserDao {

	User save(User user);

	User findByUsername(String username);

}
