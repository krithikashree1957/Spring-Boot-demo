package com.spring_boot;

public class SoftwareEngineer {

    private Integer id;
    private String name;
    private String techstack;

    public SoftwareEngineer(Integer id, String name, String techstack) {
        this.id = id;
        this.name = name;
        this.techstack = techstack;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechstack() {
        return techstack;
    }

    public void setTechstack(String techstack) {
        this.techstack = techstack;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((techstack == null) ? 0 : techstack.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SoftwareEngineer other = (SoftwareEngineer) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (techstack == null) {
            if (other.techstack != null)
                return false;
        } else if (!techstack.equals(other.techstack))
            return false;
        return true;
    }


}
