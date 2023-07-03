package com.java.beans;

public class Product {
private int prodid;
private String descrip;
public Product() {
	super();
}
public Product(int prodid, String descrip) {
	super();
	this.prodid = prodid;
	this.descrip = descrip;
}
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public String getDescrip() {
	return descrip;
}
public void setDescrip(String descrip) {
	this.descrip = descrip;
}
@Override
public String toString() {
	return "Product [prodid=" + prodid + ", descrip=" + descrip + "]";
}


}
