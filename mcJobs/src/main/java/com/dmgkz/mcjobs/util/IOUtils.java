package com.dmgkz.mcjobs.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.bukkit.plugin.Plugin;

public final class IOUtils {

    public static BufferedReader createResourceReader(Plugin plugin, String file) {
        InputStream inputStream = plugin.getResource(file);
        if (inputStream == null) {
            return null;
        } else {
            return new BufferedReader(new InputStreamReader(plugin.getResource(file), StandardCharsets.UTF_8));
        }
    }
}
