//
//NOTE: Add this method to your Render.java class.
//

protected void renderNameTag(T entity, double x, double y, double z)
    {
    	if(this.canRenderNameTag(entity))
    	{
    		this.renderLivingLabel(entity, entity.getDisplayName().getFormattedText(), x, y, z, 64);
    	}
    }
    
protected boolean canRenderNameTag(T entity)
    {
        return entity.getAlwaysRenderNameTagForRender();
    }

//
//NOTE: Add this line to your doRender method.
//

this.renderNameTag(entity, x, y, z);
