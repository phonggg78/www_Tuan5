package vn.edu.iuh.fit.w5.lab5.models;

import jakarta.persistence.*;

@Entity
@Table(name = "job")
public class Job {
    @Id
    @Column(name= "job_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

    @Column(name = "job_desc")
    private String jdesc;
    @Column(name = "job_name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getJdesc() {
        return jdesc;
    }

    public void setJdesc(String jdesc) {
        this.jdesc = jdesc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", company=" + company +
                ", jdesc='" + jdesc + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Job() {
    }

    public Job(long id, Company company, String jdesc, String name) {
        this.id = id;
        this.company = company;
        this.jdesc = jdesc;
        this.name = name;
    }
}
