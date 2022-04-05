package mpp_cs401_assignments.MPP_CS401Assignment.com.lab2;

import java.util.List;

public class Developer {
    private int developerId;
    private List<Feature> features;

    public Developer(int developerId) {
        this.developerId = developerId;
    }

    public int getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(int developerId) {
        this.developerId = developerId;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
