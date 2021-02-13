package me.adversing.ErrorsAPI;

import me.adversing.ErrorsAPI.api.API;

public class Errors {
	
	static API API;
	static Errors instance; 
	
	/* SYSTEM SECTION */
	
	public static String CRITICAL_ERROR_HIGHEST = API.createMessage("[CRITICAL ERROR] A fatal error occurred whilst the program was running. Now it will shutdown.");
	public static String SERVICE_CURRENTLY_UNAVAILABLE = API.createMessage("[ERROR] The requested service is currently unavailable. Try again later.");
	public static String GENERIC_ERROR = API.createMessage("[ERROR #000] A generic error generated whilst running the program.");
	public static String DATABASE_ERROR_GENERAL = API.createMessage("[ERROR #001] A generic database error occurred whilst running the program.");
	
	/* SERVER SECTION */
	
	public static String WRONG_SERVER_VERSION = API.createMessage("[ERROR #002] The server is running on an unsupported version.");
	public static String OUTDATED_VERSION = API.createMessage("[ERROR #003] Outdated version detected.");
	public static String WRONG_CLIENT_VERSION = API.createMessage("[ERROR #004] Your client is running on an unsupported version.");
	public static String SERVER_CRASH = API.createMessage("[ERROR #005] The server crashed. Please check the console for more infos.");
	public static String FORBIDDEN_INTERACTION = API.createMessage("[ERROR #006] You cannot do this here.");
	public static String NO_PERMISSION = API.createMessage("[ERROR #007] No permission.");
	public static String CANNOT_FIND_OR_OFFLINE_SERVER = API.createMessage("[ERROR #008] The requested server cannot be found or it's offline.");
	
	/* PLAYER SECTION */
	
	public static String NO_PLAYER_DEFINED = API.createMessage("[ERROR #009] Needed argument 'player' cannot be found on the called field or method.");
	public static String PLAYER_NOT_ONLINE = API.createMessage("[ERROR #010] The requested player cannot be found in any server.");
	public static String PLAYER_NOT_EXISTENT = API.createMessage("[ERROR #011] The requested player has never joined the server.");
	public static String INVALID_PLAYER = API.createMessage("[ERROR #012] The requested player is invalid.");
	public static String CANNOT_INTERACT_WITH = API.createMessage("[ERROR #013] You cannot interact with this player.");
	public static String CANNOT_SEND_MESSAGE = API.createMessage("[ERROR #014] You cannot send messages to this player.");
	public static String CANNOT_PUNISH = API.createMessage("[ERROR #015] You cannot punish this player.");
	public static String CANNOT_RETRIEVE = API.createMessage("[ERROR #016] Cannot retrieve the requested informations.");
	public static String PLAYER_IS_BUSY = API.createMessage("[ERROR #017] That player is currently busy.");
	public static String CANNOT_PERFORM_COMMAND_ON_THAT_PLAYER = API.createMessage("[ERROR #018] You cannot perform this command on that player.");
	
	/* ACTIONS SECTION */
	
	public static String INVALID_ACTION = API.createMessage("[ERROR #019] Invalid action detected.");
	public static String CANCELLED_ACTION = API.createMessage("[ERROR #020] Your action has been deleted.");
	public static String INTERRUPTED_ACTION = API.createMessage("[ERROR #021] Your action has been interrupted.");
	
	/* PERMISSIONS & GRANTS SECTION */
	
	public static String NEW_RANK_ERROR = API.createMessage("[ERROR #022] An error occurred whilst creating a new rank.");
	public static String ERROR_WHILST_EDITING_RANK = API.createMessage("[ERROR #023] An error occurred whilst editing the selected rank.");
	public static String ERROR_WHILST_DELETING_RANK = API.createMessage("[ERROR #024] An error occurred whilst deleting the selected rank.");
	public static String ERROR_WHILST_EDITING_RANK_PERM = API.createMessage("[ERROR #025] An error occurred whilst updating / editing the selected rank's permissions.");
	public static String NO_RANK = API.createMessage("[ERROR #026] You have no rank set.");
	public static String DEFAULT_RANK = API.createMessage("[ERROR #027] You have the default rank.");
	public static String MAX_RANK_REACHED = API.createMessage("[ERROR #028] You have reached the highest rank available.");
	public static String GRANT_PROCEDURE_FAILED = API.createMessage("[ERROR #029] Grant procedure failed.");
	public static String NO_ACCESS = API.createMessage("[ERROR #030] You do not have access to this perk.");
	public static String GENERIC_SELECTION_ERROR = API.createMessage("[ERROR #031] There was an error selecting this perk. Please contact an admin.");
	
	/* QUEUE SECTION */
	
	public static String SERVER_FULL = API.createMessage("[ERROR #032] The selected server is full. Try again later or purchase a rank to bypass this restriction.");
	public static String SERVER_UNAVAILABLE = API.createMessage("[ERROR #033] The selected server is unavailable.");
	public static String SERVER_RESTRICTED_OR_WHITELISTED = API.createMessage("[ERROR #034] The selected server is restricted or whitelisted, and you're not whitelisted.");
	public static String QUEUE_PAUSED_ERROR = API.createMessage("[ERROR #035] An error occurred whilst pausing the selected queue.");
	public static String ERROR_WHILST_CREATING_NEW_QUEUE = API.createMessage("[ERROR #036] An error occurred whilst creating a new queue.");
	
	/* GENERIC GAMEMODES SECTION */
	
	public static String GAMEMODE_START_ERROR = API.createMessage("[ERROR #037] An error occurred whilst starting a new match.");
	public static String NOT_ENOUGH_PLAYERS = API.createMessage("[ERROR #038] It seems like that there aren't enough players to start a new match.");
	public static String ERROR_WHILST_CREATING_NEW_GAME = API.createMessage("[ERROR #039] An error occurred whilst creating a new match.");
	public static String ERROR_WHILST_DELETING_GAME = API.createMessage("[ERROR #040] An error occurred whilst deleting the selected game / match.");

	/* COMMAND FRAMEWORK SECTION */
	
	public static String ERROR_WHILST_INITIALIZING_COMMAND_FRAMEWORK = API.createMessage("[ERROR #041] An error occurred whilst initializing the command framework.");
	public static String WRONG_COMMAND_SYNTAX = API.createMessage("[ERROR #042] The syntax of the command is incorrect.");
	public static String ERROR_WHILST_PERFORMING_COMMAND = API.createMessage("[ERROR #043] An internal error occurred whilst performing this command.");
	public static String INVALID_COMMAND_TARGET = API.createMessage("[ERROR #044] You provided an invalid target for this command.");
	public static String INVALID_COMMAND = API.createMessage("[ERROR #045] That command does not exist.");
	
	/** 
	* @return The API instance.
	*/
	public static Errors getInstance() {
		return instance;
	}

	
	/** 
	* @return The API class.
	*/
	public API retrieveAPI() {
		return API;
	}
	
}
