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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_STEREOTYPE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "';'", "'class'", "'att'", "':'", "'association'", "'from'", "'to'", "'whole'", "'part'", "'end'", "'{'", "'}'", "','", "'['", "'..'", "']'", "'gen'", "'super'", "'sub'", "'dependency'", "'derivation'", "'relation'", "'genset'", "'abstract'", "'disjoint'", "'complete'"
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

                if ( (LA1_0==14||LA1_0==17||LA1_0==29||(LA1_0>=32 && LA1_0<=33)||(LA1_0>=35 && LA1_0<=36)) ) {
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
    // InternalOntoUMLArchive.g:212:1: ruleBinaryAssociation : ( ( rule__BinaryAssociation__Alternatives ) ) ;
    public final void ruleBinaryAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:216:2: ( ( ( rule__BinaryAssociation__Alternatives ) ) )
            // InternalOntoUMLArchive.g:217:2: ( ( rule__BinaryAssociation__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:217:2: ( ( rule__BinaryAssociation__Alternatives ) )
            // InternalOntoUMLArchive.g:218:3: ( rule__BinaryAssociation__Alternatives )
            {
             before(grammarAccess.getBinaryAssociationAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:219:3: ( rule__BinaryAssociation__Alternatives )
            // InternalOntoUMLArchive.g:219:4: rule__BinaryAssociation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryAssociation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAssociationAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleRegularAssociation"
    // InternalOntoUMLArchive.g:228:1: entryRuleRegularAssociation : ruleRegularAssociation EOF ;
    public final void entryRuleRegularAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:229:1: ( ruleRegularAssociation EOF )
            // InternalOntoUMLArchive.g:230:1: ruleRegularAssociation EOF
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
    // InternalOntoUMLArchive.g:237:1: ruleRegularAssociation : ( ( rule__RegularAssociation__Group__0 ) ) ;
    public final void ruleRegularAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:241:2: ( ( ( rule__RegularAssociation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:242:2: ( ( rule__RegularAssociation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:242:2: ( ( rule__RegularAssociation__Group__0 ) )
            // InternalOntoUMLArchive.g:243:3: ( rule__RegularAssociation__Group__0 )
            {
             before(grammarAccess.getRegularAssociationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:244:3: ( rule__RegularAssociation__Group__0 )
            // InternalOntoUMLArchive.g:244:4: rule__RegularAssociation__Group__0
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


    // $ANTLR start "entryRuleParthoodAssociation"
    // InternalOntoUMLArchive.g:253:1: entryRuleParthoodAssociation : ruleParthoodAssociation EOF ;
    public final void entryRuleParthoodAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:254:1: ( ruleParthoodAssociation EOF )
            // InternalOntoUMLArchive.g:255:1: ruleParthoodAssociation EOF
            {
             before(grammarAccess.getParthoodAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleParthoodAssociation();

            state._fsp--;

             after(grammarAccess.getParthoodAssociationRule()); 
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
    // $ANTLR end "entryRuleParthoodAssociation"


    // $ANTLR start "ruleParthoodAssociation"
    // InternalOntoUMLArchive.g:262:1: ruleParthoodAssociation : ( ( rule__ParthoodAssociation__Group__0 ) ) ;
    public final void ruleParthoodAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:266:2: ( ( ( rule__ParthoodAssociation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:267:2: ( ( rule__ParthoodAssociation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:267:2: ( ( rule__ParthoodAssociation__Group__0 ) )
            // InternalOntoUMLArchive.g:268:3: ( rule__ParthoodAssociation__Group__0 )
            {
             before(grammarAccess.getParthoodAssociationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:269:3: ( rule__ParthoodAssociation__Group__0 )
            // InternalOntoUMLArchive.g:269:4: rule__ParthoodAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParthoodAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParthoodAssociationAccess().getGroup()); 

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
    // $ANTLR end "ruleParthoodAssociation"


    // $ANTLR start "entryRuleNaryAssociation"
    // InternalOntoUMLArchive.g:278:1: entryRuleNaryAssociation : ruleNaryAssociation EOF ;
    public final void entryRuleNaryAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:279:1: ( ruleNaryAssociation EOF )
            // InternalOntoUMLArchive.g:280:1: ruleNaryAssociation EOF
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
    // InternalOntoUMLArchive.g:287:1: ruleNaryAssociation : ( ( rule__NaryAssociation__Group__0 ) ) ;
    public final void ruleNaryAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:291:2: ( ( ( rule__NaryAssociation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:292:2: ( ( rule__NaryAssociation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:292:2: ( ( rule__NaryAssociation__Group__0 ) )
            // InternalOntoUMLArchive.g:293:3: ( rule__NaryAssociation__Group__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:294:3: ( rule__NaryAssociation__Group__0 )
            // InternalOntoUMLArchive.g:294:4: rule__NaryAssociation__Group__0
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
    // InternalOntoUMLArchive.g:303:1: entryRuleAssociationEnd : ruleAssociationEnd EOF ;
    public final void entryRuleAssociationEnd() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:304:1: ( ruleAssociationEnd EOF )
            // InternalOntoUMLArchive.g:305:1: ruleAssociationEnd EOF
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
    // InternalOntoUMLArchive.g:312:1: ruleAssociationEnd : ( ( rule__AssociationEnd__Group__0 ) ) ;
    public final void ruleAssociationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:316:2: ( ( ( rule__AssociationEnd__Group__0 ) ) )
            // InternalOntoUMLArchive.g:317:2: ( ( rule__AssociationEnd__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:317:2: ( ( rule__AssociationEnd__Group__0 ) )
            // InternalOntoUMLArchive.g:318:3: ( rule__AssociationEnd__Group__0 )
            {
             before(grammarAccess.getAssociationEndAccess().getGroup()); 
            // InternalOntoUMLArchive.g:319:3: ( rule__AssociationEnd__Group__0 )
            // InternalOntoUMLArchive.g:319:4: rule__AssociationEnd__Group__0
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
    // InternalOntoUMLArchive.g:328:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:329:1: ( ruleMultiplicity EOF )
            // InternalOntoUMLArchive.g:330:1: ruleMultiplicity EOF
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
    // InternalOntoUMLArchive.g:337:1: ruleMultiplicity : ( ( rule__Multiplicity__Group__0 ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:341:2: ( ( ( rule__Multiplicity__Group__0 ) ) )
            // InternalOntoUMLArchive.g:342:2: ( ( rule__Multiplicity__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:342:2: ( ( rule__Multiplicity__Group__0 ) )
            // InternalOntoUMLArchive.g:343:3: ( rule__Multiplicity__Group__0 )
            {
             before(grammarAccess.getMultiplicityAccess().getGroup()); 
            // InternalOntoUMLArchive.g:344:3: ( rule__Multiplicity__Group__0 )
            // InternalOntoUMLArchive.g:344:4: rule__Multiplicity__Group__0
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
    // InternalOntoUMLArchive.g:353:1: entryRuleCARDINALITY : ruleCARDINALITY EOF ;
    public final void entryRuleCARDINALITY() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:354:1: ( ruleCARDINALITY EOF )
            // InternalOntoUMLArchive.g:355:1: ruleCARDINALITY EOF
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
    // InternalOntoUMLArchive.g:362:1: ruleCARDINALITY : ( ( rule__CARDINALITY__Alternatives ) ) ;
    public final void ruleCARDINALITY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:366:2: ( ( ( rule__CARDINALITY__Alternatives ) ) )
            // InternalOntoUMLArchive.g:367:2: ( ( rule__CARDINALITY__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:367:2: ( ( rule__CARDINALITY__Alternatives ) )
            // InternalOntoUMLArchive.g:368:3: ( rule__CARDINALITY__Alternatives )
            {
             before(grammarAccess.getCARDINALITYAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:369:3: ( rule__CARDINALITY__Alternatives )
            // InternalOntoUMLArchive.g:369:4: rule__CARDINALITY__Alternatives
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
    // InternalOntoUMLArchive.g:378:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:379:1: ( ruleGeneralization EOF )
            // InternalOntoUMLArchive.g:380:1: ruleGeneralization EOF
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
    // InternalOntoUMLArchive.g:387:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:391:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalOntoUMLArchive.g:392:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:392:2: ( ( rule__Generalization__Group__0 ) )
            // InternalOntoUMLArchive.g:393:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:394:3: ( rule__Generalization__Group__0 )
            // InternalOntoUMLArchive.g:394:4: rule__Generalization__Group__0
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
    // InternalOntoUMLArchive.g:403:1: entryRuleDependencyLink : ruleDependencyLink EOF ;
    public final void entryRuleDependencyLink() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:404:1: ( ruleDependencyLink EOF )
            // InternalOntoUMLArchive.g:405:1: ruleDependencyLink EOF
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
    // InternalOntoUMLArchive.g:412:1: ruleDependencyLink : ( ( rule__DependencyLink__Group__0 ) ) ;
    public final void ruleDependencyLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:416:2: ( ( ( rule__DependencyLink__Group__0 ) ) )
            // InternalOntoUMLArchive.g:417:2: ( ( rule__DependencyLink__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:417:2: ( ( rule__DependencyLink__Group__0 ) )
            // InternalOntoUMLArchive.g:418:3: ( rule__DependencyLink__Group__0 )
            {
             before(grammarAccess.getDependencyLinkAccess().getGroup()); 
            // InternalOntoUMLArchive.g:419:3: ( rule__DependencyLink__Group__0 )
            // InternalOntoUMLArchive.g:419:4: rule__DependencyLink__Group__0
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
    // InternalOntoUMLArchive.g:428:1: entryRuleDerivation : ruleDerivation EOF ;
    public final void entryRuleDerivation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:429:1: ( ruleDerivation EOF )
            // InternalOntoUMLArchive.g:430:1: ruleDerivation EOF
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
    // InternalOntoUMLArchive.g:437:1: ruleDerivation : ( ( rule__Derivation__Group__0 ) ) ;
    public final void ruleDerivation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:441:2: ( ( ( rule__Derivation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:442:2: ( ( rule__Derivation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:442:2: ( ( rule__Derivation__Group__0 ) )
            // InternalOntoUMLArchive.g:443:3: ( rule__Derivation__Group__0 )
            {
             before(grammarAccess.getDerivationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:444:3: ( rule__Derivation__Group__0 )
            // InternalOntoUMLArchive.g:444:4: rule__Derivation__Group__0
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
    // InternalOntoUMLArchive.g:453:1: entryRuleClassDerivationEnd : ruleClassDerivationEnd EOF ;
    public final void entryRuleClassDerivationEnd() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:454:1: ( ruleClassDerivationEnd EOF )
            // InternalOntoUMLArchive.g:455:1: ruleClassDerivationEnd EOF
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
    // InternalOntoUMLArchive.g:462:1: ruleClassDerivationEnd : ( ( rule__ClassDerivationEnd__Group__0 ) ) ;
    public final void ruleClassDerivationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:466:2: ( ( ( rule__ClassDerivationEnd__Group__0 ) ) )
            // InternalOntoUMLArchive.g:467:2: ( ( rule__ClassDerivationEnd__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:467:2: ( ( rule__ClassDerivationEnd__Group__0 ) )
            // InternalOntoUMLArchive.g:468:3: ( rule__ClassDerivationEnd__Group__0 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getGroup()); 
            // InternalOntoUMLArchive.g:469:3: ( rule__ClassDerivationEnd__Group__0 )
            // InternalOntoUMLArchive.g:469:4: rule__ClassDerivationEnd__Group__0
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
    // InternalOntoUMLArchive.g:478:1: entryRuleRelationDerivationEnd : ruleRelationDerivationEnd EOF ;
    public final void entryRuleRelationDerivationEnd() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:479:1: ( ruleRelationDerivationEnd EOF )
            // InternalOntoUMLArchive.g:480:1: ruleRelationDerivationEnd EOF
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
    // InternalOntoUMLArchive.g:487:1: ruleRelationDerivationEnd : ( ( rule__RelationDerivationEnd__Group__0 ) ) ;
    public final void ruleRelationDerivationEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:491:2: ( ( ( rule__RelationDerivationEnd__Group__0 ) ) )
            // InternalOntoUMLArchive.g:492:2: ( ( rule__RelationDerivationEnd__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:492:2: ( ( rule__RelationDerivationEnd__Group__0 ) )
            // InternalOntoUMLArchive.g:493:3: ( rule__RelationDerivationEnd__Group__0 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getGroup()); 
            // InternalOntoUMLArchive.g:494:3: ( rule__RelationDerivationEnd__Group__0 )
            // InternalOntoUMLArchive.g:494:4: rule__RelationDerivationEnd__Group__0
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
    // InternalOntoUMLArchive.g:503:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:504:1: ( ruleGeneralizationSet EOF )
            // InternalOntoUMLArchive.g:505:1: ruleGeneralizationSet EOF
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
    // InternalOntoUMLArchive.g:512:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:516:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalOntoUMLArchive.g:517:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:517:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalOntoUMLArchive.g:518:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalOntoUMLArchive.g:519:3: ( rule__GeneralizationSet__Group__0 )
            // InternalOntoUMLArchive.g:519:4: rule__GeneralizationSet__Group__0
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


    // $ANTLR start "rule__ModelElement__Alternatives_0"
    // InternalOntoUMLArchive.g:527:1: rule__ModelElement__Alternatives_0 : ( ( ruleClass ) | ( ruleRelationship ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:531:1: ( ( ruleClass ) | ( ruleRelationship ) | ( ruleGeneralizationSet ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
            case 36:
                {
                alt2=1;
                }
                break;
            case 17:
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
                    // InternalOntoUMLArchive.g:532:2: ( ruleClass )
                    {
                    // InternalOntoUMLArchive.g:532:2: ( ruleClass )
                    // InternalOntoUMLArchive.g:533:3: ruleClass
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
                    // InternalOntoUMLArchive.g:538:2: ( ruleRelationship )
                    {
                    // InternalOntoUMLArchive.g:538:2: ( ruleRelationship )
                    // InternalOntoUMLArchive.g:539:3: ruleRelationship
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
                    // InternalOntoUMLArchive.g:544:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoUMLArchive.g:544:2: ( ruleGeneralizationSet )
                    // InternalOntoUMLArchive.g:545:3: ruleGeneralizationSet
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
    // InternalOntoUMLArchive.g:554:1: rule__Relationship__Alternatives : ( ( ruleAssociation ) | ( ruleGeneralization ) | ( ruleDependencyLink ) | ( ruleDerivation ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:558:1: ( ( ruleAssociation ) | ( ruleGeneralization ) | ( ruleDependencyLink ) | ( ruleDerivation ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
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
                    // InternalOntoUMLArchive.g:559:2: ( ruleAssociation )
                    {
                    // InternalOntoUMLArchive.g:559:2: ( ruleAssociation )
                    // InternalOntoUMLArchive.g:560:3: ruleAssociation
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
                    // InternalOntoUMLArchive.g:565:2: ( ruleGeneralization )
                    {
                    // InternalOntoUMLArchive.g:565:2: ( ruleGeneralization )
                    // InternalOntoUMLArchive.g:566:3: ruleGeneralization
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
                    // InternalOntoUMLArchive.g:571:2: ( ruleDependencyLink )
                    {
                    // InternalOntoUMLArchive.g:571:2: ( ruleDependencyLink )
                    // InternalOntoUMLArchive.g:572:3: ruleDependencyLink
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
                    // InternalOntoUMLArchive.g:577:2: ( ruleDerivation )
                    {
                    // InternalOntoUMLArchive.g:577:2: ( ruleDerivation )
                    // InternalOntoUMLArchive.g:578:3: ruleDerivation
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
    // InternalOntoUMLArchive.g:587:1: rule__Association__Alternatives : ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) );
    public final void rule__Association__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:591:1: ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalOntoUMLArchive.g:592:2: ( ruleBinaryAssociation )
                    {
                    // InternalOntoUMLArchive.g:592:2: ( ruleBinaryAssociation )
                    // InternalOntoUMLArchive.g:593:3: ruleBinaryAssociation
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
                    // InternalOntoUMLArchive.g:598:2: ( ruleNaryAssociation )
                    {
                    // InternalOntoUMLArchive.g:598:2: ( ruleNaryAssociation )
                    // InternalOntoUMLArchive.g:599:3: ruleNaryAssociation
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


    // $ANTLR start "rule__BinaryAssociation__Alternatives"
    // InternalOntoUMLArchive.g:608:1: rule__BinaryAssociation__Alternatives : ( ( ruleRegularAssociation ) | ( ruleParthoodAssociation ) );
    public final void rule__BinaryAssociation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:612:1: ( ( ruleRegularAssociation ) | ( ruleParthoodAssociation ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalOntoUMLArchive.g:613:2: ( ruleRegularAssociation )
                    {
                    // InternalOntoUMLArchive.g:613:2: ( ruleRegularAssociation )
                    // InternalOntoUMLArchive.g:614:3: ruleRegularAssociation
                    {
                     before(grammarAccess.getBinaryAssociationAccess().getRegularAssociationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRegularAssociation();

                    state._fsp--;

                     after(grammarAccess.getBinaryAssociationAccess().getRegularAssociationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:619:2: ( ruleParthoodAssociation )
                    {
                    // InternalOntoUMLArchive.g:619:2: ( ruleParthoodAssociation )
                    // InternalOntoUMLArchive.g:620:3: ruleParthoodAssociation
                    {
                     before(grammarAccess.getBinaryAssociationAccess().getParthoodAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParthoodAssociation();

                    state._fsp--;

                     after(grammarAccess.getBinaryAssociationAccess().getParthoodAssociationParserRuleCall_1()); 

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
    // $ANTLR end "rule__BinaryAssociation__Alternatives"


    // $ANTLR start "rule__CARDINALITY__Alternatives"
    // InternalOntoUMLArchive.g:629:1: rule__CARDINALITY__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CARDINALITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:633:1: ( ( '*' ) | ( RULE_INT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUMLArchive.g:634:2: ( '*' )
                    {
                    // InternalOntoUMLArchive.g:634:2: ( '*' )
                    // InternalOntoUMLArchive.g:635:3: '*'
                    {
                     before(grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:640:2: ( RULE_INT )
                    {
                    // InternalOntoUMLArchive.g:640:2: ( RULE_INT )
                    // InternalOntoUMLArchive.g:641:3: RULE_INT
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
    // InternalOntoUMLArchive.g:650:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:654:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalOntoUMLArchive.g:655:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
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
    // InternalOntoUMLArchive.g:662:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:666:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalOntoUMLArchive.g:667:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalOntoUMLArchive.g:667:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalOntoUMLArchive.g:668:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalOntoUMLArchive.g:669:2: ( rule__ModelElement__Alternatives_0 )
            // InternalOntoUMLArchive.g:669:3: rule__ModelElement__Alternatives_0
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
    // InternalOntoUMLArchive.g:677:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:681:1: ( rule__ModelElement__Group__1__Impl )
            // InternalOntoUMLArchive.g:682:2: rule__ModelElement__Group__1__Impl
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
    // InternalOntoUMLArchive.g:688:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:692:1: ( ( ';' ) )
            // InternalOntoUMLArchive.g:693:1: ( ';' )
            {
            // InternalOntoUMLArchive.g:693:1: ( ';' )
            // InternalOntoUMLArchive.g:694:2: ';'
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
    // InternalOntoUMLArchive.g:704:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:708:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalOntoUMLArchive.g:709:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalOntoUMLArchive.g:716:1: rule__Class__Group__0__Impl : ( ( rule__Class__IsAbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:720:1: ( ( ( rule__Class__IsAbstractAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:721:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:721:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            // InternalOntoUMLArchive.g:722:2: ( rule__Class__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 
            // InternalOntoUMLArchive.g:723:2: ( rule__Class__IsAbstractAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoUMLArchive.g:723:3: rule__Class__IsAbstractAssignment_0
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
    // InternalOntoUMLArchive.g:731:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:735:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalOntoUMLArchive.g:736:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalOntoUMLArchive.g:743:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:747:1: ( ( 'class' ) )
            // InternalOntoUMLArchive.g:748:1: ( 'class' )
            {
            // InternalOntoUMLArchive.g:748:1: ( 'class' )
            // InternalOntoUMLArchive.g:749:2: 'class'
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
    // InternalOntoUMLArchive.g:758:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:762:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalOntoUMLArchive.g:763:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalOntoUMLArchive.g:770:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:774:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalOntoUMLArchive.g:775:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalOntoUMLArchive.g:775:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalOntoUMLArchive.g:776:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalOntoUMLArchive.g:777:2: ( rule__Class__NameAssignment_2 )
            // InternalOntoUMLArchive.g:777:3: rule__Class__NameAssignment_2
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
    // InternalOntoUMLArchive.g:785:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:789:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalOntoUMLArchive.g:790:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalOntoUMLArchive.g:797:1: rule__Class__Group__3__Impl : ( ( rule__Class__StereotypesAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:801:1: ( ( ( rule__Class__StereotypesAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:802:1: ( ( rule__Class__StereotypesAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:802:1: ( ( rule__Class__StereotypesAssignment_3 )* )
            // InternalOntoUMLArchive.g:803:2: ( rule__Class__StereotypesAssignment_3 )*
            {
             before(grammarAccess.getClassAccess().getStereotypesAssignment_3()); 
            // InternalOntoUMLArchive.g:804:2: ( rule__Class__StereotypesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STEREOTYPE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:804:3: rule__Class__StereotypesAssignment_3
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
    // InternalOntoUMLArchive.g:812:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:816:1: ( rule__Class__Group__4__Impl )
            // InternalOntoUMLArchive.g:817:2: rule__Class__Group__4__Impl
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
    // InternalOntoUMLArchive.g:823:1: rule__Class__Group__4__Impl : ( ( rule__Class__AttributesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:827:1: ( ( ( rule__Class__AttributesAssignment_4 )* ) )
            // InternalOntoUMLArchive.g:828:1: ( ( rule__Class__AttributesAssignment_4 )* )
            {
            // InternalOntoUMLArchive.g:828:1: ( ( rule__Class__AttributesAssignment_4 )* )
            // InternalOntoUMLArchive.g:829:2: ( rule__Class__AttributesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4()); 
            // InternalOntoUMLArchive.g:830:2: ( rule__Class__AttributesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:830:3: rule__Class__AttributesAssignment_4
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
    // InternalOntoUMLArchive.g:839:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:843:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalOntoUMLArchive.g:844:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalOntoUMLArchive.g:851:1: rule__Attribute__Group__0__Impl : ( 'att' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:855:1: ( ( 'att' ) )
            // InternalOntoUMLArchive.g:856:1: ( 'att' )
            {
            // InternalOntoUMLArchive.g:856:1: ( 'att' )
            // InternalOntoUMLArchive.g:857:2: 'att'
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:866:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:870:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalOntoUMLArchive.g:871:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalOntoUMLArchive.g:878:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:882:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:883:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:883:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalOntoUMLArchive.g:884:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:885:2: ( rule__Attribute__NameAssignment_1 )
            // InternalOntoUMLArchive.g:885:3: rule__Attribute__NameAssignment_1
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
    // InternalOntoUMLArchive.g:893:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:897:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalOntoUMLArchive.g:898:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalOntoUMLArchive.g:905:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__MultiplicityAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:909:1: ( ( ( rule__Attribute__MultiplicityAssignment_2 ) ) )
            // InternalOntoUMLArchive.g:910:1: ( ( rule__Attribute__MultiplicityAssignment_2 ) )
            {
            // InternalOntoUMLArchive.g:910:1: ( ( rule__Attribute__MultiplicityAssignment_2 ) )
            // InternalOntoUMLArchive.g:911:2: ( rule__Attribute__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2()); 
            // InternalOntoUMLArchive.g:912:2: ( rule__Attribute__MultiplicityAssignment_2 )
            // InternalOntoUMLArchive.g:912:3: rule__Attribute__MultiplicityAssignment_2
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
    // InternalOntoUMLArchive.g:920:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:924:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalOntoUMLArchive.g:925:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalOntoUMLArchive.g:932:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:936:1: ( ( ':' ) )
            // InternalOntoUMLArchive.g:937:1: ( ':' )
            {
            // InternalOntoUMLArchive.g:937:1: ( ':' )
            // InternalOntoUMLArchive.g:938:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:947:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:951:1: ( rule__Attribute__Group__4__Impl )
            // InternalOntoUMLArchive.g:952:2: rule__Attribute__Group__4__Impl
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
    // InternalOntoUMLArchive.g:958:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__AttTypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:962:1: ( ( ( rule__Attribute__AttTypeAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:963:1: ( ( rule__Attribute__AttTypeAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:963:1: ( ( rule__Attribute__AttTypeAssignment_4 ) )
            // InternalOntoUMLArchive.g:964:2: ( rule__Attribute__AttTypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAssignment_4()); 
            // InternalOntoUMLArchive.g:965:2: ( rule__Attribute__AttTypeAssignment_4 )
            // InternalOntoUMLArchive.g:965:3: rule__Attribute__AttTypeAssignment_4
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


    // $ANTLR start "rule__RegularAssociation__Group__0"
    // InternalOntoUMLArchive.g:974:1: rule__RegularAssociation__Group__0 : rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1 ;
    public final void rule__RegularAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:978:1: ( rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1 )
            // InternalOntoUMLArchive.g:979:2: rule__RegularAssociation__Group__0__Impl rule__RegularAssociation__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalOntoUMLArchive.g:986:1: rule__RegularAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__RegularAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:990:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:991:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:991:1: ( 'association' )
            // InternalOntoUMLArchive.g:992:2: 'association'
            {
             before(grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1001:1: rule__RegularAssociation__Group__1 : rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2 ;
    public final void rule__RegularAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1005:1: ( rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2 )
            // InternalOntoUMLArchive.g:1006:2: rule__RegularAssociation__Group__1__Impl rule__RegularAssociation__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalOntoUMLArchive.g:1013:1: rule__RegularAssociation__Group__1__Impl : ( ( rule__RegularAssociation__NameAssignment_1 )? ) ;
    public final void rule__RegularAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1017:1: ( ( ( rule__RegularAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1018:1: ( ( rule__RegularAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1018:1: ( ( rule__RegularAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1019:2: ( rule__RegularAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getRegularAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1020:2: ( rule__RegularAssociation__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUMLArchive.g:1020:3: rule__RegularAssociation__NameAssignment_1
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
    // InternalOntoUMLArchive.g:1028:1: rule__RegularAssociation__Group__2 : rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3 ;
    public final void rule__RegularAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1032:1: ( rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3 )
            // InternalOntoUMLArchive.g:1033:2: rule__RegularAssociation__Group__2__Impl rule__RegularAssociation__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalOntoUMLArchive.g:1040:1: rule__RegularAssociation__Group__2__Impl : ( ( rule__RegularAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__RegularAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1044:1: ( ( ( rule__RegularAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1045:1: ( ( rule__RegularAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1045:1: ( ( rule__RegularAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1046:2: ( rule__RegularAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getRegularAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1047:2: ( rule__RegularAssociation__StereotypesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STEREOTYPE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1047:3: rule__RegularAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RegularAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRegularAssociationAccess().getStereotypesAssignment_2()); 

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
    // InternalOntoUMLArchive.g:1055:1: rule__RegularAssociation__Group__3 : rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4 ;
    public final void rule__RegularAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1059:1: ( rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1060:2: rule__RegularAssociation__Group__3__Impl rule__RegularAssociation__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1067:1: rule__RegularAssociation__Group__3__Impl : ( 'from' ) ;
    public final void rule__RegularAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1071:1: ( ( 'from' ) )
            // InternalOntoUMLArchive.g:1072:1: ( 'from' )
            {
            // InternalOntoUMLArchive.g:1072:1: ( 'from' )
            // InternalOntoUMLArchive.g:1073:2: 'from'
            {
             before(grammarAccess.getRegularAssociationAccess().getFromKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1082:1: rule__RegularAssociation__Group__4 : rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5 ;
    public final void rule__RegularAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1086:1: ( rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1087:2: rule__RegularAssociation__Group__4__Impl rule__RegularAssociation__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUMLArchive.g:1094:1: rule__RegularAssociation__Group__4__Impl : ( ( rule__RegularAssociation__FromAssignment_4 ) ) ;
    public final void rule__RegularAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1098:1: ( ( ( rule__RegularAssociation__FromAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:1099:1: ( ( rule__RegularAssociation__FromAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:1099:1: ( ( rule__RegularAssociation__FromAssignment_4 ) )
            // InternalOntoUMLArchive.g:1100:2: ( rule__RegularAssociation__FromAssignment_4 )
            {
             before(grammarAccess.getRegularAssociationAccess().getFromAssignment_4()); 
            // InternalOntoUMLArchive.g:1101:2: ( rule__RegularAssociation__FromAssignment_4 )
            // InternalOntoUMLArchive.g:1101:3: rule__RegularAssociation__FromAssignment_4
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
    // InternalOntoUMLArchive.g:1109:1: rule__RegularAssociation__Group__5 : rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6 ;
    public final void rule__RegularAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1113:1: ( rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6 )
            // InternalOntoUMLArchive.g:1114:2: rule__RegularAssociation__Group__5__Impl rule__RegularAssociation__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1121:1: rule__RegularAssociation__Group__5__Impl : ( 'to' ) ;
    public final void rule__RegularAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1125:1: ( ( 'to' ) )
            // InternalOntoUMLArchive.g:1126:1: ( 'to' )
            {
            // InternalOntoUMLArchive.g:1126:1: ( 'to' )
            // InternalOntoUMLArchive.g:1127:2: 'to'
            {
             before(grammarAccess.getRegularAssociationAccess().getToKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1136:1: rule__RegularAssociation__Group__6 : rule__RegularAssociation__Group__6__Impl ;
    public final void rule__RegularAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1140:1: ( rule__RegularAssociation__Group__6__Impl )
            // InternalOntoUMLArchive.g:1141:2: rule__RegularAssociation__Group__6__Impl
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
    // InternalOntoUMLArchive.g:1147:1: rule__RegularAssociation__Group__6__Impl : ( ( rule__RegularAssociation__ToAssignment_6 ) ) ;
    public final void rule__RegularAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1151:1: ( ( ( rule__RegularAssociation__ToAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:1152:1: ( ( rule__RegularAssociation__ToAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:1152:1: ( ( rule__RegularAssociation__ToAssignment_6 ) )
            // InternalOntoUMLArchive.g:1153:2: ( rule__RegularAssociation__ToAssignment_6 )
            {
             before(grammarAccess.getRegularAssociationAccess().getToAssignment_6()); 
            // InternalOntoUMLArchive.g:1154:2: ( rule__RegularAssociation__ToAssignment_6 )
            // InternalOntoUMLArchive.g:1154:3: rule__RegularAssociation__ToAssignment_6
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


    // $ANTLR start "rule__ParthoodAssociation__Group__0"
    // InternalOntoUMLArchive.g:1163:1: rule__ParthoodAssociation__Group__0 : rule__ParthoodAssociation__Group__0__Impl rule__ParthoodAssociation__Group__1 ;
    public final void rule__ParthoodAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1167:1: ( rule__ParthoodAssociation__Group__0__Impl rule__ParthoodAssociation__Group__1 )
            // InternalOntoUMLArchive.g:1168:2: rule__ParthoodAssociation__Group__0__Impl rule__ParthoodAssociation__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ParthoodAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParthoodAssociation__Group__1();

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
    // $ANTLR end "rule__ParthoodAssociation__Group__0"


    // $ANTLR start "rule__ParthoodAssociation__Group__0__Impl"
    // InternalOntoUMLArchive.g:1175:1: rule__ParthoodAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__ParthoodAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1179:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:1180:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:1180:1: ( 'association' )
            // InternalOntoUMLArchive.g:1181:2: 'association'
            {
             before(grammarAccess.getParthoodAssociationAccess().getAssociationKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParthoodAssociationAccess().getAssociationKeyword_0()); 

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
    // $ANTLR end "rule__ParthoodAssociation__Group__0__Impl"


    // $ANTLR start "rule__ParthoodAssociation__Group__1"
    // InternalOntoUMLArchive.g:1190:1: rule__ParthoodAssociation__Group__1 : rule__ParthoodAssociation__Group__1__Impl rule__ParthoodAssociation__Group__2 ;
    public final void rule__ParthoodAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1194:1: ( rule__ParthoodAssociation__Group__1__Impl rule__ParthoodAssociation__Group__2 )
            // InternalOntoUMLArchive.g:1195:2: rule__ParthoodAssociation__Group__1__Impl rule__ParthoodAssociation__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ParthoodAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParthoodAssociation__Group__2();

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
    // $ANTLR end "rule__ParthoodAssociation__Group__1"


    // $ANTLR start "rule__ParthoodAssociation__Group__1__Impl"
    // InternalOntoUMLArchive.g:1202:1: rule__ParthoodAssociation__Group__1__Impl : ( ( rule__ParthoodAssociation__NameAssignment_1 )? ) ;
    public final void rule__ParthoodAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1206:1: ( ( ( rule__ParthoodAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1207:1: ( ( rule__ParthoodAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1207:1: ( ( rule__ParthoodAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1208:2: ( rule__ParthoodAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getParthoodAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1209:2: ( rule__ParthoodAssociation__NameAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoUMLArchive.g:1209:3: rule__ParthoodAssociation__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParthoodAssociation__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParthoodAssociationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ParthoodAssociation__Group__1__Impl"


    // $ANTLR start "rule__ParthoodAssociation__Group__2"
    // InternalOntoUMLArchive.g:1217:1: rule__ParthoodAssociation__Group__2 : rule__ParthoodAssociation__Group__2__Impl rule__ParthoodAssociation__Group__3 ;
    public final void rule__ParthoodAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1221:1: ( rule__ParthoodAssociation__Group__2__Impl rule__ParthoodAssociation__Group__3 )
            // InternalOntoUMLArchive.g:1222:2: rule__ParthoodAssociation__Group__2__Impl rule__ParthoodAssociation__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ParthoodAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParthoodAssociation__Group__3();

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
    // $ANTLR end "rule__ParthoodAssociation__Group__2"


    // $ANTLR start "rule__ParthoodAssociation__Group__2__Impl"
    // InternalOntoUMLArchive.g:1229:1: rule__ParthoodAssociation__Group__2__Impl : ( ( rule__ParthoodAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__ParthoodAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1233:1: ( ( ( rule__ParthoodAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1234:1: ( ( rule__ParthoodAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1234:1: ( ( rule__ParthoodAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1235:2: ( rule__ParthoodAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getParthoodAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1236:2: ( rule__ParthoodAssociation__StereotypesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STEREOTYPE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1236:3: rule__ParthoodAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ParthoodAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getParthoodAssociationAccess().getStereotypesAssignment_2()); 

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
    // $ANTLR end "rule__ParthoodAssociation__Group__2__Impl"


    // $ANTLR start "rule__ParthoodAssociation__Group__3"
    // InternalOntoUMLArchive.g:1244:1: rule__ParthoodAssociation__Group__3 : rule__ParthoodAssociation__Group__3__Impl rule__ParthoodAssociation__Group__4 ;
    public final void rule__ParthoodAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1248:1: ( rule__ParthoodAssociation__Group__3__Impl rule__ParthoodAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1249:2: rule__ParthoodAssociation__Group__3__Impl rule__ParthoodAssociation__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ParthoodAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParthoodAssociation__Group__4();

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
    // $ANTLR end "rule__ParthoodAssociation__Group__3"


    // $ANTLR start "rule__ParthoodAssociation__Group__3__Impl"
    // InternalOntoUMLArchive.g:1256:1: rule__ParthoodAssociation__Group__3__Impl : ( 'whole' ) ;
    public final void rule__ParthoodAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1260:1: ( ( 'whole' ) )
            // InternalOntoUMLArchive.g:1261:1: ( 'whole' )
            {
            // InternalOntoUMLArchive.g:1261:1: ( 'whole' )
            // InternalOntoUMLArchive.g:1262:2: 'whole'
            {
             before(grammarAccess.getParthoodAssociationAccess().getWholeKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParthoodAssociationAccess().getWholeKeyword_3()); 

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
    // $ANTLR end "rule__ParthoodAssociation__Group__3__Impl"


    // $ANTLR start "rule__ParthoodAssociation__Group__4"
    // InternalOntoUMLArchive.g:1271:1: rule__ParthoodAssociation__Group__4 : rule__ParthoodAssociation__Group__4__Impl rule__ParthoodAssociation__Group__5 ;
    public final void rule__ParthoodAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1275:1: ( rule__ParthoodAssociation__Group__4__Impl rule__ParthoodAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1276:2: rule__ParthoodAssociation__Group__4__Impl rule__ParthoodAssociation__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__ParthoodAssociation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParthoodAssociation__Group__5();

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
    // $ANTLR end "rule__ParthoodAssociation__Group__4"


    // $ANTLR start "rule__ParthoodAssociation__Group__4__Impl"
    // InternalOntoUMLArchive.g:1283:1: rule__ParthoodAssociation__Group__4__Impl : ( ( rule__ParthoodAssociation__WholeAssignment_4 ) ) ;
    public final void rule__ParthoodAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1287:1: ( ( ( rule__ParthoodAssociation__WholeAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:1288:1: ( ( rule__ParthoodAssociation__WholeAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:1288:1: ( ( rule__ParthoodAssociation__WholeAssignment_4 ) )
            // InternalOntoUMLArchive.g:1289:2: ( rule__ParthoodAssociation__WholeAssignment_4 )
            {
             before(grammarAccess.getParthoodAssociationAccess().getWholeAssignment_4()); 
            // InternalOntoUMLArchive.g:1290:2: ( rule__ParthoodAssociation__WholeAssignment_4 )
            // InternalOntoUMLArchive.g:1290:3: rule__ParthoodAssociation__WholeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ParthoodAssociation__WholeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParthoodAssociationAccess().getWholeAssignment_4()); 

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
    // $ANTLR end "rule__ParthoodAssociation__Group__4__Impl"


    // $ANTLR start "rule__ParthoodAssociation__Group__5"
    // InternalOntoUMLArchive.g:1298:1: rule__ParthoodAssociation__Group__5 : rule__ParthoodAssociation__Group__5__Impl rule__ParthoodAssociation__Group__6 ;
    public final void rule__ParthoodAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1302:1: ( rule__ParthoodAssociation__Group__5__Impl rule__ParthoodAssociation__Group__6 )
            // InternalOntoUMLArchive.g:1303:2: rule__ParthoodAssociation__Group__5__Impl rule__ParthoodAssociation__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ParthoodAssociation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParthoodAssociation__Group__6();

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
    // $ANTLR end "rule__ParthoodAssociation__Group__5"


    // $ANTLR start "rule__ParthoodAssociation__Group__5__Impl"
    // InternalOntoUMLArchive.g:1310:1: rule__ParthoodAssociation__Group__5__Impl : ( 'part' ) ;
    public final void rule__ParthoodAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1314:1: ( ( 'part' ) )
            // InternalOntoUMLArchive.g:1315:1: ( 'part' )
            {
            // InternalOntoUMLArchive.g:1315:1: ( 'part' )
            // InternalOntoUMLArchive.g:1316:2: 'part'
            {
             before(grammarAccess.getParthoodAssociationAccess().getPartKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParthoodAssociationAccess().getPartKeyword_5()); 

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
    // $ANTLR end "rule__ParthoodAssociation__Group__5__Impl"


    // $ANTLR start "rule__ParthoodAssociation__Group__6"
    // InternalOntoUMLArchive.g:1325:1: rule__ParthoodAssociation__Group__6 : rule__ParthoodAssociation__Group__6__Impl ;
    public final void rule__ParthoodAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1329:1: ( rule__ParthoodAssociation__Group__6__Impl )
            // InternalOntoUMLArchive.g:1330:2: rule__ParthoodAssociation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParthoodAssociation__Group__6__Impl();

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
    // $ANTLR end "rule__ParthoodAssociation__Group__6"


    // $ANTLR start "rule__ParthoodAssociation__Group__6__Impl"
    // InternalOntoUMLArchive.g:1336:1: rule__ParthoodAssociation__Group__6__Impl : ( ( rule__ParthoodAssociation__PartAssignment_6 ) ) ;
    public final void rule__ParthoodAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1340:1: ( ( ( rule__ParthoodAssociation__PartAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:1341:1: ( ( rule__ParthoodAssociation__PartAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:1341:1: ( ( rule__ParthoodAssociation__PartAssignment_6 ) )
            // InternalOntoUMLArchive.g:1342:2: ( rule__ParthoodAssociation__PartAssignment_6 )
            {
             before(grammarAccess.getParthoodAssociationAccess().getPartAssignment_6()); 
            // InternalOntoUMLArchive.g:1343:2: ( rule__ParthoodAssociation__PartAssignment_6 )
            // InternalOntoUMLArchive.g:1343:3: rule__ParthoodAssociation__PartAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ParthoodAssociation__PartAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getParthoodAssociationAccess().getPartAssignment_6()); 

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
    // $ANTLR end "rule__ParthoodAssociation__Group__6__Impl"


    // $ANTLR start "rule__NaryAssociation__Group__0"
    // InternalOntoUMLArchive.g:1352:1: rule__NaryAssociation__Group__0 : rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1 ;
    public final void rule__NaryAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1356:1: ( rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1 )
            // InternalOntoUMLArchive.g:1357:2: rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoUMLArchive.g:1364:1: rule__NaryAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__NaryAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1368:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:1369:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:1369:1: ( 'association' )
            // InternalOntoUMLArchive.g:1370:2: 'association'
            {
             before(grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1379:1: rule__NaryAssociation__Group__1 : rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2 ;
    public final void rule__NaryAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1383:1: ( rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2 )
            // InternalOntoUMLArchive.g:1384:2: rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoUMLArchive.g:1391:1: rule__NaryAssociation__Group__1__Impl : ( ( rule__NaryAssociation__NameAssignment_1 )? ) ;
    public final void rule__NaryAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1395:1: ( ( ( rule__NaryAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1396:1: ( ( rule__NaryAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1396:1: ( ( rule__NaryAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1397:2: ( rule__NaryAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getNaryAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1398:2: ( rule__NaryAssociation__NameAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOntoUMLArchive.g:1398:3: rule__NaryAssociation__NameAssignment_1
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
    // InternalOntoUMLArchive.g:1406:1: rule__NaryAssociation__Group__2 : rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3 ;
    public final void rule__NaryAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1410:1: ( rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3 )
            // InternalOntoUMLArchive.g:1411:2: rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoUMLArchive.g:1418:1: rule__NaryAssociation__Group__2__Impl : ( ( rule__NaryAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__NaryAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1422:1: ( ( ( rule__NaryAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1423:1: ( ( rule__NaryAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1423:1: ( ( rule__NaryAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1424:2: ( rule__NaryAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getNaryAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1425:2: ( rule__NaryAssociation__StereotypesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STEREOTYPE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1425:3: rule__NaryAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__NaryAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalOntoUMLArchive.g:1433:1: rule__NaryAssociation__Group__3 : rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4 ;
    public final void rule__NaryAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1437:1: ( rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1438:2: rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalOntoUMLArchive.g:1445:1: rule__NaryAssociation__Group__3__Impl : ( ( rule__NaryAssociation__Group_3__0 ) ) ;
    public final void rule__NaryAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1449:1: ( ( ( rule__NaryAssociation__Group_3__0 ) ) )
            // InternalOntoUMLArchive.g:1450:1: ( ( rule__NaryAssociation__Group_3__0 ) )
            {
            // InternalOntoUMLArchive.g:1450:1: ( ( rule__NaryAssociation__Group_3__0 ) )
            // InternalOntoUMLArchive.g:1451:2: ( rule__NaryAssociation__Group_3__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_3()); 
            // InternalOntoUMLArchive.g:1452:2: ( rule__NaryAssociation__Group_3__0 )
            // InternalOntoUMLArchive.g:1452:3: rule__NaryAssociation__Group_3__0
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
    // InternalOntoUMLArchive.g:1460:1: rule__NaryAssociation__Group__4 : rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5 ;
    public final void rule__NaryAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1464:1: ( rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1465:2: rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalOntoUMLArchive.g:1472:1: rule__NaryAssociation__Group__4__Impl : ( ( rule__NaryAssociation__Group_4__0 ) ) ;
    public final void rule__NaryAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1476:1: ( ( ( rule__NaryAssociation__Group_4__0 ) ) )
            // InternalOntoUMLArchive.g:1477:1: ( ( rule__NaryAssociation__Group_4__0 ) )
            {
            // InternalOntoUMLArchive.g:1477:1: ( ( rule__NaryAssociation__Group_4__0 ) )
            // InternalOntoUMLArchive.g:1478:2: ( rule__NaryAssociation__Group_4__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_4()); 
            // InternalOntoUMLArchive.g:1479:2: ( rule__NaryAssociation__Group_4__0 )
            // InternalOntoUMLArchive.g:1479:3: rule__NaryAssociation__Group_4__0
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
    // InternalOntoUMLArchive.g:1487:1: rule__NaryAssociation__Group__5 : rule__NaryAssociation__Group__5__Impl ;
    public final void rule__NaryAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1491:1: ( rule__NaryAssociation__Group__5__Impl )
            // InternalOntoUMLArchive.g:1492:2: rule__NaryAssociation__Group__5__Impl
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
    // InternalOntoUMLArchive.g:1498:1: rule__NaryAssociation__Group__5__Impl : ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) ) ;
    public final void rule__NaryAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1502:1: ( ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) ) )
            // InternalOntoUMLArchive.g:1503:1: ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) )
            {
            // InternalOntoUMLArchive.g:1503:1: ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) )
            // InternalOntoUMLArchive.g:1504:2: ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* )
            {
            // InternalOntoUMLArchive.g:1504:2: ( ( rule__NaryAssociation__Group_5__0 ) )
            // InternalOntoUMLArchive.g:1505:3: ( rule__NaryAssociation__Group_5__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1506:3: ( rule__NaryAssociation__Group_5__0 )
            // InternalOntoUMLArchive.g:1506:4: rule__NaryAssociation__Group_5__0
            {
            pushFollow(FOLLOW_19);
            rule__NaryAssociation__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getGroup_5()); 

            }

            // InternalOntoUMLArchive.g:1509:2: ( ( rule__NaryAssociation__Group_5__0 )* )
            // InternalOntoUMLArchive.g:1510:3: ( rule__NaryAssociation__Group_5__0 )*
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1511:3: ( rule__NaryAssociation__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1511:4: rule__NaryAssociation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__NaryAssociation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalOntoUMLArchive.g:1521:1: rule__NaryAssociation__Group_3__0 : rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1 ;
    public final void rule__NaryAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1525:1: ( rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1 )
            // InternalOntoUMLArchive.g:1526:2: rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1
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
    // InternalOntoUMLArchive.g:1533:1: rule__NaryAssociation__Group_3__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1537:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1538:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1538:1: ( 'end' )
            // InternalOntoUMLArchive.g:1539:2: 'end'
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
    // InternalOntoUMLArchive.g:1548:1: rule__NaryAssociation__Group_3__1 : rule__NaryAssociation__Group_3__1__Impl ;
    public final void rule__NaryAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1552:1: ( rule__NaryAssociation__Group_3__1__Impl )
            // InternalOntoUMLArchive.g:1553:2: rule__NaryAssociation__Group_3__1__Impl
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
    // InternalOntoUMLArchive.g:1559:1: rule__NaryAssociation__Group_3__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_3_1 ) ) ;
    public final void rule__NaryAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1563:1: ( ( ( rule__NaryAssociation__EndsAssignment_3_1 ) ) )
            // InternalOntoUMLArchive.g:1564:1: ( ( rule__NaryAssociation__EndsAssignment_3_1 ) )
            {
            // InternalOntoUMLArchive.g:1564:1: ( ( rule__NaryAssociation__EndsAssignment_3_1 ) )
            // InternalOntoUMLArchive.g:1565:2: ( rule__NaryAssociation__EndsAssignment_3_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_3_1()); 
            // InternalOntoUMLArchive.g:1566:2: ( rule__NaryAssociation__EndsAssignment_3_1 )
            // InternalOntoUMLArchive.g:1566:3: rule__NaryAssociation__EndsAssignment_3_1
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
    // InternalOntoUMLArchive.g:1575:1: rule__NaryAssociation__Group_4__0 : rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1 ;
    public final void rule__NaryAssociation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1579:1: ( rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1 )
            // InternalOntoUMLArchive.g:1580:2: rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1
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
    // InternalOntoUMLArchive.g:1587:1: rule__NaryAssociation__Group_4__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1591:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1592:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1592:1: ( 'end' )
            // InternalOntoUMLArchive.g:1593:2: 'end'
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
    // InternalOntoUMLArchive.g:1602:1: rule__NaryAssociation__Group_4__1 : rule__NaryAssociation__Group_4__1__Impl ;
    public final void rule__NaryAssociation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1606:1: ( rule__NaryAssociation__Group_4__1__Impl )
            // InternalOntoUMLArchive.g:1607:2: rule__NaryAssociation__Group_4__1__Impl
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
    // InternalOntoUMLArchive.g:1613:1: rule__NaryAssociation__Group_4__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_4_1 ) ) ;
    public final void rule__NaryAssociation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1617:1: ( ( ( rule__NaryAssociation__EndsAssignment_4_1 ) ) )
            // InternalOntoUMLArchive.g:1618:1: ( ( rule__NaryAssociation__EndsAssignment_4_1 ) )
            {
            // InternalOntoUMLArchive.g:1618:1: ( ( rule__NaryAssociation__EndsAssignment_4_1 ) )
            // InternalOntoUMLArchive.g:1619:2: ( rule__NaryAssociation__EndsAssignment_4_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_4_1()); 
            // InternalOntoUMLArchive.g:1620:2: ( rule__NaryAssociation__EndsAssignment_4_1 )
            // InternalOntoUMLArchive.g:1620:3: rule__NaryAssociation__EndsAssignment_4_1
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
    // InternalOntoUMLArchive.g:1629:1: rule__NaryAssociation__Group_5__0 : rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1 ;
    public final void rule__NaryAssociation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1633:1: ( rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1 )
            // InternalOntoUMLArchive.g:1634:2: rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1
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
    // InternalOntoUMLArchive.g:1641:1: rule__NaryAssociation__Group_5__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1645:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1646:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1646:1: ( 'end' )
            // InternalOntoUMLArchive.g:1647:2: 'end'
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
    // InternalOntoUMLArchive.g:1656:1: rule__NaryAssociation__Group_5__1 : rule__NaryAssociation__Group_5__1__Impl ;
    public final void rule__NaryAssociation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1660:1: ( rule__NaryAssociation__Group_5__1__Impl )
            // InternalOntoUMLArchive.g:1661:2: rule__NaryAssociation__Group_5__1__Impl
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
    // InternalOntoUMLArchive.g:1667:1: rule__NaryAssociation__Group_5__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_5_1 ) ) ;
    public final void rule__NaryAssociation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1671:1: ( ( ( rule__NaryAssociation__EndsAssignment_5_1 ) ) )
            // InternalOntoUMLArchive.g:1672:1: ( ( rule__NaryAssociation__EndsAssignment_5_1 ) )
            {
            // InternalOntoUMLArchive.g:1672:1: ( ( rule__NaryAssociation__EndsAssignment_5_1 ) )
            // InternalOntoUMLArchive.g:1673:2: ( rule__NaryAssociation__EndsAssignment_5_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_5_1()); 
            // InternalOntoUMLArchive.g:1674:2: ( rule__NaryAssociation__EndsAssignment_5_1 )
            // InternalOntoUMLArchive.g:1674:3: rule__NaryAssociation__EndsAssignment_5_1
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
    // InternalOntoUMLArchive.g:1683:1: rule__AssociationEnd__Group__0 : rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 ;
    public final void rule__AssociationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1687:1: ( rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 )
            // InternalOntoUMLArchive.g:1688:2: rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1
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
    // InternalOntoUMLArchive.g:1695:1: rule__AssociationEnd__Group__0__Impl : ( ( rule__AssociationEnd__NameAssignment_0 )? ) ;
    public final void rule__AssociationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1699:1: ( ( ( rule__AssociationEnd__NameAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:1700:1: ( ( rule__AssociationEnd__NameAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:1700:1: ( ( rule__AssociationEnd__NameAssignment_0 )? )
            // InternalOntoUMLArchive.g:1701:2: ( rule__AssociationEnd__NameAssignment_0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getNameAssignment_0()); 
            // InternalOntoUMLArchive.g:1702:2: ( rule__AssociationEnd__NameAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOntoUMLArchive.g:1702:3: rule__AssociationEnd__NameAssignment_0
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
    // InternalOntoUMLArchive.g:1710:1: rule__AssociationEnd__Group__1 : rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 ;
    public final void rule__AssociationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1714:1: ( rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 )
            // InternalOntoUMLArchive.g:1715:2: rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalOntoUMLArchive.g:1722:1: rule__AssociationEnd__Group__1__Impl : ( ( rule__AssociationEnd__MultiplicityAssignment_1 ) ) ;
    public final void rule__AssociationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1726:1: ( ( ( rule__AssociationEnd__MultiplicityAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:1727:1: ( ( rule__AssociationEnd__MultiplicityAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:1727:1: ( ( rule__AssociationEnd__MultiplicityAssignment_1 ) )
            // InternalOntoUMLArchive.g:1728:2: ( rule__AssociationEnd__MultiplicityAssignment_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getMultiplicityAssignment_1()); 
            // InternalOntoUMLArchive.g:1729:2: ( rule__AssociationEnd__MultiplicityAssignment_1 )
            // InternalOntoUMLArchive.g:1729:3: rule__AssociationEnd__MultiplicityAssignment_1
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
    // InternalOntoUMLArchive.g:1737:1: rule__AssociationEnd__Group__2 : rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 ;
    public final void rule__AssociationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1741:1: ( rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 )
            // InternalOntoUMLArchive.g:1742:2: rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3
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
    // InternalOntoUMLArchive.g:1749:1: rule__AssociationEnd__Group__2__Impl : ( ':' ) ;
    public final void rule__AssociationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1753:1: ( ( ':' ) )
            // InternalOntoUMLArchive.g:1754:1: ( ':' )
            {
            // InternalOntoUMLArchive.g:1754:1: ( ':' )
            // InternalOntoUMLArchive.g:1755:2: ':'
            {
             before(grammarAccess.getAssociationEndAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1764:1: rule__AssociationEnd__Group__3 : rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 ;
    public final void rule__AssociationEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1768:1: ( rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 )
            // InternalOntoUMLArchive.g:1769:2: rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalOntoUMLArchive.g:1776:1: rule__AssociationEnd__Group__3__Impl : ( ( rule__AssociationEnd__EndTypeAssignment_3 ) ) ;
    public final void rule__AssociationEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1780:1: ( ( ( rule__AssociationEnd__EndTypeAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:1781:1: ( ( rule__AssociationEnd__EndTypeAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:1781:1: ( ( rule__AssociationEnd__EndTypeAssignment_3 ) )
            // InternalOntoUMLArchive.g:1782:2: ( rule__AssociationEnd__EndTypeAssignment_3 )
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeAssignment_3()); 
            // InternalOntoUMLArchive.g:1783:2: ( rule__AssociationEnd__EndTypeAssignment_3 )
            // InternalOntoUMLArchive.g:1783:3: rule__AssociationEnd__EndTypeAssignment_3
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


    // $ANTLR start "rule__AssociationEnd__Group__4"
    // InternalOntoUMLArchive.g:1791:1: rule__AssociationEnd__Group__4 : rule__AssociationEnd__Group__4__Impl ;
    public final void rule__AssociationEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1795:1: ( rule__AssociationEnd__Group__4__Impl )
            // InternalOntoUMLArchive.g:1796:2: rule__AssociationEnd__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group__4__Impl();

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
    // InternalOntoUMLArchive.g:1802:1: rule__AssociationEnd__Group__4__Impl : ( ( rule__AssociationEnd__Group_4__0 )? ) ;
    public final void rule__AssociationEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1806:1: ( ( ( rule__AssociationEnd__Group_4__0 )? ) )
            // InternalOntoUMLArchive.g:1807:1: ( ( rule__AssociationEnd__Group_4__0 )? )
            {
            // InternalOntoUMLArchive.g:1807:1: ( ( rule__AssociationEnd__Group_4__0 )? )
            // InternalOntoUMLArchive.g:1808:2: ( rule__AssociationEnd__Group_4__0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_4()); 
            // InternalOntoUMLArchive.g:1809:2: ( rule__AssociationEnd__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoUMLArchive.g:1809:3: rule__AssociationEnd__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationEndAccess().getGroup_4()); 

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


    // $ANTLR start "rule__AssociationEnd__Group_4__0"
    // InternalOntoUMLArchive.g:1818:1: rule__AssociationEnd__Group_4__0 : rule__AssociationEnd__Group_4__0__Impl rule__AssociationEnd__Group_4__1 ;
    public final void rule__AssociationEnd__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1822:1: ( rule__AssociationEnd__Group_4__0__Impl rule__AssociationEnd__Group_4__1 )
            // InternalOntoUMLArchive.g:1823:2: rule__AssociationEnd__Group_4__0__Impl rule__AssociationEnd__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__AssociationEnd__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_4__1();

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
    // $ANTLR end "rule__AssociationEnd__Group_4__0"


    // $ANTLR start "rule__AssociationEnd__Group_4__0__Impl"
    // InternalOntoUMLArchive.g:1830:1: rule__AssociationEnd__Group_4__0__Impl : ( '{' ) ;
    public final void rule__AssociationEnd__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1834:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:1835:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:1835:1: ( '{' )
            // InternalOntoUMLArchive.g:1836:2: '{'
            {
             before(grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_4__0__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_4__1"
    // InternalOntoUMLArchive.g:1845:1: rule__AssociationEnd__Group_4__1 : rule__AssociationEnd__Group_4__1__Impl rule__AssociationEnd__Group_4__2 ;
    public final void rule__AssociationEnd__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1849:1: ( rule__AssociationEnd__Group_4__1__Impl rule__AssociationEnd__Group_4__2 )
            // InternalOntoUMLArchive.g:1850:2: rule__AssociationEnd__Group_4__1__Impl rule__AssociationEnd__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__AssociationEnd__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_4__2();

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
    // $ANTLR end "rule__AssociationEnd__Group_4__1"


    // $ANTLR start "rule__AssociationEnd__Group_4__1__Impl"
    // InternalOntoUMLArchive.g:1857:1: rule__AssociationEnd__Group_4__1__Impl : ( ( rule__AssociationEnd__ConstraintsAssignment_4_1 ) ) ;
    public final void rule__AssociationEnd__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1861:1: ( ( ( rule__AssociationEnd__ConstraintsAssignment_4_1 ) ) )
            // InternalOntoUMLArchive.g:1862:1: ( ( rule__AssociationEnd__ConstraintsAssignment_4_1 ) )
            {
            // InternalOntoUMLArchive.g:1862:1: ( ( rule__AssociationEnd__ConstraintsAssignment_4_1 ) )
            // InternalOntoUMLArchive.g:1863:2: ( rule__AssociationEnd__ConstraintsAssignment_4_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_4_1()); 
            // InternalOntoUMLArchive.g:1864:2: ( rule__AssociationEnd__ConstraintsAssignment_4_1 )
            // InternalOntoUMLArchive.g:1864:3: rule__AssociationEnd__ConstraintsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__ConstraintsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_4_1()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_4__1__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_4__2"
    // InternalOntoUMLArchive.g:1872:1: rule__AssociationEnd__Group_4__2 : rule__AssociationEnd__Group_4__2__Impl rule__AssociationEnd__Group_4__3 ;
    public final void rule__AssociationEnd__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1876:1: ( rule__AssociationEnd__Group_4__2__Impl rule__AssociationEnd__Group_4__3 )
            // InternalOntoUMLArchive.g:1877:2: rule__AssociationEnd__Group_4__2__Impl rule__AssociationEnd__Group_4__3
            {
            pushFollow(FOLLOW_21);
            rule__AssociationEnd__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_4__3();

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
    // $ANTLR end "rule__AssociationEnd__Group_4__2"


    // $ANTLR start "rule__AssociationEnd__Group_4__2__Impl"
    // InternalOntoUMLArchive.g:1884:1: rule__AssociationEnd__Group_4__2__Impl : ( ( rule__AssociationEnd__Group_4_2__0 )* ) ;
    public final void rule__AssociationEnd__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1888:1: ( ( ( rule__AssociationEnd__Group_4_2__0 )* ) )
            // InternalOntoUMLArchive.g:1889:1: ( ( rule__AssociationEnd__Group_4_2__0 )* )
            {
            // InternalOntoUMLArchive.g:1889:1: ( ( rule__AssociationEnd__Group_4_2__0 )* )
            // InternalOntoUMLArchive.g:1890:2: ( rule__AssociationEnd__Group_4_2__0 )*
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_4_2()); 
            // InternalOntoUMLArchive.g:1891:2: ( rule__AssociationEnd__Group_4_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1891:3: rule__AssociationEnd__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__AssociationEnd__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAssociationEndAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_4__2__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_4__3"
    // InternalOntoUMLArchive.g:1899:1: rule__AssociationEnd__Group_4__3 : rule__AssociationEnd__Group_4__3__Impl ;
    public final void rule__AssociationEnd__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1903:1: ( rule__AssociationEnd__Group_4__3__Impl )
            // InternalOntoUMLArchive.g:1904:2: rule__AssociationEnd__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_4__3__Impl();

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
    // $ANTLR end "rule__AssociationEnd__Group_4__3"


    // $ANTLR start "rule__AssociationEnd__Group_4__3__Impl"
    // InternalOntoUMLArchive.g:1910:1: rule__AssociationEnd__Group_4__3__Impl : ( '}' ) ;
    public final void rule__AssociationEnd__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1914:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:1915:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:1915:1: ( '}' )
            // InternalOntoUMLArchive.g:1916:2: '}'
            {
             before(grammarAccess.getAssociationEndAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_4__3__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_4_2__0"
    // InternalOntoUMLArchive.g:1926:1: rule__AssociationEnd__Group_4_2__0 : rule__AssociationEnd__Group_4_2__0__Impl rule__AssociationEnd__Group_4_2__1 ;
    public final void rule__AssociationEnd__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1930:1: ( rule__AssociationEnd__Group_4_2__0__Impl rule__AssociationEnd__Group_4_2__1 )
            // InternalOntoUMLArchive.g:1931:2: rule__AssociationEnd__Group_4_2__0__Impl rule__AssociationEnd__Group_4_2__1
            {
            pushFollow(FOLLOW_6);
            rule__AssociationEnd__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_4_2__1();

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
    // $ANTLR end "rule__AssociationEnd__Group_4_2__0"


    // $ANTLR start "rule__AssociationEnd__Group_4_2__0__Impl"
    // InternalOntoUMLArchive.g:1938:1: rule__AssociationEnd__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationEnd__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1942:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:1943:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:1943:1: ( ',' )
            // InternalOntoUMLArchive.g:1944:2: ','
            {
             before(grammarAccess.getAssociationEndAccess().getCommaKeyword_4_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_4_2__0__Impl"


    // $ANTLR start "rule__AssociationEnd__Group_4_2__1"
    // InternalOntoUMLArchive.g:1953:1: rule__AssociationEnd__Group_4_2__1 : rule__AssociationEnd__Group_4_2__1__Impl ;
    public final void rule__AssociationEnd__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1957:1: ( rule__AssociationEnd__Group_4_2__1__Impl )
            // InternalOntoUMLArchive.g:1958:2: rule__AssociationEnd__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__AssociationEnd__Group_4_2__1"


    // $ANTLR start "rule__AssociationEnd__Group_4_2__1__Impl"
    // InternalOntoUMLArchive.g:1964:1: rule__AssociationEnd__Group_4_2__1__Impl : ( ( rule__AssociationEnd__ConstraintsAssignment_4_2_1 ) ) ;
    public final void rule__AssociationEnd__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1968:1: ( ( ( rule__AssociationEnd__ConstraintsAssignment_4_2_1 ) ) )
            // InternalOntoUMLArchive.g:1969:1: ( ( rule__AssociationEnd__ConstraintsAssignment_4_2_1 ) )
            {
            // InternalOntoUMLArchive.g:1969:1: ( ( rule__AssociationEnd__ConstraintsAssignment_4_2_1 ) )
            // InternalOntoUMLArchive.g:1970:2: ( rule__AssociationEnd__ConstraintsAssignment_4_2_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_4_2_1()); 
            // InternalOntoUMLArchive.g:1971:2: ( rule__AssociationEnd__ConstraintsAssignment_4_2_1 )
            // InternalOntoUMLArchive.g:1971:3: rule__AssociationEnd__ConstraintsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__ConstraintsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__AssociationEnd__Group_4_2__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group__0"
    // InternalOntoUMLArchive.g:1980:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1984:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // InternalOntoUMLArchive.g:1985:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalOntoUMLArchive.g:1992:1: rule__Multiplicity__Group__0__Impl : ( '[' ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1996:1: ( ( '[' ) )
            // InternalOntoUMLArchive.g:1997:1: ( '[' )
            {
            // InternalOntoUMLArchive.g:1997:1: ( '[' )
            // InternalOntoUMLArchive.g:1998:2: '['
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
    // InternalOntoUMLArchive.g:2007:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2011:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // InternalOntoUMLArchive.g:2012:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalOntoUMLArchive.g:2019:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__LowerAssignment_1 ) ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2023:1: ( ( ( rule__Multiplicity__LowerAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:2024:1: ( ( rule__Multiplicity__LowerAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:2024:1: ( ( rule__Multiplicity__LowerAssignment_1 ) )
            // InternalOntoUMLArchive.g:2025:2: ( rule__Multiplicity__LowerAssignment_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getLowerAssignment_1()); 
            // InternalOntoUMLArchive.g:2026:2: ( rule__Multiplicity__LowerAssignment_1 )
            // InternalOntoUMLArchive.g:2026:3: rule__Multiplicity__LowerAssignment_1
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
    // InternalOntoUMLArchive.g:2034:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2038:1: ( rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 )
            // InternalOntoUMLArchive.g:2039:2: rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalOntoUMLArchive.g:2046:1: rule__Multiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2050:1: ( ( '..' ) )
            // InternalOntoUMLArchive.g:2051:1: ( '..' )
            {
            // InternalOntoUMLArchive.g:2051:1: ( '..' )
            // InternalOntoUMLArchive.g:2052:2: '..'
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
    // InternalOntoUMLArchive.g:2061:1: rule__Multiplicity__Group__3 : rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 ;
    public final void rule__Multiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2065:1: ( rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 )
            // InternalOntoUMLArchive.g:2066:2: rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalOntoUMLArchive.g:2073:1: rule__Multiplicity__Group__3__Impl : ( ( rule__Multiplicity__UpperAssignment_3 ) ) ;
    public final void rule__Multiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2077:1: ( ( ( rule__Multiplicity__UpperAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:2078:1: ( ( rule__Multiplicity__UpperAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:2078:1: ( ( rule__Multiplicity__UpperAssignment_3 ) )
            // InternalOntoUMLArchive.g:2079:2: ( rule__Multiplicity__UpperAssignment_3 )
            {
             before(grammarAccess.getMultiplicityAccess().getUpperAssignment_3()); 
            // InternalOntoUMLArchive.g:2080:2: ( rule__Multiplicity__UpperAssignment_3 )
            // InternalOntoUMLArchive.g:2080:3: rule__Multiplicity__UpperAssignment_3
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
    // InternalOntoUMLArchive.g:2088:1: rule__Multiplicity__Group__4 : rule__Multiplicity__Group__4__Impl ;
    public final void rule__Multiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2092:1: ( rule__Multiplicity__Group__4__Impl )
            // InternalOntoUMLArchive.g:2093:2: rule__Multiplicity__Group__4__Impl
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
    // InternalOntoUMLArchive.g:2099:1: rule__Multiplicity__Group__4__Impl : ( ']' ) ;
    public final void rule__Multiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2103:1: ( ( ']' ) )
            // InternalOntoUMLArchive.g:2104:1: ( ']' )
            {
            // InternalOntoUMLArchive.g:2104:1: ( ']' )
            // InternalOntoUMLArchive.g:2105:2: ']'
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
    // InternalOntoUMLArchive.g:2115:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2119:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalOntoUMLArchive.g:2120:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalOntoUMLArchive.g:2127:1: rule__Generalization__Group__0__Impl : ( 'gen' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2131:1: ( ( 'gen' ) )
            // InternalOntoUMLArchive.g:2132:1: ( 'gen' )
            {
            // InternalOntoUMLArchive.g:2132:1: ( 'gen' )
            // InternalOntoUMLArchive.g:2133:2: 'gen'
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
    // InternalOntoUMLArchive.g:2142:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2146:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalOntoUMLArchive.g:2147:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalOntoUMLArchive.g:2154:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__NameAssignment_1 )? ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2158:1: ( ( ( rule__Generalization__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2159:1: ( ( rule__Generalization__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2159:1: ( ( rule__Generalization__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2160:2: ( rule__Generalization__NameAssignment_1 )?
            {
             before(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2161:2: ( rule__Generalization__NameAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoUMLArchive.g:2161:3: rule__Generalization__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2169:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2173:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalOntoUMLArchive.g:2174:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
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
    // InternalOntoUMLArchive.g:2181:1: rule__Generalization__Group__2__Impl : ( 'super' ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2185:1: ( ( 'super' ) )
            // InternalOntoUMLArchive.g:2186:1: ( 'super' )
            {
            // InternalOntoUMLArchive.g:2186:1: ( 'super' )
            // InternalOntoUMLArchive.g:2187:2: 'super'
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
    // InternalOntoUMLArchive.g:2196:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2200:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalOntoUMLArchive.g:2201:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalOntoUMLArchive.g:2208:1: rule__Generalization__Group__3__Impl : ( ( rule__Generalization__SuperAssignment_3 ) ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2212:1: ( ( ( rule__Generalization__SuperAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:2213:1: ( ( rule__Generalization__SuperAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:2213:1: ( ( rule__Generalization__SuperAssignment_3 ) )
            // InternalOntoUMLArchive.g:2214:2: ( rule__Generalization__SuperAssignment_3 )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperAssignment_3()); 
            // InternalOntoUMLArchive.g:2215:2: ( rule__Generalization__SuperAssignment_3 )
            // InternalOntoUMLArchive.g:2215:3: rule__Generalization__SuperAssignment_3
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
    // InternalOntoUMLArchive.g:2223:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2227:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalOntoUMLArchive.g:2228:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
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
    // InternalOntoUMLArchive.g:2235:1: rule__Generalization__Group__4__Impl : ( 'sub' ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2239:1: ( ( 'sub' ) )
            // InternalOntoUMLArchive.g:2240:1: ( 'sub' )
            {
            // InternalOntoUMLArchive.g:2240:1: ( 'sub' )
            // InternalOntoUMLArchive.g:2241:2: 'sub'
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
    // InternalOntoUMLArchive.g:2250:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2254:1: ( rule__Generalization__Group__5__Impl )
            // InternalOntoUMLArchive.g:2255:2: rule__Generalization__Group__5__Impl
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
    // InternalOntoUMLArchive.g:2261:1: rule__Generalization__Group__5__Impl : ( ( rule__Generalization__SubAssignment_5 ) ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2265:1: ( ( ( rule__Generalization__SubAssignment_5 ) ) )
            // InternalOntoUMLArchive.g:2266:1: ( ( rule__Generalization__SubAssignment_5 ) )
            {
            // InternalOntoUMLArchive.g:2266:1: ( ( rule__Generalization__SubAssignment_5 ) )
            // InternalOntoUMLArchive.g:2267:2: ( rule__Generalization__SubAssignment_5 )
            {
             before(grammarAccess.getGeneralizationAccess().getSubAssignment_5()); 
            // InternalOntoUMLArchive.g:2268:2: ( rule__Generalization__SubAssignment_5 )
            // InternalOntoUMLArchive.g:2268:3: rule__Generalization__SubAssignment_5
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
    // InternalOntoUMLArchive.g:2277:1: rule__DependencyLink__Group__0 : rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1 ;
    public final void rule__DependencyLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2281:1: ( rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1 )
            // InternalOntoUMLArchive.g:2282:2: rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1
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
    // InternalOntoUMLArchive.g:2289:1: rule__DependencyLink__Group__0__Impl : ( 'dependency' ) ;
    public final void rule__DependencyLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2293:1: ( ( 'dependency' ) )
            // InternalOntoUMLArchive.g:2294:1: ( 'dependency' )
            {
            // InternalOntoUMLArchive.g:2294:1: ( 'dependency' )
            // InternalOntoUMLArchive.g:2295:2: 'dependency'
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
    // InternalOntoUMLArchive.g:2304:1: rule__DependencyLink__Group__1 : rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2 ;
    public final void rule__DependencyLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2308:1: ( rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2 )
            // InternalOntoUMLArchive.g:2309:2: rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2
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
    // InternalOntoUMLArchive.g:2316:1: rule__DependencyLink__Group__1__Impl : ( ( rule__DependencyLink__NameAssignment_1 )? ) ;
    public final void rule__DependencyLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2320:1: ( ( ( rule__DependencyLink__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2321:1: ( ( rule__DependencyLink__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2321:1: ( ( rule__DependencyLink__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2322:2: ( rule__DependencyLink__NameAssignment_1 )?
            {
             before(grammarAccess.getDependencyLinkAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2323:2: ( rule__DependencyLink__NameAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOntoUMLArchive.g:2323:3: rule__DependencyLink__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2331:1: rule__DependencyLink__Group__2 : rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3 ;
    public final void rule__DependencyLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2335:1: ( rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3 )
            // InternalOntoUMLArchive.g:2336:2: rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3
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
    // InternalOntoUMLArchive.g:2343:1: rule__DependencyLink__Group__2__Impl : ( ( rule__DependencyLink__StereotypesAssignment_2 )* ) ;
    public final void rule__DependencyLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2347:1: ( ( ( rule__DependencyLink__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:2348:1: ( ( rule__DependencyLink__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:2348:1: ( ( rule__DependencyLink__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:2349:2: ( rule__DependencyLink__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getDependencyLinkAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:2350:2: ( rule__DependencyLink__StereotypesAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STEREOTYPE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2350:3: rule__DependencyLink__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DependencyLink__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalOntoUMLArchive.g:2358:1: rule__DependencyLink__Group__3 : rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4 ;
    public final void rule__DependencyLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2362:1: ( rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4 )
            // InternalOntoUMLArchive.g:2363:2: rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4
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
    // InternalOntoUMLArchive.g:2370:1: rule__DependencyLink__Group__3__Impl : ( 'from' ) ;
    public final void rule__DependencyLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2374:1: ( ( 'from' ) )
            // InternalOntoUMLArchive.g:2375:1: ( 'from' )
            {
            // InternalOntoUMLArchive.g:2375:1: ( 'from' )
            // InternalOntoUMLArchive.g:2376:2: 'from'
            {
             before(grammarAccess.getDependencyLinkAccess().getFromKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2385:1: rule__DependencyLink__Group__4 : rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5 ;
    public final void rule__DependencyLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2389:1: ( rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5 )
            // InternalOntoUMLArchive.g:2390:2: rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5
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
    // InternalOntoUMLArchive.g:2397:1: rule__DependencyLink__Group__4__Impl : ( ( rule__DependencyLink__FromAssignment_4 ) ) ;
    public final void rule__DependencyLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2401:1: ( ( ( rule__DependencyLink__FromAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:2402:1: ( ( rule__DependencyLink__FromAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:2402:1: ( ( rule__DependencyLink__FromAssignment_4 ) )
            // InternalOntoUMLArchive.g:2403:2: ( rule__DependencyLink__FromAssignment_4 )
            {
             before(grammarAccess.getDependencyLinkAccess().getFromAssignment_4()); 
            // InternalOntoUMLArchive.g:2404:2: ( rule__DependencyLink__FromAssignment_4 )
            // InternalOntoUMLArchive.g:2404:3: rule__DependencyLink__FromAssignment_4
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
    // InternalOntoUMLArchive.g:2412:1: rule__DependencyLink__Group__5 : rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6 ;
    public final void rule__DependencyLink__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2416:1: ( rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6 )
            // InternalOntoUMLArchive.g:2417:2: rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6
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
    // InternalOntoUMLArchive.g:2424:1: rule__DependencyLink__Group__5__Impl : ( 'to' ) ;
    public final void rule__DependencyLink__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2428:1: ( ( 'to' ) )
            // InternalOntoUMLArchive.g:2429:1: ( 'to' )
            {
            // InternalOntoUMLArchive.g:2429:1: ( 'to' )
            // InternalOntoUMLArchive.g:2430:2: 'to'
            {
             before(grammarAccess.getDependencyLinkAccess().getToKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2439:1: rule__DependencyLink__Group__6 : rule__DependencyLink__Group__6__Impl ;
    public final void rule__DependencyLink__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2443:1: ( rule__DependencyLink__Group__6__Impl )
            // InternalOntoUMLArchive.g:2444:2: rule__DependencyLink__Group__6__Impl
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
    // InternalOntoUMLArchive.g:2450:1: rule__DependencyLink__Group__6__Impl : ( ( rule__DependencyLink__ToAssignment_6 ) ) ;
    public final void rule__DependencyLink__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2454:1: ( ( ( rule__DependencyLink__ToAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:2455:1: ( ( rule__DependencyLink__ToAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:2455:1: ( ( rule__DependencyLink__ToAssignment_6 ) )
            // InternalOntoUMLArchive.g:2456:2: ( rule__DependencyLink__ToAssignment_6 )
            {
             before(grammarAccess.getDependencyLinkAccess().getToAssignment_6()); 
            // InternalOntoUMLArchive.g:2457:2: ( rule__DependencyLink__ToAssignment_6 )
            // InternalOntoUMLArchive.g:2457:3: rule__DependencyLink__ToAssignment_6
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
    // InternalOntoUMLArchive.g:2466:1: rule__Derivation__Group__0 : rule__Derivation__Group__0__Impl rule__Derivation__Group__1 ;
    public final void rule__Derivation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2470:1: ( rule__Derivation__Group__0__Impl rule__Derivation__Group__1 )
            // InternalOntoUMLArchive.g:2471:2: rule__Derivation__Group__0__Impl rule__Derivation__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoUMLArchive.g:2478:1: rule__Derivation__Group__0__Impl : ( 'derivation' ) ;
    public final void rule__Derivation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2482:1: ( ( 'derivation' ) )
            // InternalOntoUMLArchive.g:2483:1: ( 'derivation' )
            {
            // InternalOntoUMLArchive.g:2483:1: ( 'derivation' )
            // InternalOntoUMLArchive.g:2484:2: 'derivation'
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
    // InternalOntoUMLArchive.g:2493:1: rule__Derivation__Group__1 : rule__Derivation__Group__1__Impl rule__Derivation__Group__2 ;
    public final void rule__Derivation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2497:1: ( rule__Derivation__Group__1__Impl rule__Derivation__Group__2 )
            // InternalOntoUMLArchive.g:2498:2: rule__Derivation__Group__1__Impl rule__Derivation__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoUMLArchive.g:2505:1: rule__Derivation__Group__1__Impl : ( ( rule__Derivation__NameAssignment_1 )? ) ;
    public final void rule__Derivation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2509:1: ( ( ( rule__Derivation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2510:1: ( ( rule__Derivation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2510:1: ( ( rule__Derivation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2511:2: ( rule__Derivation__NameAssignment_1 )?
            {
             before(grammarAccess.getDerivationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2512:2: ( rule__Derivation__NameAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOntoUMLArchive.g:2512:3: rule__Derivation__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2520:1: rule__Derivation__Group__2 : rule__Derivation__Group__2__Impl rule__Derivation__Group__3 ;
    public final void rule__Derivation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2524:1: ( rule__Derivation__Group__2__Impl rule__Derivation__Group__3 )
            // InternalOntoUMLArchive.g:2525:2: rule__Derivation__Group__2__Impl rule__Derivation__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoUMLArchive.g:2532:1: rule__Derivation__Group__2__Impl : ( ( rule__Derivation__StereotypesAssignment_2 )* ) ;
    public final void rule__Derivation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2536:1: ( ( ( rule__Derivation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:2537:1: ( ( rule__Derivation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:2537:1: ( ( rule__Derivation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:2538:2: ( rule__Derivation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getDerivationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:2539:2: ( rule__Derivation__StereotypesAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STEREOTYPE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2539:3: rule__Derivation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Derivation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalOntoUMLArchive.g:2547:1: rule__Derivation__Group__3 : rule__Derivation__Group__3__Impl rule__Derivation__Group__4 ;
    public final void rule__Derivation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2551:1: ( rule__Derivation__Group__3__Impl rule__Derivation__Group__4 )
            // InternalOntoUMLArchive.g:2552:2: rule__Derivation__Group__3__Impl rule__Derivation__Group__4
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
    // InternalOntoUMLArchive.g:2559:1: rule__Derivation__Group__3__Impl : ( 'class' ) ;
    public final void rule__Derivation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2563:1: ( ( 'class' ) )
            // InternalOntoUMLArchive.g:2564:1: ( 'class' )
            {
            // InternalOntoUMLArchive.g:2564:1: ( 'class' )
            // InternalOntoUMLArchive.g:2565:2: 'class'
            {
             before(grammarAccess.getDerivationAccess().getClassKeyword_3()); 
            match(input,14,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2574:1: rule__Derivation__Group__4 : rule__Derivation__Group__4__Impl rule__Derivation__Group__5 ;
    public final void rule__Derivation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2578:1: ( rule__Derivation__Group__4__Impl rule__Derivation__Group__5 )
            // InternalOntoUMLArchive.g:2579:2: rule__Derivation__Group__4__Impl rule__Derivation__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoUMLArchive.g:2586:1: rule__Derivation__Group__4__Impl : ( ( rule__Derivation__ClassAssignment_4 ) ) ;
    public final void rule__Derivation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2590:1: ( ( ( rule__Derivation__ClassAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:2591:1: ( ( rule__Derivation__ClassAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:2591:1: ( ( rule__Derivation__ClassAssignment_4 ) )
            // InternalOntoUMLArchive.g:2592:2: ( rule__Derivation__ClassAssignment_4 )
            {
             before(grammarAccess.getDerivationAccess().getClassAssignment_4()); 
            // InternalOntoUMLArchive.g:2593:2: ( rule__Derivation__ClassAssignment_4 )
            // InternalOntoUMLArchive.g:2593:3: rule__Derivation__ClassAssignment_4
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
    // InternalOntoUMLArchive.g:2601:1: rule__Derivation__Group__5 : rule__Derivation__Group__5__Impl rule__Derivation__Group__6 ;
    public final void rule__Derivation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2605:1: ( rule__Derivation__Group__5__Impl rule__Derivation__Group__6 )
            // InternalOntoUMLArchive.g:2606:2: rule__Derivation__Group__5__Impl rule__Derivation__Group__6
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
    // InternalOntoUMLArchive.g:2613:1: rule__Derivation__Group__5__Impl : ( 'relation' ) ;
    public final void rule__Derivation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2617:1: ( ( 'relation' ) )
            // InternalOntoUMLArchive.g:2618:1: ( 'relation' )
            {
            // InternalOntoUMLArchive.g:2618:1: ( 'relation' )
            // InternalOntoUMLArchive.g:2619:2: 'relation'
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
    // InternalOntoUMLArchive.g:2628:1: rule__Derivation__Group__6 : rule__Derivation__Group__6__Impl ;
    public final void rule__Derivation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2632:1: ( rule__Derivation__Group__6__Impl )
            // InternalOntoUMLArchive.g:2633:2: rule__Derivation__Group__6__Impl
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
    // InternalOntoUMLArchive.g:2639:1: rule__Derivation__Group__6__Impl : ( ( rule__Derivation__PartAssignment_6 ) ) ;
    public final void rule__Derivation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2643:1: ( ( ( rule__Derivation__PartAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:2644:1: ( ( rule__Derivation__PartAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:2644:1: ( ( rule__Derivation__PartAssignment_6 ) )
            // InternalOntoUMLArchive.g:2645:2: ( rule__Derivation__PartAssignment_6 )
            {
             before(grammarAccess.getDerivationAccess().getPartAssignment_6()); 
            // InternalOntoUMLArchive.g:2646:2: ( rule__Derivation__PartAssignment_6 )
            // InternalOntoUMLArchive.g:2646:3: rule__Derivation__PartAssignment_6
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
    // InternalOntoUMLArchive.g:2655:1: rule__ClassDerivationEnd__Group__0 : rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1 ;
    public final void rule__ClassDerivationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2659:1: ( rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1 )
            // InternalOntoUMLArchive.g:2660:2: rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1
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
    // InternalOntoUMLArchive.g:2667:1: rule__ClassDerivationEnd__Group__0__Impl : ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 ) ) ;
    public final void rule__ClassDerivationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2671:1: ( ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 ) ) )
            // InternalOntoUMLArchive.g:2672:1: ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 ) )
            {
            // InternalOntoUMLArchive.g:2672:1: ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 ) )
            // InternalOntoUMLArchive.g:2673:2: ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getMultiplicityAssignment_0()); 
            // InternalOntoUMLArchive.g:2674:2: ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )
            // InternalOntoUMLArchive.g:2674:3: rule__ClassDerivationEnd__MultiplicityAssignment_0
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
    // InternalOntoUMLArchive.g:2682:1: rule__ClassDerivationEnd__Group__1 : rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2 ;
    public final void rule__ClassDerivationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2686:1: ( rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2 )
            // InternalOntoUMLArchive.g:2687:2: rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalOntoUMLArchive.g:2694:1: rule__ClassDerivationEnd__Group__1__Impl : ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2698:1: ( ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:2699:1: ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:2699:1: ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) )
            // InternalOntoUMLArchive.g:2700:2: ( rule__ClassDerivationEnd__EndTypeAssignment_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getEndTypeAssignment_1()); 
            // InternalOntoUMLArchive.g:2701:2: ( rule__ClassDerivationEnd__EndTypeAssignment_1 )
            // InternalOntoUMLArchive.g:2701:3: rule__ClassDerivationEnd__EndTypeAssignment_1
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
    // InternalOntoUMLArchive.g:2709:1: rule__ClassDerivationEnd__Group__2 : rule__ClassDerivationEnd__Group__2__Impl ;
    public final void rule__ClassDerivationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2713:1: ( rule__ClassDerivationEnd__Group__2__Impl )
            // InternalOntoUMLArchive.g:2714:2: rule__ClassDerivationEnd__Group__2__Impl
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
    // InternalOntoUMLArchive.g:2720:1: rule__ClassDerivationEnd__Group__2__Impl : ( ( rule__ClassDerivationEnd__Group_2__0 )? ) ;
    public final void rule__ClassDerivationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2724:1: ( ( ( rule__ClassDerivationEnd__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:2725:1: ( ( rule__ClassDerivationEnd__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:2725:1: ( ( rule__ClassDerivationEnd__Group_2__0 )? )
            // InternalOntoUMLArchive.g:2726:2: ( rule__ClassDerivationEnd__Group_2__0 )?
            {
             before(grammarAccess.getClassDerivationEndAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:2727:2: ( rule__ClassDerivationEnd__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntoUMLArchive.g:2727:3: rule__ClassDerivationEnd__Group_2__0
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
    // InternalOntoUMLArchive.g:2736:1: rule__ClassDerivationEnd__Group_2__0 : rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1 ;
    public final void rule__ClassDerivationEnd__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2740:1: ( rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1 )
            // InternalOntoUMLArchive.g:2741:2: rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1
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
    // InternalOntoUMLArchive.g:2748:1: rule__ClassDerivationEnd__Group_2__0__Impl : ( '{' ) ;
    public final void rule__ClassDerivationEnd__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2752:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:2753:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:2753:1: ( '{' )
            // InternalOntoUMLArchive.g:2754:2: '{'
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
    // InternalOntoUMLArchive.g:2763:1: rule__ClassDerivationEnd__Group_2__1 : rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2 ;
    public final void rule__ClassDerivationEnd__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2767:1: ( rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2 )
            // InternalOntoUMLArchive.g:2768:2: rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalOntoUMLArchive.g:2775:1: rule__ClassDerivationEnd__Group_2__1__Impl : ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2779:1: ( ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) ) )
            // InternalOntoUMLArchive.g:2780:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) )
            {
            // InternalOntoUMLArchive.g:2780:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) )
            // InternalOntoUMLArchive.g:2781:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getConstraintsAssignment_2_1()); 
            // InternalOntoUMLArchive.g:2782:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 )
            // InternalOntoUMLArchive.g:2782:3: rule__ClassDerivationEnd__ConstraintsAssignment_2_1
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
    // InternalOntoUMLArchive.g:2790:1: rule__ClassDerivationEnd__Group_2__2 : rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3 ;
    public final void rule__ClassDerivationEnd__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2794:1: ( rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3 )
            // InternalOntoUMLArchive.g:2795:2: rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalOntoUMLArchive.g:2802:1: rule__ClassDerivationEnd__Group_2__2__Impl : ( ( rule__ClassDerivationEnd__Group_2_2__0 )* ) ;
    public final void rule__ClassDerivationEnd__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2806:1: ( ( ( rule__ClassDerivationEnd__Group_2_2__0 )* ) )
            // InternalOntoUMLArchive.g:2807:1: ( ( rule__ClassDerivationEnd__Group_2_2__0 )* )
            {
            // InternalOntoUMLArchive.g:2807:1: ( ( rule__ClassDerivationEnd__Group_2_2__0 )* )
            // InternalOntoUMLArchive.g:2808:2: ( rule__ClassDerivationEnd__Group_2_2__0 )*
            {
             before(grammarAccess.getClassDerivationEndAccess().getGroup_2_2()); 
            // InternalOntoUMLArchive.g:2809:2: ( rule__ClassDerivationEnd__Group_2_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==25) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2809:3: rule__ClassDerivationEnd__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ClassDerivationEnd__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalOntoUMLArchive.g:2817:1: rule__ClassDerivationEnd__Group_2__3 : rule__ClassDerivationEnd__Group_2__3__Impl ;
    public final void rule__ClassDerivationEnd__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2821:1: ( rule__ClassDerivationEnd__Group_2__3__Impl )
            // InternalOntoUMLArchive.g:2822:2: rule__ClassDerivationEnd__Group_2__3__Impl
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
    // InternalOntoUMLArchive.g:2828:1: rule__ClassDerivationEnd__Group_2__3__Impl : ( '}' ) ;
    public final void rule__ClassDerivationEnd__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2832:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:2833:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:2833:1: ( '}' )
            // InternalOntoUMLArchive.g:2834:2: '}'
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
    // InternalOntoUMLArchive.g:2844:1: rule__ClassDerivationEnd__Group_2_2__0 : rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1 ;
    public final void rule__ClassDerivationEnd__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2848:1: ( rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1 )
            // InternalOntoUMLArchive.g:2849:2: rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1
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
    // InternalOntoUMLArchive.g:2856:1: rule__ClassDerivationEnd__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDerivationEnd__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2860:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:2861:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:2861:1: ( ',' )
            // InternalOntoUMLArchive.g:2862:2: ','
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
    // InternalOntoUMLArchive.g:2871:1: rule__ClassDerivationEnd__Group_2_2__1 : rule__ClassDerivationEnd__Group_2_2__1__Impl ;
    public final void rule__ClassDerivationEnd__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2875:1: ( rule__ClassDerivationEnd__Group_2_2__1__Impl )
            // InternalOntoUMLArchive.g:2876:2: rule__ClassDerivationEnd__Group_2_2__1__Impl
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
    // InternalOntoUMLArchive.g:2882:1: rule__ClassDerivationEnd__Group_2_2__1__Impl : ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2886:1: ( ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) ) )
            // InternalOntoUMLArchive.g:2887:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            {
            // InternalOntoUMLArchive.g:2887:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            // InternalOntoUMLArchive.g:2888:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getConstraintsAssignment_2_2_1()); 
            // InternalOntoUMLArchive.g:2889:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 )
            // InternalOntoUMLArchive.g:2889:3: rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1
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
    // InternalOntoUMLArchive.g:2898:1: rule__RelationDerivationEnd__Group__0 : rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1 ;
    public final void rule__RelationDerivationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2902:1: ( rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1 )
            // InternalOntoUMLArchive.g:2903:2: rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1
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
    // InternalOntoUMLArchive.g:2910:1: rule__RelationDerivationEnd__Group__0__Impl : ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 ) ) ;
    public final void rule__RelationDerivationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2914:1: ( ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 ) ) )
            // InternalOntoUMLArchive.g:2915:1: ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 ) )
            {
            // InternalOntoUMLArchive.g:2915:1: ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 ) )
            // InternalOntoUMLArchive.g:2916:2: ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getMultiplicityAssignment_0()); 
            // InternalOntoUMLArchive.g:2917:2: ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )
            // InternalOntoUMLArchive.g:2917:3: rule__RelationDerivationEnd__MultiplicityAssignment_0
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
    // InternalOntoUMLArchive.g:2925:1: rule__RelationDerivationEnd__Group__1 : rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2 ;
    public final void rule__RelationDerivationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2929:1: ( rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2 )
            // InternalOntoUMLArchive.g:2930:2: rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalOntoUMLArchive.g:2937:1: rule__RelationDerivationEnd__Group__1__Impl : ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2941:1: ( ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:2942:1: ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:2942:1: ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) )
            // InternalOntoUMLArchive.g:2943:2: ( rule__RelationDerivationEnd__EndTypeAssignment_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssignment_1()); 
            // InternalOntoUMLArchive.g:2944:2: ( rule__RelationDerivationEnd__EndTypeAssignment_1 )
            // InternalOntoUMLArchive.g:2944:3: rule__RelationDerivationEnd__EndTypeAssignment_1
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
    // InternalOntoUMLArchive.g:2952:1: rule__RelationDerivationEnd__Group__2 : rule__RelationDerivationEnd__Group__2__Impl ;
    public final void rule__RelationDerivationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2956:1: ( rule__RelationDerivationEnd__Group__2__Impl )
            // InternalOntoUMLArchive.g:2957:2: rule__RelationDerivationEnd__Group__2__Impl
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
    // InternalOntoUMLArchive.g:2963:1: rule__RelationDerivationEnd__Group__2__Impl : ( ( rule__RelationDerivationEnd__Group_2__0 )? ) ;
    public final void rule__RelationDerivationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2967:1: ( ( ( rule__RelationDerivationEnd__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:2968:1: ( ( rule__RelationDerivationEnd__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:2968:1: ( ( rule__RelationDerivationEnd__Group_2__0 )? )
            // InternalOntoUMLArchive.g:2969:2: ( rule__RelationDerivationEnd__Group_2__0 )?
            {
             before(grammarAccess.getRelationDerivationEndAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:2970:2: ( rule__RelationDerivationEnd__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntoUMLArchive.g:2970:3: rule__RelationDerivationEnd__Group_2__0
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
    // InternalOntoUMLArchive.g:2979:1: rule__RelationDerivationEnd__Group_2__0 : rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1 ;
    public final void rule__RelationDerivationEnd__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2983:1: ( rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1 )
            // InternalOntoUMLArchive.g:2984:2: rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1
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
    // InternalOntoUMLArchive.g:2991:1: rule__RelationDerivationEnd__Group_2__0__Impl : ( '{' ) ;
    public final void rule__RelationDerivationEnd__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2995:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:2996:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:2996:1: ( '{' )
            // InternalOntoUMLArchive.g:2997:2: '{'
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
    // InternalOntoUMLArchive.g:3006:1: rule__RelationDerivationEnd__Group_2__1 : rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2 ;
    public final void rule__RelationDerivationEnd__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3010:1: ( rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2 )
            // InternalOntoUMLArchive.g:3011:2: rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalOntoUMLArchive.g:3018:1: rule__RelationDerivationEnd__Group_2__1__Impl : ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3022:1: ( ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) ) )
            // InternalOntoUMLArchive.g:3023:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) )
            {
            // InternalOntoUMLArchive.g:3023:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) )
            // InternalOntoUMLArchive.g:3024:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getConstraintsAssignment_2_1()); 
            // InternalOntoUMLArchive.g:3025:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 )
            // InternalOntoUMLArchive.g:3025:3: rule__RelationDerivationEnd__ConstraintsAssignment_2_1
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
    // InternalOntoUMLArchive.g:3033:1: rule__RelationDerivationEnd__Group_2__2 : rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3 ;
    public final void rule__RelationDerivationEnd__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3037:1: ( rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3 )
            // InternalOntoUMLArchive.g:3038:2: rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalOntoUMLArchive.g:3045:1: rule__RelationDerivationEnd__Group_2__2__Impl : ( ( rule__RelationDerivationEnd__Group_2_2__0 )* ) ;
    public final void rule__RelationDerivationEnd__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3049:1: ( ( ( rule__RelationDerivationEnd__Group_2_2__0 )* ) )
            // InternalOntoUMLArchive.g:3050:1: ( ( rule__RelationDerivationEnd__Group_2_2__0 )* )
            {
            // InternalOntoUMLArchive.g:3050:1: ( ( rule__RelationDerivationEnd__Group_2_2__0 )* )
            // InternalOntoUMLArchive.g:3051:2: ( rule__RelationDerivationEnd__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationDerivationEndAccess().getGroup_2_2()); 
            // InternalOntoUMLArchive.g:3052:2: ( rule__RelationDerivationEnd__Group_2_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:3052:3: rule__RelationDerivationEnd__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__RelationDerivationEnd__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalOntoUMLArchive.g:3060:1: rule__RelationDerivationEnd__Group_2__3 : rule__RelationDerivationEnd__Group_2__3__Impl ;
    public final void rule__RelationDerivationEnd__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3064:1: ( rule__RelationDerivationEnd__Group_2__3__Impl )
            // InternalOntoUMLArchive.g:3065:2: rule__RelationDerivationEnd__Group_2__3__Impl
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
    // InternalOntoUMLArchive.g:3071:1: rule__RelationDerivationEnd__Group_2__3__Impl : ( '}' ) ;
    public final void rule__RelationDerivationEnd__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3075:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:3076:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:3076:1: ( '}' )
            // InternalOntoUMLArchive.g:3077:2: '}'
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
    // InternalOntoUMLArchive.g:3087:1: rule__RelationDerivationEnd__Group_2_2__0 : rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1 ;
    public final void rule__RelationDerivationEnd__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3091:1: ( rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1 )
            // InternalOntoUMLArchive.g:3092:2: rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1
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
    // InternalOntoUMLArchive.g:3099:1: rule__RelationDerivationEnd__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__RelationDerivationEnd__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3103:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:3104:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:3104:1: ( ',' )
            // InternalOntoUMLArchive.g:3105:2: ','
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
    // InternalOntoUMLArchive.g:3114:1: rule__RelationDerivationEnd__Group_2_2__1 : rule__RelationDerivationEnd__Group_2_2__1__Impl ;
    public final void rule__RelationDerivationEnd__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3118:1: ( rule__RelationDerivationEnd__Group_2_2__1__Impl )
            // InternalOntoUMLArchive.g:3119:2: rule__RelationDerivationEnd__Group_2_2__1__Impl
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
    // InternalOntoUMLArchive.g:3125:1: rule__RelationDerivationEnd__Group_2_2__1__Impl : ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3129:1: ( ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) ) )
            // InternalOntoUMLArchive.g:3130:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            {
            // InternalOntoUMLArchive.g:3130:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            // InternalOntoUMLArchive.g:3131:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getConstraintsAssignment_2_2_1()); 
            // InternalOntoUMLArchive.g:3132:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 )
            // InternalOntoUMLArchive.g:3132:3: rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1
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
    // InternalOntoUMLArchive.g:3141:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3145:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoUMLArchive.g:3146:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoUMLArchive.g:3153:1: rule__GeneralizationSet__Group__0__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3157:1: ( ( 'genset' ) )
            // InternalOntoUMLArchive.g:3158:1: ( 'genset' )
            {
            // InternalOntoUMLArchive.g:3158:1: ( 'genset' )
            // InternalOntoUMLArchive.g:3159:2: 'genset'
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
    // InternalOntoUMLArchive.g:3168:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3172:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoUMLArchive.g:3173:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoUMLArchive.g:3180:1: rule__GeneralizationSet__Group__1__Impl : ( ( rule__GeneralizationSet__UnorderedGroup_1 ) ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3184:1: ( ( ( rule__GeneralizationSet__UnorderedGroup_1 ) ) )
            // InternalOntoUMLArchive.g:3185:1: ( ( rule__GeneralizationSet__UnorderedGroup_1 ) )
            {
            // InternalOntoUMLArchive.g:3185:1: ( ( rule__GeneralizationSet__UnorderedGroup_1 ) )
            // InternalOntoUMLArchive.g:3186:2: ( rule__GeneralizationSet__UnorderedGroup_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1()); 
            // InternalOntoUMLArchive.g:3187:2: ( rule__GeneralizationSet__UnorderedGroup_1 )
            // InternalOntoUMLArchive.g:3187:3: rule__GeneralizationSet__UnorderedGroup_1
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
    // InternalOntoUMLArchive.g:3195:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3199:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoUMLArchive.g:3200:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoUMLArchive.g:3207:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3211:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalOntoUMLArchive.g:3212:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalOntoUMLArchive.g:3212:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalOntoUMLArchive.g:3213:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoUMLArchive.g:3214:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOntoUMLArchive.g:3214:3: rule__GeneralizationSet__NameAssignment_2
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
    // InternalOntoUMLArchive.g:3222:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3226:1: ( rule__GeneralizationSet__Group__3__Impl )
            // InternalOntoUMLArchive.g:3227:2: rule__GeneralizationSet__Group__3__Impl
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
    // InternalOntoUMLArchive.g:3233:1: rule__GeneralizationSet__Group__3__Impl : ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3237:1: ( ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) ) )
            // InternalOntoUMLArchive.g:3238:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) )
            {
            // InternalOntoUMLArchive.g:3238:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:3239:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:3239:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) )
            // InternalOntoUMLArchive.g:3240:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 
            // InternalOntoUMLArchive.g:3241:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )
            // InternalOntoUMLArchive.g:3241:4: rule__GeneralizationSet__GeneralizationsAssignment_3
            {
            pushFollow(FOLLOW_32);
            rule__GeneralizationSet__GeneralizationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 

            }

            // InternalOntoUMLArchive.g:3244:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* )
            // InternalOntoUMLArchive.g:3245:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 
            // InternalOntoUMLArchive.g:3246:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:3246:4: rule__GeneralizationSet__GeneralizationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__GeneralizationSet__GeneralizationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalOntoUMLArchive.g:3256:1: rule__GeneralizationSet__UnorderedGroup_1 : ( rule__GeneralizationSet__UnorderedGroup_1__0 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
        	
        try {
            // InternalOntoUMLArchive.g:3261:1: ( ( rule__GeneralizationSet__UnorderedGroup_1__0 )? )
            // InternalOntoUMLArchive.g:3262:2: ( rule__GeneralizationSet__UnorderedGroup_1__0 )?
            {
            // InternalOntoUMLArchive.g:3262:2: ( rule__GeneralizationSet__UnorderedGroup_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOntoUMLArchive.g:3262:2: rule__GeneralizationSet__UnorderedGroup_1__0
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
    // InternalOntoUMLArchive.g:3270:1: rule__GeneralizationSet__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) ) ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOntoUMLArchive.g:3275:1: ( ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) ) )
            // InternalOntoUMLArchive.g:3276:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) )
            {
            // InternalOntoUMLArchive.g:3276:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoUMLArchive.g:3277:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:3277:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) )
                    // InternalOntoUMLArchive.g:3278:4: {...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalOntoUMLArchive.g:3278:113: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) )
                    // InternalOntoUMLArchive.g:3279:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:3285:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) )
                    // InternalOntoUMLArchive.g:3286:6: ( rule__GeneralizationSet__IsDisjointAssignment_1_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_1_0()); 
                    // InternalOntoUMLArchive.g:3287:6: ( rule__GeneralizationSet__IsDisjointAssignment_1_0 )
                    // InternalOntoUMLArchive.g:3287:7: rule__GeneralizationSet__IsDisjointAssignment_1_0
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
                    // InternalOntoUMLArchive.g:3292:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:3292:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) )
                    // InternalOntoUMLArchive.g:3293:4: {...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalOntoUMLArchive.g:3293:113: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) )
                    // InternalOntoUMLArchive.g:3294:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:3300:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) )
                    // InternalOntoUMLArchive.g:3301:6: ( rule__GeneralizationSet__IsCompleteAssignment_1_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_1_1()); 
                    // InternalOntoUMLArchive.g:3302:6: ( rule__GeneralizationSet__IsCompleteAssignment_1_1 )
                    // InternalOntoUMLArchive.g:3302:7: rule__GeneralizationSet__IsCompleteAssignment_1_1
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
    // InternalOntoUMLArchive.g:3315:1: rule__GeneralizationSet__UnorderedGroup_1__0 : rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3319:1: ( rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )? )
            // InternalOntoUMLArchive.g:3320:2: rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_33);
            rule__GeneralizationSet__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalOntoUMLArchive.g:3321:2: ( rule__GeneralizationSet__UnorderedGroup_1__1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOntoUMLArchive.g:3321:2: rule__GeneralizationSet__UnorderedGroup_1__1
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
    // InternalOntoUMLArchive.g:3327:1: rule__GeneralizationSet__UnorderedGroup_1__1 : rule__GeneralizationSet__UnorderedGroup_1__Impl ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3331:1: ( rule__GeneralizationSet__UnorderedGroup_1__Impl )
            // InternalOntoUMLArchive.g:3332:2: rule__GeneralizationSet__UnorderedGroup_1__Impl
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
    // InternalOntoUMLArchive.g:3339:1: rule__Model__ElementsAssignment : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3343:1: ( ( ruleModelElement ) )
            // InternalOntoUMLArchive.g:3344:2: ( ruleModelElement )
            {
            // InternalOntoUMLArchive.g:3344:2: ( ruleModelElement )
            // InternalOntoUMLArchive.g:3345:3: ruleModelElement
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
    // InternalOntoUMLArchive.g:3354:1: rule__Class__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3358:1: ( ( ( 'abstract' ) ) )
            // InternalOntoUMLArchive.g:3359:2: ( ( 'abstract' ) )
            {
            // InternalOntoUMLArchive.g:3359:2: ( ( 'abstract' ) )
            // InternalOntoUMLArchive.g:3360:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalOntoUMLArchive.g:3361:3: ( 'abstract' )
            // InternalOntoUMLArchive.g:3362:4: 'abstract'
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
    // InternalOntoUMLArchive.g:3373:1: rule__Class__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3377:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3378:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3378:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3379:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3388:1: rule__Class__StereotypesAssignment_3 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__Class__StereotypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3392:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3393:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3393:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3394:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:3403:1: rule__Class__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3407:1: ( ( ruleAttribute ) )
            // InternalOntoUMLArchive.g:3408:2: ( ruleAttribute )
            {
            // InternalOntoUMLArchive.g:3408:2: ( ruleAttribute )
            // InternalOntoUMLArchive.g:3409:3: ruleAttribute
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
    // InternalOntoUMLArchive.g:3418:1: rule__Attribute__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3422:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3423:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3423:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3424:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3433:1: rule__Attribute__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__Attribute__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3437:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:3438:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:3438:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:3439:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:3448:1: rule__Attribute__AttTypeAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__Attribute__AttTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3452:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3453:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3453:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3454:3: ( RULE_STRING )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeClassCrossReference_4_0()); 
            // InternalOntoUMLArchive.g:3455:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3456:4: RULE_STRING
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


    // $ANTLR start "rule__RegularAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:3467:1: rule__RegularAssociation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RegularAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3471:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3472:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3472:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3473:3: RULE_STRING
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


    // $ANTLR start "rule__RegularAssociation__StereotypesAssignment_2"
    // InternalOntoUMLArchive.g:3482:1: rule__RegularAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__RegularAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3486:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3487:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3487:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3488:3: RULE_STEREOTYPE_STRING
            {
             before(grammarAccess.getRegularAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 
             after(grammarAccess.getRegularAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RegularAssociation__StereotypesAssignment_2"


    // $ANTLR start "rule__RegularAssociation__FromAssignment_4"
    // InternalOntoUMLArchive.g:3497:1: rule__RegularAssociation__FromAssignment_4 : ( ruleAssociationEnd ) ;
    public final void rule__RegularAssociation__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3501:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3502:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3502:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3503:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:3512:1: rule__RegularAssociation__ToAssignment_6 : ( ruleAssociationEnd ) ;
    public final void rule__RegularAssociation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3516:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3517:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3517:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3518:3: ruleAssociationEnd
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


    // $ANTLR start "rule__ParthoodAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:3527:1: rule__ParthoodAssociation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ParthoodAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3531:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3532:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3532:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3533:3: RULE_STRING
            {
             before(grammarAccess.getParthoodAssociationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParthoodAssociationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ParthoodAssociation__NameAssignment_1"


    // $ANTLR start "rule__ParthoodAssociation__StereotypesAssignment_2"
    // InternalOntoUMLArchive.g:3542:1: rule__ParthoodAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__ParthoodAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3546:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3547:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3547:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3548:3: RULE_STEREOTYPE_STRING
            {
             before(grammarAccess.getParthoodAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 
             after(grammarAccess.getParthoodAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ParthoodAssociation__StereotypesAssignment_2"


    // $ANTLR start "rule__ParthoodAssociation__WholeAssignment_4"
    // InternalOntoUMLArchive.g:3557:1: rule__ParthoodAssociation__WholeAssignment_4 : ( ruleAssociationEnd ) ;
    public final void rule__ParthoodAssociation__WholeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3561:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3562:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3562:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3563:3: ruleAssociationEnd
            {
             before(grammarAccess.getParthoodAssociationAccess().getWholeAssociationEndParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getParthoodAssociationAccess().getWholeAssociationEndParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ParthoodAssociation__WholeAssignment_4"


    // $ANTLR start "rule__ParthoodAssociation__PartAssignment_6"
    // InternalOntoUMLArchive.g:3572:1: rule__ParthoodAssociation__PartAssignment_6 : ( ruleAssociationEnd ) ;
    public final void rule__ParthoodAssociation__PartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3576:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3577:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3577:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3578:3: ruleAssociationEnd
            {
             before(grammarAccess.getParthoodAssociationAccess().getPartAssociationEndParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getParthoodAssociationAccess().getPartAssociationEndParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ParthoodAssociation__PartAssignment_6"


    // $ANTLR start "rule__NaryAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:3587:1: rule__NaryAssociation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NaryAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3591:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3592:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3592:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3593:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3602:1: rule__NaryAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__NaryAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3606:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3607:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3607:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3608:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:3617:1: rule__NaryAssociation__EndsAssignment_3_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3621:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3622:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3622:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3623:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:3632:1: rule__NaryAssociation__EndsAssignment_4_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3636:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3637:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3637:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3638:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:3647:1: rule__NaryAssociation__EndsAssignment_5_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3651:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3652:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3652:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3653:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:3662:1: rule__AssociationEnd__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3666:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3667:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3667:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3668:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3677:1: rule__AssociationEnd__MultiplicityAssignment_1 : ( ruleMultiplicity ) ;
    public final void rule__AssociationEnd__MultiplicityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3681:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:3682:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:3682:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:3683:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:3692:1: rule__AssociationEnd__EndTypeAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__AssociationEnd__EndTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3696:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3697:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3697:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3698:3: ( RULE_STRING )
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_3_0()); 
            // InternalOntoUMLArchive.g:3699:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3700:4: RULE_STRING
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


    // $ANTLR start "rule__AssociationEnd__ConstraintsAssignment_4_1"
    // InternalOntoUMLArchive.g:3711:1: rule__AssociationEnd__ConstraintsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__ConstraintsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3715:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3716:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3716:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3717:3: RULE_STRING
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__AssociationEnd__ConstraintsAssignment_4_1"


    // $ANTLR start "rule__AssociationEnd__ConstraintsAssignment_4_2_1"
    // InternalOntoUMLArchive.g:3726:1: rule__AssociationEnd__ConstraintsAssignment_4_2_1 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__ConstraintsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3730:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3731:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3731:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3732:3: RULE_STRING
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_4_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssociationEndAccess().getConstraintsSTRINGTerminalRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__AssociationEnd__ConstraintsAssignment_4_2_1"


    // $ANTLR start "rule__Multiplicity__LowerAssignment_1"
    // InternalOntoUMLArchive.g:3741:1: rule__Multiplicity__LowerAssignment_1 : ( ruleCARDINALITY ) ;
    public final void rule__Multiplicity__LowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3745:1: ( ( ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:3746:2: ( ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:3746:2: ( ruleCARDINALITY )
            // InternalOntoUMLArchive.g:3747:3: ruleCARDINALITY
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
    // InternalOntoUMLArchive.g:3756:1: rule__Multiplicity__UpperAssignment_3 : ( ruleCARDINALITY ) ;
    public final void rule__Multiplicity__UpperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3760:1: ( ( ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:3761:2: ( ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:3761:2: ( ruleCARDINALITY )
            // InternalOntoUMLArchive.g:3762:3: ruleCARDINALITY
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
    // InternalOntoUMLArchive.g:3771:1: rule__Generalization__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Generalization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3775:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3776:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3776:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3777:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3786:1: rule__Generalization__SuperAssignment_3 : ( ( RULE_STRING ) ) ;
    public final void rule__Generalization__SuperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3790:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3791:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3791:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3792:3: ( RULE_STRING )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0()); 
            // InternalOntoUMLArchive.g:3793:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3794:4: RULE_STRING
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
    // InternalOntoUMLArchive.g:3805:1: rule__Generalization__SubAssignment_5 : ( ( RULE_STRING ) ) ;
    public final void rule__Generalization__SubAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3809:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3810:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3810:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3811:3: ( RULE_STRING )
            {
             before(grammarAccess.getGeneralizationAccess().getSubClassCrossReference_5_0()); 
            // InternalOntoUMLArchive.g:3812:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3813:4: RULE_STRING
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
    // InternalOntoUMLArchive.g:3824:1: rule__DependencyLink__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DependencyLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3828:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3829:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3829:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3830:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3839:1: rule__DependencyLink__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__DependencyLink__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3843:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3844:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3844:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3845:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:3854:1: rule__DependencyLink__FromAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__DependencyLink__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3858:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3859:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3859:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3860:3: ( RULE_STRING )
            {
             before(grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_4_0()); 
            // InternalOntoUMLArchive.g:3861:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3862:4: RULE_STRING
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
    // InternalOntoUMLArchive.g:3873:1: rule__DependencyLink__ToAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__DependencyLink__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3877:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3878:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3878:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3879:3: ( RULE_STRING )
            {
             before(grammarAccess.getDependencyLinkAccess().getToClassCrossReference_6_0()); 
            // InternalOntoUMLArchive.g:3880:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3881:4: RULE_STRING
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
    // InternalOntoUMLArchive.g:3892:1: rule__Derivation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Derivation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3896:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3897:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3897:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3898:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3907:1: rule__Derivation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__Derivation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3911:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3912:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3912:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3913:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:3922:1: rule__Derivation__ClassAssignment_4 : ( ruleClassDerivationEnd ) ;
    public final void rule__Derivation__ClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3926:1: ( ( ruleClassDerivationEnd ) )
            // InternalOntoUMLArchive.g:3927:2: ( ruleClassDerivationEnd )
            {
            // InternalOntoUMLArchive.g:3927:2: ( ruleClassDerivationEnd )
            // InternalOntoUMLArchive.g:3928:3: ruleClassDerivationEnd
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
    // InternalOntoUMLArchive.g:3937:1: rule__Derivation__PartAssignment_6 : ( ruleRelationDerivationEnd ) ;
    public final void rule__Derivation__PartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3941:1: ( ( ruleRelationDerivationEnd ) )
            // InternalOntoUMLArchive.g:3942:2: ( ruleRelationDerivationEnd )
            {
            // InternalOntoUMLArchive.g:3942:2: ( ruleRelationDerivationEnd )
            // InternalOntoUMLArchive.g:3943:3: ruleRelationDerivationEnd
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
    // InternalOntoUMLArchive.g:3952:1: rule__ClassDerivationEnd__MultiplicityAssignment_0 : ( ruleMultiplicity ) ;
    public final void rule__ClassDerivationEnd__MultiplicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3956:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:3957:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:3957:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:3958:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:3967:1: rule__ClassDerivationEnd__EndTypeAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ClassDerivationEnd__EndTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3971:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:3972:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:3972:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3973:3: ( RULE_STRING )
            {
             before(grammarAccess.getClassDerivationEndAccess().getEndTypeClassCrossReference_1_0()); 
            // InternalOntoUMLArchive.g:3974:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3975:4: RULE_STRING
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
    // InternalOntoUMLArchive.g:3986:1: rule__ClassDerivationEnd__ConstraintsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ClassDerivationEnd__ConstraintsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3990:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3991:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3991:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3992:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4001:1: rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4005:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4006:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4006:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4007:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4016:1: rule__RelationDerivationEnd__MultiplicityAssignment_0 : ( ruleMultiplicity ) ;
    public final void rule__RelationDerivationEnd__MultiplicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4020:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:4021:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:4021:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:4022:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:4031:1: rule__RelationDerivationEnd__EndTypeAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__RelationDerivationEnd__EndTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4035:1: ( ( ( RULE_STRING ) ) )
            // InternalOntoUMLArchive.g:4036:2: ( ( RULE_STRING ) )
            {
            // InternalOntoUMLArchive.g:4036:2: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4037:3: ( RULE_STRING )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationCrossReference_1_0()); 
            // InternalOntoUMLArchive.g:4038:3: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4039:4: RULE_STRING
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
    // InternalOntoUMLArchive.g:4050:1: rule__RelationDerivationEnd__ConstraintsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__RelationDerivationEnd__ConstraintsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4054:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4055:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4055:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4056:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4065:1: rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4069:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4070:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4070:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4071:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4080:1: rule__GeneralizationSet__IsDisjointAssignment_1_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4084:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoUMLArchive.g:4085:2: ( ( 'disjoint' ) )
            {
            // InternalOntoUMLArchive.g:4085:2: ( ( 'disjoint' ) )
            // InternalOntoUMLArchive.g:4086:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 
            // InternalOntoUMLArchive.g:4087:3: ( 'disjoint' )
            // InternalOntoUMLArchive.g:4088:4: 'disjoint'
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
    // InternalOntoUMLArchive.g:4099:1: rule__GeneralizationSet__IsCompleteAssignment_1_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4103:1: ( ( ( 'complete' ) ) )
            // InternalOntoUMLArchive.g:4104:2: ( ( 'complete' ) )
            {
            // InternalOntoUMLArchive.g:4104:2: ( ( 'complete' ) )
            // InternalOntoUMLArchive.g:4105:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 
            // InternalOntoUMLArchive.g:4106:3: ( 'complete' )
            // InternalOntoUMLArchive.g:4107:4: 'complete'
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
    // InternalOntoUMLArchive.g:4118:1: rule__GeneralizationSet__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4122:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4123:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4123:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4124:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4133:1: rule__GeneralizationSet__GeneralizationsAssignment_3 : ( ruleGeneralization ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4137:1: ( ( ruleGeneralization ) )
            // InternalOntoUMLArchive.g:4138:2: ( ruleGeneralization )
            {
            // InternalOntoUMLArchive.g:4138:2: ( ruleGeneralization )
            // InternalOntoUMLArchive.g:4139:3: ruleGeneralization
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
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\21\1\5\2\6\2\uffff";
    static final String dfa_3s = "\1\21\3\26\2\uffff";
    static final String dfa_4s = "\4\uffff\1\2\1\1";
    static final String dfa_5s = "\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\3\13\uffff\1\5\1\uffff\1\5\1\uffff\1\4",
            "\1\3\13\uffff\1\5\1\uffff\1\5\1\uffff\1\4",
            "\1\3\13\uffff\1\5\1\uffff\1\5\1\uffff\1\4",
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
            return "587:1: rule__Association__Alternatives : ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) );";
        }
    }
    static final String dfa_7s = "\1\21\3\24\2\uffff";
    static final String dfa_8s = "\4\uffff\1\1\1\2";
    static final String[] dfa_9s = {
            "\1\1",
            "\1\2\1\3\13\uffff\1\4\1\uffff\1\5",
            "\1\3\13\uffff\1\4\1\uffff\1\5",
            "\1\3\13\uffff\1\4\1\uffff\1\5",
            "",
            ""
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[][] dfa_9 = unpackEncodedStringArray(dfa_9s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_7;
            this.accept = dfa_8;
            this.special = dfa_5;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "608:1: rule__BinaryAssociation__Alternatives : ( ( ruleRegularAssociation ) | ( ruleParthoodAssociation ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001B20024002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000022L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006000000002L});

}
