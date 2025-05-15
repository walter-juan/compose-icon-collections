package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.GlobeEuropeAfricaFill: ImageVector
    get() {
        if (_globeEuropeAfricaFill != null) {
            return _globeEuropeAfricaFill!!
        }
        _globeEuropeAfricaFill = Builder(name = "GlobeEuropeAfricaFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -4.335f, 1.505f)
                lineToRelative(-0.285f, 0.641f)
                arcToRelative(0.847f, 0.847f, 0.0f, false, false, 1.48f, 0.816f)
                lineToRelative(0.244f, -0.368f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, 1.035f, -0.275f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, false, 0.722f, 0.0f)
                lineToRelative(0.262f, -0.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.775f, -0.05f)
                lineToRelative(0.984f, 0.34f)
                quadToRelative(0.118f, 0.04f, 0.243f, 0.054f)
                curveToRelative(0.784f, 0.093f, 0.855f, 0.377f, 0.694f, 0.801f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, -1.035f, 0.487f)
                lineToRelative(-0.01f, -0.003f)
                curveTo(8.273f, 4.663f, 7.747f, 4.5f, 6.0f, 4.5f)
                curveTo(4.8f, 4.5f, 3.5f, 5.62f, 3.5f, 7.0f)
                curveToRelative(0.0f, 3.0f, 1.935f, 1.89f, 3.0f, 3.0f)
                curveToRelative(1.146f, 1.194f, -1.0f, 4.0f, 2.0f, 4.0f)
                curveToRelative(1.75f, 0.0f, 3.0f, -3.5f, 3.0f, -4.5f)
                curveToRelative(0.0f, -0.704f, 1.5f, -1.0f, 1.0f, -2.5f)
                curveToRelative(-0.097f, -0.291f, -0.396f, -0.568f, -0.642f, -0.756f)
                curveToRelative(-0.173f, -0.133f, -0.206f, -0.396f, -0.051f, -0.55f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, true, 0.42f, -0.043f)
                lineToRelative(1.085f, 0.724f)
                arcToRelative(0.276f, 0.276f, 0.0f, false, false, 0.348f, -0.035f)
                curveToRelative(0.15f, -0.15f, 0.414f, -0.083f, 0.488f, 0.117f)
                curveToRelative(0.16f, 0.428f, 0.445f, 1.046f, 0.847f, 1.354f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 8.0f, 1.0f)
            }
        }
        .build()
        return _globeEuropeAfricaFill!!
    }

private var _globeEuropeAfricaFill: ImageVector? = null
