
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: www.facebook.com
    Add a description of www.facebook.com
    */
    /* Page: Facebook  log in or sign up 
    
    */

    

bC = new ByFactoryCollection("email", "32633.4003", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "32633.4005", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "32633.4007", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy']", "AttributeRule", "32633.4009", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy']", "AttributeRule", "32633.4011", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-email']", "AttributeRule", "32633.4013", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-email']", "AttributeRule", "32633.4015", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Email address or phone number']", "AttributeRule", "32633.4017", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Email address or phone number']", "AttributeRule", "32633.4019", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@autofocus='1']", "AttributeRule", "32633.4021", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autofocus='1']", "AttributeRule", "32633.4023", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Email address or phone number']", "AttributeRule", "32633.4025", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Email address or phone number']", "AttributeRule", "32633.4027", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"email\"]", "IDRule", "32633.4029", "" ) );
bC.add( new ByFactory( ById.class, "email", "IDRule", "32633.4031", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"email\"]", "IDRule", "32633.4033", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"email\"]", "NameRule", "32633.4035", "" ) );
bC.add( new ByFactory( ByName.class, "email", "NameRule", "32633.4037", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"email\"]", "NameRule", "32633.4039", "" ) );


objectMap.put( "32633.4003", bC );


bC = new ByFactoryCollection("pass", "32633.4043", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='password']", "AttributeRule", "32633.4045", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='password']", "AttributeRule", "32633.4047", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32633.4049", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy _9npi']", "AttributeRule", "32633.4051", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-pass']", "AttributeRule", "32633.4053", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-pass']", "AttributeRule", "32633.4055", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Password']", "AttributeRule", "32633.4057", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Password']", "AttributeRule", "32633.4059", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Password']", "AttributeRule", "32633.4061", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Password']", "AttributeRule", "32633.4063", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"pass\"]", "IDRule", "32633.4065", "" ) );
bC.add( new ByFactory( ById.class, "pass", "IDRule", "32633.4067", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"pass\"]", "IDRule", "32633.4069", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"pass\"]", "NameRule", "32633.4071", "" ) );
bC.add( new ByFactory( ByName.class, "pass", "NameRule", "32633.4073", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"pass\"]", "NameRule", "32633.4075", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32633.4077", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_6luy _55r1 _1kbt']/input[1]", "ParentRule[AttributeRule]", "32633.4079", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32633.4081", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"passContainer\"]/input[1]", "ParentRule[IDRule]", "32633.4083", "" ) );


objectMap.put( "32633.4043", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
