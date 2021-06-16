package life.qbic.portal.portlet

import com.vaadin.annotations.Theme
import com.vaadin.annotations.Widgetset
import com.vaadin.icons.VaadinIcons
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Button
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Label
import com.vaadin.ui.Layout
import com.vaadin.ui.ProgressBar
import com.vaadin.ui.VerticalLayout
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

    @Override
    protected Layout getPortletContent(final VaadinRequest request) {

        // Init Layouts
        verticalLayout = new VerticalLayout()
        int notificationNumber = 100
        BellNotification bellNotification = new BellNotification(notificationNumber)
        verticalLayout.addComponent(bellNotification)
        return verticalLayout
    }
}
