preferences {
    input("deviceIp", "text", title: "Device IP")
    input("deviceMac", "text", title: "Device MAC Address")
}

metadata {
  definition (name: "Roku TV", namespace: "ericboehs", author: "Eric Boehs") {
    capability "Switch"
    capability "Polling"
    capability "Refresh"
    command "home"
    command "back"
    command "select"
    command "up"
    command "down"
    command "left"
    command "right"
    command "volume_up"
    command "volume_down"
    command "channel_up"
    command "channel_down"
    command "volume_mute"
    command "netflix"
    command "plex"
    command "youtube"
    command "primevideo"
    command "hdmi1"
    command "hdmi2"
    command "hdmi3"
    command "cvbs"
    command "antenna"
  }

  simulator {
  }

  tiles(scale: 2) {
    standardTile("button", "device.switch", width: 2, height: 2, canChangeIcon: true) {
      state "off", label: 'Off', action: "switch.on", icon: "sst.switches.switch.off", backgroundColor: "#ffffff", nextState: "on"
      state "on", label: 'On', action: "switch.off", icon: "st.switches.switch.on", backgroundColor: "#79b821", nextState: "off"
    }

    standardTile("refresh", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"", action:"refresh.refresh", icon:"st.secondary.refresh-icon"
    }

	standardTile("home", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Home", action:"home", icon:"https://static.helpjuice.com/helpjuice_production/uploads/upload/image/2771/114109/home1600.png"
    }
    
    	standardTile("back", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Back", action:"back", icon:"https://cdn4.iconfinder.com/data/icons/layout-control-icons/100/14-512.png"
    }

	standardTile("up", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Up", action:"up", icon:"st.thermostat.thermostat-up"
    }
    
    	standardTile("down", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Down", action:"down", icon:"st.thermostat.thermostat-down"
    }
    
    	standardTile("left", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Left", action:"left", icon:"st.thermostat.thermostat-left"
    }
    
    	standardTile("right", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Right", action:"right", icon:"st.thermostat.thermostat-right"
    }
    
      	standardTile("select", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"OK", action:"select", icon:"st.illuminance.illuminance.dark"
    }
    
    standardTile("volume_up", "device.switch", width: 2, height: 1, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Vol +", action:"volume_up", icon:"st.custom.sonos.unmuted"
    }

    standardTile("volume_down", "device.switch", width: 2, height: 1, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Vol -", action:"volume_down", icon:"st.custom.sonos.unmuted"
    }
    
        standardTile("channel_up", "device.switch", width: 2, height: 1, inactiveLabel: false, decoration: "flat") {
      state "default", label:"CH +", action:"channel_up", icon:"st.custom.sonos.unmuted"
    }

    standardTile("channel_down", "device.switch", width: 2, height: 1, inactiveLabel: false, decoration: "flat") {
      state "default", label:"CH -", action:"channel_down", icon:"st.custom.sonos.unmuted"
    }

    standardTile("volume_mute", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Mute", action:"volume_mute", icon:"st.custom.sonos.muted"
    }

    standardTile("netflix", "device.switch", width: 1, height: 1, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Netflix", action:"netflix", icon:"http://icons.iconarchive.com/icons/stalker018/mmii-flat-vol-2/128/netflix-icon.png"
    }

    standardTile("plex", "device.switch", width: 1, height: 1, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Plex", action:"plex", icon:"https://wiki.mrmc.tv/images/c/cf/Plex_icon.png"
    }
    
     standardTile("youtube", "device.switch", width: 1, height: 1, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Youtube", action:"youtube", icon:"http://pngimg.com/uploads/youtube/youtube_PNG18.png"
    }

    standardTile("amazonvideo", "device.switch", width: 1, height: 1, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Amazon Video", action:"amazonvideo", icon:"https://images-na.ssl-images-amazon.com/images/I/411j1k1u9yL._SY355_.png"
    }

    standardTile("hdmi1", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"HDMI 1", action:"hdmi1", icon:"st.Electronics.electronics12"
    }

    standardTile("hdmi2", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"HDMI 2", action:"hdmi2", icon:"st.Electronics.electronics12"
    }

    standardTile("hdmi3", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"HDMI 3", action:"hdmi3", icon:"st.Electronics.electronics12"
    }

    standardTile("cvbs", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"AV", action:"cvbs", icon:"st.Electronics.electronics12"
    }
    
        standardTile("antenna", "device.switch", width: 2, height: 2, inactiveLabel: false, decoration: "flat") {
      state "default", label:"Antenna", action:"antenna", icon:"st.Electronics.electronics12"
    }

    main "button"
    details(["back", "button", "home", "volume_up","up", "channel_up",  "volume_down","channel_down","left",     "select","right","netflix", "plex",  "down", "hdmi1", "youtube", "amazonvideo", "hdmi2", "hdmi3", "cvbs", "antenna", "refresh","volume_mute",])
  }
}

def installed() {
  updated()
}

def updated() {
  log.debug "updated"
  poll()
  runEvery1Minute(poll)
}

def parse(String description) {
  def msg = parseLanMessage(description)
  if (msg.body && msg.body.contains("PowerOn")) {
    sendEvent(name: "switch", value: "on")
  }else{
    sendEvent(name: "switch", value: "off")
  }
}

def on() {
  sendEvent(name: "switch", value: "on")

  sendHubCommand(new physicalgraph.device.HubAction (
    "wake on lan ${deviceMac}",
    physicalgraph.device.Protocol.LAN,
    null,
    [:]
  ))

  keypress('Power')
}

def off() {
  sendEvent(name: "switch", value: "off")
  keypress('PowerOff')
}

def home() {
  keypress('Home')
}

def back() {
  keypress('Back')
}


def up() {
  keypress('Up')
}

def down() {
  keypress('Down')
}

def left() {
  keypress('Left')
}

def right() {
  keypress('Right')
}

def select() {
  keypress('Select')
}

def volume_up() {
  keypress('VolumeUp')
}

def volume_down() {
  keypress('VolumeDown')
}

def channel_up() {
  keypress('ChannelUp')
}

def channel_down() {
  keypress('ChannelDown')
}

def volume_mute() {
  keypress('VolumeMute')
}

def netflix() {
  launchApp('12')
}

def plex() {
  launchApp('13535')
}

def youtube() {
  launchApp('837')
}

def amazonvideo() {
  launchApp('13')
}

def antenna() {
  keypress('InputTuner')
}

def hdmi1() {
  keypress('InputHDMI1')
}

def hdmi2() {
  keypress('InputHDMI2')
}

def hdmi3() {
  keypress('InputHDMI3')
}

def cvbs() {
  keypress('InputAV1')
}

def poll() {
  log.debug "Executing 'poll'"
  refresh()
}

def refresh() {
  log.debug "Executing 'refresh'"
  queryDeviceState()
}

def queryDeviceState() {
  
  sendHubCommand( new physicalgraph.device.HubAction(
    method: "GET",
    path: "/query/device-info",
    headers: [ HOST: "${deviceIp}:8060" ]
  ))
}

def keypress(key) {
  log.debug "Executing '${key}'"
  def result = new physicalgraph.device.HubAction(
    method: "POST",
    path: "/keypress/${key}",
    headers: [ HOST: "${deviceIp}:8060" ],
  )
}

def launchApp(appId) {
  log.debug "Executing 'launchApp ${appId}'"
  def result = new physicalgraph.device.HubAction(
    method: "POST",
    path: "/launch/${appId}",
    headers: [ HOST: "${deviceIp}:8060" ],
  )
}