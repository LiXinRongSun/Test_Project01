package indio.lixinrong.javabasics.test08;


    
import java.util.Scanner;

/**
*@title :TestChoice01.java
*@package com.oracle.basics.switch01
*@denscription :TODO
*@autor 李新荣
*@data 2021年10月9日 上午9:56:50
*@verson V1.0
*/
public class test {
	public static void main(String[] args) {
		Scanner update =new Scanner(System.in);
		System.out.println("请输入用户名");
		String user =update.next();
		System.out.println("请输入密码");
		String pass =update.next();
		while(user.equals(update.next())){
			System.out.println("用户名正确");
			System.out.println("请输入密码");
			String pass01=update.next();
			if(pass.equals(pass01)){
				System.out.println("登录成功！");
				break;
			}else
			System.out.println("密码输入错误，请重新输入登录的用户名");
			
		}
		
	}

}
