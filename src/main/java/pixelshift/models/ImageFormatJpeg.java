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
 * Output to Jpeg.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ImageFormat_Jpeg")
public class ImageFormatJpeg extends TransformUnit {
    /**
     * Jpeg quality.
     */
    @JsonProperty(value = "quality")
    private Integer quality;

    /**
     * Create progressive/interlace scan jpeg.
     */
    @JsonProperty(value = "progressive")
    private Boolean progressive;

    /**
     * Get jpeg quality.
     *
     * @return the quality value
     */
    public Integer quality() {
        return this.quality;
    }

    /**
     * Set jpeg quality.
     *
     * @param quality the quality value to set
     * @return the ImageFormatJpeg object itself.
     */
    public ImageFormatJpeg withQuality(Integer quality) {
        this.quality = quality;
        return this;
    }

    /**
     * Get create progressive/interlace scan jpeg.
     *
     * @return the progressive value
     */
    public Boolean progressive() {
        return this.progressive;
    }

    /**
     * Set create progressive/interlace scan jpeg.
     *
     * @param progressive the progressive value to set
     * @return the ImageFormatJpeg object itself.
     */
    public ImageFormatJpeg withProgressive(Boolean progressive) {
        this.progressive = progressive;
        return this;
    }

}
