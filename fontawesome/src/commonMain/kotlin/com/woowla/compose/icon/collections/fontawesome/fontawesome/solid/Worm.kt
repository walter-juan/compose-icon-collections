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

public val SolidGroup.Worm: ImageVector
    get() {
        if (_worm != null) {
            return _worm!!
        }
        _worm = Builder(name = "Worm", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                lineToRelative(38.4f, 0.0f)
                curveTo(439.9f, 0.0f, 480.0f, 40.1f, 480.0f, 89.6f)
                lineToRelative(0.0f, 86.4f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(0.0f, 184.0f)
                curveToRelative(0.0f, 75.1f, -60.9f, 136.0f, -136.0f, 136.0f)
                reflectiveCurveToRelative(-136.0f, -60.9f, -136.0f, -136.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.9f, -40.0f, 40.0f)
                lineToRelative(0.0f, 168.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                reflectiveCurveToRelative(-48.0f, -21.5f, -48.0f, -48.0f)
                lineToRelative(0.0f, -168.0f)
                curveToRelative(0.0f, -75.1f, 60.9f, -136.0f, 136.0f, -136.0f)
                reflectiveCurveToRelative(136.0f, 60.9f, 136.0f, 136.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                reflectiveCurveToRelative(40.0f, -17.9f, 40.0f, -40.0f)
                lineToRelative(0.0f, -184.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                close()
                moveTo(400.0f, 88.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _worm!!
    }

private var _worm: ImageVector? = null
