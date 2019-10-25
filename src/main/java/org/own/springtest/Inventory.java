package org.own.springtest;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Inventory {

	private List<Product> products;

	private Set<Product> productSet;

	private Map<String, Product> productMap;

	private Properties productProperties;

	public Inventory() {
	}

	public Inventory(final List<Product> products) {
		this.products = products;
	}

	public Properties getProductProperties() {
		return productProperties;
	}

	public void setProductProperties(Properties productProperties) {
		this.productProperties = productProperties;
	}

	public Map<String, Product> getProductMap() {
		return productMap;
	}

	public void setProductMap(Map<String, Product> productMap) {
		this.productMap = productMap;
	}

	public Set<Product> getProductSet() {
		return productSet;
	}
	
	public Inventory(Set<Product> productSet) {
		this.productSet = productSet;
	}

	public void setProductSet(Set<Product> productSet) {
		this.productSet = productSet;
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Inventory [productMap=" + productMap + ", productSet=" + productSet + ", products=" + products + "]";
	}
	/*
	@Override
	public String toString() {
		return "Inventory [productSet=" + productSet + "]";
	}*/

	
}