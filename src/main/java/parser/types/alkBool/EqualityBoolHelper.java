package parser.types.alkBool;

import parser.exceptions.AlkException;
import parser.exceptions.InterpretorException;
import parser.types.alkFloat.AlkFloat;
import parser.types.alkInt.AlkInt;
import parser.types.alkString.AlkString;
import parser.types.AlkValue;

import static parser.exceptions.AlkException.*;
import static parser.exceptions.InterpretorException.ERR_VALUE_TYPE_UNRECOGNIZED;

public class EqualityBoolHelper {

    private Boolean value;

    EqualityBoolHelper(Boolean value)
    {
        this.value = value;
    }

    AlkBool equal(AlkValue operand) throws AlkException, InterpretorException
    {
        if (operand.isDataStructure)
            throw new AlkException(ERR_EQUAL_DATA_STRUCTURE);
        switch(operand.type)
        {
            case "Int": return equal(((AlkInt)operand));
            case "Double": return equal((AlkFloat)operand);
            case "String": return equal((AlkString)operand);
            case "Bool": return equal((AlkBool)operand);
        }
        throw new InterpretorException(ERR_VALUE_TYPE_UNRECOGNIZED);
    }

    private AlkBool equal(AlkInt operand) throws AlkException {
        throw new AlkException(ERR_EQUAL_INT);
    }

    private AlkBool equal(AlkFloat operand) throws AlkException {
        throw new AlkException(ERR_EQUAL_DOUBLE);
    }

    private AlkBool equal(AlkBool operand) throws AlkException {
        return new AlkBool(value == operand.value);
    }

    private AlkBool equal(AlkString operand) throws AlkException {
        throw new AlkException(ERR_EQUAL_STRING);
    }

    AlkValue notequal(AlkValue operand) throws AlkException, InterpretorException
    {
        if (operand.isDataStructure)
            throw new AlkException(ERR_NOTEQUAL_DATA_STRUCTURE);
        switch(operand.type)
        {
            case "Int": return notequal(((AlkInt)operand));
            case "Double": return notequal((AlkFloat)operand);
            case "String": return notequal((AlkString)operand);
            case "Bool": return notequal((AlkBool)operand);
        }
        throw new InterpretorException(ERR_VALUE_TYPE_UNRECOGNIZED);
    }

    private AlkBool notequal(AlkInt operand) throws AlkException {
        throw new AlkException(ERR_NOTEQUAL_INT);
    }

    private AlkBool notequal(AlkFloat operand) throws AlkException {
        throw new AlkException(ERR_NOTEQUAL_DOUBLE);
    }

    private AlkBool notequal(AlkBool operand) throws AlkException {
        return new AlkBool(value != operand.value);
    }

    private AlkBool notequal(AlkString operand) throws AlkException {
        throw new AlkException(ERR_NOTEQUAL_STRING);
    }

}