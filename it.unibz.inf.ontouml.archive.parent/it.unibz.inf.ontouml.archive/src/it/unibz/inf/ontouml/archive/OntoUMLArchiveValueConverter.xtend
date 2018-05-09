package it.unibz.inf.ontouml.archive

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings

class OntoUMLArchiveValueConverter extends DefaultTerminalConverters {
	
	@ValueConverter(rule = "STEREOTYPE_STRING")
	def IValueConverter<String> StereotypeString(){
		return new IValueConverter<String>(){
			
			override toString(String value) throws ValueConverterException {
				'''<<«value»>>'''
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				string.replaceAll("<<","").replaceAll(">>","")
			}
			
		}
	}
	
	@ValueConverter(rule = "CARDINALITY")
	def IValueConverter<Integer> Cardinality(){
		return new IValueConverter<Integer>(){
			override String toString(Integer value){
				if(value == -1)	return "*"
				else			return Integer.toString(value)
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				if(Strings.isEmpty(string)) {
					throw new ValueConverterException("Couldn't convert empty string to an integer", node, null)
				}
				else if("*".equals(string.trim)){
					return -1;
				}
				else {
					try( return Integer.parseInt(string)) catch (NumberFormatException e){
						throw new ValueConverterException("Couldn't convert the string '"+string+"' to an integer.",node,e)
					}
				}
			}
		}
	}
	
}