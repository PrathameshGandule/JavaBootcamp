class StringCLass{
	String str = "DY Patil COE";                                        // no change after, non-mutable
	StringBuffer sbuffer = new StringBuffer("DYP COE");                 //thread safety no speed   //mutable
	StringBuilder sbuilder = new StringBuilder("DYP COE pimpri");         //no thread safety but speed    /mutable
}