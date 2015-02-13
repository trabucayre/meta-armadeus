SECTION = "kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
DESCRIPTION = "Linux kernel for Armadeus boards"

inherit kernel siteinfo

COMPATIBLE_MACHINE = "(apf51|apf28)"

require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/setup-defconfig.inc
RDEPENDS_kernel-base += "kernel-devicetree"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"
DTB_SYMLINK_NAME = "${MACHINE}"
KERNEL_IMAGE_SYMLINK_NAME = "${MACHINE}-linux"

PV = "3.19"
# v3.19 tag
SRCREV_pn-${PN} = "bfa76d49576599a4b9f9b7a71f23d73d6dcff735"

MACHINE_KERNEL_PR_append = "b"
PR = "${MACHINE_KERNEL_PR}"

FILESPATH =. "${FILE_DIRNAME}/linux-mainline-3.19:${FILE_DIRNAME}/linux-mainline-3.19/${MACHINE}:"

SRC_URI += "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=http \
			file://0420-armadeus-Improve-apf28dev-dts.patch \
			file://${MACHINE}_defconfig"

S = "${WORKDIR}/git"
