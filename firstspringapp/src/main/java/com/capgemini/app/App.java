package com.capgemini.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.app.bean.Organization;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Organization org = (Organization) context.getBean("organization");
		Organization org2 = (Organization) context.getBean("organization2");

		System.out.println(org2.getName());
		System.out.println(org2.getOrgId());
		System.out.println(org.getCities());
		System.out.println(org.getBoardMembers());
		System.out.println(org.getBranchManagers());
		System.out.println(org.getDateOfEstablishment());
		System.out.println(org.getShareValue());
		System.out.println(org.isListed());
		System.out.println(org.getIpAddresses());
		
	}
}
