package me.frasufo.frasufo;

//import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
//import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
//import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;
//import org.bukkit.event.entity.PlayerDeathEvent;
//import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class frasufo extends JavaPlugin implements Listener
{
	public void onEnable(){
		System.out.println("FraSuFo aktiviert");
	}
	
	public void onDisable(){
		System.out.println("FraSuFo deaktiviert");
	}
	
	public void onPlayerChat(PlayerChatEvent chat){
		//String message = chat.getMessage();					//Nachricht abfangen
		Player player = chat.getPlayer();					//Spieler herausbekommen
		String playername = player.getDisplayName();		//Name des Spielers zwischenspeichern
		
		if(playername.equals("foxle")){						//wenn Name des Spielers = foxle ist,....
															//...schreibe in der Farbe
		}
		
		else if(playername.equals("iL_Sushii")){			//wenn Name des Spielers = iL_Sushii ist,....
															//...schreibe in der Farbe
		}
		
		else if (playername.equals("frankweslar")){			//wenn Name des Spielers = frankweslar ist,....
															//...schreibe in der Farbe
		}
		
		else{
			
		}	
	}
	
	public void onEntityDeath(EntityDeathEvent death){
	    //if(death.getEntity() instanceof Player){
		if (death.getEntity().getLastDamageCause().getCause() == DamageCause.LAVA){
			System.out.println("lava");
		}
	
	}
	//}
}