
package generated.gio20.gio;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GVolumeIface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GVolumeIface() {
        super();
    }

    public GVolumeIface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gvolumeiface_field_g_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GVolumeIface gvolumeiface_field_g_iface(GTypeInterface gvolumeiface_field_g_iface) {
        this.io.setNativeObjectField(this, 0, gvolumeiface_field_g_iface);
        return this;
    }

}
