package demo10.javainteroperability.demo1;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Meeting {
    private String title;

    public void addTitle(@NotNull String title) {
        this.title = title;
    }

    public @Nullable String getMeetingTitle() {
        return title;
    }
}
