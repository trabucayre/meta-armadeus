# Copyright (C) 2013-2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Freescale"
DESCRIPTION = "Linux Kernel provided and supported by Freescale with focus on \
i.MX Family Reference Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.1.15_1.0.0_ga"
LOCALVERSION = "-1.2.0"
SRCREV = "77f61547834c4f127b44b13e43c59133a35880dc"

# Add patches for gcc 6 compiler issue
SRC_URI += "file://gcc6_integrate_fix.patch \
            file://bcmhd_gcc6_indent_warning_error_fix.patch \
            file://gpu-viv_gcc6_indent_warning_error_fix.patch \
            file://0015-armadeus-logo-add_armadeus-project_tux.patch \
            file://0450-armadeus-add-apf6q-and-apf6dl-device-trees.patch \
            file://0452-Input-sx8654-support-inverted-y-prop.patch \
            file://0500-mxc_ipuv3_fb-unblank-displays-at-init.patch \
            file://0501-mxc_ipuv3_fb-move-fb_blank-call-after-registration.patch \
            file://0502-mxc_hdmi-enable-overflow-interrupt-after-initializat.patch \
            file://0503-Add-support-for-DVI-monitors.patch \
            file://0513-armadeus-add-apf6-kernel-config-fragment-to-imx-v7-defconfig.patch "

DEFAULT_PREFERENCE = "1"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
