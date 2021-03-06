
package generated.gio20.gio;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GSocketConnectionClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GSocketConnectionClass() {
        super();
    }

    public GSocketConnectionClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GIOStreamClass gsocketconnectionclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GSocketConnectionClass gsocketconnectionclass_field_parent_class(GIOStreamClass gsocketconnectionclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gsocketconnectionclass_field_parent_class);
        return this;
    }

}
