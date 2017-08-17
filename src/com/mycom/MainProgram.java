package com.mycom;

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

	}

}
