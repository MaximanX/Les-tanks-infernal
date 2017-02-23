package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import armes.Armes;
import tanks.Joueur;
import tanks.Tank;

public class JoueurTest {

	Joueur tk1;
	Joueur tk2;
	Joueur tk3;
	Joueur tk4;

	@Before
	public void creerInstances() {
		tk1 = new Joueur(100, 100);
		tk2 = new Joueur(0, 100000);
		tk3 = new Joueur(100000, 0);
		tk4 = new Joueur(-1, -1);
	}

	@Test
	public void testPosX() {
		assertTrue(tk1.getPosX() == 100);
		assertTrue(tk2.getPosX() == 0);
		assertFalse(tk3.getPosX() == 100000);
		assertFalse(tk4.getPosX() == -1);

	}

	@Test
	public void testPosY() {
		assertTrue(tk1.getPosY() == 100);
		assertFalse(tk2.getPosY() == 100000);
		assertTrue(tk3.getPosY() == 0);
		assertFalse(tk4.getPosY() == -1);
	}

	@Test
	public void testVie() {
		tk1.setPointVie(0.5);
		assertTrue(tk1.getPointVie() == 0.5);
		assertFalse(tk1.getPointVie() == 1);
	}

	@Test
	public void testGaz() {
		tk1.setGaz(0.7);
		assertTrue(tk1.getGaz() == 0.7);
		assertFalse(tk1.getGaz() == 1);
	}

	@Test
	public void testArme() {
		Armes[] armes = { Armes.SIN, Armes.COSEC, Armes.TAN, Armes.ABS, Armes.RATIONNELE, Armes.NORMAL, Armes.REBOND,
				Armes.FRAGSOL, Armes.FRAGAIR };
		tk1.setArme(0);
		assertTrue(tk1.getArme().equals(armes[0]));
		assertTrue(tk1.getArme().equals(Armes.SIN));
		assertTrue(tk1.getArme().getPath().equals(Armes.SIN.getPath()));
		tk1.setArme(3);
		assertTrue(tk1.getArme().equals(armes[3]));
		assertTrue(tk1.getArme().equals(Armes.ABS));
		assertTrue(tk1.getArme().getPath().equals(Armes.ABS.getPath()));
		tk1.setArme(8);
		assertTrue(tk1.getArme().equals(armes[8]));
		assertTrue(tk1.getArme().equals(Armes.FRAGAIR));
		assertTrue(tk1.getArme().getPath().equals(Armes.FRAGAIR.getPath()));
	}

}
