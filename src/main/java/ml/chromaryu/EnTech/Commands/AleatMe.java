package ml.chromaryu.EnTech.Commands;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

import javax.lang.model.element.Name;
import java.io.Console;
import java.util.ArrayList;

/**
 * Created by chroma on 16/04/17.
 */
public class AleatMe extends ListenerAdapter {
    String[] MessageList = new String[100];
    String[] NickList = new String[100];
    int MLc = MessageList.length,NLc = NickList.length;
    @Override
    public void onMessage(MessageEvent event) throws Exception {
        if(event.getMessage().contains("!aleatme")) {
            String[] args = event.getMessage().split(" ");
            if(args.length == 3) {
                MessageList[MLc] = args[1];
                NickList[NLc] = args[2];
                MLc--;
                NLc--;
            }
        }
    }
}

/*
Command Input = !alertme <args1> <args2>
args1 = IRC Nickname that respond with args2 when args1 is online and joined bot channel
args2 = message body

 */