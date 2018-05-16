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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_STEREOTYPE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'publication'", "'authors'", "'ontology'", "';'", "'abstract'", "'class'", "'att'", "':'", "'association'", "'from'", "'to'", "'end'", "'{'", "','", "'}'", "'['", "'..'", "']'", "'*'", "'gen'", "'super'", "'sub'", "'dependency'", "'derivation'", "'relation'", "'genset'", "'disjoint'", "'complete'", "'shared'", "'composite'"
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
    public static final int T__39=39;
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
    public static final int T__40=40;
    public static final int T__41=41;
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
    // InternalOntoUMLArchive.g:326:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( ( ruleStringOrID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_multiplicity_2_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:332:2: ( (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( ( ruleStringOrID ) ) ) )
            // InternalOntoUMLArchive.g:333:2: (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( ( ruleStringOrID ) ) )
            {
            // InternalOntoUMLArchive.g:333:2: (otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:334:3: otherlv_0= 'att' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) ) otherlv_3= ':' ( ( ruleStringOrID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttKeyword_0());
            		
            // InternalOntoUMLArchive.g:338:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalOntoUMLArchive.g:339:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:339:4: (lv_name_1_0= RULE_STRING )
            // InternalOntoUMLArchive.g:340:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            // InternalOntoUMLArchive.g:356:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:357:4: (lv_multiplicity_2_0= ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:357:4: (lv_multiplicity_2_0= ruleMultiplicity )
            // InternalOntoUMLArchive.g:358:5: lv_multiplicity_2_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
            				
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

            otherlv_3=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalOntoUMLArchive.g:379:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:380:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:380:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:381:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getAttTypeClassCrossReference_4_0());
            				
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // InternalOntoUMLArchive.g:399:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalOntoUMLArchive.g:399:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalOntoUMLArchive.g:400:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalOntoUMLArchive.g:406:1: ruleRelationship returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Generalization_1 = null;

        EObject this_DependencyLink_2 = null;

        EObject this_Derivation_3 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:412:2: ( (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation ) )
            // InternalOntoUMLArchive.g:413:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation )
            {
            // InternalOntoUMLArchive.g:413:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink | this_Derivation_3= ruleDerivation )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalOntoUMLArchive.g:414:3: this_Association_0= ruleAssociation
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
                    // InternalOntoUMLArchive.g:423:3: this_Generalization_1= ruleGeneralization
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
                    // InternalOntoUMLArchive.g:432:3: this_DependencyLink_2= ruleDependencyLink
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
                    // InternalOntoUMLArchive.g:441:3: this_Derivation_3= ruleDerivation
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
    // InternalOntoUMLArchive.g:453:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalOntoUMLArchive.g:453:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalOntoUMLArchive.g:454:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalOntoUMLArchive.g:460:1: ruleAssociation returns [EObject current=null] : (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryAssociation_0 = null;

        EObject this_NaryAssociation_1 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:466:2: ( (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation ) )
            // InternalOntoUMLArchive.g:467:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )
            {
            // InternalOntoUMLArchive.g:467:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalOntoUMLArchive.g:468:3: this_BinaryAssociation_0= ruleBinaryAssociation
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
                    // InternalOntoUMLArchive.g:477:3: this_NaryAssociation_1= ruleNaryAssociation
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
    // InternalOntoUMLArchive.g:489:1: entryRuleBinaryAssociation returns [EObject current=null] : iv_ruleBinaryAssociation= ruleBinaryAssociation EOF ;
    public final EObject entryRuleBinaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryAssociation = null;


        try {
            // InternalOntoUMLArchive.g:489:58: (iv_ruleBinaryAssociation= ruleBinaryAssociation EOF )
            // InternalOntoUMLArchive.g:490:2: iv_ruleBinaryAssociation= ruleBinaryAssociation EOF
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
    // InternalOntoUMLArchive.g:496:1: ruleBinaryAssociation returns [EObject current=null] : (this_DirectedAssociation_0= ruleDirectedAssociation | this_UndirectedAssociation_1= ruleUndirectedAssociation ) ;
    public final EObject ruleBinaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_DirectedAssociation_0 = null;

        EObject this_UndirectedAssociation_1 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:502:2: ( (this_DirectedAssociation_0= ruleDirectedAssociation | this_UndirectedAssociation_1= ruleUndirectedAssociation ) )
            // InternalOntoUMLArchive.g:503:2: (this_DirectedAssociation_0= ruleDirectedAssociation | this_UndirectedAssociation_1= ruleUndirectedAssociation )
            {
            // InternalOntoUMLArchive.g:503:2: (this_DirectedAssociation_0= ruleDirectedAssociation | this_UndirectedAssociation_1= ruleUndirectedAssociation )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalOntoUMLArchive.g:504:3: this_DirectedAssociation_0= ruleDirectedAssociation
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
                    // InternalOntoUMLArchive.g:513:3: this_UndirectedAssociation_1= ruleUndirectedAssociation
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
    // InternalOntoUMLArchive.g:525:1: entryRuleDirectedAssociation returns [EObject current=null] : iv_ruleDirectedAssociation= ruleDirectedAssociation EOF ;
    public final EObject entryRuleDirectedAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedAssociation = null;


        try {
            // InternalOntoUMLArchive.g:525:60: (iv_ruleDirectedAssociation= ruleDirectedAssociation EOF )
            // InternalOntoUMLArchive.g:526:2: iv_ruleDirectedAssociation= ruleDirectedAssociation EOF
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
    // InternalOntoUMLArchive.g:532:1: ruleDirectedAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) ) ;
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
            // InternalOntoUMLArchive.g:538:2: ( (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) ) )
            // InternalOntoUMLArchive.g:539:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:539:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:540:3: otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectedAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:544:3: ( (lv_name_1_0= ruleStringOrID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING||LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoUMLArchive.g:545:4: (lv_name_1_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:545:4: (lv_name_1_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:546:5: lv_name_1_0= ruleStringOrID
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

            // InternalOntoUMLArchive.g:563:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STEREOTYPE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:564:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:564:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:565:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
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
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDirectedAssociationAccess().getFromKeyword_3());
            		
            // InternalOntoUMLArchive.g:585:3: ( (lv_from_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:586:4: (lv_from_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:586:4: (lv_from_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:587:5: lv_from_4_0= ruleAssociationEnd
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
            		
            // InternalOntoUMLArchive.g:608:3: ( (lv_to_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:609:4: (lv_to_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:609:4: (lv_to_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:610:5: lv_to_6_0= ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:631:1: entryRuleUndirectedAssociation returns [EObject current=null] : iv_ruleUndirectedAssociation= ruleUndirectedAssociation EOF ;
    public final EObject entryRuleUndirectedAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUndirectedAssociation = null;


        try {
            // InternalOntoUMLArchive.g:631:62: (iv_ruleUndirectedAssociation= ruleUndirectedAssociation EOF )
            // InternalOntoUMLArchive.g:632:2: iv_ruleUndirectedAssociation= ruleUndirectedAssociation EOF
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
    // InternalOntoUMLArchive.g:638:1: ruleUndirectedAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'end' ( (lv_endA_4_0= ruleAssociationEnd ) ) otherlv_5= 'end' ( (lv_endB_6_0= ruleAssociationEnd ) ) ) ;
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
            // InternalOntoUMLArchive.g:644:2: ( (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'end' ( (lv_endA_4_0= ruleAssociationEnd ) ) otherlv_5= 'end' ( (lv_endB_6_0= ruleAssociationEnd ) ) ) )
            // InternalOntoUMLArchive.g:645:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'end' ( (lv_endA_4_0= ruleAssociationEnd ) ) otherlv_5= 'end' ( (lv_endB_6_0= ruleAssociationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:645:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'end' ( (lv_endA_4_0= ruleAssociationEnd ) ) otherlv_5= 'end' ( (lv_endB_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:646:3: otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'end' ( (lv_endA_4_0= ruleAssociationEnd ) ) otherlv_5= 'end' ( (lv_endB_6_0= ruleAssociationEnd ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getUndirectedAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:650:3: ( (lv_name_1_0= ruleStringOrID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoUMLArchive.g:651:4: (lv_name_1_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:651:4: (lv_name_1_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:652:5: lv_name_1_0= ruleStringOrID
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

            // InternalOntoUMLArchive.g:669:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STEREOTYPE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:670:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:670:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:671:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
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
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getUndirectedAssociationAccess().getEndKeyword_3());
            		
            // InternalOntoUMLArchive.g:691:3: ( (lv_endA_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:692:4: (lv_endA_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:692:4: (lv_endA_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:693:5: lv_endA_4_0= ruleAssociationEnd
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
            		
            // InternalOntoUMLArchive.g:714:3: ( (lv_endB_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:715:4: (lv_endB_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:715:4: (lv_endB_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:716:5: lv_endB_6_0= ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:737:1: entryRuleNaryAssociation returns [EObject current=null] : iv_ruleNaryAssociation= ruleNaryAssociation EOF ;
    public final EObject entryRuleNaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaryAssociation = null;


        try {
            // InternalOntoUMLArchive.g:737:56: (iv_ruleNaryAssociation= ruleNaryAssociation EOF )
            // InternalOntoUMLArchive.g:738:2: iv_ruleNaryAssociation= ruleNaryAssociation EOF
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
    // InternalOntoUMLArchive.g:744:1: ruleNaryAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ ) ;
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
            // InternalOntoUMLArchive.g:750:2: ( (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ ) )
            // InternalOntoUMLArchive.g:751:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ )
            {
            // InternalOntoUMLArchive.g:751:2: (otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ )
            // InternalOntoUMLArchive.g:752:3: otherlv_0= 'association' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:756:3: ( (lv_name_1_0= ruleStringOrID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoUMLArchive.g:757:4: (lv_name_1_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:757:4: (lv_name_1_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:758:5: lv_name_1_0= ruleStringOrID
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

            // InternalOntoUMLArchive.g:775:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STEREOTYPE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:776:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:776:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:777:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
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
            	    break loop17;
                }
            } while (true);

            // InternalOntoUMLArchive.g:793:3: (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:794:4: otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) )
            {
            otherlv_3=(Token)match(input,23,FOLLOW_16); 

            				newLeafNode(otherlv_3, grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0());
            			
            // InternalOntoUMLArchive.g:798:4: ( (lv_ends_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:799:5: (lv_ends_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:799:5: (lv_ends_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:800:6: lv_ends_4_0= ruleAssociationEnd
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

            // InternalOntoUMLArchive.g:818:3: (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:819:4: otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) )
            {
            otherlv_5=(Token)match(input,23,FOLLOW_16); 

            				newLeafNode(otherlv_5, grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0());
            			
            // InternalOntoUMLArchive.g:823:4: ( (lv_ends_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:824:5: (lv_ends_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:824:5: (lv_ends_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:825:6: lv_ends_6_0= ruleAssociationEnd
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

            // InternalOntoUMLArchive.g:843:3: (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:844:4: otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0());
            	    			
            	    // InternalOntoUMLArchive.g:848:4: ( (lv_ends_8_0= ruleAssociationEnd ) )
            	    // InternalOntoUMLArchive.g:849:5: (lv_ends_8_0= ruleAssociationEnd )
            	    {
            	    // InternalOntoUMLArchive.g:849:5: (lv_ends_8_0= ruleAssociationEnd )
            	    // InternalOntoUMLArchive.g:850:6: lv_ends_8_0= ruleAssociationEnd
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // InternalOntoUMLArchive.g:872:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalOntoUMLArchive.g:872:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalOntoUMLArchive.g:873:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
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
    // InternalOntoUMLArchive.g:879:1: ruleAssociationEnd returns [EObject current=null] : ( ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )? ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_constraints_6_0=null;
        Token otherlv_7=null;
        Token lv_constraints_8_0=null;
        Token otherlv_9=null;
        Enumerator lv_aggregationKind_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_multiplicity_2_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:885:2: ( ( ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )? ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? ) )
            // InternalOntoUMLArchive.g:886:2: ( ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )? ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? )
            {
            // InternalOntoUMLArchive.g:886:2: ( ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )? ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )? )
            // InternalOntoUMLArchive.g:887:3: ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )? ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_multiplicity_2_0= ruleMultiplicity ) )? otherlv_3= ':' ( ( ruleStringOrID ) ) (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )?
            {
            // InternalOntoUMLArchive.g:887:3: ( (lv_aggregationKind_0_0= ruleAggregationKindDeclaration ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=40 && LA19_0<=41)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoUMLArchive.g:888:4: (lv_aggregationKind_0_0= ruleAggregationKindDeclaration )
                    {
                    // InternalOntoUMLArchive.g:888:4: (lv_aggregationKind_0_0= ruleAggregationKindDeclaration )
                    // InternalOntoUMLArchive.g:889:5: lv_aggregationKind_0_0= ruleAggregationKindDeclaration
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndAccess().getAggregationKindAggregationKindDeclarationEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_22);
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

            // InternalOntoUMLArchive.g:906:3: ( (lv_name_1_0= ruleStringOrID ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING||LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoUMLArchive.g:907:4: (lv_name_1_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:907:4: (lv_name_1_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:908:5: lv_name_1_0= ruleStringOrID
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndAccess().getNameStringOrIDParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_name_1_0=ruleStringOrID();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationEndRule());
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

            // InternalOntoUMLArchive.g:925:3: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOntoUMLArchive.g:926:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    {
                    // InternalOntoUMLArchive.g:926:4: (lv_multiplicity_2_0= ruleMultiplicity )
                    // InternalOntoUMLArchive.g:927:5: lv_multiplicity_2_0= ruleMultiplicity
                    {

                    					newCompositeNode(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
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
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationEndAccess().getColonKeyword_3());
            		
            // InternalOntoUMLArchive.g:948:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:949:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:949:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:950:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_24);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUMLArchive.g:964:3: (otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOntoUMLArchive.g:965:4: otherlv_5= '{' ( (lv_constraints_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalOntoUMLArchive.g:969:4: ( (lv_constraints_6_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:970:5: (lv_constraints_6_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:970:5: (lv_constraints_6_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:971:6: lv_constraints_6_0= RULE_STRING
                    {
                    lv_constraints_6_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

                    // InternalOntoUMLArchive.g:987:4: (otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==25) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:988:5: otherlv_7= ',' ( (lv_constraints_8_0= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getAssociationEndAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:992:5: ( (lv_constraints_8_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:993:6: (lv_constraints_8_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:993:6: (lv_constraints_8_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:994:7: lv_constraints_8_0= RULE_STRING
                    	    {
                    	    lv_constraints_8_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,26,FOLLOW_2); 

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
    // InternalOntoUMLArchive.g:1020:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalOntoUMLArchive.g:1020:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalOntoUMLArchive.g:1021:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalOntoUMLArchive.g:1027:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lower_1_0 = null;

        AntlrDatatypeRuleToken lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1033:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' ) )
            // InternalOntoUMLArchive.g:1034:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' )
            {
            // InternalOntoUMLArchive.g:1034:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' )
            // InternalOntoUMLArchive.g:1035:3: otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOntoUMLArchive.g:1039:3: ( (lv_lower_1_0= ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:1040:4: (lv_lower_1_0= ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:1040:4: (lv_lower_1_0= ruleCARDINALITY )
            // InternalOntoUMLArchive.g:1041:5: lv_lower_1_0= ruleCARDINALITY
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerCARDINALITYParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_2=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalOntoUMLArchive.g:1062:3: ( (lv_upper_3_0= ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:1063:4: (lv_upper_3_0= ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:1063:4: (lv_upper_3_0= ruleCARDINALITY )
            // InternalOntoUMLArchive.g:1064:5: lv_upper_3_0= ruleCARDINALITY
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperCARDINALITYParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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
    // InternalOntoUMLArchive.g:1089:1: entryRuleCARDINALITY returns [String current=null] : iv_ruleCARDINALITY= ruleCARDINALITY EOF ;
    public final String entryRuleCARDINALITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCARDINALITY = null;


        try {
            // InternalOntoUMLArchive.g:1089:51: (iv_ruleCARDINALITY= ruleCARDINALITY EOF )
            // InternalOntoUMLArchive.g:1090:2: iv_ruleCARDINALITY= ruleCARDINALITY EOF
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
    // InternalOntoUMLArchive.g:1096:1: ruleCARDINALITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCARDINALITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1102:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalOntoUMLArchive.g:1103:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalOntoUMLArchive.g:1103:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_INT) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalOntoUMLArchive.g:1104:3: kw= '*'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:1110:3: this_INT_1= RULE_INT
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
    // InternalOntoUMLArchive.g:1121:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalOntoUMLArchive.g:1121:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalOntoUMLArchive.g:1122:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalOntoUMLArchive.g:1128:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( ( ruleStringOrID ) ) otherlv_4= 'sub' ( ( ruleStringOrID ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1134:2: ( (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( ( ruleStringOrID ) ) otherlv_4= 'sub' ( ( ruleStringOrID ) ) ) )
            // InternalOntoUMLArchive.g:1135:2: (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( ( ruleStringOrID ) ) otherlv_4= 'sub' ( ( ruleStringOrID ) ) )
            {
            // InternalOntoUMLArchive.g:1135:2: (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( ( ruleStringOrID ) ) otherlv_4= 'sub' ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:1136:3: otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( ( ruleStringOrID ) ) otherlv_4= 'sub' ( ( ruleStringOrID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGenKeyword_0());
            		
            // InternalOntoUMLArchive.g:1140:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntoUMLArchive.g:1141:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1141:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1142:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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
            		
            // InternalOntoUMLArchive.g:1162:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1163:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1163:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1164:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0());
            				
            pushFollow(FOLLOW_31);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralizationAccess().getSubKeyword_4());
            		
            // InternalOntoUMLArchive.g:1182:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1183:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1183:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1184:5: ruleStringOrID
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
    // InternalOntoUMLArchive.g:1202:1: entryRuleDependencyLink returns [EObject current=null] : iv_ruleDependencyLink= ruleDependencyLink EOF ;
    public final EObject entryRuleDependencyLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyLink = null;


        try {
            // InternalOntoUMLArchive.g:1202:55: (iv_ruleDependencyLink= ruleDependencyLink EOF )
            // InternalOntoUMLArchive.g:1203:2: iv_ruleDependencyLink= ruleDependencyLink EOF
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
    // InternalOntoUMLArchive.g:1209:1: ruleDependencyLink returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( ( ruleStringOrID ) ) otherlv_5= 'to' ( ( ruleStringOrID ) ) ) ;
    public final EObject ruleDependencyLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_stereotypes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1215:2: ( (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( ( ruleStringOrID ) ) otherlv_5= 'to' ( ( ruleStringOrID ) ) ) )
            // InternalOntoUMLArchive.g:1216:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( ( ruleStringOrID ) ) otherlv_5= 'to' ( ( ruleStringOrID ) ) )
            {
            // InternalOntoUMLArchive.g:1216:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( ( ruleStringOrID ) ) otherlv_5= 'to' ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:1217:3: otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'from' ( ( ruleStringOrID ) ) otherlv_5= 'to' ( ( ruleStringOrID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0());
            		
            // InternalOntoUMLArchive.g:1221:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoUMLArchive.g:1222:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1222:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1223:5: lv_name_1_0= RULE_STRING
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

            // InternalOntoUMLArchive.g:1239:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_STEREOTYPE_STRING) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1240:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:1240:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:1241:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
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
            	    break loop27;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyLinkAccess().getFromKeyword_3());
            		
            // InternalOntoUMLArchive.g:1261:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1262:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1262:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1263:5: ruleStringOrID
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
            		
            // InternalOntoUMLArchive.g:1281:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1282:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1282:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1283:5: ruleStringOrID
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
    // InternalOntoUMLArchive.g:1301:1: entryRuleDerivation returns [EObject current=null] : iv_ruleDerivation= ruleDerivation EOF ;
    public final EObject entryRuleDerivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivation = null;


        try {
            // InternalOntoUMLArchive.g:1301:51: (iv_ruleDerivation= ruleDerivation EOF )
            // InternalOntoUMLArchive.g:1302:2: iv_ruleDerivation= ruleDerivation EOF
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
    // InternalOntoUMLArchive.g:1308:1: ruleDerivation returns [EObject current=null] : (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) ) ;
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
            // InternalOntoUMLArchive.g:1314:2: ( (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) ) )
            // InternalOntoUMLArchive.g:1315:2: (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:1315:2: (otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) ) )
            // InternalOntoUMLArchive.g:1316:3: otherlv_0= 'derivation' ( (lv_name_1_0= ruleStringOrID ) )? ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )* otherlv_3= 'class' ( (lv_class_4_0= ruleClassDerivationEnd ) ) otherlv_5= 'relation' ( (lv_part_6_0= ruleRelationDerivationEnd ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getDerivationAccess().getDerivationKeyword_0());
            		
            // InternalOntoUMLArchive.g:1320:3: ( (lv_name_1_0= ruleStringOrID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING||LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoUMLArchive.g:1321:4: (lv_name_1_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:1321:4: (lv_name_1_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:1322:5: lv_name_1_0= ruleStringOrID
                    {

                    					newCompositeNode(grammarAccess.getDerivationAccess().getNameStringOrIDParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_34);
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

            // InternalOntoUMLArchive.g:1339:3: ( (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STEREOTYPE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1340:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    {
            	    // InternalOntoUMLArchive.g:1340:4: (lv_stereotypes_2_0= RULE_STEREOTYPE_STRING )
            	    // InternalOntoUMLArchive.g:1341:5: lv_stereotypes_2_0= RULE_STEREOTYPE_STRING
            	    {
            	    lv_stereotypes_2_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_34); 

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
            	    break loop29;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getDerivationAccess().getClassKeyword_3());
            		
            // InternalOntoUMLArchive.g:1361:3: ( (lv_class_4_0= ruleClassDerivationEnd ) )
            // InternalOntoUMLArchive.g:1362:4: (lv_class_4_0= ruleClassDerivationEnd )
            {
            // InternalOntoUMLArchive.g:1362:4: (lv_class_4_0= ruleClassDerivationEnd )
            // InternalOntoUMLArchive.g:1363:5: lv_class_4_0= ruleClassDerivationEnd
            {

            					newCompositeNode(grammarAccess.getDerivationAccess().getClassClassDerivationEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_5=(Token)match(input,36,FOLLOW_35); 

            			newLeafNode(otherlv_5, grammarAccess.getDerivationAccess().getRelationKeyword_5());
            		
            // InternalOntoUMLArchive.g:1384:3: ( (lv_part_6_0= ruleRelationDerivationEnd ) )
            // InternalOntoUMLArchive.g:1385:4: (lv_part_6_0= ruleRelationDerivationEnd )
            {
            // InternalOntoUMLArchive.g:1385:4: (lv_part_6_0= ruleRelationDerivationEnd )
            // InternalOntoUMLArchive.g:1386:5: lv_part_6_0= ruleRelationDerivationEnd
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
    // InternalOntoUMLArchive.g:1407:1: entryRuleClassDerivationEnd returns [EObject current=null] : iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF ;
    public final EObject entryRuleClassDerivationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDerivationEnd = null;


        try {
            // InternalOntoUMLArchive.g:1407:59: (iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF )
            // InternalOntoUMLArchive.g:1408:2: iv_ruleClassDerivationEnd= ruleClassDerivationEnd EOF
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
    // InternalOntoUMLArchive.g:1414:1: ruleClassDerivationEnd returns [EObject current=null] : ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) ;
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
            // InternalOntoUMLArchive.g:1420:2: ( ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) )
            // InternalOntoUMLArchive.g:1421:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            {
            // InternalOntoUMLArchive.g:1421:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            // InternalOntoUMLArchive.g:1422:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            {
            // InternalOntoUMLArchive.g:1422:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoUMLArchive.g:1423:4: (lv_multiplicity_0_0= ruleMultiplicity )
                    {
                    // InternalOntoUMLArchive.g:1423:4: (lv_multiplicity_0_0= ruleMultiplicity )
                    // InternalOntoUMLArchive.g:1424:5: lv_multiplicity_0_0= ruleMultiplicity
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

            // InternalOntoUMLArchive.g:1441:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1442:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1442:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1443:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDerivationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClassDerivationEndAccess().getEndTypeClassCrossReference_1_0());
            				
            pushFollow(FOLLOW_24);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUMLArchive.g:1457:3: (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoUMLArchive.g:1458:4: otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassDerivationEndAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalOntoUMLArchive.g:1462:4: ( (lv_constraints_3_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:1463:5: (lv_constraints_3_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1463:5: (lv_constraints_3_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1464:6: lv_constraints_3_0= RULE_STRING
                    {
                    lv_constraints_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

                    // InternalOntoUMLArchive.g:1480:4: (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==25) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:1481:5: otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getClassDerivationEndAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:1485:5: ( (lv_constraints_5_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:1486:6: (lv_constraints_5_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:1486:6: (lv_constraints_5_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:1487:7: lv_constraints_5_0= RULE_STRING
                    	    {
                    	    lv_constraints_5_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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
                    	    break loop31;
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
    // InternalOntoUMLArchive.g:1513:1: entryRuleRelationDerivationEnd returns [EObject current=null] : iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF ;
    public final EObject entryRuleRelationDerivationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDerivationEnd = null;


        try {
            // InternalOntoUMLArchive.g:1513:62: (iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF )
            // InternalOntoUMLArchive.g:1514:2: iv_ruleRelationDerivationEnd= ruleRelationDerivationEnd EOF
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
    // InternalOntoUMLArchive.g:1520:1: ruleRelationDerivationEnd returns [EObject current=null] : ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) ;
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
            // InternalOntoUMLArchive.g:1526:2: ( ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? ) )
            // InternalOntoUMLArchive.g:1527:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            {
            // InternalOntoUMLArchive.g:1527:2: ( ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )? )
            // InternalOntoUMLArchive.g:1528:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )? ( ( ruleStringOrID ) ) (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            {
            // InternalOntoUMLArchive.g:1528:3: ( (lv_multiplicity_0_0= ruleMultiplicity ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOntoUMLArchive.g:1529:4: (lv_multiplicity_0_0= ruleMultiplicity )
                    {
                    // InternalOntoUMLArchive.g:1529:4: (lv_multiplicity_0_0= ruleMultiplicity )
                    // InternalOntoUMLArchive.g:1530:5: lv_multiplicity_0_0= ruleMultiplicity
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

            // InternalOntoUMLArchive.g:1547:3: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:1548:4: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:1548:4: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:1549:5: ruleStringOrID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationDerivationEndRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationCrossReference_1_0());
            				
            pushFollow(FOLLOW_24);
            ruleStringOrID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUMLArchive.g:1563:3: (otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOntoUMLArchive.g:1564:4: otherlv_2= '{' ( (lv_constraints_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationDerivationEndAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalOntoUMLArchive.g:1568:4: ( (lv_constraints_3_0= RULE_STRING ) )
                    // InternalOntoUMLArchive.g:1569:5: (lv_constraints_3_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:1569:5: (lv_constraints_3_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:1570:6: lv_constraints_3_0= RULE_STRING
                    {
                    lv_constraints_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

                    // InternalOntoUMLArchive.g:1586:4: (otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==25) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalOntoUMLArchive.g:1587:5: otherlv_4= ',' ( (lv_constraints_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRelationDerivationEndAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOntoUMLArchive.g:1591:5: ( (lv_constraints_5_0= RULE_STRING ) )
                    	    // InternalOntoUMLArchive.g:1592:6: (lv_constraints_5_0= RULE_STRING )
                    	    {
                    	    // InternalOntoUMLArchive.g:1592:6: (lv_constraints_5_0= RULE_STRING )
                    	    // InternalOntoUMLArchive.g:1593:7: lv_constraints_5_0= RULE_STRING
                    	    {
                    	    lv_constraints_5_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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
                    	    break loop34;
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
    // InternalOntoUMLArchive.g:1619:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoUMLArchive.g:1619:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoUMLArchive.g:1620:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
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
    // InternalOntoUMLArchive.g:1626:1: ruleGeneralizationSet returns [EObject current=null] : (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleStringOrID ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDisjoint_2_0=null;
        Token lv_isComplete_3_0=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_generalizations_5_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1632:2: ( (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleStringOrID ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ ) )
            // InternalOntoUMLArchive.g:1633:2: (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleStringOrID ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ )
            {
            // InternalOntoUMLArchive.g:1633:2: (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleStringOrID ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ )
            // InternalOntoUMLArchive.g:1634:3: otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= ruleStringOrID ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0());
            		
            // InternalOntoUMLArchive.g:1638:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) )
            // InternalOntoUMLArchive.g:1639:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) )
            {
            // InternalOntoUMLArchive.g:1639:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) )
            // InternalOntoUMLArchive.g:1640:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            				
            // InternalOntoUMLArchive.g:1643:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* )
            // InternalOntoUMLArchive.g:1644:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )*
            {
            // InternalOntoUMLArchive.g:1644:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1645:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:1645:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )
            	    // InternalOntoUMLArchive.g:1646:5: {...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalOntoUMLArchive.g:1646:114: ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    // InternalOntoUMLArchive.g:1647:6: ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalOntoUMLArchive.g:1650:9: ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    // InternalOntoUMLArchive.g:1650:10: {...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUMLArchive.g:1650:19: ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    // InternalOntoUMLArchive.g:1650:20: (lv_isDisjoint_2_0= 'disjoint' )
            	    {
            	    // InternalOntoUMLArchive.g:1650:20: (lv_isDisjoint_2_0= 'disjoint' )
            	    // InternalOntoUMLArchive.g:1651:10: lv_isDisjoint_2_0= 'disjoint'
            	    {
            	    lv_isDisjoint_2_0=(Token)match(input,38,FOLLOW_37); 

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
            	    // InternalOntoUMLArchive.g:1668:4: ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:1668:4: ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) )
            	    // InternalOntoUMLArchive.g:1669:5: {...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalOntoUMLArchive.g:1669:114: ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) )
            	    // InternalOntoUMLArchive.g:1670:6: ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalOntoUMLArchive.g:1673:9: ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) )
            	    // InternalOntoUMLArchive.g:1673:10: {...}? => ( (lv_isComplete_3_0= 'complete' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUMLArchive.g:1673:19: ( (lv_isComplete_3_0= 'complete' ) )
            	    // InternalOntoUMLArchive.g:1673:20: (lv_isComplete_3_0= 'complete' )
            	    {
            	    // InternalOntoUMLArchive.g:1673:20: (lv_isComplete_3_0= 'complete' )
            	    // InternalOntoUMLArchive.g:1674:10: lv_isComplete_3_0= 'complete'
            	    {
            	    lv_isComplete_3_0=(Token)match(input,39,FOLLOW_37); 

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
            	    break loop36;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            				

            }

            // InternalOntoUMLArchive.g:1698:3: ( (lv_name_4_0= ruleStringOrID ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING||LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntoUMLArchive.g:1699:4: (lv_name_4_0= ruleStringOrID )
                    {
                    // InternalOntoUMLArchive.g:1699:4: (lv_name_4_0= ruleStringOrID )
                    // InternalOntoUMLArchive.g:1700:5: lv_name_4_0= ruleStringOrID
                    {

                    					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getNameStringOrIDParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_38);
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

            // InternalOntoUMLArchive.g:1717:3: ( (lv_generalizations_5_0= ruleGeneralization ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==31) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1718:4: (lv_generalizations_5_0= ruleGeneralization )
            	    {
            	    // InternalOntoUMLArchive.g:1718:4: (lv_generalizations_5_0= ruleGeneralization )
            	    // InternalOntoUMLArchive.g:1719:5: lv_generalizations_5_0= ruleGeneralization
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
    // InternalOntoUMLArchive.g:1740:1: entryRuleStringOrID returns [String current=null] : iv_ruleStringOrID= ruleStringOrID EOF ;
    public final String entryRuleStringOrID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringOrID = null;


        try {
            // InternalOntoUMLArchive.g:1740:50: (iv_ruleStringOrID= ruleStringOrID EOF )
            // InternalOntoUMLArchive.g:1741:2: iv_ruleStringOrID= ruleStringOrID EOF
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
    // InternalOntoUMLArchive.g:1747:1: ruleStringOrID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleStringOrID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1753:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOntoUMLArchive.g:1754:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOntoUMLArchive.g:1754:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalOntoUMLArchive.g:1755:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:1763:3: this_ID_1= RULE_ID
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
    // InternalOntoUMLArchive.g:1774:1: ruleAggregationKindDeclaration returns [Enumerator current=null] : ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleAggregationKindDeclaration() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1780:2: ( ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalOntoUMLArchive.g:1781:2: ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalOntoUMLArchive.g:1781:2: ( (enumLiteral_0= 'shared' ) | (enumLiteral_1= 'composite' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            else if ( (LA40_0==41) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalOntoUMLArchive.g:1782:3: (enumLiteral_0= 'shared' )
                    {
                    // InternalOntoUMLArchive.g:1782:3: (enumLiteral_0= 'shared' )
                    // InternalOntoUMLArchive.g:1783:4: enumLiteral_0= 'shared'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:1790:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalOntoUMLArchive.g:1790:3: (enumLiteral_1= 'composite' )
                    // InternalOntoUMLArchive.g:1791:4: enumLiteral_1= 'composite'
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

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\57\uffff";
    static final String dfa_2s = "\42\uffff\2\6\11\uffff\1\6\1\uffff";
    static final String dfa_3s = "\1\24\1\4\3\5\1\4\1\uffff\2\4\2\23\1\6\1\4\2\34\2\27\1\6\2\4\2\35\1\31\2\4\2\23\1\6\1\4\1\23\1\4\1\27\2\34\2\17\1\31\1\6\1\4\1\uffff\2\35\1\31\1\23\1\4\1\17\1\31";
    static final String dfa_4s = "\1\24\4\27\1\51\1\uffff\4\33\1\36\1\7\2\34\2\30\1\36\1\4\1\51\2\35\1\32\4\33\1\36\1\7\1\23\1\4\1\27\2\34\2\30\1\32\1\36\1\4\1\uffff\2\35\1\32\1\23\1\4\1\27\1\32";
    static final String dfa_5s = "\6\uffff\1\1\40\uffff\1\2\7\uffff";
    static final String dfa_6s = "\57\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\1\4\1\uffff\1\3\15\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\11\2\uffff\1\12\13\uffff\1\14\7\uffff\1\13\14\uffff\1\7\1\10",
            "",
            "\1\11\2\uffff\1\12\13\uffff\1\14\7\uffff\1\13",
            "\1\11\2\uffff\1\12\13\uffff\1\14\7\uffff\1\13",
            "\1\14\7\uffff\1\13",
            "\1\14\7\uffff\1\13",
            "\1\16\27\uffff\1\15",
            "\1\17\2\uffff\1\20",
            "\1\21",
            "\1\21",
            "\1\23\1\22",
            "\1\23\1\22",
            "\1\25\27\uffff\1\24",
            "\1\26",
            "\1\31\2\uffff\1\32\13\uffff\1\34\7\uffff\1\33\14\uffff\1\27\1\30",
            "\1\35",
            "\1\35",
            "\1\36\1\37",
            "\1\31\2\uffff\1\32\13\uffff\1\34\7\uffff\1\33",
            "\1\31\2\uffff\1\32\13\uffff\1\34\7\uffff\1\33",
            "\1\34\7\uffff\1\33",
            "\1\34\7\uffff\1\33",
            "\1\41\27\uffff\1\40",
            "\1\42\2\uffff\1\43",
            "\1\14",
            "\1\44",
            "\1\23",
            "\1\45",
            "\1\45",
            "\1\6\7\uffff\1\47\1\46",
            "\1\6\7\uffff\1\47\1\46",
            "\1\36\1\37",
            "\1\51\27\uffff\1\50",
            "\1\52",
            "",
            "\1\53",
            "\1\53",
            "\1\54\1\55",
            "\1\34",
            "\1\56",
            "\1\6\7\uffff\1\47",
            "\1\54\1\55"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "467:2: (this_BinaryAssociation_0= ruleBinaryAssociation | this_NaryAssociation_1= ruleNaryAssociation )";
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "503:2: (this_DirectedAssociation_0= ruleDirectedAssociation | this_UndirectedAssociation_1= ruleUndirectedAssociation )";
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000002000B0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000030008080090L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000008000B0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008080090L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000000200B0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000090L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000C080000090L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000080000002L});

}
