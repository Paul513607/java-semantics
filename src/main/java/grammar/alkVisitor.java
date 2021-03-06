// Generated from ./../src/main/java/grammar/parts/alk.g4 by ANTLR 4.7.1

    package grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link alkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface alkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code StartPoint}
	 * labeled alternative in {@link alkParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartPoint(alkParser.StartPointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementSeq}
	 * labeled alternative in {@link alkParser#statement_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(alkParser.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToFunctionDecl}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToFunctionDecl(alkParser.ToFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(alkParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToChooseStmt}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToChooseStmt(alkParser.ToChooseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Success}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuccess(alkParser.SuccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Failure}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailure(alkParser.FailureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(alkParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(alkParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToBlock}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToBlock(alkParser.ToBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToDirective}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToDirective(alkParser.ToDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToRepeat}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToRepeat(alkParser.ToRepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToWhile}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToWhile(alkParser.ToWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToDoWhile}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToDoWhile(alkParser.ToDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToIf}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToIf(alkParser.ToIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToFor}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToFor(alkParser.ToForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToForEach}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToForEach(alkParser.ToForEachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStmt}
	 * labeled alternative in {@link alkParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(alkParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Include}
	 * labeled alternative in {@link alkParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(alkParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatStructure}
	 * labeled alternative in {@link alkParser#repeat_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStructure(alkParser.RepeatStructureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link alkParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(alkParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChooseStmt}
	 * labeled alternative in {@link alkParser#choose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChooseStmt(alkParser.ChooseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UniformStmt}
	 * labeled alternative in {@link alkParser#choose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniformStmt(alkParser.UniformStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStructure}
	 * labeled alternative in {@link alkParser#while_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStructure(alkParser.WhileStructureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStructure}
	 * labeled alternative in {@link alkParser#do_while_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStructure(alkParser.DoWhileStructureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStructure}
	 * labeled alternative in {@link alkParser#if_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStructure(alkParser.IfStructureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStructure}
	 * labeled alternative in {@link alkParser#for_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStructure(alkParser.ForStructureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForEachStructure}
	 * labeled alternative in {@link alkParser#foreach_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStructure(alkParser.ForEachStructureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link alkParser#function_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(alkParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamDefinition}
	 * labeled alternative in {@link alkParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDefinition(alkParser.ParamDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link alkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(alkParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToConditionalExpr}
	 * labeled alternative in {@link alkParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToConditionalExpr(alkParser.ToConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link alkParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(alkParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link alkParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(alkParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link alkParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(alkParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link alkParser#in_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(alkParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link alkParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(alkParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link alkParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(alkParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetExpression}
	 * labeled alternative in {@link alkParser#set_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpression(alkParser.SetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseOrExpression}
	 * labeled alternative in {@link alkParser#bitwise_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrExpression(alkParser.BitwiseOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseAndExpression}
	 * labeled alternative in {@link alkParser#bitwise_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpression(alkParser.BitwiseAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftExpression}
	 * labeled alternative in {@link alkParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(alkParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link alkParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(alkParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link alkParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(alkParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link alkParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(alkParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link alkParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(alkParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToPostfixExpression}
	 * labeled alternative in {@link alkParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToPostfixExpression(alkParser.ToPostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link alkParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(alkParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorPointID}
	 * labeled alternative in {@link alkParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorPointID(alkParser.FactorPointIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorArray}
	 * labeled alternative in {@link alkParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorArray(alkParser.FactorArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToBaseFactor}
	 * labeled alternative in {@link alkParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToBaseFactor(alkParser.ToBaseFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorPointMethod}
	 * labeled alternative in {@link alkParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorPointMethod(alkParser.FactorPointMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RefNameFactor}
	 * labeled alternative in {@link alkParser#base_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefNameFactor(alkParser.RefNameFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueFactor}
	 * labeled alternative in {@link alkParser#base_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFactor(alkParser.ValueFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParanthesesFactor}
	 * labeled alternative in {@link alkParser#base_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesesFactor(alkParser.ParanthesesFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link alkParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(alkParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntValue}
	 * labeled alternative in {@link alkParser#scalar_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(alkParser.IntValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleValue}
	 * labeled alternative in {@link alkParser#scalar_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleValue(alkParser.DoubleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link alkParser#scalar_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(alkParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link alkParser#scalar_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(alkParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RefFunctionCall}
	 * labeled alternative in {@link alkParser#ref_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefFunctionCall(alkParser.RefFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RefID}
	 * labeled alternative in {@link alkParser#ref_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefID(alkParser.RefIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link alkParser#data_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(alkParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListValue}
	 * labeled alternative in {@link alkParser#data_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValue(alkParser.ListValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetValue}
	 * labeled alternative in {@link alkParser#data_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetValue(alkParser.SetValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructureValue}
	 * labeled alternative in {@link alkParser#data_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureValue(alkParser.StructureValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntervalDefinition}
	 * labeled alternative in {@link alkParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalDefinition(alkParser.IntervalDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterSpecDefinition}
	 * labeled alternative in {@link alkParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterSpecDefinition(alkParser.FilterSpecDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectSpecDefinition}
	 * labeled alternative in {@link alkParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecDefinition(alkParser.SelectSpecDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayWithSpec}
	 * labeled alternative in {@link alkParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayWithSpec(alkParser.ArrayWithSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayWithExpressions}
	 * labeled alternative in {@link alkParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayWithExpressions(alkParser.ArrayWithExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayWithInterval}
	 * labeled alternative in {@link alkParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayWithInterval(alkParser.ArrayWithIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyList}
	 * labeled alternative in {@link alkParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyList(alkParser.EmptyListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListWithSpec}
	 * labeled alternative in {@link alkParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListWithSpec(alkParser.ListWithSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListWithExpressions}
	 * labeled alternative in {@link alkParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListWithExpressions(alkParser.ListWithExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListWithInterval}
	 * labeled alternative in {@link alkParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListWithInterval(alkParser.ListWithIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructureWithComponents}
	 * labeled alternative in {@link alkParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureWithComponents(alkParser.StructureWithComponentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentDefinition}
	 * labeled alternative in {@link alkParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDefinition(alkParser.ComponentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptySet}
	 * labeled alternative in {@link alkParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptySet(alkParser.EmptySetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetWithSpec}
	 * labeled alternative in {@link alkParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetWithSpec(alkParser.SetWithSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetWithExpressions}
	 * labeled alternative in {@link alkParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetWithExpressions(alkParser.SetWithExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetWithInterval}
	 * labeled alternative in {@link alkParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetWithInterval(alkParser.SetWithIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToBuiltinFunction}
	 * labeled alternative in {@link alkParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToBuiltinFunction(alkParser.ToBuiltinFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinedFunctionCall}
	 * labeled alternative in {@link alkParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedFunctionCall(alkParser.DefinedFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinFunction}
	 * labeled alternative in {@link alkParser#builtin_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinFunction(alkParser.BuiltinFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltinMethod}
	 * labeled alternative in {@link alkParser#builtin_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinMethod(alkParser.BuiltinMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link alkParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(alkParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link alkParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(alkParser.Method_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Config}
	 * labeled alternative in {@link alkParser#configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(alkParser.ConfigContext ctx);
}