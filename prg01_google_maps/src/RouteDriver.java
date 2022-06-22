/*
 * CS 250 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg 01 - RouteDriver class
 * Your name(s):
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class RouteDriver extends JFrame implements MouseListener {

    private static final String ROUTE_DATA_FILE      = "route.csv";
    private static final String GOOGLE_MAPS_BASE_URL = "https://maps.googleapis.com/maps/api/staticmap";
    // use your own key (preferable) or check your email and use the instructor's provided google maps key
    private static final String GOOGLE_MAPS_API_KEY  = "";
    private static final int    DEFAULT_ZOOM         = 13;
    private static final int    ZOOM_OUT_MIN         = 0;
    private static final int    ZOOM_IN_MAX          = 22;
    private static final char[] ALPHABET             = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final int    WIDTH                = 800;
    private static final int    HEIGHT               = 600;
    private static final String TITLE                = "CS 250 - Prg 01 - Google Maps";

    private int     zoom;      // the zoom level for the map
    private JLabel  labelMap;  // the map as a label
    private Route   route;

    public RouteDriver() throws FileNotFoundException {
        // TODO: instantiate a route object (must use "route" as reference variable)

        // TODO: read the waypoints from the data file and add them into the route
        

        // GUI part of the frame
        setTitle(TITLE);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        zoom = DEFAULT_ZOOM;
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel pnlWest = new JPanel(new GridLayout(route.size(), 1));
        for (int i = 0; i < route.size(); i++) {
            Waypoint waypoint = route.get(i);
            JButton btn = new JButton(ALPHABET[i] + ": " + waypoint.toString());
            btn.setEnabled(false);
            pnlWest.add(btn);
        }
        contentPane.add(BorderLayout.WEST, pnlWest);
        labelMap = new JLabel(getImageIcon()); // calls getImageIcon to generate the map from Google Maps Static API
        contentPane.add(BorderLayout.CENTER, labelMap);
        addMouseListener(this);
        setVisible(true);
    }

    // generate an ImageIcon from Google Maps Static API
    private ImageIcon getImageIcon() {
        try {
            String urlString = GOOGLE_MAPS_BASE_URL + "?key=" + GOOGLE_MAPS_API_KEY + "&zoom=" + zoom + "&scale=1&size=" + WIDTH + "x" + HEIGHT;
            for (int i = 0; i < route.size(); i++) {
                Waypoint waypoint = route.get(i);
                urlString += "&markers=label:" + ALPHABET[i] + "|" + waypoint.getLatitude() + "," + waypoint.getLongitude();
            }
            URL url = new URL(urlString);
            return new ImageIcon(url);
        }
        catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Sorry but there is a problem with your URL!", TITLE, JOptionPane.INFORMATION_MESSAGE);
        }
        return null;
    }

    // change the zoom of the map based on mouse click
    @Override
    public void mouseClicked(MouseEvent ev) {
        boolean zoomChanged = false;
        // hold CTRL key when zooming out
        if (ev.isControlDown()) {
            zoom--;
            if (zoom < ZOOM_OUT_MIN)
                zoom = ZOOM_OUT_MIN;
            else
                zoomChanged = true;
        }
        else {
            zoom++;
            if (zoom > ZOOM_IN_MAX)
                zoom = ZOOM_IN_MAX;
            else
                zoomChanged = true;
        }
        if (zoomChanged) {
            getContentPane().remove(labelMap);
            labelMap = new JLabel(getImageIcon());
            getContentPane().add(BorderLayout.CENTER, labelMap);

            // redraw the frame
            revalidate(); repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) throws FileNotFoundException {
        new RouteDriver();
    }
}