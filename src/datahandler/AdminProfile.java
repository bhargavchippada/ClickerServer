package datahandler;

import support.ParseUsers;


public class AdminProfile {
	public static String classname = "AdminProfile";
	
	public final static String username="bhargav";
	public final static String password="chippada";
	
	public static boolean adminAuthentication(String username, String password){
		return AdminProfile.username.equals(username) && AdminProfile.password.equals(password);
	}
	
	public static void createClassroom(String clsnm, String file){
		new ParseUsers().parseFile(file);
		if(ClassRoom.users_map.size()!=0) ClassRoom.clsnm = clsnm;
	}
}
