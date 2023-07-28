package com.jsp.controller;

import com.jsp.dao.PenDao;

public class TestDeletePen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PenDao penDao=new PenDao();
       boolean b=penDao.deleteById(2);
       System.out.println(b);
	}

}
