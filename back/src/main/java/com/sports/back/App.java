package com.sports.back;

import com.daoimpl.ProductDaoImpl;
import com.model.Product;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Product p= new Product();
    	ProductDaoImpl pdi= new ProductDaoImpl();
    	
    	p.setpId("msewq1");
    	p.setpName("lavzzvvdvi");
    	p.setpDesc("xyvvdvzgvvf..");
    	p.setpPrice(140.50);
    	
    	
    	
    	boolean flag =pdi.insertProduct(p);
    	if(flag==true)
    	{
    		System.out.print("product inserted");
    	}
    	
    	/*Product p= new Product();
    	ProductDaoImpl pdi= new ProductDaoImpl();
    	
    	p.setpId("SM123");
    	p.setpName("lavvvi");
    	p.setpDesc("xyvvzgf..");
    	p.setpPrice(160.25);
    	
    	
    	boolean flag =pdi.updateProduct(p);
    	if(flag==true)
    	{
    		System.out.print("product updated");
    	}*/
    	
    	/*Product p= new Product();
    	ProductDaoImpl pdi= new ProductDaoImpl();
    	
    	p.setpId("SM123");
    	p.setpName("lavvvi");
    	p.setpDesc("xyvvzgf..");
    	p.setpPrice(160.25);
    	
    	
    	boolean flag =pdi.deleteProduct(p);
    	if(flag==true)
    	{
    		System.out.print("product deleted");
    	}*/
       
    }
}
