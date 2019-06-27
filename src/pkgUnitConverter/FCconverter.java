/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Lab1
 * Project Purpose: Gain experience with refactoring Java code and implementing the Delegate patten using.
 * 
 * File Name: FCconverter.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: May/31/2019
 */
package pkgUnitConverter;
/**
 * class to convert Celsius to Fahrenheit
 * @author kriger
 */
public class FCconverter implements ConverterBehaviour{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
         * The override method, deal with temperature conversion and return the result.
	 * @param fahrenheit a double type parameter, fahrenheit, that the Fahrenheit value would be converted.
	 * @return a double type result, in Celsius.
	 */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}
     
    /**
         * The override method, return the type of conversion.
         * @return String type value, "FtoC" means from Fahrenheit to Celsius.
         */
        @Override
        public String convertType() {
            return "FtoC";
        }
}