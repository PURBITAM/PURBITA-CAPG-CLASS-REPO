package com.capgemini.authorapp.service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.authorapp.model.Author;

/**
 * AuthorManager class used to store data in map.
 * @author Purbita
 */
public class AuthorManager 
{
	/**
	 * 
	 */
	/*
	 * ConcurrentHashMap is the collection which allows us to retrieve and modify 
	 * the data while iterating
	 */
	
	/*
	 * ConcurrentHashMap Object to store AuthorList and Test the same
	 */
	Map<String, Author> authorList=new ConcurrentHashMap<String,Author>();
	/*
	 * addContact Method to add contacts in to contactList Object
	 * @param name gets the name of author
	 * @param email gets the email of author
	 * @param gender gets the gender of author
	 */
	
//below are the documentation comments used to generate documentation for the code
	/**
	 * addContact Method to add contacts in to contactList Object
	  * @param name gets the name of author
	 * @param email gets the email of author
	 * @param gender gets the gender of author
	 */
	
	public void addAuthor(String name,String email,char gender)
	{
		Author au=new Author(name,email,gender);
		validateAuthor(au);
		checkIfAuthorAlreadyExist(au);
		authorList.put(generateKey(au), au);
	}
	
	/**
	 * generateKey generates the Key to store a value in HashMap
	 * @param au
	 * @return String
	 */
	private String generateKey(Author au) {
		// TODO Auto-generated method stub
		return String.format("%s-%s",au.getName(),au.getEmail());
	}
	
	/**
	 * checkIfAuthorAlreadyExist method checks whether Author details is already added 
	 * in the list
	 * 
	 * @param au
	 */
	private void checkIfAuthorAlreadyExist(Author au) {
		// TODO Auto-generated method stub
		if(authorList.containsKey(generateKey(au))) {
			throw new RuntimeException("Contact Already Exists");
		}
	}
	
	/**
	 * validateAuthor method, validates the Author details using some conditions
	 * 
	 * @param au
	 */
	private void validateAuthor(Author au) {
		// TODO Auto-generated method stub
		au.validateName();
		au.validateEmail();
		au.validateGender();
	}
	
	/**
	 * @return all values of authorList 
	 */
	public Collection<Author> getAllAuthor()
	{
		return authorList.values();
	}
}
