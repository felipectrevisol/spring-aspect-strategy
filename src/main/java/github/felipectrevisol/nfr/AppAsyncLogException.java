package github.felipectrevisol.nfr;

import java.util.Arrays;
import java.lang.reflect.Method;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

@Configuration
public class AppAsyncLogException implements AsyncConfigurer {

    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new AsyncUncaughtExceptionHandler() {
            @Override
            public void handleUncaughtException(Throwable throwable, Method method, Object... params) {
                System.out.println("Async Exception Handler:");
                System.out.println("Exception: " + throwable);
                System.out.println("Method: " + method);
                System.out.println("Params: " + Arrays.toString(params));
            }
        };
    }
}