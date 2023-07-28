package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.PenDao;
import com.jsp.dto.Pen;

public class TestAddMultiplePens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PenDao penDao=new PenDao();
		ArrayList<Pen> al=new ArrayList<Pen>();
		Pen p1=new Pen();
		Pen p2=new Pen();
		p1.setId(2);
		p1.setName("apsara");
		p1.setPrice(50);
		p1.setColor("brown");
		
		p2.setId(3);
		p2.setName("cello");
		p2.setPrice(50);
		p2.setColor("brown");
		
		al.add(p1);
		al.add(p2);
		
		penDao.addMultiplePen(al);
	}

}
