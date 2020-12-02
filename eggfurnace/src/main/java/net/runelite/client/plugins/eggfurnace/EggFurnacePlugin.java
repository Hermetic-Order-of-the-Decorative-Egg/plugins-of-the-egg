package net.runelite.client.plugins.eggfurnace;

import com.google.inject.Provides;
import java.util.Set;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.MenuEntry;
import net.runelite.api.MenuOpcode;
import net.runelite.api.NPC;
import net.runelite.api.NpcID;
import net.runelite.api.Player;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.Notifier;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.plugins.iutils.CalculationUtils;
import net.runelite.client.plugins.iutils.MenuUtils;
import net.runelite.client.plugins.iutils.MouseUtils;
import net.runelite.client.plugins.iutils.iUtils;
import org.pf4j.Extension;

@PluginDependency(iUtils.class)
@Extension
@PluginDescriptor(
        name = "Egg Blast Furnace",
        enabledByDefault = false,
        description = "A holy gift from the decorative egg, to automate away our blast furnace woes.",
        tags = {"egg", "blast furnace", "bot"},
        type = PluginType.SKILLING
)
@Slf4j
public class EggFurnacePlugin extends Plugin {
    @Inject
    private iUtils utils;


}
