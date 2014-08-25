
package generated.gstreamer10.gst;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-1.0")
public class GstBufferPoolClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstBufferPoolClass() {
        super();
    }

    public GstBufferPoolClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    private Pointer field__gst_reserved() {
        return this.io.getPointerField(this, 0);
    }

    @Field(0)
    private GstBufferPoolClass field__gst_reserved(Pointer field__gst_reserved) {
        this.io.setPointerField(this, 0, field__gst_reserved);
        return this;
    }

    @Field(1)
    public GstObjectClass field_object_class() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstBufferPoolClass field_object_class(GstObjectClass field_object_class) {
        this.io.setNativeObjectField(this, 1, field_object_class);
        return this;
    }

}