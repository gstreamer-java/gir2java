
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GRegexError
    implements IntValuedEnum<GRegexError>
{

    _REGEX_ERROR_COMPILE(0L),
    _REGEX_ERROR_OPTIMIZE(1L),
    _REGEX_ERROR_REPLACE(2L),
    _REGEX_ERROR_MATCH(3L),
    _REGEX_ERROR_INTERNAL(4L),
    _REGEX_ERROR_STRAY_BACKSLASH(101L),
    _REGEX_ERROR_MISSING_CONTROL_CHAR(102L),
    _REGEX_ERROR_UNRECOGNIZED_ESCAPE(103L),
    _REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER(104L),
    _REGEX_ERROR_QUANTIFIER_TOO_BIG(105L),
    _REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS(106L),
    _REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS(107L),
    _REGEX_ERROR_RANGE_OUT_OF_ORDER(108L),
    _REGEX_ERROR_NOTHING_TO_REPEAT(109L),
    _REGEX_ERROR_UNRECOGNIZED_CHARACTER(112L),
    _REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS(113L),
    _REGEX_ERROR_UNMATCHED_PARENTHESIS(114L),
    _REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE(115L),
    _REGEX_ERROR_UNTERMINATED_COMMENT(118L),
    _REGEX_ERROR_EXPRESSION_TOO_LARGE(120L),
    _REGEX_ERROR_MEMORY_ERROR(121L),
    _REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND(125L),
    _REGEX_ERROR_MALFORMED_CONDITION(126L),
    _REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES(127L),
    _REGEX_ERROR_ASSERTION_EXPECTED(128L),
    _REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME(130L),
    _REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED(131L),
    _REGEX_ERROR_HEX_CODE_TOO_LARGE(134L),
    _REGEX_ERROR_INVALID_CONDITION(135L),
    _REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND(136L),
    _REGEX_ERROR_INFINITE_LOOP(140L),
    _REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR(142L),
    _REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME(143L),
    _REGEX_ERROR_MALFORMED_PROPERTY(146L),
    _REGEX_ERROR_UNKNOWN_PROPERTY(147L),
    _REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG(148L),
    _REGEX_ERROR_TOO_MANY_SUBPATTERNS(149L),
    _REGEX_ERROR_INVALID_OCTAL_VALUE(151L),
    _REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE(154L),
    _REGEX_ERROR_DEFINE_REPETION(155L),
    _REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS(156L),
    _REGEX_ERROR_MISSING_BACK_REFERENCE(157L),
    _REGEX_ERROR_INVALID_RELATIVE_REFERENCE(158L),
    _REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN(159L),
    _REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB(160L),
    _REGEX_ERROR_NUMBER_TOO_BIG(161L),
    _REGEX_ERROR_MISSING_SUBPATTERN_NAME(162L),
    _REGEX_ERROR_MISSING_DIGIT(163L),
    _REGEX_ERROR_INVALID_DATA_CHARACTER(164L),
    _REGEX_ERROR_EXTRA_SUBPATTERN_NAME(165L),
    _REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED(166L),
    _REGEX_ERROR_INVALID_CONTROL_CHAR(168L),
    _REGEX_ERROR_MISSING_NAME(169L),
    _REGEX_ERROR_NOT_SUPPORTED_IN_CLASS(171L),
    _REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES(172L),
    _REGEX_ERROR_NAME_TOO_LONG(175L),
    _REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE(176L);
    public final long value;

    GRegexError(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GRegexError> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GRegexError> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}