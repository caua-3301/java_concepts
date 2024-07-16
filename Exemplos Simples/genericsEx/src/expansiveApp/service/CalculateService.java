package expansiveApp.service;

import java.util.List;

public class CalculateService {
    public static <Type extends Comparable <Type>> Type max(List<Type> list) {
        Type max = list.get(0);

        for (Type item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
