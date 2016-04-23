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
    ArrayList<String> MessageList = new ArrayList<>(10);
    ArrayList<String> NameList = new ArrayList<>(10);
    int MLsize = MessageList.size();
    int NLsize = NameList.size();
    @Override
    public void onMessage(MessageEvent event) throws Exception {
        if(event.getMessage().contains("!noticeme")) {
            String[] args = event.getMessage().split(" ");
            System.out.println(args.length);
            for(int i = 0; i<=args.length-1;i++) {
                System.out.println(args[i] + i);
            }
            if(args.length == 3) {
                NameList.set(NLsize,args[1]);
                System.out.println("NL setted!");
                MessageList.set(MLsize, args[2]);
                System.out.println("ML setted!");
                System.out.println(NLsize + " " + MLsize + " " + args[0] + " " + args[1] + " " +args[2]);
                event.getChannel().send().message(event.getBot().getNick() + ": Okay. I'll notice to " + args[1]);
                MLsize++;
                NLsize++;
                System.out.println(NLsize + " " + MLsize + " " + args[0] + " " + args[1] + " " + args[2]);
            } else if (args.length < 3){
                event.respond("Less augment. check :3");
            } else {
                event.respond("Check args.");
            }
        }
        if (event.getMessage().equalsIgnoreCase("!testArray")) {
            String[] args = event.getMessage().split(" ");
            String ret = MessageList.get(Integer.parseInt(args[1]));
            if(ret == null) {
                event.respond("null returns,");
            } else {
                event.respond(args[1] + " has " + ret);
            }
        }
    }
}
