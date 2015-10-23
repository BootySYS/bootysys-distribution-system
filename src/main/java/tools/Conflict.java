package tools;

/**
 * Created by jakob on 23/10/15.
 */
public class Conflict {
    private Course _start;
    private Course _end;

    public Conflict (Course start, Course end) {
        _start = start;
        _end = end;
    }

    public Course getStart() {
        return _start;
    }

    public Course getEnd() {
        return _end;
    }
}
