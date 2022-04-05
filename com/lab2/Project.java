package mpp_cs401_assignments.MPP_CS401Assignment.com.lab2;

import java.util.List;

public class Project {
    private int projectId;
    private List<Feature> features;
    private List<Release> releases;

    public Project(int projectIdtId) {
        this.projectId = projectId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<Release> getReleases() {
        return releases;
    }

    public void setReleases(List<Release> releases) {
        this.releases = releases;
    }
}
