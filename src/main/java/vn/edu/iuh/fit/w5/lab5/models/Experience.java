package vn.edu.iuh.fit.w5.lab5.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "experience")
public class Experience {
    @Id
    private long id;
    private String company;
    @Column(name = "from_date")
    private Date fromDate;
    private  String role;
    @Column(name = "to_date")
    private Date toDate;
    @Column(name = "work_desc")
    private String workdesc;
    @OneToOne
    @JoinColumn(name = "candiate_id")
    private Candidate candiateid;

    public Experience(String company, Date fromDate, String role, Date toDate, String workdesc, Candidate candiateid) {
        this.company = company;
        this.fromDate = fromDate;
        this.role = role;
        this.toDate = toDate;
        this.workdesc = workdesc;
        this.candiateid = candiateid;
    }

    public Experience() {
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", fromDate=" + fromDate +
                ", role='" + role + '\'' +
                ", toDate=" + toDate +
                ", workdesc='" + workdesc + '\'' +
                ", candiateid=" + candiateid +
                '}';
    }
}
