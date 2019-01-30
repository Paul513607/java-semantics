package impl.visitors.structure;

import grammar.alkParser;
import impl.Pair;
import impl.env.Environment;
import impl.exceptions.AlkException;
import impl.exceptions.InterpretorException;
import impl.types.AlkList.AlkList;
import impl.types.AlkValue;
import impl.types.alkArray.AlkArray;
import impl.types.alkBool.AlkBool;
import impl.types.alkInt.AlkInt;
import impl.visitors.expression.ExpressionVisitor;

import java.math.BigInteger;
import java.util.ArrayList;

import static impl.exceptions.AlkException.ERR_LIMIT;

public class ListVisitor extends StructureVisitor {

    public ListVisitor(Environment env) {
        super(env);
    }

    @Override public AlkValue visitListWithExpressions(alkParser.ListWithExpressionsContext ctx) {
        int size = ctx.expression().size();
        AlkList list = new AlkList();
        ExpressionVisitor expVisitor = new ExpressionVisitor(env);
        for (int i=0; i<size; i++)
            list.push_back((AlkValue) expVisitor.visit(ctx.expression(i)));
        return list;
    }

    @Override public AlkValue visitEmptyList(alkParser.EmptyListContext ctx) {
        return new AlkList();
    }


    @Override public AlkValue visitListWithInterval(alkParser.ListWithIntervalContext ctx) {
        Pair limits = (Pair)visit(ctx.interval());
        AlkList list = new AlkList();
        for (BigInteger i = ((AlkInt) limits.x).value; i.compareTo(((AlkInt) limits.y).value) <= 0; i = i.add(new BigInteger("1")))
            list.push_back(new AlkInt(i));
        return list;
    }


    @Override public AlkValue visitListWithSpec(alkParser.ListWithSpecContext ctx) {
        ArrayList array = (ArrayList) visit(ctx.spec());
        AlkList returnable = new AlkList();
        for (Object value : array)
            returnable.push_back((AlkValue) value);
        return returnable;
    }


}
