package BusinessRequirement;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrivacySettings {
    public static void main(String[] args) {
        ScheduledExecutorService schExecService = Executors.newScheduledThreadPool(2);
        schExecService.scheduleAtFixedRate(() -> System.out.print("Delete site data"), 10, 10, TimeUnit.HOURS); //A
        schExecService.scheduleWithFixedDelay(() -> System.out.print("Delete cookies"), 1, 5, TimeUnit.DAYS); //B
        schExecService.execute(() -> System.out.print("Delete cached web content")); //C


        Stream< String > words = Stream.of("scheme", "respectable", "layout",
                "referee", "agency");
        List< String > wordList = words.takeWhile(word -> word.charAt(0) == 'r').collect(Collectors.toList());
        System.out.println(wordList);
    }
}

