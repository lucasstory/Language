import grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CompileDior extends diorBaseListener {
    private static StringBuilder out = new StringBuilder();

    String getCompilerCode() {
        System.out.println(out.toString());
        return out.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFile(diorParser.FileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFile(diorParser.FileContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCode(diorParser.CodeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCode(diorParser.CodeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStatement(diorParser.StatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStatement(diorParser.StatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDeclaration(diorParser.DeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDeclaration(diorParser.DeclarationContext ctx) {
       // System.out.println("push " + ctx.ID().getText() + "\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAssignment(diorParser.AssignmentContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAssignment(diorParser.AssignmentContext ctx) {
        System.out.println("pop " + ctx.ID().getText());
        this.out.append("pop " + ctx.ID().getText()+ "\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpression(diorParser.ExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpression(diorParser.ExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAddExpression(diorParser.AddExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAddExpression(diorParser.AddExpressionContext ctx) {
        System.out.println("add");
        this.out.append("add\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterUnaryExpression(diorParser.UnaryExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitUnaryExpression(diorParser.UnaryExpressionContext ctx) {
        String value = "";
        if (ctx.ID() == null) {
            value = ctx.INT().getText();
        } else {
            value = ctx.ID().getText();
        }
        System.out.println("push " + value);
        this.out.append("push " + value + "\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPrint(diorParser.PrintContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrint(diorParser.PrintContext ctx) {
        System.out.println("print " + ctx.ID().getText());
        this.out.append("print " + ctx.ID().getText() + "\n");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }
}
