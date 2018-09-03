FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

DEPENDS_cube += "libnl linux-libc-headers"

SRC_URI_append_dm800 += "file://legacy_kernel.patch"
SRC_URI_append_cube += "file://legacy_kernel.patch"
