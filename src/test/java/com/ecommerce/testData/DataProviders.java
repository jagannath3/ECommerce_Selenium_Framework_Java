package com.ecommerce.testData;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "dataForAccountCreation")
	public Object[][] getDataForAccountCreation() {
		Object[][] data = new Object[1][14];
		data[0][0] = "lakece9035@prekab.net"; // email
		data[0][1] = "Test"; // first name
		data[0][2] = "User"; // last name
		data[0][3] = "Qwerty@3"; // password
		data[0][4] = "16"; // day
		data[0][5] = 10; // month
		data[0][6] = "1990"; // year
		data[0][7] = "New York City"; // address 1
		data[0][8] = "New York City"; // city
		data[0][9] = "New York"; // state
		data[0][10] = 10001; // zip code
		data[0][11] = "United States"; // country
		data[0][12] = 9876543210l; // Mobile phone
		data[0][13] = "Home Address"; // alias name
		return data;
	}
}
