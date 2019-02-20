package com.ssi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Data {
	public static SessionFactory getSF(){
		Configuration conf=new Configuration().configure();
		SessionFactory sf=conf.buildSessionFactory();
		return sf;

	}
}
