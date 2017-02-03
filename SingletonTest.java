package com.ds.src;

import java.io.Serializable;
import java.lang.reflect.Constructor;

class Admin implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public static Admin instance = null;
	
	private Admin() {
		if (null != instance) {
			throw new InstantiationError( "Creating of this object is not allowed." );
		} 
	}
	
	public static Admin getInstance() {
		
		synchronized(Admin.class) {
			if (null == instance) {
				instance = new Admin();
			} 
		}
		
		return instance;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this class is not allowed"); 
    }
	
    protected Object readResolve() {
        return instance;
    }
	
}

public class SingletonTest extends Thread {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Admin a1 = Admin.getInstance();
				System.out.println(a1.hashCode());
			}
			
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Admin a2 = Admin.getInstance();
				System.out.println(a2.hashCode());
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			Constructor<Admin> constructor = Admin.class.getDeclaredConstructor(new Class[0]);
			constructor.setAccessible(true);
			Admin a3 = constructor.newInstance(new Object[0]);
			System.out.println(a3.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
}
