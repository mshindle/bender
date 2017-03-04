package com.coffeegem.commands;


import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by mshindle on 3/3/17.
 */
public interface Command {
    /**
     * Validates the event
     *
     * @return true if event command is valid
     */
    boolean validate();

    /**
     * Executes the command
     */
    void execute();
}
