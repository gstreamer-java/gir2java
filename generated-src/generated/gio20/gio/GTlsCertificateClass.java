
package generated.gio20.gio;

import generated.gobject20.gobject.GObjectClass;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gio-2.0")
public class GTlsCertificateClass
    extends StructObject
{


    static {
        BridJ.register();
    }

    public GTlsCertificateClass() {
        super();
    }

    public GTlsCertificateClass(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GObjectClass gtlscertificateclass_field_parent_class() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTlsCertificateClass gtlscertificateclass_field_parent_class(GObjectClass gtlscertificateclass_field_parent_class) {
        this.io.setNativeObjectField(this, 0, gtlscertificateclass_field_parent_class);
        return this;
    }

    @Field(1)
    private Pointer gtlscertificateclass_field_padding() {
        return this.io.getPointerField(this, 1);
    }

    @Field(1)
    private GTlsCertificateClass gtlscertificateclass_field_padding(Pointer gtlscertificateclass_field_padding) {
        this.io.setPointerField(this, 1, gtlscertificateclass_field_padding);
        return this;
    }

}
