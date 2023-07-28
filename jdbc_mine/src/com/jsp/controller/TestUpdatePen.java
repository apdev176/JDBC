package com.jsp.controller;

import com.jsp.dao.PenDao;

public class TestUpdatePen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         PenDao penDao=new PenDao();
         boolean b=penDao.updatePen(1,"abc");
         System.out.println(b);
	}

}
