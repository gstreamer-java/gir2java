
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GInetAddressClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GInetAddressClass() {
        super();
    }

    public GInetAddressClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass ginetaddressclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GInetAddressClass ginetaddressclass_field_parent_class(GObjectClass ginetaddressclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, ginetaddressclass_field_parent_class);
        return this;
    }

}
