package tools;

import java.util.HashSet;

/**
 * Created by jakob on 23/10/15.
 *
 * Class for creating and using a conflict graph from courses and timetables.
 * Also holds the teams applying for the courses.
 */

public class ConflictGraph {
    private HashSet<Course> _vertices;
    private HashSet<Conflict> _edges;
    private HashSet<Team> _teams;

    public ConflictGraph() {
        /* TODO */
    }

    public HashSet<Course> getCourses() {
        return _vertices;
    }

    public HashSet<Team> getTeams() {
        return _teams;
    }
}
