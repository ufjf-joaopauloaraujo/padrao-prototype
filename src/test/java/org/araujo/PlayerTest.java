package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    public static final String NOME = "Wolverine";
    public static final int LEVEL = 10;
    public static final int SCORE_INCREASE = 5;

    @Test
    void validateClass() {
        Player player1 = new Player(NOME, LEVEL);
        player1.addScore(SCORE_INCREASE);
        player1.addScore(SCORE_INCREASE);
        assertEquals(NOME, player1.getName());
        assertEquals(LEVEL, player1.getLevel());
        assertEquals(SCORE_INCREASE * 2, player1.getScore());
    }

    @Test
    void validateClone() throws CloneNotSupportedException {
        Player player1 = new Player(NOME, LEVEL);
        Player player2 = player1.clone();
        assertNotEquals(player1, player2);
        assertEquals(player2.getName(), player1.getName());
        assertEquals(player2.getLevel(), player1.getLevel());
        assertEquals(player2.getScore(), player1.getScore());
    }
}