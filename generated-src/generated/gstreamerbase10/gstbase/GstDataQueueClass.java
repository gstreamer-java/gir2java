
package generated.gstreamerbase10.gstbase;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-base-1.0")
public class GstDataQueueClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstDataQueueClass() {
        super();
    }

    public GstDataQueueClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gstdataqueueclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstDataQueueClass gstdataqueueclass_field_parent_class(GObjectClass gstdataqueueclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gstdataqueueclass_field_parent_class);
        return this;
    }

    @Field(1)
    public Pointer gstdataqueueclass_field__gst_reserved() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    public GstDataQueueClass gstdataqueueclass_field__gst_reserved(Pointer gstdataqueueclass_field__gst_reserved) {
        this.io.setPointerField(this, 1, gstdataqueueclass_field__gst_reserved);
        return this;
    }

}
