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
 * Creates a border of specified width and color around the source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Image_Extend")
public class ImageExtend extends TransformUnit {
    /**
     * The width of the border.
     */
    @JsonProperty(value = "extend", required = true)
    private Bounds extend;

    /**
     * The color of the border.
     */
    @JsonProperty(value = "background", required = true)
    private Color background;

    /**
     * Get the width of the border.
     *
     * @return the extend value
     */
    public Bounds extend() {
        return this.extend;
    }

    /**
     * Set the width of the border.
     *
     * @param extend the extend value to set
     * @return the ImageExtend object itself.
     */
    public ImageExtend withExtend(Bounds extend) {
        this.extend = extend;
        return this;
    }

    /**
     * Get the color of the border.
     *
     * @return the background value
     */
    public Color background() {
        return this.background;
    }

    /**
     * Set the color of the border.
     *
     * @param background the background value to set
     * @return the ImageExtend object itself.
     */
    public ImageExtend withBackground(Color background) {
        this.background = background;
        return this;
    }

}
