# Armadeus APF6 common variables
# Supported platform : APF6 (Solo - Dual - Quad)
PREFERRED_PROVIDER_virtual/kernel ?= "linux-imx"
#PREFERRED_VERSION_linux-apf6 ?= "4.4.6"
PREFERRED_PROVIDER_u-boot = "u-boot-armadeus"
PREFERRED_PROVIDER_virtual/bootloader = "u-boot-armadeus"

UBOOT_MAKE_TARGET = "u-boot.img SPL"
UBOOT_SUFFIX = "img"

SERIAL_CONSOLE = "115200 ttymxc3"

MACHINE_FEATURES += "pci touchscreen"

KERNEL_IMAGETYPE = "zImage"
