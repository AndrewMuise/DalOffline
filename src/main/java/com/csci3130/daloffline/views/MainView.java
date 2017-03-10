package com.csci3130.daloffline.views;

import com.vaadin.navigator.*;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 * Main menu view. Displays buttons to the user that allows them to navigate to the other interfaces.
 * 
 * @author Connor Foran
 */

public class MainView extends VerticalLayout implements View {
	/**
	 * Initializes and builds the main menu page
	 * 
	 * @param None
	 * @return Nothing
	 */
    public MainView() {
    	VerticalLayout container = new VerticalLayout();
    	Panel border = new Panel();

        Button profileButton = new Button("View Your Profile/Schedule"); //A button
        profileButton.addClickListener(e -> getUI().getNavigator().navigateTo("profile")); //Specify a view for this button to direct you to
        
        Button studentListButton = new Button("View All Courses");
        studentListButton.addClickListener(e -> getUI().getNavigator().navigateTo("course_list"));
        
        container.addComponents(profileButton, studentListButton); //Add buttons to the view
        container.setComponentAlignment(profileButton, Alignment.MIDDLE_CENTER); //Set alignments
        container.setComponentAlignment(studentListButton, Alignment.MIDDLE_CENTER);
        container.setHeight("30%");
        
        VerticalLayout container2 = new VerticalLayout();
        container2.addComponent(container);
        container2.setComponentAlignment(container, Alignment.MIDDLE_CENTER);
        container2.setSizeFull();
        border.setContent(container2);
        
        addComponent(border);
        border.setWidth("80%");
        border.setHeight("90%");
        setComponentAlignment(border, Alignment.MIDDLE_CENTER);
        setSizeFull();
    }


    @Override
    public void enter(ViewChangeEvent event) {
        Notification.show("Successfully logged in!");
    }
}