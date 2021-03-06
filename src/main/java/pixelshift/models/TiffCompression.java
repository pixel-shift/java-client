/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package pixelshift.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TiffCompression.
 */
public enum TiffCompression {
    /** Enum value jpeg. */
    JPEG("jpeg"),

    /** Enum value deflate. */
    DEFLATE("deflate"),

    /** Enum value lzw. */
    LZW("lzw"),

    /** Enum value ccittfax4. */
    CCITTFAX4("ccittfax4");

    /** The actual serialized value for a TiffCompression instance. */
    private String value;

    TiffCompression(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TiffCompression instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TiffCompression object, or null if unable to parse.
     */
    @JsonCreator
    public static TiffCompression fromString(String value) {
        TiffCompression[] items = TiffCompression.values();
        for (TiffCompression item : items) {
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
