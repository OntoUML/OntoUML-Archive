/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.ontoUMLArchive;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nary Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.NaryAssociation#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getNaryAssociation()
 * @model
 * @generated
 */
public interface NaryAssociation extends Association
{
  /**
   * Returns the value of the '<em><b>Ends</b></em>' containment reference list.
   * The list contents are of type {@link it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ends</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ends</em>' containment reference list.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getNaryAssociation_Ends()
   * @model containment="true"
   * @generated
   */
  EList<AssociationEnd> getEnds();

} // NaryAssociation