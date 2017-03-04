package com.coffeegem;

import com.coffeegem.commands.Command;
import com.coffeegem.commands.Ping;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by mshindle on 3/3/17.
 */
public class SimpleDispatcher implements Dispatcher {
    @Override
    public Command dispatch(MessageReceivedEvent event) {
        Command cmd = null;
        Message message = event.getMessage();
        String content = message.getRawContent().toLowerCase().replaceFirst("!","");

        if (content.startsWith("ping")) {
            cmd = new Ping(event);
        }
        return cmd;
    }
}
