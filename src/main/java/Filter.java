import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int filter;

    public Filter(int filter) {
        this.filter = filter;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int i : source) {
            if (filter < i) {
                result.add(i);
                logger.log("Элемент " + i + " проходит фильтрацию");
            } else {
                logger.log("Элемент " + i + " не проходит фильтрацию");
            }
        }
        return result;
    }
}
