
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GLoadableIconIface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GLoadableIconIface() {
        super();
    }

    public GLoadableIconIface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gloadableiconiface_field_g_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GLoadableIconIface gloadableiconiface_field_g_iface(GTypeInterface gloadableiconiface_field_g_iface) {
        this.io.setNativeObjectField(this, 0, gloadableiconiface_field_g_iface);
        return this;
    }

}
