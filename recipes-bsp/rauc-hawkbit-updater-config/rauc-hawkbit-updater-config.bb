SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

SRC_URI = "file://."
S = "${WORKDIR}"

inherit systemd

do_install() {
    install -d ${D}${bindir}/
    install -m 0755 ${S}/override_rauc_hawkbit_updater_conf.sh ${D}${bindir}/override_rauc_hawkbit_updater_conf.sh
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${S}/override_rauc_hawkbit_updater_conf.service ${D}${systemd_unitdir}/system/override_rauc_hawkbit_updater_conf.service
}

# SYSTEMD_AUTO_ENABLE:${PN} = "enable"
SYSTEMD_SERVICE:${PN} = "override_rauc_hawkbit_updater_conf.service"

DEPENDS += " rauc-hawkbit-updater"
