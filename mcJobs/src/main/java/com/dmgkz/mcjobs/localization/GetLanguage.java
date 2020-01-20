package com.dmgkz.mcjobs.localization;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.dmgkz.mcjobs.McJobs;
import com.dmgkz.mcjobs.prettytext.AddTextVariables;
import com.dmgkz.mcjobs.prettytext.PrettyText;
import com.dmgkz.mcjobs.util.IOUtils;

public class GetLanguage {
	private McJobs plugin;

	private FileConfiguration fcLocal;
	private File              dLocal;

	public GetLanguage(McJobs plugin){
		this.plugin = plugin;
		this.fcLocal = null;
		this.dLocal = null;
	}

	public String getEntity(String entName){
		String name = null;
		String temp = entName.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("entities");

		name = section.getString(temp);

		if(name == null)
			name = "Unknown value: " + entName;

		return PrettyText.colorText(name);
	}

	public String getMaterial(String matName){
		String name = null;
		String temp = matName.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("materials");

		name = section.getString(temp);

		if(name == null)
			name = "Unknown value: " + matName;

		return PrettyText.colorText(name);
	}

	public String getPotion(String potName){
		String name = null;
		String temp = potName.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("potions");

		name = section.getString(temp);

		if(name == null)
			name = "Unknown value: " + potName;

		return PrettyText.colorText(name);
	}

	public String getEnchant(String enchantName){
		String name = null;
		String temp = enchantName.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("enchant");

		name = section.getString(temp);

		if(name == null)
			name = "Unknown value: " + enchantName;

		return PrettyText.colorText(name);
	}

	public AddTextVariables getJobCommand(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobscommand");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getJobDisplay(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobsdisplay");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getJobNotify(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobsnotify");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getJobJoin(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobsjoin");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getJobLeave(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobsleave");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getJobList(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobslist");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getJobHelp(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("jobshelp");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getAdminCommand(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("admincommand");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getAdminAdd(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("adminadd");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getAdminRemove(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("adminremove");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getAdminList(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("adminlist");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getAdminLogin(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("onadminlogin");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getPitch(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("pitch");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getPayment(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("payment");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public AddTextVariables getExperience(String subSection){
		String sString = null;
		String temp = subSection.toLowerCase();
		ConfigurationSection section = fcLocal.getConfigurationSection("experience");

		sString = section.getString(temp);
		sString = PrettyText.colorText(sString);

		AddTextVariables addText = new AddTextVariables(sString);

		return addText;
	}

	public Integer getSpaces(String subSection){
		ConfigurationSection section = fcLocal.getConfigurationSection("spaces");

		return section.getInt(subSection);
	}

	public void loadLanguage(String lang) throws InvalidConfigurationException{
		String language;

		if(lang == null || lang.isEmpty())
			language = "english";
		else
			language = lang;

		if(fcLocal == null){
			if(language.equalsIgnoreCase("custom")){
                // もし、カスタムな言語だったら
				if(dLocal == null){
					dLocal = new File(plugin.getDataFolder(), "custom.yml");
				}
				fcLocal = YamlConfiguration.loadConfiguration(dLocal);

				if(!dLocal.exists()){
                    // TODO: ?????
					YamlConfiguration defConfig;
                    try (BufferedReader reader = IOUtils.createResourceReader(plugin, "english.yml")) {
                        defConfig = YamlConfiguration.loadConfiguration(reader);
                    } catch (IOException e) {
                        McJobs.getPlugin().getLogger().info("Unable to load english.yml");
                        return;
                    }

					fcLocal.setDefaults(defConfig);

					try (BufferedReader reader = IOUtils.createResourceReader(plugin, "english.yml")) {
						fcLocal.load(reader);
					} catch (IOException e) {
						McJobs.getPlugin().getLogger().info("Unable to load english.yml to custom.yml");
					}

					try {
						fcLocal.save(dLocal);
					} catch (IOException e) {
						McJobs.getPlugin().getLogger().info("Unable to save custom.yml!");
					}
				}
				else{
					McJobs.getPlugin().getLogger().info("Loading custom.yml...");
					YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(dLocal);
					fcLocal.setDefaults(defConfig);
				}
			}
			else{
                // かすたむじゃなかったら
				String filename = language.toLowerCase() + ".yml";

				if(dLocal == null){
					dLocal = new File(plugin.getDataFolder(), filename);
				}
				fcLocal = YamlConfiguration.loadConfiguration(dLocal);

                try (BufferedReader reader = IOUtils.createResourceReader(plugin, filename)) {
                    if(reader != null) {
                        YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(reader);
                        fcLocal.setDefaults(defConfig);
                    } else {
                        plugin.getLogger().info(filename + " is not a valid language file!  Using English instead.");

                        dLocal = new File(plugin.getDataFolder(), "english.yml");
                        fcLocal = YamlConfiguration.loadConfiguration(dLocal);

                        try (BufferedReader reader1 = IOUtils.createResourceReader(plugin, "english.yml")) {
                            YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(reader1);
                            fcLocal.setDefaults(defConfig);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
		}
	}
}
