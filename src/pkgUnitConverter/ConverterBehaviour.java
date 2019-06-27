/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Lab1
 * Project Purpose: Gain experience with refactoring Java code and implementing the Delegate patten using.
 * 
 * File Name: ConverterBehaviour.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: May/31/2019
 */
package pkgUnitConverter;

/**
 * A interface, which provides two methods which due with temperature conversion.
 * 
 * @version 1.0.0
 * @author feng
 * @see pkgUnitConverter.ConverterBehaviour
 */
public interface ConverterBehaviour {
    
    /**
     * The method accepts one double parameter, that return the value of conversion result.
     * @param temperature the double type parameter, that the temperature value would be converted.
     * @return a double type value of the conversion result.
     */
   
    
    double convert(double temperature); //The method accepts one double paramete, that return the value of conversion result.
    
    /**
     * The String type of method, which provides kind of conversion type.
     * @return a String value which shows the type of temperature conversion.
     */
    
    String convertType(); //The String type of method, that returns kind of conversion type.
    
}
