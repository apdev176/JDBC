package com.jsp.controller;

import com.jsp.dao.PenDao;
import com.jsp.dto.Pen;

public class TestSavePen {

	public static void main(String[] args) {
		Pen p=new Pen();
		p.setId(2);
		p.setName("abc");
		p.setColor("green");
		p.setPrice(40);
		
		PenDao penDao=new PenDao();
		penDao.savePen(p);
		System.out.println(p.getName()+"successfull");

	}

}
