package com.capgemini.cmappcollections.service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.cmappcollections.model.Contact;
/**
 * ContactManager class used to store data in map.
 * @author Purbita
 */
public class ContactManager {
	
	/**
	 * 
	 */
	/*
	 * ConcurrentHashMap is the collection which allows us to retrieve and modify 
	 * the data while iterating
	 */
	
	/*
	 * ConcurrentHashMap Object to store contactList and Test the same
	 */
	Map<String, Contact> contactList=new ConcurrentHashMap<String,Contact>();
	/*
	 * addContact Method to add contacts in to contactList Object
	 * @param firstName gets the first name of contact
	 * @param lastName gets the last name of contact
	 * @param phoneNo gets the phone number of contact
	 */
	
//below are the documentation comments used to generate documentation for the code
	/**
	 * addContact Method to add contacts in to contactList Object
	 * @param firstName gets the first name of contact
	 * @param lastName gets the last name of contact
	 * @param phoneNo gets the phone number of contact
	 */
	
	public void addContact(String firstName,String lastName,String phoneNo)
	{
		Contact contact=new Contact(firstName,lastName,phoneNo);
		validateContact(contact);
		checkIfContactAlreadyExist(contact);
		contactList.put(generateKey(contact), contact);
	}
	
	/**
	 * generateKey generates the Key to store a value in HashMap
	 * @param contact
	 * @return String
	 */
	private String generateKey(Contact contact) {
		// TODO Auto-generated method stub
		return String.format("%s-%s",contact.getfName(),contact.getlName());
	}
	
	/**
	 * checkIfContactAlreadyExist method checks whether contact is already added 
	 * in the list
	 * 
	 * @param contact
	 */
	private void checkIfContactAlreadyExist(Contact contact) {
		// TODO Auto-generated method stub
		if(contactList.containsKey(generateKey(contact))) {
			throw new RuntimeException("Contact Already Exists");
		}
	}
	
	/**
	 * validateContact method, validates the contact details using some conditions
	 * 
	 * @param contact
	 */
	private void validateContact(Contact contact) {
		// TODO Auto-generated method stub
		contact.validateFirstName();
		contact.validateLastName();
		contact.validatePhNo();
	}
	
	/**
	 * @return all values of contactList 
	 */
	public Collection<Contact> getAllContacts()
	{
		return contactList.values();
	}
	
	public Contact getContactByName(String fName)
	{
		return new Contact();
	}
}
