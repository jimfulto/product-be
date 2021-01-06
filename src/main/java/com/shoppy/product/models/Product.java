package com.shoppy.product.models;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
	private String productId;
	private String productName;
	private String productCode;
	private Date releaseDate; //Date time---needs
	private String description;
	private BigDecimal price; //decimal example 28.99
	private BigDecimal starRating; //decimal example 4.5
	private String imageUrl;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getStarRating() {
		return starRating;
	}
	public void setStarRating(BigDecimal starRating) {
		this.starRating = starRating;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
