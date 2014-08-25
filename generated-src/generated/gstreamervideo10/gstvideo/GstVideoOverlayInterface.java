
package generated.gstreamervideo10.gstvideo;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstVideoOverlayInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstVideoOverlayInterface() {
        super();
    }

    public GstVideoOverlayInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gstvideooverlayinterface_field_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstVideoOverlayInterface gstvideooverlayinterface_field_iface(GTypeInterface gstvideooverlayinterface_field_iface) {
        this.io.setNativeObjectField(this, 0, gstvideooverlayinterface_field_iface);
        return this;
    }

}
