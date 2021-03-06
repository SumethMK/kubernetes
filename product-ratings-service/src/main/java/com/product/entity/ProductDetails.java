/**
 * 
 */
package com.product.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author rakesh.a.kumar.nayak
 *
 */
@Entity
@Table(name="ProductDetails")
@NamedQuery(name="ProductDetails.findAll", query="SELECT pd FROM ProductDetails pd")
public class ProductDetails {
	
	@Id
	@Column(name="productId")
	private long productId;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="price")
	private float price;
	
	@Column(name="category")
	private String category;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy="productDetails")
	private List<ProductReview> productReviewList;
	
	@OneToMany(mappedBy="productDetails")
	private List<ProductRating> productRatingList;
	
	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the productReviewList
	 */
	public List<ProductReview> getProductReviewList() {
		return productReviewList;
	}
	/**
	 * @param productReviewList the productReviewList to set
	 */
	public void setProductReviewList(List<ProductReview> productReviewList) {
		this.productReviewList = productReviewList;
	}
	/**
	 * @return the productRatingList
	 */
	public List<ProductRating> getProductRatingList() {
		return productRatingList;
	}
	/**
	 * @param productRatingList the productRatingList to set
	 */
	public void setProductRatingList(List<ProductRating> productRatingList) {
		this.productRatingList = productRatingList;
	}

}
