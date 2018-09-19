/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package pixelshift.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ResizeKernel.
 */
public enum ResizeKernel {
    /** Enum value lanczos3. */
    LANCZOS3("lanczos3"),

    /** Enum value lanczos2. */
    LANCZOS2("lanczos2"),

    /** Enum value cubic. */
    CUBIC("cubic"),

    /** Enum value nearest. */
    NEAREST("nearest");

    /** The actual serialized value for a ResizeKernel instance. */
    private String value;

    ResizeKernel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResizeKernel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResizeKernel object, or null if unable to parse.
     */
    @JsonCreator
    public static ResizeKernel fromString(String value) {
        ResizeKernel[] items = ResizeKernel.values();
        for (ResizeKernel item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
