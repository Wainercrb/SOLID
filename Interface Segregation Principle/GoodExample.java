public interface IAudioPlayer {
    void playAudio();
}

public interface IVideoPlayer {
    void playVideo();
}

public class MultimediaPlayer implements IAudioPlayer, IVideoPlayer {
    // Implementation of both methods
}

public class AudioPlayer implements IAudioPlayer {
    // Implementation for audio playback
}
