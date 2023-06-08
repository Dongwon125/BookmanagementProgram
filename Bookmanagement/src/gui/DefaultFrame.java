package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Bookmanagement1.BookManagement;

public class DefaultFrame extends JFrame{
	
	BookManagement bookManagement;
	MenuSelection menuselection ;
	BookAdder bookAdder;
	BookAdderG bookadderg;
	BookViewer bookviewer;
	RomanceD romanced;
	ThrilerD Td;
	FictionD fictiond;
	FairyTaleD Fd;
	BookDeleter d;
	PassWord p;
	BookEditer1 be1;
	BookEditer2 be2;
	
	
	public DefaultFrame(BookManagement bookManagement) {
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.bookManagement = bookManagement;
		
		this.menuselection = new MenuSelection(this);
		this.bookAdder = new BookAdder(this);
		this.bookadderg = new BookAdderG(this,bookManagement);
		this.bookviewer = new BookViewer(this, bookManagement);
		this.romanced = new RomanceD(this);
		this.Td = new ThrilerD(this);
		this.fictiond = new FictionD(this);
		this.Fd = new FairyTaleD(this);
		this.d = new BookDeleter(this);
		this.p = new PassWord(this, this.bookManagement);
		this.be1 = new BookEditer1(this);
		this.be2 = new BookEditer2(this);
		
		
		this.add(p);
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint(); 
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public BookAdder getBookAdder() {
		return bookAdder;
	}

	public void setBookAdder(BookAdder bookAdder) {
		this.bookAdder = bookAdder;
	}

	public BookAdderG getBookadderg() {
		return bookadderg;
	}

	public void setBookadderg(BookAdderG bookadderg) {
		this.bookadderg = bookadderg;
	}

	public BookViewer getBookviewer() {
		return bookviewer;
	}

	public void setBookviewer(BookViewer bookviewer) {
		this.bookviewer = bookviewer;
	}

	public RomanceD getRomanced() {
		return romanced;
	}

	public void setRomanced(RomanceD romanced) {
		this.romanced = romanced;
	}

	public ThrilerD getTd() {
		return Td;
	}

	public void setTd(ThrilerD td) {
		Td = td;
	}

	public FictionD getFictiond() {
		return fictiond;
	}

	public void setFictiond(FictionD fictiond) {
		this.fictiond = fictiond;
	}

	public FairyTaleD getFd() {
		return Fd;
	}

	public void setFd(FairyTaleD fd) {
		Fd = fd;
	}

	public BookDeleter getD() {
		return d;
	}

	public void setD(BookDeleter d) {
		this.d = d;
	}

	public PassWord getP() {
		return p;
	}

	public void setP(PassWord p) {
		this.p = p;
	}

	public BookEditer1 getBe1() {
		return be1;
	}

	public void setBe1(BookEditer1 be1) {
		this.be1 = be1;
	}

	public BookEditer2 getBe2() {
		return be2;
	}

	public void setBe2(BookEditer2 be2) {
		this.be2 = be2;
	}

}
