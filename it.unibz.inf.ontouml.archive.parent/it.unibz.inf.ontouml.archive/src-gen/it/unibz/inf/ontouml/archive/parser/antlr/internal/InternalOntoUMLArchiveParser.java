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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_STEREOTYPE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'abstract'", "'class'", "'association'", "'from'", "'to'", "'end'", "':'", "'['", "'..'", "']'", "'*'", "'gen'", "'super'", "'sub'", "'dependency'", "'genset'", "'disjoint'", "'complete'"
    };
    public static final int RULE_STEREOTYPE_STRING=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    // InternalOntoUMLArchive.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elments_0_0= ruleModelElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elments_0_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:77:2: ( ( (lv_elments_0_0= ruleModelElement ) )* )
            // InternalOntoUMLArchive.g:78:2: ( (lv_elments_0_0= ruleModelElement ) )*
            {
            // InternalOntoUMLArchive.g:78:2: ( (lv_elments_0_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=15)||LA1_0==24||(LA1_0>=27 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:79:3: (lv_elments_0_0= ruleModelElement )
            	    {
            	    // InternalOntoUMLArchive.g:79:3: (lv_elments_0_0= ruleModelElement )
            	    // InternalOntoUMLArchive.g:80:4: lv_elments_0_0= ruleModelElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElmentsModelElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elments_0_0=ruleModelElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elments",
            	    					lv_elments_0_0,
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
            case 15:
            case 24:
            case 27:
                {
                alt2=2;
                }
                break;
            case 28:
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
    // InternalOntoUMLArchive.g:158:1: ruleClass returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotype_3_0= ruleStereotype ) )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_stereotype_3_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:164:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotype_3_0= ruleStereotype ) )? ) )
            // InternalOntoUMLArchive.g:165:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotype_3_0= ruleStereotype ) )? )
            {
            // InternalOntoUMLArchive.g:165:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotype_3_0= ruleStereotype ) )? )
            // InternalOntoUMLArchive.g:166:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_stereotype_3_0= ruleStereotype ) )?
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

            // InternalOntoUMLArchive.g:202:3: ( (lv_stereotype_3_0= ruleStereotype ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STEREOTYPE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoUMLArchive.g:203:4: (lv_stereotype_3_0= ruleStereotype )
                    {
                    // InternalOntoUMLArchive.g:203:4: (lv_stereotype_3_0= ruleStereotype )
                    // InternalOntoUMLArchive.g:204:5: lv_stereotype_3_0= ruleStereotype
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getStereotypeStereotypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_stereotype_3_0=ruleStereotype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"stereotype",
                    						lv_stereotype_3_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Stereotype");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleRelationship"
    // InternalOntoUMLArchive.g:225:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalOntoUMLArchive.g:225:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalOntoUMLArchive.g:226:2: iv_ruleRelationship= ruleRelationship EOF
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
    // InternalOntoUMLArchive.g:232:1: ruleRelationship returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Generalization_1 = null;

        EObject this_DependencyLink_2 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:238:2: ( (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink ) )
            // InternalOntoUMLArchive.g:239:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink )
            {
            // InternalOntoUMLArchive.g:239:2: (this_Association_0= ruleAssociation | this_Generalization_1= ruleGeneralization | this_DependencyLink_2= ruleDependencyLink )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 27:
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
                    // InternalOntoUMLArchive.g:240:3: this_Association_0= ruleAssociation
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
                    // InternalOntoUMLArchive.g:249:3: this_Generalization_1= ruleGeneralization
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
                    // InternalOntoUMLArchive.g:258:3: this_DependencyLink_2= ruleDependencyLink
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getDependencyLinkParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DependencyLink_2=ruleDependencyLink();

                    state._fsp--;


                    			current = this_DependencyLink_2;
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
    // InternalOntoUMLArchive.g:270:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalOntoUMLArchive.g:270:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalOntoUMLArchive.g:271:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalOntoUMLArchive.g:277:1: ruleAssociation returns [EObject current=null] : (this_RegularAssociation_0= ruleRegularAssociation | this_NaryAssociation_1= ruleNaryAssociation ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        EObject this_RegularAssociation_0 = null;

        EObject this_NaryAssociation_1 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:283:2: ( (this_RegularAssociation_0= ruleRegularAssociation | this_NaryAssociation_1= ruleNaryAssociation ) )
            // InternalOntoUMLArchive.g:284:2: (this_RegularAssociation_0= ruleRegularAssociation | this_NaryAssociation_1= ruleNaryAssociation )
            {
            // InternalOntoUMLArchive.g:284:2: (this_RegularAssociation_0= ruleRegularAssociation | this_NaryAssociation_1= ruleNaryAssociation )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_STEREOTYPE_STRING:
                        {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==16) ) {
                            alt6=1;
                        }
                        else if ( (LA6_3==18) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 16:
                        {
                        alt6=1;
                        }
                        break;
                    case 18:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_STEREOTYPE_STRING:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==16) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==18) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 16:
                    {
                    alt6=1;
                    }
                    break;
                case 18:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUMLArchive.g:285:3: this_RegularAssociation_0= ruleRegularAssociation
                    {

                    			newCompositeNode(grammarAccess.getAssociationAccess().getRegularAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularAssociation_0=ruleRegularAssociation();

                    state._fsp--;


                    			current = this_RegularAssociation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:294:3: this_NaryAssociation_1= ruleNaryAssociation
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


    // $ANTLR start "entryRuleRegularAssociation"
    // InternalOntoUMLArchive.g:306:1: entryRuleRegularAssociation returns [EObject current=null] : iv_ruleRegularAssociation= ruleRegularAssociation EOF ;
    public final EObject entryRuleRegularAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularAssociation = null;


        try {
            // InternalOntoUMLArchive.g:306:59: (iv_ruleRegularAssociation= ruleRegularAssociation EOF )
            // InternalOntoUMLArchive.g:307:2: iv_ruleRegularAssociation= ruleRegularAssociation EOF
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
    // InternalOntoUMLArchive.g:313:1: ruleRegularAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotype_2_0= ruleStereotype ) )? otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) ) ;
    public final EObject ruleRegularAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_stereotype_2_0 = null;

        EObject lv_from_4_0 = null;

        EObject lv_to_6_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:319:2: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotype_2_0= ruleStereotype ) )? otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) ) )
            // InternalOntoUMLArchive.g:320:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotype_2_0= ruleStereotype ) )? otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) )
            {
            // InternalOntoUMLArchive.g:320:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotype_2_0= ruleStereotype ) )? otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:321:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotype_2_0= ruleStereotype ) )? otherlv_3= 'from' ( (lv_from_4_0= ruleAssociationEnd ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleAssociationEnd ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:325:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoUMLArchive.g:326:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:326:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:327:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            // InternalOntoUMLArchive.g:343:3: ( (lv_stereotype_2_0= ruleStereotype ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STEREOTYPE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoUMLArchive.g:344:4: (lv_stereotype_2_0= ruleStereotype )
                    {
                    // InternalOntoUMLArchive.g:344:4: (lv_stereotype_2_0= ruleStereotype )
                    // InternalOntoUMLArchive.g:345:5: lv_stereotype_2_0= ruleStereotype
                    {

                    					newCompositeNode(grammarAccess.getRegularAssociationAccess().getStereotypeStereotypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_stereotype_2_0=ruleStereotype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
                    					}
                    					set(
                    						current,
                    						"stereotype",
                    						lv_stereotype_2_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Stereotype");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularAssociationAccess().getFromKeyword_3());
            		
            // InternalOntoUMLArchive.g:366:3: ( (lv_from_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:367:4: (lv_from_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:367:4: (lv_from_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:368:5: lv_from_4_0= ruleAssociationEnd
            {

            					newCompositeNode(grammarAccess.getRegularAssociationAccess().getFromAssociationEndParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getRegularAssociationAccess().getToKeyword_5());
            		
            // InternalOntoUMLArchive.g:389:3: ( (lv_to_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:390:4: (lv_to_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:390:4: (lv_to_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:391:5: lv_to_6_0= ruleAssociationEnd
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


    // $ANTLR start "entryRuleNaryAssociation"
    // InternalOntoUMLArchive.g:412:1: entryRuleNaryAssociation returns [EObject current=null] : iv_ruleNaryAssociation= ruleNaryAssociation EOF ;
    public final EObject entryRuleNaryAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaryAssociation = null;


        try {
            // InternalOntoUMLArchive.g:412:56: (iv_ruleNaryAssociation= ruleNaryAssociation EOF )
            // InternalOntoUMLArchive.g:413:2: iv_ruleNaryAssociation= ruleNaryAssociation EOF
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
    // InternalOntoUMLArchive.g:419:1: ruleNaryAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotype_2_0= ruleStereotype ) )? (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ ) ;
    public final EObject ruleNaryAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_stereotype_2_0 = null;

        EObject lv_ends_4_0 = null;

        EObject lv_ends_6_0 = null;

        EObject lv_ends_8_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:425:2: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotype_2_0= ruleStereotype ) )? (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ ) )
            // InternalOntoUMLArchive.g:426:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotype_2_0= ruleStereotype ) )? (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ )
            {
            // InternalOntoUMLArchive.g:426:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotype_2_0= ruleStereotype ) )? (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+ )
            // InternalOntoUMLArchive.g:427:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_STRING ) )? ( (lv_stereotype_2_0= ruleStereotype ) )? (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) ) (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) ) (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0());
            		
            // InternalOntoUMLArchive.g:431:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoUMLArchive.g:432:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:432:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:433:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            // InternalOntoUMLArchive.g:449:3: ( (lv_stereotype_2_0= ruleStereotype ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STEREOTYPE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUMLArchive.g:450:4: (lv_stereotype_2_0= ruleStereotype )
                    {
                    // InternalOntoUMLArchive.g:450:4: (lv_stereotype_2_0= ruleStereotype )
                    // InternalOntoUMLArchive.g:451:5: lv_stereotype_2_0= ruleStereotype
                    {

                    					newCompositeNode(grammarAccess.getNaryAssociationAccess().getStereotypeStereotypeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_stereotype_2_0=ruleStereotype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNaryAssociationRule());
                    					}
                    					set(
                    						current,
                    						"stereotype",
                    						lv_stereotype_2_0,
                    						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Stereotype");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOntoUMLArchive.g:468:3: (otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:469:4: otherlv_3= 'end' ( (lv_ends_4_0= ruleAssociationEnd ) )
            {
            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            				newLeafNode(otherlv_3, grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0());
            			
            // InternalOntoUMLArchive.g:473:4: ( (lv_ends_4_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:474:5: (lv_ends_4_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:474:5: (lv_ends_4_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:475:6: lv_ends_4_0= ruleAssociationEnd
            {

            						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_15);
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

            // InternalOntoUMLArchive.g:493:3: (otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) ) )
            // InternalOntoUMLArchive.g:494:4: otherlv_5= 'end' ( (lv_ends_6_0= ruleAssociationEnd ) )
            {
            otherlv_5=(Token)match(input,18,FOLLOW_11); 

            				newLeafNode(otherlv_5, grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0());
            			
            // InternalOntoUMLArchive.g:498:4: ( (lv_ends_6_0= ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:499:5: (lv_ends_6_0= ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:499:5: (lv_ends_6_0= ruleAssociationEnd )
            // InternalOntoUMLArchive.g:500:6: lv_ends_6_0= ruleAssociationEnd
            {

            						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_15);
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

            // InternalOntoUMLArchive.g:518:3: (otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:519:4: otherlv_7= 'end' ( (lv_ends_8_0= ruleAssociationEnd ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0());
            	    			
            	    // InternalOntoUMLArchive.g:523:4: ( (lv_ends_8_0= ruleAssociationEnd ) )
            	    // InternalOntoUMLArchive.g:524:5: (lv_ends_8_0= ruleAssociationEnd )
            	    {
            	    // InternalOntoUMLArchive.g:524:5: (lv_ends_8_0= ruleAssociationEnd )
            	    // InternalOntoUMLArchive.g:525:6: lv_ends_8_0= ruleAssociationEnd
            	    {

            	    						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalOntoUMLArchive.g:547:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // InternalOntoUMLArchive.g:547:55: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // InternalOntoUMLArchive.g:548:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
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
    // InternalOntoUMLArchive.g:554:1: ruleAssociationEnd returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_multiplicity_1_0= ruleMultiplicity ) ) otherlv_2= ':' ( (otherlv_3= RULE_STRING ) ) ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_multiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:560:2: ( ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_multiplicity_1_0= ruleMultiplicity ) ) otherlv_2= ':' ( (otherlv_3= RULE_STRING ) ) ) )
            // InternalOntoUMLArchive.g:561:2: ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_multiplicity_1_0= ruleMultiplicity ) ) otherlv_2= ':' ( (otherlv_3= RULE_STRING ) ) )
            {
            // InternalOntoUMLArchive.g:561:2: ( ( (lv_name_0_0= RULE_STRING ) )? ( (lv_multiplicity_1_0= ruleMultiplicity ) ) otherlv_2= ':' ( (otherlv_3= RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:562:3: ( (lv_name_0_0= RULE_STRING ) )? ( (lv_multiplicity_1_0= ruleMultiplicity ) ) otherlv_2= ':' ( (otherlv_3= RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:562:3: ( (lv_name_0_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoUMLArchive.g:563:4: (lv_name_0_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:563:4: (lv_name_0_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:564:5: lv_name_0_0= RULE_STRING
                    {
                    lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            // InternalOntoUMLArchive.g:580:3: ( (lv_multiplicity_1_0= ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:581:4: (lv_multiplicity_1_0= ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:581:4: (lv_multiplicity_1_0= ruleMultiplicity )
            // InternalOntoUMLArchive.g:582:5: lv_multiplicity_1_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationEndAccess().getColonKeyword_2());
            		
            // InternalOntoUMLArchive.g:603:3: ( (otherlv_3= RULE_STRING ) )
            // InternalOntoUMLArchive.g:604:4: (otherlv_3= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:604:4: (otherlv_3= RULE_STRING )
            // InternalOntoUMLArchive.g:605:5: otherlv_3= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationEndRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_3_0());
            				

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
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalOntoUMLArchive.g:620:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalOntoUMLArchive.g:620:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalOntoUMLArchive.g:621:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalOntoUMLArchive.g:627:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_lower_1_0 = null;

        AntlrDatatypeRuleToken lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:633:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' ) )
            // InternalOntoUMLArchive.g:634:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' )
            {
            // InternalOntoUMLArchive.g:634:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']' )
            // InternalOntoUMLArchive.g:635:3: otherlv_0= '[' ( (lv_lower_1_0= ruleCARDINALITY ) ) otherlv_2= '..' ( (lv_upper_3_0= ruleCARDINALITY ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOntoUMLArchive.g:639:3: ( (lv_lower_1_0= ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:640:4: (lv_lower_1_0= ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:640:4: (lv_lower_1_0= ruleCARDINALITY )
            // InternalOntoUMLArchive.g:641:5: lv_lower_1_0= ruleCARDINALITY
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerCARDINALITYParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalOntoUMLArchive.g:662:3: ( (lv_upper_3_0= ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:663:4: (lv_upper_3_0= ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:663:4: (lv_upper_3_0= ruleCARDINALITY )
            // InternalOntoUMLArchive.g:664:5: lv_upper_3_0= ruleCARDINALITY
            {

            					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperCARDINALITYParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalOntoUMLArchive.g:689:1: entryRuleCARDINALITY returns [String current=null] : iv_ruleCARDINALITY= ruleCARDINALITY EOF ;
    public final String entryRuleCARDINALITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCARDINALITY = null;


        try {
            // InternalOntoUMLArchive.g:689:51: (iv_ruleCARDINALITY= ruleCARDINALITY EOF )
            // InternalOntoUMLArchive.g:690:2: iv_ruleCARDINALITY= ruleCARDINALITY EOF
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
    // InternalOntoUMLArchive.g:696:1: ruleCARDINALITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCARDINALITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:702:2: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // InternalOntoUMLArchive.g:703:2: (kw= '*' | this_INT_1= RULE_INT )
            {
            // InternalOntoUMLArchive.g:703:2: (kw= '*' | this_INT_1= RULE_INT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoUMLArchive.g:704:3: kw= '*'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:710:3: this_INT_1= RULE_INT
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
    // InternalOntoUMLArchive.g:721:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalOntoUMLArchive.g:721:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalOntoUMLArchive.g:722:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalOntoUMLArchive.g:728:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) ) ;
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
            // InternalOntoUMLArchive.g:734:2: ( (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) ) )
            // InternalOntoUMLArchive.g:735:2: (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) )
            {
            // InternalOntoUMLArchive.g:735:2: (otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:736:3: otherlv_0= 'gen' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'super' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'sub' ( (otherlv_5= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGenKeyword_0());
            		
            // InternalOntoUMLArchive.g:740:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoUMLArchive.g:741:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:741:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:742:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getSuperKeyword_2());
            		
            // InternalOntoUMLArchive.g:762:3: ( (otherlv_3= RULE_STRING ) )
            // InternalOntoUMLArchive.g:763:4: (otherlv_3= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:763:4: (otherlv_3= RULE_STRING )
            // InternalOntoUMLArchive.g:764:5: otherlv_3= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralizationAccess().getSubKeyword_4());
            		
            // InternalOntoUMLArchive.g:779:3: ( (otherlv_5= RULE_STRING ) )
            // InternalOntoUMLArchive.g:780:4: (otherlv_5= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:780:4: (otherlv_5= RULE_STRING )
            // InternalOntoUMLArchive.g:781:5: otherlv_5= RULE_STRING
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
    // InternalOntoUMLArchive.g:796:1: entryRuleDependencyLink returns [EObject current=null] : iv_ruleDependencyLink= ruleDependencyLink EOF ;
    public final EObject entryRuleDependencyLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyLink = null;


        try {
            // InternalOntoUMLArchive.g:796:55: (iv_ruleDependencyLink= ruleDependencyLink EOF )
            // InternalOntoUMLArchive.g:797:2: iv_ruleDependencyLink= ruleDependencyLink EOF
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
    // InternalOntoUMLArchive.g:803:1: ruleDependencyLink returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'from' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'to' ( (otherlv_5= RULE_STRING ) ) ) ;
    public final EObject ruleDependencyLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:809:2: ( (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'from' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'to' ( (otherlv_5= RULE_STRING ) ) ) )
            // InternalOntoUMLArchive.g:810:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'from' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'to' ( (otherlv_5= RULE_STRING ) ) )
            {
            // InternalOntoUMLArchive.g:810:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'from' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'to' ( (otherlv_5= RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:811:3: otherlv_0= 'dependency' ( (lv_name_1_0= RULE_STRING ) )? otherlv_2= 'from' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'to' ( (otherlv_5= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0());
            		
            // InternalOntoUMLArchive.g:815:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntoUMLArchive.g:816:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:816:4: (lv_name_1_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:817:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDependencyLinkAccess().getFromKeyword_2());
            		
            // InternalOntoUMLArchive.g:837:3: ( (otherlv_3= RULE_STRING ) )
            // InternalOntoUMLArchive.g:838:4: (otherlv_3= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:838:4: (otherlv_3= RULE_STRING )
            // InternalOntoUMLArchive.g:839:5: otherlv_3= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyLinkRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDependencyLinkAccess().getToKeyword_4());
            		
            // InternalOntoUMLArchive.g:854:3: ( (otherlv_5= RULE_STRING ) )
            // InternalOntoUMLArchive.g:855:4: (otherlv_5= RULE_STRING )
            {
            // InternalOntoUMLArchive.g:855:4: (otherlv_5= RULE_STRING )
            // InternalOntoUMLArchive.g:856:5: otherlv_5= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyLinkRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getDependencyLinkAccess().getToClassCrossReference_5_0());
            				

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


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoUMLArchive.g:871:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoUMLArchive.g:871:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoUMLArchive.g:872:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
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
    // InternalOntoUMLArchive.g:878:1: ruleGeneralizationSet returns [EObject current=null] : (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDisjoint_2_0=null;
        Token lv_isComplete_3_0=null;
        Token lv_name_4_0=null;
        EObject lv_generalizations_5_0 = null;



        	enterRule();

        try {
            // InternalOntoUMLArchive.g:884:2: ( (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ ) )
            // InternalOntoUMLArchive.g:885:2: (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ )
            {
            // InternalOntoUMLArchive.g:885:2: (otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+ )
            // InternalOntoUMLArchive.g:886:3: otherlv_0= 'genset' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) ) ( (lv_name_4_0= RULE_STRING ) )? ( (lv_generalizations_5_0= ruleGeneralization ) )+
            {
            otherlv_0=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0());
            		
            // InternalOntoUMLArchive.g:890:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) ) )
            // InternalOntoUMLArchive.g:891:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) )
            {
            // InternalOntoUMLArchive.g:891:4: ( ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* ) )
            // InternalOntoUMLArchive.g:892:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            				
            // InternalOntoUMLArchive.g:895:5: ( ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )* )
            // InternalOntoUMLArchive.g:896:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )*
            {
            // InternalOntoUMLArchive.g:896:6: ( ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:897:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:897:4: ({...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) ) )
            	    // InternalOntoUMLArchive.g:898:5: {...}? => ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalOntoUMLArchive.g:898:114: ( ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) ) )
            	    // InternalOntoUMLArchive.g:899:6: ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalOntoUMLArchive.g:902:9: ({...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) ) )
            	    // InternalOntoUMLArchive.g:902:10: {...}? => ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUMLArchive.g:902:19: ( (lv_isDisjoint_2_0= 'disjoint' ) )
            	    // InternalOntoUMLArchive.g:902:20: (lv_isDisjoint_2_0= 'disjoint' )
            	    {
            	    // InternalOntoUMLArchive.g:902:20: (lv_isDisjoint_2_0= 'disjoint' )
            	    // InternalOntoUMLArchive.g:903:10: lv_isDisjoint_2_0= 'disjoint'
            	    {
            	    lv_isDisjoint_2_0=(Token)match(input,29,FOLLOW_25); 

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
            	    // InternalOntoUMLArchive.g:920:4: ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) )
            	    {
            	    // InternalOntoUMLArchive.g:920:4: ({...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) ) )
            	    // InternalOntoUMLArchive.g:921:5: {...}? => ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalOntoUMLArchive.g:921:114: ( ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) ) )
            	    // InternalOntoUMLArchive.g:922:6: ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalOntoUMLArchive.g:925:9: ({...}? => ( (lv_isComplete_3_0= 'complete' ) ) )
            	    // InternalOntoUMLArchive.g:925:10: {...}? => ( (lv_isComplete_3_0= 'complete' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGeneralizationSet", "true");
            	    }
            	    // InternalOntoUMLArchive.g:925:19: ( (lv_isComplete_3_0= 'complete' ) )
            	    // InternalOntoUMLArchive.g:925:20: (lv_isComplete_3_0= 'complete' )
            	    {
            	    // InternalOntoUMLArchive.g:925:20: (lv_isComplete_3_0= 'complete' )
            	    // InternalOntoUMLArchive.g:926:10: lv_isComplete_3_0= 'complete'
            	    {
            	    lv_isComplete_3_0=(Token)match(input,30,FOLLOW_25); 

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
            	    break loop16;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            				

            }

            // InternalOntoUMLArchive.g:950:3: ( (lv_name_4_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOntoUMLArchive.g:951:4: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:951:4: (lv_name_4_0= RULE_STRING )
                    // InternalOntoUMLArchive.g:952:5: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalOntoUMLArchive.g:968:3: ( (lv_generalizations_5_0= ruleGeneralization ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:969:4: (lv_generalizations_5_0= ruleGeneralization )
            	    {
            	    // InternalOntoUMLArchive.g:969:4: (lv_generalizations_5_0= ruleGeneralization )
            	    // InternalOntoUMLArchive.g:970:5: lv_generalizations_5_0= ruleGeneralization
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "entryRuleStereotype"
    // InternalOntoUMLArchive.g:991:1: entryRuleStereotype returns [EObject current=null] : iv_ruleStereotype= ruleStereotype EOF ;
    public final EObject entryRuleStereotype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStereotype = null;


        try {
            // InternalOntoUMLArchive.g:991:51: (iv_ruleStereotype= ruleStereotype EOF )
            // InternalOntoUMLArchive.g:992:2: iv_ruleStereotype= ruleStereotype EOF
            {
             newCompositeNode(grammarAccess.getStereotypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStereotype=ruleStereotype();

            state._fsp--;

             current =iv_ruleStereotype; 
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
    // $ANTLR end "entryRuleStereotype"


    // $ANTLR start "ruleStereotype"
    // InternalOntoUMLArchive.g:998:1: ruleStereotype returns [EObject current=null] : ( (lv_name_0_0= RULE_STEREOTYPE_STRING ) ) ;
    public final EObject ruleStereotype() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalOntoUMLArchive.g:1004:2: ( ( (lv_name_0_0= RULE_STEREOTYPE_STRING ) ) )
            // InternalOntoUMLArchive.g:1005:2: ( (lv_name_0_0= RULE_STEREOTYPE_STRING ) )
            {
            // InternalOntoUMLArchive.g:1005:2: ( (lv_name_0_0= RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:1006:3: (lv_name_0_0= RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:1006:3: (lv_name_0_0= RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:1007:4: lv_name_0_0= RULE_STEREOTYPE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStereotypeAccess().getNameSTEREOTYPE_STRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStereotypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"it.unibz.inf.ontouml.archive.OntoUMLArchive.STEREOTYPE_STRING");
            			

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
    // $ANTLR end "ruleStereotype"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000001900E002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000061000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000002L});

}
