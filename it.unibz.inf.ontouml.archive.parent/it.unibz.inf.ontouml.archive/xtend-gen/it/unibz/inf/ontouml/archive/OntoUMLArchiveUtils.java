package it.unibz.inf.ontouml.archive;

import it.unibz.inf.ontouml.archive.ontoUMLArchive.GeneralizationSet;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Model;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.ModelElement;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class OntoUMLArchiveUtils {
  public final static String STEREOTYPE_KIND = "kind";
  
  public final static String STEREOTYPE_COLLECTIVE = "collective";
  
  public final static String STEREOTYPE_QUANTITY = "quantity";
  
  public final static String STEREOTYPE_SUBKIND = "subkind";
  
  public final static String STEREOTYPE_PHASE = "phase";
  
  public final static String STEREOTYPE_ROLE = "role";
  
  public final static String STEREOTYPE_RELATOR = "relator";
  
  public final static String STEREOTYPE_MODE = "mode";
  
  public final static String STEREOTYPE_QUALITY = "quality";
  
  public final static String STEREOTYPE_CATEGORY = "category";
  
  public final static String STEREOTYPE_ROLE_MIXIN = "roleMixin";
  
  public final static String STEREOTYPE_MIXIN = "mixin";
  
  public final static String STEREOTYPE_EVENT = "event";
  
  public final static String STEREOTYPE_FORMAL = "formal";
  
  public final static String STEREOTYPE_MATERIAL = "material";
  
  public final static String STEREOTYPE_MEDIATION = "mediation";
  
  public final static String STEREOTYPE_CHARACTERIZATION = "characterization";
  
  public final static String STEREOTYPE_MEMBER_OF = "memberOf";
  
  public final static String STEREOTYPE_SUB_COLLECTION_OF = "subCollectionOf";
  
  public final static String STEREOTYPE_COMPONENT_OF = "componentOf";
  
  public final static String STEREOTYPE_SUB_QUANTITY_OF = "subQuantityOf";
  
  public static Set<String> getExpectedClassStereotypes() {
    HashSet<String> _xblockexpression = null;
    {
      final HashSet<String> ret = new HashSet<String>();
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_KIND);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_COLLECTIVE);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_QUANTITY);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_SUBKIND);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_PHASE);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_ROLE);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_CATEGORY);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_ROLE_MIXIN);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_MIXIN);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_EVENT);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_RELATOR);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_MODE);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_QUALITY);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public static Set<String> getExpectedRegularAssociationStereotypes() {
    HashSet<String> _xblockexpression = null;
    {
      final HashSet<String> ret = new HashSet<String>();
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_FORMAL);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_MATERIAL);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_MEDIATION);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_CHARACTERIZATION);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public static Set<String> getExpectedParthoodAssociationStereotypes() {
    HashSet<String> _xblockexpression = null;
    {
      final HashSet<String> ret = new HashSet<String>();
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_MEMBER_OF);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_SUB_COLLECTION_OF);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_COMPONENT_OF);
      ret.add(OntoUMLArchiveUtils.STEREOTYPE_SUB_QUANTITY_OF);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public Model getContainerModel(final ModelElement e) {
    final ModelElement it = e;
    EObject _eContainer = it.eContainer();
    if ((_eContainer instanceof Model)) {
      EObject _eContainer_1 = it.eContainer();
      return ((Model) _eContainer_1);
    } else {
      EObject _eContainer_2 = it.eContainer();
      if ((_eContainer_2 instanceof ModelElement)) {
        EObject _eContainer_3 = it.eContainer();
        return this.getContainerModel(((ModelElement) _eContainer_3));
      } else {
        return null;
      }
    }
  }
  
  public Set<ModelElement> getModelElements(final Model m) {
    final HashSet<ModelElement> ret = new HashSet<ModelElement>();
    final Consumer<ModelElement> _function = (ModelElement it) -> {
      ret.add(it);
      if ((it instanceof GeneralizationSet)) {
        ret.addAll(((GeneralizationSet)it).getGeneralizations());
      }
    };
    m.getElements().forEach(_function);
    return ret;
  }
}
