# ErrorsAPI
This API will help you to implement tons of new error messages, by simply getting the API informations with the error message you want to display.

## ✨ | FEATURES
This API contains over **40+** custom error messages that can be retrieved simply by calling the Main class.

It contains error messages regarding SYSTEMS, SERVERS, PLAYERS, ACTIONS and more!

## 📃 | DOCUMENTATION
Using this API is very simple. 
In order to access the various Strings, you can call the Main class in a method:

```
sender.sendMessage(Errors.PLAYER_NOT_ONLINE);
```
You can also implement other ChatColor APIs provided by Bukkit, as it follows:

```
Bukkit.getConsoleSender().sendMessage(ChatColor.RED + Errors.SERVER_CRASH);
```
For creating new messages with my API system, you have just to re-call the **Main class instance**, by using the method ```.retrieveAPI()```.

_Code example_:

```
String test = Errors.getInstance().retrieveAPI().createMessage("This is a test. Yay!");
Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + test);
```
