package com.coffeegem;

import com.coffeegem.commands.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * Created by mshindle on 3/3/17.
 */
public interface Dispatcher {
    Command dispatch(MessageReceivedEvent event);
}
