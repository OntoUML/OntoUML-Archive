/*
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.serializer;

import com.google.inject.Inject;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.DependencyLink;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Generalization;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.GeneralizationSet;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Model;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Multiplicity;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.NaryAssociation;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.RegularAssociation;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Stereotype;
import it.unibz.inf.ontouml.archive.services.OntoUMLArchiveGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class OntoUMLArchiveSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OntoUMLArchiveGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OntoUMLArchivePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OntoUMLArchivePackage.ASSOCIATION_END:
				sequence_AssociationEnd(context, (AssociationEnd) semanticObject); 
				return; 
			case OntoUMLArchivePackage.CLASS:
				sequence_Class(context, (it.unibz.inf.ontouml.archive.ontoUMLArchive.Class) semanticObject); 
				return; 
			case OntoUMLArchivePackage.DEPENDENCY_LINK:
				sequence_DependencyLink(context, (DependencyLink) semanticObject); 
				return; 
			case OntoUMLArchivePackage.GENERALIZATION:
				sequence_Generalization(context, (Generalization) semanticObject); 
				return; 
			case OntoUMLArchivePackage.GENERALIZATION_SET:
				sequence_GeneralizationSet(context, (GeneralizationSet) semanticObject); 
				return; 
			case OntoUMLArchivePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case OntoUMLArchivePackage.MULTIPLICITY:
				sequence_Multiplicity(context, (Multiplicity) semanticObject); 
				return; 
			case OntoUMLArchivePackage.NARY_ASSOCIATION:
				sequence_NaryAssociation(context, (NaryAssociation) semanticObject); 
				return; 
			case OntoUMLArchivePackage.REGULAR_ASSOCIATION:
				sequence_RegularAssociation(context, (RegularAssociation) semanticObject); 
				return; 
			case OntoUMLArchivePackage.STEREOTYPE:
				sequence_Stereotype(context, (Stereotype) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AssociationEnd returns AssociationEnd
	 *
	 * Constraint:
	 *     (name=STRING? multiplicity=Multiplicity endType=[Class|STRING])
	 */
	protected void sequence_AssociationEnd(ISerializationContext context, AssociationEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (isAbstract?='abstract'? name=STRING stereotype=Stereotype?)
	 */
	protected void sequence_Class(ISerializationContext context, it.unibz.inf.ontouml.archive.ontoUMLArchive.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns DependencyLink
	 *     Relationship returns DependencyLink
	 *     DependencyLink returns DependencyLink
	 *
	 * Constraint:
	 *     (name=STRING? from=[Class|STRING] to=[Class|STRING])
	 */
	protected void sequence_DependencyLink(ISerializationContext context, DependencyLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns GeneralizationSet
	 *     GeneralizationSet returns GeneralizationSet
	 *
	 * Constraint:
	 *     ((isDisjoint?='disjoint' | isComplete?='complete')* name=STRING? generalizations+=Generalization+)
	 */
	protected void sequence_GeneralizationSet(ISerializationContext context, GeneralizationSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns Generalization
	 *     Relationship returns Generalization
	 *     Generalization returns Generalization
	 *
	 * Constraint:
	 *     (name=STRING? super=[Class|STRING] sub=[Class|STRING])
	 */
	protected void sequence_Generalization(ISerializationContext context, Generalization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elments+=ModelElement+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Multiplicity returns Multiplicity
	 *
	 * Constraint:
	 *     (lower=CARDINALITY upper=CARDINALITY)
	 */
	protected void sequence_Multiplicity(ISerializationContext context, Multiplicity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OntoUMLArchivePackage.Literals.MULTIPLICITY__LOWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OntoUMLArchivePackage.Literals.MULTIPLICITY__LOWER));
			if (transientValues.isValueTransient(semanticObject, OntoUMLArchivePackage.Literals.MULTIPLICITY__UPPER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OntoUMLArchivePackage.Literals.MULTIPLICITY__UPPER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicityAccess().getLowerCARDINALITYParserRuleCall_1_0(), semanticObject.getLower());
		feeder.accept(grammarAccess.getMultiplicityAccess().getUpperCARDINALITYParserRuleCall_3_0(), semanticObject.getUpper());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns NaryAssociation
	 *     Relationship returns NaryAssociation
	 *     Association returns NaryAssociation
	 *     NaryAssociation returns NaryAssociation
	 *
	 * Constraint:
	 *     (name=STRING? stereotype=Stereotype? ends+=AssociationEnd ends+=AssociationEnd ends+=AssociationEnd+)
	 */
	protected void sequence_NaryAssociation(ISerializationContext context, NaryAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelElement returns RegularAssociation
	 *     Relationship returns RegularAssociation
	 *     Association returns RegularAssociation
	 *     RegularAssociation returns RegularAssociation
	 *
	 * Constraint:
	 *     (name=STRING? stereotype=Stereotype? from=AssociationEnd to=AssociationEnd)
	 */
	protected void sequence_RegularAssociation(ISerializationContext context, RegularAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Stereotype returns Stereotype
	 *
	 * Constraint:
	 *     name=STEREOTYPE_STRING
	 */
	protected void sequence_Stereotype(ISerializationContext context, Stereotype semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OntoUMLArchivePackage.Literals.STEREOTYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OntoUMLArchivePackage.Literals.STEREOTYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStereotypeAccess().getNameSTEREOTYPE_STRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}