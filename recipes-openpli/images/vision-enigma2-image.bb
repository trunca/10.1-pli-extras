require vision-image.bb

KERNEL_WIFI_DRIVERS += "\
	firmware-carl9170 \
	firmware-htc7010 \
	firmware-htc9271 \
	firmware-rt2870 \
	firmware-rt73 \
	firmware-rtl8712u \
	firmware-zd1211 \
	kernel-module-ath9k-htc \
	kernel-module-carl9170 \
	kernel-module-r8712u \
	kernel-module-rt2500usb \
	kernel-module-rt2800usb \
	kernel-module-rt73usb \
	kernel-module-rtl8187 \
	kernel-module-zd1211rw \
	"

EXTRA_KERNEL_WIFI_DRIVERS += "\
	firmware-rtl8192cu \
	kernel-module-r8188eu \
	kernel-module-rtl8192cu \
	"

EXTERNAL_WIFI_DRIVERS += "\
	firmware-rtl8192cu \
	rtl8192cu \
	rtl8188eu \
	rtl8192eu \
	"

ENIGMA2_PLUGINS += "\
	enigma2-plugin-extensions-audiosync \
	enigma2-plugin-extensions-autobackup \
	enigma2-plugin-extensions-cutlisteditor \
	enigma2-plugin-extensions-graphmultiepg \
	enigma2-plugin-extensions-mediaplayer \
	enigma2-plugin-extensions-mediascanner \
	enigma2-plugin-extensions-moviecut \
	enigma2-plugin-extensions-openwebif-extras \
	enigma2-plugin-extensions-pictureplayer \
	enigma2-plugin-systemplugins-fastscan \
	enigma2-plugin-systemplugins-hotplug \
	enigma2-plugin-systemplugins-networkbrowser \
	enigma2-plugin-systemplugins-positionersetup \
	enigma2-plugin-systemplugins-satfinder \
	enigma2-plugin-systemplugins-skinselector \
	enigma2-plugin-systemplugins-softwaremanager \
	enigma2-plugin-systemplugins-videomode \
	enigma2-plugin-systemplugins-videotune \
	enigma2-plugin-systemplugins-osdpositionsetup \
	enigma2-plugin-extensions-backupsuite \
	enigma2-plugin-extensions-cacheflush \
	enigma2-plugin-systemplugins-wirelesslan \
	${@bb.utils.contains("MACHINE_FEATURES", "3dtv", "enigma2-plugin-systemplugins-osd3dsetup" , "", d)} \
	${@bb.utils.contains("MACHINE_FEATURES", "dvb-c", "enigma2-plugin-systemplugins-cablescan" , "", d)} \
	${@bb.utils.contains("MACHINE_FEATURES", "hdmicec", "enigma2-plugin-systemplugins-hdmicec" , "", d)} \
	${@bb.utils.contains('MACHINE_FEATURES', 'ci', 'enigma2-plugin-systemplugins-commoninterfaceassignment', '', d)} \
	${@bb.utils.contains('MACHINE_FEATURES', 'dvd', 'enigma2-plugin-extensions-cdinfo enigma2-plugin-extensions-dvdplayer', '', d)} \
	${@bb.utils.contains('MACHINE_FEATURES', 'fan', 'enigma2-plugin-systemplugins-extrafancontrol', '', d)} \
	${@bb.utils.contains('MACHINE_FEATURES', '7seg', 'enigma2-plugin-systemplugins-vfdcontrol', '', d)} \
	${@bb.utils.contains('MACHINE_FEATURES', '7segment', 'enigma2-plugin-systemplugins-vfdcontrol', '', d)} \
	${@bb.utils.contains('MACHINE_FEATURES', 'multitranscoding', 'enigma2-plugin-systemplugins-transcodingsetup', '', d)} \
	${@bb.utils.contains('MACHINE_FEATURES', 'fanctrl', 'enigma2-plugin-extensions-fancontrol2', '', d)} \
	${@bb.utils.contains("MACHINE_FEATURES", "smallflash", "", " \
	enigma2-plugin-systemplugins-bh-skin-support \
	enigma2-plugin-extensions-openwebif-extras-vti-theme \
	enigma2-plugin-extensions-xmodem \
	enigma2-plugin-extensions-foreca \
	enigma2-plugin-extensions-dlnabrowser \
	enigma2-plugin-extensions-filebrowser \
	enigma2-plugin-extensions-vlcplayer \
	enigma2-plugin-systemplugins-systemtime \
	enigma2-plugin-systemplugins-setpasswd \
	enigma2-plugin-extensions-reconstructapsc \
	enigma2-plugin-softcams-oscam \
	enigma2-plugin-softcams-oscam-emu", d)} \
	"

DEPENDS += "\
	enigma2 \
	enigma2-pliplugins \
	enigma2-plugins \
	"

IMAGE_INSTALL += "\
	aio-grab \
	enigma2 \
	libavahi-client \
	settings-autorestore \
	tuxbox-common \
	${ENIGMA2_PLUGINS} \
	${@bb.utils.contains("MACHINE_FEATURES", "transcoding", "enigma2-plugin-systemplugins-transcodingsetup", "", d)} \
	${@bb.utils.contains("MACHINE_FEATURES", "streamproxy", "streamproxy", "", d)} \
	${@bb.utils.contains('MACHINE_FEATURES', 'ctrlrc', "enigma2-plugin-systemplugins-remotecontrolcode", "", d)} \
	${@bb.utils.contains('MACHINE_FEATURES', 'colorlcd', "enigma2-plugin-extensions-lcd4linux", "", d)} \
	${@bb.utils.contains("MACHINE_FEATURES", "kernelwifi", "${KERNEL_WIFI_DRIVERS}", "", d)} \
	${@bb.utils.contains("MACHINE_FEATURES", "extrakernelwifi", "${EXTRA_KERNEL_WIFI_DRIVERS}", "", d)} \
	${@bb.utils.contains("MACHINE_FEATURES", "externalwifi", "${EXTERNAL_WIFI_DRIVERS}", "", d)} \
	${@bb.utils.contains('MACHINE_FEATURES', 'dvd', 'cdtextinfo', '', d)} \
	${@bb.utils.contains("MACHINE_FEATURES", "smallflash", "", " \
	ofgwrite \
	samba-base \
	busybox-cron \
	curl \
	ntp \
	astra-sm \
	dvbsnoop \
	hddtemp \
	ntfs-3g \
	parted \
	strace \
	nbench-byte \
	wscan \
	iptraf", d)} \
	"

export IMAGE_BASENAME = "vision-enigma2"
