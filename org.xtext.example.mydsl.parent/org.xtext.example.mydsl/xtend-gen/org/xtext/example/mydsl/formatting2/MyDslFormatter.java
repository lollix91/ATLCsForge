/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.formatting2;

import atl.Library;
import atl.Unit;
import java.util.Arrays;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter /* implements AbstractFormatter2  */{
  /* @Inject
   */private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final Unit unit, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getLibraries() is undefined for the type Unit"
      + "\nInvalid number of arguments. The method format(Unit, IFormattableDocument) is not applicable for the arguments (LibraryRef)"
      + "\nType mismatch: cannot convert from LibraryRef to Unit"
      + "\nThe method format(Unit, IFormattableDocument) from the type MyDslFormatter refers to the missing type IFormattableDocument");
  }
  
  protected void _format(final Library library, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getLibraries() is undefined for the type Library"
      + "\nThe method getHelpers() is undefined for the type Library"
      + "\nInvalid number of arguments. The method format(Unit, IFormattableDocument) is not applicable for the arguments (LibraryRef)"
      + "\nInvalid number of arguments. The method format(Unit, IFormattableDocument) is not applicable for the arguments (Helper)"
      + "\nType mismatch: cannot convert from LibraryRef to Unit"
      + "\nType mismatch: cannot convert from Helper to Unit"
      + "\nThe method format(Unit, IFormattableDocument) from the type MyDslFormatter refers to the missing type IFormattableDocument"
      + "\nThe method format(Unit, IFormattableDocument) from the type MyDslFormatter refers to the missing type IFormattableDocument");
  }
  
  public void format(final Unit library, final IFormattableDocument document) {
    if (library instanceof Library
         && document != null) {
      _format((Library)library, document);
      return;
    } else if (library != null
         && document != null) {
      _format(library, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(library, document).toString());
    }
  }
}