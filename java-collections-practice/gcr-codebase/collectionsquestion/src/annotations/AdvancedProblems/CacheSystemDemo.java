package annotations.AdvancedProblems;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}

class MathService {

    @CacheResult
    public int slowSquare(int n) throws InterruptedException {
        Thread.sleep(2000);  
        return n * n;
    }
}

public class CacheSystemDemo {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invoke(Object obj, Method method, Object... args)
            throws Exception {

        if (!method.isAnnotationPresent(CacheResult.class)) {
            return method.invoke(obj, args);
        }

        String key = method.getName() + Arrays.toString(args);

        if (cache.containsKey(key)) {
            System.out.println("⚡ Returning Cached Result...");
            return cache.get(key);
        }

        System.out.println("⏳ Computing Result...");
        Object result = method.invoke(obj, args);
        cache.put(key, result);
        return result;
    }

    public static void main(String[] args) throws Exception {

        MathService service = new MathService();
        Method method = MathService.class.getMethod("slowSquare", int.class);

        System.out.println(invoke(service, method, 5));
        System.out.println(invoke(service, method, 5)); 
    }
}