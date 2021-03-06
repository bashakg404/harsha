package com.emusicstore.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;

@Controller 
public class AdminController {
	
	private Path path;
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/admin")
	public String adminPage() {
		return "admin";
	}

	@RequestMapping("/admin/productInventory")
	public String productInventory(Model model) {
		List<Product> products = productDao.getAllProducts();
		model.addAttribute("products", products);
		return "productInventory";

	}

	// add product mapping
	@RequestMapping("/admin/productInventory/addProduct")
	public String addProduct(Model model) {
		Product product = new Product();
		product.setProductCategory("instrument");
		product.setProductCondition("new");
		product.setProductStatus("active");

		model.addAttribute("product", product);

		return "addProduct";
	}

	@RequestMapping(value = "/admin/productInventory/addProduct", method = RequestMethod.POST)
	public String addProductPost(@ModelAttribute("product") Product product, HttpServletRequest request) {

		productDao.addProduct(product);

		// this will help us to add the image
		MultipartFile productImage = product.getProductImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + product.getProductId() + ".png");

		// validate the picture and upload
		if (productImage != null && !productImage.isEmpty()) {
			try {
				productImage.transferTo(new File(path.toString()));
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("Product Image Saving Failed", e);
			}
		}

		// return "productInventory";
		return "redirect:/admin/productInventory";

	}

	// delete the product mapping
	@RequestMapping("/admin/productInventory/deleteProduct/{id}")
	public String deleteProduct(@PathVariable String id, Model model, HttpServletRequest request) {

		// it will delete the images when we delete the product
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + id + ".png");

		if (Files.exists(path)) {
			try {
				Files.delete(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// delete the product
		System.out.println("Delete the product by id....");
		productDao.deleteProduct(id);

		// return "productInventory";
		return "redirect:/admin/productInventory";
	}

	// implement code to edit product from invetory page
	@RequestMapping("admin/productInventory/editProduct/{id}")
	public String editProduct(@PathVariable("id") String id, Model model) {
		Product product = productDao.getProductById(id);
		model.addAttribute(product);
		return "editProduct";
	}

	@RequestMapping(value = "/admin/productInventory/editProduct", method = RequestMethod.POST)
	public String editProduct(@ModelAttribute("product") Product product, Model model, HttpServletRequest request) {

		MultipartFile productImage = product.getProductImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images" + product.getProductId() + ".png");

		if (productImage != null && !productImage.isEmpty()) {
			try {
				productImage.transferTo(new File(path.toString()));
			} catch (Exception e) {
				throw new RuntimeException("Product image saving failed!", e);
			}
		}

		productDao.editProduct(product);
		return "redirect:/admin/productInventory";
	}

}

	