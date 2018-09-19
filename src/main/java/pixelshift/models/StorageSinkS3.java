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
 * Describes the destination location of a branch of the graph. Must appear at
 * the end of transform sequences (or
 * as a leaf in the conceptual transform graph) and be immediately preceded by
 * an ImageFormatTransformPipe
 * (type:"Image.OutputFormat").
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("StorageSink_S3")
public class StorageSinkS3 extends TransformUnit {
    /**
     * Destination key name.
     */
    @JsonProperty(value = "destinationKey", required = true)
    private String destinationKey;

    /**
     * Destination bucket name.
     */
    @JsonProperty(value = "destinationBucket", required = true)
    private String destinationBucket;

    /**
     * Allow overwrite of destination.
     */
    @JsonProperty(value = "allowOverwrite")
    private Boolean allowOverwrite;

    /**
     * Get destination key name.
     *
     * @return the destinationKey value
     */
    public String destinationKey() {
        return this.destinationKey;
    }

    /**
     * Set destination key name.
     *
     * @param destinationKey the destinationKey value to set
     * @return the StorageSinkS3 object itself.
     */
    public StorageSinkS3 withDestinationKey(String destinationKey) {
        this.destinationKey = destinationKey;
        return this;
    }

    /**
     * Get destination bucket name.
     *
     * @return the destinationBucket value
     */
    public String destinationBucket() {
        return this.destinationBucket;
    }

    /**
     * Set destination bucket name.
     *
     * @param destinationBucket the destinationBucket value to set
     * @return the StorageSinkS3 object itself.
     */
    public StorageSinkS3 withDestinationBucket(String destinationBucket) {
        this.destinationBucket = destinationBucket;
        return this;
    }

    /**
     * Get allow overwrite of destination.
     *
     * @return the allowOverwrite value
     */
    public Boolean allowOverwrite() {
        return this.allowOverwrite;
    }

    /**
     * Set allow overwrite of destination.
     *
     * @param allowOverwrite the allowOverwrite value to set
     * @return the StorageSinkS3 object itself.
     */
    public StorageSinkS3 withAllowOverwrite(Boolean allowOverwrite) {
        this.allowOverwrite = allowOverwrite;
        return this;
    }

}
