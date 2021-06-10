package life.qbic.portal.portlet

import com.vaadin.annotations.Theme
import com.vaadin.annotations.Widgetset
import com.vaadin.icons.VaadinIcons
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Button
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Label
import com.vaadin.ui.Layout
import com.vaadin.ui.TextField
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.Window
import com.vaadin.ui.themes.ValoTheme
import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2

/**
 * Entry point for portlet Bellnotification. This class derives from {@link QBiCPortletUI}, which is found in the {@code portal-utils-lib} library.
 *
 * @see <a href=https://github.com/qbicsoftware/portal-utils-lib>portal-utils-lib</a>
 */
@Theme("mytheme")
@SuppressWarnings("serial")
@Widgetset("life.qbic.portal.portlet.AppWidgetSet")
@Log4j2
@CompileStatic
class QbicPortlet extends QBiCPortletUI {

    //Overview Layout
    VerticalLayout verticalLayout
    //Horizontal Layout storing the button and badge
    HorizontalLayout notificationLayout
    //Label storing the notification number
    Label notificationLabel
    //Bell button for clicking and showing details notification
    Button notificationButton
    @Override
    protected Layout getPortletContent(final VaadinRequest request) {

        // Init Layouts
        verticalLayout = new VerticalLayout()
        notificationLayout = new HorizontalLayout()

        // Init notification badge
        int notificationNumber = 100
        notificationLabel = new Label(notificationNumber.toString())
        notificationLabel.addStyleName("notification-badge")

        // Init notification button
        notificationButton = new Button()
        notificationButton.setIcon(VaadinIcons.BELL)
        notificationButton.addStyleName(ValoTheme.BUTTON_ICON_ONLY)
        notificationButton.addStyleName("notification-button")
        notificationButton.setDescription(notificationNumber.toString() + " unread notifications")

        // Add components to layout
        verticalLayout.addComponent(notificationLayout)
        notificationLayout.addComponent(notificationButton)
        notificationLayout.addComponent(notificationLabel)
        // remove default spacing between label and button
        notificationLayout.setSpacing(false)

        // Example implementation on how the label can be removed after clicking the button
        notificationButton.addClickListener({
            notificationLayout.removeComponent(notificationLabel)
        })
        return verticalLayout
    }
}
