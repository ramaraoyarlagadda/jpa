package com.cg.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.dto.Book;

public class BookService {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
		System.out.println("hello");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	//	Book book = new Book(43, "sevenhills", "great inspiration");
	//	entityManager.persist(book);
		System.out.println("321321");
		 Book book=entityManager.find(Book.class, 43);
		entityManager.getTransaction().commit();

		System.out.println(book);
	}
}
