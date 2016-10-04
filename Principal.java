/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwged;

/**
 *
 * @author Rodemfa913
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        typeCombo.setSelectedIndex(2); // rect
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        canvasScroll = new javax.swing.JScrollPane();
        canvas = new dwged.DrawingPanel();
        leftPanel = new javax.swing.JPanel();
        commonPanel = new javax.swing.JPanel();
        typeLabel = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        transLabel = new javax.swing.JLabel();
        transScroll = new javax.swing.JScrollPane();
        transText = new javax.swing.JTextArea();
        posLabel = new javax.swing.JLabel();
        xSpin = new javax.swing.JSpinner();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        ySpin = new javax.swing.JSpinner();
        fillColorLabel = new javax.swing.JLabel();
        fillColorButton = new dwged.ColorButton();
        shapePanel = new javax.swing.JPanel();
        strokeColorLabel = new javax.swing.JLabel();
        strokeColorButton = new dwged.ColorButton();
        strokeWidthLabel = new javax.swing.JLabel();
        strokeWidthSpin = new javax.swing.JSpinner();
        strokeCapLabel = new javax.swing.JLabel();
        strokeCapCombo = new javax.swing.JComboBox<>();
        strokeJoinLabel = new javax.swing.JLabel();
        strokeJoinCombo = new javax.swing.JComboBox<>();
        boxPanel = new javax.swing.JPanel();
        sizeLabel = new javax.swing.JLabel();
        widthSpin = new javax.swing.JSpinner();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        heightSpin = new javax.swing.JSpinner();
        arcPanel = new javax.swing.JPanel();
        angStartLabel = new javax.swing.JLabel();
        angStartSpin = new javax.swing.JSpinner();
        angExtentLabel = new javax.swing.JLabel();
        angExtentSpin = new javax.swing.JSpinner();
        pathPanel = new javax.swing.JPanel();
        dataLabel = new javax.swing.JLabel();
        dataScroll = new javax.swing.JScrollPane();
        dataText = new javax.swing.JTextArea();
        textPanel = new javax.swing.JPanel();
        fontNameLabel = new javax.swing.JLabel();
        fontNameCombo = new javax.swing.JComboBox<>();
        fontStyleLabel = new javax.swing.JLabel();
        fontStyleCombo = new javax.swing.JComboBox<>();
        fontSizeLabel = new javax.swing.JLabel();
        fontSizeSpin = new javax.swing.JSpinner();
        contentLabel = new javax.swing.JLabel();
        contentScroll = new javax.swing.JScrollPane();
        contentText = new javax.swing.JTextArea();
        topPanel = new javax.swing.JPanel();
        newButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        selLabel = new javax.swing.JLabel();
        selCombo = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        fwdButton = new javax.swing.JButton();
        zoomLabel = new javax.swing.JLabel();
        zoomSpin = new javax.swing.JSpinner();
        canvasSizeLabel = new javax.swing.JLabel();
        canvasWidthSpin = new javax.swing.JSpinner();
        canvasHeightSpin = new javax.swing.JSpinner();

        fileChooser.setDialogTitle("Select a file...");
        fileChooser.setFileFilter(new CustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drawing Editor");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 500));

        canvasScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        canvasScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        canvas.setPreferredSize(new java.awt.Dimension(400, 400));
        canvasScroll.setViewportView(canvas);

        getContentPane().add(canvasScroll, java.awt.BorderLayout.CENTER);

        leftPanel.setPreferredSize(new java.awt.Dimension(260, 460));
        leftPanel.setLayout(null);

        commonPanel.setPreferredSize(new java.awt.Dimension(250, 200));
        commonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        typeLabel.setText("type:");
        typeLabel.setPreferredSize(new java.awt.Dimension(65, 14));
        commonPanel.add(typeLabel);

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "arc", "ellipse", "rect", "path", "text" }));
        typeCombo.setSelectedIndex(-1);
        typeCombo.setPreferredSize(new java.awt.Dimension(125, 30));
        typeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboActionPerformed(evt);
            }
        });
        commonPanel.add(typeCombo);

        addButton.setText("add");
        addButton.setPreferredSize(new java.awt.Dimension(60, 30));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        commonPanel.add(addButton);

        transLabel.setText("transform:");
        transLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        commonPanel.add(transLabel);

        transScroll.setPreferredSize(new java.awt.Dimension(250, 90));

        transText.setColumns(20);
        transScroll.setViewportView(transText);

        commonPanel.add(transScroll);

        posLabel.setText("position:");
        posLabel.setPreferredSize(new java.awt.Dimension(95, 14));
        commonPanel.add(posLabel);

        xSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        xSpin.setPreferredSize(new java.awt.Dimension(75, 30));
        commonPanel.add(xSpin);
        commonPanel.add(filler1);

        ySpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        ySpin.setPreferredSize(new java.awt.Dimension(75, 30));
        commonPanel.add(ySpin);

        fillColorLabel.setText("fill color:");
        fillColorLabel.setPreferredSize(new java.awt.Dimension(125, 14));
        commonPanel.add(fillColorLabel);

        fillColorButton.setText(" ");
        fillColorButton.setColor(new java.awt.Color(255, 255, 255));
        fillColorButton.setPreferredSize(new java.awt.Dimension(125, 30));
        commonPanel.add(fillColorButton);

        leftPanel.add(commonPanel);
        commonPanel.setBounds(5, 0, 250, 200);

        shapePanel.setPreferredSize(new java.awt.Dimension(250, 120));
        shapePanel.setLayout(new java.awt.GridLayout(4, 4));

        strokeColorLabel.setText("stroke color:");
        shapePanel.add(strokeColorLabel);

        strokeColorButton.setText(" ");
        shapePanel.add(strokeColorButton);

        strokeWidthLabel.setText("stroke width:");
        shapePanel.add(strokeWidthLabel);

        strokeWidthSpin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        shapePanel.add(strokeWidthSpin);

        strokeCapLabel.setText("stroke cap:");
        shapePanel.add(strokeCapLabel);

        strokeCapCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "butt", "round", "square" }));
        shapePanel.add(strokeCapCombo);

        strokeJoinLabel.setText("stroke join:");
        shapePanel.add(strokeJoinLabel);

        strokeJoinCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "miter", "round", "bevel" }));
        shapePanel.add(strokeJoinCombo);

        leftPanel.add(shapePanel);
        shapePanel.setBounds(5, 200, 250, 120);

        boxPanel.setPreferredSize(new java.awt.Dimension(250, 30));
        boxPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        sizeLabel.setText("size:");
        sizeLabel.setPreferredSize(new java.awt.Dimension(95, 14));
        boxPanel.add(sizeLabel);

        widthSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        widthSpin.setPreferredSize(new java.awt.Dimension(75, 30));
        boxPanel.add(widthSpin);
        boxPanel.add(filler2);

        heightSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        heightSpin.setPreferredSize(new java.awt.Dimension(75, 30));
        boxPanel.add(heightSpin);

        leftPanel.add(boxPanel);
        boxPanel.setBounds(5, 320, 250, 30);

        arcPanel.setPreferredSize(new java.awt.Dimension(250, 60));
        arcPanel.setLayout(new java.awt.GridLayout(2, 2));

        angStartLabel.setText("angle start:");
        arcPanel.add(angStartLabel);

        angStartSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 359, 1));
        arcPanel.add(angStartSpin);

        angExtentLabel.setText("angle extent:");
        arcPanel.add(angExtentLabel);

        angExtentSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 360, 1));
        arcPanel.add(angExtentSpin);

        leftPanel.add(arcPanel);
        arcPanel.setBounds(5, 350, 250, 60);

        pathPanel.setPreferredSize(new java.awt.Dimension(250, 140));
        pathPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        dataLabel.setText("data:");
        dataLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        pathPanel.add(dataLabel);

        dataScroll.setPreferredSize(new java.awt.Dimension(250, 120));

        dataText.setColumns(20);
        dataScroll.setViewportView(dataText);

        pathPanel.add(dataScroll);

        leftPanel.add(pathPanel);
        pathPanel.setBounds(5, 320, 250, 140);

        textPanel.setPreferredSize(new java.awt.Dimension(250, 260));
        textPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        fontNameLabel.setText("font name:");
        fontNameLabel.setPreferredSize(new java.awt.Dimension(125, 14));
        textPanel.add(fontNameLabel);

        fontNameCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "serif", "sans-serif", "monospace" }));
        fontNameCombo.setPreferredSize(new java.awt.Dimension(125, 30));
        textPanel.add(fontNameCombo);

        fontStyleLabel.setText("font style:");
        fontStyleLabel.setPreferredSize(new java.awt.Dimension(125, 14));
        textPanel.add(fontStyleLabel);

        fontStyleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "plain", "bold", "italic", "bold / italic" }));
        fontStyleCombo.setPreferredSize(new java.awt.Dimension(125, 30));
        textPanel.add(fontStyleCombo);

        fontSizeLabel.setText("font size:");
        fontSizeLabel.setPreferredSize(new java.awt.Dimension(125, 14));
        textPanel.add(fontSizeLabel);

        fontSizeSpin.setModel(new javax.swing.SpinnerNumberModel(12, 3, 48, 1));
        fontSizeSpin.setPreferredSize(new java.awt.Dimension(125, 30));
        textPanel.add(fontSizeSpin);

        contentLabel.setText("content:");
        contentLabel.setPreferredSize(new java.awt.Dimension(250, 20));
        textPanel.add(contentLabel);

        contentScroll.setPreferredSize(new java.awt.Dimension(250, 150));

        contentText.setColumns(20);
        contentScroll.setViewportView(contentText);

        textPanel.add(contentScroll);

        leftPanel.add(textPanel);
        textPanel.setBounds(5, 200, 250, 260);

        getContentPane().add(leftPanel, java.awt.BorderLayout.WEST);

        newButton.setText("new");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        openButton.setText("open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        saveButton.setText("save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        selLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selLabel.setText("select:");

        selCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none" }));
        selCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selComboActionPerformed(evt);
            }
        });

        editButton.setText("edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        delButton.setText("delete");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        backButton.setText("move back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        fwdButton.setText("move forward");
        fwdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fwdButtonActionPerformed(evt);
            }
        });

        zoomLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zoomLabel.setText("zoom factor:");

        zoomSpin.setModel(new javax.swing.SpinnerNumberModel(0, -4, 4, 1));
        zoomSpin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                zoomSpinStateChanged(evt);
            }
        });

        canvasSizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        canvasSizeLabel.setText("canvas size:");

        canvasWidthSpin.setModel(new javax.swing.SpinnerNumberModel(400, 400, 1600, 10));
        canvasWidthSpin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                changeCanvasSize(evt);
            }
        });

        canvasHeightSpin.setModel(new javax.swing.SpinnerNumberModel(400, 400, 1600, 10));
        canvasHeightSpin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                changeCanvasSize(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newButton)
                .addGap(0, 0, 0)
                .addComponent(openButton)
                .addGap(0, 0, 0)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton)
                .addGap(0, 0, 0)
                .addComponent(delButton)
                .addGap(0, 0, 0)
                .addComponent(backButton)
                .addGap(0, 0, 0)
                .addComponent(fwdButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoomLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoomSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvasSizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvasWidthSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvasHeightSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newButton)
                    .addComponent(openButton)
                    .addComponent(saveButton)
                    .addComponent(selLabel)
                    .addComponent(selCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton)
                    .addComponent(delButton)
                    .addComponent(backButton)
                    .addComponent(fwdButton)
                    .addComponent(zoomLabel)
                    .addComponent(zoomSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canvasSizeLabel)
                    .addComponent(canvasWidthSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canvasHeightSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topPanel, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeCanvasSize(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_changeCanvasSize
        double scale = canvas.getScale();
        int width = (int) (scale * (int) canvasWidthSpin.getValue()),
            height = (int) (scale * (int) canvasHeightSpin.getValue());
        canvas.setPreferredSize(new java.awt.Dimension(width, height));
        canvas.revalidate();
        canvas.repaint();
    }//GEN-LAST:event_changeCanvasSize

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        org.json.JSONObject atts = getValues();
        int type = typeCombo.getSelectedIndex();
        atts.put("type", type);
        addElement(atts);
        selCombo.setSelectedIndex(selCombo.getItemCount() - 1);
        canvas.repaint();
    }//GEN-LAST:event_addButtonActionPerformed

    private void selComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selComboActionPerformed
        javax.swing.JComboBox combo = (javax.swing.JComboBox) evt.getSource();
        for (int i = 0; i < combo.getItemCount() - 1; i++) canvas.getElement(i).selected = false;
        int index = combo.getSelectedIndex();
        if (index <= 0) {
            typeCombo.setSelectedIndex(-1);
            transText.setText("");
            xSpin.setValue(0);
            ySpin.setValue(0);
            fillColorButton.setColor(java.awt.Color.WHITE);
        }
        else {
            Graphic g = canvas.getElement(index - 1);
            g.selected = true;
            org.json.JSONObject atts = g.getAtts();
            transText.setText(atts.getString("transform"));
            xSpin.setValue(atts.getInt("x"));
            ySpin.setValue(atts.getInt("y"));
            org.json.JSONObject style = atts.getJSONObject("fill");
            int red = style.getInt("red"),
                green = style.getInt("green"),
                blue = style.getInt("blue");
            index = style.getInt("alpha");
            fillColorButton.setColor(new java.awt.Color(red, green, blue, index));
            if (g instanceof Text) {
                fontNameCombo.setSelectedIndex(atts.getInt("font-name"));
                fontStyleCombo.setSelectedIndex(atts.getInt("font-style"));
                fontSizeSpin.setValue(atts.getInt("font-size"));
                contentText.setText(atts.getString("content"));
            } else { // shape (arc, ellipse, rect, path
                style = atts.getJSONObject("stroke");
                red = style.getInt("red");
                green = style.getInt("green");
                blue = style.getInt("blue");
                index = style.getInt("alpha");
                strokeColorButton.setColor(new java.awt.Color(red, green, blue, index));
                strokeWidthSpin.setValue(style.getInt("width"));
                strokeCapCombo.setSelectedIndex(style.getInt("cap"));
                strokeJoinCombo.setSelectedIndex(style.getInt("join"));
                if (g instanceof Path) {
                    dataText.setText(atts.getString("data"));
                    typeCombo.setSelectedIndex(3);
                } else { // box (arc, ellipse, rect)
                    widthSpin.setValue(atts.getInt("width"));
                    heightSpin.setValue(atts.getInt("height"));
                    if (g instanceof Arc) {
                        angStartSpin.setValue(atts.getInt("start"));
                        angExtentSpin.setValue(atts.getInt("extent"));
                        typeCombo.setSelectedIndex(0);
                    } else if (g instanceof Ellipse) typeCombo.setSelectedIndex(1);
                    else typeCombo.setSelectedIndex(2); // rect
                }
            }
        }
        canvas.repaint();
    }//GEN-LAST:event_selComboActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int index = selCombo.getSelectedIndex();
        if (index <= 0) return;
        Graphic g = canvas.getElement(index - 1);
        g.setAtts(getValues());
        canvas.repaint();
    }//GEN-LAST:event_editButtonActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        int index = selCombo.getSelectedIndex();
        if (index <= 0) return;
        selCombo.removeItemAt(selCombo.getItemCount() - 1);
        selCombo.setSelectedIndex(0);
        canvas.removeElement(index - 1);
        canvas.repaint();
    }//GEN-LAST:event_delButtonActionPerformed

    private void fwdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fwdButtonActionPerformed
        int index = selCombo.getSelectedIndex();
        if (index <= 0 || index == selCombo.getItemCount() - 1) return;
        canvas.moveElementForward(index - 1);
        selCombo.setSelectedIndex(index + 1);
        canvas.repaint();
    }//GEN-LAST:event_fwdButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        int index = selCombo.getSelectedIndex();
        if (index <= 1) return;
        canvas.moveElementForward(index - 2);
        selCombo.setSelectedIndex(index - 1);
        canvas.repaint();
    }//GEN-LAST:event_backButtonActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal != javax.swing.JFileChooser.APPROVE_OPTION) return;
        java.nio.file.Path pth = fileChooser.getSelectedFile().toPath();
        java.nio.charset.Charset cs = java.nio.charset.Charset.forName("US-ASCII");
        try (java.io.BufferedReader buf = java.nio.file.Files.newBufferedReader(pth, cs)) {
            String fileChars = "";
            String line;
            while ((line = buf.readLine()) != null) {
                fileChars += line;
            }
            newButtonActionPerformed(null);
            org.json.JSONArray arr = new org.json.JSONArray(fileChars);
            for (Object obj : arr) addElement((org.json.JSONObject) obj);
            selCombo.setSelectedIndex(0);
            canvas.repaint();
        } catch (Exception ex) {
            System.err.format("Exception: %s\n", ex);
        }
    }//GEN-LAST:event_openButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal != javax.swing.JFileChooser.APPROVE_OPTION) return;
        java.nio.file.Path pth = fileChooser.getSelectedFile().toPath();
        java.nio.charset.Charset cs = java.nio.charset.Charset.forName("US-ASCII");
        org.json.JSONArray arr = new org.json.JSONArray();
        for (int i = 0; i < selCombo.getItemCount() - 1; i++) {
            Graphic g = canvas.getElement(i);
            org.json.JSONObject atts = g.getAtts();
            if (g instanceof Arc) atts.put("type", 0);
            else if (g instanceof Ellipse) atts.put("type", 1);
            else if (g instanceof Rect) atts.put("type", 2);
            else if (g instanceof Path) atts.put("type", 3);
            else atts.put("type", 4);
            arr.put(atts);
        }
        String fileChars = arr.toString(2);
        try (java.io.BufferedWriter buf = java.nio.file.Files.newBufferedWriter(pth, cs)) {
            buf.write(fileChars, 0, fileChars.length());
        } catch (Exception ex) {
            System.err.format("Exception: %s\n", ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void typeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboActionPerformed
        arcPanel.setVisible(false);
        boxPanel.setVisible(false);
        pathPanel.setVisible(false);
        shapePanel.setVisible(false);
        textPanel.setVisible(false);
        int type = ((javax.swing.JComboBox) evt.getSource()).getSelectedIndex();
        if (type < 0) return;
        if (type == 4) textPanel.setVisible(true); // text
        else { // shape (arc, ellipse, rect, path)
            shapePanel.setVisible(true);
            if (type == 3) pathPanel.setVisible(true); // path
            else { // box (arc, ellipse, rect)
                boxPanel.setVisible(true);
                if (type == 0) arcPanel.setVisible(true); // arc
            }
        }
    }//GEN-LAST:event_typeComboActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        canvas.clear();
        selCombo.removeAllItems();
        selCombo.addItem("none");
        canvas.repaint();
    }//GEN-LAST:event_newButtonActionPerformed

    private void zoomSpinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_zoomSpinStateChanged
        javax.swing.JSpinner spin = (javax.swing.JSpinner) evt.getSource();
        double oldScale = canvas.getScale();
        canvas.setZoomFactor((int) spin.getValue());
        double newScale = canvas.getScale();
        javax.swing.JViewport viewport = canvasScroll.getViewport();
        java.awt.Point pos = viewport.getViewPosition();
        int newX = (int) (pos.x * newScale / oldScale),
            newY = (int) (pos.y * newScale / oldScale);
        viewport.setViewPosition(new java.awt.Point(newX, newY));
        changeCanvasSize(null);
    }//GEN-LAST:event_zoomSpinStateChanged

    private org.json.JSONObject getValues() {
        org.json.JSONObject atts = new org.json.JSONObject();
        atts.put("transform", transText.getText());
        atts.put("x", (int) xSpin.getValue());
        atts.put("y", (int) ySpin.getValue());
        atts.put("width", (int) widthSpin.getValue());
        atts.put("height", (int) heightSpin.getValue());
        atts.put("start", (int) angStartSpin.getValue());
        atts.put("extent", (int) angExtentSpin.getValue());
        atts.put("data", dataText.getText());
        atts.put("font-name", fontNameCombo.getSelectedIndex());
        atts.put("font-style", fontStyleCombo.getSelectedIndex());
        atts.put("font-size", (int) fontSizeSpin.getValue());
        atts.put("content", contentText.getText());
        org.json.JSONObject style = new org.json.JSONObject();
        java.awt.Color color = fillColorButton.getColor();
        style.put("red", color.getRed()).put("green", color.getGreen());
        style.put("blue", color.getBlue()).put("alpha", color.getAlpha());
        atts.put("fill", style);
        style = new org.json.JSONObject();
        color = strokeColorButton.getColor();
        style.put("red", color.getRed()).put("green", color.getGreen());
        style.put("blue", color.getBlue()).put("alpha", color.getAlpha());
        style.put("width", (int) strokeWidthSpin.getValue());
        style.put("cap", strokeCapCombo.getSelectedIndex());
        style.put("join", strokeJoinCombo.getSelectedIndex());
        atts.put("stroke", style);
        return atts;
    }
    
    private void addElement(org.json.JSONObject atts) {
        int type = atts.getInt("type");
        Graphic g;
        switch (type) {
            case 0:
                g = new Arc();
                break;
            case 1:
                g = new Ellipse();
                break;
            case 2:
                g = new Rect();
                break;
            case 3:
                g = new Path();
                break;
            default: // text
                g = new Text();
        }
        g.setAtts(atts);
        canvas.addElement(g);
        selCombo.addItem("item" + selCombo.getItemCount());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel angExtentLabel;
    private javax.swing.JSpinner angExtentSpin;
    private javax.swing.JLabel angStartLabel;
    private javax.swing.JSpinner angStartSpin;
    private javax.swing.JPanel arcPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel boxPanel;
    private dwged.DrawingPanel canvas;
    private javax.swing.JSpinner canvasHeightSpin;
    private javax.swing.JScrollPane canvasScroll;
    private javax.swing.JLabel canvasSizeLabel;
    private javax.swing.JSpinner canvasWidthSpin;
    private javax.swing.JPanel commonPanel;
    private javax.swing.JLabel contentLabel;
    private javax.swing.JScrollPane contentScroll;
    private javax.swing.JTextArea contentText;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JScrollPane dataScroll;
    private javax.swing.JTextArea dataText;
    private javax.swing.JButton delButton;
    private javax.swing.JButton editButton;
    private javax.swing.JFileChooser fileChooser;
    private dwged.ColorButton fillColorButton;
    private javax.swing.JLabel fillColorLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JComboBox<String> fontNameCombo;
    private javax.swing.JLabel fontNameLabel;
    private javax.swing.JLabel fontSizeLabel;
    private javax.swing.JSpinner fontSizeSpin;
    private javax.swing.JComboBox<String> fontStyleCombo;
    private javax.swing.JLabel fontStyleLabel;
    private javax.swing.JButton fwdButton;
    private javax.swing.JSpinner heightSpin;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton newButton;
    private javax.swing.JButton openButton;
    private javax.swing.JPanel pathPanel;
    private javax.swing.JLabel posLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> selCombo;
    private javax.swing.JLabel selLabel;
    private javax.swing.JPanel shapePanel;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JComboBox<String> strokeCapCombo;
    private javax.swing.JLabel strokeCapLabel;
    private dwged.ColorButton strokeColorButton;
    private javax.swing.JLabel strokeColorLabel;
    private javax.swing.JComboBox<String> strokeJoinCombo;
    private javax.swing.JLabel strokeJoinLabel;
    private javax.swing.JLabel strokeWidthLabel;
    private javax.swing.JSpinner strokeWidthSpin;
    private javax.swing.JPanel textPanel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel transLabel;
    private javax.swing.JScrollPane transScroll;
    private javax.swing.JTextArea transText;
    private javax.swing.JComboBox<String> typeCombo;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JSpinner widthSpin;
    private javax.swing.JSpinner xSpin;
    private javax.swing.JSpinner ySpin;
    private javax.swing.JLabel zoomLabel;
    private javax.swing.JSpinner zoomSpin;
    // End of variables declaration//GEN-END:variables
}
