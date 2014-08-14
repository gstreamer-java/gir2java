
package generated.glib20.glib;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("glib-2.0")
public class GTestConfig
    extends StructObject
{


    public GTestConfig() {
        super();
    }

    public GTestConfig(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public boolean field_test_initialized() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GTestConfig field_test_initialized(boolean field_test_initialized) {
        this.io.setNativeObjectField(this, 0, field_test_initialized);
        return this;
    }

    @Field(1)
    public boolean field_test_quick() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GTestConfig field_test_quick(boolean field_test_quick) {
        this.io.setNativeObjectField(this, 1, field_test_quick);
        return this;
    }

    @Field(2)
    public boolean field_test_perf() {
        return this.io.getNativeObjectField(this, 2);
    }

    @Field(2)
    public GTestConfig field_test_perf(boolean field_test_perf) {
        this.io.setNativeObjectField(this, 2, field_test_perf);
        return this;
    }

    @Field(3)
    public boolean field_test_verbose() {
        return this.io.getNativeObjectField(this, 3);
    }

    @Field(3)
    public GTestConfig field_test_verbose(boolean field_test_verbose) {
        this.io.setNativeObjectField(this, 3, field_test_verbose);
        return this;
    }

    @Field(4)
    public boolean field_test_quiet() {
        return this.io.getNativeObjectField(this, 4);
    }

    @Field(4)
    public GTestConfig field_test_quiet(boolean field_test_quiet) {
        this.io.setNativeObjectField(this, 4, field_test_quiet);
        return this;
    }

    @Field(5)
    public boolean field_test_undefined() {
        return this.io.getNativeObjectField(this, 5);
    }

    @Field(5)
    public GTestConfig field_test_undefined(boolean field_test_undefined) {
        this.io.setNativeObjectField(this, 5, field_test_undefined);
        return this;
    }

}