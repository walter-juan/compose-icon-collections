package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(name = "Podcast", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 359.8f)
                curveToRelative(39.1f, -32.3f, 64.0f, -81.1f, 64.0f, -135.8f)
                curveToRelative(0.0f, -97.2f, -78.8f, -176.0f, -176.0f, -176.0f)
                reflectiveCurveTo(48.0f, 126.8f, 48.0f, 224.0f)
                curveTo(48.0f, 278.7f, 72.9f, 327.5f, 112.0f, 359.8f)
                curveTo(112.4f, 377.4f, 115.2f, 400.2f, 118.4f, 421.6f)
                curveTo(48.0f, 383.9f, 0.0f, 309.5f, 0.0f, 224.0f)
                curveTo(0.0f, 100.3f, 100.3f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(448.0f, 100.3f, 448.0f, 224.0f)
                curveToRelative(0.0f, 85.6f, -48.0f, 159.9f, -118.5f, 197.6f)
                curveToRelative(3.3f, -21.4f, 6.0f, -44.2f, 6.4f, -61.8f)
                close()
                moveTo(322.0f, 306.4f)
                curveToRelative(-8.3f, -12.6f, -19.2f, -21.6f, -30.4f, -27.8f)
                curveToRelative(-2.1f, -1.1f, -4.2f, -2.2f, -6.3f, -3.2f)
                curveToRelative(11.7f, -13.9f, 18.8f, -31.9f, 18.8f, -51.5f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveToRelative(-80.0f, 35.8f, -80.0f, 80.0f)
                curveToRelative(0.0f, 19.6f, 7.1f, 37.6f, 18.8f, 51.5f)
                curveToRelative(-2.1f, 1.0f, -4.2f, 2.0f, -6.3f, 3.2f)
                curveToRelative(-11.2f, 6.2f, -22.1f, 15.2f, -30.4f, 27.8f)
                curveToRelative(-18.8f, -22.3f, -30.1f, -51.0f, -30.1f, -82.4f)
                curveToRelative(0.0f, -70.7f, 57.3f, -128.0f, 128.0f, -128.0f)
                reflectiveCurveToRelative(128.0f, 57.3f, 128.0f, 128.0f)
                curveToRelative(0.0f, 31.4f, -11.3f, 60.2f, -30.1f, 82.4f)
                close()
                moveTo(224.0f, 312.0f)
                curveToRelative(32.9f, 0.0f, 64.0f, 8.6f, 64.0f, 43.8f)
                curveToRelative(0.0f, 33.0f, -12.9f, 104.1f, -20.6f, 132.9f)
                curveToRelative(-5.1f, 19.0f, -24.5f, 23.4f, -43.4f, 23.4f)
                reflectiveCurveToRelative(-38.2f, -4.4f, -43.4f, -23.4f)
                curveToRelative(-7.8f, -28.5f, -20.6f, -99.7f, -20.6f, -132.8f)
                curveToRelative(0.0f, -35.1f, 31.1f, -43.8f, 64.0f, -43.8f)
                close()
                moveTo(224.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, 80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -80.0f)
                close()
            }
        }
        .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
