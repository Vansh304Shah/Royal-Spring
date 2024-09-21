package com;
import com.dao.UserDao;

//Single Ton -> 

public class App 
{
    public static void main( String[] args )
    {
    	UserDao userDao1 = UserDao.getUserDao();
    	UserDao userDao2 = UserDao.getUserDao();
    	UserDao userDao3 = UserDao.getUserDao();
    	UserDao userDao4 = UserDao.getUserDao();
    	UserDao userDao5 = UserDao.getUserDao();
    	
    	System.out.println(userDao1);	//hashcode
    	System.out.println(userDao2);
    	System.out.println(userDao3);
    	System.out.println(userDao4);
    	System.out.println(userDao5);
    }
}
