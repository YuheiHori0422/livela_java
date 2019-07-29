package model;

public class LoginLogic {
	public boolean execute(UserBeans userBeans) {
		return userBeans.getPass().equals("1234");
	}
}
