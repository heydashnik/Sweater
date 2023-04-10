package Spring.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ClassicMusic classicMusic = context.getBean("classicMusic", ClassicMusic.class);
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.PlayMusic();

    }
}
