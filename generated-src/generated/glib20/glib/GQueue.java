
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GQueue
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GQueue() {
        super();
    }

    public GQueue(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public Pointer<GList> gqueue_field_head() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    public GQueue gqueue_field_head(Pointer<GList> gqueue_field_head) {
        this.io.setPointerField(this, 0, gqueue_field_head);
        return this;
    }

    @Field(1)
    public Pointer<GList> gqueue_field_tail() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GQueue gqueue_field_tail(Pointer<GList> gqueue_field_tail) {
        this.io.setPointerField(this, 1, gqueue_field_tail);
        return this;
    }

    @Field(2)
    public long gqueue_field_length() {
        return this.io.getLongField(this, 2);
    }

    @Field(2)
    public GQueue gqueue_field_length(long gqueue_field_length) {
        this.io.setLongField(this, 2, gqueue_field_length);
        return this;
    }

    protected native void g_queue_clear(
        @Ptr
        long queue);

    public void clear() {
        this.g_queue_clear(Pointer.pointerTo(this, GQueue.class).getPeer());
    }

    @Ptr
    protected native long g_queue_copy(
        @Ptr
        long queue);

    public Pointer copy() {
        return Pointer.pointerToAddress(this.g_queue_copy(Pointer.pointerTo(this, GQueue.class).getPeer()));
    }

    protected native void g_queue_delete_link(
        @Ptr
        long queue,
        @Ptr
        long link_);

    public void delete_link(Pointer<GList> link_) {
        this.g_queue_delete_link(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(link_));
    }

    @Ptr
    protected native long g_queue_find(
        @Ptr
        long queue,
        @Ptr
        long data);

    public Pointer<GList> find(Pointer data) {
        return Pointer.pointerToAddress(this.g_queue_find(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(data)), GList.class);
    }

    @Ptr
    protected native long g_queue_find_custom(
        @Ptr
        long queue,
        @Ptr
        long data,
        @Ptr
        long func);

    public Pointer<GList> find_custom(Pointer data, Pointer func) {
        return Pointer.pointerToAddress(this.g_queue_find_custom(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(func)), GList.class);
    }

    protected native void g_queue_foreach(
        @Ptr
        long queue,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void foreach(Pointer func, Pointer user_data) {
        this.g_queue_foreach(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native void g_queue_free(
        @Ptr
        long queue);

    public void free() {
        this.g_queue_free(Pointer.pointerTo(this, GQueue.class).getPeer());
    }

    protected native void g_queue_free_full(
        @Ptr
        long queue,
        @Ptr
        long free_func);

    public void free_full(Pointer free_func) {
        this.g_queue_free_full(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(free_func));
    }

    protected native long g_queue_get_length(
        @Ptr
        long queue);

    public long get_length() {
        return this.g_queue_get_length(Pointer.pointerTo(this, GQueue.class).getPeer());
    }

    protected native int g_queue_index(
        @Ptr
        long queue,
        @Ptr
        long data);

    public int index(Pointer data) {
        return this.g_queue_index(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(data));
    }

    protected native void g_queue_init(
        @Ptr
        long queue);

    public void init() {
        this.g_queue_init(Pointer.pointerTo(this, GQueue.class).getPeer());
    }

    protected native void g_queue_insert_after(
        @Ptr
        long queue,
        @Ptr
        long sibling,
        @Ptr
        long data);

    public void insert_after(Pointer<GList> sibling, Pointer data) {
        this.g_queue_insert_after(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(sibling), Pointer.getPeer(data));
    }

    protected native void g_queue_insert_before(
        @Ptr
        long queue,
        @Ptr
        long sibling,
        @Ptr
        long data);

    public void insert_before(Pointer<GList> sibling, Pointer data) {
        this.g_queue_insert_before(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(sibling), Pointer.getPeer(data));
    }

    protected native void g_queue_insert_sorted(
        @Ptr
        long queue,
        @Ptr
        long data,
        @Ptr
        long func,
        @Ptr
        long user_data);

    public void insert_sorted(Pointer data, Pointer func, Pointer user_data) {
        this.g_queue_insert_sorted(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(data), Pointer.getPeer(func), Pointer.getPeer(user_data));
    }

    protected native boolean g_queue_is_empty(
        @Ptr
        long queue);

    public boolean is_empty() {
        return this.g_queue_is_empty(Pointer.pointerTo(this, GQueue.class).getPeer());
    }

    protected native int g_queue_link_index(
        @Ptr
        long queue,
        @Ptr
        long link_);

    public int link_index(Pointer<GList> link_) {
        return this.g_queue_link_index(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(link_));
    }

    @Ptr
    protected native long g_queue_peek_head(
        @Ptr
        long queue);

    public Pointer peek_head() {
        return Pointer.pointerToAddress(this.g_queue_peek_head(Pointer.pointerTo(this, GQueue.class).getPeer()));
    }

    @Ptr
    protected native long g_queue_peek_head_link(
        @Ptr
        long queue);

    public Pointer<GList> peek_head_link() {
        return Pointer.pointerToAddress(this.g_queue_peek_head_link(Pointer.pointerTo(this, GQueue.class).getPeer()), GList.class);
    }

    @Ptr
    protected native long g_queue_peek_nth(
        @Ptr
        long queue, long n);

    public Pointer peek_nth(long n) {
        return Pointer.pointerToAddress(this.g_queue_peek_nth(Pointer.pointerTo(this, GQueue.class).getPeer(), n));
    }

    @Ptr
    protected native long g_queue_peek_nth_link(
        @Ptr
        long queue, long n);

    public Pointer<GList> peek_nth_link(long n) {
        return Pointer.pointerToAddress(this.g_queue_peek_nth_link(Pointer.pointerTo(this, GQueue.class).getPeer(), n), GList.class);
    }

    @Ptr
    protected native long g_queue_peek_tail(
        @Ptr
        long queue);

    public Pointer peek_tail() {
        return Pointer.pointerToAddress(this.g_queue_peek_tail(Pointer.pointerTo(this, GQueue.class).getPeer()));
    }

    @Ptr
    protected native long g_queue_peek_tail_link(
        @Ptr
        long queue);

    public Pointer<GList> peek_tail_link() {
        return Pointer.pointerToAddress(this.g_queue_peek_tail_link(Pointer.pointerTo(this, GQueue.class).getPeer()), GList.class);
    }

    @Ptr
    protected native long g_queue_pop_head(
        @Ptr
        long queue);

    public Pointer pop_head() {
        return Pointer.pointerToAddress(this.g_queue_pop_head(Pointer.pointerTo(this, GQueue.class).getPeer()));
    }

    @Ptr
    protected native long g_queue_pop_head_link(
        @Ptr
        long queue);

    public Pointer<GList> pop_head_link() {
        return Pointer.pointerToAddress(this.g_queue_pop_head_link(Pointer.pointerTo(this, GQueue.class).getPeer()), GList.class);
    }

    @Ptr
    protected native long g_queue_pop_nth(
        @Ptr
        long queue, long n);

    public Pointer pop_nth(long n) {
        return Pointer.pointerToAddress(this.g_queue_pop_nth(Pointer.pointerTo(this, GQueue.class).getPeer(), n));
    }

    @Ptr
    protected native long g_queue_pop_nth_link(
        @Ptr
        long queue, long n);

    public Pointer<GList> pop_nth_link(long n) {
        return Pointer.pointerToAddress(this.g_queue_pop_nth_link(Pointer.pointerTo(this, GQueue.class).getPeer(), n), GList.class);
    }

    @Ptr
    protected native long g_queue_pop_tail(
        @Ptr
        long queue);

    public Pointer pop_tail() {
        return Pointer.pointerToAddress(this.g_queue_pop_tail(Pointer.pointerTo(this, GQueue.class).getPeer()));
    }

    @Ptr
    protected native long g_queue_pop_tail_link(
        @Ptr
        long queue);

    public Pointer<GList> pop_tail_link() {
        return Pointer.pointerToAddress(this.g_queue_pop_tail_link(Pointer.pointerTo(this, GQueue.class).getPeer()), GList.class);
    }

    protected native void g_queue_push_head(
        @Ptr
        long queue,
        @Ptr
        long data);

    public void push_head(Pointer data) {
        this.g_queue_push_head(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(data));
    }

    protected native void g_queue_push_head_link(
        @Ptr
        long queue,
        @Ptr
        long link_);

    public void push_head_link(Pointer<GList> link_) {
        this.g_queue_push_head_link(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(link_));
    }

    protected native void g_queue_push_nth(
        @Ptr
        long queue,
        @Ptr
        long data, int n);

    public void push_nth(Pointer data, int n) {
        this.g_queue_push_nth(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(data), n);
    }

    protected native void g_queue_push_nth_link(
        @Ptr
        long queue, int n,
        @Ptr
        long link_);

    public void push_nth_link(int n, Pointer<GList> link_) {
        this.g_queue_push_nth_link(Pointer.pointerTo(this, GQueue.class).getPeer(), n, Pointer.getPeer(link_));
    }

    protected native void g_queue_push_tail(
        @Ptr
        long queue,
        @Ptr
        long data);

    public void push_tail(Pointer data) {
        this.g_queue_push_tail(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(data));
    }

    protected native void g_queue_push_tail_link(
        @Ptr
        long queue,
        @Ptr
        long link_);

    public void push_tail_link(Pointer<GList> link_) {
        this.g_queue_push_tail_link(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(link_));
    }

    protected native boolean g_queue_remove(
        @Ptr
        long queue,
        @Ptr
        long data);

    public boolean remove(Pointer data) {
        return this.g_queue_remove(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(data));
    }

    protected native long g_queue_remove_all(
        @Ptr
        long queue,
        @Ptr
        long data);

    public long remove_all(Pointer data) {
        return this.g_queue_remove_all(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(data));
    }

    protected native void g_queue_reverse(
        @Ptr
        long queue);

    public void reverse() {
        this.g_queue_reverse(Pointer.pointerTo(this, GQueue.class).getPeer());
    }

    protected native void g_queue_sort(
        @Ptr
        long queue,
        @Ptr
        long compare_func,
        @Ptr
        long user_data);

    public void sort(Pointer compare_func, Pointer user_data) {
        this.g_queue_sort(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(compare_func), Pointer.getPeer(user_data));
    }

    protected native void g_queue_unlink(
        @Ptr
        long queue,
        @Ptr
        long link_);

    public void unlink(Pointer<GList> link_) {
        this.g_queue_unlink(Pointer.pointerTo(this, GQueue.class).getPeer(), Pointer.getPeer(link_));
    }

    @Ptr
    protected static native long g_queue_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GQueue.g_queue_new());
    }

}
