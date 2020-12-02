package net.runelite.client.plugins.eggfurnace;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup("eggfurnace")
public interface EggFurnaceConfig extends Config {
    @ConfigSection(
            keyName = "delayConfig",
            name = "Sleep Delay Configuration",
            description = "Configure how the bot handles sleep delays",
            position = 0
    ) default boolean delayConfig()
    {
        return false;
    }
}
