
package generated.gio20.gio;

import generated.glib20.glib.GVariant;
import generated.glib20.glib.GVariantType;
import generated.gobject20.gobject.GObject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;

@Library("gio-2.0")
public class GMenuItem
    extends GObject
{


    static {
        BridJ.register();
    }

    public GMenuItem() {
        super();
    }

    public GMenuItem(Pointer pointer) {
        super(pointer);
    }

    @Ptr
    protected static native long g_menu_item_new(
        @Ptr
        long label,
        @Ptr
        long detailed_action);

    public static Pointer gmenuitem__new(Pointer label, Pointer detailed_action) {
        return Pointer.pointerToAddress(GMenuItem.g_menu_item_new(Pointer.getPeer(label), Pointer.getPeer(detailed_action)));
    }

    @Ptr
    protected static native long g_menu_item_new_from_model(
        @Ptr
        long model, int item_index);

    public static Pointer new_from_model(Pointer model, int item_index) {
        return Pointer.pointerToAddress(GMenuItem.g_menu_item_new_from_model(Pointer.getPeer(model), item_index));
    }

    @Ptr
    protected static native long g_menu_item_new_section(
        @Ptr
        long label,
        @Ptr
        long section);

    public static Pointer new_section(Pointer label, Pointer section) {
        return Pointer.pointerToAddress(GMenuItem.g_menu_item_new_section(Pointer.getPeer(label), Pointer.getPeer(section)));
    }

    @Ptr
    protected static native long g_menu_item_new_submenu(
        @Ptr
        long label,
        @Ptr
        long submenu);

    public static Pointer new_submenu(Pointer label, Pointer submenu) {
        return Pointer.pointerToAddress(GMenuItem.g_menu_item_new_submenu(Pointer.getPeer(label), Pointer.getPeer(submenu)));
    }

    protected native boolean g_menu_item_get_attribute(
        @Ptr
        long menu_item,
        @Ptr
        long attribute,
        @Ptr
        long format_string, Object... varargs);

    public boolean get_attribute(Pointer attribute, Pointer format_string, Object... varargs) {
        return this.g_menu_item_get_attribute(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(attribute), Pointer.getPeer(format_string), varargs);
    }

    @Ptr
    protected native long g_menu_item_get_attribute_value(
        @Ptr
        long menu_item,
        @Ptr
        long attribute,
        @Ptr
        long expected_type);

    public Pointer<GVariant> get_attribute_value(Pointer attribute, Pointer<GVariantType> expected_type) {
        return Pointer.pointerToAddress(this.g_menu_item_get_attribute_value(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(attribute), Pointer.getPeer(expected_type)), GVariant.class);
    }

    @Ptr
    protected native long g_menu_item_get_link(
        @Ptr
        long menu_item,
        @Ptr
        long link);

    public Pointer get_link(Pointer link) {
        return Pointer.pointerToAddress(this.g_menu_item_get_link(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(link)));
    }

    protected native void g_menu_item_set_action_and_target(
        @Ptr
        long menu_item,
        @Ptr
        long action,
        @Ptr
        long format_string, Object... varargs);

    public void set_action_and_target(Pointer action, Pointer format_string, Object... varargs) {
        this.g_menu_item_set_action_and_target(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(action), Pointer.getPeer(format_string), varargs);
    }

    protected native void g_menu_item_set_action_and_target_value(
        @Ptr
        long menu_item,
        @Ptr
        long action,
        @Ptr
        long target_value);

    public void set_action_and_target_value(Pointer action, Pointer<GVariant> target_value) {
        this.g_menu_item_set_action_and_target_value(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(action), Pointer.getPeer(target_value));
    }

    protected native void g_menu_item_set_attribute(
        @Ptr
        long menu_item,
        @Ptr
        long attribute,
        @Ptr
        long format_string, Object... varargs);

    public void set_attribute(Pointer attribute, Pointer format_string, Object... varargs) {
        this.g_menu_item_set_attribute(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(attribute), Pointer.getPeer(format_string), varargs);
    }

    protected native void g_menu_item_set_attribute_value(
        @Ptr
        long menu_item,
        @Ptr
        long attribute,
        @Ptr
        long value);

    public void set_attribute_value(Pointer attribute, Pointer<GVariant> value) {
        this.g_menu_item_set_attribute_value(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(attribute), Pointer.getPeer(value));
    }

    protected native void g_menu_item_set_detailed_action(
        @Ptr
        long menu_item,
        @Ptr
        long detailed_action);

    public void set_detailed_action(Pointer detailed_action) {
        this.g_menu_item_set_detailed_action(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(detailed_action));
    }

    protected native void g_menu_item_set_icon(
        @Ptr
        long menu_item,
        @Ptr
        long icon);

    public void set_icon(Pointer<Object> icon) {
        this.g_menu_item_set_icon(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(icon));
    }

    protected native void g_menu_item_set_label(
        @Ptr
        long menu_item,
        @Ptr
        long label);

    public void set_label(Pointer label) {
        this.g_menu_item_set_label(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(label));
    }

    protected native void g_menu_item_set_link(
        @Ptr
        long menu_item,
        @Ptr
        long link,
        @Ptr
        long model);

    public void set_link(Pointer link, Pointer model) {
        this.g_menu_item_set_link(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(link), Pointer.getPeer(model));
    }

    protected native void g_menu_item_set_section(
        @Ptr
        long menu_item,
        @Ptr
        long section);

    public void set_section(Pointer section) {
        this.g_menu_item_set_section(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(section));
    }

    protected native void g_menu_item_set_submenu(
        @Ptr
        long menu_item,
        @Ptr
        long submenu);

    public void set_submenu(Pointer submenu) {
        this.g_menu_item_set_submenu(Pointer.pointerTo(this, GMenuItem.class).getPeer(), Pointer.getPeer(submenu));
    }

}
