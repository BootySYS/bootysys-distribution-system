package tools;

import java.util.HashSet;

/**
 * Created by jakob on 23/10/15.
 */
public class Course {
    private int _courseId;
    private int _groupId;
    private int _maxStudents;
    private HashSet<Team> _participants;

    public Course(int courseId, int groupId, int maxStudents) {
        _courseId = courseId;
        _groupId = groupId;
        _maxStudents = maxStudents;
        _participants = new HashSet<>();
    }

    public int getGroupId() {
        return _groupId;
    }

    public int getCourseId() {
        return _courseId;
    }

    public int getMaxStudents() {
        return _maxStudents;
    }

    public void addParticipant(Team team) {
        _participants.add(team);
    }

    public int getFreeSpaces() {
        int freeSpace = _maxStudents;
        for (Team team : _participants) {
            freeSpace = freeSpace - team.getSize();
        }
        return freeSpace;
    }

    public HashSet<Team> getTeams() {
        return _participants;
    }

    public void setMaxStudents(int newMax) {
        _maxStudents = newMax;
    }
}
