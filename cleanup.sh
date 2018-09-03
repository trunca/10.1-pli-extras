#!/bin/sh
echo ""
echo "Welcome to Persian Prince's OE cleanup script!"
echo "After using this script the size of the build folder will be reduced."
echo "Enter the machine name you want to cleanup:"
echo ""
read MACHINE
echo ""
echo "Removing $MACHINE build folders, please wait ..."
cd ..
echo ""
#echo "Space will be freed after this operation:"
#du -sh build/tmp/buildstats | cut -f1
rm -rf build/tmp/buildstats/*
echo ""
echo "buildstats cleaned!"
echo ""
#echo "Space will be freed after this operation:"
#du -sh build/tmp/cache/default-glibc/$MACHINE | cut -f1
rm -rf build/tmp/cache/default-glibc/$MACHINE
echo ""
echo "cache/default-glibc cleaned!"
echo ""
#echo "Space will be freed after this operation:"
#du -sh build/tmp/deploy/ipk/$MACHINE | cut -f1
rm -rf build/tmp/deploy/ipk/$MACHINE
echo ""
echo "deploy/ipk cleaned!"
echo ""
#echo "Space will be freed after this operation:"
#du -sh build/tmp/deploy/images/$MACHINE | cut -f1
rm -rf build/tmp/deploy/images/$MACHINE
echo ""
echo "deploy/images cleaned!"
echo ""
#echo "Space will be freed after this operation:"
#du -sh build/tmp/log/cooker/$MACHINE | cut -f1
rm -rf build/tmp/log/cooker/$MACHINE
echo ""
echo "log/cooker cleaned!"
echo ""
#echo "Space will be freed after this operation:"
#du -sh build/tmp/pkgdata/$MACHINE | cut -f1
rm -rf build/tmp/pkgdata/$MACHINE
echo ""
echo "pkgdata cleaned!"
echo ""
#echo "Space will be freed after this operation:"
#echo "less than 10M"
rm -rf build/tmp/sstate-control/*$MACHINE*
echo ""
echo "sstate-control cleaned!"
echo ""
#echo "Space will be freed after this operation:"
#du -sh build/tmp/stamps/$MACHINE-oe-linu* | cut -f1
rm -rf build/tmp/stamps/$MACHINE-oe-linu*
echo ""
echo "stamps cleaned!"
echo ""
#echo "Space will be freed after this operation:"
#du -sh build/tmp/sysroots-components/$MACHINE | cut -f1
rm -rf build/tmp/sysroots-components/$MACHINE
echo ""
echo "sysroots-components cleaned!"
echo ""
#echo "Space will be freed after this operation:"
#du -sh build/tmp/work/$MACHINE-oe-linu* | cut -f1
rm -rf build/tmp/work/$MACHINE-oe-linu*
echo ""
echo "work cleaned!"
echo ""
#echo "Space will be freed after this operation:"
#du -sh build/tmp/work-shared/$MACHINE | cut -f1
rm -rf build/tmp/work-shared/$MACHINE
echo ""
echo "work-shared cleaned!"
echo "Done."
