# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "ssh-server-dropbear"

CORE_IMAGE_EXTRA_INSTALL = "nfs-utils"
EXTRA_IMAGE_FEATURES += "package-management"

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
	"
inherit core-image
