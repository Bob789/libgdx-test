package net.toyknight.test;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class GameContext extends ApplicationAdapter {

    private BitmapFont font;

    private SpriteBatch batch;

    @Override
    public void create() {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("test_font.ttf"));
        String characters = Gdx.files.internal("characters.txt").readString("UTF8");
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 24;
        parameter.color = Color.WHITE;
        parameter.borderColor = Color.BLACK;
        parameter.borderWidth = 3;
        parameter.characters = FreeTypeFontGenerator.DEFAULT_CHARS + characters;
        font = generator.generateFont(parameter);

        batch = new SpriteBatch();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0.9f, 0.9f, 0.9f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        font.draw(batch, "This is a test string zzz...", 10, Gdx.graphics.getHeight() / 2);
        batch.end();
    }

    @Override
    public void dispose() {
        font.dispose();
    }

}
