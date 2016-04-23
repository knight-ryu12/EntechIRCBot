package ml.chromaryu.EnTech.Utils;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;

/**
 * Created by chroma on 16/04/17.
 */
public class BotConnector {
    public void startbot(Configuration conf) throws Throwable {
        PircBotX bot = new PircBotX(conf);
        bot.startBot();
    }
}
