package ac.grim.grimac.api.events;

import ac.grim.grimac.api.GrimUser;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class JoinEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final GrimUser grimUser;

    public JoinEvent(GrimUser grimUser) {
        this.grimUser = grimUser;
    }

    public GrimUser getPlayer() {
        return grimUser;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
