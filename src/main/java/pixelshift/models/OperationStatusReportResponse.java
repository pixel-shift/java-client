/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package pixelshift.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * a processing summary of an operation.
 */
public class OperationStatusReportResponse {
    /**
     * when the operation was created.
     */
    @JsonProperty(value = "created")
    private DateTime created;

    /**
     * the current status of the operation. Possible values include: 'pending',
     * 'failed', 'success'.
     */
    @JsonProperty(value = "status")
    private OperationStatus status;

    /**
     * if the operation has a status of "failed", this will contain an error
     * message.
     */
    @JsonProperty(value = "error")
    private String error;

    /**
     * time taken for an operation.
     */
    @JsonProperty(value = "elapsedMicroseconds")
    private Double elapsedMicroseconds;

    /**
     * an endpoint that provides the original operation parameters.
     */
    @JsonProperty(value = "operationDescriptionUrl")
    private String operationDescriptionUrl;

    /**
     * Get when the operation was created.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Set when the operation was created.
     *
     * @param created the created value to set
     * @return the OperationStatusReportResponse object itself.
     */
    public OperationStatusReportResponse withCreated(DateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get the current status of the operation. Possible values include: 'pending', 'failed', 'success'.
     *
     * @return the status value
     */
    public OperationStatus status() {
        return this.status;
    }

    /**
     * Set the current status of the operation. Possible values include: 'pending', 'failed', 'success'.
     *
     * @param status the status value to set
     * @return the OperationStatusReportResponse object itself.
     */
    public OperationStatusReportResponse withStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get if the operation has a status of "failed", this will contain an error message.
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Set if the operation has a status of "failed", this will contain an error message.
     *
     * @param error the error value to set
     * @return the OperationStatusReportResponse object itself.
     */
    public OperationStatusReportResponse withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get time taken for an operation.
     *
     * @return the elapsedMicroseconds value
     */
    public Double elapsedMicroseconds() {
        return this.elapsedMicroseconds;
    }

    /**
     * Set time taken for an operation.
     *
     * @param elapsedMicroseconds the elapsedMicroseconds value to set
     * @return the OperationStatusReportResponse object itself.
     */
    public OperationStatusReportResponse withElapsedMicroseconds(Double elapsedMicroseconds) {
        this.elapsedMicroseconds = elapsedMicroseconds;
        return this;
    }

    /**
     * Get an endpoint that provides the original operation parameters.
     *
     * @return the operationDescriptionUrl value
     */
    public String operationDescriptionUrl() {
        return this.operationDescriptionUrl;
    }

    /**
     * Set an endpoint that provides the original operation parameters.
     *
     * @param operationDescriptionUrl the operationDescriptionUrl value to set
     * @return the OperationStatusReportResponse object itself.
     */
    public OperationStatusReportResponse withOperationDescriptionUrl(String operationDescriptionUrl) {
        this.operationDescriptionUrl = operationDescriptionUrl;
        return this;
    }

}
