package com.basha.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.basha.springdemo.entity.Customer;
import com.basha.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

/*	//inject the dao into this cotroller
	@Autowired
	private CustomerDAO customerDAO;
	//before using @Service annotation we are using DAO directly now in between we have service layer and need
	// to inject customer service */
	
	//need to inject customer service
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel){
		
		//get customers from the dao
		List<Customer> theCustomers= customerService.getCustomers();
		
		//add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		
		return "list-customers";
	}
		
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){
		
		//add the model attribute to bind form data
		Customer theCustomer=new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	
	//this will connect to customer form to enter the data 
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
		
		//save the customer using our service
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId")	int theId,
							Model theModel){
		
		//get the customer from the service
		Customer theCustomer= customerService.getCustomers(theId);
		
		//set the customer as model attribute pre populate the form
		theModel.addAttribute("customer", theCustomer);
		
		//send over to our form
		
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId,
			Model theModel){
		
		//delete the customer
	customerService.deleteCustomer(theId);
		
		//
		
		
		
		
	return "redirect:/customer/list";
	}
	
}
