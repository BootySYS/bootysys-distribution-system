package tools;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by jakob on 23/10/15.
 */
public class ConflictTest {

    @Test
    public void getterStart () {
        Course expected = new Course(1,2,3);
        Conflict conflict = new Conflict(expected, new Course(4,5,6));
        assertThat(conflict.getStart(), is(equalTo(expected)));
    }

    @Test
    public void getterEnd () {
        Course expected = new Course(1,2,3);
        Conflict conflict = new Conflict(new Course(4,5,6), expected);
        assertThat(conflict.getEnd(), is(equalTo(expected)));
    }
}
