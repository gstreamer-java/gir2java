
package generated.gstreamerfft10.gstfft;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

@Library("gstreamer-fft-1.0")
public class GstFFTF64Complex
    extends StructObject
{


    public GstFFTF64Complex() {
        super();
    }

    public GstFFTF64Complex(Pointer pointer) {
        super(pointer);
    }

    @Field(0)
    public double field_r() {
        return this.io.getNativeObjectField(this, 0);
    }

    @Field(0)
    public GstFFTF64Complex field_r(double field_r) {
        this.io.setNativeObjectField(this, 0, field_r);
        return this;
    }

    @Field(1)
    public double field_i() {
        return this.io.getNativeObjectField(this, 1);
    }

    @Field(1)
    public GstFFTF64Complex field_i(double field_i) {
        this.io.setNativeObjectField(this, 1, field_i);
        return this;
    }

}