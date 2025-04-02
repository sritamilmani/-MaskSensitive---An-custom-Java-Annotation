package org.example;

import java.lang.reflect.Field;

public class MaskingUtil {
    public static String maskSensitiveData(Object obj) {
        if (obj == null) {
            return "null";
        }

        StringBuilder result = new StringBuilder(obj.getClass().getSimpleName() + "{");

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(obj);
                if (field.isAnnotationPresent(MaskSensitive.class)) {
                    result.append(field.getName()).append("=****, ");
                } else {
                    result.append(field.getName()).append("=").append(value).append(", ");
                }
            } catch (IllegalAccessException e) {
                result.append(field.getName()).append("=ERROR, ");
            }
        }

        if (result.length() > 2) {
            result.setLength(result.length() - 2); // Remove last comma and space
        }
        result.append("}");

        return result.toString();
    }
}
