import grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DiorCompiler extends diorBaseListener {
    private StringBuilder out = new StringBuilder();

    public String getCompilerCode() {
        return out.toString();
    }

    @Override
    public void enterFile(diorParser.FileContext ctx) {
        super.enterFile(ctx);
    }

    @Override
    public void exitFile(diorParser.FileContext ctx) {
        super.exitFile(ctx);
    }

    @Override
    public void enterCode(diorParser.CodeContext ctx) {
        super.enterCode(ctx);
    }

    @Override
    public void exitCode(diorParser.CodeContext ctx) {
        super.exitCode(ctx);
    }

    @Override
    public void enterStatement(diorParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(diorParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterDeclaration(diorParser.DeclarationContext ctx) { }

    @Override
    public void exitDeclaration(diorParser.DeclarationContext ctx) {
        super.exitDeclaration(ctx);
    }

    @Override
    public void enterLoop(diorParser.LoopContext ctx) {}

    @Override
    public void exitLoop(diorParser.LoopContext ctx) {
        System.out.println("goto enterloop1");
        System.out.println("label exitloop1");
    }

    @Override
    public void enterHeadloop(diorParser.HeadloopContext ctx) {
        System.out.println("label enterHeadloop1");
    }

    @Override
    public void exitHeadloop(diorParser.HeadloopContext ctx) {
        System.out.println("lt");
        System.out.println("not");
        System.out.println("if-goto exitloop1");
    }

    @Override
    public void enterEndloop(diorParser.EndloopContext ctx) {}

    @Override
    public void exitEndloop(diorParser.EndloopContext ctx) {}

    @Override
    public void enterAssignment(diorParser.AssignmentContext ctx) {
        super.enterAssignment(ctx);
    }

    @Override
    public void exitAssignment(diorParser.AssignmentContext ctx) {
        System.out.println("pop " + ctx.ID().getText());
        out.append("pop " + ctx.ID().getText() + "\n");
    }

    @Override
    public void enterExpression(diorParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(diorParser.ExpressionContext ctx) { }

    @Override
    public void enterAddExpression(diorParser.AddExpressionContext ctx) {}

    @Override
    public void exitAddExpression(diorParser.AddExpressionContext ctx) {
        System.out.println("add");
        out.append("add" + "\n");
    }

    @Override
    public void enterConditionalStatements(diorParser.ConditionalStatementsContext ctx) {
        super.enterConditionalStatements(ctx);
    }

    @Override
    public void exitConditionalStatements(diorParser.ConditionalStatementsContext ctx) {
        super.exitConditionalStatements(ctx);
    }

    @Override
    public void enterUnaryExpression(diorParser.UnaryExpressionContext ctx) {
        super.enterUnaryExpression(ctx);
    }

    @Override
    public void exitUnaryExpression(diorParser.UnaryExpressionContext ctx) {
        String value = "";

        if (ctx.ID() == null) {
            value = ctx.INT().getText();
        } else {
            value = ctx.ID().getText();
        }

        System.out.println("push " + value);
        out.append("push " + value + "\n");
    }

    @Override
    public void enterPrintOut(diorParser.PrintOutContext ctx) {
        super.enterPrintOut(ctx);
    }

    @Override
    public void exitPrintOut(diorParser.PrintOutContext ctx) {
        System.out.println("print: " + ctx.ID().getText());
        out.append(ctx.ID().getText() + "\n");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
