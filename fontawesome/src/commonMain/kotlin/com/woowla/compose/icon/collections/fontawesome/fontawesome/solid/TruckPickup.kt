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

public val SolidGroup.TruckPickup: ImageVector
    get() {
        if (_truckPickup != null) {
            return _truckPickup!!
        }
        _truckPickup = Builder(name = "TruckPickup", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(363.8f, 96.0f)
                lineToRelative(57.6f, 96.0f)
                lineToRelative(-133.4f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(75.8f, 0.0f)
                close()
                moveTo(496.0f, 192.0f)
                lineTo(418.6f, 63.1f)
                curveTo(407.1f, 43.8f, 386.2f, 32.0f, 363.8f, 32.0f)
                lineTo(256.0f, 32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-144.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.4f, 0.0f)
                curveToRelative(-0.2f, 2.6f, -0.4f, 5.3f, -0.4f, 8.0f)
                curveToRelative(0.0f, 48.6f, 39.4f, 88.0f, 88.0f, 88.0f)
                reflectiveCurveToRelative(88.0f, -39.4f, 88.0f, -88.0f)
                curveToRelative(0.0f, -2.7f, -0.1f, -5.4f, -0.4f, -8.0f)
                lineToRelative(160.7f, 0.0f)
                curveToRelative(-0.2f, 2.6f, -0.4f, 5.3f, -0.4f, 8.0f)
                curveToRelative(0.0f, 48.6f, 39.4f, 88.0f, 88.0f, 88.0f)
                reflectiveCurveToRelative(88.0f, -39.4f, 88.0f, -88.0f)
                curveToRelative(0.0f, -2.7f, -0.1f, -5.4f, -0.4f, -8.0f)
                lineToRelative(32.4f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(112.0f, 392.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
                close()
                moveTo(488.0f, 352.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, 80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -80.0f)
                close()
            }
        }
        .build()
        return _truckPickup!!
    }

private var _truckPickup: ImageVector? = null
