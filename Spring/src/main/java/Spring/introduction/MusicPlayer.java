package Spring.introduction;

import org.springframework.beans.factory.annotation.Qualifier;

import java.awt.*;

public class MusicPlayer {
    private List music;

    public MusicPlayer(@Qualifier ("rockMusic") Music music1,
        @Qualifier("classicMusic") Music music2){
//        this.music1 = music1;
//        this.music2 = music2;

    }

//    void PlayMusic(){
//        music1.playMusic();
//    }
}
