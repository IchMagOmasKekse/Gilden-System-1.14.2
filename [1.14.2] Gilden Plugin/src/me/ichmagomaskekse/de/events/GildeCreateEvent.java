package me.ichmagomaskekse.de.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GildeCreateEvent extends Event {
	
	private static final HandlerList handlers = new HandlerList();
	private String gilden_name = "Unbekannte Gilde";
	private CommandSender command_sender = null;
	private boolean wasSuccessful = false;
	private boolean sendMessage = true;
	
	public GildeCreateEvent(CommandSender sender, String gilden_name, boolean wasSuccessful) {
		this.command_sender = sender;
		this.gilden_name = gilden_name;
		this.wasSuccessful = wasSuccessful;
	}
	public GildeCreateEvent(CommandSender sender, String gilden_name, boolean wasSuccessful, boolean sendMessage) {
		this.command_sender = sender;
		this.gilden_name = gilden_name;
		this.wasSuccessful = wasSuccessful;
		this.sendMessage = sendMessage;
	}
	public GildeCreateEvent(CommandSender sender, boolean wasSuccessful) {
		this.command_sender = sender;
		this.wasSuccessful = wasSuccessful;
	}
	public GildeCreateEvent(CommandSender sender, boolean wasSuccessful, boolean sendMessage) {
		this.command_sender = sender;
		this.wasSuccessful = wasSuccessful;
		this.sendMessage = sendMessage;
	}
	
	public String getGildenName() {
		return gilden_name;
	}
	
	public CommandSender getCreator() {
		return command_sender;
	}
	
	public boolean wasSuccessful() {
		return wasSuccessful;
	}
	public boolean sendMessage() {
		return sendMessage;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	public static HandlerList getHandlerList() {
		return handlers;
	}

}
