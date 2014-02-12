meta-armadeus
=============

OpenEmbedded/Yocto BSP layer for Armadeus Boards (currently only APF51).

Depends:
--------

This layer depends on:
Yocto:
	git clone git://git.yoctoproject.org/poky.git poky

Meta-oe:
	git clone https://github.com/openembedded/meta-oe.git

Configuration:
--------------
conf/bblayers.conf:
/home/gwe/yocto/poky/meta-oe 
/home/gwe/yocto/poky/meta-armadeus

conf/local.conf: MACHINE = "apf51"

