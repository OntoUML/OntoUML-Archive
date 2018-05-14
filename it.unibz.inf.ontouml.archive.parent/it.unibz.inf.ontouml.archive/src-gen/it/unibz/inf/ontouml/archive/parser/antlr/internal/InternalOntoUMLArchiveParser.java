package it.unibz.inf.ontouml.archive.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_STEREOTYPE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'abstract'", "'class'", "'att'", "':'", "'association'", "'from'", "'to'", "'whole'", "'part'", "'end'", "'{'", "','", "'}'", "'['", "'..'", "']'", "'*'", "'gen'", "'super'", "'sub'", "'dependency'", "'derivation'", "'relation'", "'genset'", "'disjoint'", "'complete'"
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
    // InternalOntoUMLArchive.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOntoUMLArchive.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalOntoUMLArchive.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalOntoUMLArchive.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleModelElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:77:2: ( ( (lv_elements_0_0= ruleModelElement ) )* )
            // InternalOntoUMLArchive.g:78:2: ( (lv_elements_0_0= ruleModelElement ) )*
            {
            // InternalOntoUMLArchive.g:78:2: ( (lv_elements_0_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)||LA1_0==17||LA1_0==30||(LA1_0>=33 && LA1_0<=34)||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:79:3: (lv_elements_0_0= ruleModelElement )
            	    {
            	    // InternalOntoUMLArchive.g:79:3: (lv_elements_0_0= ruleModelElement )
            	    // InternalOntoUMLArchive.g:80:4: lv_elements_0_0= ruleModelElement
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
    // InternalOntoUMLArchive.g:100:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalOntoUMLArchive.g:100:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalOntoUMLArchive.g:101:2: iv_ruleModelElement= ruleModelElement EOF
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
    // InternalOntoUMLArchive.g:107:1: ruleModelElement returns [EObject current=null] : ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Class_0 = null;

        EObject this_Relationship_1 = null;

        EObject this_GeneralizationSet_2 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:113:2: ( ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) )
            // InternalOntoUMLArchive.g:114:2: ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            {
            // InternalOntoUMLArchive.g:114:2: ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            // InternalOntoUMLArchive.g:115:3: (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';'
            {
            // InternalOntoUMLArchive.g:115:3: (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
                {
                alt2=1;
                }
                break;
            case 17:
            case 30:
            case 33:
            case 34:
                {
                alt2=2;
                }
                break;
            case 36:
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
                    // InternalOntoUMLArchive.g:116:4: this_Class_0= ruleClass
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
                    // InternalOntoUMLArchive.g:125:4: this_Relationship_1= ruleRelationship
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
                    // InternalOntoUMLArchive.g:134:4: this_GeneralizationSet_2= ruleGeneralizationSet
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
    // InternalOntoUMLArchive.g:151:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalOntoUMLArchive.g:151:46: (iv_ruleClass= ruleClass EOF )
            // InternalOntoUMLArchive.g:152:2: iv_ruleClass= ruleClass EOF
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
    // InternalOntoUMLArchive.g:158:1: ruleClass returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_stereotypes_3_0=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:164:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* ) )
            // InternalOntoUMLArchive.g:165:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* )
            {
            // InternalOntoUMLArchive.g:165:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* )
            // InternalOntoUMLArchive.g:166:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )*
            {
            // InternalOntoUMLArchive.g:166:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntoUMLArchive.g:167:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalOntoUMLArchive.g:167:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalOntoUMLArchive.g:168:5: lv_isAbstract_0_0= 'abstract'
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
            		
            // InternalOntoUMLArchive.g:184:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalOntoUMLArchive.g:185:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:185:4: (lv_name_2_0= RULE_STRING )
            // InternalOntoUMLArchive.g:186:5: lv_name_2_0= RULE_STRING
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

            // InternalOntoUMLArchive.g:202:3: ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STEREOTYPE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:203:4: (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:203:4: (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:204:5: lv_stereotypes_3_0= RULE_STEREOTYPE_STRING
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

            // InternalOntoUMLArchive.g:220:3: ( (lv_attributes_4_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:221:4: (lv_attributes_4_0= ruleAttribute )
            	    {
            	    // InternalOntoUMLArchive.g:221:4: (lv_attributes_4_0= ruleAttribute )
            	    // InternalOntoUMLArchive.g:222:5: lv_attributes_4_0= ruleAttribute
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
    // InternalOntoUMLArchive.g:243:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOntoUMLArchive.g:243:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOntoUMLArchive.g:244:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOntoUMLArchive.g:250:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_multiplicity_2_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:256:2: ( (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) ) )
            // InternalOntoUMLArchive.g:257:2: (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) )
            {
            // InternalOntoUMLArchive.g:257:2: (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:258:3: otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( (otherlv_4= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttKeyword_0());
            		
            // InternalOntoUMLArchive.g:262:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalOntoUMLArchive.g:263:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:263:4: (lv_name_1_0= RULE_STRING )
            // InternalOntoUMLArchive.g:264:5: lv_name_1_0= RULE_STRING
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

            // InternalOntoUMLArchive.g:280:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:281:4: (lv_multiplicity_2_0= ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:281:4: (lv_multiplicity_2_0= ruleMultiplicity )
            // InternalOntoUMLArchive.g:282:5: lv_multiplicity_2_0= ruleMultiplicity
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
            		
            // InternalOntoUMLArchive.g:303:3: ( (otherlv_4= RULE_STRING ) )
            // InternalOntoUMLArchive.g:304:4: (otherlv_4= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:304:4: (otherlv_4= RULE_STRING )
            // InternalOntoUMLArchive.g:305:5: otherlv_4= RULE_STRING
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
    // InternalOntoUMLArchive.g:320:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalOntoUMLArchive.g:320:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalOntoUMLArchive.g:321:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalOntoUMLArchive.g:327:1: ruleRelationship returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Generalization_1 = null;

        EObject this_DependencyLink_2 = null;

        EObject this_Derivation_3 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:333:2: ( (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation ) )
            // InternalOntoUMLArchive.g:334:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation )
            {
            // InternalOntoUMLArchive.g:334:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            case 34:
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
                    // InternalOntoUMLArchive.g:335:3: this_Association_0= ruleAssociation
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
                    // InternalOntoUMLArchive.g:344:3: this_Generalization_1= ruleGeneralization
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
                    // InternalOntoUMLArchive.g:353:3: this_DependencyLink_2= ruleDependencyLink
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
                    // InternalOntoUMLArchive.g:362:3: this_Derivation_3= ruleDerivation
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
    // InternalOntoUMLArchive.g:374:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalOntoUMLArchive.g:374:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalOntoUMLArchive.g:375:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalOntoUMLArchive.g:381:1: ruleAssociation returns [EObject current=null] : (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryAssociation_0 = null;

        EObject this_NaryAssociation_1 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:387:2: ( (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation ) )
            // InternalOntoUMLArchive.g:388:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )
            {
            // InternalOntoUMLArchive.g:388:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalOntoUMLArchive.g:389:3: this_BinaryAssociation_0= ruleBinaryAssociation
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
                    // InternalOntoUMLArchive.g:398:3: this_NaryAssociation_1= ruleNaryAssociation
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
    // InternalOntoUMLArchive.g:410:1: entryRuleBinaryAssociation returns [EObject current=null] : iv_ruleBinaryAssociation= ruleBinaryAssociation EOF ;
    public final EObject entryRuleBinaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryAssociation = null;


        try {
            // InternalOntoUMLArchive.g:410:58: (iv_ruleBinaryAssociation= ruleBinaryAssociation EOF )
            // InternalOntoUMLArchive.g:411:2: iv_ruleBinaryAssociation= ruleBinaryAssociation EOF
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
    // InternalOntoUMLArchive.g:417:1: ruleBinaryAssociation returns [EObject current=null] : (this_RegularAssociation_0= ruleRegularAssociation | this_ParthoodAssociation_1= ruleParthoodAssociation ) ;
    public final EObject ruleBinaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_RegularAssociation_0 = null;

        EObject this_ParthoodAssociation_1 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:423:2: ( (this_RegularAssociation_0= ruleRegularAssociation | this_ParthoodAssociation_1= ruleParthoodAssociation ) )
            // InternalOntoUMLArchive.g:424:2: (this_RegularAssociation_0= ruleRegularAssociation | this_ParthoodAssociation_1= ruleParthoodAssociation )
            {
            // InternalOntoUMLArchive.g:424:2: (this_RegularAssociation_0= ruleRegularAssociation | this_ParthoodAssociation_1= ruleParthoodAssociation )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalOntoUMLArchive.g:425:3: this_RegularAssociation_0= ruleRegularAssociation
                    {

                    			newCompositeNode(grammarAccess.getBinaryAssociationAccess().getRegularAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularAssociation_0=ruleRegularAssociation();

                    state._fsp--;


                    			current = this_RegularAssociation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:434:3: this_ParthoodAssociation_1= ruleParthoodAssociation
                    {

                    			newCompositeNode(grammarAccess.getBinaryAssociationAccess().getParthoodAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParthoodAssociation_1=ruleParthoodAssociation();

                    state._fsp--;


                    			current = this_ParthoodAssociation_1;
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
    // $ANTLR end "ruleBinaryAssociation"


    // $ANTLR start "entryRuleRegularAssociation"
    // InternalOntoUMLArchive.g:446:1: entryRuleRegularAssociation returns [EObject current=null] : iv_ruleRegularAssociation= ruleRegularAssociation EOF ;
    public final EObject entryRuleRegularAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularAssociation = null;


        try {
            // InternalOntoUMLArchive.g:446:59: (iv_ruleRegularAssociation= ruleRegularAssociation EOF )
            // InternalOntoUMLArchive.g:447:2: iv_ruleRegularAssociation= ruleRegularAssociation EOF
            {
             newCompositeNode(grammarAccess.getRegularAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularAssociation=ruleRegularAssociation();

            state._fsp--;

             current =iv_ruleRegularAssociation; 
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
    // $ANTLR end "entryRuleRegularAssociation"


    // $ANTLR start "ruleRegularAssociation"
    // InternalOntoUMLArchive.g:453:1: ruleRegularAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) ) ;
    public final EObject ruleRegularAssociation() throws RecognitionException {
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
            // InternalOntoUMLArchive.g:459:2: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) ) )
            // InternalOntoUMLArchive.g:460:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:460:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:461:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:465:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoUMLArchive.g:466:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:466:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:467:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getRegularAssociationAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegularAssociationRule());
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

            // InternalOntoUMLArchive.g:483:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STEREOTYPE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:484:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:484:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:485:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_12); 

            	    					newLeafNode(lv_stereotypes_2_0, grammarAccess.getRegularAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRegularAssociationRule());
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
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularAssociationAccess().getFromKeyword_3());
            		
            // InternalOntoUMLArchive.g:505:3: ( (lv_from_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:506:4: (lv_from_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:506:4: (lv_from_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:507:5: lv_from_4_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getRegularAssociationAccess().getFromAssociationEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_from_4_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
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

            			newLeafNode(otherlv_5, grammarAccess.getRegularAssociationAccess().getToKeyword_5());
            		
            // InternalOntoUMLArchive.g:528:3: ( (lv_to_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:529:4: (lv_to_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:529:4: (lv_to_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:530:5: lv_to_6_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getRegularAssociationAccess().getToAssociationEndParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_to_6_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
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
    // $ANTLR end "ruleRegularAssociation"


    // $ANTLR start "entryRuleParthoodAssociation"
    // InternalOntoUMLArchive.g:551:1: entryRuleParthoodAssociation returns [EObject current=null] : iv_ruleParthoodAssociation= ruleParthoodAssociation EOF ;
    public final EObject entryRuleParthoodAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParthoodAssociation = null;


        try {
            // InternalOntoUMLArchive.g:551:60: (iv_ruleParthoodAssociation= ruleParthoodAssociation EOF )
            // InternalOntoUMLArchive.g:552:2: iv_ruleParthoodAssociation= ruleParthoodAssociation EOF
            {
             newCompositeNode(grammarAccess.getParthoodAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParthoodAssociation=ruleParthoodAssociation();

            state._fsp--;

             current =iv_ruleParthoodAssociation; 
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
    // $ANTLR end "entryRuleParthoodAssociation"


    // $ANTLR start "ruleParthoodAssociation"
    // InternalOntoUMLArchive.g:558:1: ruleParthoodAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'whole' ( (lv_whole_4_0= ruleAssociationEnd ) ) otherlv_5= 'part' ( (lv_part_6_0= ruleAssociationEnd ) ) ) ;
    public final EObject ruleParthoodAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_whole_4_0 = null;

        EObject lv_part_6_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:564:2: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'whole' ( (lv_whole_4_0= ruleAssociationEnd ) ) otherlv_5= 'part' ( (lv_part_6_0= ruleAssociationEnd ) ) ) )
            // InternalOntoUMLArchive.g:565:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'whole' ( (lv_whole_4_0= ruleAssociationEnd ) ) otherlv_5= 'part' ( (lv_part_6_0= ruleAssociationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:565:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'whole' ( (lv_whole_4_0= ruleAssociationEnd ) ) otherlv_5= 'part' ( (lv_part_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:566:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'whole' ( (lv_whole_4_0= ruleAssociationEnd ) ) otherlv_5= 'part' ( (lv_part_6_0= ruleAssociationEnd ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getParthoodAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:570:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoUMLArchive.g:571:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:571:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:572:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getParthoodAssociationAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParthoodAssociationRule());
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

            // InternalOntoUMLArchive.g:588:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STEREOTYPE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:589:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:589:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:590:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_16); 

            	    					newLeafNode(lv_stereotypes_2_0, grammarAccess.getParthoodAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getParthoodAssociationRule());
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
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getParthoodAssociationAccess().getWholeKeyword_3());
            		
            // InternalOntoUMLArchive.g:610:3: ( (lv_whole_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:611:4: (lv_whole_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:611:4: (lv_whole_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:612:5: lv_whole_4_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getParthoodAssociationAccess().getWholeAssociationEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_whole_4_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParthoodAssociationRule());
            					}
            					set(
            						current,
            						"whole",
            						lv_whole_4_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getParthoodAssociationAccess().getPartKeyword_5());
            		
            // InternalOntoUMLArchive.g:633:3: ( (lv_part_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:634:4: (lv_part_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:634:4: (lv_part_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:635:5: lv_part_6_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getParthoodAssociationAccess().getPartAssociationEndParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_part_6_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParthoodAssociationRule());
            					}
            					set(
            						current,
            						"part",
            						lv_part_6_0,
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
    // $ANTLR end "ruleParthoodAssociation"


    // $ANTLR start "entryRuleNaryAssociation"
    // InternalOntoUMLArchive.g:656:1: entryRuleNaryAssociation returns [EObject current=null] : iv_ruleNaryAssociation= ruleNaryAssociation EOF ;
    public final EObject entryRuleNaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaryAssociation = null;


        try {
            // InternalOntoUMLArchive.g:656:56: (iv_ruleNaryAssociation= ruleNaryAssociation EOF )
            // InternalOntoUMLArchive.g:657:2: iv_ruleNaryAssociation= ruleNaryAssociation EOF
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
    // InternalOntoUMLArchive.g:663:1: ruleNaryAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ ) ;
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
            // InternalOntoUMLArchive.g:669:2: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ ) )
            // InternalOntoUMLArchive.g:670:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ )
            {
            // InternalOntoUMLArchive.g:670:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ )
            // InternalOntoUMLArchive.g:671:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+
            {
            otherlv_0=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:675:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoUMLArchive.g:676:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:676:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:677:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            // InternalOntoUMLArchive.g:693:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STEREOTYPE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:694:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:694:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:695:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_19); 

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
            	    break loop14;
                }
            } while (true);

            // InternalOntoUMLArchive.g:711:3: (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:712:4: otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) )
            {
            otherlv_3=(Token)match(input,22,FOLLOW_13); 

            				newLeafNode(otherlv_3, grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0());
            			
            // InternalOntoUMLArchive.g:716:4: ( (lv_ends_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:717:5: (lv_ends_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:717:5: (lv_ends_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:718:6: lv_ends_4_0= ruleAssociationEnd
            {

            						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_20);
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

            // InternalOntoUMLArchive.g:736:3: (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:737:4: otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) )
            {
            otherlv_5=(Token)match(input,22,FOLLOW_13); 

            				newLeafNode(otherlv_5, grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0());
            			
            // InternalOntoUMLArchive.g:741:4: ( (lv_ends_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:742:5: (lv_ends_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:742:5: (lv_ends_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:743:6: lv_ends_6_0= ruleAssociationEnd
            {

            						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_20);
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

            // InternalOntoUMLArchive.g:761:3: (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:762:4: otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_13); 

            	    				newLeafNode(otherlv_7, grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0());
            	    			
            	    // InternalOntoUMLArchive.g:766:4: ( (lv_ends_8_0= ruleAssociationEnd ) )
            	    // InternalOntoUMLArchive.g:767:5: (lv_ends_8_0= ruleAssociationEnd )
            	    {
            	    // InternalOntoUMLArchive.g:767:5: (lv_ends_8_0= ruleAssociationEnd )
            	    // InternalOntoUMLArchive.g:768:6: lv_ends_8_0= ruleAssociationEnd
            	    {

            	    						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // InternalOntoUMLArchive.g:790:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalOntoUMLArchive.g:790:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalOntoUMLArchive.g:791:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
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
    // InternalOntoUMLArchive.g:797:1: ruleAssociationEnd returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_multiplicity_1_0= ruleMultiplicity ) ) otherlv_2= ':' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= '{' ( (lv_constraints_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_constraints_7_0= RULE_STRING ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_constraints_5_0=null;
        Token otherlv_6=null;
        Token lv_constraints_7_0=null;
        Token otherlv_8=null;
        EObject lv_multiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:803:2: ( ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_multiplicity_1_0= ruleMultiplicity ) ) otherlv_2= ':' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= '{' ( (lv_constraints_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_constraints_7_0= RULE_STRING ) ) )* otherlv_8= '}' )? ) )
            // InternalOntoUMLArchive.g:804:2: ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_multiplicity_1_0= ruleMultiplicity ) ) otherlv_2= ':' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= '{' ( (lv_constraints_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_constraints_7_0= RULE_STRING ) ) )* otherlv_8= '}' )? )
            {
            // InternalOntoUMLArchive.g:804:2: ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_multiplicity_1_0= ruleMultiplicity ) ) otherlv_2= ':' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= '{' ( (lv_constraints_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_constraints_7_0= RULE_STRING ) ) )* otherlv_8= '}' )? )
            // InternalOntoUMLArchive.g:805:3: ( (lv_name_0_0= RULE_STRING ) )? ( (lv_multiplicity_1_0= ruleMultiplicity ) ) otherlv_2= ':' ( (otherlv_3= RULE_STRING ) ) (otherlv_4= '{' ( (lv_constraints_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_constraints_7_0= RULE_STRING ) ) )* otherlv_8= '}' )?
            {
            // InternalOntoUMLArchive.g:805:3: ( (lv_name_0_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoUMLArchive.g:806:4: (lv_name_0_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:806:4: (lv_name_0_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:807:5: lv_name_0_0= RULE_STRING
                    {
                    lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getAssociationEndAccess().getNameSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociationEndRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:823:3: ( (lv_multiplicity_1_0= ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:824:4: (lv_multiplicity_1_0= ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:824:4: (lv_multiplicity_1_0= ruleMultiplicity )
            // InternalOntoUMLArchive.g:825:5: lv_multiplicity_1_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_multiplicity_1_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_1_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationEndAccess().getColonKeyword_2());
            		
            // InternalOntoUMLArchive.g:846:3: ( (otherlv_3= RULE_STRING ) )
            // InternalOntoUMLArchive.g:847:4: (otherlv_3= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:847:4: (otherlv_3= RULE_STRING )
            // InternalOntoUMLArchive.g:848:5: otherlv_3= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(otherlv_3, grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_3_0());
            				

            }


            }

            // InternalOntoUMLArchive.g:859:3: (otherlv_4= '{' ( (lv_constraints_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_constraints_7_0= RULE_STRING ) ) )* otherlv_8= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoUMLArchive.g:860:4: otherlv_4= '{' ( (lv_constraints_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_constraints_7_0= RULE_STRING ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalOntoUMLArchive.g:864:4: ( (lv_constraints_5_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:865:5: (lv_constraints_5_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:865:5: (lv_constraints_5_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:866:6: lv_constraints_5_0= RULE_STRING
                    {
                    lv_constraints_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_constraints_5_0, grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationEndRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"constraints",
                    							lv_constraints_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalOntoUMLArchive.g:882:4: (otherlv_6= ',' ( (lv_constraints_7_0= RULE_STRING ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==24) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:883:5: otherlv_6= ',' ( (lv_constraints_7_0= RULE_STRING ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssociationEndAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:887:5: ( (lv_constraints_7_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:888:6: (lv_constraints_7_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:888:6: (lv_constraints_7_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:889:7: lv_constraints_7_0= RULE_STRING
                    	    {
                    	    lv_constraints_7_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    	    							newLeafNode(lv_constraints_7_0, grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_4_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssociationEndRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_7_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getAssociationEndAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // InternalOntoUMLArchive.g:915:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalOntoUMLArchive.g:915:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalOntoUMLArchive.g:916:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalOntoUMLArchive.g:922:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lower_1_0 = null;

        AntlrDatatypeRuleToken lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:928:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' ) )
            // InternalOntoUMLArchive.g:929:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' )
            {
            // InternalOntoUMLArchive.g:929:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' )
            // InternalOntoUMLArchive.g:930:3: otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOntoUMLArchive.g:934:3: ( (lv_lower_1_0= ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:935:4: (lv_lower_1_0= ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:935:4: (lv_lower_1_0= ruleCARDINALITY )
            // InternalOntoUMLArchive.g:936:5: lv_lower_1_0= ruleCARDINALITY
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerCARDINALITYParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_2=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalOntoUMLArchive.g:957:3: ( (lv_upper_3_0= ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:958:4: (lv_upper_3_0= ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:958:4: (lv_upper_3_0= ruleCARDINALITY )
            // InternalOntoUMLArchive.g:959:5: lv_upper_3_0= ruleCARDINALITY
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperCARDINALITYParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

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
    // InternalOntoUMLArchive.g:984:1: entryRuleCARDINALITY returns [String current=null] : iv_ruleCARDINALITY= ruleCARDINALITY EOF ;
    public final String entryRuleCARDINALITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCARDINALITY = null;


        try {
            // InternalOntoUMLArchive.g:984:51: (iv_ruleCARDINALITY= ruleCARDINALITY EOF )
            // InternalOntoUMLArchive.g:985:2: iv_ruleCARDINALITY= ruleCARDINALITY EOF
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
    // InternalOntoUMLArchive.g:991:1: ruleCARDINALITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCARDINALITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:997:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalOntoUMLArchive.g:998:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalOntoUMLArchive.g:998:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_INT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoUMLArchive.g:999:3: kw= '*'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:1005:3: this_INT_1= RULE_INT
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
    // InternalOntoUMLArchive.g:1016:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalOntoUMLArchive.g:1016:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalOntoUMLArchive.g:1017:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalOntoUMLArchive.g:1023:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) ) ;
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
            // InternalOntoUMLArchive.g:1029:2: ( (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) ) )
            // InternalOntoUMLArchive.g:1030:2: (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) )
            {
            // InternalOntoUMLArchive.g:1030:2: (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:1031:3: otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGenKeyword_0());
            		
            // InternalOntoUMLArchive.g:1035:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoUMLArchive.g:1036:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1036:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1037:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

            otherlv_2=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getSuperKeyword_2());
            		
            // InternalOntoUMLArchive.g:1057:3: ( (otherlv_3= RULE_STRING ) )
            // InternalOntoUMLArchive.g:1058:4: (otherlv_3= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1058:4: (otherlv_3= RULE_STRING )
            // InternalOntoUMLArchive.g:1059:5: otherlv_3= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralizationAccess().getSubKeyword_4());
            		
            // InternalOntoUMLArchive.g:1074:3: ( (otherlv_5= RULE_STRING ) )
            // InternalOntoUMLArchive.g:1075:4: (otherlv_5= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1075:4: (otherlv_5= RULE_STRING )
            // InternalOntoUMLArchive.g:1076:5: otherlv_5= RULE_STRING
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
    // InternalOntoUMLArchive.g:1091:1: entryRuleDependencyLink returns [EObject current=null] : iv_ruleDependencyLink= ruleDependencyLink EOF ;
    public final EObject entryRuleDependencyLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyLink = null;


        try {
            // InternalOntoUMLArchive.g:1091:55: (iv_ruleDependencyLink= ruleDependencyLink EOF )
            // InternalOntoUMLArchive.g:1092:2: iv_ruleDependencyLink= ruleDependencyLink EOF
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
    // InternalOntoUMLArchive.g:1098:1: ruleDependencyLink returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'to' ( (otherlv_6= RULE_STRING ) ) ) ;
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
            // InternalOntoUMLArchive.g:1104:2: ( (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'to' ( (otherlv_6= RULE_STRING ) ) ) )
            // InternalOntoUMLArchive.g:1105:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'to' ( (otherlv_6= RULE_STRING ) ) )
            {
            // InternalOntoUMLArchive.g:1105:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'to' ( (otherlv_6= RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:1106:3: otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'to' ( (otherlv_6= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0());
            		
            // InternalOntoUMLArchive.g:1110:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOntoUMLArchive.g:1111:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1111:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1112:5: lv_name_1_0= RULE_STRING
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

            // InternalOntoUMLArchive.g:1128:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STEREOTYPE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1129:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:1129:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:1130:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
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
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyLinkAccess().getFromKeyword_3());
            		
            // InternalOntoUMLArchive.g:1150:3: ( (otherlv_4= RULE_STRING ) )
            // InternalOntoUMLArchive.g:1151:4: (otherlv_4= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1151:4: (otherlv_4= RULE_STRING )
            // InternalOntoUMLArchive.g:1152:5: otherlv_4= RULE_STRING
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
            		
            // InternalOntoUMLArchive.g:1167:3: ( (otherlv_6= RULE_STRING ) )
            // InternalOntoUMLArchive.g:1168:4: (otherlv_6= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1168:4: (otherlv_6= RULE_STRING )
            // InternalOntoUMLArchive.g:1169:5: otherlv_6= RULE_STRING
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
    // InternalOntoUMLArchive.g:1184:1: entryRuleDerivation returns [EObject current=null] : iv_ruleDerivation= ruleDerivation EOF ;
    public final EObject entryRuleDerivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivation = null;


        try {
            // InternalOntoUMLArchive.g:1184:51: (iv_ruleDerivation= ruleDerivation EOF )
            // InternalOntoUMLArchive.g:1185:2: iv_ruleDerivation= ruleDerivation EOF
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
    // InternalOntoUMLArchive.g:1191:1: ruleDerivation returns [EObject current=null] : (otherlv_0= 'derivation' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) ) ;
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
            // InternalOntoUMLArchive.g:1197:2: ( (otherlv_0= 'derivation' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) ) )
            // InternalOntoUMLArchive.g:1198:2: (otherlv_0= 'derivation' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:1198:2: (otherlv_0= 'derivation' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) )
            // InternalOntoUMLArchive.g:1199:3: otherlv_0= 'derivation' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivationAccess().getDerivationKeyword_0());
            		
            // InternalOntoUMLArchive.g:1203:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOntoUMLArchive.g:1204:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1204:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1205:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            // InternalOntoUMLArchive.g:1221:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STEREOTYPE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1222:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:1222:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:1223:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_31); 

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
            	    break loop24;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivationAccess().getClassKeyword_3());
            		
            // InternalOntoUMLArchive.g:1243:3: ( (lv_class_4_0= ruleClassDerivationEnd ) )
            // InternalOntoUMLArchive.g:1244:4: (lv_class_4_0= ruleClassDerivationEnd )
            {
            // InternalOntoUMLArchive.g:1244:4: (lv_class_4_0= ruleClassDerivationEnd )
            // InternalOntoUMLArchive.g:1245:5: lv_class_4_0= ruleClassDerivationEnd
            {

            					newCompositeNode(grammarAccess.getDerivationAccess().getClassClassDerivationEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_5=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getDerivationAccess().getRelationKeyword_5());
            		
            // InternalOntoUMLArchive.g:1266:3: ( (lv_part_6_0= ruleRelationDerivationEnd ) )
            // InternalOntoUMLArchive.g:1267:4: (lv_part_6_0= ruleRelationDerivationEnd )
            {
            // InternalOntoUMLArchive.g:1267:4: (lv_part_6_0= ruleRelationDerivationEnd )
            // InternalOntoUMLArchive.g:1268:5: lv_part_6_0= ruleRelationDerivationEnd
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
    // InternalOntoUMLArchive.g:1289:1: entryRuleClassDerivationEnd returns [EObject current=null] : iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF ;
    public final EObject entryRuleClassDerivationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDerivationEnd = null;


        try {
            // InternalOntoUMLArchive.g:1289:59: (iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF )
            // InternalOntoUMLArchive.g:1290:2: iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF
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
    // InternalOntoUMLArchive.g:1296:1: ruleClassDerivationEnd returns [EObject current=null] : ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) ;
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
            // InternalOntoUMLArchive.g:1302:2: ( ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) )
            // InternalOntoUMLArchive.g:1303:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            {
            // InternalOntoUMLArchive.g:1303:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            // InternalOntoUMLArchive.g:1304:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            {
            // InternalOntoUMLArchive.g:1304:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:1305:4: (lv_multiplicity_0_0= ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:1305:4: (lv_multiplicity_0_0= ruleMultiplicity )
            // InternalOntoUMLArchive.g:1306:5: lv_multiplicity_0_0= ruleMultiplicity
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

            // InternalOntoUMLArchive.g:1323:3: ( (otherlv_1= RULE_STRING ) )
            // InternalOntoUMLArchive.g:1324:4: (otherlv_1= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1324:4: (otherlv_1= RULE_STRING )
            // InternalOntoUMLArchive.g:1325:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDerivationEndRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getClassDerivationEndAccess().getEndTypeClassCrossReference_1_0());
            				

            }


            }

            // InternalOntoUMLArchive.g:1336:3: (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoUMLArchive.g:1337:4: otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassDerivationEndAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalOntoUMLArchive.g:1341:4: ( (lv_constraints_3_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:1342:5: (lv_constraints_3_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1342:5: (lv_constraints_3_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1343:6: lv_constraints_3_0= RULE_STRING
                    {
                    lv_constraints_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

                    // InternalOntoUMLArchive.g:1359:4: (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==24) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:1360:5: otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getClassDerivationEndAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:1364:5: ( (lv_constraints_5_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:1365:6: (lv_constraints_5_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:1365:6: (lv_constraints_5_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:1366:7: lv_constraints_5_0= RULE_STRING
                    	    {
                    	    lv_constraints_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_2); 

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
    // InternalOntoUMLArchive.g:1392:1: entryRuleRelationDerivationEnd returns [EObject current=null] : iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF ;
    public final EObject entryRuleRelationDerivationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDerivationEnd = null;


        try {
            // InternalOntoUMLArchive.g:1392:62: (iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF )
            // InternalOntoUMLArchive.g:1393:2: iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF
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
    // InternalOntoUMLArchive.g:1399:1: ruleRelationDerivationEnd returns [EObject current=null] : ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) ;
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
            // InternalOntoUMLArchive.g:1405:2: ( ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) )
            // InternalOntoUMLArchive.g:1406:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            {
            // InternalOntoUMLArchive.g:1406:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            // InternalOntoUMLArchive.g:1407:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) ) ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            {
            // InternalOntoUMLArchive.g:1407:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:1408:4: (lv_multiplicity_0_0= ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:1408:4: (lv_multiplicity_0_0= ruleMultiplicity )
            // InternalOntoUMLArchive.g:1409:5: lv_multiplicity_0_0= ruleMultiplicity
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

            // InternalOntoUMLArchive.g:1426:3: ( (otherlv_1= RULE_STRING ) )
            // InternalOntoUMLArchive.g:1427:4: (otherlv_1= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1427:4: (otherlv_1= RULE_STRING )
            // InternalOntoUMLArchive.g:1428:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationDerivationEndRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationCrossReference_1_0());
            				

            }


            }

            // InternalOntoUMLArchive.g:1439:3: (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoUMLArchive.g:1440:4: otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationDerivationEndAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalOntoUMLArchive.g:1444:4: ( (lv_constraints_3_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:1445:5: (lv_constraints_3_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1445:5: (lv_constraints_3_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1446:6: lv_constraints_3_0= RULE_STRING
                    {
                    lv_constraints_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

                    // InternalOntoUMLArchive.g:1462:4: (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==24) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:1463:5: otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRelationDerivationEndAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:1467:5: ( (lv_constraints_5_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:1468:6: (lv_constraints_5_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:1468:6: (lv_constraints_5_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:1469:7: lv_constraints_5_0= RULE_STRING
                    	    {
                    	    lv_constraints_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_2); 

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
    // InternalOntoUMLArchive.g:1495:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoUMLArchive.g:1495:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoUMLArchive.g:1496:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
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
    // InternalOntoUMLArchive.g:1502:1: ruleGeneralizationSet returns [EObject current=null] : (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDisjoint_2_0=null;
        Token lv_isComplete_3_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalizations_5_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1508:2: ( (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ ) )
            // InternalOntoUMLArchive.g:1509:2: (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ )
            {
            // InternalOntoUMLArchive.g:1509:2: (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ )
            // InternalOntoUMLArchive.g:1510:3: otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0());
            		
            // InternalOntoUMLArchive.g:1514:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) )
            // InternalOntoUMLArchive.g:1515:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) )
            {
            // InternalOntoUMLArchive.g:1515:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) )
            // InternalOntoUMLArchive.g:1516:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            				
            // InternalOntoUMLArchive.g:1519:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* )
            // InternalOntoUMLArchive.g:1520:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )*
            {
            // InternalOntoUMLArchive.g:1520:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( LA29_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                    alt29=1;
                }
                else if ( LA29_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1521:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:1521:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )
            	    // InternalOntoUMLArchive.g:1522:5: {...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalOntoUMLArchive.g:1522:114: ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    // InternalOntoUMLArchive.g:1523:6: ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalOntoUMLArchive.g:1526:9: ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    // InternalOntoUMLArchive.g:1526:10: {...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUMLArchive.g:1526:19: ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    // InternalOntoUMLArchive.g:1526:20: (lv_isDisjoint_2_0= 'disjoint' )
            	    {
            	    // InternalOntoUMLArchive.g:1526:20: (lv_isDisjoint_2_0= 'disjoint' )
            	    // InternalOntoUMLArchive.g:1527:10: lv_isDisjoint_2_0= 'disjoint'
            	    {
            	    lv_isDisjoint_2_0=(Token)match(input,37,FOLLOW_33); 

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
            	    // InternalOntoUMLArchive.g:1544:4: ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:1544:4: ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) )
            	    // InternalOntoUMLArchive.g:1545:5: {...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalOntoUMLArchive.g:1545:114: ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) )
            	    // InternalOntoUMLArchive.g:1546:6: ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalOntoUMLArchive.g:1549:9: ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) )
            	    // InternalOntoUMLArchive.g:1549:10: {...}? => ( (lv_isComplete_3_0= 'complete' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUMLArchive.g:1549:19: ( (lv_isComplete_3_0= 'complete' ) )
            	    // InternalOntoUMLArchive.g:1549:20: (lv_isComplete_3_0= 'complete' )
            	    {
            	    // InternalOntoUMLArchive.g:1549:20: (lv_isComplete_3_0= 'complete' )
            	    // InternalOntoUMLArchive.g:1550:10: lv_isComplete_3_0= 'complete'
            	    {
            	    lv_isComplete_3_0=(Token)match(input,38,FOLLOW_33); 

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
            	    break loop29;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            				

            }

            // InternalOntoUMLArchive.g:1574:3: ( (lv_name_4_0= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoUMLArchive.g:1575:4: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1575:4: (lv_name_4_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1576:5: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            // InternalOntoUMLArchive.g:1592:3: ( (lv_generalizations_5_0= ruleGeneralization ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==30) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1593:4: (lv_generalizations_5_0= ruleGeneralization )
            	    {
            	    // InternalOntoUMLArchive.g:1593:4: (lv_generalizations_5_0= ruleGeneralization )
            	    // InternalOntoUMLArchive.g:1594:5: lv_generalizations_5_0= ruleGeneralization
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\21\1\4\2\5\2\uffff";
    static final String dfa_3s = "\1\21\3\26\2\uffff";
    static final String dfa_4s = "\4\uffff\1\2\1\1";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\3\14\uffff\1\5\1\uffff\1\5\1\uffff\1\4",
            "\1\3\14\uffff\1\5\1\uffff\1\5\1\uffff\1\4",
            "\1\3\14\uffff\1\5\1\uffff\1\5\1\uffff\1\4",
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
            return "388:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )";
        }
    }
    static final String dfa_7s = "\1\21\3\24\2\uffff";
    static final String[] dfa_8s = {
            "\1\1",
            "\1\2\1\3\14\uffff\1\5\1\uffff\1\4",
            "\1\3\14\uffff\1\5\1\uffff\1\4",
            "\1\3\14\uffff\1\5\1\uffff\1\4",
            "",
            ""
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final short[][] dfa_8 = unpackEncodedStringArray(dfa_8s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_7;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "424:2: (this_RegularAssociation_0= ruleRegularAssociation | this_ParthoodAssociation_1= ruleParthoodAssociation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001640026002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006040000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000002L});

}
