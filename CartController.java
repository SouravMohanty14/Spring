package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.model.Cart;
import com.niit.model.Customer;
import com.niit.service.CustomerService;

@Controller
public class CartController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/cart/getCardId")
	public String getCartId(Model model) {
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUserName();
		Customer customer = customerService.getCustomerByUsename(username);
		Cart cart = customer.getCart();
		int cartId = cart.getId();
		model.addAttribute("cartId",cartId);
		return "cart";
	}
	@RequestMapping("/cart/getCart/{cartId}")
	public Cart getCart(@PathVariable int cartId) {
		Cart cart = cartService.getCart(cartId);
		return cart;
		
	}
}
