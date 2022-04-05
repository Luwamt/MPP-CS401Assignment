package mpp_cs401_assignments.MPP_CS401Assignment.com.lab2;

import java.util.List;

public class Release {
    private int releaseId;
    private List<Feature> features;

    public Release(int releaseId) {
        this.releaseId = releaseId;
    }

    public int getReleseId() {
        return releaseId;
    }

    public void setReleaseId(int releaseId) {
        this.releaseId = releaseId;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
