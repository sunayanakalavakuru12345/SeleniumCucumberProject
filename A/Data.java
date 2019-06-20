package com.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
@Test(dataProvider="provider")
public void testdata(String username,String Password) {
	System.out.println("username:"+username);
	System.out.println("password:"+Password);
}
@DataProvider(name="provider")
public Object[][] getdata(){
	
Object[][] a= {
		{"acvsd","sfh"},
		{"sgf","drh"},
		{"fdf","hfgyu"}
};
return a;
}
}

