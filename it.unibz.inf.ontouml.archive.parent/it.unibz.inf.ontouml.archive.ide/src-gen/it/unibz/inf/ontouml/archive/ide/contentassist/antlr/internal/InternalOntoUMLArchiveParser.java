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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_STEREOTYPE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'shared'", "'composite'", "';'", "'class'", "'att'", "':'", "'association'", "'from'", "'to'", "'end'", "'{'", "'}'", "','", "'['", "'..'", "']'", "'gen'", "'super'", "'sub'", "'dependency'", "'derivation'", "'relation'", "'genset'", "'abstract'", "'disjoint'", "'complete'"
    };
    public static final int RULE_STEREOTYPE_STRING=6;
    public static final int RULE_STRING=5;
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
    // InternalOntoUMLArchive.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalOntoUMLArchive.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalOntoUMLArchive.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalOntoUMLArchive.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalOntoUMLArchive.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==19||LA1_0==29||(LA1_0>=32 && LA1_0<=33)||(LA1_0>=35 && LA1_0<=36)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

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


    // $ANTLR start "entryRuleAttribute"
    // InternalOntoUMLArchive.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:129:1: ( ruleAttribute EOF )
            // InternalOntoUMLArchive.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalOntoUMLArchive.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalOntoUMLArchive.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalOntoUMLArchive.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalOntoUMLArchive.g:144:3: ( rule__Attribute__Group__0 )
            // InternalOntoUMLArchive.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // InternalOntoUMLArchive.g:153:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:154:1: ( ruleRelationship EOF )
            // InternalOntoUMLArchive.g:155:1: ruleRelationship EOF
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
    // InternalOntoUMLArchive.g:162:1: ruleRelationship : ( ( rule__Relationship__Alternatives ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:166:2: ( ( ( rule__Relationship__Alternatives ) ) )
            // InternalOntoUMLArchive.g:167:2: ( ( rule__Relationship__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:167:2: ( ( rule__Relationship__Alternatives ) )
            // InternalOntoUMLArchive.g:168:3: ( rule__Relationship__Alternatives )
            {
             before(grammarAccess.getRelationshipAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:169:3: ( rule__Relationship__Alternatives )
            // InternalOntoUMLArchive.g:169:4: rule__Relationship__Alternatives
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
    // InternalOntoUMLArchive.g:178:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:179:1: ( ruleAssociation EOF )
            // InternalOntoUMLArchive.g:180:1: ruleAssociation EOF
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
    // InternalOntoUMLArchive.g:187:1: ruleAssociation : ( ( rule__Association__Alternatives ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:191:2: ( ( ( rule__Association__Alternatives ) ) )
            // InternalOntoUMLArchive.g:192:2: ( ( rule__Association__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:192:2: ( ( rule__Association__Alternatives ) )
            // InternalOntoUMLArchive.g:193:3: ( rule__Association__Alternatives )
            {
             before(grammarAccess.getAssociationAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:194:3: ( rule__Association__Alternatives )
            // InternalOntoUMLArchive.g:194:4: rule__Association__Alternatives
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


    // $ANTLR start "entryRuleBinaryAssociation"
    // InternalOntoUMLArchive.g:203:1: entryRuleBinaryAssociation : ruleBinaryAssociation EOF ;
    public final void entryRuleBinaryAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:204:1: ( ruleBinaryAssociation EOF )
            // InternalOntoUMLArchive.g:205:1: ruleBinaryAssociation EOF
            {
             before(grammarAccess.getBinaryAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryAssociation();

            state._fsp--;

             after(grammarAccess.getBinaryAssociationRule()); 
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
    // $ANTLR end "entryRuleBinaryAssociation"


    // $ANTLR start "ruleBinaryAssociation"
    // InternalOntoUMLArchive.g:212:1: ruleBinaryAssociation : ( ( rule__BinaryAssociation__Group__0 ) ) ;
    public final void ruleBinaryAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:216:2: ( ( ( rule__BinaryAssociation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:217:2: ( ( rule__BinaryAssociation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:217:2: ( ( rule__BinaryAssociation__Group__0 ) )
            // InternalOntoUMLArchive.g:218:3: ( rule__BinaryAssociation__Group__0 )
            {
             before(grammarAccess.getBinaryAssociationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:219:3: ( rule__BinaryAssociation__Group__0 )
            // InternalOntoUMLArchive.g:219:4: rule__BinaryAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAssociationAccess().getGroup()); 

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
    // $ANTLR end "ruleBinaryAssociation"


    // $ANTLR start "entryRuleNaryAssociation"
    // InternalOntoUMLArchive.g:228:1: entryRuleNaryAssociation : ruleNaryAssociation EOF ;
    public final void entryRuleNaryAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:229:1: ( ruleNaryAssociation EOF )
            // InternalOntoUMLArchive.g:230:1: ruleNaryAssociation EOF
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
    // InternalOntoUMLArchive.g:237:1: ruleNaryAssociation : ( ( rule__NaryAssociation__Group__0 ) ) ;
    public final void ruleNaryAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:241:2: ( ( ( rule__NaryAssociation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:242:2: ( ( rule__NaryAssociation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:242:2: ( ( rule__NaryAssociation__Group__0 ) )
            // InternalOntoUMLArchive.g:243:3: ( rule__NaryAssociation__Group__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:244:3: ( rule__NaryAssociation__Group__0 )
            // InternalOntoUMLArchive.g:244:4: rule__NaryAssociation__Group__0
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
    // InternalOntoUMLArchive.g:253:1: entryRuleAssociationEnd : ruleAssociationEnd EOF ;
    public final void entryRuleAssociationEnd() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:254:1: ( ruleAssociationEnd EOF )
            // InternalOntoUMLArchive.g:255:1: ruleAssociationEnd EOF
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
    // InternalOntoUMLArchive.g:262:1: ruleAssociationEnd : ( ( rule__AssociationEnd__Group__0 ) ) ;
    public final void ruleAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:266:2: ( ( ( rule__AssociationEnd__Group__0 ) ) )
            // InternalOntoUMLArchive.g:267:2: ( ( rule__AssociationEnd__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:267:2: ( ( rule__AssociationEnd__Group__0 ) )
            // InternalOntoUMLArchive.g:268:3: ( rule__AssociationEnd__Group__0 )
            {
             before(grammarAccess.getAssociationEndAccess().getGroup()); 
            // InternalOntoUMLArchive.g:269:3: ( rule__AssociationEnd__Group__0 )
            // InternalOntoUMLArchive.g:269:4: rule__AssociationEnd__Group__0
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
    // InternalOntoUMLArchive.g:278:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:279:1: ( ruleMultiplicity EOF )
            // InternalOntoUMLArchive.g:280:1: ruleMultiplicity EOF
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
    // InternalOntoUMLArchive.g:287:1: ruleMultiplicity : ( ( rule__Multiplicity__Group__0 ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:291:2: ( ( ( rule__Multiplicity__Group__0 ) ) )
            // InternalOntoUMLArchive.g:292:2: ( ( rule__Multiplicity__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:292:2: ( ( rule__Multiplicity__Group__0 ) )
            // InternalOntoUMLArchive.g:293:3: ( rule__Multiplicity__Group__0 )
            {
             before(grammarAccess.getMultiplicityAccess().getGroup()); 
            // InternalOntoUMLArchive.g:294:3: ( rule__Multiplicity__Group__0 )
            // InternalOntoUMLArchive.g:294:4: rule__Multiplicity__Group__0
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
    // InternalOntoUMLArchive.g:303:1: entryRuleCARDINALITY : ruleCARDINALITY EOF ;
    public final void entryRuleCARDINALITY() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:304:1: ( ruleCARDINALITY EOF )
            // InternalOntoUMLArchive.g:305:1: ruleCARDINALITY EOF
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
    // InternalOntoUMLArchive.g:312:1: ruleCARDINALITY : ( ( rule__CARDINALITY__Alternatives ) ) ;
    public final void ruleCARDINALITY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:316:2: ( ( ( rule__CARDINALITY__Alternatives ) ) )
            // InternalOntoUMLArchive.g:317:2: ( ( rule__CARDINALITY__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:317:2: ( ( rule__CARDINALITY__Alternatives ) )
            // InternalOntoUMLArchive.g:318:3: ( rule__CARDINALITY__Alternatives )
            {
             before(grammarAccess.getCARDINALITYAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:319:3: ( rule__CARDINALITY__Alternatives )
            // InternalOntoUMLArchive.g:319:4: rule__CARDINALITY__Alternatives
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
    // InternalOntoUMLArchive.g:328:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:329:1: ( ruleGeneralization EOF )
            // InternalOntoUMLArchive.g:330:1: ruleGeneralization EOF
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
    // InternalOntoUMLArchive.g:337:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:341:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalOntoUMLArchive.g:342:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:342:2: ( ( rule__Generalization__Group__0 ) )
            // InternalOntoUMLArchive.g:343:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:344:3: ( rule__Generalization__Group__0 )
            // InternalOntoUMLArchive.g:344:4: rule__Generalization__Group__0
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
    // InternalOntoUMLArchive.g:353:1: entryRuleDependencyLink : ruleDependencyLink EOF ;
    public final void entryRuleDependencyLink() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:354:1: ( ruleDependencyLink EOF )
            // InternalOntoUMLArchive.g:355:1: ruleDependencyLink EOF
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
    // InternalOntoUMLArchive.g:362:1: ruleDependencyLink : ( ( rule__DependencyLink__Group__0 ) ) ;
    public final void ruleDependencyLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:366:2: ( ( ( rule__DependencyLink__Group__0 ) ) )
            // InternalOntoUMLArchive.g:367:2: ( ( rule__DependencyLink__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:367:2: ( ( rule__DependencyLink__Group__0 ) )
            // InternalOntoUMLArchive.g:368:3: ( rule__DependencyLink__Group__0 )
            {
             before(grammarAccess.getDependencyLinkAccess().getGroup()); 
            // InternalOntoUMLArchive.g:369:3: ( rule__DependencyLink__Group__0 )
            // InternalOntoUMLArchive.g:369:4: rule__DependencyLink__Group__0
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


    // $ANTLR start "entryRuleDerivation"
    // InternalOntoUMLArchive.g:378:1: entryRuleDerivation : ruleDerivation EOF ;
    public final void entryRuleDerivation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:379:1: ( ruleDerivation EOF )
            // InternalOntoUMLArchive.g:380:1: ruleDerivation EOF
            {
             before(grammarAccess.getDerivationRule()); 
            pushFollow(FOLLOW_1);
            ruleDerivation();

            state._fsp--;

             after(grammarAccess.getDerivationRule()); 
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
    // $ANTLR end "entryRuleDerivation"


    // $ANTLR start "ruleDerivation"
    // InternalOntoUMLArchive.g:387:1: ruleDerivation : ( ( rule__Derivation__Group__0 ) ) ;
    public final void ruleDerivation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:391:2: ( ( ( rule__Derivation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:392:2: ( ( rule__Derivation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:392:2: ( ( rule__Derivation__Group__0 ) )
            // InternalOntoUMLArchive.g:393:3: ( rule__Derivation__Group__0 )
            {
             before(grammarAccess.getDerivationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:394:3: ( rule__Derivation__Group__0 )
            // InternalOntoUMLArchive.g:394:4: rule__Derivation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Derivation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAccess().getGroup()); 

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
    // $ANTLR end "ruleDerivation"


    // $ANTLR start "entryRuleClassDerivationEnd"
    // InternalOntoUMLArchive.g:403:1: entryRuleClassDerivationEnd : ruleClassDerivationEnd EOF ;
    public final void entryRuleClassDerivationEnd() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:404:1: ( ruleClassDerivationEnd EOF )
            // InternalOntoUMLArchive.g:405:1: ruleClassDerivationEnd EOF
            {
             before(grammarAccess.getClassDerivationEndRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDerivationEnd();

            state._fsp--;

             after(grammarAccess.getClassDerivationEndRule()); 
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
    // $ANTLR end "entryRuleClassDerivationEnd"


    // $ANTLR start "ruleClassDerivationEnd"
    // InternalOntoUMLArchive.g:412:1: ruleClassDerivationEnd : ( ( rule__ClassDerivationEnd__Group__0 ) ) ;
    public final void ruleClassDerivationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:416:2: ( ( ( rule__ClassDerivationEnd__Group__0 ) ) )
            // InternalOntoUMLArchive.g:417:2: ( ( rule__ClassDerivationEnd__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:417:2: ( ( rule__ClassDerivationEnd__Group__0 ) )
            // InternalOntoUMLArchive.g:418:3: ( rule__ClassDerivationEnd__Group__0 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getGroup()); 
            // InternalOntoUMLArchive.g:419:3: ( rule__ClassDerivationEnd__Group__0 )
            // InternalOntoUMLArchive.g:419:4: rule__ClassDerivationEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDerivationEndAccess().getGroup()); 

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
    // $ANTLR end "ruleClassDerivationEnd"


    // $ANTLR start "entryRuleRelationDerivationEnd"
    // InternalOntoUMLArchive.g:428:1: entryRuleRelationDerivationEnd : ruleRelationDerivationEnd EOF ;
    public final void entryRuleRelationDerivationEnd() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:429:1: ( ruleRelationDerivationEnd EOF )
            // InternalOntoUMLArchive.g:430:1: ruleRelationDerivationEnd EOF
            {
             before(grammarAccess.getRelationDerivationEndRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationDerivationEnd();

            state._fsp--;

             after(grammarAccess.getRelationDerivationEndRule()); 
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
    // $ANTLR end "entryRuleRelationDerivationEnd"


    // $ANTLR start "ruleRelationDerivationEnd"
    // InternalOntoUMLArchive.g:437:1: ruleRelationDerivationEnd : ( ( rule__RelationDerivationEnd__Group__0 ) ) ;
    public final void ruleRelationDerivationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:441:2: ( ( ( rule__RelationDerivationEnd__Group__0 ) ) )
            // InternalOntoUMLArchive.g:442:2: ( ( rule__RelationDerivationEnd__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:442:2: ( ( rule__RelationDerivationEnd__Group__0 ) )
            // InternalOntoUMLArchive.g:443:3: ( rule__RelationDerivationEnd__Group__0 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getGroup()); 
            // InternalOntoUMLArchive.g:444:3: ( rule__RelationDerivationEnd__Group__0 )
            // InternalOntoUMLArchive.g:444:4: rule__RelationDerivationEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationDerivationEndAccess().getGroup()); 

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
    // $ANTLR end "ruleRelationDerivationEnd"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoUMLArchive.g:453:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:454:1: ( ruleGeneralizationSet EOF )
            // InternalOntoUMLArchive.g:455:1: ruleGeneralizationSet EOF
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
    // InternalOntoUMLArchive.g:462:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:466:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalOntoUMLArchive.g:467:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:467:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalOntoUMLArchive.g:468:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalOntoUMLArchive.g:469:3: ( rule__GeneralizationSet__Group__0 )
            // InternalOntoUMLArchive.g:469:4: rule__GeneralizationSet__Group__0
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


    // $ANTLR start "ruleAggregationKindDeclaration"
    // InternalOntoUMLArchive.g:478:1: ruleAggregationKindDeclaration : ( ( rule__AggregationKindDeclaration__Alternatives ) ) ;
    public final void ruleAggregationKindDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:482:1: ( ( ( rule__AggregationKindDeclaration__Alternatives ) ) )
            // InternalOntoUMLArchive.g:483:2: ( ( rule__AggregationKindDeclaration__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:483:2: ( ( rule__AggregationKindDeclaration__Alternatives ) )
            // InternalOntoUMLArchive.g:484:3: ( rule__AggregationKindDeclaration__Alternatives )
            {
             before(grammarAccess.getAggregationKindDeclarationAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:485:3: ( rule__AggregationKindDeclaration__Alternatives )
            // InternalOntoUMLArchive.g:485:4: rule__AggregationKindDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AggregationKindDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAggregationKindDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAggregationKindDeclaration"


    // $ANTLR start "rule__ModelElement__Alternatives_0"
    // InternalOntoUMLArchive.g:493:1: rule__ModelElement__Alternatives_0 : ( ( ruleClass ) | ( ruleRelationship ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:497:1: ( ( ruleClass ) | ( ruleRelationship ) | ( ruleGeneralizationSet ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
            case 36:
                {
                alt2=1;
                }
                break;
            case 19:
            case 29:
            case 32:
            case 33:
                {
                alt2=2;
                }
                break;
            case 35:
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
                    // InternalOntoUMLArchive.g:498:2: ( ruleClass )
                    {
                    // InternalOntoUMLArchive.g:498:2: ( ruleClass )
                    // InternalOntoUMLArchive.g:499:3: ruleClass
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
                    // InternalOntoUMLArchive.g:504:2: ( ruleRelationship )
                    {
                    // InternalOntoUMLArchive.g:504:2: ( ruleRelationship )
                    // InternalOntoUMLArchive.g:505:3: ruleRelationship
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
                    // InternalOntoUMLArchive.g:510:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoUMLArchive.g:510:2: ( ruleGeneralizationSet )
                    // InternalOntoUMLArchive.g:511:3: ruleGeneralizationSet
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
    // InternalOntoUMLArchive.g:520:1: rule__Relationship__Alternatives : ( ( ruleAssociation ) | ( ruleGeneralization ) | ( ruleDependencyLink ) | ( ruleDerivation ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:524:1: ( ( ruleAssociation ) | ( ruleGeneralization ) | ( ruleDependencyLink ) | ( ruleDerivation ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOntoUMLArchive.g:525:2: ( ruleAssociation )
                    {
                    // InternalOntoUMLArchive.g:525:2: ( ruleAssociation )
                    // InternalOntoUMLArchive.g:526:3: ruleAssociation
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
                    // InternalOntoUMLArchive.g:531:2: ( ruleGeneralization )
                    {
                    // InternalOntoUMLArchive.g:531:2: ( ruleGeneralization )
                    // InternalOntoUMLArchive.g:532:3: ruleGeneralization
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
                    // InternalOntoUMLArchive.g:537:2: ( ruleDependencyLink )
                    {
                    // InternalOntoUMLArchive.g:537:2: ( ruleDependencyLink )
                    // InternalOntoUMLArchive.g:538:3: ruleDependencyLink
                    {
                     before(grammarAccess.getRelationshipAccess().getDependencyLinkParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDependencyLink();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getDependencyLinkParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUMLArchive.g:543:2: ( ruleDerivation )
                    {
                    // InternalOntoUMLArchive.g:543:2: ( ruleDerivation )
                    // InternalOntoUMLArchive.g:544:3: ruleDerivation
                    {
                     before(grammarAccess.getRelationshipAccess().getDerivationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDerivation();

                    state._fsp--;

                     after(grammarAccess.getRelationshipAccess().getDerivationParserRuleCall_3()); 

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
    // InternalOntoUMLArchive.g:553:1: rule__Association__Alternatives : ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) );
    public final void rule__Association__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:557:1: ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalOntoUMLArchive.g:558:2: ( ruleBinaryAssociation )
                    {
                    // InternalOntoUMLArchive.g:558:2: ( ruleBinaryAssociation )
                    // InternalOntoUMLArchive.g:559:3: ruleBinaryAssociation
                    {
                     before(grammarAccess.getAssociationAccess().getBinaryAssociationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryAssociation();

                    state._fsp--;

                     after(grammarAccess.getAssociationAccess().getBinaryAssociationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:564:2: ( ruleNaryAssociation )
                    {
                    // InternalOntoUMLArchive.g:564:2: ( ruleNaryAssociation )
                    // InternalOntoUMLArchive.g:565:3: ruleNaryAssociation
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
    // InternalOntoUMLArchive.g:574:1: rule__CARDINALITY__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CARDINALITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:578:1: ( ( '*' ) | ( RULE_INT ) )
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
                    // InternalOntoUMLArchive.g:579:2: ( '*' )
                    {
                    // InternalOntoUMLArchive.g:579:2: ( '*' )
                    // InternalOntoUMLArchive.g:580:3: '*'
                    {
                     before(grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:585:2: ( RULE_INT )
                    {
                    // InternalOntoUMLArchive.g:585:2: ( RULE_INT )
                    // InternalOntoUMLArchive.g:586:3: RULE_INT
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


    // $ANTLR start "rule__AggregationKindDeclaration__Alternatives"
    // InternalOntoUMLArchive.g:595:1: rule__AggregationKindDeclaration__Alternatives : ( ( ( 'shared' ) ) | ( ( 'composite' ) ) );
    public final void rule__AggregationKindDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:599:1: ( ( ( 'shared' ) ) | ( ( 'composite' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUMLArchive.g:600:2: ( ( 'shared' ) )
                    {
                    // InternalOntoUMLArchive.g:600:2: ( ( 'shared' ) )
                    // InternalOntoUMLArchive.g:601:3: ( 'shared' )
                    {
                     before(grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0()); 
                    // InternalOntoUMLArchive.g:602:3: ( 'shared' )
                    // InternalOntoUMLArchive.g:602:4: 'shared'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:606:2: ( ( 'composite' ) )
                    {
                    // InternalOntoUMLArchive.g:606:2: ( ( 'composite' ) )
                    // InternalOntoUMLArchive.g:607:3: ( 'composite' )
                    {
                     before(grammarAccess.getAggregationKindDeclarationAccess().getCompositeEnumLiteralDeclaration_1()); 
                    // InternalOntoUMLArchive.g:608:3: ( 'composite' )
                    // InternalOntoUMLArchive.g:608:4: 'composite'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindDeclarationAccess().getCompositeEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AggregationKindDeclaration__Alternatives"


    // $ANTLR start "rule__ModelElement__Group__0"
    // InternalOntoUMLArchive.g:616:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:620:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalOntoUMLArchive.g:621:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
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
    // InternalOntoUMLArchive.g:628:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:632:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalOntoUMLArchive.g:633:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalOntoUMLArchive.g:633:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalOntoUMLArchive.g:634:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalOntoUMLArchive.g:635:2: ( rule__ModelElement__Alternatives_0 )
            // InternalOntoUMLArchive.g:635:3: rule__ModelElement__Alternatives_0
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
    // InternalOntoUMLArchive.g:643:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:647:1: ( rule__ModelElement__Group__1__Impl )
            // InternalOntoUMLArchive.g:648:2: rule__ModelElement__Group__1__Impl
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
    // InternalOntoUMLArchive.g:654:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:658:1: ( ( ';' ) )
            // InternalOntoUMLArchive.g:659:1: ( ';' )
            {
            // InternalOntoUMLArchive.g:659:1: ( ';' )
            // InternalOntoUMLArchive.g:660:2: ';'
            {
             before(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:670:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:674:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalOntoUMLArchive.g:675:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalOntoUMLArchive.g:682:1: rule__Class__Group__0__Impl : ( ( rule__Class__IsAbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:686:1: ( ( ( rule__Class__IsAbstractAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:687:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:687:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            // InternalOntoUMLArchive.g:688:2: ( rule__Class__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 
            // InternalOntoUMLArchive.g:689:2: ( rule__Class__IsAbstractAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoUMLArchive.g:689:3: rule__Class__IsAbstractAssignment_0
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
    // InternalOntoUMLArchive.g:697:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:701:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalOntoUMLArchive.g:702:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalOntoUMLArchive.g:709:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:713:1: ( ( 'class' ) )
            // InternalOntoUMLArchive.g:714:1: ( 'class' )
            {
            // InternalOntoUMLArchive.g:714:1: ( 'class' )
            // InternalOntoUMLArchive.g:715:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:724:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:728:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalOntoUMLArchive.g:729:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalOntoUMLArchive.g:736:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:740:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalOntoUMLArchive.g:741:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalOntoUMLArchive.g:741:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalOntoUMLArchive.g:742:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalOntoUMLArchive.g:743:2: ( rule__Class__NameAssignment_2 )
            // InternalOntoUMLArchive.g:743:3: rule__Class__NameAssignment_2
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
    // InternalOntoUMLArchive.g:751:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:755:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalOntoUMLArchive.g:756:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

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
    // InternalOntoUMLArchive.g:763:1: rule__Class__Group__3__Impl : ( ( rule__Class__StereotypesAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:767:1: ( ( ( rule__Class__StereotypesAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:768:1: ( ( rule__Class__StereotypesAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:768:1: ( ( rule__Class__StereotypesAssignment_3 )* )
            // InternalOntoUMLArchive.g:769:2: ( rule__Class__StereotypesAssignment_3 )*
            {
             before(grammarAccess.getClassAccess().getStereotypesAssignment_3()); 
            // InternalOntoUMLArchive.g:770:2: ( rule__Class__StereotypesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STEREOTYPE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:770:3: rule__Class__StereotypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Class__StereotypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getStereotypesAssignment_3()); 

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


    // $ANTLR start "rule__Class__Group__4"
    // InternalOntoUMLArchive.g:778:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:782:1: ( rule__Class__Group__4__Impl )
            // InternalOntoUMLArchive.g:783:2: rule__Class__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__4__Impl();

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
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalOntoUMLArchive.g:789:1: rule__Class__Group__4__Impl : ( ( rule__Class__AttributesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:793:1: ( ( ( rule__Class__AttributesAssignment_4 )* ) )
            // InternalOntoUMLArchive.g:794:1: ( ( rule__Class__AttributesAssignment_4 )* )
            {
            // InternalOntoUMLArchive.g:794:1: ( ( rule__Class__AttributesAssignment_4 )* )
            // InternalOntoUMLArchive.g:795:2: ( rule__Class__AttributesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4()); 
            // InternalOntoUMLArchive.g:796:2: ( rule__Class__AttributesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:796:3: rule__Class__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Class__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalOntoUMLArchive.g:805:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:809:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalOntoUMLArchive.g:810:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalOntoUMLArchive.g:817:1: rule__Attribute__Group__0__Impl : ( 'att' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:821:1: ( ( 'att' ) )
            // InternalOntoUMLArchive.g:822:1: ( 'att' )
            {
            // InternalOntoUMLArchive.g:822:1: ( 'att' )
            // InternalOntoUMLArchive.g:823:2: 'att'
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttKeyword_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalOntoUMLArchive.g:832:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:836:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalOntoUMLArchive.g:837:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalOntoUMLArchive.g:844:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:848:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:849:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:849:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalOntoUMLArchive.g:850:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:851:2: ( rule__Attribute__NameAssignment_1 )
            // InternalOntoUMLArchive.g:851:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalOntoUMLArchive.g:859:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:863:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalOntoUMLArchive.g:864:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalOntoUMLArchive.g:871:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__MultiplicityAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:875:1: ( ( ( rule__Attribute__MultiplicityAssignment_2 ) ) )
            // InternalOntoUMLArchive.g:876:1: ( ( rule__Attribute__MultiplicityAssignment_2 ) )
            {
            // InternalOntoUMLArchive.g:876:1: ( ( rule__Attribute__MultiplicityAssignment_2 ) )
            // InternalOntoUMLArchive.g:877:2: ( rule__Attribute__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2()); 
            // InternalOntoUMLArchive.g:878:2: ( rule__Attribute__MultiplicityAssignment_2 )
            // InternalOntoUMLArchive.g:878:3: rule__Attribute__MultiplicityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__MultiplicityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalOntoUMLArchive.g:886:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:890:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalOntoUMLArchive.g:891:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalOntoUMLArchive.g:898:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:902:1: ( ( ':' ) )
            // InternalOntoUMLArchive.g:903:1: ( ':' )
            {
            // InternalOntoUMLArchive.g:903:1: ( ':' )
            // InternalOntoUMLArchive.g:904:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalOntoUMLArchive.g:913:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:917:1: ( rule__Attribute__Group__4__Impl )
            // InternalOntoUMLArchive.g:918:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4__Impl();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalOntoUMLArchive.g:924:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__AttTypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:928:1: ( ( ( rule__Attribute__AttTypeAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:929:1: ( ( rule__Attribute__AttTypeAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:929:1: ( ( rule__Attribute__AttTypeAssignment_4 ) )
            // InternalOntoUMLArchive.g:930:2: ( rule__Attribute__AttTypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAssignment_4()); 
            // InternalOntoUMLArchive.g:931:2: ( rule__Attribute__AttTypeAssignment_4 )
            // InternalOntoUMLArchive.g:931:3: rule__Attribute__AttTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttTypeAssignment_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__BinaryAssociation__Group__0"
    // InternalOntoUMLArchive.g:940:1: rule__BinaryAssociation__Group__0 : rule__BinaryAssociation__Group__0__Impl rule__BinaryAssociation__Group__1 ;
    public final void rule__BinaryAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:944:1: ( rule__BinaryAssociation__Group__0__Impl rule__BinaryAssociation__Group__1 )
            // InternalOntoUMLArchive.g:945:2: rule__BinaryAssociation__Group__0__Impl rule__BinaryAssociation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__BinaryAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__Group__1();

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
    // $ANTLR end "rule__BinaryAssociation__Group__0"


    // $ANTLR start "rule__BinaryAssociation__Group__0__Impl"
    // InternalOntoUMLArchive.g:952:1: rule__BinaryAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__BinaryAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:956:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:957:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:957:1: ( 'association' )
            // InternalOntoUMLArchive.g:958:2: 'association'
            {
             before(grammarAccess.getBinaryAssociationAccess().getAssociationKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBinaryAssociationAccess().getAssociationKeyword_0()); 

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
    // $ANTLR end "rule__BinaryAssociation__Group__0__Impl"


    // $ANTLR start "rule__BinaryAssociation__Group__1"
    // InternalOntoUMLArchive.g:967:1: rule__BinaryAssociation__Group__1 : rule__BinaryAssociation__Group__1__Impl rule__BinaryAssociation__Group__2 ;
    public final void rule__BinaryAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:971:1: ( rule__BinaryAssociation__Group__1__Impl rule__BinaryAssociation__Group__2 )
            // InternalOntoUMLArchive.g:972:2: rule__BinaryAssociation__Group__1__Impl rule__BinaryAssociation__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__BinaryAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__Group__2();

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
    // $ANTLR end "rule__BinaryAssociation__Group__1"


    // $ANTLR start "rule__BinaryAssociation__Group__1__Impl"
    // InternalOntoUMLArchive.g:979:1: rule__BinaryAssociation__Group__1__Impl : ( ( rule__BinaryAssociation__NameAssignment_1 )? ) ;
    public final void rule__BinaryAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:983:1: ( ( ( rule__BinaryAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:984:1: ( ( rule__BinaryAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:984:1: ( ( rule__BinaryAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:985:2: ( rule__BinaryAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getBinaryAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:986:2: ( rule__BinaryAssociation__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUMLArchive.g:986:3: rule__BinaryAssociation__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryAssociation__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryAssociationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BinaryAssociation__Group__1__Impl"


    // $ANTLR start "rule__BinaryAssociation__Group__2"
    // InternalOntoUMLArchive.g:994:1: rule__BinaryAssociation__Group__2 : rule__BinaryAssociation__Group__2__Impl rule__BinaryAssociation__Group__3 ;
    public final void rule__BinaryAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:998:1: ( rule__BinaryAssociation__Group__2__Impl rule__BinaryAssociation__Group__3 )
            // InternalOntoUMLArchive.g:999:2: rule__BinaryAssociation__Group__2__Impl rule__BinaryAssociation__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__BinaryAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__Group__3();

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
    // $ANTLR end "rule__BinaryAssociation__Group__2"


    // $ANTLR start "rule__BinaryAssociation__Group__2__Impl"
    // InternalOntoUMLArchive.g:1006:1: rule__BinaryAssociation__Group__2__Impl : ( ( rule__BinaryAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__BinaryAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1010:1: ( ( ( rule__BinaryAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1011:1: ( ( rule__BinaryAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1011:1: ( ( rule__BinaryAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1012:2: ( rule__BinaryAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getBinaryAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1013:2: ( rule__BinaryAssociation__StereotypesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STEREOTYPE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1013:3: rule__BinaryAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BinaryAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBinaryAssociationAccess().getStereotypesAssignment_2()); 

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
    // $ANTLR end "rule__BinaryAssociation__Group__2__Impl"


    // $ANTLR start "rule__BinaryAssociation__Group__3"
    // InternalOntoUMLArchive.g:1021:1: rule__BinaryAssociation__Group__3 : rule__BinaryAssociation__Group__3__Impl rule__BinaryAssociation__Group__4 ;
    public final void rule__BinaryAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1025:1: ( rule__BinaryAssociation__Group__3__Impl rule__BinaryAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1026:2: rule__BinaryAssociation__Group__3__Impl rule__BinaryAssociation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__BinaryAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__Group__4();

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
    // $ANTLR end "rule__BinaryAssociation__Group__3"


    // $ANTLR start "rule__BinaryAssociation__Group__3__Impl"
    // InternalOntoUMLArchive.g:1033:1: rule__BinaryAssociation__Group__3__Impl : ( 'from' ) ;
    public final void rule__BinaryAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1037:1: ( ( 'from' ) )
            // InternalOntoUMLArchive.g:1038:1: ( 'from' )
            {
            // InternalOntoUMLArchive.g:1038:1: ( 'from' )
            // InternalOntoUMLArchive.g:1039:2: 'from'
            {
             before(grammarAccess.getBinaryAssociationAccess().getFromKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBinaryAssociationAccess().getFromKeyword_3()); 

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
    // $ANTLR end "rule__BinaryAssociation__Group__3__Impl"


    // $ANTLR start "rule__BinaryAssociation__Group__4"
    // InternalOntoUMLArchive.g:1048:1: rule__BinaryAssociation__Group__4 : rule__BinaryAssociation__Group__4__Impl rule__BinaryAssociation__Group__5 ;
    public final void rule__BinaryAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1052:1: ( rule__BinaryAssociation__Group__4__Impl rule__BinaryAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1053:2: rule__BinaryAssociation__Group__4__Impl rule__BinaryAssociation__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__BinaryAssociation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__Group__5();

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
    // $ANTLR end "rule__BinaryAssociation__Group__4"


    // $ANTLR start "rule__BinaryAssociation__Group__4__Impl"
    // InternalOntoUMLArchive.g:1060:1: rule__BinaryAssociation__Group__4__Impl : ( ( rule__BinaryAssociation__FromAssignment_4 ) ) ;
    public final void rule__BinaryAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1064:1: ( ( ( rule__BinaryAssociation__FromAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:1065:1: ( ( rule__BinaryAssociation__FromAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:1065:1: ( ( rule__BinaryAssociation__FromAssignment_4 ) )
            // InternalOntoUMLArchive.g:1066:2: ( rule__BinaryAssociation__FromAssignment_4 )
            {
             before(grammarAccess.getBinaryAssociationAccess().getFromAssignment_4()); 
            // InternalOntoUMLArchive.g:1067:2: ( rule__BinaryAssociation__FromAssignment_4 )
            // InternalOntoUMLArchive.g:1067:3: rule__BinaryAssociation__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAssociationAccess().getFromAssignment_4()); 

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
    // $ANTLR end "rule__BinaryAssociation__Group__4__Impl"


    // $ANTLR start "rule__BinaryAssociation__Group__5"
    // InternalOntoUMLArchive.g:1075:1: rule__BinaryAssociation__Group__5 : rule__BinaryAssociation__Group__5__Impl rule__BinaryAssociation__Group__6 ;
    public final void rule__BinaryAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1079:1: ( rule__BinaryAssociation__Group__5__Impl rule__BinaryAssociation__Group__6 )
            // InternalOntoUMLArchive.g:1080:2: rule__BinaryAssociation__Group__5__Impl rule__BinaryAssociation__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__BinaryAssociation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__Group__6();

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
    // $ANTLR end "rule__BinaryAssociation__Group__5"


    // $ANTLR start "rule__BinaryAssociation__Group__5__Impl"
    // InternalOntoUMLArchive.g:1087:1: rule__BinaryAssociation__Group__5__Impl : ( 'to' ) ;
    public final void rule__BinaryAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1091:1: ( ( 'to' ) )
            // InternalOntoUMLArchive.g:1092:1: ( 'to' )
            {
            // InternalOntoUMLArchive.g:1092:1: ( 'to' )
            // InternalOntoUMLArchive.g:1093:2: 'to'
            {
             before(grammarAccess.getBinaryAssociationAccess().getToKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBinaryAssociationAccess().getToKeyword_5()); 

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
    // $ANTLR end "rule__BinaryAssociation__Group__5__Impl"


    // $ANTLR start "rule__BinaryAssociation__Group__6"
    // InternalOntoUMLArchive.g:1102:1: rule__BinaryAssociation__Group__6 : rule__BinaryAssociation__Group__6__Impl ;
    public final void rule__BinaryAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1106:1: ( rule__BinaryAssociation__Group__6__Impl )
            // InternalOntoUMLArchive.g:1107:2: rule__BinaryAssociation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__Group__6__Impl();

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
    // $ANTLR end "rule__BinaryAssociation__Group__6"


    // $ANTLR start "rule__BinaryAssociation__Group__6__Impl"
    // InternalOntoUMLArchive.g:1113:1: rule__BinaryAssociation__Group__6__Impl : ( ( rule__BinaryAssociation__ToAssignment_6 ) ) ;
    public final void rule__BinaryAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1117:1: ( ( ( rule__BinaryAssociation__ToAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:1118:1: ( ( rule__BinaryAssociation__ToAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:1118:1: ( ( rule__BinaryAssociation__ToAssignment_6 ) )
            // InternalOntoUMLArchive.g:1119:2: ( rule__BinaryAssociation__ToAssignment_6 )
            {
             before(grammarAccess.getBinaryAssociationAccess().getToAssignment_6()); 
            // InternalOntoUMLArchive.g:1120:2: ( rule__BinaryAssociation__ToAssignment_6 )
            // InternalOntoUMLArchive.g:1120:3: rule__BinaryAssociation__ToAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__ToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAssociationAccess().getToAssignment_6()); 

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
    // $ANTLR end "rule__BinaryAssociation__Group__6__Impl"


    // $ANTLR start "rule__NaryAssociation__Group__0"
    // InternalOntoUMLArchive.g:1129:1: rule__NaryAssociation__Group__0 : rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1 ;
    public final void rule__NaryAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1133:1: ( rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1 )
            // InternalOntoUMLArchive.g:1134:2: rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:1141:1: rule__NaryAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__NaryAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1145:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:1146:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:1146:1: ( 'association' )
            // InternalOntoUMLArchive.g:1147:2: 'association'
            {
             before(grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1156:1: rule__NaryAssociation__Group__1 : rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2 ;
    public final void rule__NaryAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1160:1: ( rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2 )
            // InternalOntoUMLArchive.g:1161:2: rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:1168:1: rule__NaryAssociation__Group__1__Impl : ( ( rule__NaryAssociation__NameAssignment_1 )? ) ;
    public final void rule__NaryAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1172:1: ( ( ( rule__NaryAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1173:1: ( ( rule__NaryAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1173:1: ( ( rule__NaryAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1174:2: ( rule__NaryAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getNaryAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1175:2: ( rule__NaryAssociation__NameAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoUMLArchive.g:1175:3: rule__NaryAssociation__NameAssignment_1
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
    // InternalOntoUMLArchive.g:1183:1: rule__NaryAssociation__Group__2 : rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3 ;
    public final void rule__NaryAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1187:1: ( rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3 )
            // InternalOntoUMLArchive.g:1188:2: rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:1195:1: rule__NaryAssociation__Group__2__Impl : ( ( rule__NaryAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__NaryAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1199:1: ( ( ( rule__NaryAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1200:1: ( ( rule__NaryAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1200:1: ( ( rule__NaryAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1201:2: ( rule__NaryAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getNaryAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1202:2: ( rule__NaryAssociation__StereotypesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STEREOTYPE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1202:3: rule__NaryAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NaryAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getNaryAssociationAccess().getStereotypesAssignment_2()); 

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
    // InternalOntoUMLArchive.g:1210:1: rule__NaryAssociation__Group__3 : rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4 ;
    public final void rule__NaryAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1214:1: ( rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1215:2: rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoUMLArchive.g:1222:1: rule__NaryAssociation__Group__3__Impl : ( ( rule__NaryAssociation__Group_3__0 ) ) ;
    public final void rule__NaryAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1226:1: ( ( ( rule__NaryAssociation__Group_3__0 ) ) )
            // InternalOntoUMLArchive.g:1227:1: ( ( rule__NaryAssociation__Group_3__0 ) )
            {
            // InternalOntoUMLArchive.g:1227:1: ( ( rule__NaryAssociation__Group_3__0 ) )
            // InternalOntoUMLArchive.g:1228:2: ( rule__NaryAssociation__Group_3__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_3()); 
            // InternalOntoUMLArchive.g:1229:2: ( rule__NaryAssociation__Group_3__0 )
            // InternalOntoUMLArchive.g:1229:3: rule__NaryAssociation__Group_3__0
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
    // InternalOntoUMLArchive.g:1237:1: rule__NaryAssociation__Group__4 : rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5 ;
    public final void rule__NaryAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1241:1: ( rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1242:2: rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoUMLArchive.g:1249:1: rule__NaryAssociation__Group__4__Impl : ( ( rule__NaryAssociation__Group_4__0 ) ) ;
    public final void rule__NaryAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1253:1: ( ( ( rule__NaryAssociation__Group_4__0 ) ) )
            // InternalOntoUMLArchive.g:1254:1: ( ( rule__NaryAssociation__Group_4__0 ) )
            {
            // InternalOntoUMLArchive.g:1254:1: ( ( rule__NaryAssociation__Group_4__0 ) )
            // InternalOntoUMLArchive.g:1255:2: ( rule__NaryAssociation__Group_4__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_4()); 
            // InternalOntoUMLArchive.g:1256:2: ( rule__NaryAssociation__Group_4__0 )
            // InternalOntoUMLArchive.g:1256:3: rule__NaryAssociation__Group_4__0
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
    // InternalOntoUMLArchive.g:1264:1: rule__NaryAssociation__Group__5 : rule__NaryAssociation__Group__5__Impl ;
    public final void rule__NaryAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1268:1: ( rule__NaryAssociation__Group__5__Impl )
            // InternalOntoUMLArchive.g:1269:2: rule__NaryAssociation__Group__5__Impl
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
    // InternalOntoUMLArchive.g:1275:1: rule__NaryAssociation__Group__5__Impl : ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) ) ;
    public final void rule__NaryAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1279:1: ( ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) ) )
            // InternalOntoUMLArchive.g:1280:1: ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) )
            {
            // InternalOntoUMLArchive.g:1280:1: ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) )
            // InternalOntoUMLArchive.g:1281:2: ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* )
            {
            // InternalOntoUMLArchive.g:1281:2: ( ( rule__NaryAssociation__Group_5__0 ) )
            // InternalOntoUMLArchive.g:1282:3: ( rule__NaryAssociation__Group_5__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1283:3: ( rule__NaryAssociation__Group_5__0 )
            // InternalOntoUMLArchive.g:1283:4: rule__NaryAssociation__Group_5__0
            {
            pushFollow(FOLLOW_17);
            rule__NaryAssociation__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getGroup_5()); 

            }

            // InternalOntoUMLArchive.g:1286:2: ( ( rule__NaryAssociation__Group_5__0 )* )
            // InternalOntoUMLArchive.g:1287:3: ( rule__NaryAssociation__Group_5__0 )*
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1288:3: ( rule__NaryAssociation__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1288:4: rule__NaryAssociation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__NaryAssociation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalOntoUMLArchive.g:1298:1: rule__NaryAssociation__Group_3__0 : rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1 ;
    public final void rule__NaryAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1302:1: ( rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1 )
            // InternalOntoUMLArchive.g:1303:2: rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1310:1: rule__NaryAssociation__Group_3__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1314:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1315:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1315:1: ( 'end' )
            // InternalOntoUMLArchive.g:1316:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1325:1: rule__NaryAssociation__Group_3__1 : rule__NaryAssociation__Group_3__1__Impl ;
    public final void rule__NaryAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1329:1: ( rule__NaryAssociation__Group_3__1__Impl )
            // InternalOntoUMLArchive.g:1330:2: rule__NaryAssociation__Group_3__1__Impl
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
    // InternalOntoUMLArchive.g:1336:1: rule__NaryAssociation__Group_3__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_3_1 ) ) ;
    public final void rule__NaryAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1340:1: ( ( ( rule__NaryAssociation__EndsAssignment_3_1 ) ) )
            // InternalOntoUMLArchive.g:1341:1: ( ( rule__NaryAssociation__EndsAssignment_3_1 ) )
            {
            // InternalOntoUMLArchive.g:1341:1: ( ( rule__NaryAssociation__EndsAssignment_3_1 ) )
            // InternalOntoUMLArchive.g:1342:2: ( rule__NaryAssociation__EndsAssignment_3_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_3_1()); 
            // InternalOntoUMLArchive.g:1343:2: ( rule__NaryAssociation__EndsAssignment_3_1 )
            // InternalOntoUMLArchive.g:1343:3: rule__NaryAssociation__EndsAssignment_3_1
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
    // InternalOntoUMLArchive.g:1352:1: rule__NaryAssociation__Group_4__0 : rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1 ;
    public final void rule__NaryAssociation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1356:1: ( rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1 )
            // InternalOntoUMLArchive.g:1357:2: rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1364:1: rule__NaryAssociation__Group_4__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1368:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1369:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1369:1: ( 'end' )
            // InternalOntoUMLArchive.g:1370:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1379:1: rule__NaryAssociation__Group_4__1 : rule__NaryAssociation__Group_4__1__Impl ;
    public final void rule__NaryAssociation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1383:1: ( rule__NaryAssociation__Group_4__1__Impl )
            // InternalOntoUMLArchive.g:1384:2: rule__NaryAssociation__Group_4__1__Impl
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
    // InternalOntoUMLArchive.g:1390:1: rule__NaryAssociation__Group_4__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_4_1 ) ) ;
    public final void rule__NaryAssociation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1394:1: ( ( ( rule__NaryAssociation__EndsAssignment_4_1 ) ) )
            // InternalOntoUMLArchive.g:1395:1: ( ( rule__NaryAssociation__EndsAssignment_4_1 ) )
            {
            // InternalOntoUMLArchive.g:1395:1: ( ( rule__NaryAssociation__EndsAssignment_4_1 ) )
            // InternalOntoUMLArchive.g:1396:2: ( rule__NaryAssociation__EndsAssignment_4_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_4_1()); 
            // InternalOntoUMLArchive.g:1397:2: ( rule__NaryAssociation__EndsAssignment_4_1 )
            // InternalOntoUMLArchive.g:1397:3: rule__NaryAssociation__EndsAssignment_4_1
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
    // InternalOntoUMLArchive.g:1406:1: rule__NaryAssociation__Group_5__0 : rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1 ;
    public final void rule__NaryAssociation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1410:1: ( rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1 )
            // InternalOntoUMLArchive.g:1411:2: rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1418:1: rule__NaryAssociation__Group_5__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1422:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1423:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1423:1: ( 'end' )
            // InternalOntoUMLArchive.g:1424:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1433:1: rule__NaryAssociation__Group_5__1 : rule__NaryAssociation__Group_5__1__Impl ;
    public final void rule__NaryAssociation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1437:1: ( rule__NaryAssociation__Group_5__1__Impl )
            // InternalOntoUMLArchive.g:1438:2: rule__NaryAssociation__Group_5__1__Impl
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
    // InternalOntoUMLArchive.g:1444:1: rule__NaryAssociation__Group_5__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_5_1 ) ) ;
    public final void rule__NaryAssociation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1448:1: ( ( ( rule__NaryAssociation__EndsAssignment_5_1 ) ) )
            // InternalOntoUMLArchive.g:1449:1: ( ( rule__NaryAssociation__EndsAssignment_5_1 ) )
            {
            // InternalOntoUMLArchive.g:1449:1: ( ( rule__NaryAssociation__EndsAssignment_5_1 ) )
            // InternalOntoUMLArchive.g:1450:2: ( rule__NaryAssociation__EndsAssignment_5_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_5_1()); 
            // InternalOntoUMLArchive.g:1451:2: ( rule__NaryAssociation__EndsAssignment_5_1 )
            // InternalOntoUMLArchive.g:1451:3: rule__NaryAssociation__EndsAssignment_5_1
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
    // InternalOntoUMLArchive.g:1460:1: rule__AssociationEnd__Group__0 : rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 ;
    public final void rule__AssociationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1464:1: ( rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 )
            // InternalOntoUMLArchive.g:1465:2: rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1472:1: rule__AssociationEnd__Group__0__Impl : ( ( rule__AssociationEnd__AggregationKindAssignment_0 )? ) ;
    public final void rule__AssociationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1476:1: ( ( ( rule__AssociationEnd__AggregationKindAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:1477:1: ( ( rule__AssociationEnd__AggregationKindAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:1477:1: ( ( rule__AssociationEnd__AggregationKindAssignment_0 )? )
            // InternalOntoUMLArchive.g:1478:2: ( rule__AssociationEnd__AggregationKindAssignment_0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getAggregationKindAssignment_0()); 
            // InternalOntoUMLArchive.g:1479:2: ( rule__AssociationEnd__AggregationKindAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=13 && LA15_0<=14)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntoUMLArchive.g:1479:3: rule__AssociationEnd__AggregationKindAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__AggregationKindAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationEndAccess().getAggregationKindAssignment_0()); 

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
    // InternalOntoUMLArchive.g:1487:1: rule__AssociationEnd__Group__1 : rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 ;
    public final void rule__AssociationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1491:1: ( rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 )
            // InternalOntoUMLArchive.g:1492:2: rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1499:1: rule__AssociationEnd__Group__1__Impl : ( ( rule__AssociationEnd__NameAssignment_1 )? ) ;
    public final void rule__AssociationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1503:1: ( ( ( rule__AssociationEnd__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1504:1: ( ( rule__AssociationEnd__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1504:1: ( ( rule__AssociationEnd__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1505:2: ( rule__AssociationEnd__NameAssignment_1 )?
            {
             before(grammarAccess.getAssociationEndAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1506:2: ( rule__AssociationEnd__NameAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoUMLArchive.g:1506:3: rule__AssociationEnd__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationEndAccess().getNameAssignment_1()); 

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
    // InternalOntoUMLArchive.g:1514:1: rule__AssociationEnd__Group__2 : rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 ;
    public final void rule__AssociationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1518:1: ( rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 )
            // InternalOntoUMLArchive.g:1519:2: rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalOntoUMLArchive.g:1526:1: rule__AssociationEnd__Group__2__Impl : ( ( rule__AssociationEnd__MultiplicityAssignment_2 ) ) ;
    public final void rule__AssociationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1530:1: ( ( ( rule__AssociationEnd__MultiplicityAssignment_2 ) ) )
            // InternalOntoUMLArchive.g:1531:1: ( ( rule__AssociationEnd__MultiplicityAssignment_2 ) )
            {
            // InternalOntoUMLArchive.g:1531:1: ( ( rule__AssociationEnd__MultiplicityAssignment_2 ) )
            // InternalOntoUMLArchive.g:1532:2: ( rule__AssociationEnd__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getAssociationEndAccess().getMultiplicityAssignment_2()); 
            // InternalOntoUMLArchive.g:1533:2: ( rule__AssociationEnd__MultiplicityAssignment_2 )
            // InternalOntoUMLArchive.g:1533:3: rule__AssociationEnd__MultiplicityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__MultiplicityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getMultiplicityAssignment_2()); 

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
    // InternalOntoUMLArchive.g:1541:1: rule__AssociationEnd__Group__3 : rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 ;
    public final void rule__AssociationEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1545:1: ( rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 )
            // InternalOntoUMLArchive.g:1546:2: rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AssociationEnd__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__4();

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
    // InternalOntoUMLArchive.g:1553:1: rule__AssociationEnd__Group__3__Impl : ( ':' ) ;
    public final void rule__AssociationEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1557:1: ( ( ':' ) )
            // InternalOntoUMLArchive.g:1558:1: ( ':' )
            {
            // InternalOntoUMLArchive.g:1558:1: ( ':' )
            // InternalOntoUMLArchive.g:1559:2: ':'
            {
             before(grammarAccess.getAssociationEndAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getColonKeyword_3()); 

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


    // $ANTLR start "rule__AssociationEnd__Group__4"
    // InternalOntoUMLArchive.g:1568:1: rule__AssociationEnd__Group__4 : rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 ;
    public final void rule__AssociationEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1572:1: ( rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 )
            // InternalOntoUMLArchive.g:1573:2: rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__AssociationEnd__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__5();

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
    // $ANTLR end "rule__AssociationEnd__Group__4"


    // $ANTLR start "rule__AssociationEnd__Group__4__Impl"
    // InternalOntoUMLArchive.g:1580:1: rule__AssociationEnd__Group__4__Impl : ( ( rule__AssociationEnd__EndTypeAssignment_4 ) ) ;
    public final void rule__AssociationEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1584:1: ( ( ( rule__AssociationEnd__EndTypeAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:1585:1: ( ( rule__AssociationEnd__EndTypeAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:1585:1: ( ( rule__AssociationEnd__EndTypeAssignment_4 ) )
            // InternalOntoUMLArchive.g:1586:2: ( rule__AssociationEnd__EndTypeAssignment_4 )
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeAssignment_4()); 
            // InternalOntoUMLArchive.g:1587:2: ( rule__AssociationEnd__EndTypeAssignment_4 )
            // InternalOntoUMLArchive.g:1587:3: rule__AssociationEnd__EndTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__EndTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getEndTypeAssignment_4()); 

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
    // $ANTLR end "rule__AssociationEnd__Group__4__Impl"


    // $ANTLR start "rule__AssociationEnd__Group__5"
    // InternalOntoUMLArchive.g:1595:1: rule__AssociationEnd__Group__5 : rule__AssociationEnd__Group__5__Impl ;
    public final void rule__AssociationEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1599:1: ( rule__AssociationEnd__Group__5__Impl )
            // InternalOntoUMLArchive.g:1600:2: rule__AssociationEnd__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__5__Impl();

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
    // $ANTLR end "rule__AssociationEnd__Group__5"


    // $ANTLR start "rule__AssociationEnd__Group__5__Impl"
    // InternalOntoUMLArchive.g:1606:1: rule__AssociationEnd__Group__5__Impl : ( ( rule__AssociationEnd__Group_5__0 )? ) ;
    public final void rule__AssociationEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1610:1: ( ( ( rule__AssociationEnd__Group_5__0 )? ) )
            // InternalOntoUMLArchive.g:1611:1: ( ( rule__AssociationEnd__Group_5__0 )? )
            {
            // InternalOntoUMLArchive.g:1611:1: ( ( rule__AssociationEnd__Group_5__0 )? )
            // InternalOntoUMLArchive.g:1612:2: ( rule__AssociationEnd__Group_5__0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1613:2: ( rule__AssociationEnd__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOntoUMLArchive.g:1613:3: rule__AssociationEnd__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationEndAccess().getGroup_5()); 

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
    // $ANTLR end "rule__AssociationEnd__Group__5__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_5__0"
    // InternalOntoUMLArchive.g:1622:1: rule__AssociationEnd__Group_5__0 : rule__AssociationEnd__Group_5__0__Impl rule__AssociationEnd__Group_5__1 ;
    public final void rule__AssociationEnd__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1626:1: ( rule__AssociationEnd__Group_5__0__Impl rule__AssociationEnd__Group_5__1 )
            // InternalOntoUMLArchive.g:1627:2: rule__AssociationEnd__Group_5__0__Impl rule__AssociationEnd__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__AssociationEnd__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_5__1();

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
    // $ANTLR end "rule__AssociationEnd__Group_5__0"


    // $ANTLR start "rule__AssociationEnd__Group_5__0__Impl"
    // InternalOntoUMLArchive.g:1634:1: rule__AssociationEnd__Group_5__0__Impl : ( '{' ) ;
    public final void rule__AssociationEnd__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1638:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:1639:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:1639:1: ( '{' )
            // InternalOntoUMLArchive.g:1640:2: '{'
            {
             before(grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_5_0()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_5__0__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_5__1"
    // InternalOntoUMLArchive.g:1649:1: rule__AssociationEnd__Group_5__1 : rule__AssociationEnd__Group_5__1__Impl rule__AssociationEnd__Group_5__2 ;
    public final void rule__AssociationEnd__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1653:1: ( rule__AssociationEnd__Group_5__1__Impl rule__AssociationEnd__Group_5__2 )
            // InternalOntoUMLArchive.g:1654:2: rule__AssociationEnd__Group_5__1__Impl rule__AssociationEnd__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__AssociationEnd__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_5__2();

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
    // $ANTLR end "rule__AssociationEnd__Group_5__1"


    // $ANTLR start "rule__AssociationEnd__Group_5__1__Impl"
    // InternalOntoUMLArchive.g:1661:1: rule__AssociationEnd__Group_5__1__Impl : ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) ) ;
    public final void rule__AssociationEnd__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1665:1: ( ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) ) )
            // InternalOntoUMLArchive.g:1666:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) )
            {
            // InternalOntoUMLArchive.g:1666:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) )
            // InternalOntoUMLArchive.g:1667:2: ( rule__AssociationEnd__ConstraintsAssignment_5_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_5_1()); 
            // InternalOntoUMLArchive.g:1668:2: ( rule__AssociationEnd__ConstraintsAssignment_5_1 )
            // InternalOntoUMLArchive.g:1668:3: rule__AssociationEnd__ConstraintsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__ConstraintsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_5_1()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_5__1__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_5__2"
    // InternalOntoUMLArchive.g:1676:1: rule__AssociationEnd__Group_5__2 : rule__AssociationEnd__Group_5__2__Impl rule__AssociationEnd__Group_5__3 ;
    public final void rule__AssociationEnd__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1680:1: ( rule__AssociationEnd__Group_5__2__Impl rule__AssociationEnd__Group_5__3 )
            // InternalOntoUMLArchive.g:1681:2: rule__AssociationEnd__Group_5__2__Impl rule__AssociationEnd__Group_5__3
            {
            pushFollow(FOLLOW_19);
            rule__AssociationEnd__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_5__3();

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
    // $ANTLR end "rule__AssociationEnd__Group_5__2"


    // $ANTLR start "rule__AssociationEnd__Group_5__2__Impl"
    // InternalOntoUMLArchive.g:1688:1: rule__AssociationEnd__Group_5__2__Impl : ( ( rule__AssociationEnd__Group_5_2__0 )* ) ;
    public final void rule__AssociationEnd__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1692:1: ( ( ( rule__AssociationEnd__Group_5_2__0 )* ) )
            // InternalOntoUMLArchive.g:1693:1: ( ( rule__AssociationEnd__Group_5_2__0 )* )
            {
            // InternalOntoUMLArchive.g:1693:1: ( ( rule__AssociationEnd__Group_5_2__0 )* )
            // InternalOntoUMLArchive.g:1694:2: ( rule__AssociationEnd__Group_5_2__0 )*
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_5_2()); 
            // InternalOntoUMLArchive.g:1695:2: ( rule__AssociationEnd__Group_5_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1695:3: rule__AssociationEnd__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__AssociationEnd__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAssociationEndAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_5__2__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_5__3"
    // InternalOntoUMLArchive.g:1703:1: rule__AssociationEnd__Group_5__3 : rule__AssociationEnd__Group_5__3__Impl ;
    public final void rule__AssociationEnd__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1707:1: ( rule__AssociationEnd__Group_5__3__Impl )
            // InternalOntoUMLArchive.g:1708:2: rule__AssociationEnd__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_5__3__Impl();

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
    // $ANTLR end "rule__AssociationEnd__Group_5__3"


    // $ANTLR start "rule__AssociationEnd__Group_5__3__Impl"
    // InternalOntoUMLArchive.g:1714:1: rule__AssociationEnd__Group_5__3__Impl : ( '}' ) ;
    public final void rule__AssociationEnd__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1718:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:1719:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:1719:1: ( '}' )
            // InternalOntoUMLArchive.g:1720:2: '}'
            {
             before(grammarAccess.getAssociationEndAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getRightCurlyBracketKeyword_5_3()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_5__3__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_5_2__0"
    // InternalOntoUMLArchive.g:1730:1: rule__AssociationEnd__Group_5_2__0 : rule__AssociationEnd__Group_5_2__0__Impl rule__AssociationEnd__Group_5_2__1 ;
    public final void rule__AssociationEnd__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1734:1: ( rule__AssociationEnd__Group_5_2__0__Impl rule__AssociationEnd__Group_5_2__1 )
            // InternalOntoUMLArchive.g:1735:2: rule__AssociationEnd__Group_5_2__0__Impl rule__AssociationEnd__Group_5_2__1
            {
            pushFollow(FOLLOW_6);
            rule__AssociationEnd__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_5_2__1();

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
    // $ANTLR end "rule__AssociationEnd__Group_5_2__0"


    // $ANTLR start "rule__AssociationEnd__Group_5_2__0__Impl"
    // InternalOntoUMLArchive.g:1742:1: rule__AssociationEnd__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationEnd__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1746:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:1747:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:1747:1: ( ',' )
            // InternalOntoUMLArchive.g:1748:2: ','
            {
             before(grammarAccess.getAssociationEndAccess().getCommaKeyword_5_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_5_2__0__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_5_2__1"
    // InternalOntoUMLArchive.g:1757:1: rule__AssociationEnd__Group_5_2__1 : rule__AssociationEnd__Group_5_2__1__Impl ;
    public final void rule__AssociationEnd__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1761:1: ( rule__AssociationEnd__Group_5_2__1__Impl )
            // InternalOntoUMLArchive.g:1762:2: rule__AssociationEnd__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__AssociationEnd__Group_5_2__1"


    // $ANTLR start "rule__AssociationEnd__Group_5_2__1__Impl"
    // InternalOntoUMLArchive.g:1768:1: rule__AssociationEnd__Group_5_2__1__Impl : ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) ) ;
    public final void rule__AssociationEnd__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1772:1: ( ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) ) )
            // InternalOntoUMLArchive.g:1773:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) )
            {
            // InternalOntoUMLArchive.g:1773:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) )
            // InternalOntoUMLArchive.g:1774:2: ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_5_2_1()); 
            // InternalOntoUMLArchive.g:1775:2: ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 )
            // InternalOntoUMLArchive.g:1775:3: rule__AssociationEnd__ConstraintsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__ConstraintsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_5_2_1()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_5_2__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group__0"
    // InternalOntoUMLArchive.g:1784:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1788:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // InternalOntoUMLArchive.g:1789:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalOntoUMLArchive.g:1796:1: rule__Multiplicity__Group__0__Impl : ( '[' ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1800:1: ( ( '[' ) )
            // InternalOntoUMLArchive.g:1801:1: ( '[' )
            {
            // InternalOntoUMLArchive.g:1801:1: ( '[' )
            // InternalOntoUMLArchive.g:1802:2: '['
            {
             before(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1811:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1815:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // InternalOntoUMLArchive.g:1816:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalOntoUMLArchive.g:1823:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__LowerAssignment_1 ) ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1827:1: ( ( ( rule__Multiplicity__LowerAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:1828:1: ( ( rule__Multiplicity__LowerAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:1828:1: ( ( rule__Multiplicity__LowerAssignment_1 ) )
            // InternalOntoUMLArchive.g:1829:2: ( rule__Multiplicity__LowerAssignment_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getLowerAssignment_1()); 
            // InternalOntoUMLArchive.g:1830:2: ( rule__Multiplicity__LowerAssignment_1 )
            // InternalOntoUMLArchive.g:1830:3: rule__Multiplicity__LowerAssignment_1
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
    // InternalOntoUMLArchive.g:1838:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1842:1: ( rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 )
            // InternalOntoUMLArchive.g:1843:2: rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalOntoUMLArchive.g:1850:1: rule__Multiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1854:1: ( ( '..' ) )
            // InternalOntoUMLArchive.g:1855:1: ( '..' )
            {
            // InternalOntoUMLArchive.g:1855:1: ( '..' )
            // InternalOntoUMLArchive.g:1856:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1865:1: rule__Multiplicity__Group__3 : rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 ;
    public final void rule__Multiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1869:1: ( rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 )
            // InternalOntoUMLArchive.g:1870:2: rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalOntoUMLArchive.g:1877:1: rule__Multiplicity__Group__3__Impl : ( ( rule__Multiplicity__UpperAssignment_3 ) ) ;
    public final void rule__Multiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1881:1: ( ( ( rule__Multiplicity__UpperAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:1882:1: ( ( rule__Multiplicity__UpperAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:1882:1: ( ( rule__Multiplicity__UpperAssignment_3 ) )
            // InternalOntoUMLArchive.g:1883:2: ( rule__Multiplicity__UpperAssignment_3 )
            {
             before(grammarAccess.getMultiplicityAccess().getUpperAssignment_3()); 
            // InternalOntoUMLArchive.g:1884:2: ( rule__Multiplicity__UpperAssignment_3 )
            // InternalOntoUMLArchive.g:1884:3: rule__Multiplicity__UpperAssignment_3
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
    // InternalOntoUMLArchive.g:1892:1: rule__Multiplicity__Group__4 : rule__Multiplicity__Group__4__Impl ;
    public final void rule__Multiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1896:1: ( rule__Multiplicity__Group__4__Impl )
            // InternalOntoUMLArchive.g:1897:2: rule__Multiplicity__Group__4__Impl
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
    // InternalOntoUMLArchive.g:1903:1: rule__Multiplicity__Group__4__Impl : ( ']' ) ;
    public final void rule__Multiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1907:1: ( ( ']' ) )
            // InternalOntoUMLArchive.g:1908:1: ( ']' )
            {
            // InternalOntoUMLArchive.g:1908:1: ( ']' )
            // InternalOntoUMLArchive.g:1909:2: ']'
            {
             before(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1919:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1923:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalOntoUMLArchive.g:1924:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalOntoUMLArchive.g:1931:1: rule__Generalization__Group__0__Impl : ( 'gen' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1935:1: ( ( 'gen' ) )
            // InternalOntoUMLArchive.g:1936:1: ( 'gen' )
            {
            // InternalOntoUMLArchive.g:1936:1: ( 'gen' )
            // InternalOntoUMLArchive.g:1937:2: 'gen'
            {
             before(grammarAccess.getGeneralizationAccess().getGenKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1946:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1950:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalOntoUMLArchive.g:1951:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalOntoUMLArchive.g:1958:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__NameAssignment_1 )? ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1962:1: ( ( ( rule__Generalization__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1963:1: ( ( rule__Generalization__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1963:1: ( ( rule__Generalization__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1964:2: ( rule__Generalization__NameAssignment_1 )?
            {
             before(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1965:2: ( rule__Generalization__NameAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoUMLArchive.g:1965:3: rule__Generalization__NameAssignment_1
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
    // InternalOntoUMLArchive.g:1973:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1977:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalOntoUMLArchive.g:1978:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
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
    // InternalOntoUMLArchive.g:1985:1: rule__Generalization__Group__2__Impl : ( 'super' ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1989:1: ( ( 'super' ) )
            // InternalOntoUMLArchive.g:1990:1: ( 'super' )
            {
            // InternalOntoUMLArchive.g:1990:1: ( 'super' )
            // InternalOntoUMLArchive.g:1991:2: 'super'
            {
             before(grammarAccess.getGeneralizationAccess().getSuperKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2000:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2004:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalOntoUMLArchive.g:2005:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalOntoUMLArchive.g:2012:1: rule__Generalization__Group__3__Impl : ( ( rule__Generalization__SuperAssignment_3 ) ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2016:1: ( ( ( rule__Generalization__SuperAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:2017:1: ( ( rule__Generalization__SuperAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:2017:1: ( ( rule__Generalization__SuperAssignment_3 ) )
            // InternalOntoUMLArchive.g:2018:2: ( rule__Generalization__SuperAssignment_3 )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperAssignment_3()); 
            // InternalOntoUMLArchive.g:2019:2: ( rule__Generalization__SuperAssignment_3 )
            // InternalOntoUMLArchive.g:2019:3: rule__Generalization__SuperAssignment_3
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
    // InternalOntoUMLArchive.g:2027:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2031:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalOntoUMLArchive.g:2032:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
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
    // InternalOntoUMLArchive.g:2039:1: rule__Generalization__Group__4__Impl : ( 'sub' ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2043:1: ( ( 'sub' ) )
            // InternalOntoUMLArchive.g:2044:1: ( 'sub' )
            {
            // InternalOntoUMLArchive.g:2044:1: ( 'sub' )
            // InternalOntoUMLArchive.g:2045:2: 'sub'
            {
             before(grammarAccess.getGeneralizationAccess().getSubKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2054:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2058:1: ( rule__Generalization__Group__5__Impl )
            // InternalOntoUMLArchive.g:2059:2: rule__Generalization__Group__5__Impl
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
    // InternalOntoUMLArchive.g:2065:1: rule__Generalization__Group__5__Impl : ( ( rule__Generalization__SubAssignment_5 ) ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2069:1: ( ( ( rule__Generalization__SubAssignment_5 ) ) )
            // InternalOntoUMLArchive.g:2070:1: ( ( rule__Generalization__SubAssignment_5 ) )
            {
            // InternalOntoUMLArchive.g:2070:1: ( ( rule__Generalization__SubAssignment_5 ) )
            // InternalOntoUMLArchive.g:2071:2: ( rule__Generalization__SubAssignment_5 )
            {
             before(grammarAccess.getGeneralizationAccess().getSubAssignment_5()); 
            // InternalOntoUMLArchive.g:2072:2: ( rule__Generalization__SubAssignment_5 )
            // InternalOntoUMLArchive.g:2072:3: rule__Generalization__SubAssignment_5
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
    // InternalOntoUMLArchive.g:2081:1: rule__DependencyLink__Group__0 : rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1 ;
    public final void rule__DependencyLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2085:1: ( rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1 )
            // InternalOntoUMLArchive.g:2086:2: rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalOntoUMLArchive.g:2093:1: rule__DependencyLink__Group__0__Impl : ( 'dependency' ) ;
    public final void rule__DependencyLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2097:1: ( ( 'dependency' ) )
            // InternalOntoUMLArchive.g:2098:1: ( 'dependency' )
            {
            // InternalOntoUMLArchive.g:2098:1: ( 'dependency' )
            // InternalOntoUMLArchive.g:2099:2: 'dependency'
            {
             before(grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2108:1: rule__DependencyLink__Group__1 : rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2 ;
    public final void rule__DependencyLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2112:1: ( rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2 )
            // InternalOntoUMLArchive.g:2113:2: rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalOntoUMLArchive.g:2120:1: rule__DependencyLink__Group__1__Impl : ( ( rule__DependencyLink__NameAssignment_1 )? ) ;
    public final void rule__DependencyLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2124:1: ( ( ( rule__DependencyLink__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2125:1: ( ( rule__DependencyLink__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2125:1: ( ( rule__DependencyLink__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2126:2: ( rule__DependencyLink__NameAssignment_1 )?
            {
             before(grammarAccess.getDependencyLinkAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2127:2: ( rule__DependencyLink__NameAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoUMLArchive.g:2127:3: rule__DependencyLink__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2135:1: rule__DependencyLink__Group__2 : rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3 ;
    public final void rule__DependencyLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2139:1: ( rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3 )
            // InternalOntoUMLArchive.g:2140:2: rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalOntoUMLArchive.g:2147:1: rule__DependencyLink__Group__2__Impl : ( ( rule__DependencyLink__StereotypesAssignment_2 )* ) ;
    public final void rule__DependencyLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2151:1: ( ( ( rule__DependencyLink__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:2152:1: ( ( rule__DependencyLink__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:2152:1: ( ( rule__DependencyLink__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:2153:2: ( rule__DependencyLink__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getDependencyLinkAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:2154:2: ( rule__DependencyLink__StereotypesAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STEREOTYPE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2154:3: rule__DependencyLink__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DependencyLink__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDependencyLinkAccess().getStereotypesAssignment_2()); 

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
    // InternalOntoUMLArchive.g:2162:1: rule__DependencyLink__Group__3 : rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4 ;
    public final void rule__DependencyLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2166:1: ( rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4 )
            // InternalOntoUMLArchive.g:2167:2: rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalOntoUMLArchive.g:2174:1: rule__DependencyLink__Group__3__Impl : ( 'from' ) ;
    public final void rule__DependencyLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2178:1: ( ( 'from' ) )
            // InternalOntoUMLArchive.g:2179:1: ( 'from' )
            {
            // InternalOntoUMLArchive.g:2179:1: ( 'from' )
            // InternalOntoUMLArchive.g:2180:2: 'from'
            {
             before(grammarAccess.getDependencyLinkAccess().getFromKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getFromKeyword_3()); 

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
    // InternalOntoUMLArchive.g:2189:1: rule__DependencyLink__Group__4 : rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5 ;
    public final void rule__DependencyLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2193:1: ( rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5 )
            // InternalOntoUMLArchive.g:2194:2: rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUMLArchive.g:2201:1: rule__DependencyLink__Group__4__Impl : ( ( rule__DependencyLink__FromAssignment_4 ) ) ;
    public final void rule__DependencyLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2205:1: ( ( ( rule__DependencyLink__FromAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:2206:1: ( ( rule__DependencyLink__FromAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:2206:1: ( ( rule__DependencyLink__FromAssignment_4 ) )
            // InternalOntoUMLArchive.g:2207:2: ( rule__DependencyLink__FromAssignment_4 )
            {
             before(grammarAccess.getDependencyLinkAccess().getFromAssignment_4()); 
            // InternalOntoUMLArchive.g:2208:2: ( rule__DependencyLink__FromAssignment_4 )
            // InternalOntoUMLArchive.g:2208:3: rule__DependencyLink__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DependencyLink__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDependencyLinkAccess().getFromAssignment_4()); 

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
    // InternalOntoUMLArchive.g:2216:1: rule__DependencyLink__Group__5 : rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6 ;
    public final void rule__DependencyLink__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2220:1: ( rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6 )
            // InternalOntoUMLArchive.g:2221:2: rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__DependencyLink__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DependencyLink__Group__6();

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
    // InternalOntoUMLArchive.g:2228:1: rule__DependencyLink__Group__5__Impl : ( 'to' ) ;
    public final void rule__DependencyLink__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2232:1: ( ( 'to' ) )
            // InternalOntoUMLArchive.g:2233:1: ( 'to' )
            {
            // InternalOntoUMLArchive.g:2233:1: ( 'to' )
            // InternalOntoUMLArchive.g:2234:2: 'to'
            {
             before(grammarAccess.getDependencyLinkAccess().getToKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getToKeyword_5()); 

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


    // $ANTLR start "rule__DependencyLink__Group__6"
    // InternalOntoUMLArchive.g:2243:1: rule__DependencyLink__Group__6 : rule__DependencyLink__Group__6__Impl ;
    public final void rule__DependencyLink__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2247:1: ( rule__DependencyLink__Group__6__Impl )
            // InternalOntoUMLArchive.g:2248:2: rule__DependencyLink__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DependencyLink__Group__6__Impl();

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
    // $ANTLR end "rule__DependencyLink__Group__6"


    // $ANTLR start "rule__DependencyLink__Group__6__Impl"
    // InternalOntoUMLArchive.g:2254:1: rule__DependencyLink__Group__6__Impl : ( ( rule__DependencyLink__ToAssignment_6 ) ) ;
    public final void rule__DependencyLink__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2258:1: ( ( ( rule__DependencyLink__ToAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:2259:1: ( ( rule__DependencyLink__ToAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:2259:1: ( ( rule__DependencyLink__ToAssignment_6 ) )
            // InternalOntoUMLArchive.g:2260:2: ( rule__DependencyLink__ToAssignment_6 )
            {
             before(grammarAccess.getDependencyLinkAccess().getToAssignment_6()); 
            // InternalOntoUMLArchive.g:2261:2: ( rule__DependencyLink__ToAssignment_6 )
            // InternalOntoUMLArchive.g:2261:3: rule__DependencyLink__ToAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DependencyLink__ToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDependencyLinkAccess().getToAssignment_6()); 

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
    // $ANTLR end "rule__DependencyLink__Group__6__Impl"


    // $ANTLR start "rule__Derivation__Group__0"
    // InternalOntoUMLArchive.g:2270:1: rule__Derivation__Group__0 : rule__Derivation__Group__0__Impl rule__Derivation__Group__1 ;
    public final void rule__Derivation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2274:1: ( rule__Derivation__Group__0__Impl rule__Derivation__Group__1 )
            // InternalOntoUMLArchive.g:2275:2: rule__Derivation__Group__0__Impl rule__Derivation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Derivation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Derivation__Group__1();

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
    // $ANTLR end "rule__Derivation__Group__0"


    // $ANTLR start "rule__Derivation__Group__0__Impl"
    // InternalOntoUMLArchive.g:2282:1: rule__Derivation__Group__0__Impl : ( 'derivation' ) ;
    public final void rule__Derivation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2286:1: ( ( 'derivation' ) )
            // InternalOntoUMLArchive.g:2287:1: ( 'derivation' )
            {
            // InternalOntoUMLArchive.g:2287:1: ( 'derivation' )
            // InternalOntoUMLArchive.g:2288:2: 'derivation'
            {
             before(grammarAccess.getDerivationAccess().getDerivationKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDerivationAccess().getDerivationKeyword_0()); 

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
    // $ANTLR end "rule__Derivation__Group__0__Impl"


    // $ANTLR start "rule__Derivation__Group__1"
    // InternalOntoUMLArchive.g:2297:1: rule__Derivation__Group__1 : rule__Derivation__Group__1__Impl rule__Derivation__Group__2 ;
    public final void rule__Derivation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2301:1: ( rule__Derivation__Group__1__Impl rule__Derivation__Group__2 )
            // InternalOntoUMLArchive.g:2302:2: rule__Derivation__Group__1__Impl rule__Derivation__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Derivation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Derivation__Group__2();

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
    // $ANTLR end "rule__Derivation__Group__1"


    // $ANTLR start "rule__Derivation__Group__1__Impl"
    // InternalOntoUMLArchive.g:2309:1: rule__Derivation__Group__1__Impl : ( ( rule__Derivation__NameAssignment_1 )? ) ;
    public final void rule__Derivation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2313:1: ( ( ( rule__Derivation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2314:1: ( ( rule__Derivation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2314:1: ( ( rule__Derivation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2315:2: ( rule__Derivation__NameAssignment_1 )?
            {
             before(grammarAccess.getDerivationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2316:2: ( rule__Derivation__NameAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoUMLArchive.g:2316:3: rule__Derivation__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Derivation__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDerivationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Derivation__Group__1__Impl"


    // $ANTLR start "rule__Derivation__Group__2"
    // InternalOntoUMLArchive.g:2324:1: rule__Derivation__Group__2 : rule__Derivation__Group__2__Impl rule__Derivation__Group__3 ;
    public final void rule__Derivation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2328:1: ( rule__Derivation__Group__2__Impl rule__Derivation__Group__3 )
            // InternalOntoUMLArchive.g:2329:2: rule__Derivation__Group__2__Impl rule__Derivation__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Derivation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Derivation__Group__3();

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
    // $ANTLR end "rule__Derivation__Group__2"


    // $ANTLR start "rule__Derivation__Group__2__Impl"
    // InternalOntoUMLArchive.g:2336:1: rule__Derivation__Group__2__Impl : ( ( rule__Derivation__StereotypesAssignment_2 )* ) ;
    public final void rule__Derivation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2340:1: ( ( ( rule__Derivation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:2341:1: ( ( rule__Derivation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:2341:1: ( ( rule__Derivation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:2342:2: ( rule__Derivation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getDerivationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:2343:2: ( rule__Derivation__StereotypesAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STEREOTYPE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2343:3: rule__Derivation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Derivation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDerivationAccess().getStereotypesAssignment_2()); 

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
    // $ANTLR end "rule__Derivation__Group__2__Impl"


    // $ANTLR start "rule__Derivation__Group__3"
    // InternalOntoUMLArchive.g:2351:1: rule__Derivation__Group__3 : rule__Derivation__Group__3__Impl rule__Derivation__Group__4 ;
    public final void rule__Derivation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2355:1: ( rule__Derivation__Group__3__Impl rule__Derivation__Group__4 )
            // InternalOntoUMLArchive.g:2356:2: rule__Derivation__Group__3__Impl rule__Derivation__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Derivation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Derivation__Group__4();

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
    // $ANTLR end "rule__Derivation__Group__3"


    // $ANTLR start "rule__Derivation__Group__3__Impl"
    // InternalOntoUMLArchive.g:2363:1: rule__Derivation__Group__3__Impl : ( 'class' ) ;
    public final void rule__Derivation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2367:1: ( ( 'class' ) )
            // InternalOntoUMLArchive.g:2368:1: ( 'class' )
            {
            // InternalOntoUMLArchive.g:2368:1: ( 'class' )
            // InternalOntoUMLArchive.g:2369:2: 'class'
            {
             before(grammarAccess.getDerivationAccess().getClassKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDerivationAccess().getClassKeyword_3()); 

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
    // $ANTLR end "rule__Derivation__Group__3__Impl"


    // $ANTLR start "rule__Derivation__Group__4"
    // InternalOntoUMLArchive.g:2378:1: rule__Derivation__Group__4 : rule__Derivation__Group__4__Impl rule__Derivation__Group__5 ;
    public final void rule__Derivation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2382:1: ( rule__Derivation__Group__4__Impl rule__Derivation__Group__5 )
            // InternalOntoUMLArchive.g:2383:2: rule__Derivation__Group__4__Impl rule__Derivation__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Derivation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Derivation__Group__5();

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
    // $ANTLR end "rule__Derivation__Group__4"


    // $ANTLR start "rule__Derivation__Group__4__Impl"
    // InternalOntoUMLArchive.g:2390:1: rule__Derivation__Group__4__Impl : ( ( rule__Derivation__ClassAssignment_4 ) ) ;
    public final void rule__Derivation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2394:1: ( ( ( rule__Derivation__ClassAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:2395:1: ( ( rule__Derivation__ClassAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:2395:1: ( ( rule__Derivation__ClassAssignment_4 ) )
            // InternalOntoUMLArchive.g:2396:2: ( rule__Derivation__ClassAssignment_4 )
            {
             before(grammarAccess.getDerivationAccess().getClassAssignment_4()); 
            // InternalOntoUMLArchive.g:2397:2: ( rule__Derivation__ClassAssignment_4 )
            // InternalOntoUMLArchive.g:2397:3: rule__Derivation__ClassAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Derivation__ClassAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAccess().getClassAssignment_4()); 

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
    // $ANTLR end "rule__Derivation__Group__4__Impl"


    // $ANTLR start "rule__Derivation__Group__5"
    // InternalOntoUMLArchive.g:2405:1: rule__Derivation__Group__5 : rule__Derivation__Group__5__Impl rule__Derivation__Group__6 ;
    public final void rule__Derivation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2409:1: ( rule__Derivation__Group__5__Impl rule__Derivation__Group__6 )
            // InternalOntoUMLArchive.g:2410:2: rule__Derivation__Group__5__Impl rule__Derivation__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Derivation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Derivation__Group__6();

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
    // $ANTLR end "rule__Derivation__Group__5"


    // $ANTLR start "rule__Derivation__Group__5__Impl"
    // InternalOntoUMLArchive.g:2417:1: rule__Derivation__Group__5__Impl : ( 'relation' ) ;
    public final void rule__Derivation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2421:1: ( ( 'relation' ) )
            // InternalOntoUMLArchive.g:2422:1: ( 'relation' )
            {
            // InternalOntoUMLArchive.g:2422:1: ( 'relation' )
            // InternalOntoUMLArchive.g:2423:2: 'relation'
            {
             before(grammarAccess.getDerivationAccess().getRelationKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDerivationAccess().getRelationKeyword_5()); 

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
    // $ANTLR end "rule__Derivation__Group__5__Impl"


    // $ANTLR start "rule__Derivation__Group__6"
    // InternalOntoUMLArchive.g:2432:1: rule__Derivation__Group__6 : rule__Derivation__Group__6__Impl ;
    public final void rule__Derivation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2436:1: ( rule__Derivation__Group__6__Impl )
            // InternalOntoUMLArchive.g:2437:2: rule__Derivation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Derivation__Group__6__Impl();

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
    // $ANTLR end "rule__Derivation__Group__6"


    // $ANTLR start "rule__Derivation__Group__6__Impl"
    // InternalOntoUMLArchive.g:2443:1: rule__Derivation__Group__6__Impl : ( ( rule__Derivation__PartAssignment_6 ) ) ;
    public final void rule__Derivation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2447:1: ( ( ( rule__Derivation__PartAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:2448:1: ( ( rule__Derivation__PartAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:2448:1: ( ( rule__Derivation__PartAssignment_6 ) )
            // InternalOntoUMLArchive.g:2449:2: ( rule__Derivation__PartAssignment_6 )
            {
             before(grammarAccess.getDerivationAccess().getPartAssignment_6()); 
            // InternalOntoUMLArchive.g:2450:2: ( rule__Derivation__PartAssignment_6 )
            // InternalOntoUMLArchive.g:2450:3: rule__Derivation__PartAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Derivation__PartAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDerivationAccess().getPartAssignment_6()); 

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
    // $ANTLR end "rule__Derivation__Group__6__Impl"


    // $ANTLR start "rule__ClassDerivationEnd__Group__0"
    // InternalOntoUMLArchive.g:2459:1: rule__ClassDerivationEnd__Group__0 : rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1 ;
    public final void rule__ClassDerivationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2463:1: ( rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1 )
            // InternalOntoUMLArchive.g:2464:2: rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ClassDerivationEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__Group__1();

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
    // $ANTLR end "rule__ClassDerivationEnd__Group__0"


    // $ANTLR start "rule__ClassDerivationEnd__Group__0__Impl"
    // InternalOntoUMLArchive.g:2471:1: rule__ClassDerivationEnd__Group__0__Impl : ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 ) ) ;
    public final void rule__ClassDerivationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2475:1: ( ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 ) ) )
            // InternalOntoUMLArchive.g:2476:1: ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 ) )
            {
            // InternalOntoUMLArchive.g:2476:1: ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 ) )
            // InternalOntoUMLArchive.g:2477:2: ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getMultiplicityAssignment_0()); 
            // InternalOntoUMLArchive.g:2478:2: ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )
            // InternalOntoUMLArchive.g:2478:3: rule__ClassDerivationEnd__MultiplicityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__MultiplicityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassDerivationEndAccess().getMultiplicityAssignment_0()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__Group__0__Impl"


    // $ANTLR start "rule__ClassDerivationEnd__Group__1"
    // InternalOntoUMLArchive.g:2486:1: rule__ClassDerivationEnd__Group__1 : rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2 ;
    public final void rule__ClassDerivationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2490:1: ( rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2 )
            // InternalOntoUMLArchive.g:2491:2: rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ClassDerivationEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__Group__2();

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
    // $ANTLR end "rule__ClassDerivationEnd__Group__1"


    // $ANTLR start "rule__ClassDerivationEnd__Group__1__Impl"
    // InternalOntoUMLArchive.g:2498:1: rule__ClassDerivationEnd__Group__1__Impl : ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2502:1: ( ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:2503:1: ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:2503:1: ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) )
            // InternalOntoUMLArchive.g:2504:2: ( rule__ClassDerivationEnd__EndTypeAssignment_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getEndTypeAssignment_1()); 
            // InternalOntoUMLArchive.g:2505:2: ( rule__ClassDerivationEnd__EndTypeAssignment_1 )
            // InternalOntoUMLArchive.g:2505:3: rule__ClassDerivationEnd__EndTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__EndTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDerivationEndAccess().getEndTypeAssignment_1()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__Group__1__Impl"


    // $ANTLR start "rule__ClassDerivationEnd__Group__2"
    // InternalOntoUMLArchive.g:2513:1: rule__ClassDerivationEnd__Group__2 : rule__ClassDerivationEnd__Group__2__Impl ;
    public final void rule__ClassDerivationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2517:1: ( rule__ClassDerivationEnd__Group__2__Impl )
            // InternalOntoUMLArchive.g:2518:2: rule__ClassDerivationEnd__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__Group__2__Impl();

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
    // $ANTLR end "rule__ClassDerivationEnd__Group__2"


    // $ANTLR start "rule__ClassDerivationEnd__Group__2__Impl"
    // InternalOntoUMLArchive.g:2524:1: rule__ClassDerivationEnd__Group__2__Impl : ( ( rule__ClassDerivationEnd__Group_2__0 )? ) ;
    public final void rule__ClassDerivationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2528:1: ( ( ( rule__ClassDerivationEnd__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:2529:1: ( ( rule__ClassDerivationEnd__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:2529:1: ( ( rule__ClassDerivationEnd__Group_2__0 )? )
            // InternalOntoUMLArchive.g:2530:2: ( rule__ClassDerivationEnd__Group_2__0 )?
            {
             before(grammarAccess.getClassDerivationEndAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:2531:2: ( rule__ClassDerivationEnd__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOntoUMLArchive.g:2531:3: rule__ClassDerivationEnd__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDerivationEnd__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDerivationEndAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__Group__2__Impl"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2__0"
    // InternalOntoUMLArchive.g:2540:1: rule__ClassDerivationEnd__Group_2__0 : rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1 ;
    public final void rule__ClassDerivationEnd__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2544:1: ( rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1 )
            // InternalOntoUMLArchive.g:2545:2: rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ClassDerivationEnd__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__Group_2__1();

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2__0"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2__0__Impl"
    // InternalOntoUMLArchive.g:2552:1: rule__ClassDerivationEnd__Group_2__0__Impl : ( '{' ) ;
    public final void rule__ClassDerivationEnd__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2556:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:2557:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:2557:1: ( '{' )
            // InternalOntoUMLArchive.g:2558:2: '{'
            {
             before(grammarAccess.getClassDerivationEndAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassDerivationEndAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2__0__Impl"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2__1"
    // InternalOntoUMLArchive.g:2567:1: rule__ClassDerivationEnd__Group_2__1 : rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2 ;
    public final void rule__ClassDerivationEnd__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2571:1: ( rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2 )
            // InternalOntoUMLArchive.g:2572:2: rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__ClassDerivationEnd__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__Group_2__2();

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2__1"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2__1__Impl"
    // InternalOntoUMLArchive.g:2579:1: rule__ClassDerivationEnd__Group_2__1__Impl : ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2583:1: ( ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) ) )
            // InternalOntoUMLArchive.g:2584:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) )
            {
            // InternalOntoUMLArchive.g:2584:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) )
            // InternalOntoUMLArchive.g:2585:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getConstraintsAssignment_2_1()); 
            // InternalOntoUMLArchive.g:2586:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 )
            // InternalOntoUMLArchive.g:2586:3: rule__ClassDerivationEnd__ConstraintsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__ConstraintsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDerivationEndAccess().getConstraintsAssignment_2_1()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2__1__Impl"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2__2"
    // InternalOntoUMLArchive.g:2594:1: rule__ClassDerivationEnd__Group_2__2 : rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3 ;
    public final void rule__ClassDerivationEnd__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2598:1: ( rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3 )
            // InternalOntoUMLArchive.g:2599:2: rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3
            {
            pushFollow(FOLLOW_19);
            rule__ClassDerivationEnd__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__Group_2__3();

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2__2"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2__2__Impl"
    // InternalOntoUMLArchive.g:2606:1: rule__ClassDerivationEnd__Group_2__2__Impl : ( ( rule__ClassDerivationEnd__Group_2_2__0 )* ) ;
    public final void rule__ClassDerivationEnd__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2610:1: ( ( ( rule__ClassDerivationEnd__Group_2_2__0 )* ) )
            // InternalOntoUMLArchive.g:2611:1: ( ( rule__ClassDerivationEnd__Group_2_2__0 )* )
            {
            // InternalOntoUMLArchive.g:2611:1: ( ( rule__ClassDerivationEnd__Group_2_2__0 )* )
            // InternalOntoUMLArchive.g:2612:2: ( rule__ClassDerivationEnd__Group_2_2__0 )*
            {
             before(grammarAccess.getClassDerivationEndAccess().getGroup_2_2()); 
            // InternalOntoUMLArchive.g:2613:2: ( rule__ClassDerivationEnd__Group_2_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2613:3: rule__ClassDerivationEnd__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ClassDerivationEnd__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getClassDerivationEndAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2__2__Impl"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2__3"
    // InternalOntoUMLArchive.g:2621:1: rule__ClassDerivationEnd__Group_2__3 : rule__ClassDerivationEnd__Group_2__3__Impl ;
    public final void rule__ClassDerivationEnd__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2625:1: ( rule__ClassDerivationEnd__Group_2__3__Impl )
            // InternalOntoUMLArchive.g:2626:2: rule__ClassDerivationEnd__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__Group_2__3__Impl();

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2__3"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2__3__Impl"
    // InternalOntoUMLArchive.g:2632:1: rule__ClassDerivationEnd__Group_2__3__Impl : ( '}' ) ;
    public final void rule__ClassDerivationEnd__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2636:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:2637:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:2637:1: ( '}' )
            // InternalOntoUMLArchive.g:2638:2: '}'
            {
             before(grammarAccess.getClassDerivationEndAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassDerivationEndAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2__3__Impl"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2_2__0"
    // InternalOntoUMLArchive.g:2648:1: rule__ClassDerivationEnd__Group_2_2__0 : rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1 ;
    public final void rule__ClassDerivationEnd__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2652:1: ( rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1 )
            // InternalOntoUMLArchive.g:2653:2: rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ClassDerivationEnd__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__Group_2_2__1();

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2_2__0"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2_2__0__Impl"
    // InternalOntoUMLArchive.g:2660:1: rule__ClassDerivationEnd__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDerivationEnd__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2664:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:2665:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:2665:1: ( ',' )
            // InternalOntoUMLArchive.g:2666:2: ','
            {
             before(grammarAccess.getClassDerivationEndAccess().getCommaKeyword_2_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassDerivationEndAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2_2__0__Impl"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2_2__1"
    // InternalOntoUMLArchive.g:2675:1: rule__ClassDerivationEnd__Group_2_2__1 : rule__ClassDerivationEnd__Group_2_2__1__Impl ;
    public final void rule__ClassDerivationEnd__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2679:1: ( rule__ClassDerivationEnd__Group_2_2__1__Impl )
            // InternalOntoUMLArchive.g:2680:2: rule__ClassDerivationEnd__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2_2__1"


    // $ANTLR start "rule__ClassDerivationEnd__Group_2_2__1__Impl"
    // InternalOntoUMLArchive.g:2686:1: rule__ClassDerivationEnd__Group_2_2__1__Impl : ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2690:1: ( ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) ) )
            // InternalOntoUMLArchive.g:2691:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            {
            // InternalOntoUMLArchive.g:2691:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            // InternalOntoUMLArchive.g:2692:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getConstraintsAssignment_2_2_1()); 
            // InternalOntoUMLArchive.g:2693:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 )
            // InternalOntoUMLArchive.g:2693:3: rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDerivationEndAccess().getConstraintsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__Group_2_2__1__Impl"


    // $ANTLR start "rule__RelationDerivationEnd__Group__0"
    // InternalOntoUMLArchive.g:2702:1: rule__RelationDerivationEnd__Group__0 : rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1 ;
    public final void rule__RelationDerivationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2706:1: ( rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1 )
            // InternalOntoUMLArchive.g:2707:2: rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RelationDerivationEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__Group__1();

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
    // $ANTLR end "rule__RelationDerivationEnd__Group__0"


    // $ANTLR start "rule__RelationDerivationEnd__Group__0__Impl"
    // InternalOntoUMLArchive.g:2714:1: rule__RelationDerivationEnd__Group__0__Impl : ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 ) ) ;
    public final void rule__RelationDerivationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2718:1: ( ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 ) ) )
            // InternalOntoUMLArchive.g:2719:1: ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 ) )
            {
            // InternalOntoUMLArchive.g:2719:1: ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 ) )
            // InternalOntoUMLArchive.g:2720:2: ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getMultiplicityAssignment_0()); 
            // InternalOntoUMLArchive.g:2721:2: ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )
            // InternalOntoUMLArchive.g:2721:3: rule__RelationDerivationEnd__MultiplicityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__MultiplicityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationDerivationEndAccess().getMultiplicityAssignment_0()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__Group__0__Impl"


    // $ANTLR start "rule__RelationDerivationEnd__Group__1"
    // InternalOntoUMLArchive.g:2729:1: rule__RelationDerivationEnd__Group__1 : rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2 ;
    public final void rule__RelationDerivationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2733:1: ( rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2 )
            // InternalOntoUMLArchive.g:2734:2: rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__RelationDerivationEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__Group__2();

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
    // $ANTLR end "rule__RelationDerivationEnd__Group__1"


    // $ANTLR start "rule__RelationDerivationEnd__Group__1__Impl"
    // InternalOntoUMLArchive.g:2741:1: rule__RelationDerivationEnd__Group__1__Impl : ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2745:1: ( ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:2746:1: ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:2746:1: ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) )
            // InternalOntoUMLArchive.g:2747:2: ( rule__RelationDerivationEnd__EndTypeAssignment_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssignment_1()); 
            // InternalOntoUMLArchive.g:2748:2: ( rule__RelationDerivationEnd__EndTypeAssignment_1 )
            // InternalOntoUMLArchive.g:2748:3: rule__RelationDerivationEnd__EndTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__EndTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssignment_1()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__Group__1__Impl"


    // $ANTLR start "rule__RelationDerivationEnd__Group__2"
    // InternalOntoUMLArchive.g:2756:1: rule__RelationDerivationEnd__Group__2 : rule__RelationDerivationEnd__Group__2__Impl ;
    public final void rule__RelationDerivationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2760:1: ( rule__RelationDerivationEnd__Group__2__Impl )
            // InternalOntoUMLArchive.g:2761:2: rule__RelationDerivationEnd__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__Group__2__Impl();

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
    // $ANTLR end "rule__RelationDerivationEnd__Group__2"


    // $ANTLR start "rule__RelationDerivationEnd__Group__2__Impl"
    // InternalOntoUMLArchive.g:2767:1: rule__RelationDerivationEnd__Group__2__Impl : ( ( rule__RelationDerivationEnd__Group_2__0 )? ) ;
    public final void rule__RelationDerivationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2771:1: ( ( ( rule__RelationDerivationEnd__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:2772:1: ( ( rule__RelationDerivationEnd__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:2772:1: ( ( rule__RelationDerivationEnd__Group_2__0 )? )
            // InternalOntoUMLArchive.g:2773:2: ( rule__RelationDerivationEnd__Group_2__0 )?
            {
             before(grammarAccess.getRelationDerivationEndAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:2774:2: ( rule__RelationDerivationEnd__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoUMLArchive.g:2774:3: rule__RelationDerivationEnd__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationDerivationEnd__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationDerivationEndAccess().getGroup_2()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__Group__2__Impl"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2__0"
    // InternalOntoUMLArchive.g:2783:1: rule__RelationDerivationEnd__Group_2__0 : rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1 ;
    public final void rule__RelationDerivationEnd__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2787:1: ( rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1 )
            // InternalOntoUMLArchive.g:2788:2: rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__RelationDerivationEnd__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__Group_2__1();

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2__0"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2__0__Impl"
    // InternalOntoUMLArchive.g:2795:1: rule__RelationDerivationEnd__Group_2__0__Impl : ( '{' ) ;
    public final void rule__RelationDerivationEnd__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2799:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:2800:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:2800:1: ( '{' )
            // InternalOntoUMLArchive.g:2801:2: '{'
            {
             before(grammarAccess.getRelationDerivationEndAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationDerivationEndAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2__0__Impl"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2__1"
    // InternalOntoUMLArchive.g:2810:1: rule__RelationDerivationEnd__Group_2__1 : rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2 ;
    public final void rule__RelationDerivationEnd__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2814:1: ( rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2 )
            // InternalOntoUMLArchive.g:2815:2: rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__RelationDerivationEnd__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__Group_2__2();

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2__1"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2__1__Impl"
    // InternalOntoUMLArchive.g:2822:1: rule__RelationDerivationEnd__Group_2__1__Impl : ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2826:1: ( ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) ) )
            // InternalOntoUMLArchive.g:2827:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) )
            {
            // InternalOntoUMLArchive.g:2827:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) )
            // InternalOntoUMLArchive.g:2828:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getConstraintsAssignment_2_1()); 
            // InternalOntoUMLArchive.g:2829:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 )
            // InternalOntoUMLArchive.g:2829:3: rule__RelationDerivationEnd__ConstraintsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__ConstraintsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationDerivationEndAccess().getConstraintsAssignment_2_1()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2__1__Impl"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2__2"
    // InternalOntoUMLArchive.g:2837:1: rule__RelationDerivationEnd__Group_2__2 : rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3 ;
    public final void rule__RelationDerivationEnd__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2841:1: ( rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3 )
            // InternalOntoUMLArchive.g:2842:2: rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3
            {
            pushFollow(FOLLOW_19);
            rule__RelationDerivationEnd__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__Group_2__3();

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2__2"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2__2__Impl"
    // InternalOntoUMLArchive.g:2849:1: rule__RelationDerivationEnd__Group_2__2__Impl : ( ( rule__RelationDerivationEnd__Group_2_2__0 )* ) ;
    public final void rule__RelationDerivationEnd__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2853:1: ( ( ( rule__RelationDerivationEnd__Group_2_2__0 )* ) )
            // InternalOntoUMLArchive.g:2854:1: ( ( rule__RelationDerivationEnd__Group_2_2__0 )* )
            {
            // InternalOntoUMLArchive.g:2854:1: ( ( rule__RelationDerivationEnd__Group_2_2__0 )* )
            // InternalOntoUMLArchive.g:2855:2: ( rule__RelationDerivationEnd__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationDerivationEndAccess().getGroup_2_2()); 
            // InternalOntoUMLArchive.g:2856:2: ( rule__RelationDerivationEnd__Group_2_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2856:3: rule__RelationDerivationEnd__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RelationDerivationEnd__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getRelationDerivationEndAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2__2__Impl"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2__3"
    // InternalOntoUMLArchive.g:2864:1: rule__RelationDerivationEnd__Group_2__3 : rule__RelationDerivationEnd__Group_2__3__Impl ;
    public final void rule__RelationDerivationEnd__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2868:1: ( rule__RelationDerivationEnd__Group_2__3__Impl )
            // InternalOntoUMLArchive.g:2869:2: rule__RelationDerivationEnd__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__Group_2__3__Impl();

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2__3"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2__3__Impl"
    // InternalOntoUMLArchive.g:2875:1: rule__RelationDerivationEnd__Group_2__3__Impl : ( '}' ) ;
    public final void rule__RelationDerivationEnd__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2879:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:2880:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:2880:1: ( '}' )
            // InternalOntoUMLArchive.g:2881:2: '}'
            {
             before(grammarAccess.getRelationDerivationEndAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationDerivationEndAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2__3__Impl"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2_2__0"
    // InternalOntoUMLArchive.g:2891:1: rule__RelationDerivationEnd__Group_2_2__0 : rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1 ;
    public final void rule__RelationDerivationEnd__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2895:1: ( rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1 )
            // InternalOntoUMLArchive.g:2896:2: rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1
            {
            pushFollow(FOLLOW_6);
            rule__RelationDerivationEnd__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__Group_2_2__1();

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2_2__0"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2_2__0__Impl"
    // InternalOntoUMLArchive.g:2903:1: rule__RelationDerivationEnd__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__RelationDerivationEnd__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2907:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:2908:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:2908:1: ( ',' )
            // InternalOntoUMLArchive.g:2909:2: ','
            {
             before(grammarAccess.getRelationDerivationEndAccess().getCommaKeyword_2_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRelationDerivationEndAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2_2__0__Impl"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2_2__1"
    // InternalOntoUMLArchive.g:2918:1: rule__RelationDerivationEnd__Group_2_2__1 : rule__RelationDerivationEnd__Group_2_2__1__Impl ;
    public final void rule__RelationDerivationEnd__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2922:1: ( rule__RelationDerivationEnd__Group_2_2__1__Impl )
            // InternalOntoUMLArchive.g:2923:2: rule__RelationDerivationEnd__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2_2__1"


    // $ANTLR start "rule__RelationDerivationEnd__Group_2_2__1__Impl"
    // InternalOntoUMLArchive.g:2929:1: rule__RelationDerivationEnd__Group_2_2__1__Impl : ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2933:1: ( ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) ) )
            // InternalOntoUMLArchive.g:2934:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            {
            // InternalOntoUMLArchive.g:2934:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            // InternalOntoUMLArchive.g:2935:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getConstraintsAssignment_2_2_1()); 
            // InternalOntoUMLArchive.g:2936:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 )
            // InternalOntoUMLArchive.g:2936:3: rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationDerivationEndAccess().getConstraintsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__Group_2_2__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__0"
    // InternalOntoUMLArchive.g:2945:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2949:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoUMLArchive.g:2950:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoUMLArchive.g:2957:1: rule__GeneralizationSet__Group__0__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2961:1: ( ( 'genset' ) )
            // InternalOntoUMLArchive.g:2962:1: ( 'genset' )
            {
            // InternalOntoUMLArchive.g:2962:1: ( 'genset' )
            // InternalOntoUMLArchive.g:2963:2: 'genset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2972:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2976:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoUMLArchive.g:2977:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoUMLArchive.g:2984:1: rule__GeneralizationSet__Group__1__Impl : ( ( rule__GeneralizationSet__UnorderedGroup_1 ) ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2988:1: ( ( ( rule__GeneralizationSet__UnorderedGroup_1 ) ) )
            // InternalOntoUMLArchive.g:2989:1: ( ( rule__GeneralizationSet__UnorderedGroup_1 ) )
            {
            // InternalOntoUMLArchive.g:2989:1: ( ( rule__GeneralizationSet__UnorderedGroup_1 ) )
            // InternalOntoUMLArchive.g:2990:2: ( rule__GeneralizationSet__UnorderedGroup_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1()); 
            // InternalOntoUMLArchive.g:2991:2: ( rule__GeneralizationSet__UnorderedGroup_1 )
            // InternalOntoUMLArchive.g:2991:3: rule__GeneralizationSet__UnorderedGroup_1
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
    // InternalOntoUMLArchive.g:2999:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3003:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoUMLArchive.g:3004:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoUMLArchive.g:3011:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3015:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalOntoUMLArchive.g:3016:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalOntoUMLArchive.g:3016:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalOntoUMLArchive.g:3017:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoUMLArchive.g:3018:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoUMLArchive.g:3018:3: rule__GeneralizationSet__NameAssignment_2
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
    // InternalOntoUMLArchive.g:3026:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3030:1: ( rule__GeneralizationSet__Group__3__Impl )
            // InternalOntoUMLArchive.g:3031:2: rule__GeneralizationSet__Group__3__Impl
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
    // InternalOntoUMLArchive.g:3037:1: rule__GeneralizationSet__Group__3__Impl : ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3041:1: ( ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) ) )
            // InternalOntoUMLArchive.g:3042:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) )
            {
            // InternalOntoUMLArchive.g:3042:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:3043:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:3043:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) )
            // InternalOntoUMLArchive.g:3044:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 
            // InternalOntoUMLArchive.g:3045:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )
            // InternalOntoUMLArchive.g:3045:4: rule__GeneralizationSet__GeneralizationsAssignment_3
            {
            pushFollow(FOLLOW_30);
            rule__GeneralizationSet__GeneralizationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 

            }

            // InternalOntoUMLArchive.g:3048:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* )
            // InternalOntoUMLArchive.g:3049:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 
            // InternalOntoUMLArchive.g:3050:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:3050:4: rule__GeneralizationSet__GeneralizationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__GeneralizationSet__GeneralizationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalOntoUMLArchive.g:3060:1: rule__GeneralizationSet__UnorderedGroup_1 : ( rule__GeneralizationSet__UnorderedGroup_1__0 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
        	
        try {
            // InternalOntoUMLArchive.g:3065:1: ( ( rule__GeneralizationSet__UnorderedGroup_1__0 )? )
            // InternalOntoUMLArchive.g:3066:2: ( rule__GeneralizationSet__UnorderedGroup_1__0 )?
            {
            // InternalOntoUMLArchive.g:3066:2: ( rule__GeneralizationSet__UnorderedGroup_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoUMLArchive.g:3066:2: rule__GeneralizationSet__UnorderedGroup_1__0
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
    // InternalOntoUMLArchive.g:3074:1: rule__GeneralizationSet__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) ) ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOntoUMLArchive.g:3079:1: ( ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) ) )
            // InternalOntoUMLArchive.g:3080:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) )
            {
            // InternalOntoUMLArchive.g:3080:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalOntoUMLArchive.g:3081:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:3081:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) )
                    // InternalOntoUMLArchive.g:3082:4: {...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalOntoUMLArchive.g:3082:113: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) )
                    // InternalOntoUMLArchive.g:3083:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:3089:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) )
                    // InternalOntoUMLArchive.g:3090:6: ( rule__GeneralizationSet__IsDisjointAssignment_1_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_1_0()); 
                    // InternalOntoUMLArchive.g:3091:6: ( rule__GeneralizationSet__IsDisjointAssignment_1_0 )
                    // InternalOntoUMLArchive.g:3091:7: rule__GeneralizationSet__IsDisjointAssignment_1_0
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
                    // InternalOntoUMLArchive.g:3096:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:3096:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) )
                    // InternalOntoUMLArchive.g:3097:4: {...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalOntoUMLArchive.g:3097:113: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) )
                    // InternalOntoUMLArchive.g:3098:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:3104:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) )
                    // InternalOntoUMLArchive.g:3105:6: ( rule__GeneralizationSet__IsCompleteAssignment_1_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_1_1()); 
                    // InternalOntoUMLArchive.g:3106:6: ( rule__GeneralizationSet__IsCompleteAssignment_1_1 )
                    // InternalOntoUMLArchive.g:3106:7: rule__GeneralizationSet__IsCompleteAssignment_1_1
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
    // InternalOntoUMLArchive.g:3119:1: rule__GeneralizationSet__UnorderedGroup_1__0 : rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3123:1: ( rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )? )
            // InternalOntoUMLArchive.g:3124:2: rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_31);
            rule__GeneralizationSet__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalOntoUMLArchive.g:3125:2: ( rule__GeneralizationSet__UnorderedGroup_1__1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoUMLArchive.g:3125:2: rule__GeneralizationSet__UnorderedGroup_1__1
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
    // InternalOntoUMLArchive.g:3131:1: rule__GeneralizationSet__UnorderedGroup_1__1 : rule__GeneralizationSet__UnorderedGroup_1__Impl ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3135:1: ( rule__GeneralizationSet__UnorderedGroup_1__Impl )
            // InternalOntoUMLArchive.g:3136:2: rule__GeneralizationSet__UnorderedGroup_1__Impl
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


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalOntoUMLArchive.g:3143:1: rule__Model__ElementsAssignment : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3147:1: ( ( ruleModelElement ) )
            // InternalOntoUMLArchive.g:3148:2: ( ruleModelElement )
            {
            // InternalOntoUMLArchive.g:3148:2: ( ruleModelElement )
            // InternalOntoUMLArchive.g:3149:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Class__IsAbstractAssignment_0"
    // InternalOntoUMLArchive.g:3158:1: rule__Class__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3162:1: ( ( ( 'abstract' ) ) )
            // InternalOntoUMLArchive.g:3163:2: ( ( 'abstract' ) )
            {
            // InternalOntoUMLArchive.g:3163:2: ( ( 'abstract' ) )
            // InternalOntoUMLArchive.g:3164:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalOntoUMLArchive.g:3165:3: ( 'abstract' )
            // InternalOntoUMLArchive.g:3166:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3177:1: rule__Class__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3181:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3182:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3182:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3183:3: RULE_STRING
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


    // $ANTLR start "rule__Class__StereotypesAssignment_3"
    // InternalOntoUMLArchive.g:3192:1: rule__Class__StereotypesAssignment_3 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__Class__StereotypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3196:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3197:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3197:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3198:3: RULE_STEREOTYPE_STRING
            {
             before(grammarAccess.getClassAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Class__StereotypesAssignment_3"


    // $ANTLR start "rule__Class__AttributesAssignment_4"
    // InternalOntoUMLArchive.g:3207:1: rule__Class__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3211:1: ( ( ruleAttribute ) )
            // InternalOntoUMLArchive.g:3212:2: ( ruleAttribute )
            {
            // InternalOntoUMLArchive.g:3212:2: ( ruleAttribute )
            // InternalOntoUMLArchive.g:3213:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Class__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalOntoUMLArchive.g:3222:1: rule__Attribute__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3226:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3227:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3227:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3228:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__MultiplicityAssignment_2"
    // InternalOntoUMLArchive.g:3237:1: rule__Attribute__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__Attribute__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3241:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:3242:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:3242:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:3243:3: ruleMultiplicity
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__MultiplicityAssignment_2"


    // $ANTLR start "rule__Attribute__AttTypeAssignment_4"
    // InternalOntoUMLArchive.g:3252:1: rule__Attribute__AttTypeAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__Attribute__AttTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3256:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3257:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3257:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3258:3: ( RULE_STRING )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeClassCrossReference_4_0()); 
            // InternalOntoUMLArchive.g:3259:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3260:4: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getAttTypeClassSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttTypeClassSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getAttTypeClassCrossReference_4_0()); 

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
    // $ANTLR end "rule__Attribute__AttTypeAssignment_4"


    // $ANTLR start "rule__BinaryAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:3271:1: rule__BinaryAssociation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BinaryAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3275:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3276:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3276:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3277:3: RULE_STRING
            {
             before(grammarAccess.getBinaryAssociationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBinaryAssociationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BinaryAssociation__NameAssignment_1"


    // $ANTLR start "rule__BinaryAssociation__StereotypesAssignment_2"
    // InternalOntoUMLArchive.g:3286:1: rule__BinaryAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__BinaryAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3290:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3291:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3291:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3292:3: RULE_STEREOTYPE_STRING
            {
             before(grammarAccess.getBinaryAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 
             after(grammarAccess.getBinaryAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__BinaryAssociation__StereotypesAssignment_2"


    // $ANTLR start "rule__BinaryAssociation__FromAssignment_4"
    // InternalOntoUMLArchive.g:3301:1: rule__BinaryAssociation__FromAssignment_4 : ( ruleAssociationEnd ) ;
    public final void rule__BinaryAssociation__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3305:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3306:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3306:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3307:3: ruleAssociationEnd
            {
             before(grammarAccess.getBinaryAssociationAccess().getFromAssociationEndParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getBinaryAssociationAccess().getFromAssociationEndParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__BinaryAssociation__FromAssignment_4"


    // $ANTLR start "rule__BinaryAssociation__ToAssignment_6"
    // InternalOntoUMLArchive.g:3316:1: rule__BinaryAssociation__ToAssignment_6 : ( ruleAssociationEnd ) ;
    public final void rule__BinaryAssociation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3320:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3321:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3321:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3322:3: ruleAssociationEnd
            {
             before(grammarAccess.getBinaryAssociationAccess().getToAssociationEndParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getBinaryAssociationAccess().getToAssociationEndParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__BinaryAssociation__ToAssignment_6"


    // $ANTLR start "rule__NaryAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:3331:1: rule__NaryAssociation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NaryAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3335:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3336:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3336:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3337:3: RULE_STRING
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


    // $ANTLR start "rule__NaryAssociation__StereotypesAssignment_2"
    // InternalOntoUMLArchive.g:3346:1: rule__NaryAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__NaryAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3350:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3351:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3351:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3352:3: RULE_STEREOTYPE_STRING
            {
             before(grammarAccess.getNaryAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 
             after(grammarAccess.getNaryAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__NaryAssociation__StereotypesAssignment_2"


    // $ANTLR start "rule__NaryAssociation__EndsAssignment_3_1"
    // InternalOntoUMLArchive.g:3361:1: rule__NaryAssociation__EndsAssignment_3_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3365:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3366:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3366:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3367:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:3376:1: rule__NaryAssociation__EndsAssignment_4_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3380:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3381:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3381:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3382:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:3391:1: rule__NaryAssociation__EndsAssignment_5_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3395:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3396:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3396:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3397:3: ruleAssociationEnd
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


    // $ANTLR start "rule__AssociationEnd__AggregationKindAssignment_0"
    // InternalOntoUMLArchive.g:3406:1: rule__AssociationEnd__AggregationKindAssignment_0 : ( ruleAggregationKindDeclaration ) ;
    public final void rule__AssociationEnd__AggregationKindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3410:1: ( ( ruleAggregationKindDeclaration ) )
            // InternalOntoUMLArchive.g:3411:2: ( ruleAggregationKindDeclaration )
            {
            // InternalOntoUMLArchive.g:3411:2: ( ruleAggregationKindDeclaration )
            // InternalOntoUMLArchive.g:3412:3: ruleAggregationKindDeclaration
            {
             before(grammarAccess.getAssociationEndAccess().getAggregationKindAggregationKindDeclarationEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregationKindDeclaration();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getAggregationKindAggregationKindDeclarationEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__AssociationEnd__AggregationKindAssignment_0"


    // $ANTLR start "rule__AssociationEnd__NameAssignment_1"
    // InternalOntoUMLArchive.g:3421:1: rule__AssociationEnd__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3425:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3426:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3426:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3427:3: RULE_STRING
            {
             before(grammarAccess.getAssociationEndAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AssociationEnd__NameAssignment_1"


    // $ANTLR start "rule__AssociationEnd__MultiplicityAssignment_2"
    // InternalOntoUMLArchive.g:3436:1: rule__AssociationEnd__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__AssociationEnd__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3440:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:3441:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:3441:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:3442:3: ruleMultiplicity
            {
             before(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AssociationEnd__MultiplicityAssignment_2"


    // $ANTLR start "rule__AssociationEnd__EndTypeAssignment_4"
    // InternalOntoUMLArchive.g:3451:1: rule__AssociationEnd__EndTypeAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__AssociationEnd__EndTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3455:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3456:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3456:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3457:3: ( RULE_STRING )
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_4_0()); 
            // InternalOntoUMLArchive.g:3458:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3459:4: RULE_STRING
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeClassSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getEndTypeClassSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_4_0()); 

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
    // $ANTLR end "rule__AssociationEnd__EndTypeAssignment_4"


    // $ANTLR start "rule__AssociationEnd__ConstraintsAssignment_5_1"
    // InternalOntoUMLArchive.g:3470:1: rule__AssociationEnd__ConstraintsAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__ConstraintsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3474:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3475:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3475:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3476:3: RULE_STRING
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__AssociationEnd__ConstraintsAssignment_5_1"


    // $ANTLR start "rule__AssociationEnd__ConstraintsAssignment_5_2_1"
    // InternalOntoUMLArchive.g:3485:1: rule__AssociationEnd__ConstraintsAssignment_5_2_1 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__ConstraintsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3489:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3490:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3490:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3491:3: RULE_STRING
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_5_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_5_2_1_0()); 

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
    // $ANTLR end "rule__AssociationEnd__ConstraintsAssignment_5_2_1"


    // $ANTLR start "rule__Multiplicity__LowerAssignment_1"
    // InternalOntoUMLArchive.g:3500:1: rule__Multiplicity__LowerAssignment_1 : ( ruleCARDINALITY ) ;
    public final void rule__Multiplicity__LowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3504:1: ( ( ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:3505:2: ( ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:3505:2: ( ruleCARDINALITY )
            // InternalOntoUMLArchive.g:3506:3: ruleCARDINALITY
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
    // InternalOntoUMLArchive.g:3515:1: rule__Multiplicity__UpperAssignment_3 : ( ruleCARDINALITY ) ;
    public final void rule__Multiplicity__UpperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3519:1: ( ( ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:3520:2: ( ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:3520:2: ( ruleCARDINALITY )
            // InternalOntoUMLArchive.g:3521:3: ruleCARDINALITY
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
    // InternalOntoUMLArchive.g:3530:1: rule__Generalization__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Generalization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3534:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3535:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3535:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3536:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3545:1: rule__Generalization__SuperAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__Generalization__SuperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3549:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3550:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3550:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3551:3: ( RULE_STRING )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0()); 
            // InternalOntoUMLArchive.g:3552:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3553:4: RULE_STRING
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
    // InternalOntoUMLArchive.g:3564:1: rule__Generalization__SubAssignment_5 : ( ( RULE_STRING ) ) ;
    public final void rule__Generalization__SubAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3568:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3569:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3569:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3570:3: ( RULE_STRING )
            {
             before(grammarAccess.getGeneralizationAccess().getSubClassCrossReference_5_0()); 
            // InternalOntoUMLArchive.g:3571:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3572:4: RULE_STRING
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
    // InternalOntoUMLArchive.g:3583:1: rule__DependencyLink__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DependencyLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3587:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3588:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3588:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3589:3: RULE_STRING
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


    // $ANTLR start "rule__DependencyLink__StereotypesAssignment_2"
    // InternalOntoUMLArchive.g:3598:1: rule__DependencyLink__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__DependencyLink__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3602:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3603:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3603:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3604:3: RULE_STEREOTYPE_STRING
            {
             before(grammarAccess.getDependencyLinkAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DependencyLink__StereotypesAssignment_2"


    // $ANTLR start "rule__DependencyLink__FromAssignment_4"
    // InternalOntoUMLArchive.g:3613:1: rule__DependencyLink__FromAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__DependencyLink__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3617:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3618:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3618:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3619:3: ( RULE_STRING )
            {
             before(grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_4_0()); 
            // InternalOntoUMLArchive.g:3620:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3621:4: RULE_STRING
            {
             before(grammarAccess.getDependencyLinkAccess().getFromClassSTRINGTerminalRuleCall_4_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getFromClassSTRINGTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_4_0()); 

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
    // $ANTLR end "rule__DependencyLink__FromAssignment_4"


    // $ANTLR start "rule__DependencyLink__ToAssignment_6"
    // InternalOntoUMLArchive.g:3632:1: rule__DependencyLink__ToAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__DependencyLink__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3636:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3637:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3637:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3638:3: ( RULE_STRING )
            {
             before(grammarAccess.getDependencyLinkAccess().getToClassCrossReference_6_0()); 
            // InternalOntoUMLArchive.g:3639:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3640:4: RULE_STRING
            {
             before(grammarAccess.getDependencyLinkAccess().getToClassSTRINGTerminalRuleCall_6_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDependencyLinkAccess().getToClassSTRINGTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDependencyLinkAccess().getToClassCrossReference_6_0()); 

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
    // $ANTLR end "rule__DependencyLink__ToAssignment_6"


    // $ANTLR start "rule__Derivation__NameAssignment_1"
    // InternalOntoUMLArchive.g:3651:1: rule__Derivation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Derivation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3655:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3656:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3656:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3657:3: RULE_STRING
            {
             before(grammarAccess.getDerivationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDerivationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Derivation__NameAssignment_1"


    // $ANTLR start "rule__Derivation__StereotypesAssignment_2"
    // InternalOntoUMLArchive.g:3666:1: rule__Derivation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__Derivation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3670:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3671:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3671:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3672:3: RULE_STEREOTYPE_STRING
            {
             before(grammarAccess.getDerivationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 
             after(grammarAccess.getDerivationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Derivation__StereotypesAssignment_2"


    // $ANTLR start "rule__Derivation__ClassAssignment_4"
    // InternalOntoUMLArchive.g:3681:1: rule__Derivation__ClassAssignment_4 : ( ruleClassDerivationEnd ) ;
    public final void rule__Derivation__ClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3685:1: ( ( ruleClassDerivationEnd ) )
            // InternalOntoUMLArchive.g:3686:2: ( ruleClassDerivationEnd )
            {
            // InternalOntoUMLArchive.g:3686:2: ( ruleClassDerivationEnd )
            // InternalOntoUMLArchive.g:3687:3: ruleClassDerivationEnd
            {
             before(grammarAccess.getDerivationAccess().getClassClassDerivationEndParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDerivationEnd();

            state._fsp--;

             after(grammarAccess.getDerivationAccess().getClassClassDerivationEndParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Derivation__ClassAssignment_4"


    // $ANTLR start "rule__Derivation__PartAssignment_6"
    // InternalOntoUMLArchive.g:3696:1: rule__Derivation__PartAssignment_6 : ( ruleRelationDerivationEnd ) ;
    public final void rule__Derivation__PartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3700:1: ( ( ruleRelationDerivationEnd ) )
            // InternalOntoUMLArchive.g:3701:2: ( ruleRelationDerivationEnd )
            {
            // InternalOntoUMLArchive.g:3701:2: ( ruleRelationDerivationEnd )
            // InternalOntoUMLArchive.g:3702:3: ruleRelationDerivationEnd
            {
             before(grammarAccess.getDerivationAccess().getPartRelationDerivationEndParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationDerivationEnd();

            state._fsp--;

             after(grammarAccess.getDerivationAccess().getPartRelationDerivationEndParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Derivation__PartAssignment_6"


    // $ANTLR start "rule__ClassDerivationEnd__MultiplicityAssignment_0"
    // InternalOntoUMLArchive.g:3711:1: rule__ClassDerivationEnd__MultiplicityAssignment_0 : ( ruleMultiplicity ) ;
    public final void rule__ClassDerivationEnd__MultiplicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3715:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:3716:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:3716:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:3717:3: ruleMultiplicity
            {
             before(grammarAccess.getClassDerivationEndAccess().getMultiplicityMultiplicityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getClassDerivationEndAccess().getMultiplicityMultiplicityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__MultiplicityAssignment_0"


    // $ANTLR start "rule__ClassDerivationEnd__EndTypeAssignment_1"
    // InternalOntoUMLArchive.g:3726:1: rule__ClassDerivationEnd__EndTypeAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ClassDerivationEnd__EndTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3730:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3731:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3731:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3732:3: ( RULE_STRING )
            {
             before(grammarAccess.getClassDerivationEndAccess().getEndTypeClassCrossReference_1_0()); 
            // InternalOntoUMLArchive.g:3733:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3734:4: RULE_STRING
            {
             before(grammarAccess.getClassDerivationEndAccess().getEndTypeClassSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassDerivationEndAccess().getEndTypeClassSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getClassDerivationEndAccess().getEndTypeClassCrossReference_1_0()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__EndTypeAssignment_1"


    // $ANTLR start "rule__ClassDerivationEnd__ConstraintsAssignment_2_1"
    // InternalOntoUMLArchive.g:3745:1: rule__ClassDerivationEnd__ConstraintsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ClassDerivationEnd__ConstraintsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3749:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3750:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3750:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3751:3: RULE_STRING
            {
             before(grammarAccess.getClassDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__ConstraintsAssignment_2_1"


    // $ANTLR start "rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1"
    // InternalOntoUMLArchive.g:3760:1: rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3764:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3765:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3765:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3766:3: RULE_STRING
            {
             before(grammarAccess.getClassDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClassDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1"


    // $ANTLR start "rule__RelationDerivationEnd__MultiplicityAssignment_0"
    // InternalOntoUMLArchive.g:3775:1: rule__RelationDerivationEnd__MultiplicityAssignment_0 : ( ruleMultiplicity ) ;
    public final void rule__RelationDerivationEnd__MultiplicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3779:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:3780:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:3780:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:3781:3: ruleMultiplicity
            {
             before(grammarAccess.getRelationDerivationEndAccess().getMultiplicityMultiplicityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getRelationDerivationEndAccess().getMultiplicityMultiplicityParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__MultiplicityAssignment_0"


    // $ANTLR start "rule__RelationDerivationEnd__EndTypeAssignment_1"
    // InternalOntoUMLArchive.g:3790:1: rule__RelationDerivationEnd__EndTypeAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__RelationDerivationEnd__EndTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3794:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3795:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3795:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3796:3: ( RULE_STRING )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationCrossReference_1_0()); 
            // InternalOntoUMLArchive.g:3797:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3798:4: RULE_STRING
            {
             before(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationCrossReference_1_0()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__EndTypeAssignment_1"


    // $ANTLR start "rule__RelationDerivationEnd__ConstraintsAssignment_2_1"
    // InternalOntoUMLArchive.g:3809:1: rule__RelationDerivationEnd__ConstraintsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__RelationDerivationEnd__ConstraintsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3813:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3814:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3814:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3815:3: RULE_STRING
            {
             before(grammarAccess.getRelationDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelationDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__ConstraintsAssignment_2_1"


    // $ANTLR start "rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1"
    // InternalOntoUMLArchive.g:3824:1: rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3828:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3829:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3829:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3830:3: RULE_STRING
            {
             before(grammarAccess.getRelationDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRelationDerivationEndAccess().getConstraintsSTRINGTerminalRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1"


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_1_0"
    // InternalOntoUMLArchive.g:3839:1: rule__GeneralizationSet__IsDisjointAssignment_1_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3843:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoUMLArchive.g:3844:2: ( ( 'disjoint' ) )
            {
            // InternalOntoUMLArchive.g:3844:2: ( ( 'disjoint' ) )
            // InternalOntoUMLArchive.g:3845:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 
            // InternalOntoUMLArchive.g:3846:3: ( 'disjoint' )
            // InternalOntoUMLArchive.g:3847:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3858:1: rule__GeneralizationSet__IsCompleteAssignment_1_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3862:1: ( ( ( 'complete' ) ) )
            // InternalOntoUMLArchive.g:3863:2: ( ( 'complete' ) )
            {
            // InternalOntoUMLArchive.g:3863:2: ( ( 'complete' ) )
            // InternalOntoUMLArchive.g:3864:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 
            // InternalOntoUMLArchive.g:3865:3: ( 'complete' )
            // InternalOntoUMLArchive.g:3866:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3877:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3881:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3882:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3882:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3883:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3892:1: rule__GeneralizationSet__GeneralizationsAssignment_3 : ( ruleGeneralization ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3896:1: ( ( ruleGeneralization ) )
            // InternalOntoUMLArchive.g:3897:2: ( ruleGeneralization )
            {
            // InternalOntoUMLArchive.g:3897:2: ( ruleGeneralization )
            // InternalOntoUMLArchive.g:3898:3: ruleGeneralization
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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\23\1\5\2\6\2\uffff";
    static final String dfa_3s = "\1\23\3\26\2\uffff";
    static final String dfa_4s = "\4\uffff\1\2\1\1";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\3\15\uffff\1\5\1\uffff\1\4",
            "\1\3\15\uffff\1\5\1\uffff\1\4",
            "\1\3\15\uffff\1\5\1\uffff\1\4",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "553:1: rule__Association__Alternatives : ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001B20090002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004006020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000022L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006000000002L});

}
