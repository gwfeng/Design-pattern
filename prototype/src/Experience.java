/**
 * @Author: feng
 * @Date: 2019/12/22 17:41
 * @Description:
 */
public class Experience {
    private String time;
    private String company;

    public Experience(String time, String company) {
        this.time = time;
        this.company = company;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "time='" + time + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}