package net.banana.backrooms.sound;

import net.banana.backrooms.Backrooms;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent FLUORESCENT_BUZZ = registerSoundEvent("fluorescent_buzz");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.tryParse(Backrooms.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Backrooms.LOGGER.info("Registering Sounds for " + Backrooms.MOD_ID);
    }
}
