// Generated from C:/Users/lelia/OneDrive/Dokument/GitHub/Language/src/grammar\dior.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link diorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface diorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link diorParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(diorParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(diorParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(diorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(diorParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(diorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(diorParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(diorParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(diorParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#forConditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditions(diorParser.ForConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(diorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(diorParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(diorParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link diorParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(diorParser.PrintContext ctx);
}