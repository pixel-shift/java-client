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
 * Describes the source location of a graph. Must appear only once at the front
 * of transform sequences (or as the
 * head element in the conceptual transform graph) and be immediately preceded
 * by an ImageFormatTransformPipe
 * such as ImageFormat_Jpeg/ImageFormat_Tiff/ImageFormat_Png/ImageFormat_Webp.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("StorageSource_S3")
public class StorageSourceS3 extends TransformUnit {
    /**
     * Source key name.
     */
    @JsonProperty(value = "sourceKey", required = true)
    private String sourceKey;

    /**
     * Source bucket name.
     */
    @JsonProperty(value = "sourceBucket", required = true)
    private String sourceBucket;

    /**
     * Get source key name.
     *
     * @return the sourceKey value
     */
    public String sourceKey() {
        return this.sourceKey;
    }

    /**
     * Set source key name.
     *
     * @param sourceKey the sourceKey value to set
     * @return the StorageSourceS3 object itself.
     */
    public StorageSourceS3 withSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
        return this;
    }

    /**
     * Get source bucket name.
     *
     * @return the sourceBucket value
     */
    public String sourceBucket() {
        return this.sourceBucket;
    }

    /**
     * Set source bucket name.
     *
     * @param sourceBucket the sourceBucket value to set
     * @return the StorageSourceS3 object itself.
     */
    public StorageSourceS3 withSourceBucket(String sourceBucket) {
        this.sourceBucket = sourceBucket;
        return this;
    }

}