/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package pixelshift.models;

import java.util.UUID;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A summary with a url for a status report on a specific batch id.
 */
public class BatchLinkResponse {
    /**
     * the id of the batch.
     */
    @JsonProperty(value = "batchId")
    private UUID batchId;

    /**
     * the time that the batch was submitted.
     */
    @JsonProperty(value = "created")
    private DateTime created;

    /**
     * a url for a status report on the batch.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get the id of the batch.
     *
     * @return the batchId value
     */
    public UUID batchId() {
        return this.batchId;
    }

    /**
     * Set the id of the batch.
     *
     * @param batchId the batchId value to set
     * @return the BatchLinkResponse object itself.
     */
    public BatchLinkResponse withBatchId(UUID batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * Get the time that the batch was submitted.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Set the time that the batch was submitted.
     *
     * @param created the created value to set
     * @return the BatchLinkResponse object itself.
     */
    public BatchLinkResponse withCreated(DateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get a url for a status report on the batch.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set a url for a status report on the batch.
     *
     * @param url the url value to set
     * @return the BatchLinkResponse object itself.
     */
    public BatchLinkResponse withUrl(String url) {
        this.url = url;
        return this;
    }

}