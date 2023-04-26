import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer i : source) {
            if (i >= threshold) {
                result.add(i);
            } else {
                logger.log("Element " + i + " does not pass");
            }
        }
        logger.log("Passed the filter " + result.size() + " elements out of " + source.size());
        logger.log("Display the result on the screen");
        return result;
    }
}