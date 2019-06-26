/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Lab1
 * Project Purpose: Gain experience with refactoring Java code and implementing the Delegate patten using.
 * 
 * File Name: CFconverter.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: May/31/2019
 */
package pkgUnitConverter;
/**
 * class to convert Celsius to Fahrenheit
 * @author kriger, feng
 * @version 1.0.1
 * @see pkgUnitConverter.ConverterBehaviour
 */
public class CFconverter implements ConverterBehaviour {
        
        /**
         * 
         * 
         * test git!!!!
         */
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
        
	/**
         * The override method, deal with temperature conversion.
	 * @param celsius a double type parameter, celsius, that the Celsius value would be converted.
	 * @return a double type result, in Fahrenheit.
	 */
        @Override
	public double convert(double celsius) {
		return celsius*convFactor + convOrigin;
	}

       
        /**
         * The override method, 
         * @return String type value, "CtoF" means from Celsius to Fahrenheit.
         */
        @Override
        public String convertType() {
            return "CtoF";
        }
}

