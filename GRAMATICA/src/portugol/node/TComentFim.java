/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TComentFim extends Token
{
    public TComentFim()
    {
        super.setText("*/");
    }

    public TComentFim(int line, int pos)
    {
        super.setText("*/");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentFim(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentFim(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComentFim text.");
    }
}