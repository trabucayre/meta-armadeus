meta-armadeus
=============

OpenEmbedded/Yocto BSP layer for Armadeus Boards (currently APF28/APF51/APF6).

Depends:
--------

This layer depends on:
Yocto:

	git clone -b krogoth git://git.yoctoproject.org/poky.git poky

Meta-openembedded:

	git clone -b krogoth git://git.openembedded.org/meta-openembedded

Meta-fsl-arm:

	git clone -b krogoth git@github.com:Freescale/meta-fsl-arm.git

Configuration:
--------------
Add :

	/somewhere/poky/meta-openembedded \
	/somewhere/poky/meta-fsl-arm \
	/somewhere/poky/meta-armadeus \

to the **BBLAYERS** part of *conf/bblayers.conf*:

And fix **MACHINE** variable in *conf/local.conf*. Value may be :
* apf28
* apf51
* apf6dev-solo
* apf6dev-dual
* apf6dev-quad

