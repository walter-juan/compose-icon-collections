package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.GlobeEuropeAfrica: ImageVector
    get() {
        if (_globeEuropeAfrica != null) {
            return _globeEuropeAfrica!!
        }
        _globeEuropeAfrica = Builder(name = "GlobeEuropeAfrica", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 0.0f)
                moveTo(3.668f, 2.501f)
                lineToRelative(-0.288f, 0.646f)
                arcToRelative(0.847f, 0.847f, 0.0f, false, false, 1.479f, 0.815f)
                lineToRelative(0.245f, -0.368f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, 1.034f, -0.275f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, false, 0.724f, 0.0f)
                lineToRelative(0.261f, -0.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.775f, -0.05f)
                lineToRelative(0.984f, 0.34f)
                quadToRelative(0.118f, 0.04f, 0.243f, 0.054f)
                curveToRelative(0.784f, 0.093f, 0.855f, 0.377f, 0.694f, 0.801f)
                curveToRelative(-0.155f, 0.41f, -0.616f, 0.617f, -1.035f, 0.487f)
                lineToRelative(-0.01f, -0.003f)
                curveTo(8.274f, 4.663f, 7.748f, 4.5f, 6.0f, 4.5f)
                curveTo(4.8f, 4.5f, 3.5f, 5.62f, 3.5f, 7.0f)
                curveToRelative(0.0f, 1.96f, 0.826f, 2.166f, 1.696f, 2.382f)
                curveToRelative(0.46f, 0.115f, 0.935f, 0.233f, 1.304f, 0.618f)
                curveToRelative(0.449f, 0.467f, 0.393f, 1.181f, 0.339f, 1.877f)
                curveTo(6.755f, 12.96f, 6.674f, 14.0f, 8.5f, 14.0f)
                curveToRelative(1.75f, 0.0f, 3.0f, -3.5f, 3.0f, -4.5f)
                curveToRelative(0.0f, -0.262f, 0.208f, -0.468f, 0.444f, -0.7f)
                curveToRelative(0.396f, -0.392f, 0.87f, -0.86f, 0.556f, -1.8f)
                curveToRelative(-0.097f, -0.291f, -0.396f, -0.568f, -0.641f, -0.756f)
                curveToRelative(-0.174f, -0.133f, -0.207f, -0.396f, -0.052f, -0.551f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.42f, -0.042f)
                lineToRelative(1.085f, 0.724f)
                curveToRelative(0.11f, 0.072f, 0.255f, 0.058f, 0.348f, -0.035f)
                curveToRelative(0.15f, -0.15f, 0.415f, -0.083f, 0.489f, 0.117f)
                curveToRelative(0.16f, 0.43f, 0.445f, 1.05f, 0.849f, 1.357f)
                lineTo(15.0f, 8.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, true, 3.668f, 2.501f)
            }
        }
        .build()
        return _globeEuropeAfrica!!
    }

private var _globeEuropeAfrica: ImageVector? = null
