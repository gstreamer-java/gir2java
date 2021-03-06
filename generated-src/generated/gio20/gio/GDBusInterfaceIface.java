
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GDBusInterfaceIface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GDBusInterfaceIface() {
        super();
    }

    public GDBusInterfaceIface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gdbusinterfaceiface_field_parent_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GDBusInterfaceIface gdbusinterfaceiface_field_parent_iface(GTypeInterface gdbusinterfaceiface_field_parent_iface) {
        this.io.setNativeObjectField(this, 0, gdbusinterfaceiface_field_parent_iface);
        return this;
    }

}
