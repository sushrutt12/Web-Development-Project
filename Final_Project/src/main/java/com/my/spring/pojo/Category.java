package com.my.spring.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="category_table")
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="categoryID", unique=true, nullable=false)
    private long categoryId;
	@Column(name="title", unique=true, nullable=false)
    private String title;
    @ManyToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinTable(
    		name="category_product_table",
    		joinColumns={@JoinColumn(name="categoryID", nullable=false,updatable=false)},
    		inverseJoinColumns={@JoinColumn(name="productID")}
    		)
	private Set<Product> products = new HashSet<Product>();

    public Category(String title) {
        this.title = title;
    }

    public Category() {
    }

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override 
	public String toString(){
		return title;
	}
}