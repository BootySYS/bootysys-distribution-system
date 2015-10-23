package tools;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jakob on 23/10/15.
 */
public class TeamTest {

    @Test
    public void getterTeamId () {
        int expected = 14;
        Team team = new Team(expected, 13);
        assertThat(team.getTeamId(), is(equalTo(expected)));
    }

    @Test
    public void getterSetterMembers () {
        Team expected = new Team(12, 13);
        for (int i = 0; i<5; i++) {
            Student student = new Student(2);
            expected.addMember(student);
        }
        assertThat(expected.getMembers(), is(equalTo(expected)));
    }

    @Test
    public void getterCourseId () {
        int expected = 14;
        Team team = new Team(12, expected);
        assertThat(team.getCourseId(), is(equalTo(expected)));
    }

    @Test
    public void addMembers () {
        int expected = 14;
        Course course = new Course(12, 13, expected);
        assertThat(course.getMaxStudents(), is(equalTo(expected)));
    }
}
