package org.example;

import java.util.HashMap;
import java.util.Map;

public class GamePlayerManager implements IGamePlayerManager{

    Map<String, String> playersList = new HashMap<>();
    Map<String, Integer> scoreList = new HashMap<>();

    @Override
    public void registerPlayer(String playerId, String playerName){
        if(playerId != null && !playersList.containsKey(playerId)) {
            playersList.put(playerId, playerName);
        }
    }

    @Override
    public String getPlayerDetails(String playerId) {
        if(playerId == null || !playersList.containsKey(playerId)) return null;
        return playersList.get(playerId);
    }

    @Override
    public void updatePlayerScore(String playerId, int scoreToAdd) {

    }

    @Override
    public boolean checkLevelUp(String playerId) {
        return false;
    }

    @Override
    public boolean deletePlayer(String playerId) {
        if(playerId == null || !playersList.containsKey(playerId)) return false;
        playersList.remove(playerId);
        return true;
    }


}
