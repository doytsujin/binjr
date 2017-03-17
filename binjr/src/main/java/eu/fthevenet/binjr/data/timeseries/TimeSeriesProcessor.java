package eu.fthevenet.binjr.data.timeseries;

import eu.fthevenet.binjr.data.adapters.TimeSeriesBinding;
import javafx.scene.chart.XYChart;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.ZonedDateTime;
import java.util.*;

import static java.util.stream.Collectors.groupingBy;

/**
 * The base class for time series processor classes, which holds raw data points and provides access to summary properties.
 *
 * @author Frederic Thevenet
 */
public abstract class TimeSeriesProcessor<T extends Number> {
    private static final Logger logger = LogManager.getLogger(TimeSeriesProcessor.class);
    protected List<XYChart.Data<ZonedDateTime, T>> data;

    /**
     * Initializes a new instance of the {@link TimeSeriesProcessor} class with the provided {@link TimeSeriesBinding}.
     *
     */
    public TimeSeriesProcessor() {
        this.data = new ArrayList<>();
    }

    /**
     * Gets the minimum value for the Y coordinates of the {@link TimeSeriesProcessor}
     *
     * @return the minimum value for the Y coordinates of the {@link TimeSeriesProcessor}
     */
    public abstract T getMinValue();

    /**
     * Gets the average for all Y coordinates of the {@link TimeSeriesProcessor}
     *
     * @return the average for all Y coordinates of the {@link TimeSeriesProcessor}
     */
    public abstract T getAverageValue();

    /**
     * Gets the maximum value for the Y coordinates of the {@link TimeSeriesProcessor}
     *
     * @return the maximum value for the Y coordinates of the {@link TimeSeriesProcessor}
     */
    public abstract T getMaxValue();

    /**
     * Sets the data for the {@link TimeSeriesProcessor}
     *
     * @param data the list of {@link XYChart.Data} points to use as the {@link TimeSeriesProcessor}' data.
     */
    public void setData(List<XYChart.Data<ZonedDateTime, T>> data) {
        this.data = data;
    }

    /**
     * Gets the data of the {@link TimeSeriesProcessor}
     *
     * @return the data of the {@link TimeSeriesProcessor}
     */
    public List<XYChart.Data<ZonedDateTime, T>> getData() {
        return data;
    }

}