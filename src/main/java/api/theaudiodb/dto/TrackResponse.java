package api.theaudiodb.dto;

import java.util.List;

public class TrackResponse {

    private List<Track> track = null;

    public List<Track> getTrack() {
        return track;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
    }

}