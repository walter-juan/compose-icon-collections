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

public val SolidGroup.TruckField: ImageVector
    get() {
        if (_truckField != null) {
            return _truckField!!
        }
        _truckField = Builder(name = "TruckField", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(224.0f, 0.0f)
                curveToRelative(23.7f, 0.0f, 44.4f, 12.9f, 55.4f, 32.0f)
                lineToRelative(40.4f, 0.0f)
                curveToRelative(32.4f, 0.0f, 61.6f, 19.6f, 74.0f, 49.5f)
                lineToRelative(43.8f, 106.3f)
                lineToRelative(1.7f, 4.2f)
                lineToRelative(24.7f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-0.4f, 0.0f)
                curveToRelative(0.2f, 2.6f, 0.4f, 5.3f, 0.4f, 8.0f)
                curveToRelative(0.0f, 48.6f, -39.4f, 88.0f, -88.0f, 88.0f)
                reflectiveCurveToRelative(-88.0f, -39.4f, -88.0f, -88.0f)
                curveToRelative(0.0f, -2.7f, 0.1f, -5.4f, 0.4f, -8.0f)
                lineToRelative(-144.7f, 0.0f)
                curveToRelative(0.2f, 2.6f, 0.4f, 5.3f, 0.4f, 8.0f)
                curveToRelative(0.0f, 48.6f, -39.4f, 88.0f, -88.0f, 88.0f)
                reflectiveCurveToRelative(-88.0f, -39.4f, -88.0f, -88.0f)
                curveToRelative(0.0f, -3.6f, 0.2f, -7.1f, 0.6f, -10.5f)
                curveToRelative(-19.0f, -6.4f, -32.6f, -24.4f, -32.6f, -45.5f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                close()
                moveTo(384.0f, 128.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(82.1f, 0.0f)
                lineToRelative(-35.4f, -86.1f)
                curveToRelative(-2.5f, -6.0f, -8.3f, -9.9f, -14.8f, -9.9f)
                lineTo(384.0f, 128.0f)
                close()
                moveTo(192.0f, 392.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 80.0f, 0.0f)
                close()
                moveTo(472.0f, 432.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _truckField!!
    }

private var _truckField: ImageVector? = null
