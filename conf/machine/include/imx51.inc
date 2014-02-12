SOC_FAMILY = "imx51"
require conf/machine/include/soc-family.inc

require conf/machine/include/tune-cortexa8.inc

PREFERRED_PROVIDER_virtual/xserver = "xserver-xorg"

# For built-in LCD, add xf86-input-tslib
XSERVER = "xserver-xorg \
           xf86-input-evdev \
           xf86-input-mouse \
           xf86-video-fbdev \
           xf86-input-keyboard"

# Default to external video, change to smallscreen for built-in LCD
GUI_MACHINE_CLASS = "smallscreen"

# Increase this everytime you change something in the kernel
MACHINE_KERNEL_PR = "r21"

# Default providers, may need to override for specific machines
PREFERRED_PROVIDER_virtual/kernel = "linux-mainline-3.13"
#PREFERRED_PROVIDER_virtual/bootloader = "u-boot-armadeus-staging"
#PREFERRED_PROVIDER_u-boot = "u-boot-armadeus-staging"

KERNEL_IMAGETYPE = "uImage"

#UBOOT_ARCH = "arm"
#UBOOT_MACHINE = "apf51_config"

UBOOT_ENTRYPOINT = "0x90008000"
UBOOT_LOADADDRESS = "0x90008000"

# Use the expected value of the ubifs filesystem's volume name in the kernel
# and u-boot.
UBI_VOLNAME = "rootfs"

#EXTRA_IMAGEDEPENDS += "u-boot"
KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

# List common SoC features, may need to add touchscreen for specific machines
MACHINE_FEATURES = "kernel26 apm usbgadget usbhost vfat ext2 screen alsa ethernet"
