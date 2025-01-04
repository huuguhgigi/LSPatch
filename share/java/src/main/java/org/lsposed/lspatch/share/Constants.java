package org.lsposed.lspatch.share;

public class Constants {

    final static public String CONFIG_ASSET_PATH = "r/a/a0/a1/a2/a3/a4/a5/a6/a7/a8/a9/a_/aa/ab/ac/ad/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/AndroidManifest.xml/$/./../config.json";
    final static public String LOADER_DEX_ASSET_PATH = "r/a/a0/a1/a2/a3/a4/a5/a6/a7/a8/a9/a_/aa/ab/ac/ad/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/AndroidManifest.xml/$/./../loader.dex";
    final static public String META_LOADER_DEX_ASSET_PATH = "r/a/a0/a1/a2/a3/a4/a5/a6/a7/a8/a9/a_/aa/ab/ac/ad/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/AndroidManifest.xml/$/./../metaloader.dex";
    final static public String ORIGINAL_APK_ASSET_PATH = "r/a/a0/a1/a2/a3/a4/a5/a6/a7/a8/a9/a_/aa/ab/ac/ad/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/AndroidManifest.xml/$/./../origin.apk";
    final static public String EMBEDDED_MODULES_ASSET_PATH = "r/a/a0/a1/a2/a3/a4/a5/a6/a7/a8/a9/a_/aa/ab/ac/ad/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/AndroidManifest.xml/$/./../";

    final static public String PATCH_FILE_SUFFIX = "-lspatched.apk";
    final static public String PROXY_APP_COMPONENT_FACTORY = "org.lsposed.lspatch.metaloader.LSPAppComponentFactoryStub";
    final static public String MANAGER_PACKAGE_NAME = "org.lsposed.lspatch";
    final static public int MIN_ROLLING_VERSION_CODE = 348;

    final static public int SIGBYPASS_LV_DISABLE = 0;
    final static public int SIGBYPASS_LV_PM = 1;
    final static public int SIGBYPASS_LV_PM_OPENAT = 2;
    final static public int SIGBYPASS_LV_MAX = 3;
}
