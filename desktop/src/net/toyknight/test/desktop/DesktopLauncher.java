package net.toyknight.test.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.toyknight.test.GameContext;

public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 848;
        config.height = 480;
        config.title = "Test";
        config.fullscreen = false;
        new LwjglApplication(new GameContext(), config);
    }

}
