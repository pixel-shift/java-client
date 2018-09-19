/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package pixelshift.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * a model for a long list of batches with potential future paging support.
 */
public class AllBatchesPageResponse {
    /**
     * the current page (0 based).
     */
    @JsonProperty(value = "pageIndex")
    private Integer pageIndex;

    /**
     * the total number of pages.
     */
    @JsonProperty(value = "totalPages")
    private Integer totalPages;

    /**
     * a list of batches with urls for individual batch reports.
     */
    @JsonProperty(value = "batches")
    private List<BatchLinkResponse> batches;

    /**
     * Get the current page (0 based).
     *
     * @return the pageIndex value
     */
    public Integer pageIndex() {
        return this.pageIndex;
    }

    /**
     * Set the current page (0 based).
     *
     * @param pageIndex the pageIndex value to set
     * @return the AllBatchesPageResponse object itself.
     */
    public AllBatchesPageResponse withPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * Get the total number of pages.
     *
     * @return the totalPages value
     */
    public Integer totalPages() {
        return this.totalPages;
    }

    /**
     * Set the total number of pages.
     *
     * @param totalPages the totalPages value to set
     * @return the AllBatchesPageResponse object itself.
     */
    public AllBatchesPageResponse withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Get a list of batches with urls for individual batch reports.
     *
     * @return the batches value
     */
    public List<BatchLinkResponse> batches() {
        return this.batches;
    }

    /**
     * Set a list of batches with urls for individual batch reports.
     *
     * @param batches the batches value to set
     * @return the AllBatchesPageResponse object itself.
     */
    public AllBatchesPageResponse withBatches(List<BatchLinkResponse> batches) {
        this.batches = batches;
        return this;
    }

}
