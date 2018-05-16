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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_STEREOTYPE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'shared'", "'composite'", "'publication'", "'authors'", "'ontology'", "';'", "'class'", "'att'", "':'", "'association'", "'from'", "'to'", "'end'", "'{'", "'}'", "','", "'['", "'..'", "']'", "'gen'", "'super'", "'sub'", "'dependency'", "'derivation'", "'relation'", "'genset'", "'abstract'", "'disjoint'", "'complete'"
    };
    public static final int RULE_STEREOTYPE_STRING=7;
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
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
    // InternalOntoUMLArchive.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalOntoUMLArchive.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalOntoUMLArchive.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalOntoUMLArchive.g:69:3: ( rule__Model__Group__0 )
            // InternalOntoUMLArchive.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDirectedAssociation"
    // InternalOntoUMLArchive.g:228:1: entryRuleDirectedAssociation : ruleDirectedAssociation EOF ;
    public final void entryRuleDirectedAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:229:1: ( ruleDirectedAssociation EOF )
            // InternalOntoUMLArchive.g:230:1: ruleDirectedAssociation EOF
            {
             before(grammarAccess.getDirectedAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectedAssociation();

            state._fsp--;

             after(grammarAccess.getDirectedAssociationRule()); 
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
    // $ANTLR end "entryRuleDirectedAssociation"


    // $ANTLR start "ruleDirectedAssociation"
    // InternalOntoUMLArchive.g:237:1: ruleDirectedAssociation : ( ( rule__DirectedAssociation__Group__0 ) ) ;
    public final void ruleDirectedAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:241:2: ( ( ( rule__DirectedAssociation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:242:2: ( ( rule__DirectedAssociation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:242:2: ( ( rule__DirectedAssociation__Group__0 ) )
            // InternalOntoUMLArchive.g:243:3: ( rule__DirectedAssociation__Group__0 )
            {
             before(grammarAccess.getDirectedAssociationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:244:3: ( rule__DirectedAssociation__Group__0 )
            // InternalOntoUMLArchive.g:244:4: rule__DirectedAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectedAssociation"


    // $ANTLR start "entryRuleUndirectedAssociation"
    // InternalOntoUMLArchive.g:253:1: entryRuleUndirectedAssociation : ruleUndirectedAssociation EOF ;
    public final void entryRuleUndirectedAssociation() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:254:1: ( ruleUndirectedAssociation EOF )
            // InternalOntoUMLArchive.g:255:1: ruleUndirectedAssociation EOF
            {
             before(grammarAccess.getUndirectedAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleUndirectedAssociation();

            state._fsp--;

             after(grammarAccess.getUndirectedAssociationRule()); 
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
    // $ANTLR end "entryRuleUndirectedAssociation"


    // $ANTLR start "ruleUndirectedAssociation"
    // InternalOntoUMLArchive.g:262:1: ruleUndirectedAssociation : ( ( rule__UndirectedAssociation__Group__0 ) ) ;
    public final void ruleUndirectedAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:266:2: ( ( ( rule__UndirectedAssociation__Group__0 ) ) )
            // InternalOntoUMLArchive.g:267:2: ( ( rule__UndirectedAssociation__Group__0 ) )
            {
            // InternalOntoUMLArchive.g:267:2: ( ( rule__UndirectedAssociation__Group__0 ) )
            // InternalOntoUMLArchive.g:268:3: ( rule__UndirectedAssociation__Group__0 )
            {
             before(grammarAccess.getUndirectedAssociationAccess().getGroup()); 
            // InternalOntoUMLArchive.g:269:3: ( rule__UndirectedAssociation__Group__0 )
            // InternalOntoUMLArchive.g:269:4: rule__UndirectedAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUndirectedAssociation"


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


    // $ANTLR start "entryRuleStringOrID"
    // InternalOntoUMLArchive.g:528:1: entryRuleStringOrID : ruleStringOrID EOF ;
    public final void entryRuleStringOrID() throws RecognitionException {
        try {
            // InternalOntoUMLArchive.g:529:1: ( ruleStringOrID EOF )
            // InternalOntoUMLArchive.g:530:1: ruleStringOrID EOF
            {
             before(grammarAccess.getStringOrIDRule()); 
            pushFollow(FOLLOW_1);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getStringOrIDRule()); 
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
    // $ANTLR end "entryRuleStringOrID"


    // $ANTLR start "ruleStringOrID"
    // InternalOntoUMLArchive.g:537:1: ruleStringOrID : ( ( rule__StringOrID__Alternatives ) ) ;
    public final void ruleStringOrID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:541:2: ( ( ( rule__StringOrID__Alternatives ) ) )
            // InternalOntoUMLArchive.g:542:2: ( ( rule__StringOrID__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:542:2: ( ( rule__StringOrID__Alternatives ) )
            // InternalOntoUMLArchive.g:543:3: ( rule__StringOrID__Alternatives )
            {
             before(grammarAccess.getStringOrIDAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:544:3: ( rule__StringOrID__Alternatives )
            // InternalOntoUMLArchive.g:544:4: rule__StringOrID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringOrID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringOrIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringOrID"


    // $ANTLR start "ruleAggregationKindDeclaration"
    // InternalOntoUMLArchive.g:553:1: ruleAggregationKindDeclaration : ( ( rule__AggregationKindDeclaration__Alternatives ) ) ;
    public final void ruleAggregationKindDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:557:1: ( ( ( rule__AggregationKindDeclaration__Alternatives ) ) )
            // InternalOntoUMLArchive.g:558:2: ( ( rule__AggregationKindDeclaration__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:558:2: ( ( rule__AggregationKindDeclaration__Alternatives ) )
            // InternalOntoUMLArchive.g:559:3: ( rule__AggregationKindDeclaration__Alternatives )
            {
             before(grammarAccess.getAggregationKindDeclarationAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:560:3: ( rule__AggregationKindDeclaration__Alternatives )
            // InternalOntoUMLArchive.g:560:4: rule__AggregationKindDeclaration__Alternatives
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
    // InternalOntoUMLArchive.g:568:1: rule__ModelElement__Alternatives_0 : ( ( ruleClass ) | ( ruleRelationship ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:572:1: ( ( ruleClass ) | ( ruleRelationship ) | ( ruleGeneralizationSet ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 19:
            case 39:
                {
                alt1=1;
                }
                break;
            case 22:
            case 32:
            case 35:
            case 36:
                {
                alt1=2;
                }
                break;
            case 38:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOntoUMLArchive.g:573:2: ( ruleClass )
                    {
                    // InternalOntoUMLArchive.g:573:2: ( ruleClass )
                    // InternalOntoUMLArchive.g:574:3: ruleClass
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
                    // InternalOntoUMLArchive.g:579:2: ( ruleRelationship )
                    {
                    // InternalOntoUMLArchive.g:579:2: ( ruleRelationship )
                    // InternalOntoUMLArchive.g:580:3: ruleRelationship
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
                    // InternalOntoUMLArchive.g:585:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoUMLArchive.g:585:2: ( ruleGeneralizationSet )
                    // InternalOntoUMLArchive.g:586:3: ruleGeneralizationSet
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
    // InternalOntoUMLArchive.g:595:1: rule__Relationship__Alternatives : ( ( ruleAssociation ) | ( ruleGeneralization ) | ( ruleDependencyLink ) | ( ruleDerivation ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:599:1: ( ( ruleAssociation ) | ( ruleGeneralization ) | ( ruleDependencyLink ) | ( ruleDerivation ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 36:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOntoUMLArchive.g:600:2: ( ruleAssociation )
                    {
                    // InternalOntoUMLArchive.g:600:2: ( ruleAssociation )
                    // InternalOntoUMLArchive.g:601:3: ruleAssociation
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
                    // InternalOntoUMLArchive.g:606:2: ( ruleGeneralization )
                    {
                    // InternalOntoUMLArchive.g:606:2: ( ruleGeneralization )
                    // InternalOntoUMLArchive.g:607:3: ruleGeneralization
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
                    // InternalOntoUMLArchive.g:612:2: ( ruleDependencyLink )
                    {
                    // InternalOntoUMLArchive.g:612:2: ( ruleDependencyLink )
                    // InternalOntoUMLArchive.g:613:3: ruleDependencyLink
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
                    // InternalOntoUMLArchive.g:618:2: ( ruleDerivation )
                    {
                    // InternalOntoUMLArchive.g:618:2: ( ruleDerivation )
                    // InternalOntoUMLArchive.g:619:3: ruleDerivation
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
    // InternalOntoUMLArchive.g:628:1: rule__Association__Alternatives : ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) );
    public final void rule__Association__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:632:1: ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalOntoUMLArchive.g:633:2: ( ruleBinaryAssociation )
                    {
                    // InternalOntoUMLArchive.g:633:2: ( ruleBinaryAssociation )
                    // InternalOntoUMLArchive.g:634:3: ruleBinaryAssociation
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
                    // InternalOntoUMLArchive.g:639:2: ( ruleNaryAssociation )
                    {
                    // InternalOntoUMLArchive.g:639:2: ( ruleNaryAssociation )
                    // InternalOntoUMLArchive.g:640:3: ruleNaryAssociation
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
    // InternalOntoUMLArchive.g:649:1: rule__BinaryAssociation__Alternatives : ( ( ruleDirectedAssociation ) | ( ruleUndirectedAssociation ) );
    public final void rule__BinaryAssociation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:653:1: ( ( ruleDirectedAssociation ) | ( ruleUndirectedAssociation ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalOntoUMLArchive.g:654:2: ( ruleDirectedAssociation )
                    {
                    // InternalOntoUMLArchive.g:654:2: ( ruleDirectedAssociation )
                    // InternalOntoUMLArchive.g:655:3: ruleDirectedAssociation
                    {
                     before(grammarAccess.getBinaryAssociationAccess().getDirectedAssociationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectedAssociation();

                    state._fsp--;

                     after(grammarAccess.getBinaryAssociationAccess().getDirectedAssociationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:660:2: ( ruleUndirectedAssociation )
                    {
                    // InternalOntoUMLArchive.g:660:2: ( ruleUndirectedAssociation )
                    // InternalOntoUMLArchive.g:661:3: ruleUndirectedAssociation
                    {
                     before(grammarAccess.getBinaryAssociationAccess().getUndirectedAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUndirectedAssociation();

                    state._fsp--;

                     after(grammarAccess.getBinaryAssociationAccess().getUndirectedAssociationParserRuleCall_1()); 

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
    // InternalOntoUMLArchive.g:670:1: rule__CARDINALITY__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CARDINALITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:674:1: ( ( '*' ) | ( RULE_INT ) )
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
                    // InternalOntoUMLArchive.g:675:2: ( '*' )
                    {
                    // InternalOntoUMLArchive.g:675:2: ( '*' )
                    // InternalOntoUMLArchive.g:676:3: '*'
                    {
                     before(grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:681:2: ( RULE_INT )
                    {
                    // InternalOntoUMLArchive.g:681:2: ( RULE_INT )
                    // InternalOntoUMLArchive.g:682:3: RULE_INT
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


    // $ANTLR start "rule__StringOrID__Alternatives"
    // InternalOntoUMLArchive.g:691:1: rule__StringOrID__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__StringOrID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:695:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUMLArchive.g:696:2: ( RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:696:2: ( RULE_STRING )
                    // InternalOntoUMLArchive.g:697:3: RULE_STRING
                    {
                     before(grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:702:2: ( RULE_ID )
                    {
                    // InternalOntoUMLArchive.g:702:2: ( RULE_ID )
                    // InternalOntoUMLArchive.g:703:3: RULE_ID
                    {
                     before(grammarAccess.getStringOrIDAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getStringOrIDAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__StringOrID__Alternatives"


    // $ANTLR start "rule__AggregationKindDeclaration__Alternatives"
    // InternalOntoUMLArchive.g:712:1: rule__AggregationKindDeclaration__Alternatives : ( ( ( 'shared' ) ) | ( ( 'composite' ) ) );
    public final void rule__AggregationKindDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:716:1: ( ( ( 'shared' ) ) | ( ( 'composite' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoUMLArchive.g:717:2: ( ( 'shared' ) )
                    {
                    // InternalOntoUMLArchive.g:717:2: ( ( 'shared' ) )
                    // InternalOntoUMLArchive.g:718:3: ( 'shared' )
                    {
                     before(grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0()); 
                    // InternalOntoUMLArchive.g:719:3: ( 'shared' )
                    // InternalOntoUMLArchive.g:719:4: 'shared'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:723:2: ( ( 'composite' ) )
                    {
                    // InternalOntoUMLArchive.g:723:2: ( ( 'composite' ) )
                    // InternalOntoUMLArchive.g:724:3: ( 'composite' )
                    {
                     before(grammarAccess.getAggregationKindDeclarationAccess().getCompositeEnumLiteralDeclaration_1()); 
                    // InternalOntoUMLArchive.g:725:3: ( 'composite' )
                    // InternalOntoUMLArchive.g:725:4: 'composite'
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalOntoUMLArchive.g:733:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:737:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoUMLArchive.g:738:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalOntoUMLArchive.g:745:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:749:1: ( ( ( rule__Model__Group_0__0 )? ) )
            // InternalOntoUMLArchive.g:750:1: ( ( rule__Model__Group_0__0 )? )
            {
            // InternalOntoUMLArchive.g:750:1: ( ( rule__Model__Group_0__0 )? )
            // InternalOntoUMLArchive.g:751:2: ( rule__Model__Group_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // InternalOntoUMLArchive.g:752:2: ( rule__Model__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoUMLArchive.g:752:3: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalOntoUMLArchive.g:760:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:764:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoUMLArchive.g:765:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalOntoUMLArchive.g:772:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:776:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // InternalOntoUMLArchive.g:777:1: ( ( rule__Model__Group_1__0 )? )
            {
            // InternalOntoUMLArchive.g:777:1: ( ( rule__Model__Group_1__0 )? )
            // InternalOntoUMLArchive.g:778:2: ( rule__Model__Group_1__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_1()); 
            // InternalOntoUMLArchive.g:779:2: ( rule__Model__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoUMLArchive.g:779:3: rule__Model__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalOntoUMLArchive.g:787:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:791:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoUMLArchive.g:792:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalOntoUMLArchive.g:799:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:803:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:804:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:804:1: ( ( rule__Model__Group_2__0 )? )
            // InternalOntoUMLArchive.g:805:2: ( rule__Model__Group_2__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:806:2: ( rule__Model__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUMLArchive.g:806:3: rule__Model__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalOntoUMLArchive.g:814:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:818:1: ( rule__Model__Group__3__Impl )
            // InternalOntoUMLArchive.g:819:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalOntoUMLArchive.g:825:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:829:1: ( ( ( rule__Model__ElementsAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:830:1: ( ( rule__Model__ElementsAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:830:1: ( ( rule__Model__ElementsAssignment_3 )* )
            // InternalOntoUMLArchive.g:831:2: ( rule__Model__ElementsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3()); 
            // InternalOntoUMLArchive.g:832:2: ( rule__Model__ElementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19||LA11_0==22||LA11_0==32||(LA11_0>=35 && LA11_0<=36)||(LA11_0>=38 && LA11_0<=39)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:832:3: rule__Model__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group_0__0"
    // InternalOntoUMLArchive.g:841:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:845:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // InternalOntoUMLArchive.g:846:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_0__1();

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
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // InternalOntoUMLArchive.g:853:1: rule__Model__Group_0__0__Impl : ( 'publication' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:857:1: ( ( 'publication' ) )
            // InternalOntoUMLArchive.g:858:1: ( 'publication' )
            {
            // InternalOntoUMLArchive.g:858:1: ( 'publication' )
            // InternalOntoUMLArchive.g:859:2: 'publication'
            {
             before(grammarAccess.getModelAccess().getPublicationKeyword_0_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPublicationKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // InternalOntoUMLArchive.g:868:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:872:1: ( rule__Model__Group_0__1__Impl )
            // InternalOntoUMLArchive.g:873:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_0__1__Impl();

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
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // InternalOntoUMLArchive.g:879:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__PublicationTitleAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:883:1: ( ( ( rule__Model__PublicationTitleAssignment_0_1 ) ) )
            // InternalOntoUMLArchive.g:884:1: ( ( rule__Model__PublicationTitleAssignment_0_1 ) )
            {
            // InternalOntoUMLArchive.g:884:1: ( ( rule__Model__PublicationTitleAssignment_0_1 ) )
            // InternalOntoUMLArchive.g:885:2: ( rule__Model__PublicationTitleAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getPublicationTitleAssignment_0_1()); 
            // InternalOntoUMLArchive.g:886:2: ( rule__Model__PublicationTitleAssignment_0_1 )
            // InternalOntoUMLArchive.g:886:3: rule__Model__PublicationTitleAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__PublicationTitleAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPublicationTitleAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__Model__Group_1__0"
    // InternalOntoUMLArchive.g:895:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:899:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // InternalOntoUMLArchive.g:900:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1();

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
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // InternalOntoUMLArchive.g:907:1: rule__Model__Group_1__0__Impl : ( 'authors' ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:911:1: ( ( 'authors' ) )
            // InternalOntoUMLArchive.g:912:1: ( 'authors' )
            {
            // InternalOntoUMLArchive.g:912:1: ( 'authors' )
            // InternalOntoUMLArchive.g:913:2: 'authors'
            {
             before(grammarAccess.getModelAccess().getAuthorsKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getAuthorsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1__1"
    // InternalOntoUMLArchive.g:922:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:926:1: ( rule__Model__Group_1__1__Impl )
            // InternalOntoUMLArchive.g:927:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1__Impl();

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
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // InternalOntoUMLArchive.g:933:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__AuthorsAssignment_1_1 ) ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:937:1: ( ( ( rule__Model__AuthorsAssignment_1_1 ) ) )
            // InternalOntoUMLArchive.g:938:1: ( ( rule__Model__AuthorsAssignment_1_1 ) )
            {
            // InternalOntoUMLArchive.g:938:1: ( ( rule__Model__AuthorsAssignment_1_1 ) )
            // InternalOntoUMLArchive.g:939:2: ( rule__Model__AuthorsAssignment_1_1 )
            {
             before(grammarAccess.getModelAccess().getAuthorsAssignment_1_1()); 
            // InternalOntoUMLArchive.g:940:2: ( rule__Model__AuthorsAssignment_1_1 )
            // InternalOntoUMLArchive.g:940:3: rule__Model__AuthorsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__AuthorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAuthorsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalOntoUMLArchive.g:949:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:953:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalOntoUMLArchive.g:954:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1();

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
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // InternalOntoUMLArchive.g:961:1: rule__Model__Group_2__0__Impl : ( 'ontology' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:965:1: ( ( 'ontology' ) )
            // InternalOntoUMLArchive.g:966:1: ( 'ontology' )
            {
            // InternalOntoUMLArchive.g:966:1: ( 'ontology' )
            // InternalOntoUMLArchive.g:967:2: 'ontology'
            {
             before(grammarAccess.getModelAccess().getOntologyKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getOntologyKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // InternalOntoUMLArchive.g:976:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:980:1: ( rule__Model__Group_2__1__Impl )
            // InternalOntoUMLArchive.g:981:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1__Impl();

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
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // InternalOntoUMLArchive.g:987:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__OntologyNameAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:991:1: ( ( ( rule__Model__OntologyNameAssignment_2_1 ) ) )
            // InternalOntoUMLArchive.g:992:1: ( ( rule__Model__OntologyNameAssignment_2_1 ) )
            {
            // InternalOntoUMLArchive.g:992:1: ( ( rule__Model__OntologyNameAssignment_2_1 ) )
            // InternalOntoUMLArchive.g:993:2: ( rule__Model__OntologyNameAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getOntologyNameAssignment_2_1()); 
            // InternalOntoUMLArchive.g:994:2: ( rule__Model__OntologyNameAssignment_2_1 )
            // InternalOntoUMLArchive.g:994:3: rule__Model__OntologyNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__OntologyNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getOntologyNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__ModelElement__Group__0"
    // InternalOntoUMLArchive.g:1003:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1007:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalOntoUMLArchive.g:1008:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalOntoUMLArchive.g:1015:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1019:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalOntoUMLArchive.g:1020:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalOntoUMLArchive.g:1020:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalOntoUMLArchive.g:1021:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalOntoUMLArchive.g:1022:2: ( rule__ModelElement__Alternatives_0 )
            // InternalOntoUMLArchive.g:1022:3: rule__ModelElement__Alternatives_0
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
    // InternalOntoUMLArchive.g:1030:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1034:1: ( rule__ModelElement__Group__1__Impl )
            // InternalOntoUMLArchive.g:1035:2: rule__ModelElement__Group__1__Impl
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
    // InternalOntoUMLArchive.g:1041:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1045:1: ( ( ';' ) )
            // InternalOntoUMLArchive.g:1046:1: ( ';' )
            {
            // InternalOntoUMLArchive.g:1046:1: ( ';' )
            // InternalOntoUMLArchive.g:1047:2: ';'
            {
             before(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1057:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1061:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalOntoUMLArchive.g:1062:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalOntoUMLArchive.g:1069:1: rule__Class__Group__0__Impl : ( ( rule__Class__IsAbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1073:1: ( ( ( rule__Class__IsAbstractAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:1074:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:1074:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            // InternalOntoUMLArchive.g:1075:2: ( rule__Class__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 
            // InternalOntoUMLArchive.g:1076:2: ( rule__Class__IsAbstractAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOntoUMLArchive.g:1076:3: rule__Class__IsAbstractAssignment_0
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
    // InternalOntoUMLArchive.g:1084:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1088:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalOntoUMLArchive.g:1089:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUMLArchive.g:1096:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1100:1: ( ( 'class' ) )
            // InternalOntoUMLArchive.g:1101:1: ( 'class' )
            {
            // InternalOntoUMLArchive.g:1101:1: ( 'class' )
            // InternalOntoUMLArchive.g:1102:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1111:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1115:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalOntoUMLArchive.g:1116:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalOntoUMLArchive.g:1123:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1127:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalOntoUMLArchive.g:1128:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalOntoUMLArchive.g:1128:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalOntoUMLArchive.g:1129:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalOntoUMLArchive.g:1130:2: ( rule__Class__NameAssignment_2 )
            // InternalOntoUMLArchive.g:1130:3: rule__Class__NameAssignment_2
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
    // InternalOntoUMLArchive.g:1138:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1142:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalOntoUMLArchive.g:1143:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalOntoUMLArchive.g:1150:1: rule__Class__Group__3__Impl : ( ( rule__Class__StereotypesAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1154:1: ( ( ( rule__Class__StereotypesAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:1155:1: ( ( rule__Class__StereotypesAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:1155:1: ( ( rule__Class__StereotypesAssignment_3 )* )
            // InternalOntoUMLArchive.g:1156:2: ( rule__Class__StereotypesAssignment_3 )*
            {
             before(grammarAccess.getClassAccess().getStereotypesAssignment_3()); 
            // InternalOntoUMLArchive.g:1157:2: ( rule__Class__StereotypesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STEREOTYPE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1157:3: rule__Class__StereotypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Class__StereotypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalOntoUMLArchive.g:1165:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1169:1: ( rule__Class__Group__4__Impl )
            // InternalOntoUMLArchive.g:1170:2: rule__Class__Group__4__Impl
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
    // InternalOntoUMLArchive.g:1176:1: rule__Class__Group__4__Impl : ( ( rule__Class__AttributesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1180:1: ( ( ( rule__Class__AttributesAssignment_4 )* ) )
            // InternalOntoUMLArchive.g:1181:1: ( ( rule__Class__AttributesAssignment_4 )* )
            {
            // InternalOntoUMLArchive.g:1181:1: ( ( rule__Class__AttributesAssignment_4 )* )
            // InternalOntoUMLArchive.g:1182:2: ( rule__Class__AttributesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4()); 
            // InternalOntoUMLArchive.g:1183:2: ( rule__Class__AttributesAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1183:3: rule__Class__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Class__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalOntoUMLArchive.g:1192:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1196:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalOntoUMLArchive.g:1197:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOntoUMLArchive.g:1204:1: rule__Attribute__Group__0__Impl : ( 'att' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1208:1: ( ( 'att' ) )
            // InternalOntoUMLArchive.g:1209:1: ( 'att' )
            {
            // InternalOntoUMLArchive.g:1209:1: ( 'att' )
            // InternalOntoUMLArchive.g:1210:2: 'att'
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1219:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1223:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalOntoUMLArchive.g:1224:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalOntoUMLArchive.g:1231:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1235:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:1236:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:1236:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalOntoUMLArchive.g:1237:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1238:2: ( rule__Attribute__NameAssignment_1 )
            // InternalOntoUMLArchive.g:1238:3: rule__Attribute__NameAssignment_1
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
    // InternalOntoUMLArchive.g:1246:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1250:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalOntoUMLArchive.g:1251:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1258:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__MultiplicityAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1262:1: ( ( ( rule__Attribute__MultiplicityAssignment_2 ) ) )
            // InternalOntoUMLArchive.g:1263:1: ( ( rule__Attribute__MultiplicityAssignment_2 ) )
            {
            // InternalOntoUMLArchive.g:1263:1: ( ( rule__Attribute__MultiplicityAssignment_2 ) )
            // InternalOntoUMLArchive.g:1264:2: ( rule__Attribute__MultiplicityAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2()); 
            // InternalOntoUMLArchive.g:1265:2: ( rule__Attribute__MultiplicityAssignment_2 )
            // InternalOntoUMLArchive.g:1265:3: rule__Attribute__MultiplicityAssignment_2
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
    // InternalOntoUMLArchive.g:1273:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1277:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalOntoUMLArchive.g:1278:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUMLArchive.g:1285:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1289:1: ( ( ':' ) )
            // InternalOntoUMLArchive.g:1290:1: ( ':' )
            {
            // InternalOntoUMLArchive.g:1290:1: ( ':' )
            // InternalOntoUMLArchive.g:1291:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1300:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1304:1: ( rule__Attribute__Group__4__Impl )
            // InternalOntoUMLArchive.g:1305:2: rule__Attribute__Group__4__Impl
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
    // InternalOntoUMLArchive.g:1311:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__AttTypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1315:1: ( ( ( rule__Attribute__AttTypeAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:1316:1: ( ( rule__Attribute__AttTypeAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:1316:1: ( ( rule__Attribute__AttTypeAssignment_4 ) )
            // InternalOntoUMLArchive.g:1317:2: ( rule__Attribute__AttTypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAssignment_4()); 
            // InternalOntoUMLArchive.g:1318:2: ( rule__Attribute__AttTypeAssignment_4 )
            // InternalOntoUMLArchive.g:1318:3: rule__Attribute__AttTypeAssignment_4
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


    // $ANTLR start "rule__DirectedAssociation__Group__0"
    // InternalOntoUMLArchive.g:1327:1: rule__DirectedAssociation__Group__0 : rule__DirectedAssociation__Group__0__Impl rule__DirectedAssociation__Group__1 ;
    public final void rule__DirectedAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1331:1: ( rule__DirectedAssociation__Group__0__Impl rule__DirectedAssociation__Group__1 )
            // InternalOntoUMLArchive.g:1332:2: rule__DirectedAssociation__Group__0__Impl rule__DirectedAssociation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__DirectedAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedAssociation__Group__1();

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
    // $ANTLR end "rule__DirectedAssociation__Group__0"


    // $ANTLR start "rule__DirectedAssociation__Group__0__Impl"
    // InternalOntoUMLArchive.g:1339:1: rule__DirectedAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__DirectedAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1343:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:1344:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:1344:1: ( 'association' )
            // InternalOntoUMLArchive.g:1345:2: 'association'
            {
             before(grammarAccess.getDirectedAssociationAccess().getAssociationKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDirectedAssociationAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__Group__0__Impl"


    // $ANTLR start "rule__DirectedAssociation__Group__1"
    // InternalOntoUMLArchive.g:1354:1: rule__DirectedAssociation__Group__1 : rule__DirectedAssociation__Group__1__Impl rule__DirectedAssociation__Group__2 ;
    public final void rule__DirectedAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1358:1: ( rule__DirectedAssociation__Group__1__Impl rule__DirectedAssociation__Group__2 )
            // InternalOntoUMLArchive.g:1359:2: rule__DirectedAssociation__Group__1__Impl rule__DirectedAssociation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DirectedAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedAssociation__Group__2();

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
    // $ANTLR end "rule__DirectedAssociation__Group__1"


    // $ANTLR start "rule__DirectedAssociation__Group__1__Impl"
    // InternalOntoUMLArchive.g:1366:1: rule__DirectedAssociation__Group__1__Impl : ( ( rule__DirectedAssociation__NameAssignment_1 )? ) ;
    public final void rule__DirectedAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1370:1: ( ( ( rule__DirectedAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1371:1: ( ( rule__DirectedAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1371:1: ( ( rule__DirectedAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1372:2: ( rule__DirectedAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getDirectedAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1373:2: ( rule__DirectedAssociation__NameAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOntoUMLArchive.g:1373:3: rule__DirectedAssociation__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectedAssociation__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectedAssociationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__Group__1__Impl"


    // $ANTLR start "rule__DirectedAssociation__Group__2"
    // InternalOntoUMLArchive.g:1381:1: rule__DirectedAssociation__Group__2 : rule__DirectedAssociation__Group__2__Impl rule__DirectedAssociation__Group__3 ;
    public final void rule__DirectedAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1385:1: ( rule__DirectedAssociation__Group__2__Impl rule__DirectedAssociation__Group__3 )
            // InternalOntoUMLArchive.g:1386:2: rule__DirectedAssociation__Group__2__Impl rule__DirectedAssociation__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__DirectedAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedAssociation__Group__3();

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
    // $ANTLR end "rule__DirectedAssociation__Group__2"


    // $ANTLR start "rule__DirectedAssociation__Group__2__Impl"
    // InternalOntoUMLArchive.g:1393:1: rule__DirectedAssociation__Group__2__Impl : ( ( rule__DirectedAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__DirectedAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1397:1: ( ( ( rule__DirectedAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1398:1: ( ( rule__DirectedAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1398:1: ( ( rule__DirectedAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1399:2: ( rule__DirectedAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getDirectedAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1400:2: ( rule__DirectedAssociation__StereotypesAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STEREOTYPE_STRING) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1400:3: rule__DirectedAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DirectedAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDirectedAssociationAccess().getStereotypesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__Group__2__Impl"


    // $ANTLR start "rule__DirectedAssociation__Group__3"
    // InternalOntoUMLArchive.g:1408:1: rule__DirectedAssociation__Group__3 : rule__DirectedAssociation__Group__3__Impl rule__DirectedAssociation__Group__4 ;
    public final void rule__DirectedAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1412:1: ( rule__DirectedAssociation__Group__3__Impl rule__DirectedAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1413:2: rule__DirectedAssociation__Group__3__Impl rule__DirectedAssociation__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__DirectedAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedAssociation__Group__4();

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
    // $ANTLR end "rule__DirectedAssociation__Group__3"


    // $ANTLR start "rule__DirectedAssociation__Group__3__Impl"
    // InternalOntoUMLArchive.g:1420:1: rule__DirectedAssociation__Group__3__Impl : ( 'from' ) ;
    public final void rule__DirectedAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1424:1: ( ( 'from' ) )
            // InternalOntoUMLArchive.g:1425:1: ( 'from' )
            {
            // InternalOntoUMLArchive.g:1425:1: ( 'from' )
            // InternalOntoUMLArchive.g:1426:2: 'from'
            {
             before(grammarAccess.getDirectedAssociationAccess().getFromKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDirectedAssociationAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__Group__3__Impl"


    // $ANTLR start "rule__DirectedAssociation__Group__4"
    // InternalOntoUMLArchive.g:1435:1: rule__DirectedAssociation__Group__4 : rule__DirectedAssociation__Group__4__Impl rule__DirectedAssociation__Group__5 ;
    public final void rule__DirectedAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1439:1: ( rule__DirectedAssociation__Group__4__Impl rule__DirectedAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1440:2: rule__DirectedAssociation__Group__4__Impl rule__DirectedAssociation__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__DirectedAssociation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedAssociation__Group__5();

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
    // $ANTLR end "rule__DirectedAssociation__Group__4"


    // $ANTLR start "rule__DirectedAssociation__Group__4__Impl"
    // InternalOntoUMLArchive.g:1447:1: rule__DirectedAssociation__Group__4__Impl : ( ( rule__DirectedAssociation__FromAssignment_4 ) ) ;
    public final void rule__DirectedAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1451:1: ( ( ( rule__DirectedAssociation__FromAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:1452:1: ( ( rule__DirectedAssociation__FromAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:1452:1: ( ( rule__DirectedAssociation__FromAssignment_4 ) )
            // InternalOntoUMLArchive.g:1453:2: ( rule__DirectedAssociation__FromAssignment_4 )
            {
             before(grammarAccess.getDirectedAssociationAccess().getFromAssignment_4()); 
            // InternalOntoUMLArchive.g:1454:2: ( rule__DirectedAssociation__FromAssignment_4 )
            // InternalOntoUMLArchive.g:1454:3: rule__DirectedAssociation__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAssociation__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDirectedAssociationAccess().getFromAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__Group__4__Impl"


    // $ANTLR start "rule__DirectedAssociation__Group__5"
    // InternalOntoUMLArchive.g:1462:1: rule__DirectedAssociation__Group__5 : rule__DirectedAssociation__Group__5__Impl rule__DirectedAssociation__Group__6 ;
    public final void rule__DirectedAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1466:1: ( rule__DirectedAssociation__Group__5__Impl rule__DirectedAssociation__Group__6 )
            // InternalOntoUMLArchive.g:1467:2: rule__DirectedAssociation__Group__5__Impl rule__DirectedAssociation__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__DirectedAssociation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedAssociation__Group__6();

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
    // $ANTLR end "rule__DirectedAssociation__Group__5"


    // $ANTLR start "rule__DirectedAssociation__Group__5__Impl"
    // InternalOntoUMLArchive.g:1474:1: rule__DirectedAssociation__Group__5__Impl : ( 'to' ) ;
    public final void rule__DirectedAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1478:1: ( ( 'to' ) )
            // InternalOntoUMLArchive.g:1479:1: ( 'to' )
            {
            // InternalOntoUMLArchive.g:1479:1: ( 'to' )
            // InternalOntoUMLArchive.g:1480:2: 'to'
            {
             before(grammarAccess.getDirectedAssociationAccess().getToKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDirectedAssociationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__Group__5__Impl"


    // $ANTLR start "rule__DirectedAssociation__Group__6"
    // InternalOntoUMLArchive.g:1489:1: rule__DirectedAssociation__Group__6 : rule__DirectedAssociation__Group__6__Impl ;
    public final void rule__DirectedAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1493:1: ( rule__DirectedAssociation__Group__6__Impl )
            // InternalOntoUMLArchive.g:1494:2: rule__DirectedAssociation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAssociation__Group__6__Impl();

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
    // $ANTLR end "rule__DirectedAssociation__Group__6"


    // $ANTLR start "rule__DirectedAssociation__Group__6__Impl"
    // InternalOntoUMLArchive.g:1500:1: rule__DirectedAssociation__Group__6__Impl : ( ( rule__DirectedAssociation__ToAssignment_6 ) ) ;
    public final void rule__DirectedAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1504:1: ( ( ( rule__DirectedAssociation__ToAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:1505:1: ( ( rule__DirectedAssociation__ToAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:1505:1: ( ( rule__DirectedAssociation__ToAssignment_6 ) )
            // InternalOntoUMLArchive.g:1506:2: ( rule__DirectedAssociation__ToAssignment_6 )
            {
             before(grammarAccess.getDirectedAssociationAccess().getToAssignment_6()); 
            // InternalOntoUMLArchive.g:1507:2: ( rule__DirectedAssociation__ToAssignment_6 )
            // InternalOntoUMLArchive.g:1507:3: rule__DirectedAssociation__ToAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAssociation__ToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDirectedAssociationAccess().getToAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__Group__6__Impl"


    // $ANTLR start "rule__UndirectedAssociation__Group__0"
    // InternalOntoUMLArchive.g:1516:1: rule__UndirectedAssociation__Group__0 : rule__UndirectedAssociation__Group__0__Impl rule__UndirectedAssociation__Group__1 ;
    public final void rule__UndirectedAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1520:1: ( rule__UndirectedAssociation__Group__0__Impl rule__UndirectedAssociation__Group__1 )
            // InternalOntoUMLArchive.g:1521:2: rule__UndirectedAssociation__Group__0__Impl rule__UndirectedAssociation__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__UndirectedAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedAssociation__Group__1();

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
    // $ANTLR end "rule__UndirectedAssociation__Group__0"


    // $ANTLR start "rule__UndirectedAssociation__Group__0__Impl"
    // InternalOntoUMLArchive.g:1528:1: rule__UndirectedAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__UndirectedAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1532:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:1533:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:1533:1: ( 'association' )
            // InternalOntoUMLArchive.g:1534:2: 'association'
            {
             before(grammarAccess.getUndirectedAssociationAccess().getAssociationKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUndirectedAssociationAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__Group__0__Impl"


    // $ANTLR start "rule__UndirectedAssociation__Group__1"
    // InternalOntoUMLArchive.g:1543:1: rule__UndirectedAssociation__Group__1 : rule__UndirectedAssociation__Group__1__Impl rule__UndirectedAssociation__Group__2 ;
    public final void rule__UndirectedAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1547:1: ( rule__UndirectedAssociation__Group__1__Impl rule__UndirectedAssociation__Group__2 )
            // InternalOntoUMLArchive.g:1548:2: rule__UndirectedAssociation__Group__1__Impl rule__UndirectedAssociation__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__UndirectedAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedAssociation__Group__2();

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
    // $ANTLR end "rule__UndirectedAssociation__Group__1"


    // $ANTLR start "rule__UndirectedAssociation__Group__1__Impl"
    // InternalOntoUMLArchive.g:1555:1: rule__UndirectedAssociation__Group__1__Impl : ( ( rule__UndirectedAssociation__NameAssignment_1 )? ) ;
    public final void rule__UndirectedAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1559:1: ( ( ( rule__UndirectedAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1560:1: ( ( rule__UndirectedAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1560:1: ( ( rule__UndirectedAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1561:2: ( rule__UndirectedAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getUndirectedAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1562:2: ( rule__UndirectedAssociation__NameAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOntoUMLArchive.g:1562:3: rule__UndirectedAssociation__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UndirectedAssociation__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUndirectedAssociationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__Group__1__Impl"


    // $ANTLR start "rule__UndirectedAssociation__Group__2"
    // InternalOntoUMLArchive.g:1570:1: rule__UndirectedAssociation__Group__2 : rule__UndirectedAssociation__Group__2__Impl rule__UndirectedAssociation__Group__3 ;
    public final void rule__UndirectedAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1574:1: ( rule__UndirectedAssociation__Group__2__Impl rule__UndirectedAssociation__Group__3 )
            // InternalOntoUMLArchive.g:1575:2: rule__UndirectedAssociation__Group__2__Impl rule__UndirectedAssociation__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__UndirectedAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedAssociation__Group__3();

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
    // $ANTLR end "rule__UndirectedAssociation__Group__2"


    // $ANTLR start "rule__UndirectedAssociation__Group__2__Impl"
    // InternalOntoUMLArchive.g:1582:1: rule__UndirectedAssociation__Group__2__Impl : ( ( rule__UndirectedAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__UndirectedAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1586:1: ( ( ( rule__UndirectedAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1587:1: ( ( rule__UndirectedAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1587:1: ( ( rule__UndirectedAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1588:2: ( rule__UndirectedAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getUndirectedAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1589:2: ( rule__UndirectedAssociation__StereotypesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STEREOTYPE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1589:3: rule__UndirectedAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UndirectedAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getUndirectedAssociationAccess().getStereotypesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__Group__2__Impl"


    // $ANTLR start "rule__UndirectedAssociation__Group__3"
    // InternalOntoUMLArchive.g:1597:1: rule__UndirectedAssociation__Group__3 : rule__UndirectedAssociation__Group__3__Impl rule__UndirectedAssociation__Group__4 ;
    public final void rule__UndirectedAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1601:1: ( rule__UndirectedAssociation__Group__3__Impl rule__UndirectedAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1602:2: rule__UndirectedAssociation__Group__3__Impl rule__UndirectedAssociation__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__UndirectedAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedAssociation__Group__4();

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
    // $ANTLR end "rule__UndirectedAssociation__Group__3"


    // $ANTLR start "rule__UndirectedAssociation__Group__3__Impl"
    // InternalOntoUMLArchive.g:1609:1: rule__UndirectedAssociation__Group__3__Impl : ( 'end' ) ;
    public final void rule__UndirectedAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1613:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1614:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1614:1: ( 'end' )
            // InternalOntoUMLArchive.g:1615:2: 'end'
            {
             before(grammarAccess.getUndirectedAssociationAccess().getEndKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUndirectedAssociationAccess().getEndKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__Group__3__Impl"


    // $ANTLR start "rule__UndirectedAssociation__Group__4"
    // InternalOntoUMLArchive.g:1624:1: rule__UndirectedAssociation__Group__4 : rule__UndirectedAssociation__Group__4__Impl rule__UndirectedAssociation__Group__5 ;
    public final void rule__UndirectedAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1628:1: ( rule__UndirectedAssociation__Group__4__Impl rule__UndirectedAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1629:2: rule__UndirectedAssociation__Group__4__Impl rule__UndirectedAssociation__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__UndirectedAssociation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedAssociation__Group__5();

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
    // $ANTLR end "rule__UndirectedAssociation__Group__4"


    // $ANTLR start "rule__UndirectedAssociation__Group__4__Impl"
    // InternalOntoUMLArchive.g:1636:1: rule__UndirectedAssociation__Group__4__Impl : ( ( rule__UndirectedAssociation__EndAAssignment_4 ) ) ;
    public final void rule__UndirectedAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1640:1: ( ( ( rule__UndirectedAssociation__EndAAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:1641:1: ( ( rule__UndirectedAssociation__EndAAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:1641:1: ( ( rule__UndirectedAssociation__EndAAssignment_4 ) )
            // InternalOntoUMLArchive.g:1642:2: ( rule__UndirectedAssociation__EndAAssignment_4 )
            {
             before(grammarAccess.getUndirectedAssociationAccess().getEndAAssignment_4()); 
            // InternalOntoUMLArchive.g:1643:2: ( rule__UndirectedAssociation__EndAAssignment_4 )
            // InternalOntoUMLArchive.g:1643:3: rule__UndirectedAssociation__EndAAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedAssociation__EndAAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedAssociationAccess().getEndAAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__Group__4__Impl"


    // $ANTLR start "rule__UndirectedAssociation__Group__5"
    // InternalOntoUMLArchive.g:1651:1: rule__UndirectedAssociation__Group__5 : rule__UndirectedAssociation__Group__5__Impl rule__UndirectedAssociation__Group__6 ;
    public final void rule__UndirectedAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1655:1: ( rule__UndirectedAssociation__Group__5__Impl rule__UndirectedAssociation__Group__6 )
            // InternalOntoUMLArchive.g:1656:2: rule__UndirectedAssociation__Group__5__Impl rule__UndirectedAssociation__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__UndirectedAssociation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UndirectedAssociation__Group__6();

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
    // $ANTLR end "rule__UndirectedAssociation__Group__5"


    // $ANTLR start "rule__UndirectedAssociation__Group__5__Impl"
    // InternalOntoUMLArchive.g:1663:1: rule__UndirectedAssociation__Group__5__Impl : ( 'end' ) ;
    public final void rule__UndirectedAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1667:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1668:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1668:1: ( 'end' )
            // InternalOntoUMLArchive.g:1669:2: 'end'
            {
             before(grammarAccess.getUndirectedAssociationAccess().getEndKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUndirectedAssociationAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__Group__5__Impl"


    // $ANTLR start "rule__UndirectedAssociation__Group__6"
    // InternalOntoUMLArchive.g:1678:1: rule__UndirectedAssociation__Group__6 : rule__UndirectedAssociation__Group__6__Impl ;
    public final void rule__UndirectedAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1682:1: ( rule__UndirectedAssociation__Group__6__Impl )
            // InternalOntoUMLArchive.g:1683:2: rule__UndirectedAssociation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedAssociation__Group__6__Impl();

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
    // $ANTLR end "rule__UndirectedAssociation__Group__6"


    // $ANTLR start "rule__UndirectedAssociation__Group__6__Impl"
    // InternalOntoUMLArchive.g:1689:1: rule__UndirectedAssociation__Group__6__Impl : ( ( rule__UndirectedAssociation__EndBAssignment_6 ) ) ;
    public final void rule__UndirectedAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1693:1: ( ( ( rule__UndirectedAssociation__EndBAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:1694:1: ( ( rule__UndirectedAssociation__EndBAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:1694:1: ( ( rule__UndirectedAssociation__EndBAssignment_6 ) )
            // InternalOntoUMLArchive.g:1695:2: ( rule__UndirectedAssociation__EndBAssignment_6 )
            {
             before(grammarAccess.getUndirectedAssociationAccess().getEndBAssignment_6()); 
            // InternalOntoUMLArchive.g:1696:2: ( rule__UndirectedAssociation__EndBAssignment_6 )
            // InternalOntoUMLArchive.g:1696:3: rule__UndirectedAssociation__EndBAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__UndirectedAssociation__EndBAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedAssociationAccess().getEndBAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__Group__6__Impl"


    // $ANTLR start "rule__NaryAssociation__Group__0"
    // InternalOntoUMLArchive.g:1705:1: rule__NaryAssociation__Group__0 : rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1 ;
    public final void rule__NaryAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1709:1: ( rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1 )
            // InternalOntoUMLArchive.g:1710:2: rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1
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
    // InternalOntoUMLArchive.g:1717:1: rule__NaryAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__NaryAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1721:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:1722:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:1722:1: ( 'association' )
            // InternalOntoUMLArchive.g:1723:2: 'association'
            {
             before(grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1732:1: rule__NaryAssociation__Group__1 : rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2 ;
    public final void rule__NaryAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1736:1: ( rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2 )
            // InternalOntoUMLArchive.g:1737:2: rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2
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
    // InternalOntoUMLArchive.g:1744:1: rule__NaryAssociation__Group__1__Impl : ( ( rule__NaryAssociation__NameAssignment_1 )? ) ;
    public final void rule__NaryAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1748:1: ( ( ( rule__NaryAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1749:1: ( ( rule__NaryAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1749:1: ( ( rule__NaryAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1750:2: ( rule__NaryAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getNaryAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1751:2: ( rule__NaryAssociation__NameAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOntoUMLArchive.g:1751:3: rule__NaryAssociation__NameAssignment_1
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
    // InternalOntoUMLArchive.g:1759:1: rule__NaryAssociation__Group__2 : rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3 ;
    public final void rule__NaryAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1763:1: ( rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3 )
            // InternalOntoUMLArchive.g:1764:2: rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3
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
    // InternalOntoUMLArchive.g:1771:1: rule__NaryAssociation__Group__2__Impl : ( ( rule__NaryAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__NaryAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1775:1: ( ( ( rule__NaryAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1776:1: ( ( rule__NaryAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1776:1: ( ( rule__NaryAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1777:2: ( rule__NaryAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getNaryAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1778:2: ( rule__NaryAssociation__StereotypesAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STEREOTYPE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1778:3: rule__NaryAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__NaryAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalOntoUMLArchive.g:1786:1: rule__NaryAssociation__Group__3 : rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4 ;
    public final void rule__NaryAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1790:1: ( rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1791:2: rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4
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
    // InternalOntoUMLArchive.g:1798:1: rule__NaryAssociation__Group__3__Impl : ( ( rule__NaryAssociation__Group_3__0 ) ) ;
    public final void rule__NaryAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1802:1: ( ( ( rule__NaryAssociation__Group_3__0 ) ) )
            // InternalOntoUMLArchive.g:1803:1: ( ( rule__NaryAssociation__Group_3__0 ) )
            {
            // InternalOntoUMLArchive.g:1803:1: ( ( rule__NaryAssociation__Group_3__0 ) )
            // InternalOntoUMLArchive.g:1804:2: ( rule__NaryAssociation__Group_3__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_3()); 
            // InternalOntoUMLArchive.g:1805:2: ( rule__NaryAssociation__Group_3__0 )
            // InternalOntoUMLArchive.g:1805:3: rule__NaryAssociation__Group_3__0
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
    // InternalOntoUMLArchive.g:1813:1: rule__NaryAssociation__Group__4 : rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5 ;
    public final void rule__NaryAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1817:1: ( rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1818:2: rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5
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
    // InternalOntoUMLArchive.g:1825:1: rule__NaryAssociation__Group__4__Impl : ( ( rule__NaryAssociation__Group_4__0 ) ) ;
    public final void rule__NaryAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1829:1: ( ( ( rule__NaryAssociation__Group_4__0 ) ) )
            // InternalOntoUMLArchive.g:1830:1: ( ( rule__NaryAssociation__Group_4__0 ) )
            {
            // InternalOntoUMLArchive.g:1830:1: ( ( rule__NaryAssociation__Group_4__0 ) )
            // InternalOntoUMLArchive.g:1831:2: ( rule__NaryAssociation__Group_4__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_4()); 
            // InternalOntoUMLArchive.g:1832:2: ( rule__NaryAssociation__Group_4__0 )
            // InternalOntoUMLArchive.g:1832:3: rule__NaryAssociation__Group_4__0
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
    // InternalOntoUMLArchive.g:1840:1: rule__NaryAssociation__Group__5 : rule__NaryAssociation__Group__5__Impl ;
    public final void rule__NaryAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1844:1: ( rule__NaryAssociation__Group__5__Impl )
            // InternalOntoUMLArchive.g:1845:2: rule__NaryAssociation__Group__5__Impl
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
    // InternalOntoUMLArchive.g:1851:1: rule__NaryAssociation__Group__5__Impl : ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) ) ;
    public final void rule__NaryAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1855:1: ( ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) ) )
            // InternalOntoUMLArchive.g:1856:1: ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) )
            {
            // InternalOntoUMLArchive.g:1856:1: ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) )
            // InternalOntoUMLArchive.g:1857:2: ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* )
            {
            // InternalOntoUMLArchive.g:1857:2: ( ( rule__NaryAssociation__Group_5__0 ) )
            // InternalOntoUMLArchive.g:1858:3: ( rule__NaryAssociation__Group_5__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1859:3: ( rule__NaryAssociation__Group_5__0 )
            // InternalOntoUMLArchive.g:1859:4: rule__NaryAssociation__Group_5__0
            {
            pushFollow(FOLLOW_19);
            rule__NaryAssociation__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getGroup_5()); 

            }

            // InternalOntoUMLArchive.g:1862:2: ( ( rule__NaryAssociation__Group_5__0 )* )
            // InternalOntoUMLArchive.g:1863:3: ( rule__NaryAssociation__Group_5__0 )*
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1864:3: ( rule__NaryAssociation__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1864:4: rule__NaryAssociation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__NaryAssociation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalOntoUMLArchive.g:1874:1: rule__NaryAssociation__Group_3__0 : rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1 ;
    public final void rule__NaryAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1878:1: ( rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1 )
            // InternalOntoUMLArchive.g:1879:2: rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:1886:1: rule__NaryAssociation__Group_3__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1890:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1891:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1891:1: ( 'end' )
            // InternalOntoUMLArchive.g:1892:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1901:1: rule__NaryAssociation__Group_3__1 : rule__NaryAssociation__Group_3__1__Impl ;
    public final void rule__NaryAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1905:1: ( rule__NaryAssociation__Group_3__1__Impl )
            // InternalOntoUMLArchive.g:1906:2: rule__NaryAssociation__Group_3__1__Impl
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
    // InternalOntoUMLArchive.g:1912:1: rule__NaryAssociation__Group_3__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_3_1 ) ) ;
    public final void rule__NaryAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1916:1: ( ( ( rule__NaryAssociation__EndsAssignment_3_1 ) ) )
            // InternalOntoUMLArchive.g:1917:1: ( ( rule__NaryAssociation__EndsAssignment_3_1 ) )
            {
            // InternalOntoUMLArchive.g:1917:1: ( ( rule__NaryAssociation__EndsAssignment_3_1 ) )
            // InternalOntoUMLArchive.g:1918:2: ( rule__NaryAssociation__EndsAssignment_3_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_3_1()); 
            // InternalOntoUMLArchive.g:1919:2: ( rule__NaryAssociation__EndsAssignment_3_1 )
            // InternalOntoUMLArchive.g:1919:3: rule__NaryAssociation__EndsAssignment_3_1
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
    // InternalOntoUMLArchive.g:1928:1: rule__NaryAssociation__Group_4__0 : rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1 ;
    public final void rule__NaryAssociation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1932:1: ( rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1 )
            // InternalOntoUMLArchive.g:1933:2: rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:1940:1: rule__NaryAssociation__Group_4__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1944:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1945:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1945:1: ( 'end' )
            // InternalOntoUMLArchive.g:1946:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1955:1: rule__NaryAssociation__Group_4__1 : rule__NaryAssociation__Group_4__1__Impl ;
    public final void rule__NaryAssociation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1959:1: ( rule__NaryAssociation__Group_4__1__Impl )
            // InternalOntoUMLArchive.g:1960:2: rule__NaryAssociation__Group_4__1__Impl
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
    // InternalOntoUMLArchive.g:1966:1: rule__NaryAssociation__Group_4__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_4_1 ) ) ;
    public final void rule__NaryAssociation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1970:1: ( ( ( rule__NaryAssociation__EndsAssignment_4_1 ) ) )
            // InternalOntoUMLArchive.g:1971:1: ( ( rule__NaryAssociation__EndsAssignment_4_1 ) )
            {
            // InternalOntoUMLArchive.g:1971:1: ( ( rule__NaryAssociation__EndsAssignment_4_1 ) )
            // InternalOntoUMLArchive.g:1972:2: ( rule__NaryAssociation__EndsAssignment_4_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_4_1()); 
            // InternalOntoUMLArchive.g:1973:2: ( rule__NaryAssociation__EndsAssignment_4_1 )
            // InternalOntoUMLArchive.g:1973:3: rule__NaryAssociation__EndsAssignment_4_1
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
    // InternalOntoUMLArchive.g:1982:1: rule__NaryAssociation__Group_5__0 : rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1 ;
    public final void rule__NaryAssociation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1986:1: ( rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1 )
            // InternalOntoUMLArchive.g:1987:2: rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:1994:1: rule__NaryAssociation__Group_5__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1998:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1999:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1999:1: ( 'end' )
            // InternalOntoUMLArchive.g:2000:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2009:1: rule__NaryAssociation__Group_5__1 : rule__NaryAssociation__Group_5__1__Impl ;
    public final void rule__NaryAssociation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2013:1: ( rule__NaryAssociation__Group_5__1__Impl )
            // InternalOntoUMLArchive.g:2014:2: rule__NaryAssociation__Group_5__1__Impl
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
    // InternalOntoUMLArchive.g:2020:1: rule__NaryAssociation__Group_5__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_5_1 ) ) ;
    public final void rule__NaryAssociation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2024:1: ( ( ( rule__NaryAssociation__EndsAssignment_5_1 ) ) )
            // InternalOntoUMLArchive.g:2025:1: ( ( rule__NaryAssociation__EndsAssignment_5_1 ) )
            {
            // InternalOntoUMLArchive.g:2025:1: ( ( rule__NaryAssociation__EndsAssignment_5_1 ) )
            // InternalOntoUMLArchive.g:2026:2: ( rule__NaryAssociation__EndsAssignment_5_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_5_1()); 
            // InternalOntoUMLArchive.g:2027:2: ( rule__NaryAssociation__EndsAssignment_5_1 )
            // InternalOntoUMLArchive.g:2027:3: rule__NaryAssociation__EndsAssignment_5_1
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
    // InternalOntoUMLArchive.g:2036:1: rule__AssociationEnd__Group__0 : rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 ;
    public final void rule__AssociationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2040:1: ( rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 )
            // InternalOntoUMLArchive.g:2041:2: rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:2048:1: rule__AssociationEnd__Group__0__Impl : ( ( rule__AssociationEnd__AggregationKindAssignment_0 )? ) ;
    public final void rule__AssociationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2052:1: ( ( ( rule__AssociationEnd__AggregationKindAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:2053:1: ( ( rule__AssociationEnd__AggregationKindAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:2053:1: ( ( rule__AssociationEnd__AggregationKindAssignment_0 )? )
            // InternalOntoUMLArchive.g:2054:2: ( rule__AssociationEnd__AggregationKindAssignment_0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getAggregationKindAssignment_0()); 
            // InternalOntoUMLArchive.g:2055:2: ( rule__AssociationEnd__AggregationKindAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=13 && LA22_0<=14)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoUMLArchive.g:2055:3: rule__AssociationEnd__AggregationKindAssignment_0
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
    // InternalOntoUMLArchive.g:2063:1: rule__AssociationEnd__Group__1 : rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 ;
    public final void rule__AssociationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2067:1: ( rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 )
            // InternalOntoUMLArchive.g:2068:2: rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:2075:1: rule__AssociationEnd__Group__1__Impl : ( ( rule__AssociationEnd__NameAssignment_1 )? ) ;
    public final void rule__AssociationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2079:1: ( ( ( rule__AssociationEnd__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2080:1: ( ( rule__AssociationEnd__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2080:1: ( ( rule__AssociationEnd__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2081:2: ( rule__AssociationEnd__NameAssignment_1 )?
            {
             before(grammarAccess.getAssociationEndAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2082:2: ( rule__AssociationEnd__NameAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOntoUMLArchive.g:2082:3: rule__AssociationEnd__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2090:1: rule__AssociationEnd__Group__2 : rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 ;
    public final void rule__AssociationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2094:1: ( rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 )
            // InternalOntoUMLArchive.g:2095:2: rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:2102:1: rule__AssociationEnd__Group__2__Impl : ( ( rule__AssociationEnd__MultiplicityAssignment_2 )? ) ;
    public final void rule__AssociationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2106:1: ( ( ( rule__AssociationEnd__MultiplicityAssignment_2 )? ) )
            // InternalOntoUMLArchive.g:2107:1: ( ( rule__AssociationEnd__MultiplicityAssignment_2 )? )
            {
            // InternalOntoUMLArchive.g:2107:1: ( ( rule__AssociationEnd__MultiplicityAssignment_2 )? )
            // InternalOntoUMLArchive.g:2108:2: ( rule__AssociationEnd__MultiplicityAssignment_2 )?
            {
             before(grammarAccess.getAssociationEndAccess().getMultiplicityAssignment_2()); 
            // InternalOntoUMLArchive.g:2109:2: ( rule__AssociationEnd__MultiplicityAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOntoUMLArchive.g:2109:3: rule__AssociationEnd__MultiplicityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__MultiplicityAssignment_2();

                    state._fsp--;


                    }
                    break;

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
    // InternalOntoUMLArchive.g:2117:1: rule__AssociationEnd__Group__3 : rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 ;
    public final void rule__AssociationEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2121:1: ( rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 )
            // InternalOntoUMLArchive.g:2122:2: rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUMLArchive.g:2129:1: rule__AssociationEnd__Group__3__Impl : ( ':' ) ;
    public final void rule__AssociationEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2133:1: ( ( ':' ) )
            // InternalOntoUMLArchive.g:2134:1: ( ':' )
            {
            // InternalOntoUMLArchive.g:2134:1: ( ':' )
            // InternalOntoUMLArchive.g:2135:2: ':'
            {
             before(grammarAccess.getAssociationEndAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2144:1: rule__AssociationEnd__Group__4 : rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 ;
    public final void rule__AssociationEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2148:1: ( rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 )
            // InternalOntoUMLArchive.g:2149:2: rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalOntoUMLArchive.g:2156:1: rule__AssociationEnd__Group__4__Impl : ( ( rule__AssociationEnd__EndTypeAssignment_4 ) ) ;
    public final void rule__AssociationEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2160:1: ( ( ( rule__AssociationEnd__EndTypeAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:2161:1: ( ( rule__AssociationEnd__EndTypeAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:2161:1: ( ( rule__AssociationEnd__EndTypeAssignment_4 ) )
            // InternalOntoUMLArchive.g:2162:2: ( rule__AssociationEnd__EndTypeAssignment_4 )
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeAssignment_4()); 
            // InternalOntoUMLArchive.g:2163:2: ( rule__AssociationEnd__EndTypeAssignment_4 )
            // InternalOntoUMLArchive.g:2163:3: rule__AssociationEnd__EndTypeAssignment_4
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
    // InternalOntoUMLArchive.g:2171:1: rule__AssociationEnd__Group__5 : rule__AssociationEnd__Group__5__Impl ;
    public final void rule__AssociationEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2175:1: ( rule__AssociationEnd__Group__5__Impl )
            // InternalOntoUMLArchive.g:2176:2: rule__AssociationEnd__Group__5__Impl
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
    // InternalOntoUMLArchive.g:2182:1: rule__AssociationEnd__Group__5__Impl : ( ( rule__AssociationEnd__Group_5__0 )? ) ;
    public final void rule__AssociationEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2186:1: ( ( ( rule__AssociationEnd__Group_5__0 )? ) )
            // InternalOntoUMLArchive.g:2187:1: ( ( rule__AssociationEnd__Group_5__0 )? )
            {
            // InternalOntoUMLArchive.g:2187:1: ( ( rule__AssociationEnd__Group_5__0 )? )
            // InternalOntoUMLArchive.g:2188:2: ( rule__AssociationEnd__Group_5__0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:2189:2: ( rule__AssociationEnd__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntoUMLArchive.g:2189:3: rule__AssociationEnd__Group_5__0
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
    // InternalOntoUMLArchive.g:2198:1: rule__AssociationEnd__Group_5__0 : rule__AssociationEnd__Group_5__0__Impl rule__AssociationEnd__Group_5__1 ;
    public final void rule__AssociationEnd__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2202:1: ( rule__AssociationEnd__Group_5__0__Impl rule__AssociationEnd__Group_5__1 )
            // InternalOntoUMLArchive.g:2203:2: rule__AssociationEnd__Group_5__0__Impl rule__AssociationEnd__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOntoUMLArchive.g:2210:1: rule__AssociationEnd__Group_5__0__Impl : ( '{' ) ;
    public final void rule__AssociationEnd__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2214:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:2215:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:2215:1: ( '{' )
            // InternalOntoUMLArchive.g:2216:2: '{'
            {
             before(grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2225:1: rule__AssociationEnd__Group_5__1 : rule__AssociationEnd__Group_5__1__Impl rule__AssociationEnd__Group_5__2 ;
    public final void rule__AssociationEnd__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2229:1: ( rule__AssociationEnd__Group_5__1__Impl rule__AssociationEnd__Group_5__2 )
            // InternalOntoUMLArchive.g:2230:2: rule__AssociationEnd__Group_5__1__Impl rule__AssociationEnd__Group_5__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalOntoUMLArchive.g:2237:1: rule__AssociationEnd__Group_5__1__Impl : ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) ) ;
    public final void rule__AssociationEnd__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2241:1: ( ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) ) )
            // InternalOntoUMLArchive.g:2242:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) )
            {
            // InternalOntoUMLArchive.g:2242:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) )
            // InternalOntoUMLArchive.g:2243:2: ( rule__AssociationEnd__ConstraintsAssignment_5_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_5_1()); 
            // InternalOntoUMLArchive.g:2244:2: ( rule__AssociationEnd__ConstraintsAssignment_5_1 )
            // InternalOntoUMLArchive.g:2244:3: rule__AssociationEnd__ConstraintsAssignment_5_1
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
    // InternalOntoUMLArchive.g:2252:1: rule__AssociationEnd__Group_5__2 : rule__AssociationEnd__Group_5__2__Impl rule__AssociationEnd__Group_5__3 ;
    public final void rule__AssociationEnd__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2256:1: ( rule__AssociationEnd__Group_5__2__Impl rule__AssociationEnd__Group_5__3 )
            // InternalOntoUMLArchive.g:2257:2: rule__AssociationEnd__Group_5__2__Impl rule__AssociationEnd__Group_5__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalOntoUMLArchive.g:2264:1: rule__AssociationEnd__Group_5__2__Impl : ( ( rule__AssociationEnd__Group_5_2__0 )* ) ;
    public final void rule__AssociationEnd__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2268:1: ( ( ( rule__AssociationEnd__Group_5_2__0 )* ) )
            // InternalOntoUMLArchive.g:2269:1: ( ( rule__AssociationEnd__Group_5_2__0 )* )
            {
            // InternalOntoUMLArchive.g:2269:1: ( ( rule__AssociationEnd__Group_5_2__0 )* )
            // InternalOntoUMLArchive.g:2270:2: ( rule__AssociationEnd__Group_5_2__0 )*
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_5_2()); 
            // InternalOntoUMLArchive.g:2271:2: ( rule__AssociationEnd__Group_5_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2271:3: rule__AssociationEnd__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__AssociationEnd__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalOntoUMLArchive.g:2279:1: rule__AssociationEnd__Group_5__3 : rule__AssociationEnd__Group_5__3__Impl ;
    public final void rule__AssociationEnd__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2283:1: ( rule__AssociationEnd__Group_5__3__Impl )
            // InternalOntoUMLArchive.g:2284:2: rule__AssociationEnd__Group_5__3__Impl
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
    // InternalOntoUMLArchive.g:2290:1: rule__AssociationEnd__Group_5__3__Impl : ( '}' ) ;
    public final void rule__AssociationEnd__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2294:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:2295:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:2295:1: ( '}' )
            // InternalOntoUMLArchive.g:2296:2: '}'
            {
             before(grammarAccess.getAssociationEndAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2306:1: rule__AssociationEnd__Group_5_2__0 : rule__AssociationEnd__Group_5_2__0__Impl rule__AssociationEnd__Group_5_2__1 ;
    public final void rule__AssociationEnd__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2310:1: ( rule__AssociationEnd__Group_5_2__0__Impl rule__AssociationEnd__Group_5_2__1 )
            // InternalOntoUMLArchive.g:2311:2: rule__AssociationEnd__Group_5_2__0__Impl rule__AssociationEnd__Group_5_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOntoUMLArchive.g:2318:1: rule__AssociationEnd__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationEnd__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2322:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:2323:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:2323:1: ( ',' )
            // InternalOntoUMLArchive.g:2324:2: ','
            {
             before(grammarAccess.getAssociationEndAccess().getCommaKeyword_5_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2333:1: rule__AssociationEnd__Group_5_2__1 : rule__AssociationEnd__Group_5_2__1__Impl ;
    public final void rule__AssociationEnd__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2337:1: ( rule__AssociationEnd__Group_5_2__1__Impl )
            // InternalOntoUMLArchive.g:2338:2: rule__AssociationEnd__Group_5_2__1__Impl
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
    // InternalOntoUMLArchive.g:2344:1: rule__AssociationEnd__Group_5_2__1__Impl : ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) ) ;
    public final void rule__AssociationEnd__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2348:1: ( ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) ) )
            // InternalOntoUMLArchive.g:2349:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) )
            {
            // InternalOntoUMLArchive.g:2349:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) )
            // InternalOntoUMLArchive.g:2350:2: ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_5_2_1()); 
            // InternalOntoUMLArchive.g:2351:2: ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 )
            // InternalOntoUMLArchive.g:2351:3: rule__AssociationEnd__ConstraintsAssignment_5_2_1
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
    // InternalOntoUMLArchive.g:2360:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2364:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // InternalOntoUMLArchive.g:2365:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
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
    // InternalOntoUMLArchive.g:2372:1: rule__Multiplicity__Group__0__Impl : ( '[' ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2376:1: ( ( '[' ) )
            // InternalOntoUMLArchive.g:2377:1: ( '[' )
            {
            // InternalOntoUMLArchive.g:2377:1: ( '[' )
            // InternalOntoUMLArchive.g:2378:2: '['
            {
             before(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2387:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2391:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // InternalOntoUMLArchive.g:2392:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
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
    // InternalOntoUMLArchive.g:2399:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__LowerAssignment_1 ) ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2403:1: ( ( ( rule__Multiplicity__LowerAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:2404:1: ( ( rule__Multiplicity__LowerAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:2404:1: ( ( rule__Multiplicity__LowerAssignment_1 ) )
            // InternalOntoUMLArchive.g:2405:2: ( rule__Multiplicity__LowerAssignment_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getLowerAssignment_1()); 
            // InternalOntoUMLArchive.g:2406:2: ( rule__Multiplicity__LowerAssignment_1 )
            // InternalOntoUMLArchive.g:2406:3: rule__Multiplicity__LowerAssignment_1
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
    // InternalOntoUMLArchive.g:2414:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2418:1: ( rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 )
            // InternalOntoUMLArchive.g:2419:2: rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3
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
    // InternalOntoUMLArchive.g:2426:1: rule__Multiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2430:1: ( ( '..' ) )
            // InternalOntoUMLArchive.g:2431:1: ( '..' )
            {
            // InternalOntoUMLArchive.g:2431:1: ( '..' )
            // InternalOntoUMLArchive.g:2432:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2441:1: rule__Multiplicity__Group__3 : rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 ;
    public final void rule__Multiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2445:1: ( rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 )
            // InternalOntoUMLArchive.g:2446:2: rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4
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
    // InternalOntoUMLArchive.g:2453:1: rule__Multiplicity__Group__3__Impl : ( ( rule__Multiplicity__UpperAssignment_3 ) ) ;
    public final void rule__Multiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2457:1: ( ( ( rule__Multiplicity__UpperAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:2458:1: ( ( rule__Multiplicity__UpperAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:2458:1: ( ( rule__Multiplicity__UpperAssignment_3 ) )
            // InternalOntoUMLArchive.g:2459:2: ( rule__Multiplicity__UpperAssignment_3 )
            {
             before(grammarAccess.getMultiplicityAccess().getUpperAssignment_3()); 
            // InternalOntoUMLArchive.g:2460:2: ( rule__Multiplicity__UpperAssignment_3 )
            // InternalOntoUMLArchive.g:2460:3: rule__Multiplicity__UpperAssignment_3
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
    // InternalOntoUMLArchive.g:2468:1: rule__Multiplicity__Group__4 : rule__Multiplicity__Group__4__Impl ;
    public final void rule__Multiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2472:1: ( rule__Multiplicity__Group__4__Impl )
            // InternalOntoUMLArchive.g:2473:2: rule__Multiplicity__Group__4__Impl
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
    // InternalOntoUMLArchive.g:2479:1: rule__Multiplicity__Group__4__Impl : ( ']' ) ;
    public final void rule__Multiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2483:1: ( ( ']' ) )
            // InternalOntoUMLArchive.g:2484:1: ( ']' )
            {
            // InternalOntoUMLArchive.g:2484:1: ( ']' )
            // InternalOntoUMLArchive.g:2485:2: ']'
            {
             before(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2495:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2499:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalOntoUMLArchive.g:2500:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
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
    // InternalOntoUMLArchive.g:2507:1: rule__Generalization__Group__0__Impl : ( 'gen' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2511:1: ( ( 'gen' ) )
            // InternalOntoUMLArchive.g:2512:1: ( 'gen' )
            {
            // InternalOntoUMLArchive.g:2512:1: ( 'gen' )
            // InternalOntoUMLArchive.g:2513:2: 'gen'
            {
             before(grammarAccess.getGeneralizationAccess().getGenKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2522:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2526:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalOntoUMLArchive.g:2527:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
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
    // InternalOntoUMLArchive.g:2534:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__NameAssignment_1 )? ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2538:1: ( ( ( rule__Generalization__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2539:1: ( ( rule__Generalization__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2539:1: ( ( rule__Generalization__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2540:2: ( rule__Generalization__NameAssignment_1 )?
            {
             before(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2541:2: ( rule__Generalization__NameAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntoUMLArchive.g:2541:3: rule__Generalization__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2549:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2553:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalOntoUMLArchive.g:2554:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUMLArchive.g:2561:1: rule__Generalization__Group__2__Impl : ( 'super' ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2565:1: ( ( 'super' ) )
            // InternalOntoUMLArchive.g:2566:1: ( 'super' )
            {
            // InternalOntoUMLArchive.g:2566:1: ( 'super' )
            // InternalOntoUMLArchive.g:2567:2: 'super'
            {
             before(grammarAccess.getGeneralizationAccess().getSuperKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2576:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2580:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalOntoUMLArchive.g:2581:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
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
    // InternalOntoUMLArchive.g:2588:1: rule__Generalization__Group__3__Impl : ( ( rule__Generalization__SuperAssignment_3 ) ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2592:1: ( ( ( rule__Generalization__SuperAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:2593:1: ( ( rule__Generalization__SuperAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:2593:1: ( ( rule__Generalization__SuperAssignment_3 ) )
            // InternalOntoUMLArchive.g:2594:2: ( rule__Generalization__SuperAssignment_3 )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperAssignment_3()); 
            // InternalOntoUMLArchive.g:2595:2: ( rule__Generalization__SuperAssignment_3 )
            // InternalOntoUMLArchive.g:2595:3: rule__Generalization__SuperAssignment_3
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
    // InternalOntoUMLArchive.g:2603:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2607:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalOntoUMLArchive.g:2608:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUMLArchive.g:2615:1: rule__Generalization__Group__4__Impl : ( 'sub' ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2619:1: ( ( 'sub' ) )
            // InternalOntoUMLArchive.g:2620:1: ( 'sub' )
            {
            // InternalOntoUMLArchive.g:2620:1: ( 'sub' )
            // InternalOntoUMLArchive.g:2621:2: 'sub'
            {
             before(grammarAccess.getGeneralizationAccess().getSubKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2630:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2634:1: ( rule__Generalization__Group__5__Impl )
            // InternalOntoUMLArchive.g:2635:2: rule__Generalization__Group__5__Impl
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
    // InternalOntoUMLArchive.g:2641:1: rule__Generalization__Group__5__Impl : ( ( rule__Generalization__SubAssignment_5 ) ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2645:1: ( ( ( rule__Generalization__SubAssignment_5 ) ) )
            // InternalOntoUMLArchive.g:2646:1: ( ( rule__Generalization__SubAssignment_5 ) )
            {
            // InternalOntoUMLArchive.g:2646:1: ( ( rule__Generalization__SubAssignment_5 ) )
            // InternalOntoUMLArchive.g:2647:2: ( rule__Generalization__SubAssignment_5 )
            {
             before(grammarAccess.getGeneralizationAccess().getSubAssignment_5()); 
            // InternalOntoUMLArchive.g:2648:2: ( rule__Generalization__SubAssignment_5 )
            // InternalOntoUMLArchive.g:2648:3: rule__Generalization__SubAssignment_5
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
    // InternalOntoUMLArchive.g:2657:1: rule__DependencyLink__Group__0 : rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1 ;
    public final void rule__DependencyLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2661:1: ( rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1 )
            // InternalOntoUMLArchive.g:2662:2: rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoUMLArchive.g:2669:1: rule__DependencyLink__Group__0__Impl : ( 'dependency' ) ;
    public final void rule__DependencyLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2673:1: ( ( 'dependency' ) )
            // InternalOntoUMLArchive.g:2674:1: ( 'dependency' )
            {
            // InternalOntoUMLArchive.g:2674:1: ( 'dependency' )
            // InternalOntoUMLArchive.g:2675:2: 'dependency'
            {
             before(grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2684:1: rule__DependencyLink__Group__1 : rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2 ;
    public final void rule__DependencyLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2688:1: ( rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2 )
            // InternalOntoUMLArchive.g:2689:2: rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoUMLArchive.g:2696:1: rule__DependencyLink__Group__1__Impl : ( ( rule__DependencyLink__NameAssignment_1 )? ) ;
    public final void rule__DependencyLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2700:1: ( ( ( rule__DependencyLink__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2701:1: ( ( rule__DependencyLink__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2701:1: ( ( rule__DependencyLink__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2702:2: ( rule__DependencyLink__NameAssignment_1 )?
            {
             before(grammarAccess.getDependencyLinkAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2703:2: ( rule__DependencyLink__NameAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOntoUMLArchive.g:2703:3: rule__DependencyLink__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2711:1: rule__DependencyLink__Group__2 : rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3 ;
    public final void rule__DependencyLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2715:1: ( rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3 )
            // InternalOntoUMLArchive.g:2716:2: rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalOntoUMLArchive.g:2723:1: rule__DependencyLink__Group__2__Impl : ( ( rule__DependencyLink__StereotypesAssignment_2 )* ) ;
    public final void rule__DependencyLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2727:1: ( ( ( rule__DependencyLink__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:2728:1: ( ( rule__DependencyLink__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:2728:1: ( ( rule__DependencyLink__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:2729:2: ( rule__DependencyLink__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getDependencyLinkAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:2730:2: ( rule__DependencyLink__StereotypesAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STEREOTYPE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2730:3: rule__DependencyLink__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DependencyLink__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalOntoUMLArchive.g:2738:1: rule__DependencyLink__Group__3 : rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4 ;
    public final void rule__DependencyLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2742:1: ( rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4 )
            // InternalOntoUMLArchive.g:2743:2: rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUMLArchive.g:2750:1: rule__DependencyLink__Group__3__Impl : ( 'from' ) ;
    public final void rule__DependencyLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2754:1: ( ( 'from' ) )
            // InternalOntoUMLArchive.g:2755:1: ( 'from' )
            {
            // InternalOntoUMLArchive.g:2755:1: ( 'from' )
            // InternalOntoUMLArchive.g:2756:2: 'from'
            {
             before(grammarAccess.getDependencyLinkAccess().getFromKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2765:1: rule__DependencyLink__Group__4 : rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5 ;
    public final void rule__DependencyLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2769:1: ( rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5 )
            // InternalOntoUMLArchive.g:2770:2: rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoUMLArchive.g:2777:1: rule__DependencyLink__Group__4__Impl : ( ( rule__DependencyLink__FromAssignment_4 ) ) ;
    public final void rule__DependencyLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2781:1: ( ( ( rule__DependencyLink__FromAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:2782:1: ( ( rule__DependencyLink__FromAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:2782:1: ( ( rule__DependencyLink__FromAssignment_4 ) )
            // InternalOntoUMLArchive.g:2783:2: ( rule__DependencyLink__FromAssignment_4 )
            {
             before(grammarAccess.getDependencyLinkAccess().getFromAssignment_4()); 
            // InternalOntoUMLArchive.g:2784:2: ( rule__DependencyLink__FromAssignment_4 )
            // InternalOntoUMLArchive.g:2784:3: rule__DependencyLink__FromAssignment_4
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
    // InternalOntoUMLArchive.g:2792:1: rule__DependencyLink__Group__5 : rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6 ;
    public final void rule__DependencyLink__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2796:1: ( rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6 )
            // InternalOntoUMLArchive.g:2797:2: rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUMLArchive.g:2804:1: rule__DependencyLink__Group__5__Impl : ( 'to' ) ;
    public final void rule__DependencyLink__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2808:1: ( ( 'to' ) )
            // InternalOntoUMLArchive.g:2809:1: ( 'to' )
            {
            // InternalOntoUMLArchive.g:2809:1: ( 'to' )
            // InternalOntoUMLArchive.g:2810:2: 'to'
            {
             before(grammarAccess.getDependencyLinkAccess().getToKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2819:1: rule__DependencyLink__Group__6 : rule__DependencyLink__Group__6__Impl ;
    public final void rule__DependencyLink__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2823:1: ( rule__DependencyLink__Group__6__Impl )
            // InternalOntoUMLArchive.g:2824:2: rule__DependencyLink__Group__6__Impl
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
    // InternalOntoUMLArchive.g:2830:1: rule__DependencyLink__Group__6__Impl : ( ( rule__DependencyLink__ToAssignment_6 ) ) ;
    public final void rule__DependencyLink__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2834:1: ( ( ( rule__DependencyLink__ToAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:2835:1: ( ( rule__DependencyLink__ToAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:2835:1: ( ( rule__DependencyLink__ToAssignment_6 ) )
            // InternalOntoUMLArchive.g:2836:2: ( rule__DependencyLink__ToAssignment_6 )
            {
             before(grammarAccess.getDependencyLinkAccess().getToAssignment_6()); 
            // InternalOntoUMLArchive.g:2837:2: ( rule__DependencyLink__ToAssignment_6 )
            // InternalOntoUMLArchive.g:2837:3: rule__DependencyLink__ToAssignment_6
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
    // InternalOntoUMLArchive.g:2846:1: rule__Derivation__Group__0 : rule__Derivation__Group__0__Impl rule__Derivation__Group__1 ;
    public final void rule__Derivation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2850:1: ( rule__Derivation__Group__0__Impl rule__Derivation__Group__1 )
            // InternalOntoUMLArchive.g:2851:2: rule__Derivation__Group__0__Impl rule__Derivation__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoUMLArchive.g:2858:1: rule__Derivation__Group__0__Impl : ( 'derivation' ) ;
    public final void rule__Derivation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2862:1: ( ( 'derivation' ) )
            // InternalOntoUMLArchive.g:2863:1: ( 'derivation' )
            {
            // InternalOntoUMLArchive.g:2863:1: ( 'derivation' )
            // InternalOntoUMLArchive.g:2864:2: 'derivation'
            {
             before(grammarAccess.getDerivationAccess().getDerivationKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2873:1: rule__Derivation__Group__1 : rule__Derivation__Group__1__Impl rule__Derivation__Group__2 ;
    public final void rule__Derivation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2877:1: ( rule__Derivation__Group__1__Impl rule__Derivation__Group__2 )
            // InternalOntoUMLArchive.g:2878:2: rule__Derivation__Group__1__Impl rule__Derivation__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoUMLArchive.g:2885:1: rule__Derivation__Group__1__Impl : ( ( rule__Derivation__NameAssignment_1 )? ) ;
    public final void rule__Derivation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2889:1: ( ( ( rule__Derivation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2890:1: ( ( rule__Derivation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2890:1: ( ( rule__Derivation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2891:2: ( rule__Derivation__NameAssignment_1 )?
            {
             before(grammarAccess.getDerivationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2892:2: ( rule__Derivation__NameAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoUMLArchive.g:2892:3: rule__Derivation__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2900:1: rule__Derivation__Group__2 : rule__Derivation__Group__2__Impl rule__Derivation__Group__3 ;
    public final void rule__Derivation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2904:1: ( rule__Derivation__Group__2__Impl rule__Derivation__Group__3 )
            // InternalOntoUMLArchive.g:2905:2: rule__Derivation__Group__2__Impl rule__Derivation__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalOntoUMLArchive.g:2912:1: rule__Derivation__Group__2__Impl : ( ( rule__Derivation__StereotypesAssignment_2 )* ) ;
    public final void rule__Derivation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2916:1: ( ( ( rule__Derivation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:2917:1: ( ( rule__Derivation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:2917:1: ( ( rule__Derivation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:2918:2: ( rule__Derivation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getDerivationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:2919:2: ( rule__Derivation__StereotypesAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STEREOTYPE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2919:3: rule__Derivation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Derivation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalOntoUMLArchive.g:2927:1: rule__Derivation__Group__3 : rule__Derivation__Group__3__Impl rule__Derivation__Group__4 ;
    public final void rule__Derivation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2931:1: ( rule__Derivation__Group__3__Impl rule__Derivation__Group__4 )
            // InternalOntoUMLArchive.g:2932:2: rule__Derivation__Group__3__Impl rule__Derivation__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoUMLArchive.g:2939:1: rule__Derivation__Group__3__Impl : ( 'class' ) ;
    public final void rule__Derivation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2943:1: ( ( 'class' ) )
            // InternalOntoUMLArchive.g:2944:1: ( 'class' )
            {
            // InternalOntoUMLArchive.g:2944:1: ( 'class' )
            // InternalOntoUMLArchive.g:2945:2: 'class'
            {
             before(grammarAccess.getDerivationAccess().getClassKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2954:1: rule__Derivation__Group__4 : rule__Derivation__Group__4__Impl rule__Derivation__Group__5 ;
    public final void rule__Derivation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2958:1: ( rule__Derivation__Group__4__Impl rule__Derivation__Group__5 )
            // InternalOntoUMLArchive.g:2959:2: rule__Derivation__Group__4__Impl rule__Derivation__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalOntoUMLArchive.g:2966:1: rule__Derivation__Group__4__Impl : ( ( rule__Derivation__ClassAssignment_4 ) ) ;
    public final void rule__Derivation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2970:1: ( ( ( rule__Derivation__ClassAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:2971:1: ( ( rule__Derivation__ClassAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:2971:1: ( ( rule__Derivation__ClassAssignment_4 ) )
            // InternalOntoUMLArchive.g:2972:2: ( rule__Derivation__ClassAssignment_4 )
            {
             before(grammarAccess.getDerivationAccess().getClassAssignment_4()); 
            // InternalOntoUMLArchive.g:2973:2: ( rule__Derivation__ClassAssignment_4 )
            // InternalOntoUMLArchive.g:2973:3: rule__Derivation__ClassAssignment_4
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
    // InternalOntoUMLArchive.g:2981:1: rule__Derivation__Group__5 : rule__Derivation__Group__5__Impl rule__Derivation__Group__6 ;
    public final void rule__Derivation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2985:1: ( rule__Derivation__Group__5__Impl rule__Derivation__Group__6 )
            // InternalOntoUMLArchive.g:2986:2: rule__Derivation__Group__5__Impl rule__Derivation__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoUMLArchive.g:2993:1: rule__Derivation__Group__5__Impl : ( 'relation' ) ;
    public final void rule__Derivation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2997:1: ( ( 'relation' ) )
            // InternalOntoUMLArchive.g:2998:1: ( 'relation' )
            {
            // InternalOntoUMLArchive.g:2998:1: ( 'relation' )
            // InternalOntoUMLArchive.g:2999:2: 'relation'
            {
             before(grammarAccess.getDerivationAccess().getRelationKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3008:1: rule__Derivation__Group__6 : rule__Derivation__Group__6__Impl ;
    public final void rule__Derivation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3012:1: ( rule__Derivation__Group__6__Impl )
            // InternalOntoUMLArchive.g:3013:2: rule__Derivation__Group__6__Impl
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
    // InternalOntoUMLArchive.g:3019:1: rule__Derivation__Group__6__Impl : ( ( rule__Derivation__PartAssignment_6 ) ) ;
    public final void rule__Derivation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3023:1: ( ( ( rule__Derivation__PartAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:3024:1: ( ( rule__Derivation__PartAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:3024:1: ( ( rule__Derivation__PartAssignment_6 ) )
            // InternalOntoUMLArchive.g:3025:2: ( rule__Derivation__PartAssignment_6 )
            {
             before(grammarAccess.getDerivationAccess().getPartAssignment_6()); 
            // InternalOntoUMLArchive.g:3026:2: ( rule__Derivation__PartAssignment_6 )
            // InternalOntoUMLArchive.g:3026:3: rule__Derivation__PartAssignment_6
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
    // InternalOntoUMLArchive.g:3035:1: rule__ClassDerivationEnd__Group__0 : rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1 ;
    public final void rule__ClassDerivationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3039:1: ( rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1 )
            // InternalOntoUMLArchive.g:3040:2: rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoUMLArchive.g:3047:1: rule__ClassDerivationEnd__Group__0__Impl : ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )? ) ;
    public final void rule__ClassDerivationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3051:1: ( ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:3052:1: ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:3052:1: ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )? )
            // InternalOntoUMLArchive.g:3053:2: ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )?
            {
             before(grammarAccess.getClassDerivationEndAccess().getMultiplicityAssignment_0()); 
            // InternalOntoUMLArchive.g:3054:2: ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoUMLArchive.g:3054:3: rule__ClassDerivationEnd__MultiplicityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDerivationEnd__MultiplicityAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // InternalOntoUMLArchive.g:3062:1: rule__ClassDerivationEnd__Group__1 : rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2 ;
    public final void rule__ClassDerivationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3066:1: ( rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2 )
            // InternalOntoUMLArchive.g:3067:2: rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2
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
    // InternalOntoUMLArchive.g:3074:1: rule__ClassDerivationEnd__Group__1__Impl : ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3078:1: ( ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:3079:1: ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:3079:1: ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) )
            // InternalOntoUMLArchive.g:3080:2: ( rule__ClassDerivationEnd__EndTypeAssignment_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getEndTypeAssignment_1()); 
            // InternalOntoUMLArchive.g:3081:2: ( rule__ClassDerivationEnd__EndTypeAssignment_1 )
            // InternalOntoUMLArchive.g:3081:3: rule__ClassDerivationEnd__EndTypeAssignment_1
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
    // InternalOntoUMLArchive.g:3089:1: rule__ClassDerivationEnd__Group__2 : rule__ClassDerivationEnd__Group__2__Impl ;
    public final void rule__ClassDerivationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3093:1: ( rule__ClassDerivationEnd__Group__2__Impl )
            // InternalOntoUMLArchive.g:3094:2: rule__ClassDerivationEnd__Group__2__Impl
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
    // InternalOntoUMLArchive.g:3100:1: rule__ClassDerivationEnd__Group__2__Impl : ( ( rule__ClassDerivationEnd__Group_2__0 )? ) ;
    public final void rule__ClassDerivationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3104:1: ( ( ( rule__ClassDerivationEnd__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:3105:1: ( ( rule__ClassDerivationEnd__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:3105:1: ( ( rule__ClassDerivationEnd__Group_2__0 )? )
            // InternalOntoUMLArchive.g:3106:2: ( rule__ClassDerivationEnd__Group_2__0 )?
            {
             before(grammarAccess.getClassDerivationEndAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:3107:2: ( rule__ClassDerivationEnd__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOntoUMLArchive.g:3107:3: rule__ClassDerivationEnd__Group_2__0
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
    // InternalOntoUMLArchive.g:3116:1: rule__ClassDerivationEnd__Group_2__0 : rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1 ;
    public final void rule__ClassDerivationEnd__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3120:1: ( rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1 )
            // InternalOntoUMLArchive.g:3121:2: rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOntoUMLArchive.g:3128:1: rule__ClassDerivationEnd__Group_2__0__Impl : ( '{' ) ;
    public final void rule__ClassDerivationEnd__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3132:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:3133:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:3133:1: ( '{' )
            // InternalOntoUMLArchive.g:3134:2: '{'
            {
             before(grammarAccess.getClassDerivationEndAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3143:1: rule__ClassDerivationEnd__Group_2__1 : rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2 ;
    public final void rule__ClassDerivationEnd__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3147:1: ( rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2 )
            // InternalOntoUMLArchive.g:3148:2: rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2
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
    // InternalOntoUMLArchive.g:3155:1: rule__ClassDerivationEnd__Group_2__1__Impl : ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3159:1: ( ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) ) )
            // InternalOntoUMLArchive.g:3160:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) )
            {
            // InternalOntoUMLArchive.g:3160:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) )
            // InternalOntoUMLArchive.g:3161:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getConstraintsAssignment_2_1()); 
            // InternalOntoUMLArchive.g:3162:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 )
            // InternalOntoUMLArchive.g:3162:3: rule__ClassDerivationEnd__ConstraintsAssignment_2_1
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
    // InternalOntoUMLArchive.g:3170:1: rule__ClassDerivationEnd__Group_2__2 : rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3 ;
    public final void rule__ClassDerivationEnd__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3174:1: ( rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3 )
            // InternalOntoUMLArchive.g:3175:2: rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3
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
    // InternalOntoUMLArchive.g:3182:1: rule__ClassDerivationEnd__Group_2__2__Impl : ( ( rule__ClassDerivationEnd__Group_2_2__0 )* ) ;
    public final void rule__ClassDerivationEnd__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3186:1: ( ( ( rule__ClassDerivationEnd__Group_2_2__0 )* ) )
            // InternalOntoUMLArchive.g:3187:1: ( ( rule__ClassDerivationEnd__Group_2_2__0 )* )
            {
            // InternalOntoUMLArchive.g:3187:1: ( ( rule__ClassDerivationEnd__Group_2_2__0 )* )
            // InternalOntoUMLArchive.g:3188:2: ( rule__ClassDerivationEnd__Group_2_2__0 )*
            {
             before(grammarAccess.getClassDerivationEndAccess().getGroup_2_2()); 
            // InternalOntoUMLArchive.g:3189:2: ( rule__ClassDerivationEnd__Group_2_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:3189:3: rule__ClassDerivationEnd__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ClassDerivationEnd__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalOntoUMLArchive.g:3197:1: rule__ClassDerivationEnd__Group_2__3 : rule__ClassDerivationEnd__Group_2__3__Impl ;
    public final void rule__ClassDerivationEnd__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3201:1: ( rule__ClassDerivationEnd__Group_2__3__Impl )
            // InternalOntoUMLArchive.g:3202:2: rule__ClassDerivationEnd__Group_2__3__Impl
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
    // InternalOntoUMLArchive.g:3208:1: rule__ClassDerivationEnd__Group_2__3__Impl : ( '}' ) ;
    public final void rule__ClassDerivationEnd__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3212:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:3213:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:3213:1: ( '}' )
            // InternalOntoUMLArchive.g:3214:2: '}'
            {
             before(grammarAccess.getClassDerivationEndAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3224:1: rule__ClassDerivationEnd__Group_2_2__0 : rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1 ;
    public final void rule__ClassDerivationEnd__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3228:1: ( rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1 )
            // InternalOntoUMLArchive.g:3229:2: rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOntoUMLArchive.g:3236:1: rule__ClassDerivationEnd__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDerivationEnd__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3240:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:3241:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:3241:1: ( ',' )
            // InternalOntoUMLArchive.g:3242:2: ','
            {
             before(grammarAccess.getClassDerivationEndAccess().getCommaKeyword_2_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3251:1: rule__ClassDerivationEnd__Group_2_2__1 : rule__ClassDerivationEnd__Group_2_2__1__Impl ;
    public final void rule__ClassDerivationEnd__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3255:1: ( rule__ClassDerivationEnd__Group_2_2__1__Impl )
            // InternalOntoUMLArchive.g:3256:2: rule__ClassDerivationEnd__Group_2_2__1__Impl
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
    // InternalOntoUMLArchive.g:3262:1: rule__ClassDerivationEnd__Group_2_2__1__Impl : ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3266:1: ( ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) ) )
            // InternalOntoUMLArchive.g:3267:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            {
            // InternalOntoUMLArchive.g:3267:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            // InternalOntoUMLArchive.g:3268:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getConstraintsAssignment_2_2_1()); 
            // InternalOntoUMLArchive.g:3269:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 )
            // InternalOntoUMLArchive.g:3269:3: rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1
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
    // InternalOntoUMLArchive.g:3278:1: rule__RelationDerivationEnd__Group__0 : rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1 ;
    public final void rule__RelationDerivationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3282:1: ( rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1 )
            // InternalOntoUMLArchive.g:3283:2: rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOntoUMLArchive.g:3290:1: rule__RelationDerivationEnd__Group__0__Impl : ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )? ) ;
    public final void rule__RelationDerivationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3294:1: ( ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:3295:1: ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:3295:1: ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )? )
            // InternalOntoUMLArchive.g:3296:2: ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )?
            {
             before(grammarAccess.getRelationDerivationEndAccess().getMultiplicityAssignment_0()); 
            // InternalOntoUMLArchive.g:3297:2: ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOntoUMLArchive.g:3297:3: rule__RelationDerivationEnd__MultiplicityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationDerivationEnd__MultiplicityAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // InternalOntoUMLArchive.g:3305:1: rule__RelationDerivationEnd__Group__1 : rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2 ;
    public final void rule__RelationDerivationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3309:1: ( rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2 )
            // InternalOntoUMLArchive.g:3310:2: rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2
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
    // InternalOntoUMLArchive.g:3317:1: rule__RelationDerivationEnd__Group__1__Impl : ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3321:1: ( ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:3322:1: ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:3322:1: ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) )
            // InternalOntoUMLArchive.g:3323:2: ( rule__RelationDerivationEnd__EndTypeAssignment_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssignment_1()); 
            // InternalOntoUMLArchive.g:3324:2: ( rule__RelationDerivationEnd__EndTypeAssignment_1 )
            // InternalOntoUMLArchive.g:3324:3: rule__RelationDerivationEnd__EndTypeAssignment_1
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
    // InternalOntoUMLArchive.g:3332:1: rule__RelationDerivationEnd__Group__2 : rule__RelationDerivationEnd__Group__2__Impl ;
    public final void rule__RelationDerivationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3336:1: ( rule__RelationDerivationEnd__Group__2__Impl )
            // InternalOntoUMLArchive.g:3337:2: rule__RelationDerivationEnd__Group__2__Impl
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
    // InternalOntoUMLArchive.g:3343:1: rule__RelationDerivationEnd__Group__2__Impl : ( ( rule__RelationDerivationEnd__Group_2__0 )? ) ;
    public final void rule__RelationDerivationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3347:1: ( ( ( rule__RelationDerivationEnd__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:3348:1: ( ( rule__RelationDerivationEnd__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:3348:1: ( ( rule__RelationDerivationEnd__Group_2__0 )? )
            // InternalOntoUMLArchive.g:3349:2: ( rule__RelationDerivationEnd__Group_2__0 )?
            {
             before(grammarAccess.getRelationDerivationEndAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:3350:2: ( rule__RelationDerivationEnd__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOntoUMLArchive.g:3350:3: rule__RelationDerivationEnd__Group_2__0
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
    // InternalOntoUMLArchive.g:3359:1: rule__RelationDerivationEnd__Group_2__0 : rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1 ;
    public final void rule__RelationDerivationEnd__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3363:1: ( rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1 )
            // InternalOntoUMLArchive.g:3364:2: rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOntoUMLArchive.g:3371:1: rule__RelationDerivationEnd__Group_2__0__Impl : ( '{' ) ;
    public final void rule__RelationDerivationEnd__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3375:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:3376:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:3376:1: ( '{' )
            // InternalOntoUMLArchive.g:3377:2: '{'
            {
             before(grammarAccess.getRelationDerivationEndAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3386:1: rule__RelationDerivationEnd__Group_2__1 : rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2 ;
    public final void rule__RelationDerivationEnd__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3390:1: ( rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2 )
            // InternalOntoUMLArchive.g:3391:2: rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2
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
    // InternalOntoUMLArchive.g:3398:1: rule__RelationDerivationEnd__Group_2__1__Impl : ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3402:1: ( ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) ) )
            // InternalOntoUMLArchive.g:3403:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) )
            {
            // InternalOntoUMLArchive.g:3403:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) )
            // InternalOntoUMLArchive.g:3404:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getConstraintsAssignment_2_1()); 
            // InternalOntoUMLArchive.g:3405:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 )
            // InternalOntoUMLArchive.g:3405:3: rule__RelationDerivationEnd__ConstraintsAssignment_2_1
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
    // InternalOntoUMLArchive.g:3413:1: rule__RelationDerivationEnd__Group_2__2 : rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3 ;
    public final void rule__RelationDerivationEnd__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3417:1: ( rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3 )
            // InternalOntoUMLArchive.g:3418:2: rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3
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
    // InternalOntoUMLArchive.g:3425:1: rule__RelationDerivationEnd__Group_2__2__Impl : ( ( rule__RelationDerivationEnd__Group_2_2__0 )* ) ;
    public final void rule__RelationDerivationEnd__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3429:1: ( ( ( rule__RelationDerivationEnd__Group_2_2__0 )* ) )
            // InternalOntoUMLArchive.g:3430:1: ( ( rule__RelationDerivationEnd__Group_2_2__0 )* )
            {
            // InternalOntoUMLArchive.g:3430:1: ( ( rule__RelationDerivationEnd__Group_2_2__0 )* )
            // InternalOntoUMLArchive.g:3431:2: ( rule__RelationDerivationEnd__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationDerivationEndAccess().getGroup_2_2()); 
            // InternalOntoUMLArchive.g:3432:2: ( rule__RelationDerivationEnd__Group_2_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==28) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:3432:3: rule__RelationDerivationEnd__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__RelationDerivationEnd__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalOntoUMLArchive.g:3440:1: rule__RelationDerivationEnd__Group_2__3 : rule__RelationDerivationEnd__Group_2__3__Impl ;
    public final void rule__RelationDerivationEnd__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3444:1: ( rule__RelationDerivationEnd__Group_2__3__Impl )
            // InternalOntoUMLArchive.g:3445:2: rule__RelationDerivationEnd__Group_2__3__Impl
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
    // InternalOntoUMLArchive.g:3451:1: rule__RelationDerivationEnd__Group_2__3__Impl : ( '}' ) ;
    public final void rule__RelationDerivationEnd__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3455:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:3456:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:3456:1: ( '}' )
            // InternalOntoUMLArchive.g:3457:2: '}'
            {
             before(grammarAccess.getRelationDerivationEndAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3467:1: rule__RelationDerivationEnd__Group_2_2__0 : rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1 ;
    public final void rule__RelationDerivationEnd__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3471:1: ( rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1 )
            // InternalOntoUMLArchive.g:3472:2: rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOntoUMLArchive.g:3479:1: rule__RelationDerivationEnd__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__RelationDerivationEnd__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3483:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:3484:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:3484:1: ( ',' )
            // InternalOntoUMLArchive.g:3485:2: ','
            {
             before(grammarAccess.getRelationDerivationEndAccess().getCommaKeyword_2_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3494:1: rule__RelationDerivationEnd__Group_2_2__1 : rule__RelationDerivationEnd__Group_2_2__1__Impl ;
    public final void rule__RelationDerivationEnd__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3498:1: ( rule__RelationDerivationEnd__Group_2_2__1__Impl )
            // InternalOntoUMLArchive.g:3499:2: rule__RelationDerivationEnd__Group_2_2__1__Impl
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
    // InternalOntoUMLArchive.g:3505:1: rule__RelationDerivationEnd__Group_2_2__1__Impl : ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3509:1: ( ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) ) )
            // InternalOntoUMLArchive.g:3510:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            {
            // InternalOntoUMLArchive.g:3510:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            // InternalOntoUMLArchive.g:3511:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getConstraintsAssignment_2_2_1()); 
            // InternalOntoUMLArchive.g:3512:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 )
            // InternalOntoUMLArchive.g:3512:3: rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1
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
    // InternalOntoUMLArchive.g:3521:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3525:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoUMLArchive.g:3526:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalOntoUMLArchive.g:3533:1: rule__GeneralizationSet__Group__0__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3537:1: ( ( 'genset' ) )
            // InternalOntoUMLArchive.g:3538:1: ( 'genset' )
            {
            // InternalOntoUMLArchive.g:3538:1: ( 'genset' )
            // InternalOntoUMLArchive.g:3539:2: 'genset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3548:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3552:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoUMLArchive.g:3553:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalOntoUMLArchive.g:3560:1: rule__GeneralizationSet__Group__1__Impl : ( ( rule__GeneralizationSet__UnorderedGroup_1 ) ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3564:1: ( ( ( rule__GeneralizationSet__UnorderedGroup_1 ) ) )
            // InternalOntoUMLArchive.g:3565:1: ( ( rule__GeneralizationSet__UnorderedGroup_1 ) )
            {
            // InternalOntoUMLArchive.g:3565:1: ( ( rule__GeneralizationSet__UnorderedGroup_1 ) )
            // InternalOntoUMLArchive.g:3566:2: ( rule__GeneralizationSet__UnorderedGroup_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1()); 
            // InternalOntoUMLArchive.g:3567:2: ( rule__GeneralizationSet__UnorderedGroup_1 )
            // InternalOntoUMLArchive.g:3567:3: rule__GeneralizationSet__UnorderedGroup_1
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
    // InternalOntoUMLArchive.g:3575:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3579:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoUMLArchive.g:3580:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalOntoUMLArchive.g:3587:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3591:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalOntoUMLArchive.g:3592:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalOntoUMLArchive.g:3592:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalOntoUMLArchive.g:3593:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoUMLArchive.g:3594:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOntoUMLArchive.g:3594:3: rule__GeneralizationSet__NameAssignment_2
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
    // InternalOntoUMLArchive.g:3602:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3606:1: ( rule__GeneralizationSet__Group__3__Impl )
            // InternalOntoUMLArchive.g:3607:2: rule__GeneralizationSet__Group__3__Impl
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
    // InternalOntoUMLArchive.g:3613:1: rule__GeneralizationSet__Group__3__Impl : ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3617:1: ( ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) ) )
            // InternalOntoUMLArchive.g:3618:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) )
            {
            // InternalOntoUMLArchive.g:3618:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:3619:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:3619:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) )
            // InternalOntoUMLArchive.g:3620:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 
            // InternalOntoUMLArchive.g:3621:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )
            // InternalOntoUMLArchive.g:3621:4: rule__GeneralizationSet__GeneralizationsAssignment_3
            {
            pushFollow(FOLLOW_34);
            rule__GeneralizationSet__GeneralizationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 

            }

            // InternalOntoUMLArchive.g:3624:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* )
            // InternalOntoUMLArchive.g:3625:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 
            // InternalOntoUMLArchive.g:3626:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==32) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:3626:4: rule__GeneralizationSet__GeneralizationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__GeneralizationSet__GeneralizationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalOntoUMLArchive.g:3636:1: rule__GeneralizationSet__UnorderedGroup_1 : ( rule__GeneralizationSet__UnorderedGroup_1__0 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
        	
        try {
            // InternalOntoUMLArchive.g:3641:1: ( ( rule__GeneralizationSet__UnorderedGroup_1__0 )? )
            // InternalOntoUMLArchive.g:3642:2: ( rule__GeneralizationSet__UnorderedGroup_1__0 )?
            {
            // InternalOntoUMLArchive.g:3642:2: ( rule__GeneralizationSet__UnorderedGroup_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOntoUMLArchive.g:3642:2: rule__GeneralizationSet__UnorderedGroup_1__0
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
    // InternalOntoUMLArchive.g:3650:1: rule__GeneralizationSet__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) ) ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOntoUMLArchive.g:3655:1: ( ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) ) )
            // InternalOntoUMLArchive.g:3656:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) )
            {
            // InternalOntoUMLArchive.g:3656:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalOntoUMLArchive.g:3657:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:3657:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) )
                    // InternalOntoUMLArchive.g:3658:4: {...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalOntoUMLArchive.g:3658:113: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) )
                    // InternalOntoUMLArchive.g:3659:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:3665:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) )
                    // InternalOntoUMLArchive.g:3666:6: ( rule__GeneralizationSet__IsDisjointAssignment_1_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_1_0()); 
                    // InternalOntoUMLArchive.g:3667:6: ( rule__GeneralizationSet__IsDisjointAssignment_1_0 )
                    // InternalOntoUMLArchive.g:3667:7: rule__GeneralizationSet__IsDisjointAssignment_1_0
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
                    // InternalOntoUMLArchive.g:3672:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:3672:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) )
                    // InternalOntoUMLArchive.g:3673:4: {...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalOntoUMLArchive.g:3673:113: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) )
                    // InternalOntoUMLArchive.g:3674:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:3680:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) )
                    // InternalOntoUMLArchive.g:3681:6: ( rule__GeneralizationSet__IsCompleteAssignment_1_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_1_1()); 
                    // InternalOntoUMLArchive.g:3682:6: ( rule__GeneralizationSet__IsCompleteAssignment_1_1 )
                    // InternalOntoUMLArchive.g:3682:7: rule__GeneralizationSet__IsCompleteAssignment_1_1
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
    // InternalOntoUMLArchive.g:3695:1: rule__GeneralizationSet__UnorderedGroup_1__0 : rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3699:1: ( rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )? )
            // InternalOntoUMLArchive.g:3700:2: rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_35);
            rule__GeneralizationSet__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalOntoUMLArchive.g:3701:2: ( rule__GeneralizationSet__UnorderedGroup_1__1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOntoUMLArchive.g:3701:2: rule__GeneralizationSet__UnorderedGroup_1__1
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
    // InternalOntoUMLArchive.g:3707:1: rule__GeneralizationSet__UnorderedGroup_1__1 : rule__GeneralizationSet__UnorderedGroup_1__Impl ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3711:1: ( rule__GeneralizationSet__UnorderedGroup_1__Impl )
            // InternalOntoUMLArchive.g:3712:2: rule__GeneralizationSet__UnorderedGroup_1__Impl
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


    // $ANTLR start "rule__Model__PublicationTitleAssignment_0_1"
    // InternalOntoUMLArchive.g:3719:1: rule__Model__PublicationTitleAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Model__PublicationTitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3723:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3724:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3724:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3725:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getPublicationTitleSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPublicationTitleSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PublicationTitleAssignment_0_1"


    // $ANTLR start "rule__Model__AuthorsAssignment_1_1"
    // InternalOntoUMLArchive.g:3734:1: rule__Model__AuthorsAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Model__AuthorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3738:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3739:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3739:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3740:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getAuthorsSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getAuthorsSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AuthorsAssignment_1_1"


    // $ANTLR start "rule__Model__OntologyNameAssignment_2_1"
    // InternalOntoUMLArchive.g:3749:1: rule__Model__OntologyNameAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Model__OntologyNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3753:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3754:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3754:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3755:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getOntologyNameSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getOntologyNameSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__OntologyNameAssignment_2_1"


    // $ANTLR start "rule__Model__ElementsAssignment_3"
    // InternalOntoUMLArchive.g:3764:1: rule__Model__ElementsAssignment_3 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3768:1: ( ( ruleModelElement ) )
            // InternalOntoUMLArchive.g:3769:2: ( ruleModelElement )
            {
            // InternalOntoUMLArchive.g:3769:2: ( ruleModelElement )
            // InternalOntoUMLArchive.g:3770:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_3"


    // $ANTLR start "rule__Class__IsAbstractAssignment_0"
    // InternalOntoUMLArchive.g:3779:1: rule__Class__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3783:1: ( ( ( 'abstract' ) ) )
            // InternalOntoUMLArchive.g:3784:2: ( ( 'abstract' ) )
            {
            // InternalOntoUMLArchive.g:3784:2: ( ( 'abstract' ) )
            // InternalOntoUMLArchive.g:3785:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalOntoUMLArchive.g:3786:3: ( 'abstract' )
            // InternalOntoUMLArchive.g:3787:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3798:1: rule__Class__NameAssignment_2 : ( ruleStringOrID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3802:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:3803:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:3803:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:3804:3: ruleStringOrID
            {
             before(grammarAccess.getClassAccess().getNameStringOrIDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameStringOrIDParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalOntoUMLArchive.g:3813:1: rule__Class__StereotypesAssignment_3 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__Class__StereotypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3817:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3818:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3818:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3819:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:3828:1: rule__Class__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3832:1: ( ( ruleAttribute ) )
            // InternalOntoUMLArchive.g:3833:2: ( ruleAttribute )
            {
            // InternalOntoUMLArchive.g:3833:2: ( ruleAttribute )
            // InternalOntoUMLArchive.g:3834:3: ruleAttribute
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
    // InternalOntoUMLArchive.g:3843:1: rule__Attribute__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3847:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3848:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3848:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3849:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3858:1: rule__Attribute__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__Attribute__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3862:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:3863:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:3863:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:3864:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:3873:1: rule__Attribute__AttTypeAssignment_4 : ( ( ruleStringOrID ) ) ;
    public final void rule__Attribute__AttTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3877:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:3878:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:3878:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:3879:3: ( ruleStringOrID )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeClassCrossReference_4_0()); 
            // InternalOntoUMLArchive.g:3880:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:3881:4: ruleStringOrID
            {
             before(grammarAccess.getAttributeAccess().getAttTypeClassStringOrIDParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttTypeClassStringOrIDParserRuleCall_4_0_1()); 

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


    // $ANTLR start "rule__DirectedAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:3892:1: rule__DirectedAssociation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__DirectedAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3896:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:3897:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:3897:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:3898:3: ruleStringOrID
            {
             before(grammarAccess.getDirectedAssociationAccess().getNameStringOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getDirectedAssociationAccess().getNameStringOrIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__NameAssignment_1"


    // $ANTLR start "rule__DirectedAssociation__StereotypesAssignment_2"
    // InternalOntoUMLArchive.g:3907:1: rule__DirectedAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__DirectedAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3911:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3912:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3912:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3913:3: RULE_STEREOTYPE_STRING
            {
             before(grammarAccess.getDirectedAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 
             after(grammarAccess.getDirectedAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__StereotypesAssignment_2"


    // $ANTLR start "rule__DirectedAssociation__FromAssignment_4"
    // InternalOntoUMLArchive.g:3922:1: rule__DirectedAssociation__FromAssignment_4 : ( ruleAssociationEnd ) ;
    public final void rule__DirectedAssociation__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3926:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3927:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3927:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3928:3: ruleAssociationEnd
            {
             before(grammarAccess.getDirectedAssociationAccess().getFromAssociationEndParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getDirectedAssociationAccess().getFromAssociationEndParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__FromAssignment_4"


    // $ANTLR start "rule__DirectedAssociation__ToAssignment_6"
    // InternalOntoUMLArchive.g:3937:1: rule__DirectedAssociation__ToAssignment_6 : ( ruleAssociationEnd ) ;
    public final void rule__DirectedAssociation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3941:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3942:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3942:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3943:3: ruleAssociationEnd
            {
             before(grammarAccess.getDirectedAssociationAccess().getToAssociationEndParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getDirectedAssociationAccess().getToAssociationEndParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAssociation__ToAssignment_6"


    // $ANTLR start "rule__UndirectedAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:3952:1: rule__UndirectedAssociation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__UndirectedAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3956:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:3957:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:3957:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:3958:3: ruleStringOrID
            {
             before(grammarAccess.getUndirectedAssociationAccess().getNameStringOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getUndirectedAssociationAccess().getNameStringOrIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__NameAssignment_1"


    // $ANTLR start "rule__UndirectedAssociation__StereotypesAssignment_2"
    // InternalOntoUMLArchive.g:3967:1: rule__UndirectedAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__UndirectedAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3971:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3972:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3972:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3973:3: RULE_STEREOTYPE_STRING
            {
             before(grammarAccess.getUndirectedAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STEREOTYPE_STRING,FOLLOW_2); 
             after(grammarAccess.getUndirectedAssociationAccess().getStereotypesSTEREOTYPE_STRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__StereotypesAssignment_2"


    // $ANTLR start "rule__UndirectedAssociation__EndAAssignment_4"
    // InternalOntoUMLArchive.g:3982:1: rule__UndirectedAssociation__EndAAssignment_4 : ( ruleAssociationEnd ) ;
    public final void rule__UndirectedAssociation__EndAAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3986:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:3987:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:3987:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:3988:3: ruleAssociationEnd
            {
             before(grammarAccess.getUndirectedAssociationAccess().getEndAAssociationEndParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getUndirectedAssociationAccess().getEndAAssociationEndParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__EndAAssignment_4"


    // $ANTLR start "rule__UndirectedAssociation__EndBAssignment_6"
    // InternalOntoUMLArchive.g:3997:1: rule__UndirectedAssociation__EndBAssignment_6 : ( ruleAssociationEnd ) ;
    public final void rule__UndirectedAssociation__EndBAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4001:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4002:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4002:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4003:3: ruleAssociationEnd
            {
             before(grammarAccess.getUndirectedAssociationAccess().getEndBAssociationEndParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationEnd();

            state._fsp--;

             after(grammarAccess.getUndirectedAssociationAccess().getEndBAssociationEndParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedAssociation__EndBAssignment_6"


    // $ANTLR start "rule__NaryAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:4012:1: rule__NaryAssociation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__NaryAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4016:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4017:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:4017:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4018:3: ruleStringOrID
            {
             before(grammarAccess.getNaryAssociationAccess().getNameStringOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getNaryAssociationAccess().getNameStringOrIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalOntoUMLArchive.g:4027:1: rule__NaryAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__NaryAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4031:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:4032:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:4032:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:4033:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:4042:1: rule__NaryAssociation__EndsAssignment_3_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4046:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4047:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4047:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4048:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:4057:1: rule__NaryAssociation__EndsAssignment_4_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4061:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4062:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4062:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4063:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:4072:1: rule__NaryAssociation__EndsAssignment_5_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4076:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4077:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4077:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4078:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:4087:1: rule__AssociationEnd__AggregationKindAssignment_0 : ( ruleAggregationKindDeclaration ) ;
    public final void rule__AssociationEnd__AggregationKindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4091:1: ( ( ruleAggregationKindDeclaration ) )
            // InternalOntoUMLArchive.g:4092:2: ( ruleAggregationKindDeclaration )
            {
            // InternalOntoUMLArchive.g:4092:2: ( ruleAggregationKindDeclaration )
            // InternalOntoUMLArchive.g:4093:3: ruleAggregationKindDeclaration
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
    // InternalOntoUMLArchive.g:4102:1: rule__AssociationEnd__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__AssociationEnd__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4106:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4107:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:4107:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4108:3: ruleStringOrID
            {
             before(grammarAccess.getAssociationEndAccess().getNameStringOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getNameStringOrIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalOntoUMLArchive.g:4117:1: rule__AssociationEnd__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__AssociationEnd__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4121:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:4122:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:4122:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:4123:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:4132:1: rule__AssociationEnd__EndTypeAssignment_4 : ( ( ruleStringOrID ) ) ;
    public final void rule__AssociationEnd__EndTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4136:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4137:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4137:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4138:3: ( ruleStringOrID )
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_4_0()); 
            // InternalOntoUMLArchive.g:4139:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4140:4: ruleStringOrID
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeClassStringOrIDParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getEndTypeClassStringOrIDParserRuleCall_4_0_1()); 

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
    // InternalOntoUMLArchive.g:4151:1: rule__AssociationEnd__ConstraintsAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__ConstraintsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4155:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4156:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4156:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4157:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4166:1: rule__AssociationEnd__ConstraintsAssignment_5_2_1 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__ConstraintsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4170:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4171:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4171:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4172:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4181:1: rule__Multiplicity__LowerAssignment_1 : ( ruleCARDINALITY ) ;
    public final void rule__Multiplicity__LowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4185:1: ( ( ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:4186:2: ( ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:4186:2: ( ruleCARDINALITY )
            // InternalOntoUMLArchive.g:4187:3: ruleCARDINALITY
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
    // InternalOntoUMLArchive.g:4196:1: rule__Multiplicity__UpperAssignment_3 : ( ruleCARDINALITY ) ;
    public final void rule__Multiplicity__UpperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4200:1: ( ( ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:4201:2: ( ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:4201:2: ( ruleCARDINALITY )
            // InternalOntoUMLArchive.g:4202:3: ruleCARDINALITY
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
    // InternalOntoUMLArchive.g:4211:1: rule__Generalization__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Generalization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4215:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4216:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4216:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4217:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4226:1: rule__Generalization__SuperAssignment_3 : ( ( ruleStringOrID ) ) ;
    public final void rule__Generalization__SuperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4230:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4231:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4231:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4232:3: ( ruleStringOrID )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0()); 
            // InternalOntoUMLArchive.g:4233:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4234:4: ruleStringOrID
            {
             before(grammarAccess.getGeneralizationAccess().getSuperClassStringOrIDParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getSuperClassStringOrIDParserRuleCall_3_0_1()); 

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
    // InternalOntoUMLArchive.g:4245:1: rule__Generalization__SubAssignment_5 : ( ( ruleStringOrID ) ) ;
    public final void rule__Generalization__SubAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4249:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4250:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4250:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4251:3: ( ruleStringOrID )
            {
             before(grammarAccess.getGeneralizationAccess().getSubClassCrossReference_5_0()); 
            // InternalOntoUMLArchive.g:4252:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4253:4: ruleStringOrID
            {
             before(grammarAccess.getGeneralizationAccess().getSubClassStringOrIDParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getSubClassStringOrIDParserRuleCall_5_0_1()); 

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
    // InternalOntoUMLArchive.g:4264:1: rule__DependencyLink__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DependencyLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4268:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4269:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4269:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4270:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4279:1: rule__DependencyLink__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__DependencyLink__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4283:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:4284:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:4284:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:4285:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:4294:1: rule__DependencyLink__FromAssignment_4 : ( ( ruleStringOrID ) ) ;
    public final void rule__DependencyLink__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4298:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4299:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4299:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4300:3: ( ruleStringOrID )
            {
             before(grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_4_0()); 
            // InternalOntoUMLArchive.g:4301:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4302:4: ruleStringOrID
            {
             before(grammarAccess.getDependencyLinkAccess().getFromClassStringOrIDParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getDependencyLinkAccess().getFromClassStringOrIDParserRuleCall_4_0_1()); 

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
    // InternalOntoUMLArchive.g:4313:1: rule__DependencyLink__ToAssignment_6 : ( ( ruleStringOrID ) ) ;
    public final void rule__DependencyLink__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4317:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4318:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4318:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4319:3: ( ruleStringOrID )
            {
             before(grammarAccess.getDependencyLinkAccess().getToClassCrossReference_6_0()); 
            // InternalOntoUMLArchive.g:4320:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4321:4: ruleStringOrID
            {
             before(grammarAccess.getDependencyLinkAccess().getToClassStringOrIDParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getDependencyLinkAccess().getToClassStringOrIDParserRuleCall_6_0_1()); 

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
    // InternalOntoUMLArchive.g:4332:1: rule__Derivation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__Derivation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4336:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4337:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:4337:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4338:3: ruleStringOrID
            {
             before(grammarAccess.getDerivationAccess().getNameStringOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getDerivationAccess().getNameStringOrIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalOntoUMLArchive.g:4347:1: rule__Derivation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__Derivation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4351:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:4352:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:4352:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:4353:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:4362:1: rule__Derivation__ClassAssignment_4 : ( ruleClassDerivationEnd ) ;
    public final void rule__Derivation__ClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4366:1: ( ( ruleClassDerivationEnd ) )
            // InternalOntoUMLArchive.g:4367:2: ( ruleClassDerivationEnd )
            {
            // InternalOntoUMLArchive.g:4367:2: ( ruleClassDerivationEnd )
            // InternalOntoUMLArchive.g:4368:3: ruleClassDerivationEnd
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
    // InternalOntoUMLArchive.g:4377:1: rule__Derivation__PartAssignment_6 : ( ruleRelationDerivationEnd ) ;
    public final void rule__Derivation__PartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4381:1: ( ( ruleRelationDerivationEnd ) )
            // InternalOntoUMLArchive.g:4382:2: ( ruleRelationDerivationEnd )
            {
            // InternalOntoUMLArchive.g:4382:2: ( ruleRelationDerivationEnd )
            // InternalOntoUMLArchive.g:4383:3: ruleRelationDerivationEnd
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
    // InternalOntoUMLArchive.g:4392:1: rule__ClassDerivationEnd__MultiplicityAssignment_0 : ( ruleMultiplicity ) ;
    public final void rule__ClassDerivationEnd__MultiplicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4396:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:4397:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:4397:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:4398:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:4407:1: rule__ClassDerivationEnd__EndTypeAssignment_1 : ( ( ruleStringOrID ) ) ;
    public final void rule__ClassDerivationEnd__EndTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4411:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4412:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4412:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4413:3: ( ruleStringOrID )
            {
             before(grammarAccess.getClassDerivationEndAccess().getEndTypeClassCrossReference_1_0()); 
            // InternalOntoUMLArchive.g:4414:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4415:4: ruleStringOrID
            {
             before(grammarAccess.getClassDerivationEndAccess().getEndTypeClassStringOrIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getClassDerivationEndAccess().getEndTypeClassStringOrIDParserRuleCall_1_0_1()); 

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
    // InternalOntoUMLArchive.g:4426:1: rule__ClassDerivationEnd__ConstraintsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ClassDerivationEnd__ConstraintsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4430:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4431:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4431:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4432:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4441:1: rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4445:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4446:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4446:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4447:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4456:1: rule__RelationDerivationEnd__MultiplicityAssignment_0 : ( ruleMultiplicity ) ;
    public final void rule__RelationDerivationEnd__MultiplicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4460:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:4461:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:4461:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:4462:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:4471:1: rule__RelationDerivationEnd__EndTypeAssignment_1 : ( ( ruleStringOrID ) ) ;
    public final void rule__RelationDerivationEnd__EndTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4475:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4476:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4476:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4477:3: ( ruleStringOrID )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationCrossReference_1_0()); 
            // InternalOntoUMLArchive.g:4478:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4479:4: ruleStringOrID
            {
             before(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationStringOrIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationStringOrIDParserRuleCall_1_0_1()); 

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
    // InternalOntoUMLArchive.g:4490:1: rule__RelationDerivationEnd__ConstraintsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__RelationDerivationEnd__ConstraintsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4494:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4495:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4495:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4496:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4505:1: rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4509:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4510:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4510:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4511:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4520:1: rule__GeneralizationSet__IsDisjointAssignment_1_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4524:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoUMLArchive.g:4525:2: ( ( 'disjoint' ) )
            {
            // InternalOntoUMLArchive.g:4525:2: ( ( 'disjoint' ) )
            // InternalOntoUMLArchive.g:4526:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 
            // InternalOntoUMLArchive.g:4527:3: ( 'disjoint' )
            // InternalOntoUMLArchive.g:4528:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:4539:1: rule__GeneralizationSet__IsCompleteAssignment_1_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4543:1: ( ( ( 'complete' ) ) )
            // InternalOntoUMLArchive.g:4544:2: ( ( 'complete' ) )
            {
            // InternalOntoUMLArchive.g:4544:2: ( ( 'complete' ) )
            // InternalOntoUMLArchive.g:4545:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 
            // InternalOntoUMLArchive.g:4546:3: ( 'complete' )
            // InternalOntoUMLArchive.g:4547:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:4558:1: rule__GeneralizationSet__NameAssignment_2 : ( ruleStringOrID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4562:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4563:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:4563:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4564:3: ruleStringOrID
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameStringOrIDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getNameStringOrIDParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalOntoUMLArchive.g:4573:1: rule__GeneralizationSet__GeneralizationsAssignment_3 : ( ruleGeneralization ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4577:1: ( ( ruleGeneralization ) )
            // InternalOntoUMLArchive.g:4578:2: ( ruleGeneralization )
            {
            // InternalOntoUMLArchive.g:4578:2: ( ruleGeneralization )
            // InternalOntoUMLArchive.g:4579:3: ruleGeneralization
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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\57\uffff";
    static final String dfa_2s = "\42\uffff\2\6\11\uffff\1\6\1\uffff";
    static final String dfa_3s = "\1\26\1\5\3\7\1\5\1\uffff\2\5\2\25\1\4\1\5\2\36\2\31\1\4\2\5\2\37\1\33\2\5\2\25\1\4\1\5\1\25\1\5\1\31\2\36\2\22\1\33\1\4\1\5\1\uffff\2\37\1\33\1\25\1\5\1\22\1\33";
    static final String dfa_4s = "\1\26\4\31\1\35\1\uffff\4\35\1\14\1\6\2\36\2\32\1\14\1\5\1\35\2\37\1\34\4\35\1\14\1\6\1\25\1\5\1\31\2\36\2\32\1\34\1\14\1\5\1\uffff\2\37\1\34\1\25\1\5\1\31\1\34";
    static final String dfa_5s = "\6\uffff\1\1\40\uffff\1\2\7\uffff";
    static final String dfa_6s = "\57\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\1\3\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\11\1\12\6\uffff\1\7\1\10\6\uffff\1\14\7\uffff\1\13",
            "",
            "\1\11\1\12\16\uffff\1\14\7\uffff\1\13",
            "\1\11\1\12\16\uffff\1\14\7\uffff\1\13",
            "\1\14\7\uffff\1\13",
            "\1\14\7\uffff\1\13",
            "\1\16\7\uffff\1\15",
            "\1\17\1\20",
            "\1\21",
            "\1\21",
            "\1\23\1\22",
            "\1\23\1\22",
            "\1\25\7\uffff\1\24",
            "\1\26",
            "\1\31\1\32\6\uffff\1\27\1\30\6\uffff\1\34\7\uffff\1\33",
            "\1\35",
            "\1\35",
            "\1\37\1\36",
            "\1\31\1\32\16\uffff\1\34\7\uffff\1\33",
            "\1\31\1\32\16\uffff\1\34\7\uffff\1\33",
            "\1\34\7\uffff\1\33",
            "\1\34\7\uffff\1\33",
            "\1\41\7\uffff\1\40",
            "\1\42\1\43",
            "\1\14",
            "\1\44",
            "\1\23",
            "\1\45",
            "\1\45",
            "\1\6\6\uffff\1\47\1\46",
            "\1\6\6\uffff\1\47\1\46",
            "\1\37\1\36",
            "\1\51\7\uffff\1\50",
            "\1\52",
            "",
            "\1\53",
            "\1\53",
            "\1\55\1\54",
            "\1\34",
            "\1\56",
            "\1\6\6\uffff\1\47",
            "\1\55\1\54"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "628:1: rule__Association__Alternatives : ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) );";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\1\26\1\5\3\7\2\uffff";
    static final String dfa_10s = "\1\26\4\31\2\uffff";
    static final String dfa_11s = "\5\uffff\1\2\1\1";
    static final String dfa_12s = "\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2\1\3\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "\1\4\17\uffff\1\6\1\uffff\1\5",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "649:1: rule__BinaryAssociation__Alternatives : ( ( ruleDirectedAssociation ) | ( ruleUndirectedAssociation ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000D9004B0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000D900480002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000008000E0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020206060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000020000E0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000008000A0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000800E0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000060L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000062L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000030000000002L});

}
