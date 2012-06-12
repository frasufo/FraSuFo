package me.frasufo;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Frasufo extends JavaPlugin 
	implements Listener
{
	ChatColor reset = ChatColor.RESET;
	ChatColor farbe = ChatColor.WHITE;
	String server = "[" + ChatColor.BLUE + "Fra" + ChatColor.LIGHT_PURPLE + "Su" + ChatColor.GOLD + "Fo" + ChatColor.WHITE + "] ";
	public void onEnable(){
		System.out.println("FraSuFo aktiviert");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable(){
		System.out.println("FraSuFo deaktiviert");
	}
	@EventHandler
	public void onPlayerChat(PlayerChatEvent chat){
		String message = chat.getMessage();				
		Player player = chat.getPlayer();					
		String name = player.getName();
		chat.setCancelled(true);
		
		if(name.equals("foxle")){						
			farbe = ChatColor.GOLD;
		}
		
		else if(name.equals("iL_Sushii")){			
			farbe = ChatColor.LIGHT_PURPLE;
		}
		
		else if (name.equals("frankweslar")){			
			farbe = ChatColor.BLUE;										
		}
		
		else{
			farbe = ChatColor.RED;
		}	
		this.getServer().broadcastMessage("<" + farbe + name + reset + "> " + message);
	}
	@EventHandler
	  public void onEntityDeath(EntityDeathEvent death){
		if ((death.getEntity() instanceof HumanEntity)){
        Player player = (Player)death.getEntity();
        String name = player.getName();
        
        if (name.equals("frankweslar")){
        	farbe = ChatColor.BLUE;
        }
        
        else if (name.equals("foxle")){
        	farbe = ChatColor.GOLD;
        }
        
        else if (name.equals("iL_Sushii")){
        	farbe = ChatColor.LIGHT_PURPLE;
        }
        
        else{
        	farbe = ChatColor.RED;
        }
        
        
		PlayerDeathEvent player_death = (PlayerDeathEvent) death;
		player_death.setDeathMessage(null);
		String todesart = death.getEntity().getLastDamageCause().getCause().toString();
		
		if(todesart.equals("VOID")){
			this.getServer().broadcastMessage(server + farbe + name + reset + " findest du die Matrix Trilogie auch so gut, dass du sie in Minecraft sehen willst?");
		}
		
		else if(todesart.equals("LAVA")){
			this.getServer().broadcastMessage(server + farbe + name + reset + " heisser Whirlpool, den du dir da ausgesucht hast!");
		}
		
		else if(todesart.equals("CONTACT")){
			this.getServer().broadcastMessage(server + farbe + name + reset + " du Ekel, man rammelt doch keinen Kaktus!");
		}
		
		else if(todesart.equals("FIRE")){
			this.getServer().broadcastMessage(server + "Messer,Schere,Feuer,Licht - ist für kleine " + farbe + name + reset + " nicht!");
		}
		
		else if(todesart.equals("DROWNING")){
			int low = 1;
		    int high = 3;
		    int ergebnis = (int)(Math.random() * (high - low) + low);
		    String ergebnis_string = String.valueOf(ergebnis);
		     
			if(ergebnis_string.equals("1"))this.getServer().broadcastMessage(ergebnis_string + server + "Auch einem " + farbe + name + reset + " geht mal die Puste aus!");
			if(ergebnis_string.equals("2"))this.getServer().broadcastMessage(server + farbe + name + reset + " ich dachte du bist wieder dicht (drunk), wohl eher undicht!");
		}
		
		else if(todesart.equals("BLOCK_EXPLOSION")){
			int low = 1;
		    int high = 3;
		    int ergebnis = (int)(Math.random() * (high - low) + low);
		    String ergebnis_string = String.valueOf(ergebnis);
		    
			if(ergebnis_string.equals("1"))this.getServer().broadcastMessage(server + "Metzger: Ein borstiger " + farbe + name + reset + " in 200gr Fetzen nur 0,2€ das Stück!");
			if(ergebnis_string.equals("2"))this.getServer().broadcastMessage(server + "Metzger: Heute im Angebot! " + farbe + name + reset + " Gulasch nur 2,4€ die Portion!");
		}
		
		else if(todesart.equals("FALL")){
			this.getServer().broadcastMessage(server + "I believe " + farbe + name + reset + " can't fly, I believe I can touch the sky ♫♪");
		}
		
		else{
			if(name.equals("frankweslar")){
				int low = 1;
		        int high = 5;
		        int ergebnis = (int)(Math.random() * (high - low) + low);
		        String ergebnis_string = String.valueOf(ergebnis);
		        
		        if (ergebnis_string.equals("1")) this.getServer().broadcastMessage(server + farbe + name + reset + " war bestimmt ein Wackler vom W-Lan Stick!");
		        if (ergebnis_string.equals("2")) this.getServer().broadcastMessage(server + farbe + name + reset + " mit Windows wäre dir das nicht passiert!");
		        if (ergebnis_string.equals("3")) this.getServer().broadcastMessage(server + farbe + name + reset + " nicht aufgeben! Weiterkämpfen!");
		        if (ergebnis_string.equals("4")) this.getServer().broadcastMessage(server + farbe + name + reset + " das nächste mal denkste einfach der Mob wäre drölf, dann passiert dir das nicht mehr!");
			}
			
			else if(name.equals("foxle")){
				int low = 1;
		        int high = 5;
		        int ergebnis = (int)(Math.random() * (high - low) + low);
		        String ergebnis_string = String.valueOf(ergebnis);

		        if (ergebnis_string.equals("1")) this.getServer().broadcastMessage(server + reset + "Du bist trotzdem noch der King!");
		        if (ergebnis_string.equals("2")) this.getServer().broadcastMessage(server + farbe + name + reset + " ich hab gehört er hat den FC Bayern beleidigt :o");
		        if (ergebnis_string.equals("3")) this.getServer().broadcastMessage(server + farbe + name + reset + " Musstest du über 'Unöffentlichkeitisierung' lachen?");
		        if (ergebnis_string.equals("4")) this.getServer().broadcastMessage(server + "Armer " + farbe + name + reset + " ;(:(");

			}
			
			else if(name.equals("iL_Sushii")){
				int low = 1;
		        int high = 6;
		        int ergebnis = (int)(Math.random() * (high - low) + low);
		        String ergebnis_string = String.valueOf(ergebnis);

		        if (ergebnis_string.equals("1")) this.getServer().broadcastMessage(server + farbe + name + reset + " geh doch vor dem Noobtuber in Deckung (facepalm)");
		        if (ergebnis_string.equals("2")) this.getServer().broadcastMessage(server + farbe + name + reset + " was is da denn los ó.O? Lässt dich von einem Akimbonoob zerstückeln!");
		        if (ergebnis_string.equals("3")) this.getServer().broadcastMessage(server + "OMG " + farbe + name + reset + " deine Kill/Death rate geht in den Keller!");
		        if (ergebnis_string.equals("4")) this.getServer().broadcastMessage(server + farbe + name + reset + " mit einer M.O.A.B. haste wohl nicht gerechnet was? :D");
		        if (ergebnis_string.equals("5")) this.getServer().broadcastMessage(server + "Hat " + farbe + name + reset + " eine mongotive Schelle erhalten?");
			}
			
			else{
				this.getServer().broadcastMessage(server + "Auf Frasufo stirbt man normalerweise nicht " + farbe + name);
			}
		}
		}
		
	}
	@EventHandler
	public void onChange(PlayerChangedWorldEvent change){
		Player player = change.getPlayer();
		String name = player.getDisplayName();
		String welt = player.getWorld().getEnvironment().name();
	
		if(name.equals("foxle")){						
			farbe = ChatColor.GOLD;
		}
		
		else if(name.equals("iL_Sushii")){			
			farbe = ChatColor.LIGHT_PURPLE;
		}
		
		else if (name.equals("frankweslar")){			
			farbe = ChatColor.BLUE;										
		}
		
		else{
			farbe = ChatColor.RED;
		}	
	      
	      if (welt.equals("NORMAL")) this.getServer().broadcastMessage(server + farbe + name + reset + " ist in der normalen Welt");
		  if (welt.equals("NETHER")) this.getServer().broadcastMessage(server + farbe + name + reset + " ist im Nether");
	  }
	 
	public void onPlayerJoin(PlayerJoinEvent join){
		Player player = join.getPlayer();
		String name = player.getDisplayName();
		join.setJoinMessage(null);
		
		if(name.equals("frankweslar")){
			farbe = ChatColor.BLUE;
			int low = 1;
		    int high = 6;
		    int ergebnis = (int)(Math.random() * (high - low) + low);
		    String ergebnis_string = String.valueOf(ergebnis);

		    if (ergebnis_string.equals("1")) join.setJoinMessage(server + "Achtet auf die Rechtschreibung, Klugscheisser " + farbe + name + reset + " ist online!");
		    if (ergebnis_string.equals("2")) join.setJoinMessage(server + "Achtung Admin " + farbe + name + reset + " ist online!");
		    if (ergebnis_string.equals("3")) join.setJoinMessage(server + "Apple Hater " + farbe + name + reset + " in Sicht!");
		    if (ergebnis_string.equals("4")) join.setJoinMessage(server + "Linux-Fanboy " + farbe + name + reset + " ist online!");
		    if (ergebnis_string.equals("5")) join.setJoinMessage(server + farbe + name + reset + " jetzt mal mehr Kreativität zeigen!");
		}
		
		else if(name.equals("foxle")){
			farbe = ChatColor.GOLD;
			int low = 1;
			int high = 5;
			int ergebnis = (int)(Math.random() * (high - low) + low);
		    String ergebnis_string = String.valueOf(ergebnis);
			
			if (ergebnis_string.equals("1")) join.setJoinMessage(server + "Hallo " + farbe + name + reset + ", oh sorry, ich mein natürlich: foooooooooooooooooooooooooox");
		    if (ergebnis_string.equals("2")) join.setJoinMessage(server + "Oh " + farbe + name + reset + ", bist du auch mal wieder hier?");
		    if (ergebnis_string.equals("3")) join.setJoinMessage(server + "Hat Sushii wieder mehr Kills @ " + farbe + name);
		    if (ergebnis_string.equals("4")) join.setJoinMessage(server + "Du brauchst garnicht 'Erwischt' zu rufen " + farbe + name + reset + ", wir machen nix schlimmes");
		}
		
		else if(name.equals("iL_Sushii")){
			farbe = ChatColor.LIGHT_PURPLE;
			int low = 1;
		    int high = 5;
		    int ergebnis = (int)(Math.random() * (high - low) + low);
		    String ergebnis_string = String.valueOf(ergebnis);

		    if (ergebnis_string.equals("1")) join.setJoinMessage(server + farbe + name + reset + " haste gegen BF3 kapituliert?");
		    if (ergebnis_string.equals("2")) join.setJoinMessage(server + "Drohne hat " + farbe + name + reset + " gesichtet!");
		    if (ergebnis_string.equals("3")) join.setJoinMessage(server + "Battlelog down " + farbe + name + reset + " ?");
		    if (ergebnis_string.equals("4")) join.setJoinMessage(server + farbe + name + reset + ", bester Mann (nach foxle), ist online!");
		}
		
		else{
			farbe = ChatColor.RED;
			join.setJoinMessage(server + "Willkommen auf FraSuFo " +farbe + name);
		}
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label) {
  		Player player = (Player) sender;
  		String name = player.getName();
  		World world = (World) player.getWorld();
  		if(name.equals("foxle")){						
			farbe = ChatColor.GOLD;
		}
		
		else if(name.equals("iL_Sushii")){			
			farbe = ChatColor.LIGHT_PURPLE;
		}
		
		else if (name.equals("frankweslar")){			
			farbe = ChatColor.BLUE;										
		}
		
		else{
			farbe = ChatColor.RED;
		}
  		
  		if (player.isOp()){
			if (command.getName().equalsIgnoreCase("day")){
				this.getServer().broadcastMessage(server + "Es wurde Tag, Danke an " + farbe + name);
				world.setTime(0);
				return true;
			}
			else if(command.getName().equalsIgnoreCase("night")){
				this.getServer().broadcastMessage(server + "Es wurde Nacht, Danke an " + farbe + name);
				world.setTime(12531);
				return true;
			}
		else{
			player.sendMessage(server + "Du hast keine Rechte" + farbe + name);
			return false;
		}		
  	}
  		return false;	
  		}
}
