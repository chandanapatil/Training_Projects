package com.ecommerce;

import java.math.BigDecimal;
import java.sql.Date;


public class EProduct {
	private long ID;
    private String name;
    private BigDecimal price;
    private Date date;
    
    public EProduct() {
            
    }
    public EProduct(long id, String name, BigDecimal price, Date date) {
            this.ID = id;
            this.name = name;
            this.price = price;
            this.date = date;
    }
    
    public long getID() {return this.ID; }
    public String getName() { return this.name;}
    public BigDecimal getPrice() { return this.price;}
    public Date getDate() { return this.date;}
    
    public void setID(long id) { this.ID = id;}
    public void setName(String name) { this.name = name;}
    public void setPrice(BigDecimal price) { this.price = price;}
    public void setDate(Date date) { this.date = date;}

}
