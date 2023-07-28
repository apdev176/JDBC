package com.jsp.controller;

import com.jsp.dao.PenDao;
import com.jsp.dto.Pen;

public class TestPenById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PenDao penDao=new PenDao();
      Pen p=penDao.penById(1);
      System.out.println(p.getId());
      System.out.println(p.getName());
      System.out.println(p.getColor());
      System.out.println(p.getPrice());
      
	}

}


