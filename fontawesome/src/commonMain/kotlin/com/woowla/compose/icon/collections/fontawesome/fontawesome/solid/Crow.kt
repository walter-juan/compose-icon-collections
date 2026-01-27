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

public val SolidGroup.Crow: ImageVector
    get() {
        if (_crow != null) {
            return _crow!!
        }
        _crow = Builder(name = "Crow", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.5f, 0.0f)
                curveToRelative(-48.6f, 0.0f, -88.0f, 39.4f, -88.0f, 88.0f)
                lineToRelative(0.0f, 36.0f)
                lineToRelative(-355.2f, 266.4f)
                curveTo(-0.8f, 401.0f, -3.7f, 421.0f, 6.9f, 435.2f)
                reflectiveCurveToRelative(30.6f, 17.0f, 44.8f, 6.4f)
                lineToRelative(76.8f, -57.6f)
                lineToRelative(131.3f, 0.0f)
                lineToRelative(46.6f, 113.1f)
                lineToRelative(1.0f, 2.2f)
                curveToRelative(5.7f, 10.7f, 18.8f, 15.5f, 30.3f, 10.8f)
                reflectiveCurveToRelative(17.3f, -17.3f, 13.9f, -29.0f)
                lineToRelative(-0.8f, -2.3f)
                lineToRelative(-39.1f, -94.9f)
                lineToRelative(40.9f, 0.0f)
                curveToRelative(1.1f, 0.0f, 2.2f, 0.0f, 3.2f, 0.0f)
                lineToRelative(46.6f, 113.2f)
                lineToRelative(1.0f, 2.2f)
                curveToRelative(5.7f, 10.7f, 18.8f, 15.5f, 30.3f, 10.8f)
                reflectiveCurveToRelative(17.3f, -17.3f, 13.9f, -29.0f)
                lineToRelative(-0.8f, -2.3f)
                lineToRelative(-42.0f, -102.0f)
                curveTo(485.3f, 354.1f, 544.5f, 280.0f, 544.5f, 192.0f)
                lineToRelative(0.0f, -72.0f)
                lineToRelative(80.5f, -20.1f)
                curveToRelative(8.6f, -2.1f, 13.8f, -10.8f, 11.6f, -19.4f)
                curveToRelative(-7.1f, -28.5f, -32.7f, -48.5f, -62.1f, -48.5f)
                lineToRelative(-50.1f, 0.0f)
                curveTo(508.2f, 12.5f, 483.8f, 0.0f, 456.5f, 0.0f)
                close()
                moveTo(456.5f, 64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _crow!!
    }

private var _crow: ImageVector? = null
