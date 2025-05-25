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

public val Twbs.GlobeAmericasFill: ImageVector
    get() {
        if (_globeAmericasFill != null) {
            return _globeAmericasFill!!
        }
        _globeAmericasFill = Builder(name = "GlobeAmericasFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(8.0f, 0.0f)
                lineToRelative(0.412f, 0.01f)
                arcTo(7.97f, 7.97f, 0.0f, false, true, 13.29f, 2.0f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, true, 2.548f, 4.382f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.674f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.361f, -3.078f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 2.711f, 2.0f)
                arcTo(7.96f, 7.96f, 0.0f, false, true, 8.0f, 0.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -5.958f, 3.324f)
                curveTo(2.497f, 6.192f, 6.669f, 7.827f, 6.5f, 8.0f)
                curveToRelative(-0.5f, 0.5f, -1.034f, 0.884f, -1.0f, 1.5f)
                curveToRelative(0.07f, 1.248f, 2.259f, 0.774f, 2.5f, 2.0f)
                curveToRelative(0.202f, 1.032f, -1.051f, 3.0f, 0.0f, 3.0f)
                curveToRelative(1.5f, -0.5f, 3.798f, -3.186f, 4.0f, -5.0f)
                curveToRelative(0.138f, -1.242f, -2.0f, -2.0f, -3.5f, -2.5f)
                curveToRelative(-0.828f, -0.276f, -1.055f, 0.648f, -1.5f, 0.5f)
                reflectiveCurveTo(4.5f, 5.5f, 5.5f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.0f, 1.5f, 0.5f)
                curveToRelative(1.0f, 0.5f, 0.5f, -1.0f, 1.0f, -1.5f)
                curveToRelative(0.838f, -0.838f, 3.16f, -1.394f, 3.605f, -2.001f)
                arcTo(6.97f, 6.97f, 0.0f, false, false, 8.0f, 1.0f)
            }
        }
        .build()
        return _globeAmericasFill!!
    }

private var _globeAmericasFill: ImageVector? = null
