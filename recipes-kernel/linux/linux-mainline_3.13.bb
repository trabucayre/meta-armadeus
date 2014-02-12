#require linux.inc
SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
DESCRIPTION = "Linux kernel for Armadeus boards"

inherit kernel siteinfo

COMPATIBLE_MACHINE = "apf51"

require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/setup-defconfig.inc
RDEPENDS_kernel-base += "kernel-devicetree"

KERNEL_DEVICETREE_apf51 = "imx51-apf51dev.dtb"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"
DTB_SYMLINK_NAME = "${MACHINE}"
KERNEL_IMAGE_SYMLINK_NAME = "${MACHINE}-linux"

PV = "3.13-rc7"
# v3.2.28 tag
SRCREV_pn-${PN} = "d6e0a2dd12f4067a5bcefb8bbd8ddbeff800afbc"

# The main PR is now using MACHINE_KERNEL_PR, for omap3 see conf/machine/include/omap3.inc
MACHINE_KERNEL_PR_append = "b"
PR = "${MACHINE_KERNEL_PR}"

FILESPATH =. "${FILE_DIRNAME}/linux-mainline-3.13:${FILE_DIRNAME}/linux-mainline-3.13/${MACHINE}:"

SRC_URI += "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=http \
			file://0300-armadeus-add_armadeus_drivers.patch \
			file://0301-armadeus-add_custom_drivers_to_kconfig.patch \
			file://0322-armadeus-add_mach_fpga_h.patch \
			file://0323-armadeus-mach_fpga_add_dt_support_for_mx27.patch \
			file://0400-Add-apf51-basic-dt-support.patch \
			file://0401-armadeus-add_apf51dev_baseboard.patch \
			file://0401-ggm-add_apf51dev_baseboard.patch \
			file://0407-armadeus-imx51_dts-add_usbphy_for_host1_and_host2.patch \
			file://0408-armadeus-imx51-chipidea-usbmisc_imx-add_imx51_support.patch \
			file://0409-armadeus-chipidea-add_node_to_select_clk_phy.patch \
			file://0412-armadeus-imx51-dts-add-pin-definition-for-uart1.patch \
			file://0413-armadeus-imx-drm-fix_clk_polarity_for_apf51_screen.patch \
			file://0423-armadeus-adding_mcp4912_dac_chip_driver.patch \
			file://0425-armadeus-mcp2515-dont_overwrite_all_CANCTRL_bits_when_changing_mode.patch \
			file://0431-armadeus-clock-mx51-do_not_link_otg_phy_clock_directly_to_osc_ref.patch \
			file://0433-armadeus-wm83x1-add_dt_support.patch \
			file://0434-armadeus-gpio_backlight-add_dt_support.patch \
			file://0435-armadeus-add_wm8960_DT_support.patch \
			file://0436-armadeus-mach_fpga_add_dt_support_for_mx51.patch \
			file://0441-armadeus-adding_star_completion_for_source_in_menuconfig.patch \
			file://0442-a-linaro-add_V4L2_PIX_FMT_RGB666.patch \
			file://0442-b-linaro-add_rgb666.patch \
			file://0442-c-linaro-imx_drm-rgb.patch \
            file://apf51_defconfig"

S = "${WORKDIR}/git"
