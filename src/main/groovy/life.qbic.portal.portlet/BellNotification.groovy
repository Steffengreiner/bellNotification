package life.qbic.portal.portlet

import com.vaadin.icons.VaadinIcons
import com.vaadin.ui.Button
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Label
import com.vaadin.ui.themes.ValoTheme

/**
 * Clickable BellNotification component
 *
 * HorizontalLayout containing a Vaadin Label and Button component which combine into a BellNotification
 * The label is transformed into a badge showing the number of notification via css styling defined in {@link /main/webapp/VAADIN/themes/mytheme/mytheme.scss}
 * @since: 0.1.0
 *
 */
class BellNotification extends HorizontalLayout {

    //Label storing the notification number
    Label notificationLabel
    //Bell button for clicking and showing details notification
    Button notificationButton

    BellNotification(int notificationNumber) {
        super()
        // Init notification badge
        notificationLabel = new Label(notificationNumber.toString())
        notificationLabel.addStyleName("notification-badge")

        // Init notification button
        notificationButton = new Button()
        notificationButton.setIcon(VaadinIcons.BELL)
        notificationButton.addStyleName(ValoTheme.BUTTON_ICON_ONLY)
        notificationButton.addStyleName("notification-button")
        notificationButton.setDescription(notificationNumber.toString() + " unread notifications")
        // Add components to layout
        this.addComponent(notificationButton)
        this.addComponent(notificationLabel)
        // remove default spacing between label and button
        this.setSpacing(false)
        // Example implementation on how the label can be removed after clicking the button
        notificationButton.addClickListener({
            this.removeComponent(notificationLabel)
            notificationButton.setDescription("")
        })
    }
}
