
package generated.glib20.glib;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("glib-2.0")
public class GMainContext
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GMainContext() {
        super();
    }

    public GMainContext(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_main_context_new();

    public static Pointer _new() {
        return Pointer.pointerToAddress(GMainContext.g_main_context_new());
    }

    protected native boolean g_main_context_acquire(
        @Ptr
        long context);

    public boolean acquire() {
        return this.g_main_context_acquire(Pointer.pointerTo(this, GMainContext.class).getPeer());
    }

    protected native void g_main_context_add_poll(
        @Ptr
        long context,
        @Ptr
        long fd, int priority);

    public void add_poll(Pointer fd, int priority) {
        this.g_main_context_add_poll(Pointer.pointerTo(this, GMainContext.class).getPeer(), Pointer.getPeer(fd), priority);
    }

    protected native void g_main_context_dispatch(
        @Ptr
        long context);

    public void dispatch() {
        this.g_main_context_dispatch(Pointer.pointerTo(this, GMainContext.class).getPeer());
    }

    @Ptr
    protected native long g_main_context_find_source_by_funcs_user_data(
        @Ptr
        long context,
        @Ptr
        long funcs,
        @Ptr
        long user_data);

    public Pointer find_source_by_funcs_user_data(Pointer funcs, Pointer user_data) {
        return Pointer.pointerToAddress(this.g_main_context_find_source_by_funcs_user_data(Pointer.pointerTo(this, GMainContext.class).getPeer(), Pointer.getPeer(funcs), Pointer.getPeer(user_data)));
    }

    @Ptr
    protected native long g_main_context_find_source_by_id(
        @Ptr
        long context, long source_id);

    public Pointer find_source_by_id(long source_id) {
        return Pointer.pointerToAddress(this.g_main_context_find_source_by_id(Pointer.pointerTo(this, GMainContext.class).getPeer(), source_id));
    }

    @Ptr
    protected native long g_main_context_find_source_by_user_data(
        @Ptr
        long context,
        @Ptr
        long user_data);

    public Pointer find_source_by_user_data(Pointer user_data) {
        return Pointer.pointerToAddress(this.g_main_context_find_source_by_user_data(Pointer.pointerTo(this, GMainContext.class).getPeer(), Pointer.getPeer(user_data)));
    }

    protected native boolean g_main_context_is_owner(
        @Ptr
        long context);

    public boolean is_owner() {
        return this.g_main_context_is_owner(Pointer.pointerTo(this, GMainContext.class).getPeer());
    }

    protected native boolean g_main_context_iteration(
        @Ptr
        long context, boolean may_block);

    public boolean iteration(boolean may_block) {
        return this.g_main_context_iteration(Pointer.pointerTo(this, GMainContext.class).getPeer(), may_block);
    }

    protected native boolean g_main_context_pending(
        @Ptr
        long context);

    public boolean pending() {
        return this.g_main_context_pending(Pointer.pointerTo(this, GMainContext.class).getPeer());
    }

    protected native void g_main_context_pop_thread_default(
        @Ptr
        long context);

    public void pop_thread_default() {
        this.g_main_context_pop_thread_default(Pointer.pointerTo(this, GMainContext.class).getPeer());
    }

    protected native boolean g_main_context_prepare(
        @Ptr
        long context,
        @Ptr
        long priority);

    public boolean prepare(Pointer<Integer> priority) {
        return this.g_main_context_prepare(Pointer.pointerTo(this, GMainContext.class).getPeer(), Pointer.getPeer(priority));
    }

    protected native void g_main_context_push_thread_default(
        @Ptr
        long context);

    public void push_thread_default() {
        this.g_main_context_push_thread_default(Pointer.pointerTo(this, GMainContext.class).getPeer());
    }

    @Ptr
    protected native long g_main_context_ref(
        @Ptr
        long context);

    public Pointer ref() {
        return Pointer.pointerToAddress(this.g_main_context_ref(Pointer.pointerTo(this, GMainContext.class).getPeer()));
    }

    protected native void g_main_context_release(
        @Ptr
        long context);

    public void release() {
        this.g_main_context_release(Pointer.pointerTo(this, GMainContext.class).getPeer());
    }

    protected native void g_main_context_remove_poll(
        @Ptr
        long context,
        @Ptr
        long fd);

    public void remove_poll(Pointer fd) {
        this.g_main_context_remove_poll(Pointer.pointerTo(this, GMainContext.class).getPeer(), Pointer.getPeer(fd));
    }

    protected native void g_main_context_unref(
        @Ptr
        long context);

    public void unref() {
        this.g_main_context_unref(Pointer.pointerTo(this, GMainContext.class).getPeer());
    }

    protected native boolean g_main_context_wait(
        @Ptr
        long context,
        @Ptr
        long cond,
        @Ptr
        long mutex);

    public boolean gmaincontext_wait(Pointer<GCond> cond, Pointer mutex) {
        return this.g_main_context_wait(Pointer.pointerTo(this, GMainContext.class).getPeer(), Pointer.getPeer(cond), Pointer.getPeer(mutex));
    }

    protected native void g_main_context_wakeup(
        @Ptr
        long context);

    public void wakeup() {
        this.g_main_context_wakeup(Pointer.pointerTo(this, GMainContext.class).getPeer());
    }

    @Ptr
    protected static native long g_main_context_default();

    public static Pointer _default() {
        return Pointer.pointerToAddress(GMainContext.g_main_context_default());
    }

    @Ptr
    protected static native long g_main_context_get_thread_default();

    public static Pointer get_thread_default() {
        return Pointer.pointerToAddress(GMainContext.g_main_context_get_thread_default());
    }

    @Ptr
    protected static native long g_main_context_ref_thread_default();

    public static Pointer ref_thread_default() {
        return Pointer.pointerToAddress(GMainContext.g_main_context_ref_thread_default());
    }

    protected native void g_main_context_invoke(
        @Ptr
        long context,
        @Ptr
        long function,
        @Ptr
        long data);

    public void invoke(Pointer function, Pointer data) {
        this.g_main_context_invoke(Pointer.pointerTo(this, GMainContext.class).getPeer(), Pointer.getPeer(function), Pointer.getPeer(data));
    }

    protected native void g_main_context_invoke_full(
        @Ptr
        long context, int priority,
        @Ptr
        long function,
        @Ptr
        long data,
        @Ptr
        long notify);

    public void invoke_full(int priority, Pointer function, Pointer data, Pointer notify) {
        this.g_main_context_invoke_full(Pointer.pointerTo(this, GMainContext.class).getPeer(), priority, Pointer.getPeer(function), Pointer.getPeer(data), Pointer.getPeer(notify));
    }

    protected native void g_main_context_set_poll_func(
        @Ptr
        long context,
        @Ptr
        long func);

    public void set_poll_func(Pointer func) {
        this.g_main_context_set_poll_func(Pointer.pointerTo(this, GMainContext.class).getPeer(), Pointer.getPeer(func));
    }

    protected native int g_main_context_check(
        @Ptr
        long context, int max_priority,
        @Ptr
        long fds, int n_fds);

    public int check(int max_priority, Pointer<GPollFD> fds, int n_fds) {
        return this.g_main_context_check(Pointer.pointerTo(this, GMainContext.class).getPeer(), max_priority, Pointer.getPeer(fds), n_fds);
    }

    @Ptr
    protected native long g_main_context_get_poll_func(
        @Ptr
        long context);

    public Pointer get_poll_func() {
        return Pointer.pointerToAddress(this.g_main_context_get_poll_func(Pointer.pointerTo(this, GMainContext.class).getPeer()));
    }

    protected native int g_main_context_query(
        @Ptr
        long context, int max_priority,
        @Ptr
        long timeout_,
        @Ptr
        long fds, int n_fds);

    public int query(int max_priority, Pointer<Integer> timeout_, Pointer<GPollFD> fds, int n_fds) {
        return this.g_main_context_query(Pointer.pointerTo(this, GMainContext.class).getPeer(), max_priority, Pointer.getPeer(timeout_), Pointer.getPeer(fds), n_fds);
    }

}
