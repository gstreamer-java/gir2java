
package generated.gobject20.gobject;

import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gobject-2.0")
public class GParamSpecUnichar
    extends GParamSpec
{


    public GParamSpecUnichar() {
        super();
    }

    public GParamSpecUnichar(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public GParamSpec field_parent_instance() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GParamSpecUnichar field_parent_instance(GParamSpec field_parent_instance) {
        this.io.setNativeObjectField(this, 0, field_parent_instance);
        return this;
    }

    @Field(1)
    public long field_default_value() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GParamSpecUnichar field_default_value(long field_default_value) {
        this.io.setNativeObjectField(this, 1, field_default_value);
        return this;
    }

}