package com.dannytom.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Bot {

    public final JDA api;
    public final long channelId;
    public final String content;


    public Bot(JDA api) {
        this.api = api;
        this.channelId = 744656464039378946L;
        this.content = "I am now online!";
    }

    public static void main(String[] args) {

        try {
            JDA api = JDABuilder.createDefault(SysConfig.myConfig())
                    .setActivity(Activity.listening("?test"))
                    .addEventListeners(new EventListener())
                    .build();
        } catch (LoginException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }



//    public void sayOnline() {
//        TextChannel channel = api.getTextChannelById(this.channelId);
//        //MessageChannel channel = api.getTextChannelById(this.channelId);
//
//        if(channel != null) {
//
//            channel.sendMessage(this.content).queue();
//        }
//
//
//    }

}
