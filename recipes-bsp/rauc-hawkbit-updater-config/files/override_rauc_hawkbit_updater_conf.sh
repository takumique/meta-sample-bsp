#!/bin/sh

HAWKBIT_SERVER=`/usr/bin/nvram-read updater_hawkbit_server`
/usr/bin/sed -i "s/<HAWKBIT_SERVER>/${HAWKBIT_SERVER}/g" /etc/rauc-hawkbit-updater/config.conf

TARGET_NAME=`/usr/bin/nvram-read updater_target_name`
/usr/bin/sed -i "s/<TARGET_NAME>/${TARGET_NAME}/g" /etc/rauc-hawkbit-updater/config.conf

AUTH_TOKEN=`/usr/bin/nvram-read updater_auth_token`
/usr/bin/sed -i "s/<AUTH_TOKEN>/${AUTH_TOKEN}/g" /etc/rauc-hawkbit-updater/config.conf

exit 0
