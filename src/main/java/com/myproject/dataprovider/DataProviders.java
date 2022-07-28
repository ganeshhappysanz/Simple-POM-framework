/**
 * 
 */
package com.myproject.dataprovider;

import org.testng.annotations.DataProvider;

import com.myproject.utility.NewExcelLibrary;

public class DataProviders {

	public NewExcelLibrary obj = new NewExcelLibrary();

	@DataProvider(name = "loginDetails")
	public Object[][] getorganizationID() {
		// Totals rows count
		int rows = obj.getRowCount("LoginDetails");
		// Total Columns
		int column = obj.getColumnCount("LoginDetails");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("LoginDetails", j, i + 2);
			}
		}
		return data;
	}

	@DataProvider(name = "addPatientDetails")
	public Object[][] getEmail() {
		// Totals rows count
		int rows = obj.getRowCount("AddPatientDetails");
		// Total Columns
		int column = obj.getColumnCount("AddPatientDetails");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("AddPatientDetails", j, i + 2);
			}
		}
		return data;
	}

}
