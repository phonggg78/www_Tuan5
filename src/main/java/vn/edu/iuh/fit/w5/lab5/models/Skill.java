package vn.edu.iuh.fit.w5.lab5.models;

import jakarta.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;
    @Column(name = "skill_desc")
    private String sDesc;
    @Column(name = "skill_name")
    private String name;
    @Column(name = "skill_type")
    private int type;

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", sDesc='" + sDesc + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public Skill() {
    }

    public Skill(long id, String sDesc, String name, int type) {
        this.id = id;
        this.sDesc = sDesc;
        this.name = name;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
