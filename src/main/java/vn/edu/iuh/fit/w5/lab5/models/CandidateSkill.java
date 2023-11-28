package vn.edu.iuh.fit.w5.lab5.models;

import jakarta.persistence.*;

@Entity
@Table(name = "candidate_skill")
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candiate;

    @Column(name = "more_infos")
    private String infor;
    @Column(name = "skill_level")
    private int level;

    @Override
    public String toString() {
        return "CandidateSkill{" +
                "skill=" + skill +
                ", candiate=" + candiate +
                ", infor='" + infor + '\'' +
                ", level=" + level +
                '}';
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Candidate getCandiate() {
        return candiate;
    }

    public void setCandiate(Candidate candiate) {
        this.candiate = candiate;
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

    public CandidateSkill() {
    }

    public CandidateSkill(Skill skill, Candidate candiate, String infor, int level) {
        this.skill = skill;
        this.candiate = candiate;
        this.infor = infor;
        this.level = level;
    }
}