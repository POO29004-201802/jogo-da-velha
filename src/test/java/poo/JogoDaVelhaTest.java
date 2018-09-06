package poo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JogoDaVelhaTest {



    @Test
    public void ganhou() {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        Assert.assertEquals(0, jogoDaVelha.ganhou());

        jogoDaVelha.setTabuleiro(new int[][]{{1,1,1},{0,0,0},{0,0,0}});
        Assert.assertEquals(3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,0},{1,1,1},{0,0,0}});
        Assert.assertEquals(3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,0},{0,0,0},{1,1,1}});
        Assert.assertEquals(3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{1,0,0},{0,1,0},{0,0,1}});
        Assert.assertEquals(3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,1},{0,1,0},{1,0,0}});
        Assert.assertEquals(3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{1,0,0},{1,0,0},{1,0,0}});
        Assert.assertEquals(3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,1,0},{0,1,0},{0,1,0}});
        Assert.assertEquals(3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,1},{0,0,1},{0,0,1}});
        Assert.assertEquals(3, jogoDaVelha.ganhou());

        jogoDaVelha.setTabuleiro(new int[][]{{-1,-1,-1},{0,0,0},{0,0,0}});
        Assert.assertEquals(-3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,0},{-1,-1,-1},{0,0,0}});
        Assert.assertEquals(-3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,0},{0,0,0},{-1,-1,-1}});
        Assert.assertEquals(-3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{-1,0,0},{0,-1,0},{0,0,-1}});
        Assert.assertEquals(-3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,-1},{0,-1,0},{-1,0,0}});
        Assert.assertEquals(-3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{-1,0,0},{-1,0,0},{-1,0,0}});
        Assert.assertEquals(-3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,-1,0},{0,-1,0},{0,-1,0}});
        Assert.assertEquals(-3, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,-1},{0,0,-1},{0,0,-1}});
        Assert.assertEquals(-3, jogoDaVelha.ganhou());

        jogoDaVelha.setTabuleiro(new int[][]{{-1,1,-1},{0,0,0},{0,0,0}});
        Assert.assertEquals(0, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,0},{-1,1,-1},{0,0,0}});
        Assert.assertEquals(0, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,0},{0,0,0},{1,-1,-1}});
        Assert.assertEquals(0, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{1,0,0},{0,-1,0},{0,0,-1}});
        Assert.assertEquals(0, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,-1},{0,-1,0},{1,1,0}});
        Assert.assertEquals(0, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{-1,0,0},{-1,0,0},{1,0,0}});
        Assert.assertEquals(0, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,1,0},{0,-1,0},{0,-1,0}});
        Assert.assertEquals(0, jogoDaVelha.ganhou());
        jogoDaVelha.setTabuleiro(new int[][]{{0,0,1},{0,0,-1},{0,0,-1}});
        Assert.assertEquals(0, jogoDaVelha.ganhou());


    }

    @Test
    public void ganhouHorizontal() {

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        jogoDaVelha.setTabuleiro(new int[][]{{1,1,1},{0,0,0},{0,0,0}});
        Assert.assertEquals(3, jogoDaVelha.ganhouHorizontal());

        jogoDaVelha.setTabuleiro(new int[][]{{-1,-1,-1},{0,0,0},{0,0,0}});
        Assert.assertEquals(-3, jogoDaVelha.ganhouHorizontal());

        jogoDaVelha.setTabuleiro(new int[][]{{0,0,0},{1,1,1},{0,0,0}});
        Assert.assertEquals(3, jogoDaVelha.ganhouHorizontal());

        jogoDaVelha.setTabuleiro(new int[][]{{0,0,0},{-1,-1,-1},{0,0,0}});
        Assert.assertEquals(-3, jogoDaVelha.ganhouHorizontal());

        jogoDaVelha.setTabuleiro(new int[][]{{0,0,0},{0,0,0},{1,1,1}});
        Assert.assertEquals(3, jogoDaVelha.ganhouHorizontal());

        jogoDaVelha.setTabuleiro(new int[][]{{0,0,0},{0,0,0},{-1,-1,-1}});
        Assert.assertEquals(-3, jogoDaVelha.ganhouHorizontal());
    }

    @Test
    public void ganhouVertical() {
    }

    @Test
    public void ganhouDiagonal() {
    }

    @Test
    public void jogar() {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        Assert.assertTrue(jogoDaVelha.jogar(0, 0));
        Assert.assertTrue(jogoDaVelha.jogar(1, 0));
        Assert.assertTrue(jogoDaVelha.jogar(0, 1));
        Assert.assertTrue(jogoDaVelha.jogar(2, 2));
        Assert.assertTrue(jogoDaVelha.jogar(2, 1));
        Assert.assertTrue(jogoDaVelha.jogar(1, 2));
        Assert.assertTrue(jogoDaVelha.jogar(0, 2));
        Assert.assertTrue(jogoDaVelha.jogar(2, 0));

        Assert.assertFalse(jogoDaVelha.jogar(-1, 0));
        Assert.assertFalse(jogoDaVelha.jogar(-1, -1));
        Assert.assertFalse(jogoDaVelha.jogar(0, -1));

        Assert.assertFalse(jogoDaVelha.jogar(3, 0));
        Assert.assertFalse(jogoDaVelha.jogar(0, 3));
        Assert.assertFalse(jogoDaVelha.jogar(3, 3));


        jogoDaVelha.jogar(2, 2);
        Assert.assertFalse(jogoDaVelha.jogar(2, 2));
        jogoDaVelha.jogar(0, 0);
        Assert.assertFalse(jogoDaVelha.jogar(0, 0));
        jogoDaVelha.jogar(0, 1);
        Assert.assertFalse(jogoDaVelha.jogar(0, 1));
        jogoDaVelha.jogar(1, 0);
        Assert.assertFalse(jogoDaVelha.jogar(1, 0));
    }

    @Test
    public void tabuleiroCheio() {
    }
}