package com.ming.common.intercepter;
import com.ming.common.vo.User;

/**
 * @author wolter
 */
public class UserContextHolder {
	public static ThreadLocal<User> context = new ThreadLocal<User>();
	public static User currentUser() {
		return context.get();
	}
	public static void set(User user) {
		context.set(user);
	}
	public static void shutdown() {
		context.remove();
	}
}
