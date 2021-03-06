
package generated.glib20.glib;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GUnicodeBreakType
    implements IntValuedEnum<GUnicodeBreakType>
{

    _UNICODE_BREAK_TYPE_MANDATORY(0L),
    _UNICODE_BREAK_TYPE_CARRIAGE_RETURN(1L),
    _UNICODE_BREAK_TYPE_LINE_FEED(2L),
    _UNICODE_BREAK_TYPE_COMBINING_MARK(3L),
    _UNICODE_BREAK_TYPE_SURROGATE(4L),
    _UNICODE_BREAK_TYPE_ZERO_WIDTH_SPACE(5L),
    _UNICODE_BREAK_TYPE_INSEPARABLE(6L),
    _UNICODE_BREAK_TYPE_NON_BREAKING_GLUE(7L),
    _UNICODE_BREAK_TYPE_CONTINGENT(8L),
    _UNICODE_BREAK_TYPE_SPACE(9L),
    _UNICODE_BREAK_TYPE_AFTER(10L),
    _UNICODE_BREAK_TYPE_BEFORE(11L),
    _UNICODE_BREAK_TYPE_BEFORE_AND_AFTER(12L),
    _UNICODE_BREAK_TYPE_HYPHEN(13L),
    _UNICODE_BREAK_TYPE_NON_STARTER(14L),
    _UNICODE_BREAK_TYPE_OPEN_PUNCTUATION(15L),
    _UNICODE_BREAK_TYPE_CLOSE_PUNCTUATION(16L),
    _UNICODE_BREAK_TYPE_QUOTATION(17L),
    _UNICODE_BREAK_TYPE_EXCLAMATION(18L),
    _UNICODE_BREAK_TYPE_IDEOGRAPHIC(19L),
    _UNICODE_BREAK_TYPE_NUMERIC(20L),
    _UNICODE_BREAK_TYPE_INFIX_SEPARATOR(21L),
    _UNICODE_BREAK_TYPE_SYMBOL(22L),
    _UNICODE_BREAK_TYPE_ALPHABETIC(23L),
    _UNICODE_BREAK_TYPE_PREFIX(24L),
    _UNICODE_BREAK_TYPE_POSTFIX(25L),
    _UNICODE_BREAK_TYPE_COMPLEX_CONTEXT(26L),
    _UNICODE_BREAK_TYPE_AMBIGUOUS(27L),
    _UNICODE_BREAK_TYPE_UNKNOWN(28L),
    _UNICODE_BREAK_TYPE_NEXT_LINE(29L),
    _UNICODE_BREAK_TYPE_WORD_JOINER(30L),
    _UNICODE_BREAK_TYPE_HANGUL_L_JAMO(31L),
    _UNICODE_BREAK_TYPE_HANGUL_V_JAMO(32L),
    _UNICODE_BREAK_TYPE_HANGUL_T_JAMO(33L),
    _UNICODE_BREAK_TYPE_HANGUL_LV_SYLLABLE(34L),
    _UNICODE_BREAK_TYPE_HANGUL_LVT_SYLLABLE(35L),
    _UNICODE_BREAK_TYPE_CLOSE_PARANTHESIS(36L),
    _UNICODE_BREAK_TYPE_CONDITIONAL_JAPANESE_STARTER(37L),
    _UNICODE_BREAK_TYPE_HEBREW_LETTER(38L),
    _UNICODE_BREAK_TYPE_REGIONAL_INDICATOR(39L);
    public final long value;

    GUnicodeBreakType(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GUnicodeBreakType> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GUnicodeBreakType> fromValue(int value) {
        return FlagSet.fromValue(value, GUnicodeBreakType.values());
    }

}
