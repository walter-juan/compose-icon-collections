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

public val SolidGroup.MapLocationDot: ImageVector
    get() {
        if (_mapLocationDot != null) {
            return _mapLocationDot!!
        }
        _mapLocationDot = Builder(name = "MapLocationDot", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.0f, 48.0f)
                curveToRelative(0.0f, -11.1f, -5.7f, -21.4f, -15.2f, -27.2f)
                reflectiveCurveToRelative(-21.2f, -6.4f, -31.1f, -1.4f)
                lineTo(413.5f, 77.5f)
                lineTo(234.1f, 17.6f)
                curveToRelative(-8.1f, -2.7f, -16.8f, -2.1f, -24.4f, 1.7f)
                lineToRelative(-128.0f, 64.0f)
                curveTo(70.8f, 88.8f, 64.0f, 99.9f, 64.0f, 112.0f)
                lineToRelative(0.0f, 352.0f)
                curveToRelative(0.0f, 11.1f, 5.7f, 21.4f, 15.2f, 27.2f)
                reflectiveCurveToRelative(21.2f, 6.4f, 31.1f, 1.4f)
                lineToRelative(116.1f, -58.1f)
                lineToRelative(173.3f, 57.8f)
                curveToRelative(-4.3f, -6.4f, -8.5f, -13.1f, -12.6f, -19.9f)
                curveToRelative(-11.0f, -18.3f, -21.9f, -39.3f, -30.0f, -61.8f)
                lineToRelative(-101.2f, -33.7f)
                lineToRelative(0.0f, -284.5f)
                lineToRelative(128.0f, 42.7f)
                lineToRelative(0.0f, 99.3f)
                curveToRelative(31.0f, -35.8f, 77.0f, -58.4f, 128.0f, -58.4f)
                curveToRelative(22.6f, 0.0f, 44.2f, 4.4f, 64.0f, 12.5f)
                lineTo(576.0f, 48.0f)
                close()
                moveTo(512.0f, 224.0f)
                curveToRelative(-66.3f, 0.0f, -120.0f, 52.8f, -120.0f, 117.9f)
                curveToRelative(0.0f, 68.9f, 64.1f, 150.4f, 98.6f, 189.3f)
                curveToRelative(11.6f, 13.0f, 31.3f, 13.0f, 42.9f, 0.0f)
                curveToRelative(34.5f, -38.9f, 98.6f, -120.4f, 98.6f, -189.3f)
                curveToRelative(0.0f, -65.1f, -53.7f, -117.9f, -120.0f, -117.9f)
                close()
                moveTo(472.0f, 344.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mapLocationDot!!
    }

private var _mapLocationDot: ImageVector? = null
