package com.jsp.controller;

import java.util.List;

import com.jsp.dao.PenDao;
import com.jsp.dto.Pen;

public class TestGetAllPen {

	public static void main(String[] args) {
		PenDao penDao=new PenDao();
		List<Pen> l=penDao.getAllPen();
		for(Pen p:l) {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getColor());
			System.out.println(p.getPrice());
		}

	}

}
