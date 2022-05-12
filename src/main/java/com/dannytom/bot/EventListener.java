package com.dannytom.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

//Role IDs:
// @TOW <966401049277636638>
// @TOW Academy <972348775253311512>
// @TOW Partners <972544091571249202>
// @Tow Leaders <968165411407413318>
// @Last Fortress <968166203757568010>


public class EventListener extends ListenerAdapter {

    public void onReady(ReadyEvent event) {

        JDA jda = event.getJDA();

        MessageChannel channel = jda.getTextChannelById(744656464039378946L); // #public-chat
        channel.sendMessage("Woo Hoo! I broke my rusty cage and ran..").queue(); // sends message to channel
        System.out.println("I am now ready"); // sends message to console

    }

//	public String responses() {
//		String message = "";
//		return message;
//
//	}


    public void onMessageReceived(MessageReceivedEvent event) {
//		System.out.println("Some nerd said " + event.getMessage().getContentRaw());


        if (event.getAuthor().isBot()) return;

        Message message = event.getMessage();
        String content = message.getContentRaw();
        MessageChannel channel = event.getChannel();

//	        channel.sendMessage(event.getMessage().getContentRaw()).queue(); // echos what someone types

//	        channel.sendMessage("<@everyone> Hello! I am a bot! This is just a test, not a d*** so don't take it so hard! :thinking:").queue();

        if (content.startsWith("?test")) {
            channel.sendMessage(":thinking: This is just a test, Strike First! Strike Hard! FirstStrike - https://firststrike.dannytom.com - right <@>").queue();
            //channel.sendMessage(":thinking: Someone better get studying... <@897116582684274730>fazoli :rofl:").queue();
            // <@697231997734617168> Devixnt
            // <@788993788282011689> Zach
            //<@744224270548467805> Me
            // <@897116582684274730> Chloe
//	             <@&911301839549517896> Security+ group
            System.out.println("test invoked");
        }
        if (content.startsWith("?judge")) {
            channel.sendMessage(":thinking: Ok, I will have to be unbiased and say it's the fault of <@>").queue();
        }
        if (content.toLowerCase().contains("right")) {
            channel.sendMessage(":thinking: YES! you are correct").queue();
        }

        if (content.toLowerCase().contains("fuck")) {
            channel.sendMessage(":thinking: Someone said fuck... ohh snap!").queue();
        }
        if (content.toLowerCase().contains("luck")) {
            channel.sendMessage(":thinking: I guess good luck on that!").queue();
        }
        if (content.toLowerCase().contains("crazy")) {
            channel.sendMessage(":thinking: Hey! I love crazy.. show me you sexy thing!").queue();
        }
        if (content.toLowerCase().contains("wtf")) {
            channel.sendMessage(":thinking: WTF indeed... I agree with ^^").queue();
        }

    }
}
