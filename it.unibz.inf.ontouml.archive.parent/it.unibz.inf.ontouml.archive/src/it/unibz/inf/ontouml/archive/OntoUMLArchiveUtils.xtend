package it.unibz.inf.ontouml.archive

import it.unibz.inf.ontouml.archive.ontoUMLArchive.Model
import it.unibz.inf.ontouml.archive.ontoUMLArchive.ModelElement
import java.util.Set
import java.util.HashSet
import it.unibz.inf.ontouml.archive.ontoUMLArchive.GeneralizationSet

class OntoUMLArchiveUtils {
	
//	@Inject extension OntoUMLArchiveUtils

	public static val STEREOTYPE_KIND = "kind"
	public static val STEREOTYPE_COLLECTIVE = "collective"
	public static val STEREOTYPE_QUANTITY = "quantity"
	public static val STEREOTYPE_SUBKIND = "subkind"
	public static val STEREOTYPE_PHASE = "phase"
	public static val STEREOTYPE_ROLE = "role"
	public static val STEREOTYPE_RELATOR = "relator"
	public static val STEREOTYPE_MODE = "mode"
	public static val STEREOTYPE_QUALITY = "quality"
	public static val STEREOTYPE_CATEGORY = "category"
	public static val STEREOTYPE_ROLE_MIXIN = "roleMixin"
	public static val STEREOTYPE_MIXIN = "mixin"
	public static val STEREOTYPE_EVENT = "event"
	
	public static val STEREOTYPE_FORMAL = "formal"
	public static val STEREOTYPE_MATERIAL = "material"
	public static val STEREOTYPE_MEDIATION = "mediation"
	public static val STEREOTYPE_CHARACTERIZATION = "characterization"
	
	public static val STEREOTYPE_MEMBER_OF = "memberOf"
	public static val STEREOTYPE_SUB_COLLECTION_OF = "subCollectionOf"
	public static val STEREOTYPE_COMPONENT_OF = "componentOf"
	public static val STEREOTYPE_SUB_QUANTITY_OF = "subQuantityOf"
	
//	public static val STEREOTYPE_ = ""
	
	static def Set<String> getExpectedClassStereotypes() {
		val ret = new HashSet<String>();
		ret.add(STEREOTYPE_KIND) ret.add(STEREOTYPE_COLLECTIVE) ret.add(STEREOTYPE_QUANTITY)
		ret.add(STEREOTYPE_SUBKIND) ret.add(STEREOTYPE_PHASE) ret.add(STEREOTYPE_ROLE)
		ret.add(STEREOTYPE_CATEGORY) ret.add(STEREOTYPE_ROLE_MIXIN) ret.add(STEREOTYPE_MIXIN)
		ret.add(STEREOTYPE_EVENT) ret.add(STEREOTYPE_RELATOR) ret.add(STEREOTYPE_MODE) ret.add(STEREOTYPE_QUALITY)
		ret
	}
	
	static def Set<String> getExpectedRegularAssociationStereotypes() {
		val ret = new HashSet<String>()
		ret.add(STEREOTYPE_FORMAL) ret.add(STEREOTYPE_MATERIAL)
		ret.add(STEREOTYPE_MEDIATION) ret.add(STEREOTYPE_CHARACTERIZATION)
		ret
	}
	
	static def Set<String> getExpectedParthoodAssociationStereotypes() {
		val ret = new HashSet<String>()
		ret.add(STEREOTYPE_MEMBER_OF) ret.add(STEREOTYPE_SUB_COLLECTION_OF)
		ret.add(STEREOTYPE_COMPONENT_OF) ret.add(STEREOTYPE_SUB_QUANTITY_OF)
		ret
	}
	
	def Model getContainerModel(ModelElement e) {
		val it = e
		if(eContainer instanceof Model)
			return eContainer as Model
		else if(eContainer instanceof ModelElement)
			return (eContainer as ModelElement).containerModel
		else
			return null
	}
	
	def Set<ModelElement> getModelElements(Model m) {
		val ret = new HashSet<ModelElement>()
		m.elements.forEach[ 
			ret.add(it)
			if(it instanceof GeneralizationSet) ret.addAll(it.generalizations)
		]
		return ret
	}

}