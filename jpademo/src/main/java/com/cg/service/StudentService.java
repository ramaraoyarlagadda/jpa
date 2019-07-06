package com.cg.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.dto.Student;



public class StudentService {

	
	  public static void main(String[] args) { 
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
	  EntityManager entityManager = entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction = entityManager.getTransaction();
	  entityTransaction.begin();
//	  Student student = new Student("core","java","corejava@gmail.com");
//	  entityManager.persist(student);
	  Student student=entityManager.find(Student.class, 100);
	  System.out.println(student);
	  entityManager.getTransaction().commit();
	  entityManager.close();
	  entityManagerFactory.close(); }
	 
}
