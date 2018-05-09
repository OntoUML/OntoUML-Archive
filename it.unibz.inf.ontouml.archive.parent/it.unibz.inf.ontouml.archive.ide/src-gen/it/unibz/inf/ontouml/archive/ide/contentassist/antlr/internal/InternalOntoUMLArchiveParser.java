package it.unibz.inf.ontouml.archive.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.unibz.inf.ontouml.archive.services.OntoUMLArchiveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoUMLArchiveParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_STEREOTYPE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "';'", "'class'", "'association'", "'from'", "'to'", "'end'", "':'", "'['", "'..'", "']'", "'gen'", "'super'", "'sub'", "'dependency'", "'genset'", "'abstract'", "'disjoint'", "'complete'"
    };
    public static final int RULE_STEREOTYPE_STRING=6;
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(OntoUMLArchiveGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalOntoUMLArchive.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:54:1: ( ruleModel EOF )
            // InternalOntoUMLArchive.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOntoUMLArchive.g:62:1: ruleModel : ( ( rule__Model__ElmentsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:66:2: ( ( ( rule__Model__ElmentsAssignment )* ) )
            // InternalOntoUMLArchive.g:67:2: ( ( rule__Model__ElmentsAssignment )* )
            {
            // InternalOntoUMLArchive.g:67:2: ( ( rule__Model__ElmentsAssignment )* )
            // InternalOntoUMLArchive.g:68:3: ( rule__Model__ElmentsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElmentsAssignment()); 
            // InternalOntoUMLArchive.g:69:3: ( rule__Model__ElmentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==23||(LA1_0>=26 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:69:4: rule__Model__ElmentsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElmentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElmentsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoUMLArchive.g:78:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:79:1: ( ruleModelElement EOF )
            // InternalOntoUMLArchive.g:80:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalOntoUMLArchive.g:87:1: ruleModelElement : ( ( rule__ModelElement__Group__0 ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:91:2: ( ( ( rule__ModelElement__Group__0 ) ) )
            // InternalOntoUMLArchive.g:92:2: ( ( rule__ModelElement__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:92:2: ( ( rule__ModelElement__Group__0 ) )
            // InternalOntoUMLArchive.g:93:3: ( rule__ModelElement__Group__0 )
            {
             before(grammarAccess.getModelElementAccess().getGroup()); 
            // InternalOntoUMLArchive.g:94:3: ( rule__ModelElement__Group__0 )
            // InternalOntoUMLArchive.g:94:4: rule__ModelElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleClass"
    // InternalOntoUMLArchive.g:103:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:104:1: ( ruleClass EOF )
            // InternalOntoUMLArchive.g:105:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalOntoUMLArchive.g:112:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:116:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalOntoUMLArchive.g:117:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:117:2: ( ( rule__Class__Group__0 ) )
            // InternalOntoUMLArchive.g:118:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalOntoUMLArchive.g:119:3: ( rule__Class__Group__0 )
            // InternalOntoUMLArchive.g:119:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleRelationship"
    // InternalOntoUMLArchive.g:128:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:129:1: ( ruleRelationship EOF )
            // InternalOntoUMLArchive.g:130:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalOntoUMLArchive.g:137:1: ruleRelationship : ( ( rule__Relationship__Alternatives ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:141:2: ( ( ( rule__Relationship__Alternatives ) ) )
            // InternalOntoUMLArchive.g:142:2: ( ( rule__Relationship__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:142:2: ( ( rule__Relationship__Alternatives ) )
            // InternalOntoUMLArchive.g:143:3: ( rule__Relationship__Alternatives )
            {
             before(grammarAccess.getRelationshipAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:144:3: ( rule__Relationship__Alternatives )
            // InternalOntoUMLArchive.g:144:4: rule__Relationship__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Relationship__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleAssociation"
    // InternalOntoUMLArchive.g:153:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:154:1: ( ruleAssociation EOF )
            // InternalOntoUMLArchive.g:155:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalOntoUMLArchive.g:162:1: ruleAssociation : ( ( rule__Association__Alternatives ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:166:2: ( ( ( rule__Association__Alternatives ) ) )
            // InternalOntoUMLArchive.g:167:2: ( ( rule__Association__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:167:2: ( ( rule__Association__Alternatives ) )
            // InternalOntoUMLArchive.g:168:3: ( rule__Association__Alternatives )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:169:3: ( rule__Association__Alternatives )
            // InternalOntoUMLArchive.g:169:4: rule__Association__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Association__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleRegularAssociation"
    // InternalOntoUMLArchive.g:178:1: entryRuleRegularAssociation : ruleRegularAssociation EOF ;
    public final void entryRuleRegularAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:179:1: ( ruleRegularAssociation EOF )
            // InternalOntoUMLArchive.g:180:1: ruleRegularAssociation EOF
            {
             before(grammarAccess.getRegularAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularAssociation();

            state._fsp--;

             after(grammarAccess.getRegularAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularAssociation"


    // $ANTLR start "ruleRegularAssociation"
    // InternalOntoUMLArchive.g:187:1: ruleRegularAssociation : ( ( rule__RegularAssociation__Group__0 ) ) ;
    public final void ruleRegularAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:191:2: ( ( ( rule__RegularAssociation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:192:2: ( ( rule__RegularAssociation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:192:2: ( ( rule__RegularAssociation__Group__0 ) )
            // InternalOntoUMLArchive.g:193:3: ( rule__RegularAssociation__Group__0 )
            {
             before(grammarAccess.getRegularAssociationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:194:3: ( rule__RegularAssociation__Group__0 )
            // InternalOntoUMLArchive.g:194:4: rule__RegularAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularAssociation"


    // $ANTLR start "entryRuleNaryAssociation"
    // InternalOntoUMLArchive.g:203:1: entryRuleNaryAssociation : ruleNaryAssociation EOF ;
    public final void entryRuleNaryAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:204:1: ( ruleNaryAssociation EOF )
            // InternalOntoUMLArchive.g:205:1: ruleNaryAssociation EOF
            {
             before(grammarAccess.getNaryAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleNaryAssociation();

            state._fsp--;

             after(grammarAccess.getNaryAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNaryAssociation"


    // $ANTLR start "ruleNaryAssociation"
    // InternalOntoUMLArchive.g:212:1: ruleNaryAssociation : ( ( rule__NaryAssociation__Group__0 ) ) ;
    public final void ruleNaryAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:216:2: ( ( ( rule__NaryAssociation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:217:2: ( ( rule__NaryAssociation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:217:2: ( ( rule__NaryAssociation__Group__0 ) )
            // InternalOntoUMLArchive.g:218:3: ( rule__NaryAssociation__Group__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:219:3: ( rule__NaryAssociation__Group__0 )
            // InternalOntoUMLArchive.g:219:4: rule__NaryAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNaryAssociation"


    // $ANTLR start "entryRuleAssociationEnd"
    // InternalOntoUMLArchive.g:228:1: entryRuleAssociationEnd : ruleAssociationEnd EOF ;
    public final void entryRuleAssociationEnd() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:229:1: ( ruleAssociationEnd EOF )
            // InternalOntoUMLArchive.g:230:1: ruleAssociationEnd EOF
            {
             before(grammarAccess.getAssociationEndRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getAssociationEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // InternalOntoUMLArchive.g:237:1: ruleAssociationEnd : ( ( rule__AssociationEnd__Group__0 ) ) ;
    public final void ruleAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:241:2: ( ( ( rule__AssociationEnd__Group__0 ) ) )
            // InternalOntoUMLArchive.g:242:2: ( ( rule__AssociationEnd__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:242:2: ( ( rule__AssociationEnd__Group__0 ) )
            // InternalOntoUMLArchive.g:243:3: ( rule__AssociationEnd__Group__0 )
            {
             before(grammarAccess.getAssociationEndAccess().getGroup()); 
            // InternalOntoUMLArchive.g:244:3: ( rule__AssociationEnd__Group__0 )
            // InternalOntoUMLArchive.g:244:4: rule__AssociationEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalOntoUMLArchive.g:253:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:254:1: ( ruleMultiplicity EOF )
            // InternalOntoUMLArchive.g:255:1: ruleMultiplicity EOF
            {
             before(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getMultiplicityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalOntoUMLArchive.g:262:1: ruleMultiplicity : ( ( rule__Multiplicity__Group__0 ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:266:2: ( ( ( rule__Multiplicity__Group__0 ) ) )
            // InternalOntoUMLArchive.g:267:2: ( ( rule__Multiplicity__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:267:2: ( ( rule__Multiplicity__Group__0 ) )
            // InternalOntoUMLArchive.g:268:3: ( rule__Multiplicity__Group__0 )
            {
             before(grammarAccess.getMultiplicityAccess().getGroup()); 
            // InternalOntoUMLArchive.g:269:3: ( rule__Multiplicity__Group__0 )
            // InternalOntoUMLArchive.g:269:4: rule__Multiplicity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleCARDINALITY"
    // InternalOntoUMLArchive.g:278:1: entryRuleCARDINALITY : ruleCARDINALITY EOF ;
    public final void entryRuleCARDINALITY() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:279:1: ( ruleCARDINALITY EOF )
            // InternalOntoUMLArchive.g:280:1: ruleCARDINALITY EOF
            {
             before(grammarAccess.getCARDINALITYRule()); 
            pushFollow(FOLLOW_1);
            ruleCARDINALITY();

            state._fsp--;

             after(grammarAccess.getCARDINALITYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCARDINALITY"


    // $ANTLR start "ruleCARDINALITY"
    // InternalOntoUMLArchive.g:287:1: ruleCARDINALITY : ( ( rule__CARDINALITY__Alternatives ) ) ;
    public final void ruleCARDINALITY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:291:2: ( ( ( rule__CARDINALITY__Alternatives ) ) )
            // InternalOntoUMLArchive.g:292:2: ( ( rule__CARDINALITY__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:292:2: ( ( rule__CARDINALITY__Alternatives ) )
            // InternalOntoUMLArchive.g:293:3: ( rule__CARDINALITY__Alternatives )
            {
             before(grammarAccess.getCARDINALITYAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:294:3: ( rule__CARDINALITY__Alternatives )
            // InternalOntoUMLArchive.g:294:4: rule__CARDINALITY__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CARDINALITY__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCARDINALITYAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCARDINALITY"


    // $ANTLR start "entryRuleGeneralization"
    // InternalOntoUMLArchive.g:303:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:304:1: ( ruleGeneralization EOF )
            // InternalOntoUMLArchive.g:305:1: ruleGeneralization EOF
            {
             before(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getGeneralizationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalOntoUMLArchive.g:312:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:316:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalOntoUMLArchive.g:317:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:317:2: ( ( rule__Generalization__Group__0 ) )
            // InternalOntoUMLArchive.g:318:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:319:3: ( rule__Generalization__Group__0 )
            // InternalOntoUMLArchive.g:319:4: rule__Generalization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleDependencyLink"
    // InternalOntoUMLArchive.g:328:1: entryRuleDependencyLink : ruleDependencyLink EOF ;
    public final void entryRuleDependencyLink() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:329:1: ( ruleDependencyLink EOF )
            // InternalOntoUMLArchive.g:330:1: ruleDependencyLink EOF
            {
             before(grammarAccess.getDependencyLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleDependencyLink();

            state._fsp--;

             after(grammarAccess.getDependencyLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependencyLink"


    // $ANTLR start "ruleDependencyLink"
    // InternalOntoUMLArchive.g:337:1: ruleDependencyLink : ( ( rule__DependencyLink__Group__0 ) ) ;
    public final void ruleDependencyLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:341:2: ( ( ( rule__DependencyLink__Group__0 ) ) )
            // InternalOntoUMLArchive.g:342:2: ( ( rule__DependencyLink__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:342:2: ( ( rule__DependencyLink__Group__0 ) )
            // InternalOntoUMLArchive.g:343:3: ( rule__DependencyLink__Group__0 )
            {
             before(grammarAccess.getDependencyLinkAccess().getGroup()); 
            // InternalOntoUMLArchive.g:344:3: ( rule__DependencyLink__Group__0 )
            // InternalOntoUMLArchive.g:344:4: rule__DependencyLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DependencyLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependencyLink"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoUMLArchive.g:353:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:354:1: ( ruleGeneralizationSet EOF )
            // InternalOntoUMLArchive.g:355:1: ruleGeneralizationSet EOF
            {
             before(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralizationSet();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalOntoUMLArchive.g:362:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:366:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalOntoUMLArchive.g:367:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:367:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalOntoUMLArchive.g:368:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalOntoUMLArchive.g:369:3: ( rule__GeneralizationSet__Group__0 )
            // InternalOntoUMLArchive.g:369:4: rule__GeneralizationSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "entryRuleStereotype"
    // InternalOntoUMLArchive.g:378:1: entryRuleStereotype : ruleStereotype EOF ;
    public final void entryRuleStereotype() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:379:1: ( ruleStereotype EOF )
            // InternalOntoUMLArchive.g:380:1: ruleStereotype EOF
            {
             before(grammarAccess.getStereotypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStereotype();

            state._fsp--;

             after(grammarAccess.getStereotypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStereotype"


    // $ANTLR start "ruleStereotype"
    // InternalOntoUMLArchive.g:387:1: ruleStereotype : ( ( rule__Stereotype__NameAssignment ) ) ;
    public final void ruleStereotype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:391:2: ( ( ( rule__Stereotype__NameAssignment ) ) )
            // InternalOntoUMLArchive.g:392:2: ( ( rule__Stereotype__NameAssignment ) )
            {
            // InternalOntoUMLArchive.g:392:2: ( ( rule__Stereotype__NameAssignment ) )
            // InternalOntoUMLArchive.g:393:3: ( rule__Stereotype__NameAssignment )
            {
             before(grammarAccess.getStereotypeAccess().getNameAssignment()); 
            // InternalOntoUMLArchive.g:394:3: ( rule__Stereotype__NameAssignment )
            // InternalOntoUMLArchive.g:394:4: rule__Stereotype__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Stereotype__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStereotypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStereotype"


    // $ANTLR start "rule__ModelElement__Alternatives_0"
    // InternalOntoUMLArchive.g:402:1: rule__ModelElement__Alternatives_0 : ( ( ruleClass ) | ( ruleRelationship ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:406:1: ( ( ruleClass ) | ( ruleRelationship ) | ( ruleGeneralizationSet ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
            case 28:
                {
                alt2=1;
                }
                break;
            case 15:
            case 23:
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
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
                    // InternalOntoUMLArchive.g:407:2: ( ruleClass )
                    {
                    // InternalOntoUMLArchive.g:407:2: ( ruleClass )
                    // InternalOntoUMLArchive.g:408:3: ruleClass
                    {
                     before(grammarAccess.getModelElementAccess().getClassParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getClassParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:413:2: ( ruleRelationship )
                    {
                    // InternalOntoUMLArchive.g:413:2: ( ruleRelationship )
                    // InternalOntoUMLArchive.g:414:3: ruleRelationship
                    {
                     before(grammarAccess.getModelElementAccess().getRelationshipParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelationship();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getRelationshipParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUMLArchive.g:419:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoUMLArchive.g:419:2: ( ruleGeneralizationSet )
                    // InternalOntoUMLArchive.g:420:3: ruleGeneralizationSet
                    {
                     before(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralizationSet();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Alternatives_0"


    // $ANTLR start "rule__Relationship__Alternatives"
    // InternalOntoUMLArchive.g:429:1: rule__Relationship__Alternatives : ( ( ruleAssociation ) | ( ruleGeneralization ) | ( ruleDependencyLink ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:433:1: ( ( ruleAssociation ) | ( ruleGeneralization ) | ( ruleDependencyLink ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOntoUMLArchive.g:434:2: ( ruleAssociation )
                    {
                    // InternalOntoUMLArchive.g:434:2: ( ruleAssociation )
                    // InternalOntoUMLArchive.g:435:3: ruleAssociation
                    {
                     before(grammarAccess.getRelationshipAccess().getAssociationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getAssociationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:440:2: ( ruleGeneralization )
                    {
                    // InternalOntoUMLArchive.g:440:2: ( ruleGeneralization )
                    // InternalOntoUMLArchive.g:441:3: ruleGeneralization
                    {
                     before(grammarAccess.getRelationshipAccess().getGeneralizationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralization();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getGeneralizationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUMLArchive.g:446:2: ( ruleDependencyLink )
                    {
                    // InternalOntoUMLArchive.g:446:2: ( ruleDependencyLink )
                    // InternalOntoUMLArchive.g:447:3: ruleDependencyLink
                    {
                     before(grammarAccess.getRelationshipAccess().getDependencyLinkParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDependencyLink();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getDependencyLinkParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Alternatives"


    // $ANTLR start "rule__Association__Alternatives"
    // InternalOntoUMLArchive.g:456:1: rule__Association__Alternatives : ( ( ruleRegularAssociation ) | ( ruleNaryAssociation ) );
    public final void rule__Association__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:460:1: ( ( ruleRegularAssociation ) | ( ruleNaryAssociation ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_STEREOTYPE_STRING:
                        {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==16) ) {
                            alt4=1;
                        }
                        else if ( (LA4_3==18) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 16:
                        {
                        alt4=1;
                        }
                        break;
                    case 18:
                        {
                        alt4=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_STEREOTYPE_STRING:
                    {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==16) ) {
                        alt4=1;
                    }
                    else if ( (LA4_3==18) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 18:
                    {
                    alt4=2;
                    }
                    break;
                case 16:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoUMLArchive.g:461:2: ( ruleRegularAssociation )
                    {
                    // InternalOntoUMLArchive.g:461:2: ( ruleRegularAssociation )
                    // InternalOntoUMLArchive.g:462:3: ruleRegularAssociation
                    {
                     before(grammarAccess.getAssociationAccess().getRegularAssociationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRegularAssociation();

                    state._fsp--;

                     after(grammarAccess.getAssociationAccess().getRegularAssociationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:467:2: ( ruleNaryAssociation )
                    {
                    // InternalOntoUMLArchive.g:467:2: ( ruleNaryAssociation )
                    // InternalOntoUMLArchive.g:468:3: ruleNaryAssociation
                    {
                     before(grammarAccess.getAssociationAccess().getNaryAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNaryAssociation();

                    state._fsp--;

                     after(grammarAccess.getAssociationAccess().getNaryAssociationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Alternatives"


    // $ANTLR start "rule__CARDINALITY__Alternatives"
    // InternalOntoUMLArchive.g:477:1: rule__CARDINALITY__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CARDINALITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:481:1: ( ( '*' ) | ( RULE_INT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntoUMLArchive.g:482:2: ( '*' )
                    {
                    // InternalOntoUMLArchive.g:482:2: ( '*' )
                    // InternalOntoUMLArchive.g:483:3: '*'
                    {
                     before(grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:488:2: ( RULE_INT )
                    {
                    // InternalOntoUMLArchive.g:488:2: ( RULE_INT )
                    // InternalOntoUMLArchive.g:489:3: RULE_INT
                    {
                     before(grammarAccess.getCARDINALITYAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCARDINALITYAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CARDINALITY__Alternatives"


    // $ANTLR start "rule__ModelElement__Group__0"
    // InternalOntoUMLArchive.g:498:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:502:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalOntoUMLArchive.g:503:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ModelElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__0"


    // $ANTLR start "rule__ModelElement__Group__0__Impl"
    // InternalOntoUMLArchive.g:510:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:514:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalOntoUMLArchive.g:515:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalOntoUMLArchive.g:515:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalOntoUMLArchive.g:516:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalOntoUMLArchive.g:517:2: ( rule__ModelElement__Alternatives_0 )
            // InternalOntoUMLArchive.g:517:3: rule__ModelElement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__0__Impl"


    // $ANTLR start "rule__ModelElement__Group__1"
    // InternalOntoUMLArchive.g:525:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:529:1: ( rule__ModelElement__Group__1__Impl )
            // InternalOntoUMLArchive.g:530:2: rule__ModelElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__1"


    // $ANTLR start "rule__ModelElement__Group__1__Impl"
    // InternalOntoUMLArchive.g:536:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:540:1: ( ( ';' ) )
            // InternalOntoUMLArchive.g:541:1: ( ';' )
            {
            // InternalOntoUMLArchive.g:541:1: ( ';' )
            // InternalOntoUMLArchive.g:542:2: ';'
            {
             before(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalOntoUMLArchive.g:552:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:556:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalOntoUMLArchive.g:557:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalOntoUMLArchive.g:564:1: rule__Class__Group__0__Impl : ( ( rule__Class__IsAbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:568:1: ( ( ( rule__Class__IsAbstractAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:569:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:569:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            // InternalOntoUMLArchive.g:570:2: ( rule__Class__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 
            // InternalOntoUMLArchive.g:571:2: ( rule__Class__IsAbstractAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUMLArchive.g:571:3: rule__Class__IsAbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__IsAbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalOntoUMLArchive.g:579:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:583:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalOntoUMLArchive.g:584:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalOntoUMLArchive.g:591:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:595:1: ( ( 'class' ) )
            // InternalOntoUMLArchive.g:596:1: ( 'class' )
            {
            // InternalOntoUMLArchive.g:596:1: ( 'class' )
            // InternalOntoUMLArchive.g:597:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalOntoUMLArchive.g:606:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:610:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalOntoUMLArchive.g:611:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalOntoUMLArchive.g:618:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:622:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalOntoUMLArchive.g:623:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalOntoUMLArchive.g:623:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalOntoUMLArchive.g:624:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalOntoUMLArchive.g:625:2: ( rule__Class__NameAssignment_2 )
            // InternalOntoUMLArchive.g:625:3: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalOntoUMLArchive.g:633:1: rule__Class__Group__3 : rule__Class__Group__3__Impl ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:637:1: ( rule__Class__Group__3__Impl )
            // InternalOntoUMLArchive.g:638:2: rule__Class__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalOntoUMLArchive.g:644:1: rule__Class__Group__3__Impl : ( ( rule__Class__StereotypeAssignment_3 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:648:1: ( ( ( rule__Class__StereotypeAssignment_3 )? ) )
            // InternalOntoUMLArchive.g:649:1: ( ( rule__Class__StereotypeAssignment_3 )? )
            {
            // InternalOntoUMLArchive.g:649:1: ( ( rule__Class__StereotypeAssignment_3 )? )
            // InternalOntoUMLArchive.g:650:2: ( rule__Class__StereotypeAssignment_3 )?
            {
             before(grammarAccess.getClassAccess().getStereotypeAssignment_3()); 
            // InternalOntoUMLArchive.g:651:2: ( rule__Class__StereotypeAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STEREOTYPE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoUMLArchive.g:651:3: rule__Class__StereotypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__StereotypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getStereotypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__0"
    // InternalOntoUMLArchive.g:660:1: rule__RegularAssociation__Group__0 : rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1 ;
    public final void rule__RegularAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:664:1: ( rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1 )
            // InternalOntoUMLArchive.g:665:2: rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RegularAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__0"


    // $ANTLR start "rule__RegularAssociation__Group__0__Impl"
    // InternalOntoUMLArchive.g:672:1: rule__RegularAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__RegularAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:676:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:677:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:677:1: ( 'association' )
            // InternalOntoUMLArchive.g:678:2: 'association'
            {
             before(grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__0__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__1"
    // InternalOntoUMLArchive.g:687:1: rule__RegularAssociation__Group__1 : rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2 ;
    public final void rule__RegularAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:691:1: ( rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2 )
            // InternalOntoUMLArchive.g:692:2: rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RegularAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__1"


    // $ANTLR start "rule__RegularAssociation__Group__1__Impl"
    // InternalOntoUMLArchive.g:699:1: rule__RegularAssociation__Group__1__Impl : ( ( rule__RegularAssociation__NameAssignment_1 )? ) ;
    public final void rule__RegularAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:703:1: ( ( ( rule__RegularAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:704:1: ( ( rule__RegularAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:704:1: ( ( rule__RegularAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:705:2: ( rule__RegularAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getRegularAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:706:2: ( rule__RegularAssociation__NameAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoUMLArchive.g:706:3: rule__RegularAssociation__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularAssociation__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularAssociationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__1__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__2"
    // InternalOntoUMLArchive.g:714:1: rule__RegularAssociation__Group__2 : rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3 ;
    public final void rule__RegularAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:718:1: ( rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3 )
            // InternalOntoUMLArchive.g:719:2: rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RegularAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__2"


    // $ANTLR start "rule__RegularAssociation__Group__2__Impl"
    // InternalOntoUMLArchive.g:726:1: rule__RegularAssociation__Group__2__Impl : ( ( rule__RegularAssociation__StereotypeAssignment_2 )? ) ;
    public final void rule__RegularAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:730:1: ( ( ( rule__RegularAssociation__StereotypeAssignment_2 )? ) )
            // InternalOntoUMLArchive.g:731:1: ( ( rule__RegularAssociation__StereotypeAssignment_2 )? )
            {
            // InternalOntoUMLArchive.g:731:1: ( ( rule__RegularAssociation__StereotypeAssignment_2 )? )
            // InternalOntoUMLArchive.g:732:2: ( rule__RegularAssociation__StereotypeAssignment_2 )?
            {
             before(grammarAccess.getRegularAssociationAccess().getStereotypeAssignment_2()); 
            // InternalOntoUMLArchive.g:733:2: ( rule__RegularAssociation__StereotypeAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STEREOTYPE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoUMLArchive.g:733:3: rule__RegularAssociation__StereotypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularAssociation__StereotypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularAssociationAccess().getStereotypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__2__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__3"
    // InternalOntoUMLArchive.g:741:1: rule__RegularAssociation__Group__3 : rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4 ;
    public final void rule__RegularAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:745:1: ( rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4 )
            // InternalOntoUMLArchive.g:746:2: rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RegularAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__3"


    // $ANTLR start "rule__RegularAssociation__Group__3__Impl"
    // InternalOntoUMLArchive.g:753:1: rule__RegularAssociation__Group__3__Impl : ( 'from' ) ;
    public final void rule__RegularAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:757:1: ( ( 'from' ) )
            // InternalOntoUMLArchive.g:758:1: ( 'from' )
            {
            // InternalOntoUMLArchive.g:758:1: ( 'from' )
            // InternalOntoUMLArchive.g:759:2: 'from'
            {
             before(grammarAccess.getRegularAssociationAccess().getFromKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRegularAssociationAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__3__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__4"
    // InternalOntoUMLArchive.g:768:1: rule__RegularAssociation__Group__4 : rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5 ;
    public final void rule__RegularAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:772:1: ( rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5 )
            // InternalOntoUMLArchive.g:773:2: rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__RegularAssociation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__4"


    // $ANTLR start "rule__RegularAssociation__Group__4__Impl"
    // InternalOntoUMLArchive.g:780:1: rule__RegularAssociation__Group__4__Impl : ( ( rule__RegularAssociation__FromAssignment_4 ) ) ;
    public final void rule__RegularAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:784:1: ( ( ( rule__RegularAssociation__FromAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:785:1: ( ( rule__RegularAssociation__FromAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:785:1: ( ( rule__RegularAssociation__FromAssignment_4 ) )
            // InternalOntoUMLArchive.g:786:2: ( rule__RegularAssociation__FromAssignment_4 )
            {
             before(grammarAccess.getRegularAssociationAccess().getFromAssignment_4()); 
            // InternalOntoUMLArchive.g:787:2: ( rule__RegularAssociation__FromAssignment_4 )
            // InternalOntoUMLArchive.g:787:3: rule__RegularAssociation__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getFromAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__4__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__5"
    // InternalOntoUMLArchive.g:795:1: rule__RegularAssociation__Group__5 : rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6 ;
    public final void rule__RegularAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:799:1: ( rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6 )
            // InternalOntoUMLArchive.g:800:2: rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__RegularAssociation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__5"


    // $ANTLR start "rule__RegularAssociation__Group__5__Impl"
    // InternalOntoUMLArchive.g:807:1: rule__RegularAssociation__Group__5__Impl : ( 'to' ) ;
    public final void rule__RegularAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:811:1: ( ( 'to' ) )
            // InternalOntoUMLArchive.g:812:1: ( 'to' )
            {
            // InternalOntoUMLArchive.g:812:1: ( 'to' )
            // InternalOntoUMLArchive.g:813:2: 'to'
            {
             before(grammarAccess.getRegularAssociationAccess().getToKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRegularAssociationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__5__Impl"


    // $ANTLR start "rule__RegularAssociation__Group__6"
    // InternalOntoUMLArchive.g:822:1: rule__RegularAssociation__Group__6 : rule__RegularAssociation__Group__6__Impl ;
    public final void rule__RegularAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:826:1: ( rule__RegularAssociation__Group__6__Impl )
            // InternalOntoUMLArchive.g:827:2: rule__RegularAssociation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__6"


    // $ANTLR start "rule__RegularAssociation__Group__6__Impl"
    // InternalOntoUMLArchive.g:833:1: rule__RegularAssociation__Group__6__Impl : ( ( rule__RegularAssociation__ToAssignment_6 ) ) ;
    public final void rule__RegularAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:837:1: ( ( ( rule__RegularAssociation__ToAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:838:1: ( ( rule__RegularAssociation__ToAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:838:1: ( ( rule__RegularAssociation__ToAssignment_6 ) )
            // InternalOntoUMLArchive.g:839:2: ( rule__RegularAssociation__ToAssignment_6 )
            {
             before(grammarAccess.getRegularAssociationAccess().getToAssignment_6()); 
            // InternalOntoUMLArchive.g:840:2: ( rule__RegularAssociation__ToAssignment_6 )
            // InternalOntoUMLArchive.g:840:3: rule__RegularAssociation__ToAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RegularAssociation__ToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRegularAssociationAccess().getToAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__Group__6__Impl"


    // $ANTLR start "rule__NaryAssociation__Group__0"
    // InternalOntoUMLArchive.g:849:1: rule__NaryAssociation__Group__0 : rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1 ;
    public final void rule__NaryAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:853:1: ( rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1 )
            // InternalOntoUMLArchive.g:854:2: rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__NaryAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__0"


    // $ANTLR start "rule__NaryAssociation__Group__0__Impl"
    // InternalOntoUMLArchive.g:861:1: rule__NaryAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__NaryAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:865:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:866:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:866:1: ( 'association' )
            // InternalOntoUMLArchive.g:867:2: 'association'
            {
             before(grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__0__Impl"


    // $ANTLR start "rule__NaryAssociation__Group__1"
    // InternalOntoUMLArchive.g:876:1: rule__NaryAssociation__Group__1 : rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2 ;
    public final void rule__NaryAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:880:1: ( rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2 )
            // InternalOntoUMLArchive.g:881:2: rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__NaryAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__1"


    // $ANTLR start "rule__NaryAssociation__Group__1__Impl"
    // InternalOntoUMLArchive.g:888:1: rule__NaryAssociation__Group__1__Impl : ( ( rule__NaryAssociation__NameAssignment_1 )? ) ;
    public final void rule__NaryAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:892:1: ( ( ( rule__NaryAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:893:1: ( ( rule__NaryAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:893:1: ( ( rule__NaryAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:894:2: ( rule__NaryAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getNaryAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:895:2: ( rule__NaryAssociation__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUMLArchive.g:895:3: rule__NaryAssociation__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NaryAssociation__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNaryAssociationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__1__Impl"


    // $ANTLR start "rule__NaryAssociation__Group__2"
    // InternalOntoUMLArchive.g:903:1: rule__NaryAssociation__Group__2 : rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3 ;
    public final void rule__NaryAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:907:1: ( rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3 )
            // InternalOntoUMLArchive.g:908:2: rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__NaryAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__2"


    // $ANTLR start "rule__NaryAssociation__Group__2__Impl"
    // InternalOntoUMLArchive.g:915:1: rule__NaryAssociation__Group__2__Impl : ( ( rule__NaryAssociation__StereotypeAssignment_2 )? ) ;
    public final void rule__NaryAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:919:1: ( ( ( rule__NaryAssociation__StereotypeAssignment_2 )? ) )
            // InternalOntoUMLArchive.g:920:1: ( ( rule__NaryAssociation__StereotypeAssignment_2 )? )
            {
            // InternalOntoUMLArchive.g:920:1: ( ( rule__NaryAssociation__StereotypeAssignment_2 )? )
            // InternalOntoUMLArchive.g:921:2: ( rule__NaryAssociation__StereotypeAssignment_2 )?
            {
             before(grammarAccess.getNaryAssociationAccess().getStereotypeAssignment_2()); 
            // InternalOntoUMLArchive.g:922:2: ( rule__NaryAssociation__StereotypeAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STEREOTYPE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoUMLArchive.g:922:3: rule__NaryAssociation__StereotypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NaryAssociation__StereotypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNaryAssociationAccess().getStereotypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__2__Impl"


    // $ANTLR start "rule__NaryAssociation__Group__3"
    // InternalOntoUMLArchive.g:930:1: rule__NaryAssociation__Group__3 : rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4 ;
    public final void rule__NaryAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:934:1: ( rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4 )
            // InternalOntoUMLArchive.g:935:2: rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__NaryAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__3"


    // $ANTLR start "rule__NaryAssociation__Group__3__Impl"
    // InternalOntoUMLArchive.g:942:1: rule__NaryAssociation__Group__3__Impl : ( ( rule__NaryAssociation__Group_3__0 ) ) ;
    public final void rule__NaryAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:946:1: ( ( ( rule__NaryAssociation__Group_3__0 ) ) )
            // InternalOntoUMLArchive.g:947:1: ( ( rule__NaryAssociation__Group_3__0 ) )
            {
            // InternalOntoUMLArchive.g:947:1: ( ( rule__NaryAssociation__Group_3__0 ) )
            // InternalOntoUMLArchive.g:948:2: ( rule__NaryAssociation__Group_3__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_3()); 
            // InternalOntoUMLArchive.g:949:2: ( rule__NaryAssociation__Group_3__0 )
            // InternalOntoUMLArchive.g:949:3: rule__NaryAssociation__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__3__Impl"


    // $ANTLR start "rule__NaryAssociation__Group__4"
    // InternalOntoUMLArchive.g:957:1: rule__NaryAssociation__Group__4 : rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5 ;
    public final void rule__NaryAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:961:1: ( rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5 )
            // InternalOntoUMLArchive.g:962:2: rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__NaryAssociation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__4"


    // $ANTLR start "rule__NaryAssociation__Group__4__Impl"
    // InternalOntoUMLArchive.g:969:1: rule__NaryAssociation__Group__4__Impl : ( ( rule__NaryAssociation__Group_4__0 ) ) ;
    public final void rule__NaryAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:973:1: ( ( ( rule__NaryAssociation__Group_4__0 ) ) )
            // InternalOntoUMLArchive.g:974:1: ( ( rule__NaryAssociation__Group_4__0 ) )
            {
            // InternalOntoUMLArchive.g:974:1: ( ( rule__NaryAssociation__Group_4__0 ) )
            // InternalOntoUMLArchive.g:975:2: ( rule__NaryAssociation__Group_4__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_4()); 
            // InternalOntoUMLArchive.g:976:2: ( rule__NaryAssociation__Group_4__0 )
            // InternalOntoUMLArchive.g:976:3: rule__NaryAssociation__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__4__Impl"


    // $ANTLR start "rule__NaryAssociation__Group__5"
    // InternalOntoUMLArchive.g:984:1: rule__NaryAssociation__Group__5 : rule__NaryAssociation__Group__5__Impl ;
    public final void rule__NaryAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:988:1: ( rule__NaryAssociation__Group__5__Impl )
            // InternalOntoUMLArchive.g:989:2: rule__NaryAssociation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__5"


    // $ANTLR start "rule__NaryAssociation__Group__5__Impl"
    // InternalOntoUMLArchive.g:995:1: rule__NaryAssociation__Group__5__Impl : ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) ) ;
    public final void rule__NaryAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:999:1: ( ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) ) )
            // InternalOntoUMLArchive.g:1000:1: ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) )
            {
            // InternalOntoUMLArchive.g:1000:1: ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) )
            // InternalOntoUMLArchive.g:1001:2: ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* )
            {
            // InternalOntoUMLArchive.g:1001:2: ( ( rule__NaryAssociation__Group_5__0 ) )
            // InternalOntoUMLArchive.g:1002:3: ( rule__NaryAssociation__Group_5__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1003:3: ( rule__NaryAssociation__Group_5__0 )
            // InternalOntoUMLArchive.g:1003:4: rule__NaryAssociation__Group_5__0
            {
            pushFollow(FOLLOW_13);
            rule__NaryAssociation__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getGroup_5()); 

            }

            // InternalOntoUMLArchive.g:1006:2: ( ( rule__NaryAssociation__Group_5__0 )* )
            // InternalOntoUMLArchive.g:1007:3: ( rule__NaryAssociation__Group_5__0 )*
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1008:3: ( rule__NaryAssociation__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1008:4: rule__NaryAssociation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__NaryAssociation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNaryAssociationAccess().getGroup_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group__5__Impl"


    // $ANTLR start "rule__NaryAssociation__Group_3__0"
    // InternalOntoUMLArchive.g:1018:1: rule__NaryAssociation__Group_3__0 : rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1 ;
    public final void rule__NaryAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1022:1: ( rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1 )
            // InternalOntoUMLArchive.g:1023:2: rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__NaryAssociation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_3__0"


    // $ANTLR start "rule__NaryAssociation__Group_3__0__Impl"
    // InternalOntoUMLArchive.g:1030:1: rule__NaryAssociation__Group_3__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1034:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1035:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1035:1: ( 'end' )
            // InternalOntoUMLArchive.g:1036:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_3__0__Impl"


    // $ANTLR start "rule__NaryAssociation__Group_3__1"
    // InternalOntoUMLArchive.g:1045:1: rule__NaryAssociation__Group_3__1 : rule__NaryAssociation__Group_3__1__Impl ;
    public final void rule__NaryAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1049:1: ( rule__NaryAssociation__Group_3__1__Impl )
            // InternalOntoUMLArchive.g:1050:2: rule__NaryAssociation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_3__1"


    // $ANTLR start "rule__NaryAssociation__Group_3__1__Impl"
    // InternalOntoUMLArchive.g:1056:1: rule__NaryAssociation__Group_3__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_3_1 ) ) ;
    public final void rule__NaryAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1060:1: ( ( ( rule__NaryAssociation__EndsAssignment_3_1 ) ) )
            // InternalOntoUMLArchive.g:1061:1: ( ( rule__NaryAssociation__EndsAssignment_3_1 ) )
            {
            // InternalOntoUMLArchive.g:1061:1: ( ( rule__NaryAssociation__EndsAssignment_3_1 ) )
            // InternalOntoUMLArchive.g:1062:2: ( rule__NaryAssociation__EndsAssignment_3_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_3_1()); 
            // InternalOntoUMLArchive.g:1063:2: ( rule__NaryAssociation__EndsAssignment_3_1 )
            // InternalOntoUMLArchive.g:1063:3: rule__NaryAssociation__EndsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NaryAssociation__EndsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getEndsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_3__1__Impl"


    // $ANTLR start "rule__NaryAssociation__Group_4__0"
    // InternalOntoUMLArchive.g:1072:1: rule__NaryAssociation__Group_4__0 : rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1 ;
    public final void rule__NaryAssociation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1076:1: ( rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1 )
            // InternalOntoUMLArchive.g:1077:2: rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__NaryAssociation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_4__0"


    // $ANTLR start "rule__NaryAssociation__Group_4__0__Impl"
    // InternalOntoUMLArchive.g:1084:1: rule__NaryAssociation__Group_4__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1088:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1089:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1089:1: ( 'end' )
            // InternalOntoUMLArchive.g:1090:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_4__0__Impl"


    // $ANTLR start "rule__NaryAssociation__Group_4__1"
    // InternalOntoUMLArchive.g:1099:1: rule__NaryAssociation__Group_4__1 : rule__NaryAssociation__Group_4__1__Impl ;
    public final void rule__NaryAssociation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1103:1: ( rule__NaryAssociation__Group_4__1__Impl )
            // InternalOntoUMLArchive.g:1104:2: rule__NaryAssociation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_4__1"


    // $ANTLR start "rule__NaryAssociation__Group_4__1__Impl"
    // InternalOntoUMLArchive.g:1110:1: rule__NaryAssociation__Group_4__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_4_1 ) ) ;
    public final void rule__NaryAssociation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1114:1: ( ( ( rule__NaryAssociation__EndsAssignment_4_1 ) ) )
            // InternalOntoUMLArchive.g:1115:1: ( ( rule__NaryAssociation__EndsAssignment_4_1 ) )
            {
            // InternalOntoUMLArchive.g:1115:1: ( ( rule__NaryAssociation__EndsAssignment_4_1 ) )
            // InternalOntoUMLArchive.g:1116:2: ( rule__NaryAssociation__EndsAssignment_4_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_4_1()); 
            // InternalOntoUMLArchive.g:1117:2: ( rule__NaryAssociation__EndsAssignment_4_1 )
            // InternalOntoUMLArchive.g:1117:3: rule__NaryAssociation__EndsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NaryAssociation__EndsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getEndsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_4__1__Impl"


    // $ANTLR start "rule__NaryAssociation__Group_5__0"
    // InternalOntoUMLArchive.g:1126:1: rule__NaryAssociation__Group_5__0 : rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1 ;
    public final void rule__NaryAssociation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1130:1: ( rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1 )
            // InternalOntoUMLArchive.g:1131:2: rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__NaryAssociation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_5__0"


    // $ANTLR start "rule__NaryAssociation__Group_5__0__Impl"
    // InternalOntoUMLArchive.g:1138:1: rule__NaryAssociation__Group_5__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1142:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1143:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1143:1: ( 'end' )
            // InternalOntoUMLArchive.g:1144:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_5__0__Impl"


    // $ANTLR start "rule__NaryAssociation__Group_5__1"
    // InternalOntoUMLArchive.g:1153:1: rule__NaryAssociation__Group_5__1 : rule__NaryAssociation__Group_5__1__Impl ;
    public final void rule__NaryAssociation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1157:1: ( rule__NaryAssociation__Group_5__1__Impl )
            // InternalOntoUMLArchive.g:1158:2: rule__NaryAssociation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NaryAssociation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_5__1"


    // $ANTLR start "rule__NaryAssociation__Group_5__1__Impl"
    // InternalOntoUMLArchive.g:1164:1: rule__NaryAssociation__Group_5__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_5_1 ) ) ;
    public final void rule__NaryAssociation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1168:1: ( ( ( rule__NaryAssociation__EndsAssignment_5_1 ) ) )
            // InternalOntoUMLArchive.g:1169:1: ( ( rule__NaryAssociation__EndsAssignment_5_1 ) )
            {
            // InternalOntoUMLArchive.g:1169:1: ( ( rule__NaryAssociation__EndsAssignment_5_1 ) )
            // InternalOntoUMLArchive.g:1170:2: ( rule__NaryAssociation__EndsAssignment_5_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_5_1()); 
            // InternalOntoUMLArchive.g:1171:2: ( rule__NaryAssociation__EndsAssignment_5_1 )
            // InternalOntoUMLArchive.g:1171:3: rule__NaryAssociation__EndsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__NaryAssociation__EndsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getEndsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__Group_5__1__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__0"
    // InternalOntoUMLArchive.g:1180:1: rule__AssociationEnd__Group__0 : rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 ;
    public final void rule__AssociationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1184:1: ( rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 )
            // InternalOntoUMLArchive.g:1185:2: rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AssociationEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__0"


    // $ANTLR start "rule__AssociationEnd__Group__0__Impl"
    // InternalOntoUMLArchive.g:1192:1: rule__AssociationEnd__Group__0__Impl : ( ( rule__AssociationEnd__NameAssignment_0 )? ) ;
    public final void rule__AssociationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1196:1: ( ( ( rule__AssociationEnd__NameAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:1197:1: ( ( rule__AssociationEnd__NameAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:1197:1: ( ( rule__AssociationEnd__NameAssignment_0 )? )
            // InternalOntoUMLArchive.g:1198:2: ( rule__AssociationEnd__NameAssignment_0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getNameAssignment_0()); 
            // InternalOntoUMLArchive.g:1199:2: ( rule__AssociationEnd__NameAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoUMLArchive.g:1199:3: rule__AssociationEnd__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationEndAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__0__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__1"
    // InternalOntoUMLArchive.g:1207:1: rule__AssociationEnd__Group__1 : rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 ;
    public final void rule__AssociationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1211:1: ( rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 )
            // InternalOntoUMLArchive.g:1212:2: rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AssociationEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__1"


    // $ANTLR start "rule__AssociationEnd__Group__1__Impl"
    // InternalOntoUMLArchive.g:1219:1: rule__AssociationEnd__Group__1__Impl : ( ( rule__AssociationEnd__MultiplicityAssignment_1 ) ) ;
    public final void rule__AssociationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1223:1: ( ( ( rule__AssociationEnd__MultiplicityAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:1224:1: ( ( rule__AssociationEnd__MultiplicityAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:1224:1: ( ( rule__AssociationEnd__MultiplicityAssignment_1 ) )
            // InternalOntoUMLArchive.g:1225:2: ( rule__AssociationEnd__MultiplicityAssignment_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getMultiplicityAssignment_1()); 
            // InternalOntoUMLArchive.g:1226:2: ( rule__AssociationEnd__MultiplicityAssignment_1 )
            // InternalOntoUMLArchive.g:1226:3: rule__AssociationEnd__MultiplicityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__MultiplicityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getMultiplicityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__1__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__2"
    // InternalOntoUMLArchive.g:1234:1: rule__AssociationEnd__Group__2 : rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 ;
    public final void rule__AssociationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1238:1: ( rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 )
            // InternalOntoUMLArchive.g:1239:2: rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AssociationEnd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__2"


    // $ANTLR start "rule__AssociationEnd__Group__2__Impl"
    // InternalOntoUMLArchive.g:1246:1: rule__AssociationEnd__Group__2__Impl : ( ':' ) ;
    public final void rule__AssociationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1250:1: ( ( ':' ) )
            // InternalOntoUMLArchive.g:1251:1: ( ':' )
            {
            // InternalOntoUMLArchive.g:1251:1: ( ':' )
            // InternalOntoUMLArchive.g:1252:2: ':'
            {
             before(grammarAccess.getAssociationEndAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__2__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__3"
    // InternalOntoUMLArchive.g:1261:1: rule__AssociationEnd__Group__3 : rule__AssociationEnd__Group__3__Impl ;
    public final void rule__AssociationEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1265:1: ( rule__AssociationEnd__Group__3__Impl )
            // InternalOntoUMLArchive.g:1266:2: rule__AssociationEnd__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__3"


    // $ANTLR start "rule__AssociationEnd__Group__3__Impl"
    // InternalOntoUMLArchive.g:1272:1: rule__AssociationEnd__Group__3__Impl : ( ( rule__AssociationEnd__EndTypeAssignment_3 ) ) ;
    public final void rule__AssociationEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1276:1: ( ( ( rule__AssociationEnd__EndTypeAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:1277:1: ( ( rule__AssociationEnd__EndTypeAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:1277:1: ( ( rule__AssociationEnd__EndTypeAssignment_3 ) )
            // InternalOntoUMLArchive.g:1278:2: ( rule__AssociationEnd__EndTypeAssignment_3 )
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeAssignment_3()); 
            // InternalOntoUMLArchive.g:1279:2: ( rule__AssociationEnd__EndTypeAssignment_3 )
            // InternalOntoUMLArchive.g:1279:3: rule__AssociationEnd__EndTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__EndTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getEndTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__Group__3__Impl"


    // $ANTLR start "rule__Multiplicity__Group__0"
    // InternalOntoUMLArchive.g:1288:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1292:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // InternalOntoUMLArchive.g:1293:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Multiplicity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__0"


    // $ANTLR start "rule__Multiplicity__Group__0__Impl"
    // InternalOntoUMLArchive.g:1300:1: rule__Multiplicity__Group__0__Impl : ( '[' ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1304:1: ( ( '[' ) )
            // InternalOntoUMLArchive.g:1305:1: ( '[' )
            {
            // InternalOntoUMLArchive.g:1305:1: ( '[' )
            // InternalOntoUMLArchive.g:1306:2: '['
            {
             before(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group__1"
    // InternalOntoUMLArchive.g:1315:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1319:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // InternalOntoUMLArchive.g:1320:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Multiplicity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__1"


    // $ANTLR start "rule__Multiplicity__Group__1__Impl"
    // InternalOntoUMLArchive.g:1327:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__LowerAssignment_1 ) ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1331:1: ( ( ( rule__Multiplicity__LowerAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:1332:1: ( ( rule__Multiplicity__LowerAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:1332:1: ( ( rule__Multiplicity__LowerAssignment_1 ) )
            // InternalOntoUMLArchive.g:1333:2: ( rule__Multiplicity__LowerAssignment_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getLowerAssignment_1()); 
            // InternalOntoUMLArchive.g:1334:2: ( rule__Multiplicity__LowerAssignment_1 )
            // InternalOntoUMLArchive.g:1334:3: rule__Multiplicity__LowerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__LowerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getLowerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group__2"
    // InternalOntoUMLArchive.g:1342:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1346:1: ( rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 )
            // InternalOntoUMLArchive.g:1347:2: rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Multiplicity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__2"


    // $ANTLR start "rule__Multiplicity__Group__2__Impl"
    // InternalOntoUMLArchive.g:1354:1: rule__Multiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1358:1: ( ( '..' ) )
            // InternalOntoUMLArchive.g:1359:1: ( '..' )
            {
            // InternalOntoUMLArchive.g:1359:1: ( '..' )
            // InternalOntoUMLArchive.g:1360:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__2__Impl"


    // $ANTLR start "rule__Multiplicity__Group__3"
    // InternalOntoUMLArchive.g:1369:1: rule__Multiplicity__Group__3 : rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 ;
    public final void rule__Multiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1373:1: ( rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 )
            // InternalOntoUMLArchive.g:1374:2: rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Multiplicity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__3"


    // $ANTLR start "rule__Multiplicity__Group__3__Impl"
    // InternalOntoUMLArchive.g:1381:1: rule__Multiplicity__Group__3__Impl : ( ( rule__Multiplicity__UpperAssignment_3 ) ) ;
    public final void rule__Multiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1385:1: ( ( ( rule__Multiplicity__UpperAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:1386:1: ( ( rule__Multiplicity__UpperAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:1386:1: ( ( rule__Multiplicity__UpperAssignment_3 ) )
            // InternalOntoUMLArchive.g:1387:2: ( rule__Multiplicity__UpperAssignment_3 )
            {
             before(grammarAccess.getMultiplicityAccess().getUpperAssignment_3()); 
            // InternalOntoUMLArchive.g:1388:2: ( rule__Multiplicity__UpperAssignment_3 )
            // InternalOntoUMLArchive.g:1388:3: rule__Multiplicity__UpperAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__UpperAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getUpperAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__3__Impl"


    // $ANTLR start "rule__Multiplicity__Group__4"
    // InternalOntoUMLArchive.g:1396:1: rule__Multiplicity__Group__4 : rule__Multiplicity__Group__4__Impl ;
    public final void rule__Multiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1400:1: ( rule__Multiplicity__Group__4__Impl )
            // InternalOntoUMLArchive.g:1401:2: rule__Multiplicity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__4"


    // $ANTLR start "rule__Multiplicity__Group__4__Impl"
    // InternalOntoUMLArchive.g:1407:1: rule__Multiplicity__Group__4__Impl : ( ']' ) ;
    public final void rule__Multiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1411:1: ( ( ']' ) )
            // InternalOntoUMLArchive.g:1412:1: ( ']' )
            {
            // InternalOntoUMLArchive.g:1412:1: ( ']' )
            // InternalOntoUMLArchive.g:1413:2: ']'
            {
             before(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group__4__Impl"


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalOntoUMLArchive.g:1423:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1427:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalOntoUMLArchive.g:1428:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Generalization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__0"


    // $ANTLR start "rule__Generalization__Group__0__Impl"
    // InternalOntoUMLArchive.g:1435:1: rule__Generalization__Group__0__Impl : ( 'gen' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1439:1: ( ( 'gen' ) )
            // InternalOntoUMLArchive.g:1440:1: ( 'gen' )
            {
            // InternalOntoUMLArchive.g:1440:1: ( 'gen' )
            // InternalOntoUMLArchive.g:1441:2: 'gen'
            {
             before(grammarAccess.getGeneralizationAccess().getGenKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getGenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__0__Impl"


    // $ANTLR start "rule__Generalization__Group__1"
    // InternalOntoUMLArchive.g:1450:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1454:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalOntoUMLArchive.g:1455:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Generalization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__1"


    // $ANTLR start "rule__Generalization__Group__1__Impl"
    // InternalOntoUMLArchive.g:1462:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__NameAssignment_1 )? ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1466:1: ( ( ( rule__Generalization__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1467:1: ( ( rule__Generalization__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1467:1: ( ( rule__Generalization__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1468:2: ( rule__Generalization__NameAssignment_1 )?
            {
             before(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1469:2: ( rule__Generalization__NameAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoUMLArchive.g:1469:3: rule__Generalization__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Generalization__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__1__Impl"


    // $ANTLR start "rule__Generalization__Group__2"
    // InternalOntoUMLArchive.g:1477:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1481:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalOntoUMLArchive.g:1482:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Generalization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__2"


    // $ANTLR start "rule__Generalization__Group__2__Impl"
    // InternalOntoUMLArchive.g:1489:1: rule__Generalization__Group__2__Impl : ( 'super' ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1493:1: ( ( 'super' ) )
            // InternalOntoUMLArchive.g:1494:1: ( 'super' )
            {
            // InternalOntoUMLArchive.g:1494:1: ( 'super' )
            // InternalOntoUMLArchive.g:1495:2: 'super'
            {
             before(grammarAccess.getGeneralizationAccess().getSuperKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getSuperKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__2__Impl"


    // $ANTLR start "rule__Generalization__Group__3"
    // InternalOntoUMLArchive.g:1504:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1508:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalOntoUMLArchive.g:1509:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Generalization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__3"


    // $ANTLR start "rule__Generalization__Group__3__Impl"
    // InternalOntoUMLArchive.g:1516:1: rule__Generalization__Group__3__Impl : ( ( rule__Generalization__SuperAssignment_3 ) ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1520:1: ( ( ( rule__Generalization__SuperAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:1521:1: ( ( rule__Generalization__SuperAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:1521:1: ( ( rule__Generalization__SuperAssignment_3 ) )
            // InternalOntoUMLArchive.g:1522:2: ( rule__Generalization__SuperAssignment_3 )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperAssignment_3()); 
            // InternalOntoUMLArchive.g:1523:2: ( rule__Generalization__SuperAssignment_3 )
            // InternalOntoUMLArchive.g:1523:3: rule__Generalization__SuperAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__SuperAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getSuperAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__3__Impl"


    // $ANTLR start "rule__Generalization__Group__4"
    // InternalOntoUMLArchive.g:1531:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1535:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalOntoUMLArchive.g:1536:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Generalization__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__4"


    // $ANTLR start "rule__Generalization__Group__4__Impl"
    // InternalOntoUMLArchive.g:1543:1: rule__Generalization__Group__4__Impl : ( 'sub' ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1547:1: ( ( 'sub' ) )
            // InternalOntoUMLArchive.g:1548:1: ( 'sub' )
            {
            // InternalOntoUMLArchive.g:1548:1: ( 'sub' )
            // InternalOntoUMLArchive.g:1549:2: 'sub'
            {
             before(grammarAccess.getGeneralizationAccess().getSubKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getSubKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__4__Impl"


    // $ANTLR start "rule__Generalization__Group__5"
    // InternalOntoUMLArchive.g:1558:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1562:1: ( rule__Generalization__Group__5__Impl )
            // InternalOntoUMLArchive.g:1563:2: rule__Generalization__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__5"


    // $ANTLR start "rule__Generalization__Group__5__Impl"
    // InternalOntoUMLArchive.g:1569:1: rule__Generalization__Group__5__Impl : ( ( rule__Generalization__SubAssignment_5 ) ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1573:1: ( ( ( rule__Generalization__SubAssignment_5 ) ) )
            // InternalOntoUMLArchive.g:1574:1: ( ( rule__Generalization__SubAssignment_5 ) )
            {
            // InternalOntoUMLArchive.g:1574:1: ( ( rule__Generalization__SubAssignment_5 ) )
            // InternalOntoUMLArchive.g:1575:2: ( rule__Generalization__SubAssignment_5 )
            {
             before(grammarAccess.getGeneralizationAccess().getSubAssignment_5()); 
            // InternalOntoUMLArchive.g:1576:2: ( rule__Generalization__SubAssignment_5 )
            // InternalOntoUMLArchive.g:1576:3: rule__Generalization__SubAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__SubAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getSubAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__5__Impl"


    // $ANTLR start "rule__DependencyLink__Group__0"
    // InternalOntoUMLArchive.g:1585:1: rule__DependencyLink__Group__0 : rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1 ;
    public final void rule__DependencyLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1589:1: ( rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1 )
            // InternalOntoUMLArchive.g:1590:2: rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__DependencyLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependencyLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__0"


    // $ANTLR start "rule__DependencyLink__Group__0__Impl"
    // InternalOntoUMLArchive.g:1597:1: rule__DependencyLink__Group__0__Impl : ( 'dependency' ) ;
    public final void rule__DependencyLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1601:1: ( ( 'dependency' ) )
            // InternalOntoUMLArchive.g:1602:1: ( 'dependency' )
            {
            // InternalOntoUMLArchive.g:1602:1: ( 'dependency' )
            // InternalOntoUMLArchive.g:1603:2: 'dependency'
            {
             before(grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__0__Impl"


    // $ANTLR start "rule__DependencyLink__Group__1"
    // InternalOntoUMLArchive.g:1612:1: rule__DependencyLink__Group__1 : rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2 ;
    public final void rule__DependencyLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1616:1: ( rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2 )
            // InternalOntoUMLArchive.g:1617:2: rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__DependencyLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependencyLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__1"


    // $ANTLR start "rule__DependencyLink__Group__1__Impl"
    // InternalOntoUMLArchive.g:1624:1: rule__DependencyLink__Group__1__Impl : ( ( rule__DependencyLink__NameAssignment_1 )? ) ;
    public final void rule__DependencyLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1628:1: ( ( ( rule__DependencyLink__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1629:1: ( ( rule__DependencyLink__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1629:1: ( ( rule__DependencyLink__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1630:2: ( rule__DependencyLink__NameAssignment_1 )?
            {
             before(grammarAccess.getDependencyLinkAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1631:2: ( rule__DependencyLink__NameAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntoUMLArchive.g:1631:3: rule__DependencyLink__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DependencyLink__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDependencyLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__1__Impl"


    // $ANTLR start "rule__DependencyLink__Group__2"
    // InternalOntoUMLArchive.g:1639:1: rule__DependencyLink__Group__2 : rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3 ;
    public final void rule__DependencyLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1643:1: ( rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3 )
            // InternalOntoUMLArchive.g:1644:2: rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DependencyLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependencyLink__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__2"


    // $ANTLR start "rule__DependencyLink__Group__2__Impl"
    // InternalOntoUMLArchive.g:1651:1: rule__DependencyLink__Group__2__Impl : ( 'from' ) ;
    public final void rule__DependencyLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1655:1: ( ( 'from' ) )
            // InternalOntoUMLArchive.g:1656:1: ( 'from' )
            {
            // InternalOntoUMLArchive.g:1656:1: ( 'from' )
            // InternalOntoUMLArchive.g:1657:2: 'from'
            {
             before(grammarAccess.getDependencyLinkAccess().getFromKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__2__Impl"


    // $ANTLR start "rule__DependencyLink__Group__3"
    // InternalOntoUMLArchive.g:1666:1: rule__DependencyLink__Group__3 : rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4 ;
    public final void rule__DependencyLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1670:1: ( rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4 )
            // InternalOntoUMLArchive.g:1671:2: rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__DependencyLink__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependencyLink__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__3"


    // $ANTLR start "rule__DependencyLink__Group__3__Impl"
    // InternalOntoUMLArchive.g:1678:1: rule__DependencyLink__Group__3__Impl : ( ( rule__DependencyLink__FromAssignment_3 ) ) ;
    public final void rule__DependencyLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1682:1: ( ( ( rule__DependencyLink__FromAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:1683:1: ( ( rule__DependencyLink__FromAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:1683:1: ( ( rule__DependencyLink__FromAssignment_3 ) )
            // InternalOntoUMLArchive.g:1684:2: ( rule__DependencyLink__FromAssignment_3 )
            {
             before(grammarAccess.getDependencyLinkAccess().getFromAssignment_3()); 
            // InternalOntoUMLArchive.g:1685:2: ( rule__DependencyLink__FromAssignment_3 )
            // InternalOntoUMLArchive.g:1685:3: rule__DependencyLink__FromAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DependencyLink__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDependencyLinkAccess().getFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__3__Impl"


    // $ANTLR start "rule__DependencyLink__Group__4"
    // InternalOntoUMLArchive.g:1693:1: rule__DependencyLink__Group__4 : rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5 ;
    public final void rule__DependencyLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1697:1: ( rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5 )
            // InternalOntoUMLArchive.g:1698:2: rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DependencyLink__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependencyLink__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__4"


    // $ANTLR start "rule__DependencyLink__Group__4__Impl"
    // InternalOntoUMLArchive.g:1705:1: rule__DependencyLink__Group__4__Impl : ( 'to' ) ;
    public final void rule__DependencyLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1709:1: ( ( 'to' ) )
            // InternalOntoUMLArchive.g:1710:1: ( 'to' )
            {
            // InternalOntoUMLArchive.g:1710:1: ( 'to' )
            // InternalOntoUMLArchive.g:1711:2: 'to'
            {
             before(grammarAccess.getDependencyLinkAccess().getToKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__4__Impl"


    // $ANTLR start "rule__DependencyLink__Group__5"
    // InternalOntoUMLArchive.g:1720:1: rule__DependencyLink__Group__5 : rule__DependencyLink__Group__5__Impl ;
    public final void rule__DependencyLink__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1724:1: ( rule__DependencyLink__Group__5__Impl )
            // InternalOntoUMLArchive.g:1725:2: rule__DependencyLink__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DependencyLink__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__5"


    // $ANTLR start "rule__DependencyLink__Group__5__Impl"
    // InternalOntoUMLArchive.g:1731:1: rule__DependencyLink__Group__5__Impl : ( ( rule__DependencyLink__ToAssignment_5 ) ) ;
    public final void rule__DependencyLink__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1735:1: ( ( ( rule__DependencyLink__ToAssignment_5 ) ) )
            // InternalOntoUMLArchive.g:1736:1: ( ( rule__DependencyLink__ToAssignment_5 ) )
            {
            // InternalOntoUMLArchive.g:1736:1: ( ( rule__DependencyLink__ToAssignment_5 ) )
            // InternalOntoUMLArchive.g:1737:2: ( rule__DependencyLink__ToAssignment_5 )
            {
             before(grammarAccess.getDependencyLinkAccess().getToAssignment_5()); 
            // InternalOntoUMLArchive.g:1738:2: ( rule__DependencyLink__ToAssignment_5 )
            // InternalOntoUMLArchive.g:1738:3: rule__DependencyLink__ToAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DependencyLink__ToAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDependencyLinkAccess().getToAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__Group__5__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__0"
    // InternalOntoUMLArchive.g:1747:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1751:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoUMLArchive.g:1752:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__GeneralizationSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__0"


    // $ANTLR start "rule__GeneralizationSet__Group__0__Impl"
    // InternalOntoUMLArchive.g:1759:1: rule__GeneralizationSet__Group__0__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1763:1: ( ( 'genset' ) )
            // InternalOntoUMLArchive.g:1764:1: ( 'genset' )
            {
            // InternalOntoUMLArchive.g:1764:1: ( 'genset' )
            // InternalOntoUMLArchive.g:1765:2: 'genset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__1"
    // InternalOntoUMLArchive.g:1774:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1778:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoUMLArchive.g:1779:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__GeneralizationSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__1"


    // $ANTLR start "rule__GeneralizationSet__Group__1__Impl"
    // InternalOntoUMLArchive.g:1786:1: rule__GeneralizationSet__Group__1__Impl : ( ( rule__GeneralizationSet__UnorderedGroup_1 ) ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1790:1: ( ( ( rule__GeneralizationSet__UnorderedGroup_1 ) ) )
            // InternalOntoUMLArchive.g:1791:1: ( ( rule__GeneralizationSet__UnorderedGroup_1 ) )
            {
            // InternalOntoUMLArchive.g:1791:1: ( ( rule__GeneralizationSet__UnorderedGroup_1 ) )
            // InternalOntoUMLArchive.g:1792:2: ( rule__GeneralizationSet__UnorderedGroup_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1()); 
            // InternalOntoUMLArchive.g:1793:2: ( rule__GeneralizationSet__UnorderedGroup_1 )
            // InternalOntoUMLArchive.g:1793:3: rule__GeneralizationSet__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__2"
    // InternalOntoUMLArchive.g:1801:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1805:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoUMLArchive.g:1806:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__GeneralizationSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__2"


    // $ANTLR start "rule__GeneralizationSet__Group__2__Impl"
    // InternalOntoUMLArchive.g:1813:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1817:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalOntoUMLArchive.g:1818:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalOntoUMLArchive.g:1818:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalOntoUMLArchive.g:1819:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoUMLArchive.g:1820:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoUMLArchive.g:1820:3: rule__GeneralizationSet__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__2__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__3"
    // InternalOntoUMLArchive.g:1828:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1832:1: ( rule__GeneralizationSet__Group__3__Impl )
            // InternalOntoUMLArchive.g:1833:2: rule__GeneralizationSet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__3"


    // $ANTLR start "rule__GeneralizationSet__Group__3__Impl"
    // InternalOntoUMLArchive.g:1839:1: rule__GeneralizationSet__Group__3__Impl : ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1843:1: ( ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) ) )
            // InternalOntoUMLArchive.g:1844:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) )
            {
            // InternalOntoUMLArchive.g:1844:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:1845:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:1845:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) )
            // InternalOntoUMLArchive.g:1846:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 
            // InternalOntoUMLArchive.g:1847:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )
            // InternalOntoUMLArchive.g:1847:4: rule__GeneralizationSet__GeneralizationsAssignment_3
            {
            pushFollow(FOLLOW_23);
            rule__GeneralizationSet__GeneralizationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 

            }

            // InternalOntoUMLArchive.g:1850:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* )
            // InternalOntoUMLArchive.g:1851:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 
            // InternalOntoUMLArchive.g:1852:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1852:4: rule__GeneralizationSet__GeneralizationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__GeneralizationSet__GeneralizationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__3__Impl"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_1"
    // InternalOntoUMLArchive.g:1862:1: rule__GeneralizationSet__UnorderedGroup_1 : ( rule__GeneralizationSet__UnorderedGroup_1__0 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
        	
        try {
            // InternalOntoUMLArchive.g:1867:1: ( ( rule__GeneralizationSet__UnorderedGroup_1__0 )? )
            // InternalOntoUMLArchive.g:1868:2: ( rule__GeneralizationSet__UnorderedGroup_1__0 )?
            {
            // InternalOntoUMLArchive.g:1868:2: ( rule__GeneralizationSet__UnorderedGroup_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoUMLArchive.g:1868:2: rule__GeneralizationSet__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_1"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_1__Impl"
    // InternalOntoUMLArchive.g:1876:1: rule__GeneralizationSet__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) ) ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOntoUMLArchive.g:1881:1: ( ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) ) )
            // InternalOntoUMLArchive.g:1882:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) )
            {
            // InternalOntoUMLArchive.g:1882:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoUMLArchive.g:1883:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:1883:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) )
                    // InternalOntoUMLArchive.g:1884:4: {...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalOntoUMLArchive.g:1884:113: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) )
                    // InternalOntoUMLArchive.g:1885:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:1891:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) )
                    // InternalOntoUMLArchive.g:1892:6: ( rule__GeneralizationSet__IsDisjointAssignment_1_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_1_0()); 
                    // InternalOntoUMLArchive.g:1893:6: ( rule__GeneralizationSet__IsDisjointAssignment_1_0 )
                    // InternalOntoUMLArchive.g:1893:7: rule__GeneralizationSet__IsDisjointAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__IsDisjointAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:1898:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:1898:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) )
                    // InternalOntoUMLArchive.g:1899:4: {...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalOntoUMLArchive.g:1899:113: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) )
                    // InternalOntoUMLArchive.g:1900:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:1906:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) )
                    // InternalOntoUMLArchive.g:1907:6: ( rule__GeneralizationSet__IsCompleteAssignment_1_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_1_1()); 
                    // InternalOntoUMLArchive.g:1908:6: ( rule__GeneralizationSet__IsCompleteAssignment_1_1 )
                    // InternalOntoUMLArchive.g:1908:7: rule__GeneralizationSet__IsCompleteAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__IsCompleteAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_1__0"
    // InternalOntoUMLArchive.g:1921:1: rule__GeneralizationSet__UnorderedGroup_1__0 : rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1925:1: ( rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )? )
            // InternalOntoUMLArchive.g:1926:2: rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_24);
            rule__GeneralizationSet__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalOntoUMLArchive.g:1927:2: ( rule__GeneralizationSet__UnorderedGroup_1__1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoUMLArchive.g:1927:2: rule__GeneralizationSet__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_1__0"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_1__1"
    // InternalOntoUMLArchive.g:1933:1: rule__GeneralizationSet__UnorderedGroup_1__1 : rule__GeneralizationSet__UnorderedGroup_1__Impl ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1937:1: ( rule__GeneralizationSet__UnorderedGroup_1__Impl )
            // InternalOntoUMLArchive.g:1938:2: rule__GeneralizationSet__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__UnorderedGroup_1__1"


    // $ANTLR start "rule__Model__ElmentsAssignment"
    // InternalOntoUMLArchive.g:1945:1: rule__Model__ElmentsAssignment : ( ruleModelElement ) ;
    public final void rule__Model__ElmentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1949:1: ( ( ruleModelElement ) )
            // InternalOntoUMLArchive.g:1950:2: ( ruleModelElement )
            {
            // InternalOntoUMLArchive.g:1950:2: ( ruleModelElement )
            // InternalOntoUMLArchive.g:1951:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElmentsModelElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElmentsModelElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElmentsAssignment"


    // $ANTLR start "rule__Class__IsAbstractAssignment_0"
    // InternalOntoUMLArchive.g:1960:1: rule__Class__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1964:1: ( ( ( 'abstract' ) ) )
            // InternalOntoUMLArchive.g:1965:2: ( ( 'abstract' ) )
            {
            // InternalOntoUMLArchive.g:1965:2: ( ( 'abstract' ) )
            // InternalOntoUMLArchive.g:1966:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalOntoUMLArchive.g:1967:3: ( 'abstract' )
            // InternalOntoUMLArchive.g:1968:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__IsAbstractAssignment_0"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalOntoUMLArchive.g:1979:1: rule__Class__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1983:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:1984:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:1984:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:1985:3: RULE_STRING
            {
             before(grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__StereotypeAssignment_3"
    // InternalOntoUMLArchive.g:1994:1: rule__Class__StereotypeAssignment_3 : ( ruleStereotype ) ;
    public final void rule__Class__StereotypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1998:1: ( ( ruleStereotype ) )
            // InternalOntoUMLArchive.g:1999:2: ( ruleStereotype )
            {
            // InternalOntoUMLArchive.g:1999:2: ( ruleStereotype )
            // InternalOntoUMLArchive.g:2000:3: ruleStereotype
            {
             before(grammarAccess.getClassAccess().getStereotypeStereotypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStereotype();

            state._fsp--;

             after(grammarAccess.getClassAccess().getStereotypeStereotypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__StereotypeAssignment_3"


    // $ANTLR start "rule__RegularAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:2009:1: rule__RegularAssociation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RegularAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2013:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2014:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:2014:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2015:3: RULE_STRING
            {
             before(grammarAccess.getRegularAssociationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRegularAssociationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__NameAssignment_1"


    // $ANTLR start "rule__RegularAssociation__StereotypeAssignment_2"
    // InternalOntoUMLArchive.g:2024:1: rule__RegularAssociation__StereotypeAssignment_2 : ( ruleStereotype ) ;
    public final void rule__RegularAssociation__StereotypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2028:1: ( ( ruleStereotype ) )
            // InternalOntoUMLArchive.g:2029:2: ( ruleStereotype )
            {
            // InternalOntoUMLArchive.g:2029:2: ( ruleStereotype )
            // InternalOntoUMLArchive.g:2030:3: ruleStereotype
            {
             before(grammarAccess.getRegularAssociationAccess().getStereotypeStereotypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStereotype();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getStereotypeStereotypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__StereotypeAssignment_2"


    // $ANTLR start "rule__RegularAssociation__FromAssignment_4"
    // InternalOntoUMLArchive.g:2039:1: rule__RegularAssociation__FromAssignment_4 : ( ruleAssociationEnd ) ;
    public final void rule__RegularAssociation__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2043:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:2044:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:2044:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:2045:3: ruleAssociationEnd
            {
             before(grammarAccess.getRegularAssociationAccess().getFromAssociationEndParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getFromAssociationEndParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__FromAssignment_4"


    // $ANTLR start "rule__RegularAssociation__ToAssignment_6"
    // InternalOntoUMLArchive.g:2054:1: rule__RegularAssociation__ToAssignment_6 : ( ruleAssociationEnd ) ;
    public final void rule__RegularAssociation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2058:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:2059:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:2059:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:2060:3: ruleAssociationEnd
            {
             before(grammarAccess.getRegularAssociationAccess().getToAssociationEndParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getRegularAssociationAccess().getToAssociationEndParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAssociation__ToAssignment_6"


    // $ANTLR start "rule__NaryAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:2069:1: rule__NaryAssociation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NaryAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2073:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2074:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:2074:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2075:3: RULE_STRING
            {
             before(grammarAccess.getNaryAssociationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNaryAssociationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__NameAssignment_1"


    // $ANTLR start "rule__NaryAssociation__StereotypeAssignment_2"
    // InternalOntoUMLArchive.g:2084:1: rule__NaryAssociation__StereotypeAssignment_2 : ( ruleStereotype ) ;
    public final void rule__NaryAssociation__StereotypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2088:1: ( ( ruleStereotype ) )
            // InternalOntoUMLArchive.g:2089:2: ( ruleStereotype )
            {
            // InternalOntoUMLArchive.g:2089:2: ( ruleStereotype )
            // InternalOntoUMLArchive.g:2090:3: ruleStereotype
            {
             before(grammarAccess.getNaryAssociationAccess().getStereotypeStereotypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStereotype();

            state._fsp--;

             after(grammarAccess.getNaryAssociationAccess().getStereotypeStereotypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__StereotypeAssignment_2"


    // $ANTLR start "rule__NaryAssociation__EndsAssignment_3_1"
    // InternalOntoUMLArchive.g:2099:1: rule__NaryAssociation__EndsAssignment_3_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2103:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:2104:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:2104:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:2105:3: ruleAssociationEnd
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__EndsAssignment_3_1"


    // $ANTLR start "rule__NaryAssociation__EndsAssignment_4_1"
    // InternalOntoUMLArchive.g:2114:1: rule__NaryAssociation__EndsAssignment_4_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2118:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:2119:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:2119:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:2120:3: ruleAssociationEnd
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__EndsAssignment_4_1"


    // $ANTLR start "rule__NaryAssociation__EndsAssignment_5_1"
    // InternalOntoUMLArchive.g:2129:1: rule__NaryAssociation__EndsAssignment_5_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2133:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:2134:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:2134:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:2135:3: ruleAssociationEnd
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaryAssociation__EndsAssignment_5_1"


    // $ANTLR start "rule__AssociationEnd__NameAssignment_0"
    // InternalOntoUMLArchive.g:2144:1: rule__AssociationEnd__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2148:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2149:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:2149:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2150:3: RULE_STRING
            {
             before(grammarAccess.getAssociationEndAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__NameAssignment_0"


    // $ANTLR start "rule__AssociationEnd__MultiplicityAssignment_1"
    // InternalOntoUMLArchive.g:2159:1: rule__AssociationEnd__MultiplicityAssignment_1 : ( ruleMultiplicity ) ;
    public final void rule__AssociationEnd__MultiplicityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2163:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:2164:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:2164:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:2165:3: ruleMultiplicity
            {
             before(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__MultiplicityAssignment_1"


    // $ANTLR start "rule__AssociationEnd__EndTypeAssignment_3"
    // InternalOntoUMLArchive.g:2174:1: rule__AssociationEnd__EndTypeAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__AssociationEnd__EndTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2178:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:2179:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:2179:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2180:3: ( RULE_STRING )
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_3_0()); 
            // InternalOntoUMLArchive.g:2181:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2182:4: RULE_STRING
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeClassSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getEndTypeClassSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__EndTypeAssignment_3"


    // $ANTLR start "rule__Multiplicity__LowerAssignment_1"
    // InternalOntoUMLArchive.g:2193:1: rule__Multiplicity__LowerAssignment_1 : ( ruleCARDINALITY ) ;
    public final void rule__Multiplicity__LowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2197:1: ( ( ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:2198:2: ( ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:2198:2: ( ruleCARDINALITY )
            // InternalOntoUMLArchive.g:2199:3: ruleCARDINALITY
            {
             before(grammarAccess.getMultiplicityAccess().getLowerCARDINALITYParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCARDINALITY();

            state._fsp--;

             after(grammarAccess.getMultiplicityAccess().getLowerCARDINALITYParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__LowerAssignment_1"


    // $ANTLR start "rule__Multiplicity__UpperAssignment_3"
    // InternalOntoUMLArchive.g:2208:1: rule__Multiplicity__UpperAssignment_3 : ( ruleCARDINALITY ) ;
    public final void rule__Multiplicity__UpperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2212:1: ( ( ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:2213:2: ( ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:2213:2: ( ruleCARDINALITY )
            // InternalOntoUMLArchive.g:2214:3: ruleCARDINALITY
            {
             before(grammarAccess.getMultiplicityAccess().getUpperCARDINALITYParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCARDINALITY();

            state._fsp--;

             after(grammarAccess.getMultiplicityAccess().getUpperCARDINALITYParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__UpperAssignment_3"


    // $ANTLR start "rule__Generalization__NameAssignment_1"
    // InternalOntoUMLArchive.g:2223:1: rule__Generalization__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Generalization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2227:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2228:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:2228:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2229:3: RULE_STRING
            {
             before(grammarAccess.getGeneralizationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__NameAssignment_1"


    // $ANTLR start "rule__Generalization__SuperAssignment_3"
    // InternalOntoUMLArchive.g:2238:1: rule__Generalization__SuperAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__Generalization__SuperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2242:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:2243:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:2243:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2244:3: ( RULE_STRING )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0()); 
            // InternalOntoUMLArchive.g:2245:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2246:4: RULE_STRING
            {
             before(grammarAccess.getGeneralizationAccess().getSuperClassSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getSuperClassSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__SuperAssignment_3"


    // $ANTLR start "rule__Generalization__SubAssignment_5"
    // InternalOntoUMLArchive.g:2257:1: rule__Generalization__SubAssignment_5 : ( ( RULE_STRING ) ) ;
    public final void rule__Generalization__SubAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2261:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:2262:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:2262:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2263:3: ( RULE_STRING )
            {
             before(grammarAccess.getGeneralizationAccess().getSubClassCrossReference_5_0()); 
            // InternalOntoUMLArchive.g:2264:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2265:4: RULE_STRING
            {
             before(grammarAccess.getGeneralizationAccess().getSubClassSTRINGTerminalRuleCall_5_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getSubClassSTRINGTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getGeneralizationAccess().getSubClassCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__SubAssignment_5"


    // $ANTLR start "rule__DependencyLink__NameAssignment_1"
    // InternalOntoUMLArchive.g:2276:1: rule__DependencyLink__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DependencyLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2280:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2281:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:2281:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2282:3: RULE_STRING
            {
             before(grammarAccess.getDependencyLinkAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__NameAssignment_1"


    // $ANTLR start "rule__DependencyLink__FromAssignment_3"
    // InternalOntoUMLArchive.g:2291:1: rule__DependencyLink__FromAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__DependencyLink__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2295:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:2296:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:2296:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2297:3: ( RULE_STRING )
            {
             before(grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_3_0()); 
            // InternalOntoUMLArchive.g:2298:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2299:4: RULE_STRING
            {
             before(grammarAccess.getDependencyLinkAccess().getFromClassSTRINGTerminalRuleCall_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getFromClassSTRINGTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__FromAssignment_3"


    // $ANTLR start "rule__DependencyLink__ToAssignment_5"
    // InternalOntoUMLArchive.g:2310:1: rule__DependencyLink__ToAssignment_5 : ( ( RULE_STRING ) ) ;
    public final void rule__DependencyLink__ToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2314:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:2315:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:2315:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2316:3: ( RULE_STRING )
            {
             before(grammarAccess.getDependencyLinkAccess().getToClassCrossReference_5_0()); 
            // InternalOntoUMLArchive.g:2317:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2318:4: RULE_STRING
            {
             before(grammarAccess.getDependencyLinkAccess().getToClassSTRINGTerminalRuleCall_5_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getToClassSTRINGTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDependencyLinkAccess().getToClassCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyLink__ToAssignment_5"


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_1_0"
    // InternalOntoUMLArchive.g:2329:1: rule__GeneralizationSet__IsDisjointAssignment_1_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2333:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoUMLArchive.g:2334:2: ( ( 'disjoint' ) )
            {
            // InternalOntoUMLArchive.g:2334:2: ( ( 'disjoint' ) )
            // InternalOntoUMLArchive.g:2335:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 
            // InternalOntoUMLArchive.g:2336:3: ( 'disjoint' )
            // InternalOntoUMLArchive.g:2337:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsDisjointAssignment_1_0"


    // $ANTLR start "rule__GeneralizationSet__IsCompleteAssignment_1_1"
    // InternalOntoUMLArchive.g:2348:1: rule__GeneralizationSet__IsCompleteAssignment_1_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2352:1: ( ( ( 'complete' ) ) )
            // InternalOntoUMLArchive.g:2353:2: ( ( 'complete' ) )
            {
            // InternalOntoUMLArchive.g:2353:2: ( ( 'complete' ) )
            // InternalOntoUMLArchive.g:2354:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 
            // InternalOntoUMLArchive.g:2355:3: ( 'complete' )
            // InternalOntoUMLArchive.g:2356:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsCompleteAssignment_1_1"


    // $ANTLR start "rule__GeneralizationSet__NameAssignment_2"
    // InternalOntoUMLArchive.g:2367:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2371:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:2372:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:2372:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:2373:3: RULE_STRING
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__NameAssignment_2"


    // $ANTLR start "rule__GeneralizationSet__GeneralizationsAssignment_3"
    // InternalOntoUMLArchive.g:2382:1: rule__GeneralizationSet__GeneralizationsAssignment_3 : ( ruleGeneralization ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2386:1: ( ( ruleGeneralization ) )
            // InternalOntoUMLArchive.g:2387:2: ( ruleGeneralization )
            {
            // InternalOntoUMLArchive.g:2387:2: ( ruleGeneralization )
            // InternalOntoUMLArchive.g:2388:3: ruleGeneralization
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__GeneralizationsAssignment_3"


    // $ANTLR start "rule__Stereotype__NameAssignment"
    // InternalOntoUMLArchive.g:2397:1: rule__Stereotype__NameAssignment : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__Stereotype__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2401:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:2402:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:2402:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:2403:3: RULE_STEREOTYPE_STRING
            {
             before(grammarAccess.getStereotypeAccess().getNameSTEREOTYPE_STRINGTerminalRuleCall_0()); 
            match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 
             after(grammarAccess.getStereotypeAccess().getNameSTEREOTYPE_STRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stereotype__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000001C80C002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060000002L});

}
