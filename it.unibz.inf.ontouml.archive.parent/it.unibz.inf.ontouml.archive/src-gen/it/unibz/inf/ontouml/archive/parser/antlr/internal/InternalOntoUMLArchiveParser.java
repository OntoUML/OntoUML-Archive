package it.unibz.inf.ontouml.archive.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unibz.inf.ontouml.archive.services.OntoUMLArchiveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoUMLArchiveParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_STEREOTYPE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'abstract'", "'class'", "'att'", "':'", "'association'", "'from'", "'to'", "'end'", "'{'", "','", "'}'", "'['", "'..'", "']'", "'*'", "'gen'", "'super'", "'sub'", "'dependency'", "'derivation'", "'relation'", "'genset'", "'disjoint'", "'complete'", "'shared'", "'composite'"
    };
    public static final int RULE_STEREOTYPE_STRING=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOntoUMLArchiveParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOntoUMLArchiveParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOntoUMLArchiveParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOntoUMLArchive.g"; }



     	private OntoUMLArchiveGrammarAccess grammarAccess;

        public InternalOntoUMLArchiveParser(TokenStream input, OntoUMLArchiveGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected OntoUMLArchiveGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalOntoUMLArchive.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOntoUMLArchive.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalOntoUMLArchive.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOntoUMLArchive.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleModelElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:78:2: ( ( (lv_elements_0_0= ruleModelElement ) )* )
            // InternalOntoUMLArchive.g:79:2: ( (lv_elements_0_0= ruleModelElement ) )*
            {
            // InternalOntoUMLArchive.g:79:2: ( (lv_elements_0_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)||LA1_0==17||LA1_0==28||(LA1_0>=31 && LA1_0<=32)||LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:80:3: (lv_elements_0_0= ruleModelElement )
            	    {
            	    // InternalOntoUMLArchive.g:80:3: (lv_elements_0_0= ruleModelElement )
            	    // InternalOntoUMLArchive.g:81:4: lv_elements_0_0= ruleModelElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleModelElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"it.unibz.inf.ontouml.archive.OntoUMLArchive.ModelElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoUMLArchive.g:101:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalOntoUMLArchive.g:101:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalOntoUMLArchive.g:102:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalOntoUMLArchive.g:108:1: ruleModelElement returns [EObject current=null] : ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Class_0 = null;

        EObject this_Relationship_1 = null;

        EObject this_GeneralizationSet_2 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:114:2: ( ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) )
            // InternalOntoUMLArchive.g:115:2: ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            {
            // InternalOntoUMLArchive.g:115:2: ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            // InternalOntoUMLArchive.g:116:3: (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';'
            {
            // InternalOntoUMLArchive.g:116:3: (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt2=1;
                }
                break;
            case 17:
            case 28:
            case 31:
            case 32:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOntoUMLArchive.g:117:4: this_Class_0= ruleClass
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getClassParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    				current = this_Class_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:126:4: this_Relationship_1= ruleRelationship
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getRelationshipParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_Relationship_1=ruleRelationship();

                    state._fsp--;


                    				current = this_Relationship_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalOntoUMLArchive.g:135:4: this_GeneralizationSet_2= ruleGeneralizationSet
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_4);
                    this_GeneralizationSet_2=ruleGeneralizationSet();

                    state._fsp--;


                    				current = this_GeneralizationSet_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getModelElementAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleClass"
    // InternalOntoUMLArchive.g:152:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalOntoUMLArchive.g:152:46: (iv_ruleClass= ruleClass EOF )
            // InternalOntoUMLArchive.g:153:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalOntoUMLArchive.g:159:1: ruleClass returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_stereotypes_3_0=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:165:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* ) )
            // InternalOntoUMLArchive.g:166:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* )
            {
            // InternalOntoUMLArchive.g:166:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* )
            // InternalOntoUMLArchive.g:167:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )*
            {
            // InternalOntoUMLArchive.g:167:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntoUMLArchive.g:168:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalOntoUMLArchive.g:168:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalOntoUMLArchive.g:169:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,13,FOLLOW_5); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalOntoUMLArchive.g:185:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalOntoUMLArchive.g:186:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:186:4: (lv_name_2_0= RULE_STRING )
            // InternalOntoUMLArchive.g:187:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOntoUMLArchive.g:203:3: ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STEREOTYPE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:204:4: (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:204:4: (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:205:5: lv_stereotypes_3_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_3_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_7); 

            	    					newLeafNode(lv_stereotypes_3_0, grammarAccess.getClassAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getClassRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"stereotypes",
            	    						lv_stereotypes_3_0,
            	    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.STEREOTYPE_STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalOntoUMLArchive.g:221:3: ( (lv_attributes_4_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:222:4: (lv_attributes_4_0= ruleAttribute )
            	    {
            	    // InternalOntoUMLArchive.g:222:4: (lv_attributes_4_0= ruleAttribute )
            	    // InternalOntoUMLArchive.g:223:5: lv_attributes_4_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_4_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
            	    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalOntoUMLArchive.g:244:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOntoUMLArchive.g:244:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOntoUMLArchive.g:245:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalOntoUMLArchive.g:251:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_multiplicity_2_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:257:2: ( (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) ) )
            // InternalOntoUMLArchive.g:258:2: (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) )
            {
            // InternalOntoUMLArchive.g:258:2: (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:259:3: otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttKeyword_0());
            		
            // InternalOntoUMLArchive.g:263:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalOntoUMLArchive.g:264:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:264:4: (lv_name_1_0= RULE_STRING )
            // InternalOntoUMLArchive.g:265:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOntoUMLArchive.g:281:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:282:4: (lv_multiplicity_2_0= ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:282:4: (lv_multiplicity_2_0= ruleMultiplicity )
            // InternalOntoUMLArchive.g:283:5: lv_multiplicity_2_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_multiplicity_2_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_2_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalOntoUMLArchive.g:304:3: ( (otherlv_4= RULE_STRING ) )
            // InternalOntoUMLArchive.g:305:4: (otherlv_4= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:305:4: (otherlv_4= RULE_STRING )
            // InternalOntoUMLArchive.g:306:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getAttTypeClassCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // InternalOntoUMLArchive.g:321:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalOntoUMLArchive.g:321:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalOntoUMLArchive.g:322:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalOntoUMLArchive.g:328:1: ruleRelationship returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Generalization_1 = null;

        EObject this_DependencyLink_2 = null;

        EObject this_Derivation_3 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:334:2: ( (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation ) )
            // InternalOntoUMLArchive.g:335:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation )
            {
            // InternalOntoUMLArchive.g:335:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalOntoUMLArchive.g:336:3: this_Association_0= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_0=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:345:3: this_Generalization_1= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getGeneralizationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_1=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntoUMLArchive.g:354:3: this_DependencyLink_2= ruleDependencyLink
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getDependencyLinkParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DependencyLink_2=ruleDependencyLink();

                    state._fsp--;


                    			current = this_DependencyLink_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntoUMLArchive.g:363:3: this_Derivation_3= ruleDerivation
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getDerivationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Derivation_3=ruleDerivation();

                    state._fsp--;


                    			current = this_Derivation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleAssociation"
    // InternalOntoUMLArchive.g:375:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalOntoUMLArchive.g:375:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalOntoUMLArchive.g:376:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalOntoUMLArchive.g:382:1: ruleAssociation returns [EObject current=null] : (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryAssociation_0 = null;

        EObject this_NaryAssociation_1 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:388:2: ( (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation ) )
            // InternalOntoUMLArchive.g:389:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )
            {
            // InternalOntoUMLArchive.g:389:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalOntoUMLArchive.g:390:3: this_BinaryAssociation_0= ruleBinaryAssociation
                    {

                    			newCompositeNode(grammarAccess.getAssociationAccess().getBinaryAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryAssociation_0=ruleBinaryAssociation();

                    state._fsp--;


                    			current = this_BinaryAssociation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:399:3: this_NaryAssociation_1= ruleNaryAssociation
                    {

                    			newCompositeNode(grammarAccess.getAssociationAccess().getNaryAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NaryAssociation_1=ruleNaryAssociation();

                    state._fsp--;


                    			current = this_NaryAssociation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleBinaryAssociation"
    // InternalOntoUMLArchive.g:411:1: entryRuleBinaryAssociation returns [EObject current=null] : iv_ruleBinaryAssociation= ruleBinaryAssociation EOF ;
    public final EObject entryRuleBinaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryAssociation = null;


        try {
            // InternalOntoUMLArchive.g:411:58: (iv_ruleBinaryAssociation= ruleBinaryAssociation EOF )
            // InternalOntoUMLArchive.g:412:2: iv_ruleBinaryAssociation= ruleBinaryAssociation EOF
            {
             newCompositeNode(grammarAccess.getBinaryAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryAssociation=ruleBinaryAssociation();

            state._fsp--;

             current =iv_ruleBinaryAssociation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryAssociation"


    // $ANTLR start "ruleBinaryAssociation"
    // InternalOntoUMLArchive.g:418:1: ruleBinaryAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) ) ;
    public final EObject ruleBinaryAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_from_4_0 = null;

        EObject lv_to_6_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:424:2: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) ) )
            // InternalOntoUMLArchive.g:425:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:425:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:426:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:430:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoUMLArchive.g:431:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:431:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:432:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getBinaryAssociationAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBinaryAssociationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:448:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STEREOTYPE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:449:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:449:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:450:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_12); 

            	    					newLeafNode(lv_stereotypes_2_0, grammarAccess.getBinaryAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getBinaryAssociationRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"stereotypes",
            	    						lv_stereotypes_2_0,
            	    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.STEREOTYPE_STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getBinaryAssociationAccess().getFromKeyword_3());
            		
            // InternalOntoUMLArchive.g:470:3: ( (lv_from_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:471:4: (lv_from_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:471:4: (lv_from_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:472:5: lv_from_4_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getBinaryAssociationAccess().getFromAssociationEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_from_4_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryAssociationRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_4_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getBinaryAssociationAccess().getToKeyword_5());
            		
            // InternalOntoUMLArchive.g:493:3: ( (lv_to_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:494:4: (lv_to_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:494:4: (lv_to_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:495:5: lv_to_6_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getBinaryAssociationAccess().getToAssociationEndParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_to_6_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryAssociationRule());
            					}
            					set(
            						current,
            						"to",
            						lv_to_6_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryAssociation"


    // $ANTLR start "entryRuleNaryAssociation"
    // InternalOntoUMLArchive.g:516:1: entryRuleNaryAssociation returns [EObject current=null] : iv_ruleNaryAssociation= ruleNaryAssociation EOF ;
    public final EObject entryRuleNaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaryAssociation = null;


        try {
            // InternalOntoUMLArchive.g:516:56: (iv_ruleNaryAssociation= ruleNaryAssociation EOF )
            // InternalOntoUMLArchive.g:517:2: iv_ruleNaryAssociation= ruleNaryAssociation EOF
            {
             newCompositeNode(grammarAccess.getNaryAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNaryAssociation=ruleNaryAssociation();

            state._fsp--;

             current =iv_ruleNaryAssociation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNaryAssociation"


    // $ANTLR start "ruleNaryAssociation"
    // InternalOntoUMLArchive.g:523:1: ruleNaryAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ ) ;
    public final EObject ruleNaryAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ends_4_0 = null;

        EObject lv_ends_6_0 = null;

        EObject lv_ends_8_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:529:2: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ ) )
            // InternalOntoUMLArchive.g:530:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ )
            {
            // InternalOntoUMLArchive.g:530:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ )
            // InternalOntoUMLArchive.g:531:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+
            {
            otherlv_0=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:535:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUMLArchive.g:536:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:536:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:537:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getNaryAssociationAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNaryAssociationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:553:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STEREOTYPE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:554:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:554:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:555:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_16); 

            	    					newLeafNode(lv_stereotypes_2_0, grammarAccess.getNaryAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNaryAssociationRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"stereotypes",
            	    						lv_stereotypes_2_0,
            	    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.STEREOTYPE_STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalOntoUMLArchive.g:571:3: (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:572:4: otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) )
            {
            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            				newLeafNode(otherlv_3, grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0());
            			
            // InternalOntoUMLArchive.g:576:4: ( (lv_ends_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:577:5: (lv_ends_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:577:5: (lv_ends_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:578:6: lv_ends_4_0= ruleAssociationEnd
            {

            						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_17);
            lv_ends_4_0=ruleAssociationEnd();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getNaryAssociationRule());
            						}
            						add(
            							current,
            							"ends",
            							lv_ends_4_0,
            							"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOntoUMLArchive.g:596:3: (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:597:4: otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) )
            {
            otherlv_5=(Token)match(input,20,FOLLOW_13); 

            				newLeafNode(otherlv_5, grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0());
            			
            // InternalOntoUMLArchive.g:601:4: ( (lv_ends_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:602:5: (lv_ends_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:602:5: (lv_ends_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:603:6: lv_ends_6_0= ruleAssociationEnd
            {

            						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_17);
            lv_ends_6_0=ruleAssociationEnd();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getNaryAssociationRule());
            						}
            						add(
            							current,
            							"ends",
            							lv_ends_6_0,
            							"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOntoUMLArchive.g:621:3: (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:622:4: otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_7, grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0());
            	    			
            	    // InternalOntoUMLArchive.g:626:4: ( (lv_ends_8_0= ruleAssociationEnd ) )
            	    // InternalOntoUMLArchive.g:627:5: (lv_ends_8_0= ruleAssociationEnd )
            	    {
            	    // InternalOntoUMLArchive.g:627:5: (lv_ends_8_0= ruleAssociationEnd )
            	    // InternalOntoUMLArchive.g:628:6: lv_ends_8_0= ruleAssociationEnd
            	    {

            	    						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_ends_8_0=ruleAssociationEnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNaryAssociationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ends",
            	    							lv_ends_8_0,
            	    							"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNaryAssociation"


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalOntoUMLArchive.g:650:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalOntoUMLArchive.g:650:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalOntoUMLArchive.g:651:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
            {
             newCompositeNode(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationEnd=ruleAssociationEnd();

            state._fsp--;

             current =iv_ruleAssociationEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalOntoUMLArchive.g:657:1: ruleAssociationEnd returns [EObject current=null] : ( ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )? ( (lv_name_1_0= RULE_STRING ) )? ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_constraints_6_0=null;
        Token otherlv_7=null;
        Token lv_constraints_8_0=null;
        Token otherlv_9=null;
        Enumerator lv_aggregationKind_0_0 = null;

        EObject lv_multiplicity_2_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:663:2: ( ( ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )? ( (lv_name_1_0= RULE_STRING ) )? ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? ) )
            // InternalOntoUMLArchive.g:664:2: ( ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )? ( (lv_name_1_0= RULE_STRING ) )? ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? )
            {
            // InternalOntoUMLArchive.g:664:2: ( ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )? ( (lv_name_1_0= RULE_STRING ) )? ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? )
            // InternalOntoUMLArchive.g:665:3: ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )? ( (lv_name_1_0= RULE_STRING ) )? ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )?
            {
            // InternalOntoUMLArchive.g:665:3: ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=37 && LA13_0<=38)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoUMLArchive.g:666:4: (lv_aggregationKind_0_0= ruleAggregationKindDeclaration )
                    {
                    // InternalOntoUMLArchive.g:666:4: (lv_aggregationKind_0_0= ruleAggregationKindDeclaration )
                    // InternalOntoUMLArchive.g:667:5: lv_aggregationKind_0_0= ruleAggregationKindDeclaration
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndAccess().getAggregationKindAggregationKindDeclarationEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_aggregationKind_0_0=ruleAggregationKindDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
                    					}
                    					set(
                    						current,
                    						"aggregationKind",
                    						lv_aggregationKind_0_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.AggregationKindDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:684:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoUMLArchive.g:685:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:685:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:686:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getAssociationEndAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationEndRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:702:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:703:4: (lv_multiplicity_2_0= ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:703:4: (lv_multiplicity_2_0= ruleMultiplicity )
            // InternalOntoUMLArchive.g:704:5: lv_multiplicity_2_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_multiplicity_2_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_2_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationEndAccess().getColonKeyword_3());
            		
            // InternalOntoUMLArchive.g:725:3: ( (otherlv_4= RULE_STRING ) )
            // InternalOntoUMLArchive.g:726:4: (otherlv_4= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:726:4: (otherlv_4= RULE_STRING )
            // InternalOntoUMLArchive.g:727:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(otherlv_4, grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_4_0());
            				

            }


            }

            // InternalOntoUMLArchive.g:738:3: (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoUMLArchive.g:739:4: otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalOntoUMLArchive.g:743:4: ( (lv_constraints_6_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:744:5: (lv_constraints_6_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:744:5: (lv_constraints_6_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:745:6: lv_constraints_6_0= RULE_STRING
                    {
                    lv_constraints_6_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_constraints_6_0, grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationEndRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"constraints",
                    							lv_constraints_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalOntoUMLArchive.g:761:4: (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==22) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:762:5: otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAssociationEndAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:766:5: ( (lv_constraints_8_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:767:6: (lv_constraints_8_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:767:6: (lv_constraints_8_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:768:7: lv_constraints_8_0= RULE_STRING
                    	    {
                    	    lv_constraints_8_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    	    							newLeafNode(lv_constraints_8_0, grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_5_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssociationEndRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_8_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssociationEndAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalOntoUMLArchive.g:794:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalOntoUMLArchive.g:794:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalOntoUMLArchive.g:795:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalOntoUMLArchive.g:801:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lower_1_0 = null;

        AntlrDatatypeRuleToken lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:807:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' ) )
            // InternalOntoUMLArchive.g:808:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' )
            {
            // InternalOntoUMLArchive.g:808:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' )
            // InternalOntoUMLArchive.g:809:3: otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOntoUMLArchive.g:813:3: ( (lv_lower_1_0= ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:814:4: (lv_lower_1_0= ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:814:4: (lv_lower_1_0= ruleCARDINALITY )
            // InternalOntoUMLArchive.g:815:5: lv_lower_1_0= ruleCARDINALITY
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerCARDINALITYParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_lower_1_0=ruleCARDINALITY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicityRule());
            					}
            					set(
            						current,
            						"lower",
            						lv_lower_1_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.CARDINALITY");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalOntoUMLArchive.g:836:3: ( (lv_upper_3_0= ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:837:4: (lv_upper_3_0= ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:837:4: (lv_upper_3_0= ruleCARDINALITY )
            // InternalOntoUMLArchive.g:838:5: lv_upper_3_0= ruleCARDINALITY
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperCARDINALITYParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_upper_3_0=ruleCARDINALITY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicityRule());
            					}
            					set(
            						current,
            						"upper",
            						lv_upper_3_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.CARDINALITY");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleCARDINALITY"
    // InternalOntoUMLArchive.g:863:1: entryRuleCARDINALITY returns [String current=null] : iv_ruleCARDINALITY= ruleCARDINALITY EOF ;
    public final String entryRuleCARDINALITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCARDINALITY = null;


        try {
            // InternalOntoUMLArchive.g:863:51: (iv_ruleCARDINALITY= ruleCARDINALITY EOF )
            // InternalOntoUMLArchive.g:864:2: iv_ruleCARDINALITY= ruleCARDINALITY EOF
            {
             newCompositeNode(grammarAccess.getCARDINALITYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCARDINALITY=ruleCARDINALITY();

            state._fsp--;

             current =iv_ruleCARDINALITY.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCARDINALITY"


    // $ANTLR start "ruleCARDINALITY"
    // InternalOntoUMLArchive.g:870:1: ruleCARDINALITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCARDINALITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:876:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalOntoUMLArchive.g:877:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalOntoUMLArchive.g:877:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalOntoUMLArchive.g:878:3: kw= '*'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:884:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getCARDINALITYAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCARDINALITY"


    // $ANTLR start "entryRuleGeneralization"
    // InternalOntoUMLArchive.g:895:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalOntoUMLArchive.g:895:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalOntoUMLArchive.g:896:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalOntoUMLArchive.g:902:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:908:2: ( (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) ) )
            // InternalOntoUMLArchive.g:909:2: (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) )
            {
            // InternalOntoUMLArchive.g:909:2: (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:910:3: otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGenKeyword_0());
            		
            // InternalOntoUMLArchive.g:914:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoUMLArchive.g:915:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:915:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:916:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getGeneralizationAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGeneralizationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getSuperKeyword_2());
            		
            // InternalOntoUMLArchive.g:936:3: ( (otherlv_3= RULE_STRING ) )
            // InternalOntoUMLArchive.g:937:4: (otherlv_3= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:937:4: (otherlv_3= RULE_STRING )
            // InternalOntoUMLArchive.g:938:5: otherlv_3= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralizationAccess().getSubKeyword_4());
            		
            // InternalOntoUMLArchive.g:953:3: ( (otherlv_5= RULE_STRING ) )
            // InternalOntoUMLArchive.g:954:4: (otherlv_5= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:954:4: (otherlv_5= RULE_STRING )
            // InternalOntoUMLArchive.g:955:5: otherlv_5= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getSubClassCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleDependencyLink"
    // InternalOntoUMLArchive.g:970:1: entryRuleDependencyLink returns [EObject current=null] : iv_ruleDependencyLink= ruleDependencyLink EOF ;
    public final EObject entryRuleDependencyLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyLink = null;


        try {
            // InternalOntoUMLArchive.g:970:55: (iv_ruleDependencyLink= ruleDependencyLink EOF )
            // InternalOntoUMLArchive.g:971:2: iv_ruleDependencyLink= ruleDependencyLink EOF
            {
             newCompositeNode(grammarAccess.getDependencyLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyLink=ruleDependencyLink();

            state._fsp--;

             current =iv_ruleDependencyLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencyLink"


    // $ANTLR start "ruleDependencyLink"
    // InternalOntoUMLArchive.g:977:1: ruleDependencyLink returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'to' ( (otherlv_6= RULE_STRING ) ) ) ;
    public final EObject ruleDependencyLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:983:2: ( (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'to' ( (otherlv_6= RULE_STRING ) ) ) )
            // InternalOntoUMLArchive.g:984:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'to' ( (otherlv_6= RULE_STRING ) ) )
            {
            // InternalOntoUMLArchive.g:984:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'to' ( (otherlv_6= RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:985:3: otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'to' ( (otherlv_6= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0());
            		
            // InternalOntoUMLArchive.g:989:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoUMLArchive.g:990:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:990:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:991:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getDependencyLinkAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDependencyLinkRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:1007:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STEREOTYPE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1008:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:1008:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:1009:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_12); 

            	    					newLeafNode(lv_stereotypes_2_0, grammarAccess.getDependencyLinkAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDependencyLinkRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"stereotypes",
            	    						lv_stereotypes_2_0,
            	    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.STEREOTYPE_STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyLinkAccess().getFromKeyword_3());
            		
            // InternalOntoUMLArchive.g:1029:3: ( (otherlv_4= RULE_STRING ) )
            // InternalOntoUMLArchive.g:1030:4: (otherlv_4= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1030:4: (otherlv_4= RULE_STRING )
            // InternalOntoUMLArchive.g:1031:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyLinkRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(otherlv_4, grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDependencyLinkAccess().getToKeyword_5());
            		
            // InternalOntoUMLArchive.g:1046:3: ( (otherlv_6= RULE_STRING ) )
            // InternalOntoUMLArchive.g:1047:4: (otherlv_6= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1047:4: (otherlv_6= RULE_STRING )
            // InternalOntoUMLArchive.g:1048:5: otherlv_6= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyLinkRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getDependencyLinkAccess().getToClassCrossReference_6_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencyLink"


    // $ANTLR start "entryRuleDerivation"
    // InternalOntoUMLArchive.g:1063:1: entryRuleDerivation returns [EObject current=null] : iv_ruleDerivation= ruleDerivation EOF ;
    public final EObject entryRuleDerivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivation = null;


        try {
            // InternalOntoUMLArchive.g:1063:51: (iv_ruleDerivation= ruleDerivation EOF )
            // InternalOntoUMLArchive.g:1064:2: iv_ruleDerivation= ruleDerivation EOF
            {
             newCompositeNode(grammarAccess.getDerivationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivation=ruleDerivation();

            state._fsp--;

             current =iv_ruleDerivation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDerivation"


    // $ANTLR start "ruleDerivation"
    // InternalOntoUMLArchive.g:1070:1: ruleDerivation returns [EObject current=null] : (otherlv_0= 'derivation' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) ) ;
    public final EObject ruleDerivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_class_4_0 = null;

        EObject lv_part_6_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1076:2: ( (otherlv_0= 'derivation' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) ) )
            // InternalOntoUMLArchive.g:1077:2: (otherlv_0= 'derivation' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:1077:2: (otherlv_0= 'derivation' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) )
            // InternalOntoUMLArchive.g:1078:3: otherlv_0= 'derivation' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivationAccess().getDerivationKeyword_0());
            		
            // InternalOntoUMLArchive.g:1082:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOntoUMLArchive.g:1083:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1083:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1084:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getDerivationAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDerivationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:1100:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STEREOTYPE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1101:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:1101:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:1102:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_29); 

            	    					newLeafNode(lv_stereotypes_2_0, grammarAccess.getDerivationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDerivationRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"stereotypes",
            	    						lv_stereotypes_2_0,
            	    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.STEREOTYPE_STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivationAccess().getClassKeyword_3());
            		
            // InternalOntoUMLArchive.g:1122:3: ( (lv_class_4_0= ruleClassDerivationEnd ) )
            // InternalOntoUMLArchive.g:1123:4: (lv_class_4_0= ruleClassDerivationEnd )
            {
            // InternalOntoUMLArchive.g:1123:4: (lv_class_4_0= ruleClassDerivationEnd )
            // InternalOntoUMLArchive.g:1124:5: lv_class_4_0= ruleClassDerivationEnd
            {

            					newCompositeNode(grammarAccess.getDerivationAccess().getClassClassDerivationEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_class_4_0=ruleClassDerivationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDerivationRule());
            					}
            					set(
            						current,
            						"class",
            						lv_class_4_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.ClassDerivationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getDerivationAccess().getRelationKeyword_5());
            		
            // InternalOntoUMLArchive.g:1145:3: ( (lv_part_6_0= ruleRelationDerivationEnd ) )
            // InternalOntoUMLArchive.g:1146:4: (lv_part_6_0= ruleRelationDerivationEnd )
            {
            // InternalOntoUMLArchive.g:1146:4: (lv_part_6_0= ruleRelationDerivationEnd )
            // InternalOntoUMLArchive.g:1147:5: lv_part_6_0= ruleRelationDerivationEnd
            {

            					newCompositeNode(grammarAccess.getDerivationAccess().getPartRelationDerivationEndParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_part_6_0=ruleRelationDerivationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDerivationRule());
            					}
            					set(
            						current,
            						"part",
            						lv_part_6_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.RelationDerivationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDerivation"


    // $ANTLR start "entryRuleClassDerivationEnd"
    // InternalOntoUMLArchive.g:1168:1: entryRuleClassDerivationEnd returns [EObject current=null] : iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF ;
    public final EObject entryRuleClassDerivationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDerivationEnd = null;


        try {
            // InternalOntoUMLArchive.g:1168:59: (iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF )
            // InternalOntoUMLArchive.g:1169:2: iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF
            {
             newCompositeNode(grammarAccess.getClassDerivationEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDerivationEnd=ruleClassDerivationEnd();

            state._fsp--;

             current =iv_ruleClassDerivationEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDerivationEnd"


    // $ANTLR start "ruleClassDerivationEnd"
    // InternalOntoUMLArchive.g:1175:1: ruleClassDerivationEnd returns [EObject current=null] : ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleClassDerivationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_constraints_3_0=null;
        Token otherlv_4=null;
        Token lv_constraints_5_0=null;
        Token otherlv_6=null;
        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1181:2: ( ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) )
            // InternalOntoUMLArchive.g:1182:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            {
            // InternalOntoUMLArchive.g:1182:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            // InternalOntoUMLArchive.g:1183:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            {
            // InternalOntoUMLArchive.g:1183:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:1184:4: (lv_multiplicity_0_0= ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:1184:4: (lv_multiplicity_0_0= ruleMultiplicity )
            // InternalOntoUMLArchive.g:1185:5: lv_multiplicity_0_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getClassDerivationEndAccess().getMultiplicityMultiplicityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_multiplicity_0_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDerivationEndRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_0_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUMLArchive.g:1202:3: ( (otherlv_1= RULE_STRING ) )
            // InternalOntoUMLArchive.g:1203:4: (otherlv_1= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1203:4: (otherlv_1= RULE_STRING )
            // InternalOntoUMLArchive.g:1204:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDerivationEndRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getClassDerivationEndAccess().getEndTypeClassCrossReference_1_0());
            				

            }


            }

            // InternalOntoUMLArchive.g:1215:3: (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOntoUMLArchive.g:1216:4: otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassDerivationEndAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalOntoUMLArchive.g:1220:4: ( (lv_constraints_3_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:1221:5: (lv_constraints_3_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1221:5: (lv_constraints_3_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1222:6: lv_constraints_3_0= RULE_STRING
                    {
                    lv_constraints_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_constraints_3_0, grammarAccess.getClassDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassDerivationEndRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"constraints",
                    							lv_constraints_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalOntoUMLArchive.g:1238:4: (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==22) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:1239:5: otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getClassDerivationEndAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:1243:5: ( (lv_constraints_5_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:1244:6: (lv_constraints_5_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:1244:6: (lv_constraints_5_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:1245:7: lv_constraints_5_0= RULE_STRING
                    	    {
                    	    lv_constraints_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    	    							newLeafNode(lv_constraints_5_0, grammarAccess.getClassDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassDerivationEndRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassDerivationEndAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDerivationEnd"


    // $ANTLR start "entryRuleRelationDerivationEnd"
    // InternalOntoUMLArchive.g:1271:1: entryRuleRelationDerivationEnd returns [EObject current=null] : iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF ;
    public final EObject entryRuleRelationDerivationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDerivationEnd = null;


        try {
            // InternalOntoUMLArchive.g:1271:62: (iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF )
            // InternalOntoUMLArchive.g:1272:2: iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF
            {
             newCompositeNode(grammarAccess.getRelationDerivationEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationDerivationEnd=ruleRelationDerivationEnd();

            state._fsp--;

             current =iv_ruleRelationDerivationEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationDerivationEnd"


    // $ANTLR start "ruleRelationDerivationEnd"
    // InternalOntoUMLArchive.g:1278:1: ruleRelationDerivationEnd returns [EObject current=null] : ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleRelationDerivationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_constraints_3_0=null;
        Token otherlv_4=null;
        Token lv_constraints_5_0=null;
        Token otherlv_6=null;
        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1284:2: ( ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) )
            // InternalOntoUMLArchive.g:1285:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            {
            // InternalOntoUMLArchive.g:1285:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            // InternalOntoUMLArchive.g:1286:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            {
            // InternalOntoUMLArchive.g:1286:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:1287:4: (lv_multiplicity_0_0= ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:1287:4: (lv_multiplicity_0_0= ruleMultiplicity )
            // InternalOntoUMLArchive.g:1288:5: lv_multiplicity_0_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getRelationDerivationEndAccess().getMultiplicityMultiplicityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_multiplicity_0_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationDerivationEndRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_0_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUMLArchive.g:1305:3: ( (otherlv_1= RULE_STRING ) )
            // InternalOntoUMLArchive.g:1306:4: (otherlv_1= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1306:4: (otherlv_1= RULE_STRING )
            // InternalOntoUMLArchive.g:1307:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationDerivationEndRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationCrossReference_1_0());
            				

            }


            }

            // InternalOntoUMLArchive.g:1318:3: (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoUMLArchive.g:1319:4: otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationDerivationEndAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalOntoUMLArchive.g:1323:4: ( (lv_constraints_3_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:1324:5: (lv_constraints_3_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1324:5: (lv_constraints_3_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1325:6: lv_constraints_3_0= RULE_STRING
                    {
                    lv_constraints_3_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_constraints_3_0, grammarAccess.getRelationDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationDerivationEndRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"constraints",
                    							lv_constraints_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalOntoUMLArchive.g:1341:4: (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==22) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:1342:5: otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRelationDerivationEndAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:1346:5: ( (lv_constraints_5_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:1347:6: (lv_constraints_5_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:1347:6: (lv_constraints_5_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:1348:7: lv_constraints_5_0= RULE_STRING
                    	    {
                    	    lv_constraints_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    	    							newLeafNode(lv_constraints_5_0, grammarAccess.getRelationDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRelationDerivationEndRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationDerivationEndAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationDerivationEnd"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoUMLArchive.g:1374:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoUMLArchive.g:1374:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoUMLArchive.g:1375:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();

            state._fsp--;

             current =iv_ruleGeneralizationSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalOntoUMLArchive.g:1381:1: ruleGeneralizationSet returns [EObject current=null] : (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDisjoint_2_0=null;
        Token lv_isComplete_3_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalizations_5_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1387:2: ( (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ ) )
            // InternalOntoUMLArchive.g:1388:2: (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ )
            {
            // InternalOntoUMLArchive.g:1388:2: (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ )
            // InternalOntoUMLArchive.g:1389:3: otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0());
            		
            // InternalOntoUMLArchive.g:1393:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) )
            // InternalOntoUMLArchive.g:1394:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) )
            {
            // InternalOntoUMLArchive.g:1394:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) )
            // InternalOntoUMLArchive.g:1395:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            				
            // InternalOntoUMLArchive.g:1398:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* )
            // InternalOntoUMLArchive.g:1399:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )*
            {
            // InternalOntoUMLArchive.g:1399:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1400:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:1400:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )
            	    // InternalOntoUMLArchive.g:1401:5: {...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalOntoUMLArchive.g:1401:114: ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    // InternalOntoUMLArchive.g:1402:6: ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalOntoUMLArchive.g:1405:9: ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    // InternalOntoUMLArchive.g:1405:10: {...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUMLArchive.g:1405:19: ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    // InternalOntoUMLArchive.g:1405:20: (lv_isDisjoint_2_0= 'disjoint' )
            	    {
            	    // InternalOntoUMLArchive.g:1405:20: (lv_isDisjoint_2_0= 'disjoint' )
            	    // InternalOntoUMLArchive.g:1406:10: lv_isDisjoint_2_0= 'disjoint'
            	    {
            	    lv_isDisjoint_2_0=(Token)match(input,35,FOLLOW_31); 

            	    										newLeafNode(lv_isDisjoint_2_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    										}
            	    										setWithLastConsumed(current, "isDisjoint", true, "disjoint");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOntoUMLArchive.g:1423:4: ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:1423:4: ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) )
            	    // InternalOntoUMLArchive.g:1424:5: {...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalOntoUMLArchive.g:1424:114: ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) )
            	    // InternalOntoUMLArchive.g:1425:6: ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalOntoUMLArchive.g:1428:9: ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) )
            	    // InternalOntoUMLArchive.g:1428:10: {...}? => ( (lv_isComplete_3_0= 'complete' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUMLArchive.g:1428:19: ( (lv_isComplete_3_0= 'complete' ) )
            	    // InternalOntoUMLArchive.g:1428:20: (lv_isComplete_3_0= 'complete' )
            	    {
            	    // InternalOntoUMLArchive.g:1428:20: (lv_isComplete_3_0= 'complete' )
            	    // InternalOntoUMLArchive.g:1429:10: lv_isComplete_3_0= 'complete'
            	    {
            	    lv_isComplete_3_0=(Token)match(input,36,FOLLOW_31); 

            	    										newLeafNode(lv_isComplete_3_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    										}
            	    										setWithLastConsumed(current, "isComplete", true, "complete");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            				

            }

            // InternalOntoUMLArchive.g:1453:3: ( (lv_name_4_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoUMLArchive.g:1454:4: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1454:4: (lv_name_4_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1455:5: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    					newLeafNode(lv_name_4_0, grammarAccess.getGeneralizationSetAccess().getNameSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:1471:3: ( (lv_generalizations_5_0= ruleGeneralization ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1472:4: (lv_generalizations_5_0= ruleGeneralization )
            	    {
            	    // InternalOntoUMLArchive.g:1472:4: (lv_generalizations_5_0= ruleGeneralization )
            	    // InternalOntoUMLArchive.g:1473:5: lv_generalizations_5_0= ruleGeneralization
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_generalizations_5_0=ruleGeneralization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGeneralizationSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"generalizations",
            	    						lv_generalizations_5_0,
            	    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Generalization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "ruleAggregationKindDeclaration"
    // InternalOntoUMLArchive.g:1494:1: ruleAggregationKindDeclaration returns [Enumerator current=null] : ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleAggregationKindDeclaration() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1500:2: ( ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalOntoUMLArchive.g:1501:2: ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalOntoUMLArchive.g:1501:2: ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            else if ( (LA30_0==38) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoUMLArchive.g:1502:3: (enumLiteral_0= 'shared' )
                    {
                    // InternalOntoUMLArchive.g:1502:3: (enumLiteral_0= 'shared' )
                    // InternalOntoUMLArchive.g:1503:4: enumLiteral_0= 'shared'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:1510:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalOntoUMLArchive.g:1510:3: (enumLiteral_1= 'composite' )
                    // InternalOntoUMLArchive.g:1511:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindDeclarationAccess().getCompositeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAggregationKindDeclarationAccess().getCompositeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAggregationKindDeclaration"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\21\1\4\2\5\2\uffff";
    static final String dfa_3s = "\1\21\3\24\2\uffff";
    static final String dfa_4s = "\4\uffff\1\2\1\1";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\3\14\uffff\1\5\1\uffff\1\4",
            "\1\3\14\uffff\1\5\1\uffff\1\4",
            "\1\3\14\uffff\1\5\1\uffff\1\4",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "389:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000590026002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000006001000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001810000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000002L});

}
