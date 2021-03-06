
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GProxyAddressClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GProxyAddressClass() {
        super();
    }

    public GProxyAddressClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GInetSocketAddressClass gproxyaddressclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GProxyAddressClass gproxyaddressclass_field_parent_class(GInetSocketAddressClass gproxyaddressclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gproxyaddressclass_field_parent_class);
        return this;
    }

}
