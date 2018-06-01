package com.example.jpetstore.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Category implements Serializable {

  /* Private Fields */

  private String categoryId;
  private String name;
  private String description;
  private String countlike, productid, descn;

  /* JavaBeans Properties */

  
  public String getCategoryId() { return categoryId; }
  public String getCountlike() {
	return countlike;
}
public void setCountlike(String countlike) {
	this.countlike = countlike;
}
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public String getDescn() {
	return descn;
}
public void setDescn(String descn) {
	this.descn = descn;
}
public void setCategoryId(String categoryId) { this.categoryId = categoryId.trim(); }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public String getDescription() { return description; }
  public void setDescription(String description) { this.description = description; }

  /* Public Methods */

  public String toString() {
    return getCategoryId();
  }
}