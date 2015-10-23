import tools.ConflictGraph;
import tools.Course;
import tools.Team;

import java.util.HashSet;

/**
 * Created by jakob on 23/10/15.
 */
public class DistributionAlgorithm {
    public static void DistributionAlgorithm() { //might not be void in the end
        ConflictGraph conflictGraph = new ConflictGraph(); //TODO: has to be edited once the Constructor is coded
        HashSet<Course> courses = conflictGraph.getCourses();
        HashSet<Team> teams = conflictGraph.getTeams();

        HashSet<Course> coursesWithOneGroup = getCoursesWithOneGroup(courses);

        for (Course a : coursesWithOneGroup) {
            //TODO: write this
        }
    }

    private static HashSet<Course> getCoursesWithOneGroup(HashSet<Course> allCourses) {
        HashSet<Course> result = new HashSet<>();
        return null;
    }
}
