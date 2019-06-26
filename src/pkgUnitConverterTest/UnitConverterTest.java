/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Lab1
 * Project Purpose: Gain experience with refactoring Java code and implementing the Delegate patten using.
 * 
 * File Name: UnitConverterTest.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: May/31/2019
 */
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 * simple class to test 2 classes for converting Fahrenheit to Celsius and the reverse
 * @author kriger, feng
 * @version 1.0.1
 * 
 */
public class UnitConverterTest {

    /**
     * The main method, which loading the test function for the project.
     * @param args command line arguments
     */
    public static void main(String[] args) {
		FCconverter FtoC = new FCconverter();
		System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, FtoC.convert(70.0));
		
		CFconverter CtoF = new CFconverter();
		System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, CtoF.convert(20.0));
		
	}

}
