public interface IMultimediaPlayer {
    void playAudio();
    void playVideo();
}

public class MultimediaPlayer implements IMultimediaPlayer {
    @Override
    public void playAudio() {
        // Audio playback implementation
    }

    @Override
    public void playVideo() {
        // Video playback implementation
    }
}

public class AudioPlayer implements IMultimediaPlayer {
    @Override
    public void playAudio() {
        // Audio playback implementation
    }

    @Override
    public void playVideo() {
        // No need to implement, but it's forced to do so
    }
}
