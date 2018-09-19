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
 * Resize image with touch-from-inside semantics where width and height
 * represent maximums. e.g. the image will be
 * no larger that the bounding-box.
 * Aspect ratio is preserved, so image will be smaller than or equal to the
 * bounding box in one dimension, and
 * exactly fit the other dimension.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Image_ResizeMax")
public class ImageResizeMax extends TransformUnit {
    /**
     * Maximum width.
     */
    @JsonProperty(value = "width", required = true)
    private int width;

    /**
     * Maximum height.
     */
    @JsonProperty(value = "height", required = true)
    private int height;

    /**
     * The resampling algorithm used for resizing. Possible values include:
     * 'lanczos3', 'lanczos2', 'cubic', 'nearest'.
     */
    @JsonProperty(value = "resizeKernel")
    private ResizeKernel resizeKernel;

    /**
     * Get maximum width.
     *
     * @return the width value
     */
    public int width() {
        return this.width;
    }

    /**
     * Set maximum width.
     *
     * @param width the width value to set
     * @return the ImageResizeMax object itself.
     */
    public ImageResizeMax withWidth(int width) {
        this.width = width;
        return this;
    }

    /**
     * Get maximum height.
     *
     * @return the height value
     */
    public int height() {
        return this.height;
    }

    /**
     * Set maximum height.
     *
     * @param height the height value to set
     * @return the ImageResizeMax object itself.
     */
    public ImageResizeMax withHeight(int height) {
        this.height = height;
        return this;
    }

    /**
     * Get the resampling algorithm used for resizing. Possible values include: 'lanczos3', 'lanczos2', 'cubic', 'nearest'.
     *
     * @return the resizeKernel value
     */
    public ResizeKernel resizeKernel() {
        return this.resizeKernel;
    }

    /**
     * Set the resampling algorithm used for resizing. Possible values include: 'lanczos3', 'lanczos2', 'cubic', 'nearest'.
     *
     * @param resizeKernel the resizeKernel value to set
     * @return the ImageResizeMax object itself.
     */
    public ImageResizeMax withResizeKernel(ResizeKernel resizeKernel) {
        this.resizeKernel = resizeKernel;
        return this;
    }

}