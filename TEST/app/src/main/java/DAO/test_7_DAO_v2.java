package DAO;

import DTO.test_7_DTO_v2;
import javax.servlet.http.HttpSession;

public class test_7_DAO_v2 {
    private static final String GAME_MODEL_KEY = "gameModel";

    public test_7_DTO_v2 getGameModel(HttpSession session) {
        test_7_DTO_v2 gameModel = (test_7_DTO_v2) session.getAttribute(GAME_MODEL_KEY);
        if (gameModel == null) {
            gameModel = new test_7_DTO_v2();
            session.setAttribute(GAME_MODEL_KEY, gameModel);
        }
        return gameModel;
    }

    public void updateGameModel(HttpSession session, test_7_DTO_v2 gameModel) {
        session.setAttribute(GAME_MODEL_KEY, gameModel);
    }
}
