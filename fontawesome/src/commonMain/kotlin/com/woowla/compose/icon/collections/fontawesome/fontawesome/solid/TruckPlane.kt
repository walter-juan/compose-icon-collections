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

public val SolidGroup.TruckPlane: ImageVector
    get() {
        if (_truckPlane != null) {
            return _truckPlane!!
        }
        _truckPlane = Builder(name = "TruckPlane", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 48.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 32.5f, 12.1f, 62.1f, 32.0f, 84.7f)
                lineToRelative(0.0f, 27.3f)
                curveToRelative(0.0f, 7.1f, 0.9f, 14.1f, 2.7f, 20.7f)
                lineTo(192.0f, 480.0f)
                lineTo(83.9f, 507.0f)
                curveTo(73.8f, 509.6f, 64.0f, 501.9f, 64.0f, 491.5f)
                lineToRelative(0.0f, -19.8f)
                curveToRelative(0.0f, -4.9f, 2.2f, -9.5f, 6.0f, -12.5f)
                lineToRelative(74.0f, -59.2f)
                lineToRelative(0.0f, -57.6f)
                lineToRelative(-122.1f, 48.8f)
                curveTo(11.4f, 395.4f, 0.0f, 387.7f, 0.0f, 376.4f)
                lineToRelative(0.0f, -44.0f)
                curveToRelative(0.0f, -8.0f, 3.0f, -15.6f, 8.3f, -21.5f)
                lineTo(144.0f, 161.6f)
                lineTo(144.0f, 48.0f)
                close()
                moveTo(368.0f, 128.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 26.2f, -12.6f, 49.4f, -32.0f, 64.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-160.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(-19.4f, -14.6f, -32.0f, -37.8f, -32.0f, -64.0f)
                lineToRelative(0.0f, -160.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                close()
                moveTo(368.0f, 304.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-128.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                close()
                moveTo(368.0f, 392.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(584.0f, 368.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _truckPlane!!
    }

private var _truckPlane: ImageVector? = null
