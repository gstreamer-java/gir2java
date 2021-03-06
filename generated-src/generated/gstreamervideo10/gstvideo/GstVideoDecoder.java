
package generated.gstreamervideo10.gstvideo;

import generated.glib20.glib.GList;
import generated.glib20.glib.GRecMutex;
import generated.gstreamer10.gst.GstAllocationParams;
import generated.gstreamer10.gst.GstAllocator;
import generated.gstreamer10.gst.GstBuffer;
import generated.gstreamer10.gst.GstBufferPool;
import generated.gstreamer10.gst.GstElement;
import generated.gstreamer10.gst.GstFlowReturn;
import generated.gstreamer10.gst.GstPad;
import generated.gstreamer10.gst.GstSegment;
import generated.gstreamer10.gst.GstTagList;
import generated.gstreamer10.gst.GstTagMergeMode;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gstreamer-video-1.0")
public class GstVideoDecoder
    extends GstElement
{


    static {
        BridJ.register();
    }

    public GstVideoDecoder() {
        super();
    }

    public GstVideoDecoder(Pointer pointer) {
        super(pointer);
    }

    protected native void gst_video_decoder_add_to_frame(
        @Ptr
        long decoder, int n_bytes);

    public void add_to_frame(int n_bytes) {
        this.gst_video_decoder_add_to_frame(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), n_bytes);
    }

    @Ptr
    protected native long gst_video_decoder_allocate_output_buffer(
        @Ptr
        long decoder);

    public Pointer<GstBuffer> allocate_output_buffer() {
        return Pointer.pointerToAddress(this.gst_video_decoder_allocate_output_buffer(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer()), GstBuffer.class);
    }

    protected native IntValuedEnum<GstFlowReturn> gst_video_decoder_allocate_output_frame(
        @Ptr
        long decoder,
        @Ptr
        long frame);

    public IntValuedEnum<GstFlowReturn> allocate_output_frame(Pointer<GstVideoCodecFrame> frame) {
        return this.gst_video_decoder_allocate_output_frame(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), Pointer.getPeer(frame));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_video_decoder_drop_frame(
        @Ptr
        long dec,
        @Ptr
        long frame);

    public IntValuedEnum<GstFlowReturn> drop_frame(Pointer<GstVideoCodecFrame> frame) {
        return this.gst_video_decoder_drop_frame(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), Pointer.getPeer(frame));
    }

    protected native IntValuedEnum<GstFlowReturn> gst_video_decoder_finish_frame(
        @Ptr
        long decoder,
        @Ptr
        long frame);

    public IntValuedEnum<GstFlowReturn> finish_frame(Pointer<GstVideoCodecFrame> frame) {
        return this.gst_video_decoder_finish_frame(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), Pointer.getPeer(frame));
    }

    protected native void gst_video_decoder_get_allocator(
        @Ptr
        long decoder,
        @Ptr
        long allocator,
        @Ptr
        long params);

    public void get_allocator(Pointer<Pointer<GstAllocator>> allocator, Pointer<GstAllocationParams> params) {
        this.gst_video_decoder_get_allocator(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), Pointer.getPeer(allocator), Pointer.getPeer(params));
    }

    @Ptr
    protected native long gst_video_decoder_get_buffer_pool(
        @Ptr
        long decoder);

    public Pointer<GstBufferPool> get_buffer_pool() {
        return Pointer.pointerToAddress(this.gst_video_decoder_get_buffer_pool(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer()), GstBufferPool.class);
    }

    protected native int gst_video_decoder_get_estimate_rate(
        @Ptr
        long dec);

    public int get_estimate_rate() {
        return this.gst_video_decoder_get_estimate_rate(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer());
    }

    @Ptr
    protected native long gst_video_decoder_get_frame(
        @Ptr
        long decoder, int frame_number);

    public Pointer<GstVideoCodecFrame> get_frame(int frame_number) {
        return Pointer.pointerToAddress(this.gst_video_decoder_get_frame(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), frame_number), GstVideoCodecFrame.class);
    }

    @Ptr
    protected native long gst_video_decoder_get_frames(
        @Ptr
        long decoder);

    public Pointer<GList> get_frames() {
        return Pointer.pointerToAddress(this.gst_video_decoder_get_frames(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer()), GList.class);
    }

    protected native void gst_video_decoder_get_latency(
        @Ptr
        long decoder,
        @Ptr
        long min_latency,
        @Ptr
        long max_latency);

    public void get_latency(Pointer<Long> min_latency, Pointer<Long> max_latency) {
        this.gst_video_decoder_get_latency(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), Pointer.getPeer(min_latency), Pointer.getPeer(max_latency));
    }

    protected native long gst_video_decoder_get_max_decode_time(
        @Ptr
        long decoder,
        @Ptr
        long frame);

    public long get_max_decode_time(Pointer<GstVideoCodecFrame> frame) {
        return this.gst_video_decoder_get_max_decode_time(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), Pointer.getPeer(frame));
    }

    protected native int gst_video_decoder_get_max_errors(
        @Ptr
        long dec);

    public int get_max_errors() {
        return this.gst_video_decoder_get_max_errors(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer());
    }

    @Ptr
    protected native long gst_video_decoder_get_oldest_frame(
        @Ptr
        long decoder);

    public Pointer<GstVideoCodecFrame> get_oldest_frame() {
        return Pointer.pointerToAddress(this.gst_video_decoder_get_oldest_frame(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer()), GstVideoCodecFrame.class);
    }

    @Ptr
    protected native long gst_video_decoder_get_output_state(
        @Ptr
        long decoder);

    public Pointer<GstVideoCodecState> get_output_state() {
        return Pointer.pointerToAddress(this.gst_video_decoder_get_output_state(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer()), GstVideoCodecState.class);
    }

    protected native boolean gst_video_decoder_get_packetized(
        @Ptr
        long decoder);

    public boolean get_packetized() {
        return this.gst_video_decoder_get_packetized(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer());
    }

    protected native double gst_video_decoder_get_qos_proportion(
        @Ptr
        long decoder);

    public double get_qos_proportion() {
        return this.gst_video_decoder_get_qos_proportion(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer());
    }

    protected native IntValuedEnum<GstFlowReturn> gst_video_decoder_have_frame(
        @Ptr
        long decoder);

    public IntValuedEnum<GstFlowReturn> have_frame() {
        return this.gst_video_decoder_have_frame(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer());
    }

    protected native void gst_video_decoder_merge_tags(
        @Ptr
        long dec,
        @Ptr
        long tags, IntValuedEnum<GstTagMergeMode> mode);

    public void merge_tags(Pointer<GstTagList> tags, IntValuedEnum<GstTagMergeMode> mode) {
        this.gst_video_decoder_merge_tags(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), Pointer.getPeer(tags), mode);
    }

    protected native boolean gst_video_decoder_negotiate(
        @Ptr
        long decoder);

    public boolean negotiate() {
        return this.gst_video_decoder_negotiate(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer());
    }

    protected native void gst_video_decoder_release_frame(
        @Ptr
        long dec,
        @Ptr
        long frame);

    public void release_frame(Pointer<GstVideoCodecFrame> frame) {
        this.gst_video_decoder_release_frame(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), Pointer.getPeer(frame));
    }

    protected native void gst_video_decoder_set_estimate_rate(
        @Ptr
        long dec, boolean enabled);

    public void set_estimate_rate(boolean enabled) {
        this.gst_video_decoder_set_estimate_rate(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), enabled);
    }

    protected native void gst_video_decoder_set_latency(
        @Ptr
        long decoder, long min_latency, long max_latency);

    public void set_latency(long min_latency, long max_latency) {
        this.gst_video_decoder_set_latency(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), min_latency, max_latency);
    }

    protected native void gst_video_decoder_set_max_errors(
        @Ptr
        long dec, int num);

    public void set_max_errors(int num) {
        this.gst_video_decoder_set_max_errors(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), num);
    }

    protected native void gst_video_decoder_set_packetized(
        @Ptr
        long decoder, boolean packetized);

    public void set_packetized(boolean packetized) {
        this.gst_video_decoder_set_packetized(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), packetized);
    }

    @Field(0)
    private GstElement gstvideodecoder_field_element() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    private GstVideoDecoder gstvideodecoder_field_element(GstElement gstvideodecoder_field_element) {
        this.io.setNativeObjectField(this, 0, gstvideodecoder_field_element);
        return this;
    }

    @Field(1)
    private Pointer<GstPad> gstvideodecoder_field_sinkpad() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GstVideoDecoder gstvideodecoder_field_sinkpad(Pointer<GstPad> gstvideodecoder_field_sinkpad) {
        this.io.setPointerField(this, 1, gstvideodecoder_field_sinkpad);
        return this;
    }

    @Field(2)
    private Pointer<GstPad> gstvideodecoder_field_srcpad() {
        return this.io.getPointerField(this, 2);
    }

    @Field(2)
    private GstVideoDecoder gstvideodecoder_field_srcpad(Pointer<GstPad> gstvideodecoder_field_srcpad) {
        this.io.setPointerField(this, 2, gstvideodecoder_field_srcpad);
        return this;
    }

    @Field(3)
    private GRecMutex gstvideodecoder_field_stream_lock() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    private GstVideoDecoder gstvideodecoder_field_stream_lock(GRecMutex gstvideodecoder_field_stream_lock) {
        this.io.setNativeObjectField(this, 3, gstvideodecoder_field_stream_lock);
        return this;
    }

    @Field(4)
    private GstSegment gstvideodecoder_field_input_segment() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    private GstVideoDecoder gstvideodecoder_field_input_segment(GstSegment gstvideodecoder_field_input_segment) {
        this.io.setNativeObjectField(this, 4, gstvideodecoder_field_input_segment);
        return this;
    }

    @Field(5)
    private GstSegment gstvideodecoder_field_output_segment() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    private GstVideoDecoder gstvideodecoder_field_output_segment(GstSegment gstvideodecoder_field_output_segment) {
        this.io.setNativeObjectField(this, 5, gstvideodecoder_field_output_segment);
        return this;
    }

    @Field(6)
    private Pointer gstvideodecoder_field_priv() {
        return this.io.getPointerField(this, 6);
    }

    @Field(6)
    private GstVideoDecoder gstvideodecoder_field_priv(Pointer gstvideodecoder_field_priv) {
        this.io.setPointerField(this, 6, gstvideodecoder_field_priv);
        return this;
    }

    @Field(7)
    private Pointer gstvideodecoder_field_padding() {
        return this.io.getPointerField(this, 7);
    }

    @Field(7)
    private GstVideoDecoder gstvideodecoder_field_padding(Pointer gstvideodecoder_field_padding) {
        this.io.setPointerField(this, 7, gstvideodecoder_field_padding);
        return this;
    }

    @Ptr
    protected native long gst_video_decoder_set_output_state(
        @Ptr
        long decoder, IntValuedEnum<GstVideoFormat> fmt, long width, long height,
        @Ptr
        long reference);

    public Pointer<GstVideoCodecState> set_output_state(IntValuedEnum<GstVideoFormat> fmt, long width, long height, Pointer<GstVideoCodecState> reference) {
        return Pointer.pointerToAddress(this.gst_video_decoder_set_output_state(Pointer.pointerTo(this, GstVideoDecoder.class).getPeer(), fmt, width, height, Pointer.getPeer(reference)), GstVideoCodecState.class);
    }

}
