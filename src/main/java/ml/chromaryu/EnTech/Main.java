package ml.chromaryu.EnTech;

import ml.chromaryu.EnTech.Commands.AleatMe;
import ml.chromaryu.EnTech.Utils.BotConnector;
import org.pircbotx.Configuration;

/**
 * Created by chroma on 16/04/17.
 */
public class Main {
    public static void main(String[] args) throws Throwable{
        if(args.length == 3) {
            System.out.println("Welcome to EnTech Bot System.");
            BotConnector bot = new BotConnector();
            Configuration conf = new Configuration.Builder()
                    .setName(args[0])
                    .addServer(args[1])
                    .setAutoReconnect(true)
                    .setRealName("EnTech Bot")
                    .addAutoJoinChannel(args[2])
                    .addListener(new AleatMe())
                    .buildConfiguration();
            bot.startbot(conf);
        } else {
            System.out.println("Bot won't launch, because no launch string given");
        }
    }

}
