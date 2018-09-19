/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package pixelshift.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container for submitting batches of transform graphs.
 */
public class Batch {
    /**
     * Collection of transform graphs for processing. Each item represents a
     * single billable operation.
     */
    @JsonProperty(value = "items", required = true)
    private List<TransformGraph> items;

    /**
     * Get collection of transform graphs for processing. Each item represents a single billable operation.
     *
     * @return the items value
     */
    public List<TransformGraph> items() {
        return this.items;
    }

    /**
     * Set collection of transform graphs for processing. Each item represents a single billable operation.
     *
     * @param items the items value to set
     * @return the Batch object itself.
     */
    public Batch withItems(List<TransformGraph> items) {
        this.items = items;
        return this;
    }

}