/*
APJP, A PHP/JAVA PROXY
Copyright (C) 2009-2011 Jeroen Van Steirteghem

This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
*/

package APJP;

import java.io.FileInputStream;
import java.util.Properties;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main
{
    public static void main(String[] args) throws Exception
    {
    	Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/APJP.properties"));
		
		System.setProperty("APJP_KEY", properties.getProperty("APJP_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_1_KEY", properties.getProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_1_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_1_VALUE", properties.getProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_1_VALUE", ""));
		System.setProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_2_KEY", properties.getProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_2_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_2_VALUE", properties.getProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_2_VALUE", ""));
		System.setProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_3_KEY", properties.getProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_3_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_3_VALUE", properties.getProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_3_VALUE", ""));
		System.setProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_4_KEY", properties.getProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_4_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_4_VALUE", properties.getProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_4_VALUE", ""));
		System.setProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_5_KEY", properties.getProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_5_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_5_VALUE", properties.getProperty("APJP_REMOTE_HTTP_SERVER_RESPONSE_PROPERTY_5_VALUE", ""));
		System.setProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_1_KEY", properties.getProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_1_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_1_VALUE", properties.getProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_1_VALUE", ""));
		System.setProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_2_KEY", properties.getProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_2_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_2_VALUE", properties.getProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_2_VALUE", ""));
		System.setProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_3_KEY", properties.getProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_3_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_3_VALUE", properties.getProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_3_VALUE", ""));
		System.setProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_4_KEY", properties.getProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_4_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_4_VALUE", properties.getProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_4_VALUE", ""));
		System.setProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_5_KEY", properties.getProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_5_KEY", ""));
		System.setProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_5_VALUE", properties.getProperty("APJP_REMOTE_HTTPS_SERVER_RESPONSE_PROPERTY_5_VALUE", ""));
		
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
		
		WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/");
        webAppContext.setDescriptor("src/main/webapp/WEB-INF/web.xml");
        webAppContext.setResourceBase("src/main/webapp/");
        webAppContext.setParentLoaderPriority(true);
        
        server.setHandler(webAppContext);
        
        server.start();
        server.join();
    }
}