package com.project.convertedCode.includes.vendor.phpunit.php_token_stream.src;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/php-token-stream/src/Token.php

*/

public class file_Token_php implements RuntimeIncludable {

    public static final file_Token_php instance = new file_Token_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope343 scope = new Scope343();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope343 scope)
            throws IncludeEventException {
        // Conversion Note: class named PHP_Token was here in the source code
        env.addManualClassLoad("PHP_Token");
        // Conversion Note: class named PHP_TokenWithScope was here in the source code
        env.addManualClassLoad("PHP_TokenWithScope");
        // Conversion Note: class named PHP_TokenWithScopeAndVisibility was here in the source code
        env.addManualClassLoad("PHP_TokenWithScopeAndVisibility");
        // Conversion Note: class named PHP_Token_Includes was here in the source code
        env.addManualClassLoad("PHP_Token_Includes");
        // Conversion Note: class named PHP_Token_FUNCTION was here in the source code
        env.addManualClassLoad("PHP_Token_FUNCTION");
        // Conversion Note: class named PHP_Token_INTERFACE was here in the source code
        env.addManualClassLoad("PHP_Token_INTERFACE");
        // Conversion Note: class named PHP_Token_ABSTRACT was here in the source code
        env.addManualClassLoad("PHP_Token_ABSTRACT");
        // Conversion Note: class named PHP_Token_AMPERSAND was here in the source code
        env.addManualClassLoad("PHP_Token_AMPERSAND");
        // Conversion Note: class named PHP_Token_AND_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_AND_EQUAL");
        // Conversion Note: class named PHP_Token_ARRAY was here in the source code
        env.addManualClassLoad("PHP_Token_ARRAY");
        // Conversion Note: class named PHP_Token_ARRAY_CAST was here in the source code
        env.addManualClassLoad("PHP_Token_ARRAY_CAST");
        // Conversion Note: class named PHP_Token_AS was here in the source code
        env.addManualClassLoad("PHP_Token_AS");
        // Conversion Note: class named PHP_Token_AT was here in the source code
        env.addManualClassLoad("PHP_Token_AT");
        // Conversion Note: class named PHP_Token_BACKTICK was here in the source code
        env.addManualClassLoad("PHP_Token_BACKTICK");
        // Conversion Note: class named PHP_Token_BAD_CHARACTER was here in the source code
        env.addManualClassLoad("PHP_Token_BAD_CHARACTER");
        // Conversion Note: class named PHP_Token_BOOLEAN_AND was here in the source code
        env.addManualClassLoad("PHP_Token_BOOLEAN_AND");
        // Conversion Note: class named PHP_Token_BOOLEAN_OR was here in the source code
        env.addManualClassLoad("PHP_Token_BOOLEAN_OR");
        // Conversion Note: class named PHP_Token_BOOL_CAST was here in the source code
        env.addManualClassLoad("PHP_Token_BOOL_CAST");
        // Conversion Note: class named PHP_Token_BREAK was here in the source code
        env.addManualClassLoad("PHP_Token_BREAK");
        // Conversion Note: class named PHP_Token_CARET was here in the source code
        env.addManualClassLoad("PHP_Token_CARET");
        // Conversion Note: class named PHP_Token_CASE was here in the source code
        env.addManualClassLoad("PHP_Token_CASE");
        // Conversion Note: class named PHP_Token_CATCH was here in the source code
        env.addManualClassLoad("PHP_Token_CATCH");
        // Conversion Note: class named PHP_Token_CHARACTER was here in the source code
        env.addManualClassLoad("PHP_Token_CHARACTER");
        // Conversion Note: class named PHP_Token_CLASS was here in the source code
        env.addManualClassLoad("PHP_Token_CLASS");
        // Conversion Note: class named PHP_Token_CLASS_C was here in the source code
        env.addManualClassLoad("PHP_Token_CLASS_C");
        // Conversion Note: class named PHP_Token_CLASS_NAME_CONSTANT was here in the source code
        env.addManualClassLoad("PHP_Token_CLASS_NAME_CONSTANT");
        // Conversion Note: class named PHP_Token_CLONE was here in the source code
        env.addManualClassLoad("PHP_Token_CLONE");
        // Conversion Note: class named PHP_Token_CLOSE_BRACKET was here in the source code
        env.addManualClassLoad("PHP_Token_CLOSE_BRACKET");
        // Conversion Note: class named PHP_Token_CLOSE_CURLY was here in the source code
        env.addManualClassLoad("PHP_Token_CLOSE_CURLY");
        // Conversion Note: class named PHP_Token_CLOSE_SQUARE was here in the source code
        env.addManualClassLoad("PHP_Token_CLOSE_SQUARE");
        // Conversion Note: class named PHP_Token_CLOSE_TAG was here in the source code
        env.addManualClassLoad("PHP_Token_CLOSE_TAG");
        // Conversion Note: class named PHP_Token_COLON was here in the source code
        env.addManualClassLoad("PHP_Token_COLON");
        // Conversion Note: class named PHP_Token_COMMA was here in the source code
        env.addManualClassLoad("PHP_Token_COMMA");
        // Conversion Note: class named PHP_Token_COMMENT was here in the source code
        env.addManualClassLoad("PHP_Token_COMMENT");
        // Conversion Note: class named PHP_Token_CONCAT_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_CONCAT_EQUAL");
        // Conversion Note: class named PHP_Token_CONST was here in the source code
        env.addManualClassLoad("PHP_Token_CONST");
        // Conversion Note: class named PHP_Token_CONSTANT_ENCAPSED_STRING was here in the source
        // code
        env.addManualClassLoad("PHP_Token_CONSTANT_ENCAPSED_STRING");
        // Conversion Note: class named PHP_Token_CONTINUE was here in the source code
        env.addManualClassLoad("PHP_Token_CONTINUE");
        // Conversion Note: class named PHP_Token_CURLY_OPEN was here in the source code
        env.addManualClassLoad("PHP_Token_CURLY_OPEN");
        // Conversion Note: class named PHP_Token_DEC was here in the source code
        env.addManualClassLoad("PHP_Token_DEC");
        // Conversion Note: class named PHP_Token_DECLARE was here in the source code
        env.addManualClassLoad("PHP_Token_DECLARE");
        // Conversion Note: class named PHP_Token_DEFAULT was here in the source code
        env.addManualClassLoad("PHP_Token_DEFAULT");
        // Conversion Note: class named PHP_Token_DIV was here in the source code
        env.addManualClassLoad("PHP_Token_DIV");
        // Conversion Note: class named PHP_Token_DIV_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_DIV_EQUAL");
        // Conversion Note: class named PHP_Token_DNUMBER was here in the source code
        env.addManualClassLoad("PHP_Token_DNUMBER");
        // Conversion Note: class named PHP_Token_DO was here in the source code
        env.addManualClassLoad("PHP_Token_DO");
        // Conversion Note: class named PHP_Token_DOC_COMMENT was here in the source code
        env.addManualClassLoad("PHP_Token_DOC_COMMENT");
        // Conversion Note: class named PHP_Token_DOLLAR was here in the source code
        env.addManualClassLoad("PHP_Token_DOLLAR");
        // Conversion Note: class named PHP_Token_DOLLAR_OPEN_CURLY_BRACES was here in the source
        // code
        env.addManualClassLoad("PHP_Token_DOLLAR_OPEN_CURLY_BRACES");
        // Conversion Note: class named PHP_Token_DOT was here in the source code
        env.addManualClassLoad("PHP_Token_DOT");
        // Conversion Note: class named PHP_Token_DOUBLE_ARROW was here in the source code
        env.addManualClassLoad("PHP_Token_DOUBLE_ARROW");
        // Conversion Note: class named PHP_Token_DOUBLE_CAST was here in the source code
        env.addManualClassLoad("PHP_Token_DOUBLE_CAST");
        // Conversion Note: class named PHP_Token_DOUBLE_COLON was here in the source code
        env.addManualClassLoad("PHP_Token_DOUBLE_COLON");
        // Conversion Note: class named PHP_Token_DOUBLE_QUOTES was here in the source code
        env.addManualClassLoad("PHP_Token_DOUBLE_QUOTES");
        // Conversion Note: class named PHP_Token_ECHO was here in the source code
        env.addManualClassLoad("PHP_Token_ECHO");
        // Conversion Note: class named PHP_Token_ELSE was here in the source code
        env.addManualClassLoad("PHP_Token_ELSE");
        // Conversion Note: class named PHP_Token_ELSEIF was here in the source code
        env.addManualClassLoad("PHP_Token_ELSEIF");
        // Conversion Note: class named PHP_Token_EMPTY was here in the source code
        env.addManualClassLoad("PHP_Token_EMPTY");
        // Conversion Note: class named PHP_Token_ENCAPSED_AND_WHITESPACE was here in the source
        // code
        env.addManualClassLoad("PHP_Token_ENCAPSED_AND_WHITESPACE");
        // Conversion Note: class named PHP_Token_ENDDECLARE was here in the source code
        env.addManualClassLoad("PHP_Token_ENDDECLARE");
        // Conversion Note: class named PHP_Token_ENDFOR was here in the source code
        env.addManualClassLoad("PHP_Token_ENDFOR");
        // Conversion Note: class named PHP_Token_ENDFOREACH was here in the source code
        env.addManualClassLoad("PHP_Token_ENDFOREACH");
        // Conversion Note: class named PHP_Token_ENDIF was here in the source code
        env.addManualClassLoad("PHP_Token_ENDIF");
        // Conversion Note: class named PHP_Token_ENDSWITCH was here in the source code
        env.addManualClassLoad("PHP_Token_ENDSWITCH");
        // Conversion Note: class named PHP_Token_ENDWHILE was here in the source code
        env.addManualClassLoad("PHP_Token_ENDWHILE");
        // Conversion Note: class named PHP_Token_END_HEREDOC was here in the source code
        env.addManualClassLoad("PHP_Token_END_HEREDOC");
        // Conversion Note: class named PHP_Token_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_EQUAL");
        // Conversion Note: class named PHP_Token_EVAL was here in the source code
        env.addManualClassLoad("PHP_Token_EVAL");
        // Conversion Note: class named PHP_Token_EXCLAMATION_MARK was here in the source code
        env.addManualClassLoad("PHP_Token_EXCLAMATION_MARK");
        // Conversion Note: class named PHP_Token_EXIT was here in the source code
        env.addManualClassLoad("PHP_Token_EXIT");
        // Conversion Note: class named PHP_Token_EXTENDS was here in the source code
        env.addManualClassLoad("PHP_Token_EXTENDS");
        // Conversion Note: class named PHP_Token_FILE was here in the source code
        env.addManualClassLoad("PHP_Token_FILE");
        // Conversion Note: class named PHP_Token_FINAL was here in the source code
        env.addManualClassLoad("PHP_Token_FINAL");
        // Conversion Note: class named PHP_Token_FOR was here in the source code
        env.addManualClassLoad("PHP_Token_FOR");
        // Conversion Note: class named PHP_Token_FOREACH was here in the source code
        env.addManualClassLoad("PHP_Token_FOREACH");
        // Conversion Note: class named PHP_Token_FUNC_C was here in the source code
        env.addManualClassLoad("PHP_Token_FUNC_C");
        // Conversion Note: class named PHP_Token_GLOBAL was here in the source code
        env.addManualClassLoad("PHP_Token_GLOBAL");
        // Conversion Note: class named PHP_Token_GT was here in the source code
        env.addManualClassLoad("PHP_Token_GT");
        // Conversion Note: class named PHP_Token_IF was here in the source code
        env.addManualClassLoad("PHP_Token_IF");
        // Conversion Note: class named PHP_Token_IMPLEMENTS was here in the source code
        env.addManualClassLoad("PHP_Token_IMPLEMENTS");
        // Conversion Note: class named PHP_Token_INC was here in the source code
        env.addManualClassLoad("PHP_Token_INC");
        // Conversion Note: class named PHP_Token_INCLUDE was here in the source code
        env.addManualClassLoad("PHP_Token_INCLUDE");
        // Conversion Note: class named PHP_Token_INCLUDE_ONCE was here in the source code
        env.addManualClassLoad("PHP_Token_INCLUDE_ONCE");
        // Conversion Note: class named PHP_Token_INLINE_HTML was here in the source code
        env.addManualClassLoad("PHP_Token_INLINE_HTML");
        // Conversion Note: class named PHP_Token_INSTANCEOF was here in the source code
        env.addManualClassLoad("PHP_Token_INSTANCEOF");
        // Conversion Note: class named PHP_Token_INT_CAST was here in the source code
        env.addManualClassLoad("PHP_Token_INT_CAST");
        // Conversion Note: class named PHP_Token_ISSET was here in the source code
        env.addManualClassLoad("PHP_Token_ISSET");
        // Conversion Note: class named PHP_Token_IS_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_IS_EQUAL");
        // Conversion Note: class named PHP_Token_IS_GREATER_OR_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_IS_GREATER_OR_EQUAL");
        // Conversion Note: class named PHP_Token_IS_IDENTICAL was here in the source code
        env.addManualClassLoad("PHP_Token_IS_IDENTICAL");
        // Conversion Note: class named PHP_Token_IS_NOT_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_IS_NOT_EQUAL");
        // Conversion Note: class named PHP_Token_IS_NOT_IDENTICAL was here in the source code
        env.addManualClassLoad("PHP_Token_IS_NOT_IDENTICAL");
        // Conversion Note: class named PHP_Token_IS_SMALLER_OR_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_IS_SMALLER_OR_EQUAL");
        // Conversion Note: class named PHP_Token_LINE was here in the source code
        env.addManualClassLoad("PHP_Token_LINE");
        // Conversion Note: class named PHP_Token_LIST was here in the source code
        env.addManualClassLoad("PHP_Token_LIST");
        // Conversion Note: class named PHP_Token_LNUMBER was here in the source code
        env.addManualClassLoad("PHP_Token_LNUMBER");
        // Conversion Note: class named PHP_Token_LOGICAL_AND was here in the source code
        env.addManualClassLoad("PHP_Token_LOGICAL_AND");
        // Conversion Note: class named PHP_Token_LOGICAL_OR was here in the source code
        env.addManualClassLoad("PHP_Token_LOGICAL_OR");
        // Conversion Note: class named PHP_Token_LOGICAL_XOR was here in the source code
        env.addManualClassLoad("PHP_Token_LOGICAL_XOR");
        // Conversion Note: class named PHP_Token_LT was here in the source code
        env.addManualClassLoad("PHP_Token_LT");
        // Conversion Note: class named PHP_Token_METHOD_C was here in the source code
        env.addManualClassLoad("PHP_Token_METHOD_C");
        // Conversion Note: class named PHP_Token_MINUS was here in the source code
        env.addManualClassLoad("PHP_Token_MINUS");
        // Conversion Note: class named PHP_Token_MINUS_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_MINUS_EQUAL");
        // Conversion Note: class named PHP_Token_MOD_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_MOD_EQUAL");
        // Conversion Note: class named PHP_Token_MULT was here in the source code
        env.addManualClassLoad("PHP_Token_MULT");
        // Conversion Note: class named PHP_Token_MUL_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_MUL_EQUAL");
        // Conversion Note: class named PHP_Token_NEW was here in the source code
        env.addManualClassLoad("PHP_Token_NEW");
        // Conversion Note: class named PHP_Token_NUM_STRING was here in the source code
        env.addManualClassLoad("PHP_Token_NUM_STRING");
        // Conversion Note: class named PHP_Token_OBJECT_CAST was here in the source code
        env.addManualClassLoad("PHP_Token_OBJECT_CAST");
        // Conversion Note: class named PHP_Token_OBJECT_OPERATOR was here in the source code
        env.addManualClassLoad("PHP_Token_OBJECT_OPERATOR");
        // Conversion Note: class named PHP_Token_OPEN_BRACKET was here in the source code
        env.addManualClassLoad("PHP_Token_OPEN_BRACKET");
        // Conversion Note: class named PHP_Token_OPEN_CURLY was here in the source code
        env.addManualClassLoad("PHP_Token_OPEN_CURLY");
        // Conversion Note: class named PHP_Token_OPEN_SQUARE was here in the source code
        env.addManualClassLoad("PHP_Token_OPEN_SQUARE");
        // Conversion Note: class named PHP_Token_OPEN_TAG was here in the source code
        env.addManualClassLoad("PHP_Token_OPEN_TAG");
        // Conversion Note: class named PHP_Token_OPEN_TAG_WITH_ECHO was here in the source code
        env.addManualClassLoad("PHP_Token_OPEN_TAG_WITH_ECHO");
        // Conversion Note: class named PHP_Token_OR_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_OR_EQUAL");
        // Conversion Note: class named PHP_Token_PAAMAYIM_NEKUDOTAYIM was here in the source code
        env.addManualClassLoad("PHP_Token_PAAMAYIM_NEKUDOTAYIM");
        // Conversion Note: class named PHP_Token_PERCENT was here in the source code
        env.addManualClassLoad("PHP_Token_PERCENT");
        // Conversion Note: class named PHP_Token_PIPE was here in the source code
        env.addManualClassLoad("PHP_Token_PIPE");
        // Conversion Note: class named PHP_Token_PLUS was here in the source code
        env.addManualClassLoad("PHP_Token_PLUS");
        // Conversion Note: class named PHP_Token_PLUS_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_PLUS_EQUAL");
        // Conversion Note: class named PHP_Token_PRINT was here in the source code
        env.addManualClassLoad("PHP_Token_PRINT");
        // Conversion Note: class named PHP_Token_PRIVATE was here in the source code
        env.addManualClassLoad("PHP_Token_PRIVATE");
        // Conversion Note: class named PHP_Token_PROTECTED was here in the source code
        env.addManualClassLoad("PHP_Token_PROTECTED");
        // Conversion Note: class named PHP_Token_PUBLIC was here in the source code
        env.addManualClassLoad("PHP_Token_PUBLIC");
        // Conversion Note: class named PHP_Token_QUESTION_MARK was here in the source code
        env.addManualClassLoad("PHP_Token_QUESTION_MARK");
        // Conversion Note: class named PHP_Token_REQUIRE was here in the source code
        env.addManualClassLoad("PHP_Token_REQUIRE");
        // Conversion Note: class named PHP_Token_REQUIRE_ONCE was here in the source code
        env.addManualClassLoad("PHP_Token_REQUIRE_ONCE");
        // Conversion Note: class named PHP_Token_RETURN was here in the source code
        env.addManualClassLoad("PHP_Token_RETURN");
        // Conversion Note: class named PHP_Token_SEMICOLON was here in the source code
        env.addManualClassLoad("PHP_Token_SEMICOLON");
        // Conversion Note: class named PHP_Token_SL was here in the source code
        env.addManualClassLoad("PHP_Token_SL");
        // Conversion Note: class named PHP_Token_SL_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_SL_EQUAL");
        // Conversion Note: class named PHP_Token_SR was here in the source code
        env.addManualClassLoad("PHP_Token_SR");
        // Conversion Note: class named PHP_Token_SR_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_SR_EQUAL");
        // Conversion Note: class named PHP_Token_START_HEREDOC was here in the source code
        env.addManualClassLoad("PHP_Token_START_HEREDOC");
        // Conversion Note: class named PHP_Token_STATIC was here in the source code
        env.addManualClassLoad("PHP_Token_STATIC");
        // Conversion Note: class named PHP_Token_STRING was here in the source code
        env.addManualClassLoad("PHP_Token_STRING");
        // Conversion Note: class named PHP_Token_STRING_CAST was here in the source code
        env.addManualClassLoad("PHP_Token_STRING_CAST");
        // Conversion Note: class named PHP_Token_STRING_VARNAME was here in the source code
        env.addManualClassLoad("PHP_Token_STRING_VARNAME");
        // Conversion Note: class named PHP_Token_SWITCH was here in the source code
        env.addManualClassLoad("PHP_Token_SWITCH");
        // Conversion Note: class named PHP_Token_THROW was here in the source code
        env.addManualClassLoad("PHP_Token_THROW");
        // Conversion Note: class named PHP_Token_TILDE was here in the source code
        env.addManualClassLoad("PHP_Token_TILDE");
        // Conversion Note: class named PHP_Token_TRY was here in the source code
        env.addManualClassLoad("PHP_Token_TRY");
        // Conversion Note: class named PHP_Token_UNSET was here in the source code
        env.addManualClassLoad("PHP_Token_UNSET");
        // Conversion Note: class named PHP_Token_UNSET_CAST was here in the source code
        env.addManualClassLoad("PHP_Token_UNSET_CAST");
        // Conversion Note: class named PHP_Token_USE was here in the source code
        env.addManualClassLoad("PHP_Token_USE");
        // Conversion Note: class named PHP_Token_USE_FUNCTION was here in the source code
        env.addManualClassLoad("PHP_Token_USE_FUNCTION");
        // Conversion Note: class named PHP_Token_VAR was here in the source code
        env.addManualClassLoad("PHP_Token_VAR");
        // Conversion Note: class named PHP_Token_VARIABLE was here in the source code
        env.addManualClassLoad("PHP_Token_VARIABLE");
        // Conversion Note: class named PHP_Token_WHILE was here in the source code
        env.addManualClassLoad("PHP_Token_WHILE");
        // Conversion Note: class named PHP_Token_WHITESPACE was here in the source code
        env.addManualClassLoad("PHP_Token_WHITESPACE");
        // Conversion Note: class named PHP_Token_XOR_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_XOR_EQUAL");
        // Conversion Note: class named PHP_Token_HALT_COMPILER was here in the source code
        env.addManualClassLoad("PHP_Token_HALT_COMPILER");
        // Conversion Note: class named PHP_Token_DIR was here in the source code
        env.addManualClassLoad("PHP_Token_DIR");
        // Conversion Note: class named PHP_Token_GOTO was here in the source code
        env.addManualClassLoad("PHP_Token_GOTO");
        // Conversion Note: class named PHP_Token_NAMESPACE was here in the source code
        env.addManualClassLoad("PHP_Token_NAMESPACE");
        // Conversion Note: class named PHP_Token_NS_C was here in the source code
        env.addManualClassLoad("PHP_Token_NS_C");
        // Conversion Note: class named PHP_Token_NS_SEPARATOR was here in the source code
        env.addManualClassLoad("PHP_Token_NS_SEPARATOR");
        // Conversion Note: class named PHP_Token_CALLABLE was here in the source code
        env.addManualClassLoad("PHP_Token_CALLABLE");
        // Conversion Note: class named PHP_Token_INSTEADOF was here in the source code
        env.addManualClassLoad("PHP_Token_INSTEADOF");
        // Conversion Note: class named PHP_Token_TRAIT was here in the source code
        env.addManualClassLoad("PHP_Token_TRAIT");
        // Conversion Note: class named PHP_Token_TRAIT_C was here in the source code
        env.addManualClassLoad("PHP_Token_TRAIT_C");
        // Conversion Note: class named PHP_Token_FINALLY was here in the source code
        env.addManualClassLoad("PHP_Token_FINALLY");
        // Conversion Note: class named PHP_Token_YIELD was here in the source code
        env.addManualClassLoad("PHP_Token_YIELD");
        // Conversion Note: class named PHP_Token_ELLIPSIS was here in the source code
        env.addManualClassLoad("PHP_Token_ELLIPSIS");
        // Conversion Note: class named PHP_Token_POW was here in the source code
        env.addManualClassLoad("PHP_Token_POW");
        // Conversion Note: class named PHP_Token_POW_EQUAL was here in the source code
        env.addManualClassLoad("PHP_Token_POW_EQUAL");
        // Conversion Note: class named PHP_Token_COALESCE was here in the source code
        env.addManualClassLoad("PHP_Token_COALESCE");
        // Conversion Note: class named PHP_Token_SPACESHIP was here in the source code
        env.addManualClassLoad("PHP_Token_SPACESHIP");
        // Conversion Note: class named PHP_Token_YIELD_FROM was here in the source code
        env.addManualClassLoad("PHP_Token_YIELD_FROM");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phpunit/php-token-stream/src")
                    .setFile("/vendor/phpunit/php-token-stream/src/Token.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope343 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
