package pk.cui.sc.bridge;

import pk.cui.sc.bridge.devices.Device;
import pk.cui.sc.bridge.remotes.BasicRemote;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
