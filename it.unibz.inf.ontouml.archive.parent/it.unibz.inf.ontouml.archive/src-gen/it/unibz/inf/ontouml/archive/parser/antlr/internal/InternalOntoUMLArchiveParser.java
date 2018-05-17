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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_STEREOTYPE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'publication'", "'authors'", "'ontology'", "';'", "'abstract'", "'class'", "'att'", "':'", "'association'", "'from'", "'to'", "'end'", "'{'", "','", "'}'", "'['", "'..'", "']'", "'*'", "'gen'", "'super'", "'sub'", "'dependency'", "'derivation'", "'relation'", "'genset'", "'disjoint'", "'complete'", "'shared'", "'composite'", "'navigable'", "'nonnavigable'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
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
    public static final int RULE_STEREOTYPE_STRING=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalOntoUMLArchive.g:72:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'publication' ( (lv_publicationTitle_1_0= RULE_STRING ) ) )? (otherlv_2= 'authors' ( (lv_authors_3_0= RULE_STRING ) ) )? (otherlv_4= 'ontology' ( (lv_ontologyName_5_0= RULE_STRING ) ) )? ( (lv_elements_6_0= ruleModelElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_publicationTitle_1_0=null;
        Token otherlv_2=null;
        Token lv_authors_3_0=null;
        Token otherlv_4=null;
        Token lv_ontologyName_5_0=null;
        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:78:2: ( ( (otherlv_0= 'publication' ( (lv_publicationTitle_1_0= RULE_STRING ) ) )? (otherlv_2= 'authors' ( (lv_authors_3_0= RULE_STRING ) ) )? (otherlv_4= 'ontology' ( (lv_ontologyName_5_0= RULE_STRING ) ) )? ( (lv_elements_6_0= ruleModelElement ) )* ) )
            // InternalOntoUMLArchive.g:79:2: ( (otherlv_0= 'publication' ( (lv_publicationTitle_1_0= RULE_STRING ) ) )? (otherlv_2= 'authors' ( (lv_authors_3_0= RULE_STRING ) ) )? (otherlv_4= 'ontology' ( (lv_ontologyName_5_0= RULE_STRING ) ) )? ( (lv_elements_6_0= ruleModelElement ) )* )
            {
            // InternalOntoUMLArchive.g:79:2: ( (otherlv_0= 'publication' ( (lv_publicationTitle_1_0= RULE_STRING ) ) )? (otherlv_2= 'authors' ( (lv_authors_3_0= RULE_STRING ) ) )? (otherlv_4= 'ontology' ( (lv_ontologyName_5_0= RULE_STRING ) ) )? ( (lv_elements_6_0= ruleModelElement ) )* )
            // InternalOntoUMLArchive.g:80:3: (otherlv_0= 'publication' ( (lv_publicationTitle_1_0= RULE_STRING ) ) )? (otherlv_2= 'authors' ( (lv_authors_3_0= RULE_STRING ) ) )? (otherlv_4= 'ontology' ( (lv_ontologyName_5_0= RULE_STRING ) ) )? ( (lv_elements_6_0= ruleModelElement ) )*
            {
            // InternalOntoUMLArchive.g:80:3: (otherlv_0= 'publication' ( (lv_publicationTitle_1_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOntoUMLArchive.g:81:4: otherlv_0= 'publication' ( (lv_publicationTitle_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPublicationKeyword_0_0());
                    			
                    // InternalOntoUMLArchive.g:85:4: ( (lv_publicationTitle_1_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:86:5: (lv_publicationTitle_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:86:5: (lv_publicationTitle_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:87:6: lv_publicationTitle_1_0= RULE_STRING
                    {
                    lv_publicationTitle_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_publicationTitle_1_0, grammarAccess.getModelAccess().getPublicationTitleSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"publicationTitle",
                    							lv_publicationTitle_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:104:3: (otherlv_2= 'authors' ( (lv_authors_3_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOntoUMLArchive.g:105:4: otherlv_2= 'authors' ( (lv_authors_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getAuthorsKeyword_1_0());
                    			
                    // InternalOntoUMLArchive.g:109:4: ( (lv_authors_3_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:110:5: (lv_authors_3_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:110:5: (lv_authors_3_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:111:6: lv_authors_3_0= RULE_STRING
                    {
                    lv_authors_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_authors_3_0, grammarAccess.getModelAccess().getAuthorsSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"authors",
                    							lv_authors_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:128:3: (otherlv_4= 'ontology' ( (lv_ontologyName_5_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntoUMLArchive.g:129:4: otherlv_4= 'ontology' ( (lv_ontologyName_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getOntologyKeyword_2_0());
                    			
                    // InternalOntoUMLArchive.g:133:4: ( (lv_ontologyName_5_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:134:5: (lv_ontologyName_5_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:134:5: (lv_ontologyName_5_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:135:6: lv_ontologyName_5_0= RULE_STRING
                    {
                    lv_ontologyName_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_ontologyName_5_0, grammarAccess.getModelAccess().getOntologyNameSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ontologyName",
                    							lv_ontologyName_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:152:3: ( (lv_elements_6_0= ruleModelElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=17)||LA4_0==20||LA4_0==31||(LA4_0>=34 && LA4_0<=35)||LA4_0==37) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:153:4: (lv_elements_6_0= ruleModelElement )
            	    {
            	    // InternalOntoUMLArchive.g:153:4: (lv_elements_6_0= ruleModelElement )
            	    // InternalOntoUMLArchive.g:154:5: lv_elements_6_0= ruleModelElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_6_0=ruleModelElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.ModelElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoUMLArchive.g:175:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalOntoUMLArchive.g:175:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalOntoUMLArchive.g:176:2: iv_ruleModelElement= ruleModelElement EOF
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
    // InternalOntoUMLArchive.g:182:1: ruleModelElement returns [EObject current=null] : ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Class_0 = null;

        EObject this_Relationship_1 = null;

        EObject this_GeneralizationSet_2 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:188:2: ( ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' ) )
            // InternalOntoUMLArchive.g:189:2: ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            {
            // InternalOntoUMLArchive.g:189:2: ( (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';' )
            // InternalOntoUMLArchive.g:190:3: (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet ) otherlv_3= ';'
            {
            // InternalOntoUMLArchive.g:190:3: (this_Class_0= ruleClass | this_Relationship_1= ruleRelationship | this_GeneralizationSet_2= ruleGeneralizationSet )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
                {
                alt5=1;
                }
                break;
            case 20:
            case 31:
            case 34:
            case 35:
                {
                alt5=2;
                }
                break;
            case 37:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalOntoUMLArchive.g:191:4: this_Class_0= ruleClass
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getClassParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    				current = this_Class_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:200:4: this_Relationship_1= ruleRelationship
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getRelationshipParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_Relationship_1=ruleRelationship();

                    state._fsp--;


                    				current = this_Relationship_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalOntoUMLArchive.g:209:4: this_GeneralizationSet_2= ruleGeneralizationSet
                    {

                    				newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_7);
                    this_GeneralizationSet_2=ruleGeneralizationSet();

                    state._fsp--;


                    				current = this_GeneralizationSet_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // InternalOntoUMLArchive.g:226:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalOntoUMLArchive.g:226:46: (iv_ruleClass= ruleClass EOF )
            // InternalOntoUMLArchive.g:227:2: iv_ruleClass= ruleClass EOF
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
    // InternalOntoUMLArchive.g:233:1: ruleClass returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleStringOrID ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token lv_stereotypes_3_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:239:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleStringOrID ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* ) )
            // InternalOntoUMLArchive.g:240:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleStringOrID ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* )
            {
            // InternalOntoUMLArchive.g:240:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleStringOrID ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )* )
            // InternalOntoUMLArchive.g:241:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= ruleStringOrID ) ) ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )* ( (lv_attributes_4_0= ruleAttribute ) )*
            {
            // InternalOntoUMLArchive.g:241:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUMLArchive.g:242:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalOntoUMLArchive.g:242:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalOntoUMLArchive.g:243:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalOntoUMLArchive.g:259:3: ( (lv_name_2_0= ruleStringOrID ) )
            // InternalOntoUMLArchive.g:260:4: (lv_name_2_0= ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:260:4: (lv_name_2_0= ruleStringOrID )
            // InternalOntoUMLArchive.g:261:5: lv_name_2_0= ruleStringOrID
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameStringOrIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_2_0=ruleStringOrID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.StringOrID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUMLArchive.g:278:3: ( (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STEREOTYPE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:279:4: (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:279:4: (lv_stereotypes_3_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:280:5: lv_stereotypes_3_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_3_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_10); 

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
            	    break loop7;
                }
            } while (true);

            // InternalOntoUMLArchive.g:296:3: ( (lv_attributes_4_0= ruleAttribute ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:297:4: (lv_attributes_4_0= ruleAttribute )
            	    {
            	    // InternalOntoUMLArchive.g:297:4: (lv_attributes_4_0= ruleAttribute )
            	    // InternalOntoUMLArchive.g:298:5: lv_attributes_4_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop8;
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
    // InternalOntoUMLArchive.g:319:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOntoUMLArchive.g:319:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOntoUMLArchive.g:320:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOntoUMLArchive.g:326:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'att' ( (lv_name_1_0= ruleStringOrID ) ) ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_multiplicity_2_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:332:2: ( (otherlv_0= 'att' ( (lv_name_1_0= ruleStringOrID ) ) ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) )? ) )
            // InternalOntoUMLArchive.g:333:2: (otherlv_0= 'att' ( (lv_name_1_0= ruleStringOrID ) ) ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) )? )
            {
            // InternalOntoUMLArchive.g:333:2: (otherlv_0= 'att' ( (lv_name_1_0= ruleStringOrID ) ) ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) )? )
            // InternalOntoUMLArchive.g:334:3: otherlv_0= 'att' ( (lv_name_1_0= ruleStringOrID ) ) ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttKeyword_0());
            		
            // InternalOntoUMLArchive.g:338:3: ( (lv_name_1_0= ruleStringOrID ) )
            // InternalOntoUMLArchive.g:339:4: (lv_name_1_0= ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:339:4: (lv_name_1_0= ruleStringOrID )
            // InternalOntoUMLArchive.g:340:5: lv_name_1_0= ruleStringOrID
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameStringOrIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleStringOrID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.StringOrID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUMLArchive.g:357:3: ( ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19||LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUMLArchive.g:358:4: ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) )
                    {
                    // InternalOntoUMLArchive.g:358:4: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==27) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalOntoUMLArchive.g:359:5: (lv_multiplicity_2_0= ruleMultiplicity )
                            {
                            // InternalOntoUMLArchive.g:359:5: (lv_multiplicity_2_0= ruleMultiplicity )
                            // InternalOntoUMLArchive.g:360:6: lv_multiplicity_2_0= ruleMultiplicity
                            {

                            						newCompositeNode(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_13);
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
                            break;

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_2_1());
                    			
                    // InternalOntoUMLArchive.g:381:4: ( ( ruleStringOrID ) )
                    // InternalOntoUMLArchive.g:382:5: ( ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:382:5: ( ruleStringOrID )
                    // InternalOntoUMLArchive.g:383:6: ruleStringOrID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAttTypeClassCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleStringOrID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // InternalOntoUMLArchive.g:402:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalOntoUMLArchive.g:402:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalOntoUMLArchive.g:403:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalOntoUMLArchive.g:409:1: ruleRelationship returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Generalization_1 = null;

        EObject this_DependencyLink_2 = null;

        EObject this_Derivation_3 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:415:2: ( (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation ) )
            // InternalOntoUMLArchive.g:416:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation )
            {
            // InternalOntoUMLArchive.g:416:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            case 35:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOntoUMLArchive.g:417:3: this_Association_0= ruleAssociation
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
                    // InternalOntoUMLArchive.g:426:3: this_Generalization_1= ruleGeneralization
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
                    // InternalOntoUMLArchive.g:435:3: this_DependencyLink_2= ruleDependencyLink
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
                    // InternalOntoUMLArchive.g:444:3: this_Derivation_3= ruleDerivation
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
    // InternalOntoUMLArchive.g:456:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalOntoUMLArchive.g:456:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalOntoUMLArchive.g:457:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalOntoUMLArchive.g:463:1: ruleAssociation returns [EObject current=null] : (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryAssociation_0 = null;

        EObject this_NaryAssociation_1 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:469:2: ( (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation ) )
            // InternalOntoUMLArchive.g:470:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )
            {
            // InternalOntoUMLArchive.g:470:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalOntoUMLArchive.g:471:3: this_BinaryAssociation_0= ruleBinaryAssociation
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
                    // InternalOntoUMLArchive.g:480:3: this_NaryAssociation_1= ruleNaryAssociation
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
    // InternalOntoUMLArchive.g:492:1: entryRuleBinaryAssociation returns [EObject current=null] : iv_ruleBinaryAssociation= ruleBinaryAssociation EOF ;
    public final EObject entryRuleBinaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryAssociation = null;


        try {
            // InternalOntoUMLArchive.g:492:58: (iv_ruleBinaryAssociation= ruleBinaryAssociation EOF )
            // InternalOntoUMLArchive.g:493:2: iv_ruleBinaryAssociation= ruleBinaryAssociation EOF
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
    // InternalOntoUMLArchive.g:499:1: ruleBinaryAssociation returns [EObject current=null] : (this_DirectedAssociation_0= ruleDirectedAssociation | this_UndirectedAssociation_1= ruleUndirectedAssociation ) ;
    public final EObject ruleBinaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_DirectedAssociation_0 = null;

        EObject this_UndirectedAssociation_1 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:505:2: ( (this_DirectedAssociation_0= ruleDirectedAssociation | this_UndirectedAssociation_1= ruleUndirectedAssociation ) )
            // InternalOntoUMLArchive.g:506:2: (this_DirectedAssociation_0= ruleDirectedAssociation | this_UndirectedAssociation_1= ruleUndirectedAssociation )
            {
            // InternalOntoUMLArchive.g:506:2: (this_DirectedAssociation_0= ruleDirectedAssociation | this_UndirectedAssociation_1= ruleUndirectedAssociation )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalOntoUMLArchive.g:507:3: this_DirectedAssociation_0= ruleDirectedAssociation
                    {

                    			newCompositeNode(grammarAccess.getBinaryAssociationAccess().getDirectedAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DirectedAssociation_0=ruleDirectedAssociation();

                    state._fsp--;


                    			current = this_DirectedAssociation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:516:3: this_UndirectedAssociation_1= ruleUndirectedAssociation
                    {

                    			newCompositeNode(grammarAccess.getBinaryAssociationAccess().getUndirectedAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UndirectedAssociation_1=ruleUndirectedAssociation();

                    state._fsp--;


                    			current = this_UndirectedAssociation_1;
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


    // $ANTLR start "entryRuleDirectedAssociation"
    // InternalOntoUMLArchive.g:528:1: entryRuleDirectedAssociation returns [EObject current=null] : iv_ruleDirectedAssociation= ruleDirectedAssociation EOF ;
    public final EObject entryRuleDirectedAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedAssociation = null;


        try {
            // InternalOntoUMLArchive.g:528:60: (iv_ruleDirectedAssociation= ruleDirectedAssociation EOF )
            // InternalOntoUMLArchive.g:529:2: iv_ruleDirectedAssociation= ruleDirectedAssociation EOF
            {
             newCompositeNode(grammarAccess.getDirectedAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectedAssociation=ruleDirectedAssociation();

            state._fsp--;

             current =iv_ruleDirectedAssociation; 
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
    // $ANTLR end "entryRuleDirectedAssociation"


    // $ANTLR start "ruleDirectedAssociation"
    // InternalOntoUMLArchive.g:535:1: ruleDirectedAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) ) ;
    public final EObject ruleDirectedAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_from_4_0 = null;

        EObject lv_to_6_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:541:2: ( (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) ) )
            // InternalOntoUMLArchive.g:542:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:542:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:543:3: otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectedAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:547:3: ( (lv_name_1_0= ruleStringOrID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoUMLArchive.g:548:4: (lv_name_1_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:548:4: (lv_name_1_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:549:5: lv_name_1_0= ruleStringOrID
                    {

                    					newCompositeNode(grammarAccess.getDirectedAssociationAccess().getNameStringOrIDParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_name_1_0=ruleStringOrID();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDirectedAssociationRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.StringOrID");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:566:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STEREOTYPE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:567:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:567:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:568:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_15); 

            	    					newLeafNode(lv_stereotypes_2_0, grammarAccess.getDirectedAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDirectedAssociationRule());
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
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDirectedAssociationAccess().getFromKeyword_3());
            		
            // InternalOntoUMLArchive.g:588:3: ( (lv_from_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:589:4: (lv_from_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:589:4: (lv_from_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:590:5: lv_from_4_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getDirectedAssociationAccess().getFromAssociationEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_from_4_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectedAssociationRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_4_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getDirectedAssociationAccess().getToKeyword_5());
            		
            // InternalOntoUMLArchive.g:611:3: ( (lv_to_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:612:4: (lv_to_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:612:4: (lv_to_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:613:5: lv_to_6_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getDirectedAssociationAccess().getToAssociationEndParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_to_6_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectedAssociationRule());
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
    // $ANTLR end "ruleDirectedAssociation"


    // $ANTLR start "entryRuleUndirectedAssociation"
    // InternalOntoUMLArchive.g:634:1: entryRuleUndirectedAssociation returns [EObject current=null] : iv_ruleUndirectedAssociation= ruleUndirectedAssociation EOF ;
    public final EObject entryRuleUndirectedAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUndirectedAssociation = null;


        try {
            // InternalOntoUMLArchive.g:634:62: (iv_ruleUndirectedAssociation= ruleUndirectedAssociation EOF )
            // InternalOntoUMLArchive.g:635:2: iv_ruleUndirectedAssociation= ruleUndirectedAssociation EOF
            {
             newCompositeNode(grammarAccess.getUndirectedAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUndirectedAssociation=ruleUndirectedAssociation();

            state._fsp--;

             current =iv_ruleUndirectedAssociation; 
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
    // $ANTLR end "entryRuleUndirectedAssociation"


    // $ANTLR start "ruleUndirectedAssociation"
    // InternalOntoUMLArchive.g:641:1: ruleUndirectedAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'end' ( (lv_endA_4_0= ruleAssociationEnd ) ) otherlv_5= 'end' ( (lv_endB_6_0= ruleAssociationEnd ) ) ) ;
    public final EObject ruleUndirectedAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_endA_4_0 = null;

        EObject lv_endB_6_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:647:2: ( (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'end' ( (lv_endA_4_0= ruleAssociationEnd ) ) otherlv_5= 'end' ( (lv_endB_6_0= ruleAssociationEnd ) ) ) )
            // InternalOntoUMLArchive.g:648:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'end' ( (lv_endA_4_0= ruleAssociationEnd ) ) otherlv_5= 'end' ( (lv_endB_6_0= ruleAssociationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:648:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'end' ( (lv_endA_4_0= ruleAssociationEnd ) ) otherlv_5= 'end' ( (lv_endB_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:649:3: otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'end' ( (lv_endA_4_0= ruleAssociationEnd ) ) otherlv_5= 'end' ( (lv_endB_6_0= ruleAssociationEnd ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getUndirectedAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:653:3: ( (lv_name_1_0= ruleStringOrID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoUMLArchive.g:654:4: (lv_name_1_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:654:4: (lv_name_1_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:655:5: lv_name_1_0= ruleStringOrID
                    {

                    					newCompositeNode(grammarAccess.getUndirectedAssociationAccess().getNameStringOrIDParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_name_1_0=ruleStringOrID();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUndirectedAssociationRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.StringOrID");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:672:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STEREOTYPE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:673:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:673:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:674:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_19); 

            	    					newLeafNode(lv_stereotypes_2_0, grammarAccess.getUndirectedAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getUndirectedAssociationRule());
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
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getUndirectedAssociationAccess().getEndKeyword_3());
            		
            // InternalOntoUMLArchive.g:694:3: ( (lv_endA_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:695:4: (lv_endA_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:695:4: (lv_endA_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:696:5: lv_endA_4_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getUndirectedAssociationAccess().getEndAAssociationEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_endA_4_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUndirectedAssociationRule());
            					}
            					set(
            						current,
            						"endA",
            						lv_endA_4_0,
            						"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getUndirectedAssociationAccess().getEndKeyword_5());
            		
            // InternalOntoUMLArchive.g:717:3: ( (lv_endB_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:718:4: (lv_endB_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:718:4: (lv_endB_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:719:5: lv_endB_6_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getUndirectedAssociationAccess().getEndBAssociationEndParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_endB_6_0=ruleAssociationEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUndirectedAssociationRule());
            					}
            					set(
            						current,
            						"endB",
            						lv_endB_6_0,
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
    // $ANTLR end "ruleUndirectedAssociation"


    // $ANTLR start "entryRuleNaryAssociation"
    // InternalOntoUMLArchive.g:740:1: entryRuleNaryAssociation returns [EObject current=null] : iv_ruleNaryAssociation= ruleNaryAssociation EOF ;
    public final EObject entryRuleNaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaryAssociation = null;


        try {
            // InternalOntoUMLArchive.g:740:56: (iv_ruleNaryAssociation= ruleNaryAssociation EOF )
            // InternalOntoUMLArchive.g:741:2: iv_ruleNaryAssociation= ruleNaryAssociation EOF
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
    // InternalOntoUMLArchive.g:747:1: ruleNaryAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ ) ;
    public final EObject ruleNaryAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ends_4_0 = null;

        EObject lv_ends_6_0 = null;

        EObject lv_ends_8_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:753:2: ( (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ ) )
            // InternalOntoUMLArchive.g:754:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ )
            {
            // InternalOntoUMLArchive.g:754:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ )
            // InternalOntoUMLArchive.g:755:3: otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:759:3: ( (lv_name_1_0= ruleStringOrID ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING||LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoUMLArchive.g:760:4: (lv_name_1_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:760:4: (lv_name_1_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:761:5: lv_name_1_0= ruleStringOrID
                    {

                    					newCompositeNode(grammarAccess.getNaryAssociationAccess().getNameStringOrIDParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_name_1_0=ruleStringOrID();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNaryAssociationRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.StringOrID");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:778:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STEREOTYPE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:779:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:779:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:780:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
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
            	    break loop19;
                }
            } while (true);

            // InternalOntoUMLArchive.g:796:3: (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:797:4: otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) )
            {
            otherlv_3=(Token)match(input,23,FOLLOW_16); 

            				newLeafNode(otherlv_3, grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0());
            			
            // InternalOntoUMLArchive.g:801:4: ( (lv_ends_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:802:5: (lv_ends_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:802:5: (lv_ends_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:803:6: lv_ends_4_0= ruleAssociationEnd
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

            // InternalOntoUMLArchive.g:821:3: (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:822:4: otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) )
            {
            otherlv_5=(Token)match(input,23,FOLLOW_16); 

            				newLeafNode(otherlv_5, grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0());
            			
            // InternalOntoUMLArchive.g:826:4: ( (lv_ends_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:827:5: (lv_ends_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:827:5: (lv_ends_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:828:6: lv_ends_6_0= ruleAssociationEnd
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

            // InternalOntoUMLArchive.g:846:3: (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:847:4: otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0());
            	    			
            	    // InternalOntoUMLArchive.g:851:4: ( (lv_ends_8_0= ruleAssociationEnd ) )
            	    // InternalOntoUMLArchive.g:852:5: (lv_ends_8_0= ruleAssociationEnd )
            	    {
            	    // InternalOntoUMLArchive.g:852:5: (lv_ends_8_0= ruleAssociationEnd )
            	    // InternalOntoUMLArchive.g:853:6: lv_ends_8_0= ruleAssociationEnd
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // InternalOntoUMLArchive.g:875:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalOntoUMLArchive.g:875:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalOntoUMLArchive.g:876:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
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
    // InternalOntoUMLArchive.g:882:1: ruleAssociationEnd returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= ruleStringOrID ) )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? otherlv_5= ':' ( ( ruleStringOrID ) ) (otherlv_7= '{' ( (lv_constraints_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_constraints_10_0= RULE_STRING ) ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_constraints_8_0=null;
        Token otherlv_9=null;
        Token lv_constraints_10_0=null;
        Token otherlv_11=null;
        Enumerator lv_aggregationKind_1_0 = null;

        Enumerator lv_navigability_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_multiplicity_4_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:888:2: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= ruleStringOrID ) )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? otherlv_5= ':' ( ( ruleStringOrID ) ) (otherlv_7= '{' ( (lv_constraints_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_constraints_10_0= RULE_STRING ) ) )* otherlv_11= '}' )? ) )
            // InternalOntoUMLArchive.g:889:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= ruleStringOrID ) )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? otherlv_5= ':' ( ( ruleStringOrID ) ) (otherlv_7= '{' ( (lv_constraints_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_constraints_10_0= RULE_STRING ) ) )* otherlv_11= '}' )? )
            {
            // InternalOntoUMLArchive.g:889:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= ruleStringOrID ) )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? otherlv_5= ':' ( ( ruleStringOrID ) ) (otherlv_7= '{' ( (lv_constraints_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_constraints_10_0= RULE_STRING ) ) )* otherlv_11= '}' )? )
            // InternalOntoUMLArchive.g:890:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= ruleStringOrID ) )? ( (lv_multiplicity_4_0= ruleMultiplicity ) )? otherlv_5= ':' ( ( ruleStringOrID ) ) (otherlv_7= '{' ( (lv_constraints_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_constraints_10_0= RULE_STRING ) ) )* otherlv_11= '}' )?
            {
            // InternalOntoUMLArchive.g:890:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )* ) ) )
            // InternalOntoUMLArchive.g:891:4: ( ( ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )* ) )
            {
            // InternalOntoUMLArchive.g:891:4: ( ( ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )* ) )
            // InternalOntoUMLArchive.g:892:5: ( ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0());
            				
            // InternalOntoUMLArchive.g:895:5: ( ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )* )
            // InternalOntoUMLArchive.g:896:6: ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )*
            {
            // InternalOntoUMLArchive.g:896:6: ( ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) ) )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( LA21_0 >= 40 && LA21_0 <= 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 >= 42 && LA21_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 1) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:897:4: ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:897:4: ({...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) ) )
            	    // InternalOntoUMLArchive.g:898:5: {...}? => ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociationEnd", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalOntoUMLArchive.g:898:111: ( ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) ) )
            	    // InternalOntoUMLArchive.g:899:6: ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalOntoUMLArchive.g:902:9: ({...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) ) )
            	    // InternalOntoUMLArchive.g:902:10: {...}? => ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociationEnd", "true");
            	    }
            	    // InternalOntoUMLArchive.g:902:19: ( (lv_aggregationKind_1_0= ruleAggregationKindDeclaration ) )
            	    // InternalOntoUMLArchive.g:902:20: (lv_aggregationKind_1_0= ruleAggregationKindDeclaration )
            	    {
            	    // InternalOntoUMLArchive.g:902:20: (lv_aggregationKind_1_0= ruleAggregationKindDeclaration )
            	    // InternalOntoUMLArchive.g:903:10: lv_aggregationKind_1_0= ruleAggregationKindDeclaration
            	    {

            	    										newCompositeNode(grammarAccess.getAssociationEndAccess().getAggregationKindAggregationKindDeclarationEnumRuleCall_0_0_0());
            	    									
            	    pushFollow(FOLLOW_16);
            	    lv_aggregationKind_1_0=ruleAggregationKindDeclaration();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAssociationEndRule());
            	    										}
            	    										set(
            	    											current,
            	    											"aggregationKind",
            	    											lv_aggregationKind_1_0,
            	    											"it.unibz.inf.ontouml.archive.OntoUMLArchive.AggregationKindDeclaration");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOntoUMLArchive.g:925:4: ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:925:4: ({...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) ) )
            	    // InternalOntoUMLArchive.g:926:5: {...}? => ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociationEnd", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalOntoUMLArchive.g:926:111: ( ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) ) )
            	    // InternalOntoUMLArchive.g:927:6: ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalOntoUMLArchive.g:930:9: ({...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) ) )
            	    // InternalOntoUMLArchive.g:930:10: {...}? => ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociationEnd", "true");
            	    }
            	    // InternalOntoUMLArchive.g:930:19: ( (lv_navigability_2_0= ruleNavigabilityDeclaration ) )
            	    // InternalOntoUMLArchive.g:930:20: (lv_navigability_2_0= ruleNavigabilityDeclaration )
            	    {
            	    // InternalOntoUMLArchive.g:930:20: (lv_navigability_2_0= ruleNavigabilityDeclaration )
            	    // InternalOntoUMLArchive.g:931:10: lv_navigability_2_0= ruleNavigabilityDeclaration
            	    {

            	    										newCompositeNode(grammarAccess.getAssociationEndAccess().getNavigabilityNavigabilityDeclarationEnumRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_16);
            	    lv_navigability_2_0=ruleNavigabilityDeclaration();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAssociationEndRule());
            	    										}
            	    										set(
            	    											current,
            	    											"navigability",
            	    											lv_navigability_2_0,
            	    											"it.unibz.inf.ontouml.archive.OntoUMLArchive.NavigabilityDeclaration");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0());
            				

            }

            // InternalOntoUMLArchive.g:960:3: ( (lv_name_3_0= ruleStringOrID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING||LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoUMLArchive.g:961:4: (lv_name_3_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:961:4: (lv_name_3_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:962:5: lv_name_3_0= ruleStringOrID
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndAccess().getNameStringOrIDParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_name_3_0=ruleStringOrID();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_3_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.StringOrID");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:979:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOntoUMLArchive.g:980:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    {
                    // InternalOntoUMLArchive.g:980:4: (lv_multiplicity_4_0= ruleMultiplicity )
                    // InternalOntoUMLArchive.g:981:5: lv_multiplicity_4_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_multiplicity_4_0=ruleMultiplicity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
                    					}
                    					set(
                    						current,
                    						"multiplicity",
                    						lv_multiplicity_4_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Multiplicity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationEndAccess().getColonKeyword_3());
            		
            // InternalOntoUMLArchive.g:1002:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1003:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1003:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1004:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_23);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUMLArchive.g:1018:3: (otherlv_7= '{' ( (lv_constraints_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_constraints_10_0= RULE_STRING ) ) )* otherlv_11= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntoUMLArchive.g:1019:4: otherlv_7= '{' ( (lv_constraints_8_0= RULE_STRING ) ) (otherlv_9= ',' ( (lv_constraints_10_0= RULE_STRING ) ) )* otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalOntoUMLArchive.g:1023:4: ( (lv_constraints_8_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:1024:5: (lv_constraints_8_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1024:5: (lv_constraints_8_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1025:6: lv_constraints_8_0= RULE_STRING
                    {
                    lv_constraints_8_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    						newLeafNode(lv_constraints_8_0, grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_5_1_0());
                    					

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

                    // InternalOntoUMLArchive.g:1041:4: (otherlv_9= ',' ( (lv_constraints_10_0= RULE_STRING ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==25) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:1042:5: otherlv_9= ',' ( (lv_constraints_10_0= RULE_STRING ) )
                    	    {
                    	    otherlv_9=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getAssociationEndAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:1046:5: ( (lv_constraints_10_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:1047:6: (lv_constraints_10_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:1047:6: (lv_constraints_10_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:1048:7: lv_constraints_10_0= RULE_STRING
                    	    {
                    	    lv_constraints_10_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    	    							newLeafNode(lv_constraints_10_0, grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_5_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssociationEndRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_10_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssociationEndAccess().getRightCurlyBracketKeyword_5_3());
                    			

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
    // InternalOntoUMLArchive.g:1074:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalOntoUMLArchive.g:1074:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalOntoUMLArchive.g:1075:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalOntoUMLArchive.g:1081:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lower_1_0 = null;

        AntlrDatatypeRuleToken lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1087:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' ) )
            // InternalOntoUMLArchive.g:1088:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' )
            {
            // InternalOntoUMLArchive.g:1088:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' )
            // InternalOntoUMLArchive.g:1089:3: otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOntoUMLArchive.g:1093:3: ( (lv_lower_1_0= ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:1094:4: (lv_lower_1_0= ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:1094:4: (lv_lower_1_0= ruleCARDINALITY )
            // InternalOntoUMLArchive.g:1095:5: lv_lower_1_0= ruleCARDINALITY
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerCARDINALITYParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_2=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalOntoUMLArchive.g:1116:3: ( (lv_upper_3_0= ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:1117:4: (lv_upper_3_0= ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:1117:4: (lv_upper_3_0= ruleCARDINALITY )
            // InternalOntoUMLArchive.g:1118:5: lv_upper_3_0= ruleCARDINALITY
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperCARDINALITYParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalOntoUMLArchive.g:1143:1: entryRuleCARDINALITY returns [String current=null] : iv_ruleCARDINALITY= ruleCARDINALITY EOF ;
    public final String entryRuleCARDINALITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCARDINALITY = null;


        try {
            // InternalOntoUMLArchive.g:1143:51: (iv_ruleCARDINALITY= ruleCARDINALITY EOF )
            // InternalOntoUMLArchive.g:1144:2: iv_ruleCARDINALITY= ruleCARDINALITY EOF
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
    // InternalOntoUMLArchive.g:1150:1: ruleCARDINALITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCARDINALITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1156:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalOntoUMLArchive.g:1157:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalOntoUMLArchive.g:1157:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_INT) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoUMLArchive.g:1158:3: kw= '*'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:1164:3: this_INT_1= RULE_INT
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
    // InternalOntoUMLArchive.g:1175:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalOntoUMLArchive.g:1175:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalOntoUMLArchive.g:1176:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalOntoUMLArchive.g:1182:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( ( ruleStringOrID ) ) otherlv_4= 'sub' ( ( ruleStringOrID ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1188:2: ( (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( ( ruleStringOrID ) ) otherlv_4= 'sub' ( ( ruleStringOrID ) ) ) )
            // InternalOntoUMLArchive.g:1189:2: (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( ( ruleStringOrID ) ) otherlv_4= 'sub' ( ( ruleStringOrID ) ) )
            {
            // InternalOntoUMLArchive.g:1189:2: (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( ( ruleStringOrID ) ) otherlv_4= 'sub' ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:1190:3: otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( ( ruleStringOrID ) ) otherlv_4= 'sub' ( ( ruleStringOrID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGenKeyword_0());
            		
            // InternalOntoUMLArchive.g:1194:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntoUMLArchive.g:1195:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1195:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1196:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_2=(Token)match(input,32,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getSuperKeyword_2());
            		
            // InternalOntoUMLArchive.g:1216:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1217:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1217:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1218:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_30);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralizationAccess().getSubKeyword_4());
            		
            // InternalOntoUMLArchive.g:1236:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1237:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1237:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1238:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getSubClassCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;


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
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleDependencyLink"
    // InternalOntoUMLArchive.g:1256:1: entryRuleDependencyLink returns [EObject current=null] : iv_ruleDependencyLink= ruleDependencyLink EOF ;
    public final EObject entryRuleDependencyLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyLink = null;


        try {
            // InternalOntoUMLArchive.g:1256:55: (iv_ruleDependencyLink= ruleDependencyLink EOF )
            // InternalOntoUMLArchive.g:1257:2: iv_ruleDependencyLink= ruleDependencyLink EOF
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
    // InternalOntoUMLArchive.g:1263:1: ruleDependencyLink returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( ( ruleStringOrID ) ) otherlv_5= 'to' ( ( ruleStringOrID ) ) ) ;
    public final EObject ruleDependencyLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1269:2: ( (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( ( ruleStringOrID ) ) otherlv_5= 'to' ( ( ruleStringOrID ) ) ) )
            // InternalOntoUMLArchive.g:1270:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( ( ruleStringOrID ) ) otherlv_5= 'to' ( ( ruleStringOrID ) ) )
            {
            // InternalOntoUMLArchive.g:1270:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( ( ruleStringOrID ) ) otherlv_5= 'to' ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:1271:3: otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( ( ruleStringOrID ) ) otherlv_5= 'to' ( ( ruleStringOrID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0());
            		
            // InternalOntoUMLArchive.g:1275:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoUMLArchive.g:1276:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1276:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1277:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            // InternalOntoUMLArchive.g:1293:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STEREOTYPE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1294:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:1294:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:1295:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_15); 

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
            	    break loop29;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyLinkAccess().getFromKeyword_3());
            		
            // InternalOntoUMLArchive.g:1315:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1316:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1316:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1317:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_17);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getDependencyLinkAccess().getToKeyword_5());
            		
            // InternalOntoUMLArchive.g:1335:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1336:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1336:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1337:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependencyLinkAccess().getToClassCrossReference_6_0());
            				
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;


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
    // $ANTLR end "ruleDependencyLink"


    // $ANTLR start "entryRuleDerivation"
    // InternalOntoUMLArchive.g:1355:1: entryRuleDerivation returns [EObject current=null] : iv_ruleDerivation= ruleDerivation EOF ;
    public final EObject entryRuleDerivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivation = null;


        try {
            // InternalOntoUMLArchive.g:1355:51: (iv_ruleDerivation= ruleDerivation EOF )
            // InternalOntoUMLArchive.g:1356:2: iv_ruleDerivation= ruleDerivation EOF
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
    // InternalOntoUMLArchive.g:1362:1: ruleDerivation returns [EObject current=null] : (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) ) ;
    public final EObject ruleDerivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_class_4_0 = null;

        EObject lv_part_6_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1368:2: ( (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) ) )
            // InternalOntoUMLArchive.g:1369:2: (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:1369:2: (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) )
            // InternalOntoUMLArchive.g:1370:3: otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivationAccess().getDerivationKeyword_0());
            		
            // InternalOntoUMLArchive.g:1374:3: ( (lv_name_1_0= ruleStringOrID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING||LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoUMLArchive.g:1375:4: (lv_name_1_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:1375:4: (lv_name_1_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:1376:5: lv_name_1_0= ruleStringOrID
                    {

                    					newCompositeNode(grammarAccess.getDerivationAccess().getNameStringOrIDParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_name_1_0=ruleStringOrID();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDerivationRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.StringOrID");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:1393:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STEREOTYPE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1394:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:1394:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:1395:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_33); 

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
            	    break loop31;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivationAccess().getClassKeyword_3());
            		
            // InternalOntoUMLArchive.g:1415:3: ( (lv_class_4_0= ruleClassDerivationEnd ) )
            // InternalOntoUMLArchive.g:1416:4: (lv_class_4_0= ruleClassDerivationEnd )
            {
            // InternalOntoUMLArchive.g:1416:4: (lv_class_4_0= ruleClassDerivationEnd )
            // InternalOntoUMLArchive.g:1417:5: lv_class_4_0= ruleClassDerivationEnd
            {

            					newCompositeNode(grammarAccess.getDerivationAccess().getClassClassDerivationEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
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

            otherlv_5=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getDerivationAccess().getRelationKeyword_5());
            		
            // InternalOntoUMLArchive.g:1438:3: ( (lv_part_6_0= ruleRelationDerivationEnd ) )
            // InternalOntoUMLArchive.g:1439:4: (lv_part_6_0= ruleRelationDerivationEnd )
            {
            // InternalOntoUMLArchive.g:1439:4: (lv_part_6_0= ruleRelationDerivationEnd )
            // InternalOntoUMLArchive.g:1440:5: lv_part_6_0= ruleRelationDerivationEnd
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
    // InternalOntoUMLArchive.g:1461:1: entryRuleClassDerivationEnd returns [EObject current=null] : iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF ;
    public final EObject entryRuleClassDerivationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDerivationEnd = null;


        try {
            // InternalOntoUMLArchive.g:1461:59: (iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF )
            // InternalOntoUMLArchive.g:1462:2: iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF
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
    // InternalOntoUMLArchive.g:1468:1: ruleClassDerivationEnd returns [EObject current=null] : ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleClassDerivationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_constraints_3_0=null;
        Token otherlv_4=null;
        Token lv_constraints_5_0=null;
        Token otherlv_6=null;
        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1474:2: ( ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) )
            // InternalOntoUMLArchive.g:1475:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            {
            // InternalOntoUMLArchive.g:1475:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            // InternalOntoUMLArchive.g:1476:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            {
            // InternalOntoUMLArchive.g:1476:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoUMLArchive.g:1477:4: (lv_multiplicity_0_0= ruleMultiplicity )
                    {
                    // InternalOntoUMLArchive.g:1477:4: (lv_multiplicity_0_0= ruleMultiplicity )
                    // InternalOntoUMLArchive.g:1478:5: lv_multiplicity_0_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getClassDerivationEndAccess().getMultiplicityMultiplicityParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
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
                    break;

            }

            // InternalOntoUMLArchive.g:1495:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1496:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1496:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1497:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDerivationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClassDerivationEndAccess().getEndTypeClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_23);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUMLArchive.g:1511:3: (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOntoUMLArchive.g:1512:4: otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassDerivationEndAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalOntoUMLArchive.g:1516:4: ( (lv_constraints_3_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:1517:5: (lv_constraints_3_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1517:5: (lv_constraints_3_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1518:6: lv_constraints_3_0= RULE_STRING
                    {
                    lv_constraints_3_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

                    // InternalOntoUMLArchive.g:1534:4: (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==25) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:1535:5: otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getClassDerivationEndAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:1539:5: ( (lv_constraints_5_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:1540:6: (lv_constraints_5_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:1540:6: (lv_constraints_5_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:1541:7: lv_constraints_5_0= RULE_STRING
                    	    {
                    	    lv_constraints_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_2); 

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
    // InternalOntoUMLArchive.g:1567:1: entryRuleRelationDerivationEnd returns [EObject current=null] : iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF ;
    public final EObject entryRuleRelationDerivationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDerivationEnd = null;


        try {
            // InternalOntoUMLArchive.g:1567:62: (iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF )
            // InternalOntoUMLArchive.g:1568:2: iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF
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
    // InternalOntoUMLArchive.g:1574:1: ruleRelationDerivationEnd returns [EObject current=null] : ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleRelationDerivationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_constraints_3_0=null;
        Token otherlv_4=null;
        Token lv_constraints_5_0=null;
        Token otherlv_6=null;
        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1580:2: ( ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) )
            // InternalOntoUMLArchive.g:1581:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            {
            // InternalOntoUMLArchive.g:1581:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            // InternalOntoUMLArchive.g:1582:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            {
            // InternalOntoUMLArchive.g:1582:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOntoUMLArchive.g:1583:4: (lv_multiplicity_0_0= ruleMultiplicity )
                    {
                    // InternalOntoUMLArchive.g:1583:4: (lv_multiplicity_0_0= ruleMultiplicity )
                    // InternalOntoUMLArchive.g:1584:5: lv_multiplicity_0_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getRelationDerivationEndAccess().getMultiplicityMultiplicityParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
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
                    break;

            }

            // InternalOntoUMLArchive.g:1601:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1602:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1602:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1603:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationDerivationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationCrossReference_1_0());
            				
            pushFollow(FOLLOW_23);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUMLArchive.g:1617:3: (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntoUMLArchive.g:1618:4: otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationDerivationEndAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalOntoUMLArchive.g:1622:4: ( (lv_constraints_3_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:1623:5: (lv_constraints_3_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1623:5: (lv_constraints_3_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1624:6: lv_constraints_3_0= RULE_STRING
                    {
                    lv_constraints_3_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

                    // InternalOntoUMLArchive.g:1640:4: (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==25) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:1641:5: otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRelationDerivationEndAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:1645:5: ( (lv_constraints_5_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:1646:6: (lv_constraints_5_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:1646:6: (lv_constraints_5_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:1647:7: lv_constraints_5_0= RULE_STRING
                    	    {
                    	    lv_constraints_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_2); 

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
    // InternalOntoUMLArchive.g:1673:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoUMLArchive.g:1673:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoUMLArchive.g:1674:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
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
    // InternalOntoUMLArchive.g:1680:1: ruleGeneralizationSet returns [EObject current=null] : (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleStringOrID ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDisjoint_2_0=null;
        Token lv_isComplete_3_0=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_generalizations_5_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1686:2: ( (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleStringOrID ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ ) )
            // InternalOntoUMLArchive.g:1687:2: (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleStringOrID ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ )
            {
            // InternalOntoUMLArchive.g:1687:2: (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleStringOrID ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ )
            // InternalOntoUMLArchive.g:1688:3: otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleStringOrID ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+
            {
            otherlv_0=(Token)match(input,37,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0());
            		
            // InternalOntoUMLArchive.g:1692:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) )
            // InternalOntoUMLArchive.g:1693:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) )
            {
            // InternalOntoUMLArchive.g:1693:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) )
            // InternalOntoUMLArchive.g:1694:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            				
            // InternalOntoUMLArchive.g:1697:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* )
            // InternalOntoUMLArchive.g:1698:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )*
            {
            // InternalOntoUMLArchive.g:1698:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1699:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:1699:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )
            	    // InternalOntoUMLArchive.g:1700:5: {...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalOntoUMLArchive.g:1700:114: ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    // InternalOntoUMLArchive.g:1701:6: ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalOntoUMLArchive.g:1704:9: ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    // InternalOntoUMLArchive.g:1704:10: {...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUMLArchive.g:1704:19: ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    // InternalOntoUMLArchive.g:1704:20: (lv_isDisjoint_2_0= 'disjoint' )
            	    {
            	    // InternalOntoUMLArchive.g:1704:20: (lv_isDisjoint_2_0= 'disjoint' )
            	    // InternalOntoUMLArchive.g:1705:10: lv_isDisjoint_2_0= 'disjoint'
            	    {
            	    lv_isDisjoint_2_0=(Token)match(input,38,FOLLOW_36); 

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
            	    // InternalOntoUMLArchive.g:1722:4: ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:1722:4: ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) )
            	    // InternalOntoUMLArchive.g:1723:5: {...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalOntoUMLArchive.g:1723:114: ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) )
            	    // InternalOntoUMLArchive.g:1724:6: ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalOntoUMLArchive.g:1727:9: ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) )
            	    // InternalOntoUMLArchive.g:1727:10: {...}? => ( (lv_isComplete_3_0= 'complete' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUMLArchive.g:1727:19: ( (lv_isComplete_3_0= 'complete' ) )
            	    // InternalOntoUMLArchive.g:1727:20: (lv_isComplete_3_0= 'complete' )
            	    {
            	    // InternalOntoUMLArchive.g:1727:20: (lv_isComplete_3_0= 'complete' )
            	    // InternalOntoUMLArchive.g:1728:10: lv_isComplete_3_0= 'complete'
            	    {
            	    lv_isComplete_3_0=(Token)match(input,39,FOLLOW_36); 

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
            	    break loop38;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            				

            }

            // InternalOntoUMLArchive.g:1752:3: ( (lv_name_4_0= ruleStringOrID ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING||LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOntoUMLArchive.g:1753:4: (lv_name_4_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:1753:4: (lv_name_4_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:1754:5: lv_name_4_0= ruleStringOrID
                    {

                    					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getNameStringOrIDParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_37);
                    lv_name_4_0=ruleStringOrID();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGeneralizationSetRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_4_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.StringOrID");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:1771:3: ( (lv_generalizations_5_0= ruleGeneralization ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==31) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1772:4: (lv_generalizations_5_0= ruleGeneralization )
            	    {
            	    // InternalOntoUMLArchive.g:1772:4: (lv_generalizations_5_0= ruleGeneralization )
            	    // InternalOntoUMLArchive.g:1773:5: lv_generalizations_5_0= ruleGeneralization
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_38);
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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
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


    // $ANTLR start "entryRuleStringOrID"
    // InternalOntoUMLArchive.g:1794:1: entryRuleStringOrID returns [String current=null] : iv_ruleStringOrID= ruleStringOrID EOF ;
    public final String entryRuleStringOrID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringOrID = null;


        try {
            // InternalOntoUMLArchive.g:1794:50: (iv_ruleStringOrID= ruleStringOrID EOF )
            // InternalOntoUMLArchive.g:1795:2: iv_ruleStringOrID= ruleStringOrID EOF
            {
             newCompositeNode(grammarAccess.getStringOrIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringOrID=ruleStringOrID();

            state._fsp--;

             current =iv_ruleStringOrID.getText(); 
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
    // $ANTLR end "entryRuleStringOrID"


    // $ANTLR start "ruleStringOrID"
    // InternalOntoUMLArchive.g:1801:1: ruleStringOrID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleStringOrID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1807:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOntoUMLArchive.g:1808:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOntoUMLArchive.g:1808:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalOntoUMLArchive.g:1809:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:1817:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getStringOrIDAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleStringOrID"


    // $ANTLR start "ruleAggregationKindDeclaration"
    // InternalOntoUMLArchive.g:1828:1: ruleAggregationKindDeclaration returns [Enumerator current=null] : ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleAggregationKindDeclaration() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1834:2: ( ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalOntoUMLArchive.g:1835:2: ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalOntoUMLArchive.g:1835:2: ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            else if ( (LA42_0==41) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalOntoUMLArchive.g:1836:3: (enumLiteral_0= 'shared' )
                    {
                    // InternalOntoUMLArchive.g:1836:3: (enumLiteral_0= 'shared' )
                    // InternalOntoUMLArchive.g:1837:4: enumLiteral_0= 'shared'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:1844:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalOntoUMLArchive.g:1844:3: (enumLiteral_1= 'composite' )
                    // InternalOntoUMLArchive.g:1845:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

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


    // $ANTLR start "ruleNavigabilityDeclaration"
    // InternalOntoUMLArchive.g:1855:1: ruleNavigabilityDeclaration returns [Enumerator current=null] : ( (enumLiteral_0= 'navigable' ) | (enumLiteral_1= 'nonnavigable' ) ) ;
    public final Enumerator ruleNavigabilityDeclaration() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1861:2: ( ( (enumLiteral_0= 'navigable' ) | (enumLiteral_1= 'nonnavigable' ) ) )
            // InternalOntoUMLArchive.g:1862:2: ( (enumLiteral_0= 'navigable' ) | (enumLiteral_1= 'nonnavigable' ) )
            {
            // InternalOntoUMLArchive.g:1862:2: ( (enumLiteral_0= 'navigable' ) | (enumLiteral_1= 'nonnavigable' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            else if ( (LA43_0==43) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalOntoUMLArchive.g:1863:3: (enumLiteral_0= 'navigable' )
                    {
                    // InternalOntoUMLArchive.g:1863:3: (enumLiteral_0= 'navigable' )
                    // InternalOntoUMLArchive.g:1864:4: enumLiteral_0= 'navigable'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getNavigabilityDeclarationAccess().getNavigableEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNavigabilityDeclarationAccess().getNavigableEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:1871:3: (enumLiteral_1= 'nonnavigable' )
                    {
                    // InternalOntoUMLArchive.g:1871:3: (enumLiteral_1= 'nonnavigable' )
                    // InternalOntoUMLArchive.g:1872:4: enumLiteral_1= 'nonnavigable'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getNavigabilityDeclarationAccess().getNonnavigableEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNavigabilityDeclarationAccess().getNonnavigableEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleNavigabilityDeclaration"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\63\uffff";
    static final String dfa_2s = "\46\uffff\2\6\11\uffff\1\6\1\uffff";
    static final String dfa_3s = "\1\24\1\4\3\5\1\4\1\uffff\4\4\2\23\1\6\1\4\2\34\2\27\1\6\2\4\2\35\1\31\4\4\2\23\1\6\1\4\1\23\1\4\1\27\2\34\2\17\1\31\1\6\1\4\1\uffff\2\35\1\31\1\23\1\4\1\17\1\31";
    static final String dfa_4s = "\1\24\4\27\1\53\1\uffff\4\53\2\33\1\36\1\7\2\34\2\30\1\36\1\4\1\53\2\35\1\32\4\53\2\33\1\36\1\7\1\23\1\4\1\27\2\34\2\30\1\32\1\36\1\4\1\uffff\2\35\1\32\1\23\1\4\1\27\1\32";
    static final String dfa_5s = "\6\uffff\1\1\44\uffff\1\2\7\uffff";
    static final String dfa_6s = "\63\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\1\4\1\uffff\1\3\15\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\13\2\uffff\1\14\13\uffff\1\16\7\uffff\1\15\14\uffff\1\7\1\10\1\11\1\12",
            "",
            "\1\13\2\uffff\1\14\13\uffff\1\16\7\uffff\1\15\14\uffff\1\7\1\10\1\11\1\12",
            "\1\13\2\uffff\1\14\13\uffff\1\16\7\uffff\1\15\14\uffff\1\7\1\10\1\11\1\12",
            "\1\13\2\uffff\1\14\13\uffff\1\16\7\uffff\1\15\14\uffff\1\7\1\10\1\11\1\12",
            "\1\13\2\uffff\1\14\13\uffff\1\16\7\uffff\1\15\14\uffff\1\7\1\10\1\11\1\12",
            "\1\16\7\uffff\1\15",
            "\1\16\7\uffff\1\15",
            "\1\20\27\uffff\1\17",
            "\1\21\2\uffff\1\22",
            "\1\23",
            "\1\23",
            "\1\25\1\24",
            "\1\25\1\24",
            "\1\27\27\uffff\1\26",
            "\1\30",
            "\1\35\2\uffff\1\36\13\uffff\1\40\7\uffff\1\37\14\uffff\1\31\1\32\1\33\1\34",
            "\1\41",
            "\1\41",
            "\1\42\1\43",
            "\1\35\2\uffff\1\36\13\uffff\1\40\7\uffff\1\37\14\uffff\1\31\1\32\1\33\1\34",
            "\1\35\2\uffff\1\36\13\uffff\1\40\7\uffff\1\37\14\uffff\1\31\1\32\1\33\1\34",
            "\1\35\2\uffff\1\36\13\uffff\1\40\7\uffff\1\37\14\uffff\1\31\1\32\1\33\1\34",
            "\1\35\2\uffff\1\36\13\uffff\1\40\7\uffff\1\37\14\uffff\1\31\1\32\1\33\1\34",
            "\1\40\7\uffff\1\37",
            "\1\40\7\uffff\1\37",
            "\1\45\27\uffff\1\44",
            "\1\46\2\uffff\1\47",
            "\1\16",
            "\1\50",
            "\1\25",
            "\1\51",
            "\1\51",
            "\1\6\7\uffff\1\53\1\52",
            "\1\6\7\uffff\1\53\1\52",
            "\1\42\1\43",
            "\1\55\27\uffff\1\54",
            "\1\56",
            "",
            "\1\57",
            "\1\57",
            "\1\60\1\61",
            "\1\40",
            "\1\62",
            "\1\6\7\uffff\1\53",
            "\1\60\1\61"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "470:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\1\24\1\4\3\5\2\uffff";
    static final String dfa_10s = "\1\24\4\27\2\uffff";
    static final String dfa_11s = "\5\uffff\1\1\1\2";
    static final String dfa_12s = "\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2\1\4\1\uffff\1\3\15\uffff\1\5\1\uffff\1\6",
            "\1\4\17\uffff\1\5\1\uffff\1\6",
            "\1\4\17\uffff\1\5\1\uffff\1\6",
            "\1\4\17\uffff\1\5\1\uffff\1\6",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "506:2: (this_DirectedAssociation_0= ruleDirectedAssociation | this_UndirectedAssociation_1= ruleUndirectedAssociation )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002C80136002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002C80134002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002C80130002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000002000B0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000F0008080090L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000008000B0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000200B0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008000090L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000C080000090L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000002L});

}
