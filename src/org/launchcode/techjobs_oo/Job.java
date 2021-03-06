package src.org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//    @Override
//    public String toString(Job name) {
//        return toString();
//    }

    @Override
    public String toString() {
        String jobDescription;
        if (getName() == "") {
            name = "Data not available";
        }
        if (getEmployer().getValue() == "") {
            getEmployer().setValue("Data not available");
        }
        if (getLocation().getValue() == "") {
            getLocation().setValue("Data not available");
        }
        if (getPositionType().getValue() == "") {
            getPositionType().setValue("Data not available");
        }
        if (getCoreCompetency().getValue() == "") {
            getCoreCompetency().setValue("Data not available");
        }
        jobDescription = (getName() == "Data not available" && getEmployer().getValue() == "Data not available" && getLocation().getValue() == "Data not available"
                && getPositionType().getValue() == "Data not available" && getCoreCompetency().getValue() == "Data not available")
                ? "\n OOPS! This job does not seem to exist.\n" : "\n" + "ID: " + getId() + "\n" + "Name: "
                + getName() + "\n" + "Employer: " + getEmployer() + "\n" + "Location: " + getLocation() + "\n" +
                "Position Type: " + getPositionType() + "\n" + "Core Competency: " + getCoreCompetency() + "\n";

            return jobDescription;

    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}

