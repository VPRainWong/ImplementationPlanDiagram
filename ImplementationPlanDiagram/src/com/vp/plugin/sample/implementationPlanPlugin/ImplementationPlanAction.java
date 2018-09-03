package com.vp.plugin.sample.implementationPlanPlugin;

import java.awt.Color;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.DiagramManager;
import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;
import com.vp.plugin.diagram.IArchitectureRoadmapUIModel;
import com.vp.plugin.diagram.IDiagramTypeConstants;
import com.vp.plugin.model.IArchitectureRoadmapBar;
import com.vp.plugin.model.IArchitectureRoadmapLane;
import com.vp.plugin.model.IArchitectureRoadmapModel;
import com.vp.plugin.model.IArchitectureRoadmapTimeFrame;
import com.vp.plugin.model.factory.IModelElementFactory;

public class ImplementationPlanAction implements VPActionController{

	@Override
	public void performAction(VPAction arg0) {
		//Create Blank Diagram
		DiagramManager diagramManager = ApplicationManager.instance().getDiagramManager();
		IArchitectureRoadmapUIModel implementationDiagram = (IArchitectureRoadmapUIModel) diagramManager.createDiagram(IDiagramTypeConstants.DIAGRAM_TYPE_ARCHITECTURE_ROADMAP);
		implementationDiagram.setName("Sample Implementation Plan Diagram");
		
		//Create model
		IArchitectureRoadmapModel implementation = IModelElementFactory.instance().createArchitectureRoadmapModel();
		implementationDiagram.setArchitectureRoadmapModelAddress(implementation.getAddress());
		//Set the width for every time frame
		implementation.setTimeFrameWidth(75);
		//Set the length for every lane
		implementation.setLaneHeaderWidth(200);
		
		//Create time frames
		IArchitectureRoadmapTimeFrame jan1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		jan1.setName("Jan-01");
		implementation.addTimeFrame(jan1);
		
		IArchitectureRoadmapTimeFrame feb1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		feb1.setName("Feb-01");
		implementation.addTimeFrame(feb1);
		
		IArchitectureRoadmapTimeFrame mar1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		mar1.setName("Mar-01");
		implementation.addTimeFrame(mar1);
		
		IArchitectureRoadmapTimeFrame apr1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		apr1.setName("Apr-01");
		implementation.addTimeFrame(apr1);
		
		IArchitectureRoadmapTimeFrame may1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		may1.setName("May-01");
		implementation.addTimeFrame(may1);
		
		IArchitectureRoadmapTimeFrame jun1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		jun1.setName("Jun-01");
		implementation.addTimeFrame(jun1);
		
		IArchitectureRoadmapTimeFrame jul1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		jul1.setName("Jul-01");
		implementation.addTimeFrame(jul1);
		
		IArchitectureRoadmapTimeFrame aug1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		aug1.setName("Aug-01");
		implementation.addTimeFrame(aug1);
		
		IArchitectureRoadmapTimeFrame sep1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		sep1.setName("Sep-01");
		implementation.addTimeFrame(sep1);
		
		IArchitectureRoadmapTimeFrame oct1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		oct1.setName("Oct-01");
		implementation.addTimeFrame(oct1);
		
		IArchitectureRoadmapTimeFrame nov1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		nov1.setName("Nov-01");
		implementation.addTimeFrame(nov1);
		
		IArchitectureRoadmapTimeFrame dec1 = IModelElementFactory.instance().createArchitectureRoadmapTimeFrame();
		dec1.setName("Dec-01");
		implementation.addTimeFrame(dec1);
		
		//Create lanes
		IArchitectureRoadmapLane brmsBuild = IModelElementFactory.instance().createArchitectureRoadmapLane();
		brmsBuild.setName("BRMSBuild");
		//Specify the lane's color (and the corresponding bars) in RGB value
		brmsBuild.setColor(Color.BLUE.getRGB());
		//Add the lane to the diagram
		implementation.addLane(brmsBuild);
		
		IArchitectureRoadmapLane customerService = IModelElementFactory.instance().createArchitectureRoadmapLane();
		customerService.setName("Customer Service");
		customerService.setColor((new Color(0,236,0)).getRGB());
		implementation.addLane(customerService);
		
		IArchitectureRoadmapLane riskAssessment = IModelElementFactory.instance().createArchitectureRoadmapLane();
		riskAssessment.setName("Ris Assessment");
		riskAssessment.setColor((new Color(204,0,102)).getRGB());
		implementation.addLane(riskAssessment);
		
		IArchitectureRoadmapLane creditResearch = IModelElementFactory.instance().createArchitectureRoadmapLane();
		creditResearch.setName("Credit research");
		creditResearch.setColor((new Color(255, 128, 0)).getRGB());
		implementation.addLane(creditResearch);
		
		IArchitectureRoadmapLane rulesEnginDesign = IModelElementFactory.instance().createArchitectureRoadmapLane();
		rulesEnginDesign.setName("Rules Engine Design");
		rulesEnginDesign.setColor((new Color(255, 192, 0)).getRGB());
		implementation.addLane(rulesEnginDesign);
		
		//Create Bars
		IArchitectureRoadmapBar analysis = brmsBuild.createArchitectureRoadmapBar();
		analysis.setName("Analysis");
		//Specify the start time
		analysis.setStartTime(0);
		//Specify the end time
		analysis.setEndTime(100);
		//Index = n -> the bar is sitting on row (n+1) on the lane
		analysis.setIndex(0);
		//Add the bar to the lane
		brmsBuild.addBar(analysis);
		
		IArchitectureRoadmapBar development = brmsBuild.createArchitectureRoadmapBar();
		development.setName("Development");
		development.setStartTime(100);
		development.setEndTime(390);
		development.setIndex(1);
		brmsBuild.addBar(development);
		
		IArchitectureRoadmapBar qa = brmsBuild.createArchitectureRoadmapBar();
		qa.setName("QA");
		qa.setStartTime(390);
		qa.setEndTime(590);
		qa.setIndex(2);
		brmsBuild.addBar(qa);
		
		IArchitectureRoadmapBar ua = brmsBuild.createArchitectureRoadmapBar();
		ua.setName("UA");
		ua.setStartTime(600);
		ua.setEndTime(725);
		ua.setIndex(3);
		brmsBuild.addBar(ua);
		
		IArchitectureRoadmapBar reqGathering = customerService.createArchitectureRoadmapBar();
		reqGathering.setName("Requirements Gathering");
		reqGathering.setStartTime(150);
		reqGathering.setEndTime(590);
		reqGathering.setIndex(0);
		customerService.addBar(reqGathering);
		
		IArchitectureRoadmapBar build = customerService.createArchitectureRoadmapBar();
		build.setName("Build");
		build.setStartTime(600);
		build.setEndTime(890);
		build.setIndex(1);
		customerService.addBar(build);
		
		IArchitectureRoadmapBar riskAssessmentPlan = riskAssessment.createArchitectureRoadmapBar();
		riskAssessmentPlan.setName("Risk Assessment Plan");
		riskAssessmentPlan.setStartTime(75);
		riskAssessmentPlan.setEndTime(240);
		riskAssessmentPlan.setIndex(0);
		riskAssessment.addBar(riskAssessmentPlan);
		
		IArchitectureRoadmapBar prepRiskMatrix = riskAssessment.createArchitectureRoadmapBar();
		prepRiskMatrix.setName("Prepare Risk Matrix");
		prepRiskMatrix.setStartTime(240);
		prepRiskMatrix.setEndTime(475);
		prepRiskMatrix.setIndex(1);
		riskAssessment.addBar(prepRiskMatrix);
		
		IArchitectureRoadmapBar pubRiskMatrix = riskAssessment.createArchitectureRoadmapBar();
		pubRiskMatrix.setName("Publish Risk Matirx");
		pubRiskMatrix.setStartTime(475);
		pubRiskMatrix.setEndTime(590);
		pubRiskMatrix.setIndex(2);
		riskAssessment.addBar(pubRiskMatrix);
		
		IArchitectureRoadmapBar conRiskWorkshop = riskAssessment.createArchitectureRoadmapBar();
		conRiskWorkshop.setName("Conduct Risk Workshop");
		conRiskWorkshop.setStartTime(600);
		conRiskWorkshop.setEndTime(730);
		conRiskWorkshop.setIndex(2);
		riskAssessment.addBar(conRiskWorkshop);
		
		IArchitectureRoadmapBar gapAnalysis = creditResearch.createArchitectureRoadmapBar();
		gapAnalysis.setName("Gap Analysis");
		gapAnalysis.setStartTime(240);
		gapAnalysis.setEndTime(440);
		creditResearch.addBar(gapAnalysis);
		
		IArchitectureRoadmapBar draftGapAnalysisRep = creditResearch.createArchitectureRoadmapBar();
		draftGapAnalysisRep.setName("Deaft Gap Analysis Report");
		draftGapAnalysisRep.setStartTime(450);
		draftGapAnalysisRep.setEndTime(630);
		creditResearch.addBar(draftGapAnalysisRep);
		
		IArchitectureRoadmapBar conductInterviews = creditResearch.createArchitectureRoadmapBar();
		conductInterviews.setName("Conduct Interviews");
		conductInterviews.setStartTime(645);
		conductInterviews.setEndTime(890);
		creditResearch.addBar(conductInterviews);
		
		IArchitectureRoadmapBar understandArchi = rulesEnginDesign.createArchitectureRoadmapBar();
		understandArchi.setName("Understand Architecture");
		understandArchi.setStartTime(330);
		understandArchi.setEndTime(630);
		rulesEnginDesign.addBar(understandArchi);
		
		IArchitectureRoadmapBar createDesignDoc = rulesEnginDesign.createArchitectureRoadmapBar();
		createDesignDoc.setName("Create Design Documnet");
		createDesignDoc.setStartTime(645);
		createDesignDoc.setEndTime(825);
		rulesEnginDesign.addBar(createDesignDoc);
		
		//Show up diagram
		diagramManager.openDiagram(implementationDiagram);
	}

	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub
		
	}

}
