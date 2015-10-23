package tools;

import org.junit.Test;

import java.util.HashSet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jakob on 23/10/15.
 */
public class CourseTest {

    @Test
    public void getterCourseId () {
        int expected = 12;
        Course course = new Course(expected, 13, 14);
        assertThat(course.getCourseId(), is(equalTo(expected)));
    }

    @Test
    public void getterGroupId () {
        int expected = 13;
        Course course = new Course(12, expected, 14);
        assertThat(course.getGroupId(), is(equalTo(expected)));

    }

    @Test
    public void getterMaxStudents () {
        int expected = 14;
        Course course = new Course(12, 13, expected);
        assertThat(course.getMaxStudents(), is(equalTo(expected)));
    }

    @Test
    public void getterFreeSpaces () {
        int expected = 5;
        Course course = new Course(12, 13, 10);
        Team team = new Team(1,1);
        for (int i = 0; i<5; i++) {
            Student student = new Student(2);
            team.addMember(student);
        }
        course.addParticipant(team);
        assertThat(course.getFreeSpaces(), is(equalTo(expected)));
    }

    @Test
    public void addParticipant () {
        Team team = new Team(1,2);
        for (int i = 0; i<5; i++) {
            Student student = new Student(2);
            team.addMember(student);
        }
        Course course = new Course(1,2,10);
        course.addParticipant(team);
        HashSet<Team> expected = new HashSet<>();
        expected.add(team);
        assertThat(course.getTeams(), is(equalTo(expected)));
    }

    @Test
    public void setterMaxStudents () {
        int expected = 14;
        Course course = new Course(12, 13, 10);
        course.setMaxStudents(14);
        assertThat(course.getMaxStudents(), is(equalTo(expected)));
    }
}
