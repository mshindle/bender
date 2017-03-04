package com.coffeegem;

import com.coffeegem.commands.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 * Created by mshindle on 3/3/17.
 */
public class Listener extends ListenerAdapter {
    private Dispatcher dispatcher;

    public Listener(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (event.getAuthor().isBot()) return;
        Command cmd = dispatcher.dispatch(event);
        if (cmd.validate()) {
            cmd.execute();
        }
    }
}
