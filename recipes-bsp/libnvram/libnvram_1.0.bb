SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/takumique/nvram.git;branch=main;protocol=https"
SRCREV = "3db331d2f6713fd3a85201f70752b19d65d8614c"
S = "${WORKDIR}/git/libnvram"

inherit cmake
