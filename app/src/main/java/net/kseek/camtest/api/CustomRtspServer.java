package net.kseek.camtest.api;import net.kseek.streaming.Session;import net.kseek.streaming.rtsp.RtspServer;public class CustomRtspServer extends RtspServer {	public CustomRtspServer() {		super();		// RTSP server disabled by default		mEnabled = false;	}}