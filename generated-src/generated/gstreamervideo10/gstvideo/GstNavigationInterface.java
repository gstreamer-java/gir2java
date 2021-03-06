
package generated.gstreamervideo10.gstvideo;

import generated.gobject20.gobject.GTypeInterface;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-video-1.0")
public class GstNavigationInterface
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GstNavigationInterface() {
        super();
    }

    public GstNavigationInterface(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GTypeInterface gstnavigationinterface_field_iface() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstNavigationInterface gstnavigationinterface_field_iface(GTypeInterface gstnavigationinterface_field_iface) {
        this.io.setNativeObjectField(this, 0, gstnavigationinterface_field_iface);
        return this;
    }

}
