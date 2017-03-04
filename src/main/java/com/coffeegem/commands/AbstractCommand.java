package com.coffeegem.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by mshindle on 3/3/17.
 */
public abstract class AbstractCommand implements Command {
    private MessageReceivedEvent event;

    public AbstractCommand(MessageReceivedEvent event) {
        this.event = event;
    }

    public MessageReceivedEvent getEvent() {
        return event;
    }
}
