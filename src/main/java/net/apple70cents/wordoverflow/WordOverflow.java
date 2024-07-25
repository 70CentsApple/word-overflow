package net.apple70cents.wordoverflow;

import net.apple70cents.wordoverflow.utils.LoggerUtils;
import net.fabricmc.api.ModInitializer;

/**
 * @author 70CentsApple
 */
public class WordOverflow implements ModInitializer {
    @Override
    public void onInitialize() {
        LoggerUtils.init();
        LoggerUtils.info("Successfully started Word Overflow");
    }
}
