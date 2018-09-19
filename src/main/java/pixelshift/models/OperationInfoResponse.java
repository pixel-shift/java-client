/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package pixelshift.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A report of the id and an endpoint for checking the status of an operation.
 */
public class OperationInfoResponse {
    /**
     * the id of the operation.
     */
    @JsonProperty(value = "id")
    private UUID id;

    /**
     * an endpoint for a summary of the operation.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get the id of the operation.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id of the operation.
     *
     * @param id the id value to set
     * @return the OperationInfoResponse object itself.
     */
    public OperationInfoResponse withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get an endpoint for a summary of the operation.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set an endpoint for a summary of the operation.
     *
     * @param url the url value to set
     * @return the OperationInfoResponse object itself.
     */
    public OperationInfoResponse withUrl(String url) {
        this.url = url;
        return this;
    }

}
