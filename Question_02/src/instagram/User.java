package instagram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class User {
	private int id;
	private String name;
	Set<User> followers;
	Set<User> following;
	Map<User, String> posts;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
		this.followers = new HashSet<>();
		this.following = new HashSet<>();
		this.posts = new HashMap<>();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void update(String message, User followee) {	
		System.out.println(this.name +  " recived notification: " + followee.name + " posted: " + message);
	}
	
	public void addFollowers(User u) {
		
	}
	
	public void removeFollowers(User u) {
		
	}
	
	public void notifyFollowers(String message) {
		Iterator<User> it = followers.iterator();
		
		while(it.hasNext()) {
			User follower = it.next();
			follower.update(message, this);
		}
	}
	
	public void post(String content) {
		posts.put(this, content);
		
		System.out.println(this.name + " posted: " + content);
		
		notifyFollowers(content);
	}
	
	public void follow(User u) {
		this.following.add(u);
	}
	
	public void unfollow(User u) {
		this.following.remove(u);
	}
}
