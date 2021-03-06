/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package pixelshift.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for Gravity.
 */
public enum Gravity {
    /** Enum value center. */
    CENTER("center"),

    /** Enum value centre. */
    CENTRE("centre"),

    /** Enum value north. */
    NORTH("north"),

    /** Enum value northeast. */
    NORTHEAST("northeast"),

    /** Enum value east. */
    EAST("east"),

    /** Enum value southeast. */
    SOUTHEAST("southeast"),

    /** Enum value south. */
    SOUTH("south"),

    /** Enum value southwest. */
    SOUTHWEST("southwest"),

    /** Enum value west. */
    WEST("west"),

    /** Enum value northwest. */
    NORTHWEST("northwest");

    /** The actual serialized value for a Gravity instance. */
    private String value;

    Gravity(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Gravity instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Gravity object, or null if unable to parse.
     */
    @JsonCreator
    public static Gravity fromString(String value) {
        Gravity[] items = Gravity.values();
        for (Gravity item : items) {
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
