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

public val SolidGroup.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                curveToRelative(-79.0f, 0.0f, -144.7f, 57.3f, -157.7f, 132.7f)
                curveToRelative(9.3f, -3.0f, 19.3f, -4.7f, 29.7f, -4.7f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineToRelative(0.0f, -64.0f)
                curveTo(0.0f, 100.3f, 100.3f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(448.0f, 100.3f, 448.0f, 224.0f)
                lineToRelative(0.0f, 168.1f)
                curveToRelative(0.0f, 66.3f, -53.8f, 120.0f, -120.1f, 120.0f)
                lineToRelative(-87.9f, -0.1f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(40.0f, 0.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, -32.2f, 72.0f, -72.0f)
                lineToRelative(0.0f, -20.9f)
                curveToRelative(-14.1f, 8.2f, -30.5f, 12.8f, -48.0f, 12.8f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(10.4f, 0.0f, 20.3f, 1.6f, 29.7f, 4.7f)
                curveToRelative(-13.0f, -75.3f, -78.6f, -132.7f, -157.7f, -132.7f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
