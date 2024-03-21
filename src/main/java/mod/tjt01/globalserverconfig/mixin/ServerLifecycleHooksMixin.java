package mod.tjt01.globalserverconfig.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.server.ServerLifecycleHooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.nio.file.Path;

@Mixin(ServerLifecycleHooks.class)
public class ServerLifecycleHooksMixin {
    /**
     * @author TJT01
     */
    @Overwrite(remap = false)
    private static Path getServerConfigPath(final MinecraftServer minecraftServer) {
        return FMLPaths.CONFIGDIR.get();
    }
}
