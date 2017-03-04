package com.coffeegem.commands;


import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by mshindle on 3/3/17.
 */
public class Ping extends AbstractCommand {
//    private static final String HELP = "USAGE: !ping";

    public Ping(MessageReceivedEvent event) {
        super(event);
    }

    @Override
    public boolean validate() {
        return true;
    }

    @Override
    public void execute() {
        MessageChannel channel = getEvent().getChannel();
        channel.sendMessage("Pong!").queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)
    }
}
