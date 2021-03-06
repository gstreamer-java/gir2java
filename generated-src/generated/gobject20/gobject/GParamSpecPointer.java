
package generated.gobject20.gobject;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecPointer
    extends GParamSpec
{


    static {
        BridJ.register();
    }

    public GParamSpecPointer() {
        super();
    }

    public GParamSpecPointer(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec gparamspecpointer_field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecPointer gparamspecpointer_field_parent_instance(GParamSpec gparamspecpointer_field_parent_instance) {
        this.io.setNativeObjectField(this, 0, gparamspecpointer_field_parent_instance);
        return this;
    }

}
