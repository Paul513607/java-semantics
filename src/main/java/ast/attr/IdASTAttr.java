package ast.attr;


public class IdASTAttr
extends ASTAttr
{
    private final String text;

    public IdASTAttr(String text)
    {
        this.text = text;
    }

    public String getId()
    {
        return text;
    }
}
