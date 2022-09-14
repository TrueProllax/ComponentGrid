package component;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import net.miginfocom.swing.MigLayout;


public class LGrid extends javax.swing.JPanel {

    // grid property
    private int GridCountCells = 4;
    private int GridCountInsideCells = 1;
    private Color GridColorTextCategory = new Color(120, 120, 120);
    private Color GridColorSelectTextCategory = new Color(150, 150, 150);
    private Color GridColorTextName = new Color(120, 120, 120);
    private Color GridColorSelectTextName = new Color(150, 150, 150);
    private Color GridBackgroundCells = getBackground().brighter();
    private Color GridBackgroundHoverCells = new Color(255,255,255);
    private Color GridBackgroundClickCells = new Color(51, 0, 51);
    private int GridGapCells = 10;
    private int GridWidthCell = 150;
    private int GridHeightCell = 200;
    private Font GridFontName = new Font("sansserif", 1, 14);
    private Font GridFontCategory = new Font("sansserif", 1, 14);
    
    private MigLayout layout = new MigLayout("wrap " + GridCountCells);
    

    public LGrid() {
        initComponents();
        panel.setLayout(layout);
    }
    
    public void addGridCell(javax.swing.ImageIcon image, String name,String category) {

        JPanel cell = new JPanel(new MigLayout("wrap " + GridCountInsideCells));
        cell.setBackground(GridBackgroundCells);
        
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(image);
        cell.add(imageLabel);
        
        cell.setCursor(new Cursor(12));
        
        cell.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseCellClick(evt);
                choiseSave(name);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseCellHover(evt);
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseCellExit(evt);
            }
            private void MouseCellHover(MouseEvent evt) {
                cell.setBackground(GridBackgroundHoverCells);
            }
            private void MouseCellClick(MouseEvent evt) {
                cell.setBackground(GridBackgroundClickCells);
            }
            private void MouseCellExit(MouseEvent evt) {
                cell.setBackground(GridBackgroundCells);
            }
        });
        
        JTextPane txtName = new JTextPane();
        txtName.setBackground(new Color(0, 0, 0, 0));
        txtName.setForeground(GridColorTextName);
        txtName.setSelectionColor(GridColorSelectTextName);
        txtName.setBorder(null);
        txtName.setFont(GridFontName);
        txtName.setOpaque(false);
        txtName.setEditable(false);
        txtName.setText(name);
        
        
        cell.add(txtName);
        
        JTextPane txtCategory = new JTextPane();
        txtCategory.setBackground(new Color(0, 0, 0, 0));
        txtCategory.setForeground(GridColorTextCategory);
        txtCategory.setSelectionColor(GridColorSelectTextCategory);
        txtCategory.setBorder(null);
        txtCategory.setOpaque(false);
        txtName.setFont(GridFontCategory);
        txtCategory.setEditable(false);
        txtCategory.setText(category);
        
        cell.add(txtCategory);
                
        panel.add(cell, "width " + GridWidthCell + ", height " + GridHeightCell + ", gap " + GridGapCells);
        this.revalidate();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        scroll.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public int getCountCells() {
        return GridCountCells;
    }

    public void setCountCells(int GridCountCells) {
        this.GridCountCells = GridCountCells;
        this.layout = new MigLayout("wrap " + GridCountCells);
        panel.setLayout(layout);
    }
    
    private String choise = "";
    
    public void choiseSave(String choise) {
        this.choise = choise;
    }
    
    public String choiseReturn() {
        if (!"".equals(this.choise)) {
            return this.choise;
        } else {
            return "null";
        }
    }

    public int getGridCountCells() {
        return GridCountCells;
    }

    public void setGridCountCells(int GridCountCells) {
        this.GridCountCells = GridCountCells;
    }

    public int getGridCountInsideCells() {
        return GridCountInsideCells;
    }

    public void setGridCountInsideCells(int GridCountInsideCells) {
        this.GridCountInsideCells = GridCountInsideCells;
    }

    public Color getGridColorTextCategory() {
        return GridColorTextCategory;
    }

    public void setGridColorTextCategory(Color GridColorTextCategory) {
        this.GridColorTextCategory = GridColorTextCategory;
    }

    public Color getGridColorSelectTextCategory() {
        return GridColorSelectTextCategory;
    }

    public void setGridColorSelectTextCategory(Color GridColorSelectTextCategory) {
        this.GridColorSelectTextCategory = GridColorSelectTextCategory;
    }

    public Color getGridColorTextName() {
        return GridColorTextName;
    }

    public void setGridColorTextName(Color GridColorTextName) {
        this.GridColorTextName = GridColorTextName;
    }

    public Color getGridColorSelectTextName() {
        return GridColorSelectTextName;
    }

    public void setGridColorSelectTextName(Color GridColorSelectTextName) {
        this.GridColorSelectTextName = GridColorSelectTextName;
    }

    public Color getGridBackgroundCells() {
        return GridBackgroundCells;
    }

    public void setGridBackgroundCells(Color GridBackgroundCells) {
        this.GridBackgroundCells = GridBackgroundCells;
    }

    public Color getGridBackgroundHoverCells() {
        return GridBackgroundHoverCells;
    }

    public void setGridBackgroundHoverCells(Color GridBackgroundHoverCells) {
        this.GridBackgroundHoverCells = GridBackgroundHoverCells;
    }

    public Color getGridBackgroundClickCells() {
        return GridBackgroundClickCells;
    }

    public void setGridBackgroundClickCells(Color GridBackgroundClickCells) {
        this.GridBackgroundClickCells = GridBackgroundClickCells;
    }

    public int getGridGapCells() {
        return GridGapCells;
    }

    public void setGridGapCells(int GridGapCells) {
        this.GridGapCells = GridGapCells;
    }

    public int getGridWidthCell() {
        return GridWidthCell;
    }

    public void setGridWidthCell(int GridWidthCell) {
        this.GridWidthCell = GridWidthCell;
    }

    public int getGridHeightCell() {
        return GridHeightCell;
    }

    public void setGridHeightCell(int GridHeightCell) {
        this.GridHeightCell = GridHeightCell;
    }

    public Font getGridFontName() {
        return GridFontName;
    }

    public void setGridFontName(Font GridFontName) {
        this.GridFontName = GridFontName;
    }

    public Font getGridFontCategory() {
        return GridFontCategory;
    }

    public void setGridFontCategory(Font GridFontCategory) {
        this.GridFontCategory = GridFontCategory;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
