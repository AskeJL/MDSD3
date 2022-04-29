/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.External;
import dk.sdu.mmmi.mdsd.math.ExternalUse;
import dk.sdu.mmmi.mdsd.math.LetBinding;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathNumber;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.VarBinding;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MathSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MathGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MathPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MathPackage.DIV:
				sequence_Factor(context, (Div) semanticObject); 
				return; 
			case MathPackage.EXTERNAL:
				sequence_External(context, (External) semanticObject); 
				return; 
			case MathPackage.EXTERNAL_USE:
				sequence_ExternalUse(context, (ExternalUse) semanticObject); 
				return; 
			case MathPackage.LET_BINDING:
				sequence_LetBinding(context, (LetBinding) semanticObject); 
				return; 
			case MathPackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case MathPackage.MATH_NUMBER:
				sequence_Primary(context, (MathNumber) semanticObject); 
				return; 
			case MathPackage.MINUS:
				sequence_Exp(context, (Minus) semanticObject); 
				return; 
			case MathPackage.MULT:
				sequence_Factor(context, (Mult) semanticObject); 
				return; 
			case MathPackage.PARAMETER:
				sequence_Parameter(context, (dk.sdu.mmmi.mdsd.math.Parameter) semanticObject); 
				return; 
			case MathPackage.PLUS:
				sequence_Exp(context, (Plus) semanticObject); 
				return; 
			case MathPackage.VAR_BINDING:
				sequence_VarBinding(context, (VarBinding) semanticObject); 
				return; 
			case MathPackage.VARIABLE_USE:
				sequence_VariableUse(context, (VariableUse) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Exp returns Minus
	 *     Exp.Plus_1_0_0_0 returns Minus
	 *     Exp.Minus_1_0_1_0 returns Minus
	 *     Factor returns Minus
	 *     Factor.Mult_1_0_0_0 returns Minus
	 *     Factor.Div_1_0_1_0 returns Minus
	 *     Primary returns Minus
	 *
	 * Constraint:
	 *     (left=Exp_Minus_1_0_1_0 right=Factor)
	 */
	protected void sequence_Exp(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Plus
	 *     Exp.Plus_1_0_0_0 returns Plus
	 *     Exp.Minus_1_0_1_0 returns Plus
	 *     Factor returns Plus
	 *     Factor.Mult_1_0_0_0 returns Plus
	 *     Factor.Div_1_0_1_0 returns Plus
	 *     Primary returns Plus
	 *
	 * Constraint:
	 *     (left=Exp_Plus_1_0_0_0 right=Factor)
	 */
	protected void sequence_Exp(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExternalUse returns ExternalUse
	 *     Exp returns ExternalUse
	 *     Exp.Plus_1_0_0_0 returns ExternalUse
	 *     Exp.Minus_1_0_1_0 returns ExternalUse
	 *     Factor returns ExternalUse
	 *     Factor.Mult_1_0_0_0 returns ExternalUse
	 *     Factor.Div_1_0_1_0 returns ExternalUse
	 *     Primary returns ExternalUse
	 *
	 * Constraint:
	 *     (id=ID parameters+=Exp? parameters+=Exp*)
	 */
	protected void sequence_ExternalUse(ISerializationContext context, ExternalUse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     External returns External
	 *
	 * Constraint:
	 *     (id=ID parameters+=Parameter? parameters+=Parameter*)
	 */
	protected void sequence_External(ISerializationContext context, External semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Div
	 *     Exp.Plus_1_0_0_0 returns Div
	 *     Exp.Minus_1_0_1_0 returns Div
	 *     Factor returns Div
	 *     Factor.Mult_1_0_0_0 returns Div
	 *     Factor.Div_1_0_1_0 returns Div
	 *     Primary returns Div
	 *
	 * Constraint:
	 *     (left=Factor_Div_1_0_1_0 right=Primary)
	 */
	protected void sequence_Factor(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Mult
	 *     Exp.Plus_1_0_0_0 returns Mult
	 *     Exp.Minus_1_0_1_0 returns Mult
	 *     Factor returns Mult
	 *     Factor.Mult_1_0_0_0 returns Mult
	 *     Factor.Div_1_0_1_0 returns Mult
	 *     Primary returns Mult
	 *
	 * Constraint:
	 *     (left=Factor_Mult_1_0_0_0 right=Primary)
	 */
	protected void sequence_Factor(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns LetBinding
	 *     Exp.Plus_1_0_0_0 returns LetBinding
	 *     Exp.Minus_1_0_1_0 returns LetBinding
	 *     Factor returns LetBinding
	 *     Factor.Mult_1_0_0_0 returns LetBinding
	 *     Factor.Div_1_0_1_0 returns LetBinding
	 *     Primary returns LetBinding
	 *     LetBinding returns LetBinding
	 *     Binding returns LetBinding
	 *
	 * Constraint:
	 *     (name=ID binding=Exp body=Exp)
	 */
	protected void sequence_LetBinding(ISerializationContext context, LetBinding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.BINDING__NAME));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.LET_BINDING__BINDING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.LET_BINDING__BINDING));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.LET_BINDING__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.LET_BINDING__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0(), semanticObject.getBinding());
		feeder.accept(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     (name=ID externals+=External* variables+=VarBinding*)
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     param=ID
	 */
	protected void sequence_Parameter(ISerializationContext context, dk.sdu.mmmi.mdsd.math.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.PARAMETER__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.PARAMETER__PARAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getParamIDTerminalRuleCall_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns MathNumber
	 *     Exp.Plus_1_0_0_0 returns MathNumber
	 *     Exp.Minus_1_0_1_0 returns MathNumber
	 *     Factor returns MathNumber
	 *     Factor.Mult_1_0_0_0 returns MathNumber
	 *     Factor.Div_1_0_1_0 returns MathNumber
	 *     Primary returns MathNumber
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Primary(ISerializationContext context, MathNumber semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.MATH_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.MATH_NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VarBinding returns VarBinding
	 *     Binding returns VarBinding
	 *
	 * Constraint:
	 *     (name=ID expression=Exp)
	 */
	protected void sequence_VarBinding(ISerializationContext context, VarBinding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.BINDING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.BINDING__NAME));
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VAR_BINDING__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VAR_BINDING__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns VariableUse
	 *     Exp.Plus_1_0_0_0 returns VariableUse
	 *     Exp.Minus_1_0_1_0 returns VariableUse
	 *     Factor returns VariableUse
	 *     Factor.Mult_1_0_0_0 returns VariableUse
	 *     Factor.Div_1_0_1_0 returns VariableUse
	 *     Primary returns VariableUse
	 *     VariableUse returns VariableUse
	 *
	 * Constraint:
	 *     ref=[Binding|ID]
	 */
	protected void sequence_VariableUse(ISerializationContext context, VariableUse semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathPackage.Literals.VARIABLE_USE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathPackage.Literals.VARIABLE_USE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableUseAccess().getRefBindingIDTerminalRuleCall_0_1(), semanticObject.eGet(MathPackage.Literals.VARIABLE_USE__REF, false));
		feeder.finish();
	}
	
	
}
