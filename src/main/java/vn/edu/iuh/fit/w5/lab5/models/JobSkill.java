package vn.edu.iuh.fit.w5.lab5.models;

import jakarta.persistence.*;
@Entity
@Table(name = "job_skill")
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name="job_id")
    private Job job;

    @Id
    @ManyToOne
    @JoinColumn(name="skill_id")
    private Skill skill;

    @Column(name = "more_infos")
    private String infor;
    @Column(name = "skill_level")
    private int level;

    @Override
    public String toString() {
        return "JobSkill{" +
                "job=" + job +
                ", skill=" + skill +
                ", infor='" + infor + '\'' +
                ", level=" + level +
                '}';
    }

    public JobSkill() {
    }

    public JobSkill(Job job, Skill skill, String infor, int level) {
        this.job = job;
        this.skill = skill;
        this.infor = infor;
        this.level = level;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
