Bellnotification
-----------------------------------

.. image:: https://github.com/qbicsoftware/Bellnotification/workflows/Build%20Maven%20Package/badge.svg
    :target: https://github.com/qbicsoftware/Bellnotification/workflows/Build%20Maven%20Package/badge.svg
    :alt: Github Workflow Build Maven Package Status

.. image:: https://github.com/qbicsoftware/Bellnotification/workflows/Run%20Maven%20Tests/badge.svg
    :target: https://github.com/qbicsoftware/Bellnotification/workflows/Run%20Maven%20Tests/badge.svg
    :alt: Github Workflow Tests Status

.. image:: https://github.com/qbicsoftware/Bellnotification/workflows/QUBE%20lint/badge.svg
    :target: https://github.com/qbicsoftware/Bellnotification/workflows/QUBE%20lint/badge.svg
    :alt: qube Lint Status

.. image:: https://readthedocs.org/projects/Bellnotification/badge/?version=latest
    :target: https://Bellnotification.readthedocs.io/en/latest/?badge=latest
    :alt: Documentation Status

.. image:: https://flat.badgen.net/dependabot/thepracticaldev/dev.to?icon=dependabot
    :target: https://flat.badgen.net/dependabot/thepracticaldev/dev.to?icon=dependabot
    :alt: Dependabot Enabled


bellnotificationviewer

* Free software: GNUv3
* Documentation: https://Bellnotification.readthedocs.io.

Features
--------

* Bellnotification Button based on the Vaadin Button and Vaadin Label component and CSS styling adaptions.

Usage information
------------------
The Implementation is based on a Vaadin ``HorizontalLayout`` containing a Vaadin ``Button`` and a Vaadin ``Label`` component next to each other.
Through the association of specific style names for each component CSS styling becomes possible, which allows the user to space and allocate the components as preferred.
The button element can be customized by changing the ``.notification-button`` class in the ``mytheme.scss`` file.
The label element can be customized by changing the ``.notification-badge`` class in the ``mytheme.scss`` file.
Lastly the default vaadin spacing had to be removed from the horizontal-layout to avoid interference with the individual components in the layout.

Credits
-------

This project was created with qube_.

.. _qube: https://github.com/qbicsoftware/qube
