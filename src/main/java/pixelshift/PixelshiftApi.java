/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package pixelshift;

import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.UUID;
import pixelshift.models.AllBatchesPageResponse;
import pixelshift.models.Batch;
import pixelshift.models.BatchReportResponse;
import pixelshift.models.BatchStartReportResponse;
import pixelshift.models.OperationStatusReportResponse;
import pixelshift.models.TransformGraphMetadataEnvelope;
import rx.Observable;
import com.microsoft.rest.RestClient;

/**
 * The interface for PixelshiftApi class.
 */
public interface PixelshiftApi {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * The default base URL.
     */
    String DEFAULT_BASE_URL = "https://";

    /**
     * Endpoint for submitting batches for processing.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BatchStartReportResponse object if successful.
     */
    BatchStartReportResponse processImageBatch();

    /**
     * Endpoint for submitting batches for processing.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BatchStartReportResponse> processImageBatchAsync(final ServiceCallback<BatchStartReportResponse> serviceCallback);

    /**
     * Endpoint for submitting batches for processing.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BatchStartReportResponse object
     */
    Observable<BatchStartReportResponse> processImageBatchAsync();

    /**
     * Endpoint for submitting batches for processing.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BatchStartReportResponse object
     */
    Observable<ServiceResponse<BatchStartReportResponse>> processImageBatchWithServiceResponseAsync();
    /**
     * Endpoint for submitting batches for processing.
     *
     * @param batch The batch to be processed
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BatchStartReportResponse object if successful.
     */
    BatchStartReportResponse processImageBatch(Batch batch);

    /**
     * Endpoint for submitting batches for processing.
     *
     * @param batch The batch to be processed
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BatchStartReportResponse> processImageBatchAsync(Batch batch, final ServiceCallback<BatchStartReportResponse> serviceCallback);

    /**
     * Endpoint for submitting batches for processing.
     *
     * @param batch The batch to be processed
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BatchStartReportResponse object
     */
    Observable<BatchStartReportResponse> processImageBatchAsync(Batch batch);

    /**
     * Endpoint for submitting batches for processing.
     *
     * @param batch The batch to be processed
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BatchStartReportResponse object
     */
    Observable<ServiceResponse<BatchStartReportResponse>> processImageBatchWithServiceResponseAsync(Batch batch);

    /**
     * List all batches.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AllBatchesPageResponse object if successful.
     */
    AllBatchesPageResponse allBatches();

    /**
     * List all batches.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<AllBatchesPageResponse> allBatchesAsync(final ServiceCallback<AllBatchesPageResponse> serviceCallback);

    /**
     * List all batches.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AllBatchesPageResponse object
     */
    Observable<AllBatchesPageResponse> allBatchesAsync();

    /**
     * List all batches.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AllBatchesPageResponse object
     */
    Observable<ServiceResponse<AllBatchesPageResponse>> allBatchesWithServiceResponseAsync();

    /**
     * The processing status of a batch.
     *
     * @param batchId the id of the batch to query
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BatchReportResponse object if successful.
     */
    BatchReportResponse batchInfo(UUID batchId);

    /**
     * The processing status of a batch.
     *
     * @param batchId the id of the batch to query
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<BatchReportResponse> batchInfoAsync(UUID batchId, final ServiceCallback<BatchReportResponse> serviceCallback);

    /**
     * The processing status of a batch.
     *
     * @param batchId the id of the batch to query
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BatchReportResponse object
     */
    Observable<BatchReportResponse> batchInfoAsync(UUID batchId);

    /**
     * The processing status of a batch.
     *
     * @param batchId the id of the batch to query
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BatchReportResponse object
     */
    Observable<ServiceResponse<BatchReportResponse>> batchInfoWithServiceResponseAsync(UUID batchId);

    /**
     * The processing status of a specific operation.
     *
     * @param operationId the id of the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatusReportResponse object if successful.
     */
    OperationStatusReportResponse operationStatus(UUID operationId);

    /**
     * The processing status of a specific operation.
     *
     * @param operationId the id of the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<OperationStatusReportResponse> operationStatusAsync(UUID operationId, final ServiceCallback<OperationStatusReportResponse> serviceCallback);

    /**
     * The processing status of a specific operation.
     *
     * @param operationId the id of the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusReportResponse object
     */
    Observable<OperationStatusReportResponse> operationStatusAsync(UUID operationId);

    /**
     * The processing status of a specific operation.
     *
     * @param operationId the id of the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusReportResponse object
     */
    Observable<ServiceResponse<OperationStatusReportResponse>> operationStatusWithServiceResponseAsync(UUID operationId);

    /**
     * A description of the original operation parameters.
     *
     * @param operationId the operation id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransformGraphMetadataEnvelope object if successful.
     */
    TransformGraphMetadataEnvelope operationDescription(UUID operationId);

    /**
     * A description of the original operation parameters.
     *
     * @param operationId the operation id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TransformGraphMetadataEnvelope> operationDescriptionAsync(UUID operationId, final ServiceCallback<TransformGraphMetadataEnvelope> serviceCallback);

    /**
     * A description of the original operation parameters.
     *
     * @param operationId the operation id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransformGraphMetadataEnvelope object
     */
    Observable<TransformGraphMetadataEnvelope> operationDescriptionAsync(UUID operationId);

    /**
     * A description of the original operation parameters.
     *
     * @param operationId the operation id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransformGraphMetadataEnvelope object
     */
    Observable<ServiceResponse<TransformGraphMetadataEnvelope>> operationDescriptionWithServiceResponseAsync(UUID operationId);

}
