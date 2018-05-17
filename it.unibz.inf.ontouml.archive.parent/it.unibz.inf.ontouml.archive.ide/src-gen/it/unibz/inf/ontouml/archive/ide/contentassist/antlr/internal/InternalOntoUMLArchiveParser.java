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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_STEREOTYPE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'shared'", "'composite'", "'navigable'", "'nonnavigable'", "'publication'", "'authors'", "'ontology'", "';'", "'class'", "'att'", "':'", "'association'", "'from'", "'to'", "'end'", "'{'", "'}'", "','", "'['", "'..'", "']'", "'gen'", "'super'", "'sub'", "'dependency'", "'derivation'", "'relation'", "'genset'", "'abstract'", "'disjoint'", "'complete'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
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
    public static final int RULE_STEREOTYPE_STRING=7;
    public static final int RULE_STRING=5;
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


    // $ANTLR start "ruleNavigabilityDeclaration"
    // InternalOntoUMLArchive.g:569:1: ruleNavigabilityDeclaration : ( ( rule__NavigabilityDeclaration__Alternatives ) ) ;
    public final void ruleNavigabilityDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:573:1: ( ( ( rule__NavigabilityDeclaration__Alternatives ) ) )
            // InternalOntoUMLArchive.g:574:2: ( ( rule__NavigabilityDeclaration__Alternatives ) )
            {
            // InternalOntoUMLArchive.g:574:2: ( ( rule__NavigabilityDeclaration__Alternatives ) )
            // InternalOntoUMLArchive.g:575:3: ( rule__NavigabilityDeclaration__Alternatives )
            {
             before(grammarAccess.getNavigabilityDeclarationAccess().getAlternatives()); 
            // InternalOntoUMLArchive.g:576:3: ( rule__NavigabilityDeclaration__Alternatives )
            // InternalOntoUMLArchive.g:576:4: rule__NavigabilityDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NavigabilityDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNavigabilityDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigabilityDeclaration"


    // $ANTLR start "rule__ModelElement__Alternatives_0"
    // InternalOntoUMLArchive.g:584:1: rule__ModelElement__Alternatives_0 : ( ( ruleClass ) | ( ruleRelationship ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:588:1: ( ( ruleClass ) | ( ruleRelationship ) | ( ruleGeneralizationSet ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 21:
            case 41:
                {
                alt1=1;
                }
                break;
            case 24:
            case 34:
            case 37:
            case 38:
                {
                alt1=2;
                }
                break;
            case 40:
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
                    // InternalOntoUMLArchive.g:589:2: ( ruleClass )
                    {
                    // InternalOntoUMLArchive.g:589:2: ( ruleClass )
                    // InternalOntoUMLArchive.g:590:3: ruleClass
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
                    // InternalOntoUMLArchive.g:595:2: ( ruleRelationship )
                    {
                    // InternalOntoUMLArchive.g:595:2: ( ruleRelationship )
                    // InternalOntoUMLArchive.g:596:3: ruleRelationship
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
                    // InternalOntoUMLArchive.g:601:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoUMLArchive.g:601:2: ( ruleGeneralizationSet )
                    // InternalOntoUMLArchive.g:602:3: ruleGeneralizationSet
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
    // InternalOntoUMLArchive.g:611:1: rule__Relationship__Alternatives : ( ( ruleAssociation ) | ( ruleGeneralization ) | ( ruleDependencyLink ) | ( ruleDerivation ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:615:1: ( ( ruleAssociation ) | ( ruleGeneralization ) | ( ruleDependencyLink ) | ( ruleDerivation ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 38:
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
                    // InternalOntoUMLArchive.g:616:2: ( ruleAssociation )
                    {
                    // InternalOntoUMLArchive.g:616:2: ( ruleAssociation )
                    // InternalOntoUMLArchive.g:617:3: ruleAssociation
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
                    // InternalOntoUMLArchive.g:622:2: ( ruleGeneralization )
                    {
                    // InternalOntoUMLArchive.g:622:2: ( ruleGeneralization )
                    // InternalOntoUMLArchive.g:623:3: ruleGeneralization
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
                    // InternalOntoUMLArchive.g:628:2: ( ruleDependencyLink )
                    {
                    // InternalOntoUMLArchive.g:628:2: ( ruleDependencyLink )
                    // InternalOntoUMLArchive.g:629:3: ruleDependencyLink
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
                    // InternalOntoUMLArchive.g:634:2: ( ruleDerivation )
                    {
                    // InternalOntoUMLArchive.g:634:2: ( ruleDerivation )
                    // InternalOntoUMLArchive.g:635:3: ruleDerivation
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
    // InternalOntoUMLArchive.g:644:1: rule__Association__Alternatives : ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) );
    public final void rule__Association__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:648:1: ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalOntoUMLArchive.g:649:2: ( ruleBinaryAssociation )
                    {
                    // InternalOntoUMLArchive.g:649:2: ( ruleBinaryAssociation )
                    // InternalOntoUMLArchive.g:650:3: ruleBinaryAssociation
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
                    // InternalOntoUMLArchive.g:655:2: ( ruleNaryAssociation )
                    {
                    // InternalOntoUMLArchive.g:655:2: ( ruleNaryAssociation )
                    // InternalOntoUMLArchive.g:656:3: ruleNaryAssociation
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
    // InternalOntoUMLArchive.g:665:1: rule__BinaryAssociation__Alternatives : ( ( ruleDirectedAssociation ) | ( ruleUndirectedAssociation ) );
    public final void rule__BinaryAssociation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:669:1: ( ( ruleDirectedAssociation ) | ( ruleUndirectedAssociation ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalOntoUMLArchive.g:670:2: ( ruleDirectedAssociation )
                    {
                    // InternalOntoUMLArchive.g:670:2: ( ruleDirectedAssociation )
                    // InternalOntoUMLArchive.g:671:3: ruleDirectedAssociation
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
                    // InternalOntoUMLArchive.g:676:2: ( ruleUndirectedAssociation )
                    {
                    // InternalOntoUMLArchive.g:676:2: ( ruleUndirectedAssociation )
                    // InternalOntoUMLArchive.g:677:3: ruleUndirectedAssociation
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
    // InternalOntoUMLArchive.g:686:1: rule__CARDINALITY__Alternatives : ( ( '*' ) | ( RULE_INT ) );
    public final void rule__CARDINALITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:690:1: ( ( '*' ) | ( RULE_INT ) )
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
                    // InternalOntoUMLArchive.g:691:2: ( '*' )
                    {
                    // InternalOntoUMLArchive.g:691:2: ( '*' )
                    // InternalOntoUMLArchive.g:692:3: '*'
                    {
                     before(grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:697:2: ( RULE_INT )
                    {
                    // InternalOntoUMLArchive.g:697:2: ( RULE_INT )
                    // InternalOntoUMLArchive.g:698:3: RULE_INT
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
    // InternalOntoUMLArchive.g:707:1: rule__StringOrID__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__StringOrID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:711:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalOntoUMLArchive.g:712:2: ( RULE_STRING )
                    {
                    // InternalOntoUMLArchive.g:712:2: ( RULE_STRING )
                    // InternalOntoUMLArchive.g:713:3: RULE_STRING
                    {
                     before(grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getStringOrIDAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:718:2: ( RULE_ID )
                    {
                    // InternalOntoUMLArchive.g:718:2: ( RULE_ID )
                    // InternalOntoUMLArchive.g:719:3: RULE_ID
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
    // InternalOntoUMLArchive.g:728:1: rule__AggregationKindDeclaration__Alternatives : ( ( ( 'shared' ) ) | ( ( 'composite' ) ) );
    public final void rule__AggregationKindDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:732:1: ( ( ( 'shared' ) ) | ( ( 'composite' ) ) )
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
                    // InternalOntoUMLArchive.g:733:2: ( ( 'shared' ) )
                    {
                    // InternalOntoUMLArchive.g:733:2: ( ( 'shared' ) )
                    // InternalOntoUMLArchive.g:734:3: ( 'shared' )
                    {
                     before(grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0()); 
                    // InternalOntoUMLArchive.g:735:3: ( 'shared' )
                    // InternalOntoUMLArchive.g:735:4: 'shared'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAggregationKindDeclarationAccess().getSharedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:739:2: ( ( 'composite' ) )
                    {
                    // InternalOntoUMLArchive.g:739:2: ( ( 'composite' ) )
                    // InternalOntoUMLArchive.g:740:3: ( 'composite' )
                    {
                     before(grammarAccess.getAggregationKindDeclarationAccess().getCompositeEnumLiteralDeclaration_1()); 
                    // InternalOntoUMLArchive.g:741:3: ( 'composite' )
                    // InternalOntoUMLArchive.g:741:4: 'composite'
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


    // $ANTLR start "rule__NavigabilityDeclaration__Alternatives"
    // InternalOntoUMLArchive.g:749:1: rule__NavigabilityDeclaration__Alternatives : ( ( ( 'navigable' ) ) | ( ( 'nonnavigable' ) ) );
    public final void rule__NavigabilityDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:753:1: ( ( ( 'navigable' ) ) | ( ( 'nonnavigable' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoUMLArchive.g:754:2: ( ( 'navigable' ) )
                    {
                    // InternalOntoUMLArchive.g:754:2: ( ( 'navigable' ) )
                    // InternalOntoUMLArchive.g:755:3: ( 'navigable' )
                    {
                     before(grammarAccess.getNavigabilityDeclarationAccess().getNavigableEnumLiteralDeclaration_0()); 
                    // InternalOntoUMLArchive.g:756:3: ( 'navigable' )
                    // InternalOntoUMLArchive.g:756:4: 'navigable'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNavigabilityDeclarationAccess().getNavigableEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:760:2: ( ( 'nonnavigable' ) )
                    {
                    // InternalOntoUMLArchive.g:760:2: ( ( 'nonnavigable' ) )
                    // InternalOntoUMLArchive.g:761:3: ( 'nonnavigable' )
                    {
                     before(grammarAccess.getNavigabilityDeclarationAccess().getNonnavigableEnumLiteralDeclaration_1()); 
                    // InternalOntoUMLArchive.g:762:3: ( 'nonnavigable' )
                    // InternalOntoUMLArchive.g:762:4: 'nonnavigable'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNavigabilityDeclarationAccess().getNonnavigableEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__NavigabilityDeclaration__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalOntoUMLArchive.g:770:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:774:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoUMLArchive.g:775:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalOntoUMLArchive.g:782:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:786:1: ( ( ( rule__Model__Group_0__0 )? ) )
            // InternalOntoUMLArchive.g:787:1: ( ( rule__Model__Group_0__0 )? )
            {
            // InternalOntoUMLArchive.g:787:1: ( ( rule__Model__Group_0__0 )? )
            // InternalOntoUMLArchive.g:788:2: ( rule__Model__Group_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // InternalOntoUMLArchive.g:789:2: ( rule__Model__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoUMLArchive.g:789:3: rule__Model__Group_0__0
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
    // InternalOntoUMLArchive.g:797:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:801:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoUMLArchive.g:802:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalOntoUMLArchive.g:809:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:813:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // InternalOntoUMLArchive.g:814:1: ( ( rule__Model__Group_1__0 )? )
            {
            // InternalOntoUMLArchive.g:814:1: ( ( rule__Model__Group_1__0 )? )
            // InternalOntoUMLArchive.g:815:2: ( rule__Model__Group_1__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_1()); 
            // InternalOntoUMLArchive.g:816:2: ( rule__Model__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUMLArchive.g:816:3: rule__Model__Group_1__0
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
    // InternalOntoUMLArchive.g:824:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:828:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoUMLArchive.g:829:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalOntoUMLArchive.g:836:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:840:1: ( ( ( rule__Model__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:841:1: ( ( rule__Model__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:841:1: ( ( rule__Model__Group_2__0 )? )
            // InternalOntoUMLArchive.g:842:2: ( rule__Model__Group_2__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:843:2: ( rule__Model__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoUMLArchive.g:843:3: rule__Model__Group_2__0
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
    // InternalOntoUMLArchive.g:851:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:855:1: ( rule__Model__Group__3__Impl )
            // InternalOntoUMLArchive.g:856:2: rule__Model__Group__3__Impl
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
    // InternalOntoUMLArchive.g:862:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:866:1: ( ( ( rule__Model__ElementsAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:867:1: ( ( rule__Model__ElementsAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:867:1: ( ( rule__Model__ElementsAssignment_3 )* )
            // InternalOntoUMLArchive.g:868:2: ( rule__Model__ElementsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3()); 
            // InternalOntoUMLArchive.g:869:2: ( rule__Model__ElementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21||LA12_0==24||LA12_0==34||(LA12_0>=37 && LA12_0<=38)||(LA12_0>=40 && LA12_0<=41)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:869:3: rule__Model__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalOntoUMLArchive.g:878:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:882:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // InternalOntoUMLArchive.g:883:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
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
    // InternalOntoUMLArchive.g:890:1: rule__Model__Group_0__0__Impl : ( 'publication' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:894:1: ( ( 'publication' ) )
            // InternalOntoUMLArchive.g:895:1: ( 'publication' )
            {
            // InternalOntoUMLArchive.g:895:1: ( 'publication' )
            // InternalOntoUMLArchive.g:896:2: 'publication'
            {
             before(grammarAccess.getModelAccess().getPublicationKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:905:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:909:1: ( rule__Model__Group_0__1__Impl )
            // InternalOntoUMLArchive.g:910:2: rule__Model__Group_0__1__Impl
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
    // InternalOntoUMLArchive.g:916:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__PublicationTitleAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:920:1: ( ( ( rule__Model__PublicationTitleAssignment_0_1 ) ) )
            // InternalOntoUMLArchive.g:921:1: ( ( rule__Model__PublicationTitleAssignment_0_1 ) )
            {
            // InternalOntoUMLArchive.g:921:1: ( ( rule__Model__PublicationTitleAssignment_0_1 ) )
            // InternalOntoUMLArchive.g:922:2: ( rule__Model__PublicationTitleAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getPublicationTitleAssignment_0_1()); 
            // InternalOntoUMLArchive.g:923:2: ( rule__Model__PublicationTitleAssignment_0_1 )
            // InternalOntoUMLArchive.g:923:3: rule__Model__PublicationTitleAssignment_0_1
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
    // InternalOntoUMLArchive.g:932:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:936:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // InternalOntoUMLArchive.g:937:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
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
    // InternalOntoUMLArchive.g:944:1: rule__Model__Group_1__0__Impl : ( 'authors' ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:948:1: ( ( 'authors' ) )
            // InternalOntoUMLArchive.g:949:1: ( 'authors' )
            {
            // InternalOntoUMLArchive.g:949:1: ( 'authors' )
            // InternalOntoUMLArchive.g:950:2: 'authors'
            {
             before(grammarAccess.getModelAccess().getAuthorsKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:959:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:963:1: ( rule__Model__Group_1__1__Impl )
            // InternalOntoUMLArchive.g:964:2: rule__Model__Group_1__1__Impl
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
    // InternalOntoUMLArchive.g:970:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__AuthorsAssignment_1_1 ) ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:974:1: ( ( ( rule__Model__AuthorsAssignment_1_1 ) ) )
            // InternalOntoUMLArchive.g:975:1: ( ( rule__Model__AuthorsAssignment_1_1 ) )
            {
            // InternalOntoUMLArchive.g:975:1: ( ( rule__Model__AuthorsAssignment_1_1 ) )
            // InternalOntoUMLArchive.g:976:2: ( rule__Model__AuthorsAssignment_1_1 )
            {
             before(grammarAccess.getModelAccess().getAuthorsAssignment_1_1()); 
            // InternalOntoUMLArchive.g:977:2: ( rule__Model__AuthorsAssignment_1_1 )
            // InternalOntoUMLArchive.g:977:3: rule__Model__AuthorsAssignment_1_1
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
    // InternalOntoUMLArchive.g:986:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:990:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalOntoUMLArchive.g:991:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
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
    // InternalOntoUMLArchive.g:998:1: rule__Model__Group_2__0__Impl : ( 'ontology' ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1002:1: ( ( 'ontology' ) )
            // InternalOntoUMLArchive.g:1003:1: ( 'ontology' )
            {
            // InternalOntoUMLArchive.g:1003:1: ( 'ontology' )
            // InternalOntoUMLArchive.g:1004:2: 'ontology'
            {
             before(grammarAccess.getModelAccess().getOntologyKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1013:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1017:1: ( rule__Model__Group_2__1__Impl )
            // InternalOntoUMLArchive.g:1018:2: rule__Model__Group_2__1__Impl
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
    // InternalOntoUMLArchive.g:1024:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__OntologyNameAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1028:1: ( ( ( rule__Model__OntologyNameAssignment_2_1 ) ) )
            // InternalOntoUMLArchive.g:1029:1: ( ( rule__Model__OntologyNameAssignment_2_1 ) )
            {
            // InternalOntoUMLArchive.g:1029:1: ( ( rule__Model__OntologyNameAssignment_2_1 ) )
            // InternalOntoUMLArchive.g:1030:2: ( rule__Model__OntologyNameAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getOntologyNameAssignment_2_1()); 
            // InternalOntoUMLArchive.g:1031:2: ( rule__Model__OntologyNameAssignment_2_1 )
            // InternalOntoUMLArchive.g:1031:3: rule__Model__OntologyNameAssignment_2_1
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
    // InternalOntoUMLArchive.g:1040:1: rule__ModelElement__Group__0 : rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 ;
    public final void rule__ModelElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1044:1: ( rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1 )
            // InternalOntoUMLArchive.g:1045:2: rule__ModelElement__Group__0__Impl rule__ModelElement__Group__1
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
    // InternalOntoUMLArchive.g:1052:1: rule__ModelElement__Group__0__Impl : ( ( rule__ModelElement__Alternatives_0 ) ) ;
    public final void rule__ModelElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1056:1: ( ( ( rule__ModelElement__Alternatives_0 ) ) )
            // InternalOntoUMLArchive.g:1057:1: ( ( rule__ModelElement__Alternatives_0 ) )
            {
            // InternalOntoUMLArchive.g:1057:1: ( ( rule__ModelElement__Alternatives_0 ) )
            // InternalOntoUMLArchive.g:1058:2: ( rule__ModelElement__Alternatives_0 )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives_0()); 
            // InternalOntoUMLArchive.g:1059:2: ( rule__ModelElement__Alternatives_0 )
            // InternalOntoUMLArchive.g:1059:3: rule__ModelElement__Alternatives_0
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
    // InternalOntoUMLArchive.g:1067:1: rule__ModelElement__Group__1 : rule__ModelElement__Group__1__Impl ;
    public final void rule__ModelElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1071:1: ( rule__ModelElement__Group__1__Impl )
            // InternalOntoUMLArchive.g:1072:2: rule__ModelElement__Group__1__Impl
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
    // InternalOntoUMLArchive.g:1078:1: rule__ModelElement__Group__1__Impl : ( ';' ) ;
    public final void rule__ModelElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1082:1: ( ( ';' ) )
            // InternalOntoUMLArchive.g:1083:1: ( ';' )
            {
            // InternalOntoUMLArchive.g:1083:1: ( ';' )
            // InternalOntoUMLArchive.g:1084:2: ';'
            {
             before(grammarAccess.getModelElementAccess().getSemicolonKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1094:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1098:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalOntoUMLArchive.g:1099:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalOntoUMLArchive.g:1106:1: rule__Class__Group__0__Impl : ( ( rule__Class__IsAbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1110:1: ( ( ( rule__Class__IsAbstractAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:1111:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:1111:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            // InternalOntoUMLArchive.g:1112:2: ( rule__Class__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 
            // InternalOntoUMLArchive.g:1113:2: ( rule__Class__IsAbstractAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOntoUMLArchive.g:1113:3: rule__Class__IsAbstractAssignment_0
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
    // InternalOntoUMLArchive.g:1121:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1125:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalOntoUMLArchive.g:1126:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalOntoUMLArchive.g:1133:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1137:1: ( ( 'class' ) )
            // InternalOntoUMLArchive.g:1138:1: ( 'class' )
            {
            // InternalOntoUMLArchive.g:1138:1: ( 'class' )
            // InternalOntoUMLArchive.g:1139:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1148:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1152:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalOntoUMLArchive.g:1153:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalOntoUMLArchive.g:1160:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1164:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalOntoUMLArchive.g:1165:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalOntoUMLArchive.g:1165:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalOntoUMLArchive.g:1166:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalOntoUMLArchive.g:1167:2: ( rule__Class__NameAssignment_2 )
            // InternalOntoUMLArchive.g:1167:3: rule__Class__NameAssignment_2
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
    // InternalOntoUMLArchive.g:1175:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1179:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalOntoUMLArchive.g:1180:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalOntoUMLArchive.g:1187:1: rule__Class__Group__3__Impl : ( ( rule__Class__StereotypesAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1191:1: ( ( ( rule__Class__StereotypesAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:1192:1: ( ( rule__Class__StereotypesAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:1192:1: ( ( rule__Class__StereotypesAssignment_3 )* )
            // InternalOntoUMLArchive.g:1193:2: ( rule__Class__StereotypesAssignment_3 )*
            {
             before(grammarAccess.getClassAccess().getStereotypesAssignment_3()); 
            // InternalOntoUMLArchive.g:1194:2: ( rule__Class__StereotypesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STEREOTYPE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1194:3: rule__Class__StereotypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Class__StereotypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalOntoUMLArchive.g:1202:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1206:1: ( rule__Class__Group__4__Impl )
            // InternalOntoUMLArchive.g:1207:2: rule__Class__Group__4__Impl
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
    // InternalOntoUMLArchive.g:1213:1: rule__Class__Group__4__Impl : ( ( rule__Class__AttributesAssignment_4 )* ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1217:1: ( ( ( rule__Class__AttributesAssignment_4 )* ) )
            // InternalOntoUMLArchive.g:1218:1: ( ( rule__Class__AttributesAssignment_4 )* )
            {
            // InternalOntoUMLArchive.g:1218:1: ( ( rule__Class__AttributesAssignment_4 )* )
            // InternalOntoUMLArchive.g:1219:2: ( rule__Class__AttributesAssignment_4 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_4()); 
            // InternalOntoUMLArchive.g:1220:2: ( rule__Class__AttributesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1220:3: rule__Class__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Class__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalOntoUMLArchive.g:1229:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1233:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalOntoUMLArchive.g:1234:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUMLArchive.g:1241:1: rule__Attribute__Group__0__Impl : ( 'att' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1245:1: ( ( 'att' ) )
            // InternalOntoUMLArchive.g:1246:1: ( 'att' )
            {
            // InternalOntoUMLArchive.g:1246:1: ( 'att' )
            // InternalOntoUMLArchive.g:1247:2: 'att'
            {
             before(grammarAccess.getAttributeAccess().getAttKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1256:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1260:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalOntoUMLArchive.g:1261:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalOntoUMLArchive.g:1268:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1272:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:1273:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:1273:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalOntoUMLArchive.g:1274:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1275:2: ( rule__Attribute__NameAssignment_1 )
            // InternalOntoUMLArchive.g:1275:3: rule__Attribute__NameAssignment_1
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
    // InternalOntoUMLArchive.g:1283:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1287:1: ( rule__Attribute__Group__2__Impl )
            // InternalOntoUMLArchive.g:1288:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalOntoUMLArchive.g:1294:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1298:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:1299:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:1299:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalOntoUMLArchive.g:1300:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:1301:2: ( rule__Attribute__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23||LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOntoUMLArchive.g:1301:3: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group_2__0"
    // InternalOntoUMLArchive.g:1310:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1314:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalOntoUMLArchive.g:1315:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // InternalOntoUMLArchive.g:1322:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__MultiplicityAssignment_2_0 )? ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1326:1: ( ( ( rule__Attribute__MultiplicityAssignment_2_0 )? ) )
            // InternalOntoUMLArchive.g:1327:1: ( ( rule__Attribute__MultiplicityAssignment_2_0 )? )
            {
            // InternalOntoUMLArchive.g:1327:1: ( ( rule__Attribute__MultiplicityAssignment_2_0 )? )
            // InternalOntoUMLArchive.g:1328:2: ( rule__Attribute__MultiplicityAssignment_2_0 )?
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2_0()); 
            // InternalOntoUMLArchive.g:1329:2: ( rule__Attribute__MultiplicityAssignment_2_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOntoUMLArchive.g:1329:3: rule__Attribute__MultiplicityAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__MultiplicityAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getMultiplicityAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // InternalOntoUMLArchive.g:1337:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1341:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // InternalOntoUMLArchive.g:1342:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // InternalOntoUMLArchive.g:1349:1: rule__Attribute__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1353:1: ( ( ':' ) )
            // InternalOntoUMLArchive.g:1354:1: ( ':' )
            {
            // InternalOntoUMLArchive.g:1354:1: ( ':' )
            // InternalOntoUMLArchive.g:1355:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_2__2"
    // InternalOntoUMLArchive.g:1364:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1368:1: ( rule__Attribute__Group_2__2__Impl )
            // InternalOntoUMLArchive.g:1369:2: rule__Attribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__2"


    // $ANTLR start "rule__Attribute__Group_2__2__Impl"
    // InternalOntoUMLArchive.g:1375:1: rule__Attribute__Group_2__2__Impl : ( ( rule__Attribute__AttTypeAssignment_2_2 ) ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1379:1: ( ( ( rule__Attribute__AttTypeAssignment_2_2 ) ) )
            // InternalOntoUMLArchive.g:1380:1: ( ( rule__Attribute__AttTypeAssignment_2_2 ) )
            {
            // InternalOntoUMLArchive.g:1380:1: ( ( rule__Attribute__AttTypeAssignment_2_2 ) )
            // InternalOntoUMLArchive.g:1381:2: ( rule__Attribute__AttTypeAssignment_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAssignment_2_2()); 
            // InternalOntoUMLArchive.g:1382:2: ( rule__Attribute__AttTypeAssignment_2_2 )
            // InternalOntoUMLArchive.g:1382:3: rule__Attribute__AttTypeAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttTypeAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttTypeAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__2__Impl"


    // $ANTLR start "rule__DirectedAssociation__Group__0"
    // InternalOntoUMLArchive.g:1391:1: rule__DirectedAssociation__Group__0 : rule__DirectedAssociation__Group__0__Impl rule__DirectedAssociation__Group__1 ;
    public final void rule__DirectedAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1395:1: ( rule__DirectedAssociation__Group__0__Impl rule__DirectedAssociation__Group__1 )
            // InternalOntoUMLArchive.g:1396:2: rule__DirectedAssociation__Group__0__Impl rule__DirectedAssociation__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1403:1: rule__DirectedAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__DirectedAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1407:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:1408:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:1408:1: ( 'association' )
            // InternalOntoUMLArchive.g:1409:2: 'association'
            {
             before(grammarAccess.getDirectedAssociationAccess().getAssociationKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1418:1: rule__DirectedAssociation__Group__1 : rule__DirectedAssociation__Group__1__Impl rule__DirectedAssociation__Group__2 ;
    public final void rule__DirectedAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1422:1: ( rule__DirectedAssociation__Group__1__Impl rule__DirectedAssociation__Group__2 )
            // InternalOntoUMLArchive.g:1423:2: rule__DirectedAssociation__Group__1__Impl rule__DirectedAssociation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1430:1: rule__DirectedAssociation__Group__1__Impl : ( ( rule__DirectedAssociation__NameAssignment_1 )? ) ;
    public final void rule__DirectedAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1434:1: ( ( ( rule__DirectedAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1435:1: ( ( rule__DirectedAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1435:1: ( ( rule__DirectedAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1436:2: ( rule__DirectedAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getDirectedAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1437:2: ( rule__DirectedAssociation__NameAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOntoUMLArchive.g:1437:3: rule__DirectedAssociation__NameAssignment_1
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
    // InternalOntoUMLArchive.g:1445:1: rule__DirectedAssociation__Group__2 : rule__DirectedAssociation__Group__2__Impl rule__DirectedAssociation__Group__3 ;
    public final void rule__DirectedAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1449:1: ( rule__DirectedAssociation__Group__2__Impl rule__DirectedAssociation__Group__3 )
            // InternalOntoUMLArchive.g:1450:2: rule__DirectedAssociation__Group__2__Impl rule__DirectedAssociation__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUMLArchive.g:1457:1: rule__DirectedAssociation__Group__2__Impl : ( ( rule__DirectedAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__DirectedAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1461:1: ( ( ( rule__DirectedAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1462:1: ( ( rule__DirectedAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1462:1: ( ( rule__DirectedAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1463:2: ( rule__DirectedAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getDirectedAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1464:2: ( rule__DirectedAssociation__StereotypesAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STEREOTYPE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1464:3: rule__DirectedAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DirectedAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalOntoUMLArchive.g:1472:1: rule__DirectedAssociation__Group__3 : rule__DirectedAssociation__Group__3__Impl rule__DirectedAssociation__Group__4 ;
    public final void rule__DirectedAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1476:1: ( rule__DirectedAssociation__Group__3__Impl rule__DirectedAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1477:2: rule__DirectedAssociation__Group__3__Impl rule__DirectedAssociation__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUMLArchive.g:1484:1: rule__DirectedAssociation__Group__3__Impl : ( 'from' ) ;
    public final void rule__DirectedAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1488:1: ( ( 'from' ) )
            // InternalOntoUMLArchive.g:1489:1: ( 'from' )
            {
            // InternalOntoUMLArchive.g:1489:1: ( 'from' )
            // InternalOntoUMLArchive.g:1490:2: 'from'
            {
             before(grammarAccess.getDirectedAssociationAccess().getFromKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1499:1: rule__DirectedAssociation__Group__4 : rule__DirectedAssociation__Group__4__Impl rule__DirectedAssociation__Group__5 ;
    public final void rule__DirectedAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1503:1: ( rule__DirectedAssociation__Group__4__Impl rule__DirectedAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1504:2: rule__DirectedAssociation__Group__4__Impl rule__DirectedAssociation__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:1511:1: rule__DirectedAssociation__Group__4__Impl : ( ( rule__DirectedAssociation__FromAssignment_4 ) ) ;
    public final void rule__DirectedAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1515:1: ( ( ( rule__DirectedAssociation__FromAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:1516:1: ( ( rule__DirectedAssociation__FromAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:1516:1: ( ( rule__DirectedAssociation__FromAssignment_4 ) )
            // InternalOntoUMLArchive.g:1517:2: ( rule__DirectedAssociation__FromAssignment_4 )
            {
             before(grammarAccess.getDirectedAssociationAccess().getFromAssignment_4()); 
            // InternalOntoUMLArchive.g:1518:2: ( rule__DirectedAssociation__FromAssignment_4 )
            // InternalOntoUMLArchive.g:1518:3: rule__DirectedAssociation__FromAssignment_4
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
    // InternalOntoUMLArchive.g:1526:1: rule__DirectedAssociation__Group__5 : rule__DirectedAssociation__Group__5__Impl rule__DirectedAssociation__Group__6 ;
    public final void rule__DirectedAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1530:1: ( rule__DirectedAssociation__Group__5__Impl rule__DirectedAssociation__Group__6 )
            // InternalOntoUMLArchive.g:1531:2: rule__DirectedAssociation__Group__5__Impl rule__DirectedAssociation__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUMLArchive.g:1538:1: rule__DirectedAssociation__Group__5__Impl : ( 'to' ) ;
    public final void rule__DirectedAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1542:1: ( ( 'to' ) )
            // InternalOntoUMLArchive.g:1543:1: ( 'to' )
            {
            // InternalOntoUMLArchive.g:1543:1: ( 'to' )
            // InternalOntoUMLArchive.g:1544:2: 'to'
            {
             before(grammarAccess.getDirectedAssociationAccess().getToKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1553:1: rule__DirectedAssociation__Group__6 : rule__DirectedAssociation__Group__6__Impl ;
    public final void rule__DirectedAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1557:1: ( rule__DirectedAssociation__Group__6__Impl )
            // InternalOntoUMLArchive.g:1558:2: rule__DirectedAssociation__Group__6__Impl
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
    // InternalOntoUMLArchive.g:1564:1: rule__DirectedAssociation__Group__6__Impl : ( ( rule__DirectedAssociation__ToAssignment_6 ) ) ;
    public final void rule__DirectedAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1568:1: ( ( ( rule__DirectedAssociation__ToAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:1569:1: ( ( rule__DirectedAssociation__ToAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:1569:1: ( ( rule__DirectedAssociation__ToAssignment_6 ) )
            // InternalOntoUMLArchive.g:1570:2: ( rule__DirectedAssociation__ToAssignment_6 )
            {
             before(grammarAccess.getDirectedAssociationAccess().getToAssignment_6()); 
            // InternalOntoUMLArchive.g:1571:2: ( rule__DirectedAssociation__ToAssignment_6 )
            // InternalOntoUMLArchive.g:1571:3: rule__DirectedAssociation__ToAssignment_6
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
    // InternalOntoUMLArchive.g:1580:1: rule__UndirectedAssociation__Group__0 : rule__UndirectedAssociation__Group__0__Impl rule__UndirectedAssociation__Group__1 ;
    public final void rule__UndirectedAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1584:1: ( rule__UndirectedAssociation__Group__0__Impl rule__UndirectedAssociation__Group__1 )
            // InternalOntoUMLArchive.g:1585:2: rule__UndirectedAssociation__Group__0__Impl rule__UndirectedAssociation__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoUMLArchive.g:1592:1: rule__UndirectedAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__UndirectedAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1596:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:1597:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:1597:1: ( 'association' )
            // InternalOntoUMLArchive.g:1598:2: 'association'
            {
             before(grammarAccess.getUndirectedAssociationAccess().getAssociationKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1607:1: rule__UndirectedAssociation__Group__1 : rule__UndirectedAssociation__Group__1__Impl rule__UndirectedAssociation__Group__2 ;
    public final void rule__UndirectedAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1611:1: ( rule__UndirectedAssociation__Group__1__Impl rule__UndirectedAssociation__Group__2 )
            // InternalOntoUMLArchive.g:1612:2: rule__UndirectedAssociation__Group__1__Impl rule__UndirectedAssociation__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoUMLArchive.g:1619:1: rule__UndirectedAssociation__Group__1__Impl : ( ( rule__UndirectedAssociation__NameAssignment_1 )? ) ;
    public final void rule__UndirectedAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1623:1: ( ( ( rule__UndirectedAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1624:1: ( ( rule__UndirectedAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1624:1: ( ( rule__UndirectedAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1625:2: ( rule__UndirectedAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getUndirectedAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1626:2: ( rule__UndirectedAssociation__NameAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOntoUMLArchive.g:1626:3: rule__UndirectedAssociation__NameAssignment_1
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
    // InternalOntoUMLArchive.g:1634:1: rule__UndirectedAssociation__Group__2 : rule__UndirectedAssociation__Group__2__Impl rule__UndirectedAssociation__Group__3 ;
    public final void rule__UndirectedAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1638:1: ( rule__UndirectedAssociation__Group__2__Impl rule__UndirectedAssociation__Group__3 )
            // InternalOntoUMLArchive.g:1639:2: rule__UndirectedAssociation__Group__2__Impl rule__UndirectedAssociation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoUMLArchive.g:1646:1: rule__UndirectedAssociation__Group__2__Impl : ( ( rule__UndirectedAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__UndirectedAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1650:1: ( ( ( rule__UndirectedAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1651:1: ( ( rule__UndirectedAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1651:1: ( ( rule__UndirectedAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1652:2: ( rule__UndirectedAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getUndirectedAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1653:2: ( rule__UndirectedAssociation__StereotypesAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STEREOTYPE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1653:3: rule__UndirectedAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UndirectedAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalOntoUMLArchive.g:1661:1: rule__UndirectedAssociation__Group__3 : rule__UndirectedAssociation__Group__3__Impl rule__UndirectedAssociation__Group__4 ;
    public final void rule__UndirectedAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1665:1: ( rule__UndirectedAssociation__Group__3__Impl rule__UndirectedAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1666:2: rule__UndirectedAssociation__Group__3__Impl rule__UndirectedAssociation__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUMLArchive.g:1673:1: rule__UndirectedAssociation__Group__3__Impl : ( 'end' ) ;
    public final void rule__UndirectedAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1677:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1678:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1678:1: ( 'end' )
            // InternalOntoUMLArchive.g:1679:2: 'end'
            {
             before(grammarAccess.getUndirectedAssociationAccess().getEndKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1688:1: rule__UndirectedAssociation__Group__4 : rule__UndirectedAssociation__Group__4__Impl rule__UndirectedAssociation__Group__5 ;
    public final void rule__UndirectedAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1692:1: ( rule__UndirectedAssociation__Group__4__Impl rule__UndirectedAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1693:2: rule__UndirectedAssociation__Group__4__Impl rule__UndirectedAssociation__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoUMLArchive.g:1700:1: rule__UndirectedAssociation__Group__4__Impl : ( ( rule__UndirectedAssociation__EndAAssignment_4 ) ) ;
    public final void rule__UndirectedAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1704:1: ( ( ( rule__UndirectedAssociation__EndAAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:1705:1: ( ( rule__UndirectedAssociation__EndAAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:1705:1: ( ( rule__UndirectedAssociation__EndAAssignment_4 ) )
            // InternalOntoUMLArchive.g:1706:2: ( rule__UndirectedAssociation__EndAAssignment_4 )
            {
             before(grammarAccess.getUndirectedAssociationAccess().getEndAAssignment_4()); 
            // InternalOntoUMLArchive.g:1707:2: ( rule__UndirectedAssociation__EndAAssignment_4 )
            // InternalOntoUMLArchive.g:1707:3: rule__UndirectedAssociation__EndAAssignment_4
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
    // InternalOntoUMLArchive.g:1715:1: rule__UndirectedAssociation__Group__5 : rule__UndirectedAssociation__Group__5__Impl rule__UndirectedAssociation__Group__6 ;
    public final void rule__UndirectedAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1719:1: ( rule__UndirectedAssociation__Group__5__Impl rule__UndirectedAssociation__Group__6 )
            // InternalOntoUMLArchive.g:1720:2: rule__UndirectedAssociation__Group__5__Impl rule__UndirectedAssociation__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUMLArchive.g:1727:1: rule__UndirectedAssociation__Group__5__Impl : ( 'end' ) ;
    public final void rule__UndirectedAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1731:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1732:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1732:1: ( 'end' )
            // InternalOntoUMLArchive.g:1733:2: 'end'
            {
             before(grammarAccess.getUndirectedAssociationAccess().getEndKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1742:1: rule__UndirectedAssociation__Group__6 : rule__UndirectedAssociation__Group__6__Impl ;
    public final void rule__UndirectedAssociation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1746:1: ( rule__UndirectedAssociation__Group__6__Impl )
            // InternalOntoUMLArchive.g:1747:2: rule__UndirectedAssociation__Group__6__Impl
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
    // InternalOntoUMLArchive.g:1753:1: rule__UndirectedAssociation__Group__6__Impl : ( ( rule__UndirectedAssociation__EndBAssignment_6 ) ) ;
    public final void rule__UndirectedAssociation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1757:1: ( ( ( rule__UndirectedAssociation__EndBAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:1758:1: ( ( rule__UndirectedAssociation__EndBAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:1758:1: ( ( rule__UndirectedAssociation__EndBAssignment_6 ) )
            // InternalOntoUMLArchive.g:1759:2: ( rule__UndirectedAssociation__EndBAssignment_6 )
            {
             before(grammarAccess.getUndirectedAssociationAccess().getEndBAssignment_6()); 
            // InternalOntoUMLArchive.g:1760:2: ( rule__UndirectedAssociation__EndBAssignment_6 )
            // InternalOntoUMLArchive.g:1760:3: rule__UndirectedAssociation__EndBAssignment_6
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
    // InternalOntoUMLArchive.g:1769:1: rule__NaryAssociation__Group__0 : rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1 ;
    public final void rule__NaryAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1773:1: ( rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1 )
            // InternalOntoUMLArchive.g:1774:2: rule__NaryAssociation__Group__0__Impl rule__NaryAssociation__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoUMLArchive.g:1781:1: rule__NaryAssociation__Group__0__Impl : ( 'association' ) ;
    public final void rule__NaryAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1785:1: ( ( 'association' ) )
            // InternalOntoUMLArchive.g:1786:1: ( 'association' )
            {
            // InternalOntoUMLArchive.g:1786:1: ( 'association' )
            // InternalOntoUMLArchive.g:1787:2: 'association'
            {
             before(grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1796:1: rule__NaryAssociation__Group__1 : rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2 ;
    public final void rule__NaryAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1800:1: ( rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2 )
            // InternalOntoUMLArchive.g:1801:2: rule__NaryAssociation__Group__1__Impl rule__NaryAssociation__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoUMLArchive.g:1808:1: rule__NaryAssociation__Group__1__Impl : ( ( rule__NaryAssociation__NameAssignment_1 )? ) ;
    public final void rule__NaryAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1812:1: ( ( ( rule__NaryAssociation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:1813:1: ( ( rule__NaryAssociation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:1813:1: ( ( rule__NaryAssociation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:1814:2: ( rule__NaryAssociation__NameAssignment_1 )?
            {
             before(grammarAccess.getNaryAssociationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:1815:2: ( rule__NaryAssociation__NameAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOntoUMLArchive.g:1815:3: rule__NaryAssociation__NameAssignment_1
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
    // InternalOntoUMLArchive.g:1823:1: rule__NaryAssociation__Group__2 : rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3 ;
    public final void rule__NaryAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1827:1: ( rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3 )
            // InternalOntoUMLArchive.g:1828:2: rule__NaryAssociation__Group__2__Impl rule__NaryAssociation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalOntoUMLArchive.g:1835:1: rule__NaryAssociation__Group__2__Impl : ( ( rule__NaryAssociation__StereotypesAssignment_2 )* ) ;
    public final void rule__NaryAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1839:1: ( ( ( rule__NaryAssociation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:1840:1: ( ( rule__NaryAssociation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:1840:1: ( ( rule__NaryAssociation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:1841:2: ( rule__NaryAssociation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getNaryAssociationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:1842:2: ( rule__NaryAssociation__StereotypesAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STEREOTYPE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1842:3: rule__NaryAssociation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__NaryAssociation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalOntoUMLArchive.g:1850:1: rule__NaryAssociation__Group__3 : rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4 ;
    public final void rule__NaryAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1854:1: ( rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4 )
            // InternalOntoUMLArchive.g:1855:2: rule__NaryAssociation__Group__3__Impl rule__NaryAssociation__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoUMLArchive.g:1862:1: rule__NaryAssociation__Group__3__Impl : ( ( rule__NaryAssociation__Group_3__0 ) ) ;
    public final void rule__NaryAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1866:1: ( ( ( rule__NaryAssociation__Group_3__0 ) ) )
            // InternalOntoUMLArchive.g:1867:1: ( ( rule__NaryAssociation__Group_3__0 ) )
            {
            // InternalOntoUMLArchive.g:1867:1: ( ( rule__NaryAssociation__Group_3__0 ) )
            // InternalOntoUMLArchive.g:1868:2: ( rule__NaryAssociation__Group_3__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_3()); 
            // InternalOntoUMLArchive.g:1869:2: ( rule__NaryAssociation__Group_3__0 )
            // InternalOntoUMLArchive.g:1869:3: rule__NaryAssociation__Group_3__0
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
    // InternalOntoUMLArchive.g:1877:1: rule__NaryAssociation__Group__4 : rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5 ;
    public final void rule__NaryAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1881:1: ( rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5 )
            // InternalOntoUMLArchive.g:1882:2: rule__NaryAssociation__Group__4__Impl rule__NaryAssociation__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalOntoUMLArchive.g:1889:1: rule__NaryAssociation__Group__4__Impl : ( ( rule__NaryAssociation__Group_4__0 ) ) ;
    public final void rule__NaryAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1893:1: ( ( ( rule__NaryAssociation__Group_4__0 ) ) )
            // InternalOntoUMLArchive.g:1894:1: ( ( rule__NaryAssociation__Group_4__0 ) )
            {
            // InternalOntoUMLArchive.g:1894:1: ( ( rule__NaryAssociation__Group_4__0 ) )
            // InternalOntoUMLArchive.g:1895:2: ( rule__NaryAssociation__Group_4__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_4()); 
            // InternalOntoUMLArchive.g:1896:2: ( rule__NaryAssociation__Group_4__0 )
            // InternalOntoUMLArchive.g:1896:3: rule__NaryAssociation__Group_4__0
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
    // InternalOntoUMLArchive.g:1904:1: rule__NaryAssociation__Group__5 : rule__NaryAssociation__Group__5__Impl ;
    public final void rule__NaryAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1908:1: ( rule__NaryAssociation__Group__5__Impl )
            // InternalOntoUMLArchive.g:1909:2: rule__NaryAssociation__Group__5__Impl
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
    // InternalOntoUMLArchive.g:1915:1: rule__NaryAssociation__Group__5__Impl : ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) ) ;
    public final void rule__NaryAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1919:1: ( ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) ) )
            // InternalOntoUMLArchive.g:1920:1: ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) )
            {
            // InternalOntoUMLArchive.g:1920:1: ( ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* ) )
            // InternalOntoUMLArchive.g:1921:2: ( ( rule__NaryAssociation__Group_5__0 ) ) ( ( rule__NaryAssociation__Group_5__0 )* )
            {
            // InternalOntoUMLArchive.g:1921:2: ( ( rule__NaryAssociation__Group_5__0 ) )
            // InternalOntoUMLArchive.g:1922:3: ( rule__NaryAssociation__Group_5__0 )
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1923:3: ( rule__NaryAssociation__Group_5__0 )
            // InternalOntoUMLArchive.g:1923:4: rule__NaryAssociation__Group_5__0
            {
            pushFollow(FOLLOW_18);
            rule__NaryAssociation__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getNaryAssociationAccess().getGroup_5()); 

            }

            // InternalOntoUMLArchive.g:1926:2: ( ( rule__NaryAssociation__Group_5__0 )* )
            // InternalOntoUMLArchive.g:1927:3: ( rule__NaryAssociation__Group_5__0 )*
            {
             before(grammarAccess.getNaryAssociationAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:1928:3: ( rule__NaryAssociation__Group_5__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:1928:4: rule__NaryAssociation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__NaryAssociation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalOntoUMLArchive.g:1938:1: rule__NaryAssociation__Group_3__0 : rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1 ;
    public final void rule__NaryAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1942:1: ( rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1 )
            // InternalOntoUMLArchive.g:1943:2: rule__NaryAssociation__Group_3__0__Impl rule__NaryAssociation__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUMLArchive.g:1950:1: rule__NaryAssociation__Group_3__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1954:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:1955:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:1955:1: ( 'end' )
            // InternalOntoUMLArchive.g:1956:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:1965:1: rule__NaryAssociation__Group_3__1 : rule__NaryAssociation__Group_3__1__Impl ;
    public final void rule__NaryAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1969:1: ( rule__NaryAssociation__Group_3__1__Impl )
            // InternalOntoUMLArchive.g:1970:2: rule__NaryAssociation__Group_3__1__Impl
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
    // InternalOntoUMLArchive.g:1976:1: rule__NaryAssociation__Group_3__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_3_1 ) ) ;
    public final void rule__NaryAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1980:1: ( ( ( rule__NaryAssociation__EndsAssignment_3_1 ) ) )
            // InternalOntoUMLArchive.g:1981:1: ( ( rule__NaryAssociation__EndsAssignment_3_1 ) )
            {
            // InternalOntoUMLArchive.g:1981:1: ( ( rule__NaryAssociation__EndsAssignment_3_1 ) )
            // InternalOntoUMLArchive.g:1982:2: ( rule__NaryAssociation__EndsAssignment_3_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_3_1()); 
            // InternalOntoUMLArchive.g:1983:2: ( rule__NaryAssociation__EndsAssignment_3_1 )
            // InternalOntoUMLArchive.g:1983:3: rule__NaryAssociation__EndsAssignment_3_1
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
    // InternalOntoUMLArchive.g:1992:1: rule__NaryAssociation__Group_4__0 : rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1 ;
    public final void rule__NaryAssociation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:1996:1: ( rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1 )
            // InternalOntoUMLArchive.g:1997:2: rule__NaryAssociation__Group_4__0__Impl rule__NaryAssociation__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUMLArchive.g:2004:1: rule__NaryAssociation__Group_4__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2008:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:2009:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:2009:1: ( 'end' )
            // InternalOntoUMLArchive.g:2010:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2019:1: rule__NaryAssociation__Group_4__1 : rule__NaryAssociation__Group_4__1__Impl ;
    public final void rule__NaryAssociation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2023:1: ( rule__NaryAssociation__Group_4__1__Impl )
            // InternalOntoUMLArchive.g:2024:2: rule__NaryAssociation__Group_4__1__Impl
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
    // InternalOntoUMLArchive.g:2030:1: rule__NaryAssociation__Group_4__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_4_1 ) ) ;
    public final void rule__NaryAssociation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2034:1: ( ( ( rule__NaryAssociation__EndsAssignment_4_1 ) ) )
            // InternalOntoUMLArchive.g:2035:1: ( ( rule__NaryAssociation__EndsAssignment_4_1 ) )
            {
            // InternalOntoUMLArchive.g:2035:1: ( ( rule__NaryAssociation__EndsAssignment_4_1 ) )
            // InternalOntoUMLArchive.g:2036:2: ( rule__NaryAssociation__EndsAssignment_4_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_4_1()); 
            // InternalOntoUMLArchive.g:2037:2: ( rule__NaryAssociation__EndsAssignment_4_1 )
            // InternalOntoUMLArchive.g:2037:3: rule__NaryAssociation__EndsAssignment_4_1
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
    // InternalOntoUMLArchive.g:2046:1: rule__NaryAssociation__Group_5__0 : rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1 ;
    public final void rule__NaryAssociation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2050:1: ( rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1 )
            // InternalOntoUMLArchive.g:2051:2: rule__NaryAssociation__Group_5__0__Impl rule__NaryAssociation__Group_5__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUMLArchive.g:2058:1: rule__NaryAssociation__Group_5__0__Impl : ( 'end' ) ;
    public final void rule__NaryAssociation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2062:1: ( ( 'end' ) )
            // InternalOntoUMLArchive.g:2063:1: ( 'end' )
            {
            // InternalOntoUMLArchive.g:2063:1: ( 'end' )
            // InternalOntoUMLArchive.g:2064:2: 'end'
            {
             before(grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2073:1: rule__NaryAssociation__Group_5__1 : rule__NaryAssociation__Group_5__1__Impl ;
    public final void rule__NaryAssociation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2077:1: ( rule__NaryAssociation__Group_5__1__Impl )
            // InternalOntoUMLArchive.g:2078:2: rule__NaryAssociation__Group_5__1__Impl
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
    // InternalOntoUMLArchive.g:2084:1: rule__NaryAssociation__Group_5__1__Impl : ( ( rule__NaryAssociation__EndsAssignment_5_1 ) ) ;
    public final void rule__NaryAssociation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2088:1: ( ( ( rule__NaryAssociation__EndsAssignment_5_1 ) ) )
            // InternalOntoUMLArchive.g:2089:1: ( ( rule__NaryAssociation__EndsAssignment_5_1 ) )
            {
            // InternalOntoUMLArchive.g:2089:1: ( ( rule__NaryAssociation__EndsAssignment_5_1 ) )
            // InternalOntoUMLArchive.g:2090:2: ( rule__NaryAssociation__EndsAssignment_5_1 )
            {
             before(grammarAccess.getNaryAssociationAccess().getEndsAssignment_5_1()); 
            // InternalOntoUMLArchive.g:2091:2: ( rule__NaryAssociation__EndsAssignment_5_1 )
            // InternalOntoUMLArchive.g:2091:3: rule__NaryAssociation__EndsAssignment_5_1
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
    // InternalOntoUMLArchive.g:2100:1: rule__AssociationEnd__Group__0 : rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 ;
    public final void rule__AssociationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2104:1: ( rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1 )
            // InternalOntoUMLArchive.g:2105:2: rule__AssociationEnd__Group__0__Impl rule__AssociationEnd__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalOntoUMLArchive.g:2112:1: rule__AssociationEnd__Group__0__Impl : ( ( rule__AssociationEnd__UnorderedGroup_0 ) ) ;
    public final void rule__AssociationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2116:1: ( ( ( rule__AssociationEnd__UnorderedGroup_0 ) ) )
            // InternalOntoUMLArchive.g:2117:1: ( ( rule__AssociationEnd__UnorderedGroup_0 ) )
            {
            // InternalOntoUMLArchive.g:2117:1: ( ( rule__AssociationEnd__UnorderedGroup_0 ) )
            // InternalOntoUMLArchive.g:2118:2: ( rule__AssociationEnd__UnorderedGroup_0 )
            {
             before(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0()); 
            // InternalOntoUMLArchive.g:2119:2: ( rule__AssociationEnd__UnorderedGroup_0 )
            // InternalOntoUMLArchive.g:2119:3: rule__AssociationEnd__UnorderedGroup_0
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__UnorderedGroup_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0()); 

            }


            }

        }
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
    // InternalOntoUMLArchive.g:2127:1: rule__AssociationEnd__Group__1 : rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 ;
    public final void rule__AssociationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2131:1: ( rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2 )
            // InternalOntoUMLArchive.g:2132:2: rule__AssociationEnd__Group__1__Impl rule__AssociationEnd__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalOntoUMLArchive.g:2139:1: rule__AssociationEnd__Group__1__Impl : ( ( rule__AssociationEnd__NameAssignment_1 )? ) ;
    public final void rule__AssociationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2143:1: ( ( ( rule__AssociationEnd__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2144:1: ( ( rule__AssociationEnd__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2144:1: ( ( rule__AssociationEnd__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2145:2: ( rule__AssociationEnd__NameAssignment_1 )?
            {
             before(grammarAccess.getAssociationEndAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2146:2: ( rule__AssociationEnd__NameAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOntoUMLArchive.g:2146:3: rule__AssociationEnd__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2154:1: rule__AssociationEnd__Group__2 : rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 ;
    public final void rule__AssociationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2158:1: ( rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3 )
            // InternalOntoUMLArchive.g:2159:2: rule__AssociationEnd__Group__2__Impl rule__AssociationEnd__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalOntoUMLArchive.g:2166:1: rule__AssociationEnd__Group__2__Impl : ( ( rule__AssociationEnd__MultiplicityAssignment_2 )? ) ;
    public final void rule__AssociationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2170:1: ( ( ( rule__AssociationEnd__MultiplicityAssignment_2 )? ) )
            // InternalOntoUMLArchive.g:2171:1: ( ( rule__AssociationEnd__MultiplicityAssignment_2 )? )
            {
            // InternalOntoUMLArchive.g:2171:1: ( ( rule__AssociationEnd__MultiplicityAssignment_2 )? )
            // InternalOntoUMLArchive.g:2172:2: ( rule__AssociationEnd__MultiplicityAssignment_2 )?
            {
             before(grammarAccess.getAssociationEndAccess().getMultiplicityAssignment_2()); 
            // InternalOntoUMLArchive.g:2173:2: ( rule__AssociationEnd__MultiplicityAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOntoUMLArchive.g:2173:3: rule__AssociationEnd__MultiplicityAssignment_2
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
    // InternalOntoUMLArchive.g:2181:1: rule__AssociationEnd__Group__3 : rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 ;
    public final void rule__AssociationEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2185:1: ( rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4 )
            // InternalOntoUMLArchive.g:2186:2: rule__AssociationEnd__Group__3__Impl rule__AssociationEnd__Group__4
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
    // InternalOntoUMLArchive.g:2193:1: rule__AssociationEnd__Group__3__Impl : ( ':' ) ;
    public final void rule__AssociationEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2197:1: ( ( ':' ) )
            // InternalOntoUMLArchive.g:2198:1: ( ':' )
            {
            // InternalOntoUMLArchive.g:2198:1: ( ':' )
            // InternalOntoUMLArchive.g:2199:2: ':'
            {
             before(grammarAccess.getAssociationEndAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2208:1: rule__AssociationEnd__Group__4 : rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 ;
    public final void rule__AssociationEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2212:1: ( rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5 )
            // InternalOntoUMLArchive.g:2213:2: rule__AssociationEnd__Group__4__Impl rule__AssociationEnd__Group__5
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
    // InternalOntoUMLArchive.g:2220:1: rule__AssociationEnd__Group__4__Impl : ( ( rule__AssociationEnd__EndTypeAssignment_4 ) ) ;
    public final void rule__AssociationEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2224:1: ( ( ( rule__AssociationEnd__EndTypeAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:2225:1: ( ( rule__AssociationEnd__EndTypeAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:2225:1: ( ( rule__AssociationEnd__EndTypeAssignment_4 ) )
            // InternalOntoUMLArchive.g:2226:2: ( rule__AssociationEnd__EndTypeAssignment_4 )
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeAssignment_4()); 
            // InternalOntoUMLArchive.g:2227:2: ( rule__AssociationEnd__EndTypeAssignment_4 )
            // InternalOntoUMLArchive.g:2227:3: rule__AssociationEnd__EndTypeAssignment_4
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
    // InternalOntoUMLArchive.g:2235:1: rule__AssociationEnd__Group__5 : rule__AssociationEnd__Group__5__Impl ;
    public final void rule__AssociationEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2239:1: ( rule__AssociationEnd__Group__5__Impl )
            // InternalOntoUMLArchive.g:2240:2: rule__AssociationEnd__Group__5__Impl
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
    // InternalOntoUMLArchive.g:2246:1: rule__AssociationEnd__Group__5__Impl : ( ( rule__AssociationEnd__Group_5__0 )? ) ;
    public final void rule__AssociationEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2250:1: ( ( ( rule__AssociationEnd__Group_5__0 )? ) )
            // InternalOntoUMLArchive.g:2251:1: ( ( rule__AssociationEnd__Group_5__0 )? )
            {
            // InternalOntoUMLArchive.g:2251:1: ( ( rule__AssociationEnd__Group_5__0 )? )
            // InternalOntoUMLArchive.g:2252:2: ( rule__AssociationEnd__Group_5__0 )?
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_5()); 
            // InternalOntoUMLArchive.g:2253:2: ( rule__AssociationEnd__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOntoUMLArchive.g:2253:3: rule__AssociationEnd__Group_5__0
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
    // InternalOntoUMLArchive.g:2262:1: rule__AssociationEnd__Group_5__0 : rule__AssociationEnd__Group_5__0__Impl rule__AssociationEnd__Group_5__1 ;
    public final void rule__AssociationEnd__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2266:1: ( rule__AssociationEnd__Group_5__0__Impl rule__AssociationEnd__Group_5__1 )
            // InternalOntoUMLArchive.g:2267:2: rule__AssociationEnd__Group_5__0__Impl rule__AssociationEnd__Group_5__1
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
    // InternalOntoUMLArchive.g:2274:1: rule__AssociationEnd__Group_5__0__Impl : ( '{' ) ;
    public final void rule__AssociationEnd__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2278:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:2279:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:2279:1: ( '{' )
            // InternalOntoUMLArchive.g:2280:2: '{'
            {
             before(grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2289:1: rule__AssociationEnd__Group_5__1 : rule__AssociationEnd__Group_5__1__Impl rule__AssociationEnd__Group_5__2 ;
    public final void rule__AssociationEnd__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2293:1: ( rule__AssociationEnd__Group_5__1__Impl rule__AssociationEnd__Group_5__2 )
            // InternalOntoUMLArchive.g:2294:2: rule__AssociationEnd__Group_5__1__Impl rule__AssociationEnd__Group_5__2
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
    // InternalOntoUMLArchive.g:2301:1: rule__AssociationEnd__Group_5__1__Impl : ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) ) ;
    public final void rule__AssociationEnd__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2305:1: ( ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) ) )
            // InternalOntoUMLArchive.g:2306:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) )
            {
            // InternalOntoUMLArchive.g:2306:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_1 ) )
            // InternalOntoUMLArchive.g:2307:2: ( rule__AssociationEnd__ConstraintsAssignment_5_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_5_1()); 
            // InternalOntoUMLArchive.g:2308:2: ( rule__AssociationEnd__ConstraintsAssignment_5_1 )
            // InternalOntoUMLArchive.g:2308:3: rule__AssociationEnd__ConstraintsAssignment_5_1
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
    // InternalOntoUMLArchive.g:2316:1: rule__AssociationEnd__Group_5__2 : rule__AssociationEnd__Group_5__2__Impl rule__AssociationEnd__Group_5__3 ;
    public final void rule__AssociationEnd__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2320:1: ( rule__AssociationEnd__Group_5__2__Impl rule__AssociationEnd__Group_5__3 )
            // InternalOntoUMLArchive.g:2321:2: rule__AssociationEnd__Group_5__2__Impl rule__AssociationEnd__Group_5__3
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
    // InternalOntoUMLArchive.g:2328:1: rule__AssociationEnd__Group_5__2__Impl : ( ( rule__AssociationEnd__Group_5_2__0 )* ) ;
    public final void rule__AssociationEnd__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2332:1: ( ( ( rule__AssociationEnd__Group_5_2__0 )* ) )
            // InternalOntoUMLArchive.g:2333:1: ( ( rule__AssociationEnd__Group_5_2__0 )* )
            {
            // InternalOntoUMLArchive.g:2333:1: ( ( rule__AssociationEnd__Group_5_2__0 )* )
            // InternalOntoUMLArchive.g:2334:2: ( rule__AssociationEnd__Group_5_2__0 )*
            {
             before(grammarAccess.getAssociationEndAccess().getGroup_5_2()); 
            // InternalOntoUMLArchive.g:2335:2: ( rule__AssociationEnd__Group_5_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2335:3: rule__AssociationEnd__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__AssociationEnd__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalOntoUMLArchive.g:2343:1: rule__AssociationEnd__Group_5__3 : rule__AssociationEnd__Group_5__3__Impl ;
    public final void rule__AssociationEnd__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2347:1: ( rule__AssociationEnd__Group_5__3__Impl )
            // InternalOntoUMLArchive.g:2348:2: rule__AssociationEnd__Group_5__3__Impl
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
    // InternalOntoUMLArchive.g:2354:1: rule__AssociationEnd__Group_5__3__Impl : ( '}' ) ;
    public final void rule__AssociationEnd__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2358:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:2359:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:2359:1: ( '}' )
            // InternalOntoUMLArchive.g:2360:2: '}'
            {
             before(grammarAccess.getAssociationEndAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2370:1: rule__AssociationEnd__Group_5_2__0 : rule__AssociationEnd__Group_5_2__0__Impl rule__AssociationEnd__Group_5_2__1 ;
    public final void rule__AssociationEnd__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2374:1: ( rule__AssociationEnd__Group_5_2__0__Impl rule__AssociationEnd__Group_5_2__1 )
            // InternalOntoUMLArchive.g:2375:2: rule__AssociationEnd__Group_5_2__0__Impl rule__AssociationEnd__Group_5_2__1
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
    // InternalOntoUMLArchive.g:2382:1: rule__AssociationEnd__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__AssociationEnd__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2386:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:2387:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:2387:1: ( ',' )
            // InternalOntoUMLArchive.g:2388:2: ','
            {
             before(grammarAccess.getAssociationEndAccess().getCommaKeyword_5_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2397:1: rule__AssociationEnd__Group_5_2__1 : rule__AssociationEnd__Group_5_2__1__Impl ;
    public final void rule__AssociationEnd__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2401:1: ( rule__AssociationEnd__Group_5_2__1__Impl )
            // InternalOntoUMLArchive.g:2402:2: rule__AssociationEnd__Group_5_2__1__Impl
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
    // InternalOntoUMLArchive.g:2408:1: rule__AssociationEnd__Group_5_2__1__Impl : ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) ) ;
    public final void rule__AssociationEnd__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2412:1: ( ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) ) )
            // InternalOntoUMLArchive.g:2413:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) )
            {
            // InternalOntoUMLArchive.g:2413:1: ( ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 ) )
            // InternalOntoUMLArchive.g:2414:2: ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 )
            {
             before(grammarAccess.getAssociationEndAccess().getConstraintsAssignment_5_2_1()); 
            // InternalOntoUMLArchive.g:2415:2: ( rule__AssociationEnd__ConstraintsAssignment_5_2_1 )
            // InternalOntoUMLArchive.g:2415:3: rule__AssociationEnd__ConstraintsAssignment_5_2_1
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
    // InternalOntoUMLArchive.g:2424:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2428:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // InternalOntoUMLArchive.g:2429:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
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
    // InternalOntoUMLArchive.g:2436:1: rule__Multiplicity__Group__0__Impl : ( '[' ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2440:1: ( ( '[' ) )
            // InternalOntoUMLArchive.g:2441:1: ( '[' )
            {
            // InternalOntoUMLArchive.g:2441:1: ( '[' )
            // InternalOntoUMLArchive.g:2442:2: '['
            {
             before(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2451:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2455:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // InternalOntoUMLArchive.g:2456:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
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
    // InternalOntoUMLArchive.g:2463:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__LowerAssignment_1 ) ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2467:1: ( ( ( rule__Multiplicity__LowerAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:2468:1: ( ( rule__Multiplicity__LowerAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:2468:1: ( ( rule__Multiplicity__LowerAssignment_1 ) )
            // InternalOntoUMLArchive.g:2469:2: ( rule__Multiplicity__LowerAssignment_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getLowerAssignment_1()); 
            // InternalOntoUMLArchive.g:2470:2: ( rule__Multiplicity__LowerAssignment_1 )
            // InternalOntoUMLArchive.g:2470:3: rule__Multiplicity__LowerAssignment_1
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
    // InternalOntoUMLArchive.g:2478:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2482:1: ( rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 )
            // InternalOntoUMLArchive.g:2483:2: rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3
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
    // InternalOntoUMLArchive.g:2490:1: rule__Multiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2494:1: ( ( '..' ) )
            // InternalOntoUMLArchive.g:2495:1: ( '..' )
            {
            // InternalOntoUMLArchive.g:2495:1: ( '..' )
            // InternalOntoUMLArchive.g:2496:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2505:1: rule__Multiplicity__Group__3 : rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 ;
    public final void rule__Multiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2509:1: ( rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 )
            // InternalOntoUMLArchive.g:2510:2: rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4
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
    // InternalOntoUMLArchive.g:2517:1: rule__Multiplicity__Group__3__Impl : ( ( rule__Multiplicity__UpperAssignment_3 ) ) ;
    public final void rule__Multiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2521:1: ( ( ( rule__Multiplicity__UpperAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:2522:1: ( ( rule__Multiplicity__UpperAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:2522:1: ( ( rule__Multiplicity__UpperAssignment_3 ) )
            // InternalOntoUMLArchive.g:2523:2: ( rule__Multiplicity__UpperAssignment_3 )
            {
             before(grammarAccess.getMultiplicityAccess().getUpperAssignment_3()); 
            // InternalOntoUMLArchive.g:2524:2: ( rule__Multiplicity__UpperAssignment_3 )
            // InternalOntoUMLArchive.g:2524:3: rule__Multiplicity__UpperAssignment_3
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
    // InternalOntoUMLArchive.g:2532:1: rule__Multiplicity__Group__4 : rule__Multiplicity__Group__4__Impl ;
    public final void rule__Multiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2536:1: ( rule__Multiplicity__Group__4__Impl )
            // InternalOntoUMLArchive.g:2537:2: rule__Multiplicity__Group__4__Impl
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
    // InternalOntoUMLArchive.g:2543:1: rule__Multiplicity__Group__4__Impl : ( ']' ) ;
    public final void rule__Multiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2547:1: ( ( ']' ) )
            // InternalOntoUMLArchive.g:2548:1: ( ']' )
            {
            // InternalOntoUMLArchive.g:2548:1: ( ']' )
            // InternalOntoUMLArchive.g:2549:2: ']'
            {
             before(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2559:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2563:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalOntoUMLArchive.g:2564:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
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
    // InternalOntoUMLArchive.g:2571:1: rule__Generalization__Group__0__Impl : ( 'gen' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2575:1: ( ( 'gen' ) )
            // InternalOntoUMLArchive.g:2576:1: ( 'gen' )
            {
            // InternalOntoUMLArchive.g:2576:1: ( 'gen' )
            // InternalOntoUMLArchive.g:2577:2: 'gen'
            {
             before(grammarAccess.getGeneralizationAccess().getGenKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2586:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2590:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalOntoUMLArchive.g:2591:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
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
    // InternalOntoUMLArchive.g:2598:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__NameAssignment_1 )? ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2602:1: ( ( ( rule__Generalization__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2603:1: ( ( rule__Generalization__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2603:1: ( ( rule__Generalization__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2604:2: ( rule__Generalization__NameAssignment_1 )?
            {
             before(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2605:2: ( rule__Generalization__NameAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOntoUMLArchive.g:2605:3: rule__Generalization__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2613:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2617:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalOntoUMLArchive.g:2618:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
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
    // InternalOntoUMLArchive.g:2625:1: rule__Generalization__Group__2__Impl : ( 'super' ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2629:1: ( ( 'super' ) )
            // InternalOntoUMLArchive.g:2630:1: ( 'super' )
            {
            // InternalOntoUMLArchive.g:2630:1: ( 'super' )
            // InternalOntoUMLArchive.g:2631:2: 'super'
            {
             before(grammarAccess.getGeneralizationAccess().getSuperKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2640:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2644:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalOntoUMLArchive.g:2645:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
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
    // InternalOntoUMLArchive.g:2652:1: rule__Generalization__Group__3__Impl : ( ( rule__Generalization__SuperAssignment_3 ) ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2656:1: ( ( ( rule__Generalization__SuperAssignment_3 ) ) )
            // InternalOntoUMLArchive.g:2657:1: ( ( rule__Generalization__SuperAssignment_3 ) )
            {
            // InternalOntoUMLArchive.g:2657:1: ( ( rule__Generalization__SuperAssignment_3 ) )
            // InternalOntoUMLArchive.g:2658:2: ( rule__Generalization__SuperAssignment_3 )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperAssignment_3()); 
            // InternalOntoUMLArchive.g:2659:2: ( rule__Generalization__SuperAssignment_3 )
            // InternalOntoUMLArchive.g:2659:3: rule__Generalization__SuperAssignment_3
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
    // InternalOntoUMLArchive.g:2667:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2671:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalOntoUMLArchive.g:2672:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
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
    // InternalOntoUMLArchive.g:2679:1: rule__Generalization__Group__4__Impl : ( 'sub' ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2683:1: ( ( 'sub' ) )
            // InternalOntoUMLArchive.g:2684:1: ( 'sub' )
            {
            // InternalOntoUMLArchive.g:2684:1: ( 'sub' )
            // InternalOntoUMLArchive.g:2685:2: 'sub'
            {
             before(grammarAccess.getGeneralizationAccess().getSubKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2694:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2698:1: ( rule__Generalization__Group__5__Impl )
            // InternalOntoUMLArchive.g:2699:2: rule__Generalization__Group__5__Impl
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
    // InternalOntoUMLArchive.g:2705:1: rule__Generalization__Group__5__Impl : ( ( rule__Generalization__SubAssignment_5 ) ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2709:1: ( ( ( rule__Generalization__SubAssignment_5 ) ) )
            // InternalOntoUMLArchive.g:2710:1: ( ( rule__Generalization__SubAssignment_5 ) )
            {
            // InternalOntoUMLArchive.g:2710:1: ( ( rule__Generalization__SubAssignment_5 ) )
            // InternalOntoUMLArchive.g:2711:2: ( rule__Generalization__SubAssignment_5 )
            {
             before(grammarAccess.getGeneralizationAccess().getSubAssignment_5()); 
            // InternalOntoUMLArchive.g:2712:2: ( rule__Generalization__SubAssignment_5 )
            // InternalOntoUMLArchive.g:2712:3: rule__Generalization__SubAssignment_5
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
    // InternalOntoUMLArchive.g:2721:1: rule__DependencyLink__Group__0 : rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1 ;
    public final void rule__DependencyLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2725:1: ( rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1 )
            // InternalOntoUMLArchive.g:2726:2: rule__DependencyLink__Group__0__Impl rule__DependencyLink__Group__1
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
    // InternalOntoUMLArchive.g:2733:1: rule__DependencyLink__Group__0__Impl : ( 'dependency' ) ;
    public final void rule__DependencyLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2737:1: ( ( 'dependency' ) )
            // InternalOntoUMLArchive.g:2738:1: ( 'dependency' )
            {
            // InternalOntoUMLArchive.g:2738:1: ( 'dependency' )
            // InternalOntoUMLArchive.g:2739:2: 'dependency'
            {
             before(grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2748:1: rule__DependencyLink__Group__1 : rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2 ;
    public final void rule__DependencyLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2752:1: ( rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2 )
            // InternalOntoUMLArchive.g:2753:2: rule__DependencyLink__Group__1__Impl rule__DependencyLink__Group__2
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
    // InternalOntoUMLArchive.g:2760:1: rule__DependencyLink__Group__1__Impl : ( ( rule__DependencyLink__NameAssignment_1 )? ) ;
    public final void rule__DependencyLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2764:1: ( ( ( rule__DependencyLink__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2765:1: ( ( rule__DependencyLink__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2765:1: ( ( rule__DependencyLink__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2766:2: ( rule__DependencyLink__NameAssignment_1 )?
            {
             before(grammarAccess.getDependencyLinkAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2767:2: ( rule__DependencyLink__NameAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOntoUMLArchive.g:2767:3: rule__DependencyLink__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2775:1: rule__DependencyLink__Group__2 : rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3 ;
    public final void rule__DependencyLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2779:1: ( rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3 )
            // InternalOntoUMLArchive.g:2780:2: rule__DependencyLink__Group__2__Impl rule__DependencyLink__Group__3
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
    // InternalOntoUMLArchive.g:2787:1: rule__DependencyLink__Group__2__Impl : ( ( rule__DependencyLink__StereotypesAssignment_2 )* ) ;
    public final void rule__DependencyLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2791:1: ( ( ( rule__DependencyLink__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:2792:1: ( ( rule__DependencyLink__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:2792:1: ( ( rule__DependencyLink__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:2793:2: ( rule__DependencyLink__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getDependencyLinkAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:2794:2: ( rule__DependencyLink__StereotypesAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STEREOTYPE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2794:3: rule__DependencyLink__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DependencyLink__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalOntoUMLArchive.g:2802:1: rule__DependencyLink__Group__3 : rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4 ;
    public final void rule__DependencyLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2806:1: ( rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4 )
            // InternalOntoUMLArchive.g:2807:2: rule__DependencyLink__Group__3__Impl rule__DependencyLink__Group__4
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
    // InternalOntoUMLArchive.g:2814:1: rule__DependencyLink__Group__3__Impl : ( 'from' ) ;
    public final void rule__DependencyLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2818:1: ( ( 'from' ) )
            // InternalOntoUMLArchive.g:2819:1: ( 'from' )
            {
            // InternalOntoUMLArchive.g:2819:1: ( 'from' )
            // InternalOntoUMLArchive.g:2820:2: 'from'
            {
             before(grammarAccess.getDependencyLinkAccess().getFromKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2829:1: rule__DependencyLink__Group__4 : rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5 ;
    public final void rule__DependencyLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2833:1: ( rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5 )
            // InternalOntoUMLArchive.g:2834:2: rule__DependencyLink__Group__4__Impl rule__DependencyLink__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUMLArchive.g:2841:1: rule__DependencyLink__Group__4__Impl : ( ( rule__DependencyLink__FromAssignment_4 ) ) ;
    public final void rule__DependencyLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2845:1: ( ( ( rule__DependencyLink__FromAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:2846:1: ( ( rule__DependencyLink__FromAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:2846:1: ( ( rule__DependencyLink__FromAssignment_4 ) )
            // InternalOntoUMLArchive.g:2847:2: ( rule__DependencyLink__FromAssignment_4 )
            {
             before(grammarAccess.getDependencyLinkAccess().getFromAssignment_4()); 
            // InternalOntoUMLArchive.g:2848:2: ( rule__DependencyLink__FromAssignment_4 )
            // InternalOntoUMLArchive.g:2848:3: rule__DependencyLink__FromAssignment_4
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
    // InternalOntoUMLArchive.g:2856:1: rule__DependencyLink__Group__5 : rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6 ;
    public final void rule__DependencyLink__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2860:1: ( rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6 )
            // InternalOntoUMLArchive.g:2861:2: rule__DependencyLink__Group__5__Impl rule__DependencyLink__Group__6
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
    // InternalOntoUMLArchive.g:2868:1: rule__DependencyLink__Group__5__Impl : ( 'to' ) ;
    public final void rule__DependencyLink__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2872:1: ( ( 'to' ) )
            // InternalOntoUMLArchive.g:2873:1: ( 'to' )
            {
            // InternalOntoUMLArchive.g:2873:1: ( 'to' )
            // InternalOntoUMLArchive.g:2874:2: 'to'
            {
             before(grammarAccess.getDependencyLinkAccess().getToKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2883:1: rule__DependencyLink__Group__6 : rule__DependencyLink__Group__6__Impl ;
    public final void rule__DependencyLink__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2887:1: ( rule__DependencyLink__Group__6__Impl )
            // InternalOntoUMLArchive.g:2888:2: rule__DependencyLink__Group__6__Impl
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
    // InternalOntoUMLArchive.g:2894:1: rule__DependencyLink__Group__6__Impl : ( ( rule__DependencyLink__ToAssignment_6 ) ) ;
    public final void rule__DependencyLink__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2898:1: ( ( ( rule__DependencyLink__ToAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:2899:1: ( ( rule__DependencyLink__ToAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:2899:1: ( ( rule__DependencyLink__ToAssignment_6 ) )
            // InternalOntoUMLArchive.g:2900:2: ( rule__DependencyLink__ToAssignment_6 )
            {
             before(grammarAccess.getDependencyLinkAccess().getToAssignment_6()); 
            // InternalOntoUMLArchive.g:2901:2: ( rule__DependencyLink__ToAssignment_6 )
            // InternalOntoUMLArchive.g:2901:3: rule__DependencyLink__ToAssignment_6
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
    // InternalOntoUMLArchive.g:2910:1: rule__Derivation__Group__0 : rule__Derivation__Group__0__Impl rule__Derivation__Group__1 ;
    public final void rule__Derivation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2914:1: ( rule__Derivation__Group__0__Impl rule__Derivation__Group__1 )
            // InternalOntoUMLArchive.g:2915:2: rule__Derivation__Group__0__Impl rule__Derivation__Group__1
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
    // InternalOntoUMLArchive.g:2922:1: rule__Derivation__Group__0__Impl : ( 'derivation' ) ;
    public final void rule__Derivation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2926:1: ( ( 'derivation' ) )
            // InternalOntoUMLArchive.g:2927:1: ( 'derivation' )
            {
            // InternalOntoUMLArchive.g:2927:1: ( 'derivation' )
            // InternalOntoUMLArchive.g:2928:2: 'derivation'
            {
             before(grammarAccess.getDerivationAccess().getDerivationKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:2937:1: rule__Derivation__Group__1 : rule__Derivation__Group__1__Impl rule__Derivation__Group__2 ;
    public final void rule__Derivation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2941:1: ( rule__Derivation__Group__1__Impl rule__Derivation__Group__2 )
            // InternalOntoUMLArchive.g:2942:2: rule__Derivation__Group__1__Impl rule__Derivation__Group__2
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
    // InternalOntoUMLArchive.g:2949:1: rule__Derivation__Group__1__Impl : ( ( rule__Derivation__NameAssignment_1 )? ) ;
    public final void rule__Derivation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2953:1: ( ( ( rule__Derivation__NameAssignment_1 )? ) )
            // InternalOntoUMLArchive.g:2954:1: ( ( rule__Derivation__NameAssignment_1 )? )
            {
            // InternalOntoUMLArchive.g:2954:1: ( ( rule__Derivation__NameAssignment_1 )? )
            // InternalOntoUMLArchive.g:2955:2: ( rule__Derivation__NameAssignment_1 )?
            {
             before(grammarAccess.getDerivationAccess().getNameAssignment_1()); 
            // InternalOntoUMLArchive.g:2956:2: ( rule__Derivation__NameAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOntoUMLArchive.g:2956:3: rule__Derivation__NameAssignment_1
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
    // InternalOntoUMLArchive.g:2964:1: rule__Derivation__Group__2 : rule__Derivation__Group__2__Impl rule__Derivation__Group__3 ;
    public final void rule__Derivation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2968:1: ( rule__Derivation__Group__2__Impl rule__Derivation__Group__3 )
            // InternalOntoUMLArchive.g:2969:2: rule__Derivation__Group__2__Impl rule__Derivation__Group__3
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
    // InternalOntoUMLArchive.g:2976:1: rule__Derivation__Group__2__Impl : ( ( rule__Derivation__StereotypesAssignment_2 )* ) ;
    public final void rule__Derivation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2980:1: ( ( ( rule__Derivation__StereotypesAssignment_2 )* ) )
            // InternalOntoUMLArchive.g:2981:1: ( ( rule__Derivation__StereotypesAssignment_2 )* )
            {
            // InternalOntoUMLArchive.g:2981:1: ( ( rule__Derivation__StereotypesAssignment_2 )* )
            // InternalOntoUMLArchive.g:2982:2: ( rule__Derivation__StereotypesAssignment_2 )*
            {
             before(grammarAccess.getDerivationAccess().getStereotypesAssignment_2()); 
            // InternalOntoUMLArchive.g:2983:2: ( rule__Derivation__StereotypesAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STEREOTYPE_STRING) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:2983:3: rule__Derivation__StereotypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Derivation__StereotypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalOntoUMLArchive.g:2991:1: rule__Derivation__Group__3 : rule__Derivation__Group__3__Impl rule__Derivation__Group__4 ;
    public final void rule__Derivation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:2995:1: ( rule__Derivation__Group__3__Impl rule__Derivation__Group__4 )
            // InternalOntoUMLArchive.g:2996:2: rule__Derivation__Group__3__Impl rule__Derivation__Group__4
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
    // InternalOntoUMLArchive.g:3003:1: rule__Derivation__Group__3__Impl : ( 'class' ) ;
    public final void rule__Derivation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3007:1: ( ( 'class' ) )
            // InternalOntoUMLArchive.g:3008:1: ( 'class' )
            {
            // InternalOntoUMLArchive.g:3008:1: ( 'class' )
            // InternalOntoUMLArchive.g:3009:2: 'class'
            {
             before(grammarAccess.getDerivationAccess().getClassKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3018:1: rule__Derivation__Group__4 : rule__Derivation__Group__4__Impl rule__Derivation__Group__5 ;
    public final void rule__Derivation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3022:1: ( rule__Derivation__Group__4__Impl rule__Derivation__Group__5 )
            // InternalOntoUMLArchive.g:3023:2: rule__Derivation__Group__4__Impl rule__Derivation__Group__5
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
    // InternalOntoUMLArchive.g:3030:1: rule__Derivation__Group__4__Impl : ( ( rule__Derivation__ClassAssignment_4 ) ) ;
    public final void rule__Derivation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3034:1: ( ( ( rule__Derivation__ClassAssignment_4 ) ) )
            // InternalOntoUMLArchive.g:3035:1: ( ( rule__Derivation__ClassAssignment_4 ) )
            {
            // InternalOntoUMLArchive.g:3035:1: ( ( rule__Derivation__ClassAssignment_4 ) )
            // InternalOntoUMLArchive.g:3036:2: ( rule__Derivation__ClassAssignment_4 )
            {
             before(grammarAccess.getDerivationAccess().getClassAssignment_4()); 
            // InternalOntoUMLArchive.g:3037:2: ( rule__Derivation__ClassAssignment_4 )
            // InternalOntoUMLArchive.g:3037:3: rule__Derivation__ClassAssignment_4
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
    // InternalOntoUMLArchive.g:3045:1: rule__Derivation__Group__5 : rule__Derivation__Group__5__Impl rule__Derivation__Group__6 ;
    public final void rule__Derivation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3049:1: ( rule__Derivation__Group__5__Impl rule__Derivation__Group__6 )
            // InternalOntoUMLArchive.g:3050:2: rule__Derivation__Group__5__Impl rule__Derivation__Group__6
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
    // InternalOntoUMLArchive.g:3057:1: rule__Derivation__Group__5__Impl : ( 'relation' ) ;
    public final void rule__Derivation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3061:1: ( ( 'relation' ) )
            // InternalOntoUMLArchive.g:3062:1: ( 'relation' )
            {
            // InternalOntoUMLArchive.g:3062:1: ( 'relation' )
            // InternalOntoUMLArchive.g:3063:2: 'relation'
            {
             before(grammarAccess.getDerivationAccess().getRelationKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3072:1: rule__Derivation__Group__6 : rule__Derivation__Group__6__Impl ;
    public final void rule__Derivation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3076:1: ( rule__Derivation__Group__6__Impl )
            // InternalOntoUMLArchive.g:3077:2: rule__Derivation__Group__6__Impl
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
    // InternalOntoUMLArchive.g:3083:1: rule__Derivation__Group__6__Impl : ( ( rule__Derivation__PartAssignment_6 ) ) ;
    public final void rule__Derivation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3087:1: ( ( ( rule__Derivation__PartAssignment_6 ) ) )
            // InternalOntoUMLArchive.g:3088:1: ( ( rule__Derivation__PartAssignment_6 ) )
            {
            // InternalOntoUMLArchive.g:3088:1: ( ( rule__Derivation__PartAssignment_6 ) )
            // InternalOntoUMLArchive.g:3089:2: ( rule__Derivation__PartAssignment_6 )
            {
             before(grammarAccess.getDerivationAccess().getPartAssignment_6()); 
            // InternalOntoUMLArchive.g:3090:2: ( rule__Derivation__PartAssignment_6 )
            // InternalOntoUMLArchive.g:3090:3: rule__Derivation__PartAssignment_6
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
    // InternalOntoUMLArchive.g:3099:1: rule__ClassDerivationEnd__Group__0 : rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1 ;
    public final void rule__ClassDerivationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3103:1: ( rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1 )
            // InternalOntoUMLArchive.g:3104:2: rule__ClassDerivationEnd__Group__0__Impl rule__ClassDerivationEnd__Group__1
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
    // InternalOntoUMLArchive.g:3111:1: rule__ClassDerivationEnd__Group__0__Impl : ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )? ) ;
    public final void rule__ClassDerivationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3115:1: ( ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:3116:1: ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:3116:1: ( ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )? )
            // InternalOntoUMLArchive.g:3117:2: ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )?
            {
             before(grammarAccess.getClassDerivationEndAccess().getMultiplicityAssignment_0()); 
            // InternalOntoUMLArchive.g:3118:2: ( rule__ClassDerivationEnd__MultiplicityAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOntoUMLArchive.g:3118:3: rule__ClassDerivationEnd__MultiplicityAssignment_0
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
    // InternalOntoUMLArchive.g:3126:1: rule__ClassDerivationEnd__Group__1 : rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2 ;
    public final void rule__ClassDerivationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3130:1: ( rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2 )
            // InternalOntoUMLArchive.g:3131:2: rule__ClassDerivationEnd__Group__1__Impl rule__ClassDerivationEnd__Group__2
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
    // InternalOntoUMLArchive.g:3138:1: rule__ClassDerivationEnd__Group__1__Impl : ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3142:1: ( ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:3143:1: ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:3143:1: ( ( rule__ClassDerivationEnd__EndTypeAssignment_1 ) )
            // InternalOntoUMLArchive.g:3144:2: ( rule__ClassDerivationEnd__EndTypeAssignment_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getEndTypeAssignment_1()); 
            // InternalOntoUMLArchive.g:3145:2: ( rule__ClassDerivationEnd__EndTypeAssignment_1 )
            // InternalOntoUMLArchive.g:3145:3: rule__ClassDerivationEnd__EndTypeAssignment_1
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
    // InternalOntoUMLArchive.g:3153:1: rule__ClassDerivationEnd__Group__2 : rule__ClassDerivationEnd__Group__2__Impl ;
    public final void rule__ClassDerivationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3157:1: ( rule__ClassDerivationEnd__Group__2__Impl )
            // InternalOntoUMLArchive.g:3158:2: rule__ClassDerivationEnd__Group__2__Impl
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
    // InternalOntoUMLArchive.g:3164:1: rule__ClassDerivationEnd__Group__2__Impl : ( ( rule__ClassDerivationEnd__Group_2__0 )? ) ;
    public final void rule__ClassDerivationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3168:1: ( ( ( rule__ClassDerivationEnd__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:3169:1: ( ( rule__ClassDerivationEnd__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:3169:1: ( ( rule__ClassDerivationEnd__Group_2__0 )? )
            // InternalOntoUMLArchive.g:3170:2: ( rule__ClassDerivationEnd__Group_2__0 )?
            {
             before(grammarAccess.getClassDerivationEndAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:3171:2: ( rule__ClassDerivationEnd__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOntoUMLArchive.g:3171:3: rule__ClassDerivationEnd__Group_2__0
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
    // InternalOntoUMLArchive.g:3180:1: rule__ClassDerivationEnd__Group_2__0 : rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1 ;
    public final void rule__ClassDerivationEnd__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3184:1: ( rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1 )
            // InternalOntoUMLArchive.g:3185:2: rule__ClassDerivationEnd__Group_2__0__Impl rule__ClassDerivationEnd__Group_2__1
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
    // InternalOntoUMLArchive.g:3192:1: rule__ClassDerivationEnd__Group_2__0__Impl : ( '{' ) ;
    public final void rule__ClassDerivationEnd__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3196:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:3197:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:3197:1: ( '{' )
            // InternalOntoUMLArchive.g:3198:2: '{'
            {
             before(grammarAccess.getClassDerivationEndAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3207:1: rule__ClassDerivationEnd__Group_2__1 : rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2 ;
    public final void rule__ClassDerivationEnd__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3211:1: ( rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2 )
            // InternalOntoUMLArchive.g:3212:2: rule__ClassDerivationEnd__Group_2__1__Impl rule__ClassDerivationEnd__Group_2__2
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
    // InternalOntoUMLArchive.g:3219:1: rule__ClassDerivationEnd__Group_2__1__Impl : ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3223:1: ( ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) ) )
            // InternalOntoUMLArchive.g:3224:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) )
            {
            // InternalOntoUMLArchive.g:3224:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 ) )
            // InternalOntoUMLArchive.g:3225:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getConstraintsAssignment_2_1()); 
            // InternalOntoUMLArchive.g:3226:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_1 )
            // InternalOntoUMLArchive.g:3226:3: rule__ClassDerivationEnd__ConstraintsAssignment_2_1
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
    // InternalOntoUMLArchive.g:3234:1: rule__ClassDerivationEnd__Group_2__2 : rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3 ;
    public final void rule__ClassDerivationEnd__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3238:1: ( rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3 )
            // InternalOntoUMLArchive.g:3239:2: rule__ClassDerivationEnd__Group_2__2__Impl rule__ClassDerivationEnd__Group_2__3
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
    // InternalOntoUMLArchive.g:3246:1: rule__ClassDerivationEnd__Group_2__2__Impl : ( ( rule__ClassDerivationEnd__Group_2_2__0 )* ) ;
    public final void rule__ClassDerivationEnd__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3250:1: ( ( ( rule__ClassDerivationEnd__Group_2_2__0 )* ) )
            // InternalOntoUMLArchive.g:3251:1: ( ( rule__ClassDerivationEnd__Group_2_2__0 )* )
            {
            // InternalOntoUMLArchive.g:3251:1: ( ( rule__ClassDerivationEnd__Group_2_2__0 )* )
            // InternalOntoUMLArchive.g:3252:2: ( rule__ClassDerivationEnd__Group_2_2__0 )*
            {
             before(grammarAccess.getClassDerivationEndAccess().getGroup_2_2()); 
            // InternalOntoUMLArchive.g:3253:2: ( rule__ClassDerivationEnd__Group_2_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:3253:3: rule__ClassDerivationEnd__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ClassDerivationEnd__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalOntoUMLArchive.g:3261:1: rule__ClassDerivationEnd__Group_2__3 : rule__ClassDerivationEnd__Group_2__3__Impl ;
    public final void rule__ClassDerivationEnd__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3265:1: ( rule__ClassDerivationEnd__Group_2__3__Impl )
            // InternalOntoUMLArchive.g:3266:2: rule__ClassDerivationEnd__Group_2__3__Impl
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
    // InternalOntoUMLArchive.g:3272:1: rule__ClassDerivationEnd__Group_2__3__Impl : ( '}' ) ;
    public final void rule__ClassDerivationEnd__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3276:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:3277:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:3277:1: ( '}' )
            // InternalOntoUMLArchive.g:3278:2: '}'
            {
             before(grammarAccess.getClassDerivationEndAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3288:1: rule__ClassDerivationEnd__Group_2_2__0 : rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1 ;
    public final void rule__ClassDerivationEnd__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3292:1: ( rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1 )
            // InternalOntoUMLArchive.g:3293:2: rule__ClassDerivationEnd__Group_2_2__0__Impl rule__ClassDerivationEnd__Group_2_2__1
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
    // InternalOntoUMLArchive.g:3300:1: rule__ClassDerivationEnd__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ClassDerivationEnd__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3304:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:3305:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:3305:1: ( ',' )
            // InternalOntoUMLArchive.g:3306:2: ','
            {
             before(grammarAccess.getClassDerivationEndAccess().getCommaKeyword_2_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3315:1: rule__ClassDerivationEnd__Group_2_2__1 : rule__ClassDerivationEnd__Group_2_2__1__Impl ;
    public final void rule__ClassDerivationEnd__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3319:1: ( rule__ClassDerivationEnd__Group_2_2__1__Impl )
            // InternalOntoUMLArchive.g:3320:2: rule__ClassDerivationEnd__Group_2_2__1__Impl
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
    // InternalOntoUMLArchive.g:3326:1: rule__ClassDerivationEnd__Group_2_2__1__Impl : ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) ) ;
    public final void rule__ClassDerivationEnd__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3330:1: ( ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) ) )
            // InternalOntoUMLArchive.g:3331:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            {
            // InternalOntoUMLArchive.g:3331:1: ( ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            // InternalOntoUMLArchive.g:3332:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 )
            {
             before(grammarAccess.getClassDerivationEndAccess().getConstraintsAssignment_2_2_1()); 
            // InternalOntoUMLArchive.g:3333:2: ( rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 )
            // InternalOntoUMLArchive.g:3333:3: rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1
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
    // InternalOntoUMLArchive.g:3342:1: rule__RelationDerivationEnd__Group__0 : rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1 ;
    public final void rule__RelationDerivationEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3346:1: ( rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1 )
            // InternalOntoUMLArchive.g:3347:2: rule__RelationDerivationEnd__Group__0__Impl rule__RelationDerivationEnd__Group__1
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
    // InternalOntoUMLArchive.g:3354:1: rule__RelationDerivationEnd__Group__0__Impl : ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )? ) ;
    public final void rule__RelationDerivationEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3358:1: ( ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )? ) )
            // InternalOntoUMLArchive.g:3359:1: ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )? )
            {
            // InternalOntoUMLArchive.g:3359:1: ( ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )? )
            // InternalOntoUMLArchive.g:3360:2: ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )?
            {
             before(grammarAccess.getRelationDerivationEndAccess().getMultiplicityAssignment_0()); 
            // InternalOntoUMLArchive.g:3361:2: ( rule__RelationDerivationEnd__MultiplicityAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOntoUMLArchive.g:3361:3: rule__RelationDerivationEnd__MultiplicityAssignment_0
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
    // InternalOntoUMLArchive.g:3369:1: rule__RelationDerivationEnd__Group__1 : rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2 ;
    public final void rule__RelationDerivationEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3373:1: ( rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2 )
            // InternalOntoUMLArchive.g:3374:2: rule__RelationDerivationEnd__Group__1__Impl rule__RelationDerivationEnd__Group__2
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
    // InternalOntoUMLArchive.g:3381:1: rule__RelationDerivationEnd__Group__1__Impl : ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3385:1: ( ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) ) )
            // InternalOntoUMLArchive.g:3386:1: ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) )
            {
            // InternalOntoUMLArchive.g:3386:1: ( ( rule__RelationDerivationEnd__EndTypeAssignment_1 ) )
            // InternalOntoUMLArchive.g:3387:2: ( rule__RelationDerivationEnd__EndTypeAssignment_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssignment_1()); 
            // InternalOntoUMLArchive.g:3388:2: ( rule__RelationDerivationEnd__EndTypeAssignment_1 )
            // InternalOntoUMLArchive.g:3388:3: rule__RelationDerivationEnd__EndTypeAssignment_1
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
    // InternalOntoUMLArchive.g:3396:1: rule__RelationDerivationEnd__Group__2 : rule__RelationDerivationEnd__Group__2__Impl ;
    public final void rule__RelationDerivationEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3400:1: ( rule__RelationDerivationEnd__Group__2__Impl )
            // InternalOntoUMLArchive.g:3401:2: rule__RelationDerivationEnd__Group__2__Impl
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
    // InternalOntoUMLArchive.g:3407:1: rule__RelationDerivationEnd__Group__2__Impl : ( ( rule__RelationDerivationEnd__Group_2__0 )? ) ;
    public final void rule__RelationDerivationEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3411:1: ( ( ( rule__RelationDerivationEnd__Group_2__0 )? ) )
            // InternalOntoUMLArchive.g:3412:1: ( ( rule__RelationDerivationEnd__Group_2__0 )? )
            {
            // InternalOntoUMLArchive.g:3412:1: ( ( rule__RelationDerivationEnd__Group_2__0 )? )
            // InternalOntoUMLArchive.g:3413:2: ( rule__RelationDerivationEnd__Group_2__0 )?
            {
             before(grammarAccess.getRelationDerivationEndAccess().getGroup_2()); 
            // InternalOntoUMLArchive.g:3414:2: ( rule__RelationDerivationEnd__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOntoUMLArchive.g:3414:3: rule__RelationDerivationEnd__Group_2__0
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
    // InternalOntoUMLArchive.g:3423:1: rule__RelationDerivationEnd__Group_2__0 : rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1 ;
    public final void rule__RelationDerivationEnd__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3427:1: ( rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1 )
            // InternalOntoUMLArchive.g:3428:2: rule__RelationDerivationEnd__Group_2__0__Impl rule__RelationDerivationEnd__Group_2__1
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
    // InternalOntoUMLArchive.g:3435:1: rule__RelationDerivationEnd__Group_2__0__Impl : ( '{' ) ;
    public final void rule__RelationDerivationEnd__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3439:1: ( ( '{' ) )
            // InternalOntoUMLArchive.g:3440:1: ( '{' )
            {
            // InternalOntoUMLArchive.g:3440:1: ( '{' )
            // InternalOntoUMLArchive.g:3441:2: '{'
            {
             before(grammarAccess.getRelationDerivationEndAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3450:1: rule__RelationDerivationEnd__Group_2__1 : rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2 ;
    public final void rule__RelationDerivationEnd__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3454:1: ( rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2 )
            // InternalOntoUMLArchive.g:3455:2: rule__RelationDerivationEnd__Group_2__1__Impl rule__RelationDerivationEnd__Group_2__2
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
    // InternalOntoUMLArchive.g:3462:1: rule__RelationDerivationEnd__Group_2__1__Impl : ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3466:1: ( ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) ) )
            // InternalOntoUMLArchive.g:3467:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) )
            {
            // InternalOntoUMLArchive.g:3467:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 ) )
            // InternalOntoUMLArchive.g:3468:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getConstraintsAssignment_2_1()); 
            // InternalOntoUMLArchive.g:3469:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_1 )
            // InternalOntoUMLArchive.g:3469:3: rule__RelationDerivationEnd__ConstraintsAssignment_2_1
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
    // InternalOntoUMLArchive.g:3477:1: rule__RelationDerivationEnd__Group_2__2 : rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3 ;
    public final void rule__RelationDerivationEnd__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3481:1: ( rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3 )
            // InternalOntoUMLArchive.g:3482:2: rule__RelationDerivationEnd__Group_2__2__Impl rule__RelationDerivationEnd__Group_2__3
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
    // InternalOntoUMLArchive.g:3489:1: rule__RelationDerivationEnd__Group_2__2__Impl : ( ( rule__RelationDerivationEnd__Group_2_2__0 )* ) ;
    public final void rule__RelationDerivationEnd__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3493:1: ( ( ( rule__RelationDerivationEnd__Group_2_2__0 )* ) )
            // InternalOntoUMLArchive.g:3494:1: ( ( rule__RelationDerivationEnd__Group_2_2__0 )* )
            {
            // InternalOntoUMLArchive.g:3494:1: ( ( rule__RelationDerivationEnd__Group_2_2__0 )* )
            // InternalOntoUMLArchive.g:3495:2: ( rule__RelationDerivationEnd__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationDerivationEndAccess().getGroup_2_2()); 
            // InternalOntoUMLArchive.g:3496:2: ( rule__RelationDerivationEnd__Group_2_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==30) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:3496:3: rule__RelationDerivationEnd__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__RelationDerivationEnd__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalOntoUMLArchive.g:3504:1: rule__RelationDerivationEnd__Group_2__3 : rule__RelationDerivationEnd__Group_2__3__Impl ;
    public final void rule__RelationDerivationEnd__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3508:1: ( rule__RelationDerivationEnd__Group_2__3__Impl )
            // InternalOntoUMLArchive.g:3509:2: rule__RelationDerivationEnd__Group_2__3__Impl
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
    // InternalOntoUMLArchive.g:3515:1: rule__RelationDerivationEnd__Group_2__3__Impl : ( '}' ) ;
    public final void rule__RelationDerivationEnd__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3519:1: ( ( '}' ) )
            // InternalOntoUMLArchive.g:3520:1: ( '}' )
            {
            // InternalOntoUMLArchive.g:3520:1: ( '}' )
            // InternalOntoUMLArchive.g:3521:2: '}'
            {
             before(grammarAccess.getRelationDerivationEndAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3531:1: rule__RelationDerivationEnd__Group_2_2__0 : rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1 ;
    public final void rule__RelationDerivationEnd__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3535:1: ( rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1 )
            // InternalOntoUMLArchive.g:3536:2: rule__RelationDerivationEnd__Group_2_2__0__Impl rule__RelationDerivationEnd__Group_2_2__1
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
    // InternalOntoUMLArchive.g:3543:1: rule__RelationDerivationEnd__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__RelationDerivationEnd__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3547:1: ( ( ',' ) )
            // InternalOntoUMLArchive.g:3548:1: ( ',' )
            {
            // InternalOntoUMLArchive.g:3548:1: ( ',' )
            // InternalOntoUMLArchive.g:3549:2: ','
            {
             before(grammarAccess.getRelationDerivationEndAccess().getCommaKeyword_2_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3558:1: rule__RelationDerivationEnd__Group_2_2__1 : rule__RelationDerivationEnd__Group_2_2__1__Impl ;
    public final void rule__RelationDerivationEnd__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3562:1: ( rule__RelationDerivationEnd__Group_2_2__1__Impl )
            // InternalOntoUMLArchive.g:3563:2: rule__RelationDerivationEnd__Group_2_2__1__Impl
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
    // InternalOntoUMLArchive.g:3569:1: rule__RelationDerivationEnd__Group_2_2__1__Impl : ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) ) ;
    public final void rule__RelationDerivationEnd__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3573:1: ( ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) ) )
            // InternalOntoUMLArchive.g:3574:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            {
            // InternalOntoUMLArchive.g:3574:1: ( ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 ) )
            // InternalOntoUMLArchive.g:3575:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getConstraintsAssignment_2_2_1()); 
            // InternalOntoUMLArchive.g:3576:2: ( rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 )
            // InternalOntoUMLArchive.g:3576:3: rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1
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
    // InternalOntoUMLArchive.g:3585:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3589:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoUMLArchive.g:3590:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
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
    // InternalOntoUMLArchive.g:3597:1: rule__GeneralizationSet__Group__0__Impl : ( 'genset' ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3601:1: ( ( 'genset' ) )
            // InternalOntoUMLArchive.g:3602:1: ( 'genset' )
            {
            // InternalOntoUMLArchive.g:3602:1: ( 'genset' )
            // InternalOntoUMLArchive.g:3603:2: 'genset'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3612:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3616:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoUMLArchive.g:3617:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
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
    // InternalOntoUMLArchive.g:3624:1: rule__GeneralizationSet__Group__1__Impl : ( ( rule__GeneralizationSet__UnorderedGroup_1 ) ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3628:1: ( ( ( rule__GeneralizationSet__UnorderedGroup_1 ) ) )
            // InternalOntoUMLArchive.g:3629:1: ( ( rule__GeneralizationSet__UnorderedGroup_1 ) )
            {
            // InternalOntoUMLArchive.g:3629:1: ( ( rule__GeneralizationSet__UnorderedGroup_1 ) )
            // InternalOntoUMLArchive.g:3630:2: ( rule__GeneralizationSet__UnorderedGroup_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1()); 
            // InternalOntoUMLArchive.g:3631:2: ( rule__GeneralizationSet__UnorderedGroup_1 )
            // InternalOntoUMLArchive.g:3631:3: rule__GeneralizationSet__UnorderedGroup_1
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
    // InternalOntoUMLArchive.g:3639:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3643:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoUMLArchive.g:3644:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
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
    // InternalOntoUMLArchive.g:3651:1: rule__GeneralizationSet__Group__2__Impl : ( ( rule__GeneralizationSet__NameAssignment_2 )? ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3655:1: ( ( ( rule__GeneralizationSet__NameAssignment_2 )? ) )
            // InternalOntoUMLArchive.g:3656:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            {
            // InternalOntoUMLArchive.g:3656:1: ( ( rule__GeneralizationSet__NameAssignment_2 )? )
            // InternalOntoUMLArchive.g:3657:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_2()); 
            // InternalOntoUMLArchive.g:3658:2: ( rule__GeneralizationSet__NameAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOntoUMLArchive.g:3658:3: rule__GeneralizationSet__NameAssignment_2
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
    // InternalOntoUMLArchive.g:3666:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3670:1: ( rule__GeneralizationSet__Group__3__Impl )
            // InternalOntoUMLArchive.g:3671:2: rule__GeneralizationSet__Group__3__Impl
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
    // InternalOntoUMLArchive.g:3677:1: rule__GeneralizationSet__Group__3__Impl : ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3681:1: ( ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) ) )
            // InternalOntoUMLArchive.g:3682:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) )
            {
            // InternalOntoUMLArchive.g:3682:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* ) )
            // InternalOntoUMLArchive.g:3683:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) ) ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* )
            {
            // InternalOntoUMLArchive.g:3683:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 ) )
            // InternalOntoUMLArchive.g:3684:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 
            // InternalOntoUMLArchive.g:3685:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )
            // InternalOntoUMLArchive.g:3685:4: rule__GeneralizationSet__GeneralizationsAssignment_3
            {
            pushFollow(FOLLOW_34);
            rule__GeneralizationSet__GeneralizationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 

            }

            // InternalOntoUMLArchive.g:3688:2: ( ( rule__GeneralizationSet__GeneralizationsAssignment_3 )* )
            // InternalOntoUMLArchive.g:3689:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_3()); 
            // InternalOntoUMLArchive.g:3690:3: ( rule__GeneralizationSet__GeneralizationsAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==34) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalOntoUMLArchive.g:3690:4: rule__GeneralizationSet__GeneralizationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__GeneralizationSet__GeneralizationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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


    // $ANTLR start "rule__AssociationEnd__UnorderedGroup_0"
    // InternalOntoUMLArchive.g:3700:1: rule__AssociationEnd__UnorderedGroup_0 : ( rule__AssociationEnd__UnorderedGroup_0__0 )? ;
    public final void rule__AssociationEnd__UnorderedGroup_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0());
        	
        try {
            // InternalOntoUMLArchive.g:3705:1: ( ( rule__AssociationEnd__UnorderedGroup_0__0 )? )
            // InternalOntoUMLArchive.g:3706:2: ( rule__AssociationEnd__UnorderedGroup_0__0 )?
            {
            // InternalOntoUMLArchive.g:3706:2: ( rule__AssociationEnd__UnorderedGroup_0__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 >= 13 && LA42_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 >= 15 && LA42_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 1) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOntoUMLArchive.g:3706:2: rule__AssociationEnd__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__UnorderedGroup_0__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__UnorderedGroup_0"


    // $ANTLR start "rule__AssociationEnd__UnorderedGroup_0__Impl"
    // InternalOntoUMLArchive.g:3714:1: rule__AssociationEnd__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__AssociationEnd__AggregationKindAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__AssociationEnd__NavigabilityAssignment_0_1 ) ) ) ) ) ;
    public final void rule__AssociationEnd__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOntoUMLArchive.g:3719:1: ( ( ({...}? => ( ( ( rule__AssociationEnd__AggregationKindAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__AssociationEnd__NavigabilityAssignment_0_1 ) ) ) ) ) )
            // InternalOntoUMLArchive.g:3720:3: ( ({...}? => ( ( ( rule__AssociationEnd__AggregationKindAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__AssociationEnd__NavigabilityAssignment_0_1 ) ) ) ) )
            {
            // InternalOntoUMLArchive.g:3720:3: ( ({...}? => ( ( ( rule__AssociationEnd__AggregationKindAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__AssociationEnd__NavigabilityAssignment_0_1 ) ) ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 >= 13 && LA43_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 >= 15 && LA43_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 1) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalOntoUMLArchive.g:3721:3: ({...}? => ( ( ( rule__AssociationEnd__AggregationKindAssignment_0_0 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:3721:3: ({...}? => ( ( ( rule__AssociationEnd__AggregationKindAssignment_0_0 ) ) ) )
                    // InternalOntoUMLArchive.g:3722:4: {...}? => ( ( ( rule__AssociationEnd__AggregationKindAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__AssociationEnd__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 0)");
                    }
                    // InternalOntoUMLArchive.g:3722:110: ( ( ( rule__AssociationEnd__AggregationKindAssignment_0_0 ) ) )
                    // InternalOntoUMLArchive.g:3723:5: ( ( rule__AssociationEnd__AggregationKindAssignment_0_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:3729:5: ( ( rule__AssociationEnd__AggregationKindAssignment_0_0 ) )
                    // InternalOntoUMLArchive.g:3730:6: ( rule__AssociationEnd__AggregationKindAssignment_0_0 )
                    {
                     before(grammarAccess.getAssociationEndAccess().getAggregationKindAssignment_0_0()); 
                    // InternalOntoUMLArchive.g:3731:6: ( rule__AssociationEnd__AggregationKindAssignment_0_0 )
                    // InternalOntoUMLArchive.g:3731:7: rule__AssociationEnd__AggregationKindAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__AggregationKindAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationEndAccess().getAggregationKindAssignment_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUMLArchive.g:3736:3: ({...}? => ( ( ( rule__AssociationEnd__NavigabilityAssignment_0_1 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:3736:3: ({...}? => ( ( ( rule__AssociationEnd__NavigabilityAssignment_0_1 ) ) ) )
                    // InternalOntoUMLArchive.g:3737:4: {...}? => ( ( ( rule__AssociationEnd__NavigabilityAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__AssociationEnd__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 1)");
                    }
                    // InternalOntoUMLArchive.g:3737:110: ( ( ( rule__AssociationEnd__NavigabilityAssignment_0_1 ) ) )
                    // InternalOntoUMLArchive.g:3738:5: ( ( rule__AssociationEnd__NavigabilityAssignment_0_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:3744:5: ( ( rule__AssociationEnd__NavigabilityAssignment_0_1 ) )
                    // InternalOntoUMLArchive.g:3745:6: ( rule__AssociationEnd__NavigabilityAssignment_0_1 )
                    {
                     before(grammarAccess.getAssociationEndAccess().getNavigabilityAssignment_0_1()); 
                    // InternalOntoUMLArchive.g:3746:6: ( rule__AssociationEnd__NavigabilityAssignment_0_1 )
                    // InternalOntoUMLArchive.g:3746:7: rule__AssociationEnd__NavigabilityAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__NavigabilityAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssociationEndAccess().getNavigabilityAssignment_0_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__AssociationEnd__UnorderedGroup_0__0"
    // InternalOntoUMLArchive.g:3759:1: rule__AssociationEnd__UnorderedGroup_0__0 : rule__AssociationEnd__UnorderedGroup_0__Impl ( rule__AssociationEnd__UnorderedGroup_0__1 )? ;
    public final void rule__AssociationEnd__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3763:1: ( rule__AssociationEnd__UnorderedGroup_0__Impl ( rule__AssociationEnd__UnorderedGroup_0__1 )? )
            // InternalOntoUMLArchive.g:3764:2: rule__AssociationEnd__UnorderedGroup_0__Impl ( rule__AssociationEnd__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_35);
            rule__AssociationEnd__UnorderedGroup_0__Impl();

            state._fsp--;

            // InternalOntoUMLArchive.g:3765:2: ( rule__AssociationEnd__UnorderedGroup_0__1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 >= 13 && LA44_0 <= 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 >= 15 && LA44_0 <= 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationEndAccess().getUnorderedGroup_0(), 1) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOntoUMLArchive.g:3765:2: rule__AssociationEnd__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssociationEnd__UnorderedGroup_0__1();

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
    // $ANTLR end "rule__AssociationEnd__UnorderedGroup_0__0"


    // $ANTLR start "rule__AssociationEnd__UnorderedGroup_0__1"
    // InternalOntoUMLArchive.g:3771:1: rule__AssociationEnd__UnorderedGroup_0__1 : rule__AssociationEnd__UnorderedGroup_0__Impl ;
    public final void rule__AssociationEnd__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3775:1: ( rule__AssociationEnd__UnorderedGroup_0__Impl )
            // InternalOntoUMLArchive.g:3776:2: rule__AssociationEnd__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssociationEnd__UnorderedGroup_0__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__UnorderedGroup_0__1"


    // $ANTLR start "rule__GeneralizationSet__UnorderedGroup_1"
    // InternalOntoUMLArchive.g:3783:1: rule__GeneralizationSet__UnorderedGroup_1 : ( rule__GeneralizationSet__UnorderedGroup_1__0 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
        	
        try {
            // InternalOntoUMLArchive.g:3788:1: ( ( rule__GeneralizationSet__UnorderedGroup_1__0 )? )
            // InternalOntoUMLArchive.g:3789:2: ( rule__GeneralizationSet__UnorderedGroup_1__0 )?
            {
            // InternalOntoUMLArchive.g:3789:2: ( rule__GeneralizationSet__UnorderedGroup_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOntoUMLArchive.g:3789:2: rule__GeneralizationSet__UnorderedGroup_1__0
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
    // InternalOntoUMLArchive.g:3797:1: rule__GeneralizationSet__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) ) ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalOntoUMLArchive.g:3802:1: ( ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) ) )
            // InternalOntoUMLArchive.g:3803:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) )
            {
            // InternalOntoUMLArchive.g:3803:3: ( ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalOntoUMLArchive.g:3804:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:3804:3: ({...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) ) )
                    // InternalOntoUMLArchive.g:3805:4: {...}? => ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalOntoUMLArchive.g:3805:113: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) ) )
                    // InternalOntoUMLArchive.g:3806:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:3812:5: ( ( rule__GeneralizationSet__IsDisjointAssignment_1_0 ) )
                    // InternalOntoUMLArchive.g:3813:6: ( rule__GeneralizationSet__IsDisjointAssignment_1_0 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_1_0()); 
                    // InternalOntoUMLArchive.g:3814:6: ( rule__GeneralizationSet__IsDisjointAssignment_1_0 )
                    // InternalOntoUMLArchive.g:3814:7: rule__GeneralizationSet__IsDisjointAssignment_1_0
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
                    // InternalOntoUMLArchive.g:3819:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) )
                    {
                    // InternalOntoUMLArchive.g:3819:3: ({...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) ) )
                    // InternalOntoUMLArchive.g:3820:4: {...}? => ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GeneralizationSet__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalOntoUMLArchive.g:3820:113: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) ) )
                    // InternalOntoUMLArchive.g:3821:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalOntoUMLArchive.g:3827:5: ( ( rule__GeneralizationSet__IsCompleteAssignment_1_1 ) )
                    // InternalOntoUMLArchive.g:3828:6: ( rule__GeneralizationSet__IsCompleteAssignment_1_1 )
                    {
                     before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_1_1()); 
                    // InternalOntoUMLArchive.g:3829:6: ( rule__GeneralizationSet__IsCompleteAssignment_1_1 )
                    // InternalOntoUMLArchive.g:3829:7: rule__GeneralizationSet__IsCompleteAssignment_1_1
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
    // InternalOntoUMLArchive.g:3842:1: rule__GeneralizationSet__UnorderedGroup_1__0 : rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )? ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3846:1: ( rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )? )
            // InternalOntoUMLArchive.g:3847:2: rule__GeneralizationSet__UnorderedGroup_1__Impl ( rule__GeneralizationSet__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_36);
            rule__GeneralizationSet__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalOntoUMLArchive.g:3848:2: ( rule__GeneralizationSet__UnorderedGroup_1__1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOntoUMLArchive.g:3848:2: rule__GeneralizationSet__UnorderedGroup_1__1
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
    // InternalOntoUMLArchive.g:3854:1: rule__GeneralizationSet__UnorderedGroup_1__1 : rule__GeneralizationSet__UnorderedGroup_1__Impl ;
    public final void rule__GeneralizationSet__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3858:1: ( rule__GeneralizationSet__UnorderedGroup_1__Impl )
            // InternalOntoUMLArchive.g:3859:2: rule__GeneralizationSet__UnorderedGroup_1__Impl
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
    // InternalOntoUMLArchive.g:3866:1: rule__Model__PublicationTitleAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Model__PublicationTitleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3870:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3871:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3871:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3872:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3881:1: rule__Model__AuthorsAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Model__AuthorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3885:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3886:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3886:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3887:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3896:1: rule__Model__OntologyNameAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Model__OntologyNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3900:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:3901:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:3901:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:3902:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:3911:1: rule__Model__ElementsAssignment_3 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3915:1: ( ( ruleModelElement ) )
            // InternalOntoUMLArchive.g:3916:2: ( ruleModelElement )
            {
            // InternalOntoUMLArchive.g:3916:2: ( ruleModelElement )
            // InternalOntoUMLArchive.g:3917:3: ruleModelElement
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
    // InternalOntoUMLArchive.g:3926:1: rule__Class__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3930:1: ( ( ( 'abstract' ) ) )
            // InternalOntoUMLArchive.g:3931:2: ( ( 'abstract' ) )
            {
            // InternalOntoUMLArchive.g:3931:2: ( ( 'abstract' ) )
            // InternalOntoUMLArchive.g:3932:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalOntoUMLArchive.g:3933:3: ( 'abstract' )
            // InternalOntoUMLArchive.g:3934:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:3945:1: rule__Class__NameAssignment_2 : ( ruleStringOrID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3949:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:3950:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:3950:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:3951:3: ruleStringOrID
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
    // InternalOntoUMLArchive.g:3960:1: rule__Class__StereotypesAssignment_3 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__Class__StereotypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3964:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:3965:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:3965:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:3966:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:3975:1: rule__Class__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3979:1: ( ( ruleAttribute ) )
            // InternalOntoUMLArchive.g:3980:2: ( ruleAttribute )
            {
            // InternalOntoUMLArchive.g:3980:2: ( ruleAttribute )
            // InternalOntoUMLArchive.g:3981:3: ruleAttribute
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
    // InternalOntoUMLArchive.g:3990:1: rule__Attribute__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:3994:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:3995:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:3995:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:3996:3: ruleStringOrID
            {
             before(grammarAccess.getAttributeAccess().getNameStringOrIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameStringOrIDParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__MultiplicityAssignment_2_0"
    // InternalOntoUMLArchive.g:4005:1: rule__Attribute__MultiplicityAssignment_2_0 : ( ruleMultiplicity ) ;
    public final void rule__Attribute__MultiplicityAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4009:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:4010:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:4010:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:4011:3: ruleMultiplicity
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__MultiplicityAssignment_2_0"


    // $ANTLR start "rule__Attribute__AttTypeAssignment_2_2"
    // InternalOntoUMLArchive.g:4020:1: rule__Attribute__AttTypeAssignment_2_2 : ( ( ruleStringOrID ) ) ;
    public final void rule__Attribute__AttTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4024:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4025:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4025:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4026:3: ( ruleStringOrID )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeClassCrossReference_2_2_0()); 
            // InternalOntoUMLArchive.g:4027:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4028:4: ruleStringOrID
            {
             before(grammarAccess.getAttributeAccess().getAttTypeClassStringOrIDParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStringOrID();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttTypeClassStringOrIDParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getAttTypeClassCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttTypeAssignment_2_2"


    // $ANTLR start "rule__DirectedAssociation__NameAssignment_1"
    // InternalOntoUMLArchive.g:4039:1: rule__DirectedAssociation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__DirectedAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4043:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4044:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:4044:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4045:3: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4054:1: rule__DirectedAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__DirectedAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4058:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:4059:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:4059:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:4060:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:4069:1: rule__DirectedAssociation__FromAssignment_4 : ( ruleAssociationEnd ) ;
    public final void rule__DirectedAssociation__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4073:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4074:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4074:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4075:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:4084:1: rule__DirectedAssociation__ToAssignment_6 : ( ruleAssociationEnd ) ;
    public final void rule__DirectedAssociation__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4088:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4089:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4089:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4090:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:4099:1: rule__UndirectedAssociation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__UndirectedAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4103:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4104:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:4104:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4105:3: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4114:1: rule__UndirectedAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__UndirectedAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4118:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:4119:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:4119:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:4120:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:4129:1: rule__UndirectedAssociation__EndAAssignment_4 : ( ruleAssociationEnd ) ;
    public final void rule__UndirectedAssociation__EndAAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4133:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4134:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4134:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4135:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:4144:1: rule__UndirectedAssociation__EndBAssignment_6 : ( ruleAssociationEnd ) ;
    public final void rule__UndirectedAssociation__EndBAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4148:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4149:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4149:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4150:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:4159:1: rule__NaryAssociation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__NaryAssociation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4163:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4164:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:4164:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4165:3: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4174:1: rule__NaryAssociation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__NaryAssociation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4178:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:4179:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:4179:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:4180:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:4189:1: rule__NaryAssociation__EndsAssignment_3_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4193:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4194:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4194:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4195:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:4204:1: rule__NaryAssociation__EndsAssignment_4_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4208:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4209:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4209:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4210:3: ruleAssociationEnd
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
    // InternalOntoUMLArchive.g:4219:1: rule__NaryAssociation__EndsAssignment_5_1 : ( ruleAssociationEnd ) ;
    public final void rule__NaryAssociation__EndsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4223:1: ( ( ruleAssociationEnd ) )
            // InternalOntoUMLArchive.g:4224:2: ( ruleAssociationEnd )
            {
            // InternalOntoUMLArchive.g:4224:2: ( ruleAssociationEnd )
            // InternalOntoUMLArchive.g:4225:3: ruleAssociationEnd
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


    // $ANTLR start "rule__AssociationEnd__AggregationKindAssignment_0_0"
    // InternalOntoUMLArchive.g:4234:1: rule__AssociationEnd__AggregationKindAssignment_0_0 : ( ruleAggregationKindDeclaration ) ;
    public final void rule__AssociationEnd__AggregationKindAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4238:1: ( ( ruleAggregationKindDeclaration ) )
            // InternalOntoUMLArchive.g:4239:2: ( ruleAggregationKindDeclaration )
            {
            // InternalOntoUMLArchive.g:4239:2: ( ruleAggregationKindDeclaration )
            // InternalOntoUMLArchive.g:4240:3: ruleAggregationKindDeclaration
            {
             before(grammarAccess.getAssociationEndAccess().getAggregationKindAggregationKindDeclarationEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregationKindDeclaration();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getAggregationKindAggregationKindDeclarationEnumRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__AggregationKindAssignment_0_0"


    // $ANTLR start "rule__AssociationEnd__NavigabilityAssignment_0_1"
    // InternalOntoUMLArchive.g:4249:1: rule__AssociationEnd__NavigabilityAssignment_0_1 : ( ruleNavigabilityDeclaration ) ;
    public final void rule__AssociationEnd__NavigabilityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4253:1: ( ( ruleNavigabilityDeclaration ) )
            // InternalOntoUMLArchive.g:4254:2: ( ruleNavigabilityDeclaration )
            {
            // InternalOntoUMLArchive.g:4254:2: ( ruleNavigabilityDeclaration )
            // InternalOntoUMLArchive.g:4255:3: ruleNavigabilityDeclaration
            {
             before(grammarAccess.getAssociationEndAccess().getNavigabilityNavigabilityDeclarationEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigabilityDeclaration();

            state._fsp--;

             after(grammarAccess.getAssociationEndAccess().getNavigabilityNavigabilityDeclarationEnumRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationEnd__NavigabilityAssignment_0_1"


    // $ANTLR start "rule__AssociationEnd__NameAssignment_1"
    // InternalOntoUMLArchive.g:4264:1: rule__AssociationEnd__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__AssociationEnd__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4268:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4269:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:4269:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4270:3: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4279:1: rule__AssociationEnd__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__AssociationEnd__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4283:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:4284:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:4284:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:4285:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:4294:1: rule__AssociationEnd__EndTypeAssignment_4 : ( ( ruleStringOrID ) ) ;
    public final void rule__AssociationEnd__EndTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4298:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4299:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4299:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4300:3: ( ruleStringOrID )
            {
             before(grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_4_0()); 
            // InternalOntoUMLArchive.g:4301:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4302:4: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4313:1: rule__AssociationEnd__ConstraintsAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__ConstraintsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4317:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4318:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4318:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4319:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4328:1: rule__AssociationEnd__ConstraintsAssignment_5_2_1 : ( RULE_STRING ) ;
    public final void rule__AssociationEnd__ConstraintsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4332:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4333:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4333:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4334:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4343:1: rule__Multiplicity__LowerAssignment_1 : ( ruleCARDINALITY ) ;
    public final void rule__Multiplicity__LowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4347:1: ( ( ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:4348:2: ( ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:4348:2: ( ruleCARDINALITY )
            // InternalOntoUMLArchive.g:4349:3: ruleCARDINALITY
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
    // InternalOntoUMLArchive.g:4358:1: rule__Multiplicity__UpperAssignment_3 : ( ruleCARDINALITY ) ;
    public final void rule__Multiplicity__UpperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4362:1: ( ( ruleCARDINALITY ) )
            // InternalOntoUMLArchive.g:4363:2: ( ruleCARDINALITY )
            {
            // InternalOntoUMLArchive.g:4363:2: ( ruleCARDINALITY )
            // InternalOntoUMLArchive.g:4364:3: ruleCARDINALITY
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
    // InternalOntoUMLArchive.g:4373:1: rule__Generalization__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Generalization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4377:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4378:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4378:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4379:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4388:1: rule__Generalization__SuperAssignment_3 : ( ( ruleStringOrID ) ) ;
    public final void rule__Generalization__SuperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4392:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4393:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4393:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4394:3: ( ruleStringOrID )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0()); 
            // InternalOntoUMLArchive.g:4395:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4396:4: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4407:1: rule__Generalization__SubAssignment_5 : ( ( ruleStringOrID ) ) ;
    public final void rule__Generalization__SubAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4411:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4412:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4412:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4413:3: ( ruleStringOrID )
            {
             before(grammarAccess.getGeneralizationAccess().getSubClassCrossReference_5_0()); 
            // InternalOntoUMLArchive.g:4414:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4415:4: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4426:1: rule__DependencyLink__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DependencyLink__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4430:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4431:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4431:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4432:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4441:1: rule__DependencyLink__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__DependencyLink__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4445:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:4446:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:4446:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:4447:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:4456:1: rule__DependencyLink__FromAssignment_4 : ( ( ruleStringOrID ) ) ;
    public final void rule__DependencyLink__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4460:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4461:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4461:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4462:3: ( ruleStringOrID )
            {
             before(grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_4_0()); 
            // InternalOntoUMLArchive.g:4463:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4464:4: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4475:1: rule__DependencyLink__ToAssignment_6 : ( ( ruleStringOrID ) ) ;
    public final void rule__DependencyLink__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4479:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4480:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4480:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4481:3: ( ruleStringOrID )
            {
             before(grammarAccess.getDependencyLinkAccess().getToClassCrossReference_6_0()); 
            // InternalOntoUMLArchive.g:4482:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4483:4: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4494:1: rule__Derivation__NameAssignment_1 : ( ruleStringOrID ) ;
    public final void rule__Derivation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4498:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4499:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:4499:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4500:3: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4509:1: rule__Derivation__StereotypesAssignment_2 : ( RULE_STEREOTYPE_STRING ) ;
    public final void rule__Derivation__StereotypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4513:1: ( ( RULE_STEREOTYPE_STRING ) )
            // InternalOntoUMLArchive.g:4514:2: ( RULE_STEREOTYPE_STRING )
            {
            // InternalOntoUMLArchive.g:4514:2: ( RULE_STEREOTYPE_STRING )
            // InternalOntoUMLArchive.g:4515:3: RULE_STEREOTYPE_STRING
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
    // InternalOntoUMLArchive.g:4524:1: rule__Derivation__ClassAssignment_4 : ( ruleClassDerivationEnd ) ;
    public final void rule__Derivation__ClassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4528:1: ( ( ruleClassDerivationEnd ) )
            // InternalOntoUMLArchive.g:4529:2: ( ruleClassDerivationEnd )
            {
            // InternalOntoUMLArchive.g:4529:2: ( ruleClassDerivationEnd )
            // InternalOntoUMLArchive.g:4530:3: ruleClassDerivationEnd
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
    // InternalOntoUMLArchive.g:4539:1: rule__Derivation__PartAssignment_6 : ( ruleRelationDerivationEnd ) ;
    public final void rule__Derivation__PartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4543:1: ( ( ruleRelationDerivationEnd ) )
            // InternalOntoUMLArchive.g:4544:2: ( ruleRelationDerivationEnd )
            {
            // InternalOntoUMLArchive.g:4544:2: ( ruleRelationDerivationEnd )
            // InternalOntoUMLArchive.g:4545:3: ruleRelationDerivationEnd
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
    // InternalOntoUMLArchive.g:4554:1: rule__ClassDerivationEnd__MultiplicityAssignment_0 : ( ruleMultiplicity ) ;
    public final void rule__ClassDerivationEnd__MultiplicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4558:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:4559:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:4559:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:4560:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:4569:1: rule__ClassDerivationEnd__EndTypeAssignment_1 : ( ( ruleStringOrID ) ) ;
    public final void rule__ClassDerivationEnd__EndTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4573:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4574:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4574:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4575:3: ( ruleStringOrID )
            {
             before(grammarAccess.getClassDerivationEndAccess().getEndTypeClassCrossReference_1_0()); 
            // InternalOntoUMLArchive.g:4576:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4577:4: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4588:1: rule__ClassDerivationEnd__ConstraintsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ClassDerivationEnd__ConstraintsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4592:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4593:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4593:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4594:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4603:1: rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__ClassDerivationEnd__ConstraintsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4607:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4608:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4608:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4609:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4618:1: rule__RelationDerivationEnd__MultiplicityAssignment_0 : ( ruleMultiplicity ) ;
    public final void rule__RelationDerivationEnd__MultiplicityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4622:1: ( ( ruleMultiplicity ) )
            // InternalOntoUMLArchive.g:4623:2: ( ruleMultiplicity )
            {
            // InternalOntoUMLArchive.g:4623:2: ( ruleMultiplicity )
            // InternalOntoUMLArchive.g:4624:3: ruleMultiplicity
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
    // InternalOntoUMLArchive.g:4633:1: rule__RelationDerivationEnd__EndTypeAssignment_1 : ( ( ruleStringOrID ) ) ;
    public final void rule__RelationDerivationEnd__EndTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4637:1: ( ( ( ruleStringOrID ) ) )
            // InternalOntoUMLArchive.g:4638:2: ( ( ruleStringOrID ) )
            {
            // InternalOntoUMLArchive.g:4638:2: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4639:3: ( ruleStringOrID )
            {
             before(grammarAccess.getRelationDerivationEndAccess().getEndTypeAssociationCrossReference_1_0()); 
            // InternalOntoUMLArchive.g:4640:3: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4641:4: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4652:1: rule__RelationDerivationEnd__ConstraintsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__RelationDerivationEnd__ConstraintsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4656:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4657:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4657:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4658:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4667:1: rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__RelationDerivationEnd__ConstraintsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4671:1: ( ( RULE_STRING ) )
            // InternalOntoUMLArchive.g:4672:2: ( RULE_STRING )
            {
            // InternalOntoUMLArchive.g:4672:2: ( RULE_STRING )
            // InternalOntoUMLArchive.g:4673:3: RULE_STRING
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
    // InternalOntoUMLArchive.g:4682:1: rule__GeneralizationSet__IsDisjointAssignment_1_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4686:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoUMLArchive.g:4687:2: ( ( 'disjoint' ) )
            {
            // InternalOntoUMLArchive.g:4687:2: ( ( 'disjoint' ) )
            // InternalOntoUMLArchive.g:4688:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 
            // InternalOntoUMLArchive.g:4689:3: ( 'disjoint' )
            // InternalOntoUMLArchive.g:4690:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:4701:1: rule__GeneralizationSet__IsCompleteAssignment_1_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4705:1: ( ( ( 'complete' ) ) )
            // InternalOntoUMLArchive.g:4706:2: ( ( 'complete' ) )
            {
            // InternalOntoUMLArchive.g:4706:2: ( ( 'complete' ) )
            // InternalOntoUMLArchive.g:4707:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 
            // InternalOntoUMLArchive.g:4708:3: ( 'complete' )
            // InternalOntoUMLArchive.g:4709:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOntoUMLArchive.g:4720:1: rule__GeneralizationSet__NameAssignment_2 : ( ruleStringOrID ) ;
    public final void rule__GeneralizationSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4724:1: ( ( ruleStringOrID ) )
            // InternalOntoUMLArchive.g:4725:2: ( ruleStringOrID )
            {
            // InternalOntoUMLArchive.g:4725:2: ( ruleStringOrID )
            // InternalOntoUMLArchive.g:4726:3: ruleStringOrID
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
    // InternalOntoUMLArchive.g:4735:1: rule__GeneralizationSet__GeneralizationsAssignment_3 : ( ruleGeneralization ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUMLArchive.g:4739:1: ( ( ruleGeneralization ) )
            // InternalOntoUMLArchive.g:4740:2: ( ruleGeneralization )
            {
            // InternalOntoUMLArchive.g:4740:2: ( ruleGeneralization )
            // InternalOntoUMLArchive.g:4741:3: ruleGeneralization
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
    static final String dfa_1s = "\73\uffff";
    static final String dfa_2s = "\56\uffff\2\6\11\uffff\1\6\1\uffff";
    static final String dfa_3s = "\1\30\1\5\3\7\1\5\1\uffff\4\5\2\27\1\4\5\5\2\40\2\33\1\4\2\5\2\41\1\35\4\5\2\27\1\4\1\5\1\27\1\5\1\33\4\5\2\40\2\24\1\35\1\4\1\5\1\uffff\2\41\1\35\1\27\1\5\1\24\1\35";
    static final String dfa_4s = "\1\30\4\33\1\37\1\uffff\6\37\1\14\1\6\4\37\2\40\2\34\1\14\1\5\1\37\2\41\1\36\6\37\1\14\1\6\1\27\1\5\1\33\4\37\2\40\2\34\1\36\1\14\1\5\1\uffff\2\41\1\36\1\27\1\5\1\33\1\36";
    static final String dfa_5s = "\6\uffff\1\1\54\uffff\1\2\7\uffff";
    static final String dfa_6s = "\73\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\1\3\1\4\21\uffff\1\6\1\uffff\1\5",
            "\1\4\21\uffff\1\6\1\uffff\1\5",
            "\1\4\21\uffff\1\6\1\uffff\1\5",
            "\1\4\21\uffff\1\6\1\uffff\1\5",
            "\1\13\1\14\6\uffff\1\7\1\10\1\11\1\12\6\uffff\1\16\7\uffff\1\15",
            "",
            "\1\13\1\14\6\uffff\1\17\1\20\1\21\1\22\6\uffff\1\16\7\uffff\1\15",
            "\1\13\1\14\6\uffff\1\17\1\20\1\21\1\22\6\uffff\1\16\7\uffff\1\15",
            "\1\13\1\14\6\uffff\1\17\1\20\1\21\1\22\6\uffff\1\16\7\uffff\1\15",
            "\1\13\1\14\6\uffff\1\17\1\20\1\21\1\22\6\uffff\1\16\7\uffff\1\15",
            "\1\16\7\uffff\1\15",
            "\1\16\7\uffff\1\15",
            "\1\24\7\uffff\1\23",
            "\1\25\1\26",
            "\1\13\1\14\20\uffff\1\16\7\uffff\1\15",
            "\1\13\1\14\20\uffff\1\16\7\uffff\1\15",
            "\1\13\1\14\20\uffff\1\16\7\uffff\1\15",
            "\1\13\1\14\20\uffff\1\16\7\uffff\1\15",
            "\1\27",
            "\1\27",
            "\1\31\1\30",
            "\1\31\1\30",
            "\1\33\7\uffff\1\32",
            "\1\34",
            "\1\41\1\42\6\uffff\1\35\1\36\1\37\1\40\6\uffff\1\44\7\uffff\1\43",
            "\1\45",
            "\1\45",
            "\1\47\1\46",
            "\1\41\1\42\6\uffff\1\50\1\51\1\52\1\53\6\uffff\1\44\7\uffff\1\43",
            "\1\41\1\42\6\uffff\1\50\1\51\1\52\1\53\6\uffff\1\44\7\uffff\1\43",
            "\1\41\1\42\6\uffff\1\50\1\51\1\52\1\53\6\uffff\1\44\7\uffff\1\43",
            "\1\41\1\42\6\uffff\1\50\1\51\1\52\1\53\6\uffff\1\44\7\uffff\1\43",
            "\1\44\7\uffff\1\43",
            "\1\44\7\uffff\1\43",
            "\1\55\7\uffff\1\54",
            "\1\56\1\57",
            "\1\16",
            "\1\60",
            "\1\31",
            "\1\41\1\42\20\uffff\1\44\7\uffff\1\43",
            "\1\41\1\42\20\uffff\1\44\7\uffff\1\43",
            "\1\41\1\42\20\uffff\1\44\7\uffff\1\43",
            "\1\41\1\42\20\uffff\1\44\7\uffff\1\43",
            "\1\61",
            "\1\61",
            "\1\6\6\uffff\1\63\1\62",
            "\1\6\6\uffff\1\63\1\62",
            "\1\47\1\46",
            "\1\65\7\uffff\1\64",
            "\1\66",
            "",
            "\1\67",
            "\1\67",
            "\1\71\1\70",
            "\1\44",
            "\1\72",
            "\1\6\6\uffff\1\63",
            "\1\71\1\70"
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
            return "644:1: rule__Association__Alternatives : ( ( ruleBinaryAssociation ) | ( ruleNaryAssociation ) );";
        }
    }
    static final String dfa_8s = "\7\uffff";
    static final String dfa_9s = "\1\30\1\5\3\7\2\uffff";
    static final String dfa_10s = "\1\30\4\33\2\uffff";
    static final String dfa_11s = "\5\uffff\1\2\1\1";
    static final String dfa_12s = "\7\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2\1\3\1\4\21\uffff\1\6\1\uffff\1\5",
            "\1\4\21\uffff\1\6\1\uffff\1\5",
            "\1\4\21\uffff\1\6\1\uffff\1\5",
            "\1\4\21\uffff\1\6\1\uffff\1\5",
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
            return "665:1: rule__BinaryAssociation__Alternatives : ( ( ruleDirectedAssociation ) | ( ruleUndirectedAssociation ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000364012C0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000036401200002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000020000E0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000080000E0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080800060L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000020000A0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000002000E0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000060L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000062L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C0000000002L});

}
