
package generated.gstreamerrtsp10.gstrtsp;

import java.util.Collections;
import java.util.Iterator;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;

public enum GstRTSPHeaderField
    implements IntValuedEnum<GstRTSPHeaderField>
{

    GSTRTSP_HEADER_FIELD_INVALID(0L),
    GSTRTSP_HEADER_FIELD_ACCEPT(1L),
    GSTRTSP_HEADER_FIELD_ACCEPT_ENCODING(2L),
    GSTRTSP_HEADER_FIELD_ACCEPT_LANGUAGE(3L),
    GSTRTSP_HEADER_FIELD_ALLOW(4L),
    GSTRTSP_HEADER_FIELD_AUTHORIZATION(5L),
    GSTRTSP_HEADER_FIELD_BANDWIDTH(6L),
    GSTRTSP_HEADER_FIELD_BLOCKSIZE(7L),
    GSTRTSP_HEADER_FIELD_CACHE_CONTROL(8L),
    GSTRTSP_HEADER_FIELD_CONFERENCE(9L),
    GSTRTSP_HEADER_FIELD_CONNECTION(10L),
    GSTRTSP_HEADER_FIELD_CONTENT_BASE(11L),
    GSTRTSP_HEADER_FIELD_CONTENT_ENCODING(12L),
    GSTRTSP_HEADER_FIELD_CONTENT_LANGUAGE(13L),
    GSTRTSP_HEADER_FIELD_CONTENT_LENGTH(14L),
    GSTRTSP_HEADER_FIELD_CONTENT_LOCATION(15L),
    GSTRTSP_HEADER_FIELD_CONTENT_TYPE(16L),
    GSTRTSP_HEADER_FIELD_CSEQ(17L),
    GSTRTSP_HEADER_FIELD_DATE(18L),
    GSTRTSP_HEADER_FIELD_EXPIRES(19L),
    GSTRTSP_HEADER_FIELD_FROM(20L),
    GSTRTSP_HEADER_FIELD_IF_MODIFIED_SINCE(21L),
    GSTRTSP_HEADER_FIELD_LAST_MODIFIED(22L),
    GSTRTSP_HEADER_FIELD_PROXY_AUTHENTICATE(23L),
    GSTRTSP_HEADER_FIELD_PROXY_REQUIRE(24L),
    GSTRTSP_HEADER_FIELD_PUBLIC(25L),
    GSTRTSP_HEADER_FIELD_RANGE(26L),
    GSTRTSP_HEADER_FIELD_REFERER(27L),
    GSTRTSP_HEADER_FIELD_REQUIRE(28L),
    GSTRTSP_HEADER_FIELD_RETRY_AFTER(29L),
    GSTRTSP_HEADER_FIELD_RTP_INFO(30L),
    GSTRTSP_HEADER_FIELD_SCALE(31L),
    GSTRTSP_HEADER_FIELD_SESSION(32L),
    GSTRTSP_HEADER_FIELD_SERVER(33L),
    GSTRTSP_HEADER_FIELD_SPEED(34L),
    GSTRTSP_HEADER_FIELD_TRANSPORT(35L),
    GSTRTSP_HEADER_FIELD_UNSUPPORTED(36L),
    GSTRTSP_HEADER_FIELD_USER_AGENT(37L),
    GSTRTSP_HEADER_FIELD_VIA(38L),
    GSTRTSP_HEADER_FIELD_WWW_AUTHENTICATE(39L),
    GSTRTSP_HEADER_FIELD_CLIENT_CHALLENGE(40L),
    GSTRTSP_HEADER_FIELD_REAL_CHALLENGE1(41L),
    GSTRTSP_HEADER_FIELD_REAL_CHALLENGE2(42L),
    GSTRTSP_HEADER_FIELD_REAL_CHALLENGE3(43L),
    GSTRTSP_HEADER_FIELD_SUBSCRIBE(44L),
    GSTRTSP_HEADER_FIELD_ALERT(45L),
    GSTRTSP_HEADER_FIELD_CLIENT_ID(46L),
    GSTRTSP_HEADER_FIELD_COMPANY_ID(47L),
    GSTRTSP_HEADER_FIELD_GUID(48L),
    GSTRTSP_HEADER_FIELD_REGION_DATA(49L),
    GSTRTSP_HEADER_FIELD_MAX_ASM_WIDTH(50L),
    GSTRTSP_HEADER_FIELD_LANGUAGE(51L),
    GSTRTSP_HEADER_FIELD_PLAYER_START_TIME(52L),
    GSTRTSP_HEADER_FIELD_LOCATION(53L),
    GSTRTSP_HEADER_FIELD_ETAG(54L),
    GSTRTSP_HEADER_FIELD_IF_MATCH(55L),
    GSTRTSP_HEADER_FIELD_ACCEPT_CHARSET(56L),
    GSTRTSP_HEADER_FIELD_SUPPORTED(57L),
    GSTRTSP_HEADER_FIELD_VARY(58L),
    GSTRTSP_HEADER_FIELD_X_ACCELERATE_STREAMING(59L),
    GSTRTSP_HEADER_FIELD_X_ACCEPT_AUTHENT(60L),
    GSTRTSP_HEADER_FIELD_X_ACCEPT_PROXY_AUTHENT(61L),
    GSTRTSP_HEADER_FIELD_X_BROADCAST_ID(62L),
    GSTRTSP_HEADER_FIELD_X_BURST_STREAMING(63L),
    GSTRTSP_HEADER_FIELD_X_NOTICE(64L),
    GSTRTSP_HEADER_FIELD_X_PLAYER_LAG_TIME(65L),
    GSTRTSP_HEADER_FIELD_X_PLAYLIST(66L),
    GSTRTSP_HEADER_FIELD_X_PLAYLIST_CHANGE_NOTICE(67L),
    GSTRTSP_HEADER_FIELD_X_PLAYLIST_GEN_ID(68L),
    GSTRTSP_HEADER_FIELD_X_PLAYLIST_SEEK_ID(69L),
    GSTRTSP_HEADER_FIELD_X_PROXY_CLIENT_AGENT(70L),
    GSTRTSP_HEADER_FIELD_X_PROXY_CLIENT_VERB(71L),
    GSTRTSP_HEADER_FIELD_X_RECEDING_PLAYLISTCHANGE(72L),
    GSTRTSP_HEADER_FIELD_X_RTP_INFO(73L),
    GSTRTSP_HEADER_FIELD_X_STARTUPPROFILE(74L),
    GSTRTSP_HEADER_FIELD_TIMESTAMP(75L),
    GSTRTSP_HEADER_FIELD_AUTHENTICATION_INFO(76L),
    GSTRTSP_HEADER_FIELD_HOST(77L),
    GSTRTSP_HEADER_FIELD_PRAGMA(78L),
    GSTRTSP_HEADER_FIELD_X_SERVER_IP_ADDRESS(79L),
    GSTRTSP_HEADER_FIELD_X_SESSIONCOOKIE(80L),
    GSTRTSP_HEADER_FIELD_RTCP_INTERVAL(81L),
    GSTRTSP_HEADER_FIELD_LAST(82L);
    public final long value;

    GstRTSPHeaderField(long value) {
        this.value = value;
    }

    public long value() {
        return this.value;
    }

    public Iterator<GstRTSPHeaderField> iterator() {
        return Collections.singleton(this).iterator();
    }

    public static IntValuedEnum<GstRTSPHeaderField> fromValue(long value) {
        return FlagSet.fromValue(value, this.values());
    }

}