/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package pixelshift.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Change image colors to tinted monochrome.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Image_Tint")
public class ImageTint extends TransformUnit {
    /**
     * The tint color.
     */
    @JsonProperty(value = "tint", required = true)
    private Color tint;

    /**
     * Get the tint color.
     *
     * @return the tint value
     */
    public Color tint() {
        return this.tint;
    }

    /**
     * Set the tint color.
     *
     * @param tint the tint value to set
     * @return the ImageTint object itself.
     */
    public ImageTint withTint(Color tint) {
        this.tint = tint;
        return this;
    }

}
