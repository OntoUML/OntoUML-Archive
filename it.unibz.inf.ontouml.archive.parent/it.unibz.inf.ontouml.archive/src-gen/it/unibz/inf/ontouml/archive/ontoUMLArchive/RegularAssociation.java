/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.ontoUMLArchive;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.RegularAssociation#getFrom <em>From</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.RegularAssociation#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getRegularAssociation()
 * @model
 * @generated
 */
public interface RegularAssociation extends Association
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(AssociationEnd)
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getRegularAssociation_From()
   * @model containment="true"
   * @generated
   */
  AssociationEnd getFrom();

  /**
   * Sets the value of the '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.RegularAssociation#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(AssociationEnd value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(AssociationEnd)
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getRegularAssociation_To()
   * @model containment="true"
   * @generated
   */
  AssociationEnd getTo();

  /**
   * Sets the value of the '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.RegularAssociation#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(AssociationEnd value);

} // RegularAssociation