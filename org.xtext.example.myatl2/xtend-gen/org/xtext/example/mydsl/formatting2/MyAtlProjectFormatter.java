/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationElementCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.services.MyAtlProjectGrammarAccess;

@SuppressWarnings("all")
public class MyAtlProjectFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyAtlProjectGrammarAccess _myAtlProjectGrammarAccess;
  
  protected void _format(final BinaryOperatorCS binaryOperatorCS, @Extension final IFormattableDocument document) {
    EList<AnnotationElementCS> _ownedAnnotation = binaryOperatorCS.getOwnedAnnotation();
    for (final AnnotationElementCS annotationElementCS : _ownedAnnotation) {
      document.<AnnotationElementCS>format(annotationElementCS);
    }
  }
  
  protected void _format(final NavigationOperatorCS navigationOperatorCS, @Extension final IFormattableDocument document) {
    EList<AnnotationElementCS> _ownedAnnotation = navigationOperatorCS.getOwnedAnnotation();
    for (final AnnotationElementCS annotationElementCS : _ownedAnnotation) {
      document.<AnnotationElementCS>format(annotationElementCS);
    }
  }
  
  public void format(final Object navigationOperatorCS, final IFormattableDocument document) {
    if (navigationOperatorCS instanceof NavigationOperatorCS) {
      _format((NavigationOperatorCS)navigationOperatorCS, document);
      return;
    } else if (navigationOperatorCS instanceof BinaryOperatorCS) {
      _format((BinaryOperatorCS)navigationOperatorCS, document);
      return;
    } else if (navigationOperatorCS instanceof XtextResource) {
      _format((XtextResource)navigationOperatorCS, document);
      return;
    } else if (navigationOperatorCS instanceof EObject) {
      _format((EObject)navigationOperatorCS, document);
      return;
    } else if (navigationOperatorCS == null) {
      _format((Void)null, document);
      return;
    } else if (navigationOperatorCS != null) {
      _format(navigationOperatorCS, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(navigationOperatorCS, document).toString());
    }
  }
}