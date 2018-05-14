package it.unibz.inf.ontouml.archive;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class OntoUMLArchiveValueConverter extends DefaultTerminalConverters {
  @ValueConverter(rule = "STEREOTYPE_STRING")
  public IValueConverter<String> StereotypeString() {
    return new IValueConverter<String>() {
      @Override
      public String toString(final String value) throws ValueConverterException {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<<");
        _builder.append(value);
        _builder.append(">>");
        return _builder.toString();
      }
      
      @Override
      public String toValue(final String string, final INode node) throws ValueConverterException {
        return string.replaceAll("<<", "").replaceAll(">>", "");
      }
    };
  }
  
  @ValueConverter(rule = "CARDINALITY")
  public IValueConverter<Integer> Cardinality() {
    return new IValueConverter<Integer>() {
      @Override
      public String toString(final Integer value) {
        if (((value).intValue() == (-1))) {
          return "*";
        } else {
          return Integer.toString((value).intValue());
        }
      }
      
      @Override
      public Integer toValue(final String string, final INode node) throws ValueConverterException {
        boolean _isEmpty = Strings.isEmpty(string);
        if (_isEmpty) {
          throw new ValueConverterException("Couldn\'t convert empty string to an integer", node, null);
        } else {
          boolean _equals = "*".equals(string.trim());
          if (_equals) {
            return Integer.valueOf((-1));
          } else {
            try {
              return Integer.valueOf(Integer.parseInt(string));
            } catch (final Throwable _t) {
              if (_t instanceof NumberFormatException) {
                final NumberFormatException e = (NumberFormatException)_t;
                throw new ValueConverterException((("Couldn\'t convert the string \'" + string) + "\' to an integer."), node, e);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
          }
        }
      }
    };
  }
}
