/**
 * Course: CST8288_521 OOP with Design Patterns
 * Assignment: Lab1
 * Project Purpose: Gain experience with refactoring Java code and implementing the Delegate patten using.
 * 
 * File Name: UnitConverter.java 
 * Professor: George Kriger
 * Author: Feng Sun
 * Date: May/31/2019
 */
package pkgUnitConverter;

/**
 * class using delegate patten to deal with conversion
 * @author feng
 */
public class UnitConverter {
    
        private double temperature;
	private ConverterBehaviour converterBehaviour;
        
	/**
         * The default construct, 
         */
	public UnitConverter(){
            
		this.converterBehaviour= new FCconverter();
	}
        
	/**
         * the getter, returns private field temperature
         * @return a double type of temperature.
         */
	public double getTemperature(){ 
            
            return temperature; 
        }
        
        
	/**
         * using convert the temperature.
         * @param temperature a double type parameter, temperature, that would be conversion.
         * @return a double type result, which the temperature are type conversion in right way.
         * @see pkgUnitConverter.ConverterBehaviour
         */
	public double doConvert(double temperature){
            
            return this.temperature = this.converterBehaviour.convert(temperature);
            
        }
        
	/**
         * the setter, that changes the private field converterBehaviour.
         * @param converterBehaviour a ConverterBehaviour type of parameter.
          
         */
	public void changeBehaviourTo(ConverterBehaviour converterBehaviour){
		              
                    this.converterBehaviour = converterBehaviour;
               	
	}
        
       
	
}