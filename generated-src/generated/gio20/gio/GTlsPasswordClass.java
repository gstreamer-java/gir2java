
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GTlsPasswordClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTlsPasswordClass() {
        super();
    }

    public GTlsPasswordClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gtlspasswordclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsPasswordClass gtlspasswordclass_field_parent_class(GObjectClass gtlspasswordclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gtlspasswordclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gtlspasswordclass_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GTlsPasswordClass gtlspasswordclass_field_padding(Pointer gtlspasswordclass_field_padding) {
        this.io.setPointerField(this, 1, gtlspasswordclass_field_padding);
        return this;
    }

}
