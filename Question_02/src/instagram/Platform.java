package instagram;

import java.util.HashMap;
import java.util.Map;

public class Platform {
	private Map<Integer, User> users;
	
	public Platform() {
		users = new HashMap<>();
	}
	
	public void addUser(Integer id, String name) {
		User u = new User(id, name);
		this.users.put(id, u);
		
		System.out.println(name + " added successfully");
	}
	
	public void follow(Integer followerId, Integer followeeId) {
		User follower = this.users.get(followerId);
		User followee = this.users.get(followeeId);
		
		follower.follow(followee);
		followee.followers.add(follower);
		
		System.out.println(follower.getName() + " is now following " + followee.getName());
	}
	
	public void unfollow(Integer followerId, Integer followeeId) {
		User follower = this.users.get(followerId);
		User followee = this.users.get(followeeId);
		
		follower.unfollow(followee);
		followee.followers.remove(follower);
		
		System.out.println(follower.getName() + " has unfollowed " + followee.getName());
	}
	
	public void post(Integer id, String content) {
		User user = users.get(id);
		
		user.post(content);
	}
}
