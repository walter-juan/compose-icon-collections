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

public val SolidGroup.TruckLoading: ImageVector
    get() {
        if (_truckLoading != null) {
            return _truckLoading!!
        }
        _truckLoading = Builder(name = "TruckLoading", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                lineToRelative(0.0f, 248.2f)
                lineToRelative(-297.2f, 89.2f)
                curveTo(5.9f, 454.4f, -3.7f, 472.3f, 1.4f, 489.2f)
                reflectiveCurveToRelative(22.9f, 26.5f, 39.8f, 21.5f)
                lineToRelative(315.5f, -94.6f)
                lineToRelative(43.7f, 0.0f)
                curveToRelative(-0.2f, 2.6f, -0.4f, 5.3f, -0.4f, 8.0f)
                curveToRelative(0.0f, 48.6f, 39.4f, 88.0f, 88.0f, 88.0f)
                reflectiveCurveToRelative(88.0f, -39.4f, 88.0f, -88.0f)
                lineToRelative(0.0f, -392.0f)
                lineToRelative(-176.0f, 0.0f)
                close()
                moveTo(528.0f, 424.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                reflectiveCurveToRelative(-40.0f, -17.9f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.9f, -40.0f, 40.0f, -40.0f)
                curveToRelative(22.1f, 0.0f, 39.9f, 17.9f, 40.0f, 39.9f)
                lineToRelative(0.0f, 0.1f)
                close()
                moveTo(51.9f, 149.5f)
                curveTo(18.1f, 159.8f, -0.9f, 195.6f, 9.4f, 229.4f)
                lineToRelative(28.1f, 91.8f)
                curveTo(47.8f, 355.0f, 83.6f, 374.0f, 117.4f, 363.7f)
                lineToRelative(91.8f, -28.1f)
                curveToRelative(33.8f, -10.3f, 52.8f, -46.1f, 42.5f, -79.9f)
                lineToRelative(-28.1f, -91.8f)
                curveToRelative(-10.3f, -33.8f, -46.1f, -52.8f, -79.9f, -42.5f)
                lineTo(51.9f, 149.5f)
                close()
            }
        }
        .build()
        return _truckLoading!!
    }

private var _truckLoading: ImageVector? = null
