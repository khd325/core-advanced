package hello.advanced.trace.strategy.code.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeLogTemplate {

    public void execute(Callback callback) {
        long start = System.currentTimeMillis();
        callback.call();
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - start;
        log.info("resultTime={}", resultTime);
    }
}
