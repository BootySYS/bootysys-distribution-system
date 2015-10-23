package tools;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jakob on 23/10/15.
 */
public class StudentTest {

    @Test
    public void getterStudentId () {
        int expected = 12;
        Student student = new Student(expected);
        assertThat(student.getStudentId(), is(equalTo(expected)));
    }

}
