package wxk.student_sports.entity;

/**
 * @author 王学奎
 * @version 1.0
 * @className Academy
 * @description <学院的实体，注册用户的时候选择学院>
 * @date 2020/2/7 13:05
 */
public class Academy {
    private Integer academyId;
    private String academyName;

    public Academy() {
    }

    public Academy(Integer academyId, String academyName) {
        this.academyId = academyId;
        this.academyName = academyName;
    }

    public Integer getAcademyId() {
        return academyId;
    }

    public void setAcademyId(Integer academyId) {
        this.academyId = academyId;
    }

    public String getAcademyName() {
        return academyName;
    }

    public void setAcademyName(String academyName) {
        this.academyName = academyName;
    }

    @Override
    public String toString() {
        return "Academy{" +
                "academyId=" + academyId +
                ", academyName='" + academyName + '\'' +
                '}';
    }
}
