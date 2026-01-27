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

public val SolidGroup.PlaneCircleExclamation: ImageVector
    get() {
        if (_planeCircleExclamation != null) {
            return _planeCircleExclamation!!
        }
        _planeCircleExclamation = Builder(name = "PlaneCircleExclamation", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 24.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                reflectiveCurveToRelative(56.0f, 25.1f, 56.0f, 56.0f)
                lineToRelative(0.0f, 127.3f)
                lineToRelative(78.0f, 71.5f)
                curveToRelative(-69.3f, 29.0f, -118.0f, 97.4f, -118.0f, 177.2f)
                curveToRelative(0.0f, 49.3f, 18.6f, 94.3f, 49.1f, 128.3f)
                lineTo(288.0f, 512.0f)
                lineTo(179.9f, 539.0f)
                curveToRelative(-10.1f, 2.5f, -19.9f, -5.1f, -19.9f, -15.5f)
                lineToRelative(0.0f, -19.8f)
                curveToRelative(0.0f, -4.9f, 2.2f, -9.5f, 6.0f, -12.5f)
                lineToRelative(66.0f, -52.8f)
                lineToRelative(0.0f, -99.7f)
                lineToRelative(-162.9f, 54.3f)
                curveTo(58.7f, 396.4f, 48.0f, 388.7f, 48.0f, 377.8f)
                lineToRelative(0.0f, -43.7f)
                curveToRelative(0.0f, -9.0f, 3.8f, -17.5f, 10.4f, -23.6f)
                lineTo(232.0f, 151.3f)
                lineTo(232.0f, 24.0f)
                close()
                moveTo(496.0f, 256.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, 288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 0.0f, -288.0f)
                close()
                moveTo(496.0f, 484.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, -40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, 40.0f)
                close()
                moveTo(496.0f, 304.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _planeCircleExclamation!!
    }

private var _planeCircleExclamation: ImageVector? = null
