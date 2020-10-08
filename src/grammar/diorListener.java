// Generated from C:/Users/Lucas/Documents/GitHub/Language/src/grammar\dior.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link diorParser}.
 */
public interface diorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link diorParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(diorParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(diorParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(diorParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(diorParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(diorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(diorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(diorParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(diorParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(diorParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(diorParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#headloop}.
	 * @param ctx the parse tree
	 */
	void enterHeadloop(diorParser.HeadloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#headloop}.
	 * @param ctx the parse tree
	 */
	void exitHeadloop(diorParser.HeadloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#endloop}.
	 * @param ctx the parse tree
	 */
	void enterEndloop(diorParser.EndloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#endloop}.
	 * @param ctx the parse tree
	 */
	void exitEndloop(diorParser.EndloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(diorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(diorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(diorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(diorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(diorParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(diorParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#conditionalStatements}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatements(diorParser.ConditionalStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#conditionalStatements}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatements(diorParser.ConditionalStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(diorParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(diorParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link diorParser#printOut}.
	 * @param ctx the parse tree
	 */
	void enterPrintOut(diorParser.PrintOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link diorParser#printOut}.
	 * @param ctx the parse tree
	 */
	void exitPrintOut(diorParser.PrintOutContext ctx);
}