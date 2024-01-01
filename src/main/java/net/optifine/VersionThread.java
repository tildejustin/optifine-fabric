package net.optifine;

import org.lwjgl.Sys;
import org.lwjgl.opengl.*;

import java.io.*;
import java.net.*;
import java.util.*;

public class VersionThread extends Thread {
    public static String newRelease = null;
    public static final String OF_NAME = "OptiFine";
    public static final String MC_VERSION = "1.3.2";
    public static final String OF_EDITION = "L";
    public static final String OF_RELEASE = "B2";
    public static final String VERSION = "OptiFine_1.3.2_L_B2";

    @Override
    public void run() {
        try {
            System.out.println("Checking for new version");
            URL url = new URL("http://optifine.net/version/1.3.2/L.txt");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(false);
            conn.connect();

            try {
                InputStream in = conn.getInputStream();
                String verStr = readInputStream(in);
                in.close();
                String[] verLines = tokenize(verStr, "\n\r");
                if (verLines.length < 1) {
                    return;
                }

                String newVer = verLines[0];
                System.out.println("Version found: " + newVer);
                if (compareRelease(newVer, "B2") > 0) {
                    newRelease = newVer;
                }
            } finally {
                conn.disconnect();
            }
        } catch (Exception var11) {
            System.out.println("Version check failed");
        }
    }

    public static void checkOpenGlCaps() {
        System.out.println();
        System.out.println("OptiFine_1.3.2_L_B2");
        System.out.println("" + new Date());
        System.out.println("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
        System.out.println("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
        System.out.println("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
        System.out.println("LWJGL: " + Sys.getVersion());
        System.out.println("OpenGL: " + GL11.glGetString(7937) + " version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936));
        int ver = getOpenGlVersion();
        String verStr = ver / 10 + "." + ver % 10;
        System.out.println("OpenGL Version: " + verStr);
        if (!GLContext.getCapabilities().GL_NV_fog_distance) {
            System.out.println("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
        }

        if (!GLContext.getCapabilities().GL_ARB_occlusion_query) {
            System.out.println("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
        }
    }

    private static int getOpenGlVersion() {
        if (!GLContext.getCapabilities().OpenGL11) {
            return 10;
        } else if (!GLContext.getCapabilities().OpenGL12) {
            return 11;
        } else if (!GLContext.getCapabilities().OpenGL13) {
            return 12;
        } else if (!GLContext.getCapabilities().OpenGL14) {
            return 13;
        } else if (!GLContext.getCapabilities().OpenGL15) {
            return 14;
        } else if (!GLContext.getCapabilities().OpenGL20) {
            return 15;
        } else if (!GLContext.getCapabilities().OpenGL21) {
            return 20;
        } else if (!GLContext.getCapabilities().OpenGL30) {
            return 21;
        } else if (!GLContext.getCapabilities().OpenGL31) {
            return 30;
        } else if (!GLContext.getCapabilities().OpenGL32) {
            return 31;
        } else if (!GLContext.getCapabilities().OpenGL33) {
            return 32;
        } else {
            return !GLContext.getCapabilities().OpenGL40 ? 33 : 40;
        }
    }

    public static String readInputStream(InputStream in) throws IOException {
        return readInputStream(in, "ASCII");
    }

    public static String readInputStream(InputStream in, String encoding) throws IOException {
        InputStreamReader inr = new InputStreamReader(in, encoding);
        BufferedReader br = new BufferedReader(inr);
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line == null) {
                return sb.toString();
            }

            sb.append(line);
            sb.append("\n");
        }
    }

    public static String[] tokenize(String str, String delim) {
        StringTokenizer tok = new StringTokenizer(str, delim);
        List<String> list = new ArrayList<>();

        while (tok.hasMoreTokens()) {
            String token = tok.nextToken();
            list.add(token);
        }

        return list.toArray(new String[0]);
    }

    public static int compareRelease(String rel1, String rel2) {
        String[] rels1 = splitRelease(rel1);
        String[] rels2 = splitRelease(rel2);
        String branch1 = rels1[0];
        String branch2 = rels2[0];
        if (!branch1.equals(branch2)) {
            return branch1.compareTo(branch2);
        } else {
            int rev1 = parseInt(rels1[1], -1);
            int rev2 = parseInt(rels2[1], -1);
            if (rev1 != rev2) {
                return rev1 - rev2;
            } else {
                String suf1 = rels1[2];
                String suf2 = rels2[2];
                return suf1.compareTo(suf2);
            }
        }
    }

    private static String[] splitRelease(String relStr) {
        if (relStr != null && !relStr.isEmpty()) {
            String branch = relStr.substring(0, 1);
            if (relStr.length() <= 1) {
                return new String[]{branch, "", ""};
            } else {
                int pos = 1;

                while (pos < relStr.length() && Character.isDigit(relStr.charAt(pos))) {
                    pos++;
                }

                String revision = relStr.substring(1, pos);
                if (pos >= relStr.length()) {
                    return new String[]{branch, revision, ""};
                } else {
                    String suffix = relStr.substring(pos);
                    return new String[]{branch, revision, suffix};
                }
            }
        } else {
            return new String[]{"", "", ""};
        }
    }

    public static int parseInt(String str, int defVal) {
        try {
            return str == null ? defVal : Integer.parseInt(str);
        } catch (NumberFormatException var3) {
            return defVal;
        }
    }
}
