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
    }

    @Test
    public void ganhouVertical() {
    }

    @Test
    public void ganhouDiagonal() {
    }

    @Test
    public void jogar() {
    }

    @Test
    public void tabuleiroCheio() {
    }
}