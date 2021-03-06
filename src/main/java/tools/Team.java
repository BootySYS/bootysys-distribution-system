package tools;

import java.util.HashSet;

/**
 * Created by jakob on 23/10/15.
 */
public class Team {
    private int _teamId;
    private HashSet<Student> _members;
    private int _courseId;

    public Team (int teamId, int courseId) {
        _teamId = teamId;
        _courseId = courseId;
        _members = new HashSet<>();
    }

    public int getSize() {
        return _members.size();
    }

    public void addMember(Student student) {

    }

    public int getTeamId() {
        return _teamId;
    }

    public int getCourseId() {
        return _courseId;
    }

    public HashSet<Student> getMembers() {
        return _members;
    }
}
