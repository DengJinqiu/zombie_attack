package com.jinqiu.zombieattack.view.factory;

import android.graphics.PointF;

import com.jinqiu.zombieattack.model.ExpirableObject;
import com.jinqiu.zombieattack.view.component.object.ViewExpirableObject;
import com.jinqiu.zombieattack.view.component.object.ViewMovingExpirableObject;
import com.jinqiu.zombieattack.view.component.object.cycleplay.ZombieFastCyclePlay;

public class ViewZombieFastFactory implements ViewExpirableObjectFactory {

	@Override
	public ViewExpirableObject getViewExpirableObject(
			ExpirableObject expirableObject) {

		return new ViewMovingExpirableObject(expirableObject,
				new ZombieFastCyclePlay(expirableObject.getObjectState()),
				new PointF(expirableObject.getCenterX(),
						expirableObject.getCenterY()));
	}

}
