package com.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mini.dto.Customer;
import com.mini.dto.Mart;
import com.mini.dto.Product;
import com.mini.dto.ProductInMart;
import com.mini.exception.CannotUpdateException;
import com.mini.exception.DuplicateException;
import com.mini.exception.NotAvailableException;
import com.mini.exception.NotExistException;

public interface DeliveryServiceDAO {
	Connection getConnect() throws SQLException;
	void closeAll(PreparedStatement ps, Connection conn) throws SQLException;
	void closeAll(ResultSet rs, PreparedStatement ps, Connection conn)throws SQLException;

	// Customer
	void saveCustomer(Customer customer) throws SQLException, DuplicateException;
	void deleteCustomer(String id) throws SQLException, NotExistException;
	void updateCustomer(Customer customer) throws SQLException, NotExistException;
	Customer getCustomerById(String id) throws SQLException, NotExistException;
	ArrayList<Customer> getCustomersByName(String name) throws SQLException;
	ArrayList<Customer> getAllCustomer() throws SQLException;
	void saveProductInList() throws SQLException, NotExistException, NotAvailableException;
	
	// Mart
	void saveMart(Mart mart) throws SQLException, DuplicateException;
	void deleteMart(String name) throws SQLException, NotExistException;
	Mart getMartByName(String name) throws SQLException, NotExistException;
	Mart getMartByAddress(String address) throws SQLException;
	ArrayList<Mart> getAllMarts() throws SQLException;

	// Product
	void saveProduct(Product product) throws SQLException, DuplicateException;
	void deleteProduct(int serialNumber) throws SQLException, NotExistException;
	void updateProduct(Product product) throws SQLException, NotExistException;
	Product getProductBySerialNumber(int serialNumber) throws SQLException, NotExistException;
	ArrayList<Product> getAllProducts() throws SQLException;
	
	// ProductInMart
	void saveProductInMart() throws SQLException, DuplicateException, NotExistException;
	void updateProductInMart() throws SQLException, DuplicateException, NotExistException, CannotUpdateException;
	ArrayList<ProductInMart> getAllProductsInMartByName(String name) throws SQLException, NotAvailableException;	

	// Delivery
	void saveDelivery(String delivaryNumber, String martName, String customerName, ArrayList<ProductInMart> list) throws SQLException, NotExistException;
}
