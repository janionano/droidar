package de.rwth.setups;

import geo.GeoObj;
import gl.Color;
import gl.GL1Renderer;
import gl.GLFactory;
import gl.scenegraph.MeshComponent;
import system.DefaultARSetup;
import util.Vec;
import worldData.World;

public class GeoPosTestSetup extends DefaultARSetup {

	@Override
	public void addObjectsTo(GL1Renderer renderer, World world,
			GLFactory objectFactory) {
		GeoObj o = new GeoObj(-29.456251,-51.968653);
//		o.setComp(GLFactory.getInstance().newSolarSystem(new Vec()));
		MeshComponent mesh1 = GLFactory.getInstance().newCube();
//		mesh1.setScale(new Vec(3, 3, 3));
		o.setComp(mesh1);
		world.add(o);
		
		Color color = new Color("#ff00ff");
		MeshComponent mesh = GLFactory.getInstance().newCube(color);
		//mesh.setScale(new Vec(20, 20, 20));
		
		GeoObj cedro = new GeoObj(-29.477376,-51.983571);
		cedro.setComp(mesh);
		world.add(cedro);
		
		//Faleiro: -29.466055,-51.961384
		Color colorF = new Color("#ff00ff");
		MeshComponent meshF = GLFactory.getInstance().newCube(colorF);
		meshF.setScale(new Vec(20, 20, 20));
		
		GeoObj cemetery = new GeoObj(-29.460381,-51.967412);
		cemetery.setComp(meshF);
		world.add(cemetery);
		
		// São Cri: -29.454733,-51.966877
		Color colorS = new Color("#00ff00");
		MeshComponent meshS = GLFactory.getInstance().newCube(colorS);
		//meshS.setScale(new Vec(20, 20, 20));
		
		// Objetos sao visiveis ate 1 km
		GeoObj saocri = new GeoObj(-29.454733,-51.966877);
		saocri.setComp(meshS);
		world.add(saocri);
	}

}
