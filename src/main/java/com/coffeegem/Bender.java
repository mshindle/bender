package com.coffeegem;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

/**
 * Created by mshindle on 3/3/17.
 */
public class Bender {
    private static final String DISCORD_TOKEN = "";

    public static void main(String[] args) {
        try {
            Dispatcher dispatcher = new SimpleDispatcher();
            Listener listener = new Listener(dispatcher);
            JDA api = new JDABuilder(AccountType.BOT)
                    .addListener(listener)
                    .setToken(DISCORD_TOKEN)
                    .buildBlocking();
            api.setAutoReconnect(true);
        } catch (LoginException le) {
            throw new DiscordException("bad token",le);
        } catch (RateLimitedException rle) {
            throw new DiscordException("connected too many times", rle);
        } catch (InterruptedException ie) {
            throw new DiscordException("connection interrupted", ie);
        }
    }
}
