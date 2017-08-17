package com.mycom;

import java.util.List;

import com.mycom.soapservice.ProductCatalog;
import com.mycom.soapservice.ProductCatalogImplService;

import net.webservicex.*;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length ==0)
		{
			System.out.println("Please pass on one Parameter (Hint: IP address required)");
		}
		else
		{
			String ipAddress = args[0].toString();
			
			GeoIPService service = new GeoIPService();
			GeoIPServiceSoap ipServiceSoap = service.getGeoIPServiceSoap();
			GeoIP geoIP = ipServiceSoap.getGeoIP(ipAddress);
			System.out.println("Location of given IP address "+ipAddress +" :"+geoIP.getCountryName());
		}
		
		getProductCategories();
		if(addProduct("books","My Novel"))
		{
			getProducts("books");
		}

	}
	
	public static void getProductCategories()
	{
		ProductCatalogImplService service = new ProductCatalogImplService();
		ProductCatalog catalog = service.getProductCatalogImplPort();
		List<String> categories = catalog.getProductCategories();
		System.out.println("Print Categories");
		for(int i = 0;i<categories.size();i++)
		{
			System.out.println(categories.get(i));
			getProducts(categories.get(i));
		}
		
	}
	
	public static void getProducts(String category)
	{
		ProductCatalogImplService service = new ProductCatalogImplService();
		ProductCatalog catalog = service.getProductCatalogImplPort();
		List<String> products = catalog.getProducts(category);
		System.out.println("Print Products");
		for(int i = 0;i<products.size();i++)
		{
			System.out.println(products.get(i));
		}
	}
	
	public static boolean addProduct(String category, String product)
	{
		ProductCatalogImplService service = new ProductCatalogImplService();
		ProductCatalog catalog = service.getProductCatalogImplPort();
		return catalog.addProduct(category, product);
	}

}
