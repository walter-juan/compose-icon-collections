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

public val SolidGroup.VolumeLow: ImageVector
    get() {
        if (_volumeLow != null) {
            return _volumeLow!!
        }
        _volumeLow = Builder(name = "VolumeLow", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 352.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(134.1f, 119.2f)
                curveToRelative(6.4f, 5.7f, 14.6f, 8.8f, 23.1f, 8.8f)
                curveToRelative(19.2f, 0.0f, 34.8f, -15.6f, 34.8f, -34.8f)
                lineToRelative(0.0f, -378.4f)
                curveToRelative(0.0f, -19.2f, -15.6f, -34.8f, -34.8f, -34.8f)
                curveToRelative(-8.5f, 0.0f, -16.7f, 3.1f, -23.1f, 8.8f)
                lineTo(96.0f, 160.0f)
                lineTo(48.0f, 160.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                close()
                moveTo(380.6f, 181.5f)
                curveToRelative(-10.3f, -8.4f, -25.4f, -6.8f, -33.8f, 3.5f)
                reflectiveCurveToRelative(-6.8f, 25.4f, 3.5f, 33.8f)
                curveTo(361.1f, 227.6f, 368.0f, 241.0f, 368.0f, 256.0f)
                reflectiveCurveToRelative(-6.9f, 28.4f, -17.7f, 37.3f)
                curveToRelative(-10.3f, 8.4f, -11.8f, 23.5f, -3.5f, 33.8f)
                reflectiveCurveToRelative(23.5f, 11.8f, 33.8f, 3.5f)
                curveTo(402.1f, 312.9f, 416.0f, 286.1f, 416.0f, 256.0f)
                reflectiveCurveToRelative(-13.9f, -56.9f, -35.5f, -74.5f)
                close()
            }
        }
        .build()
        return _volumeLow!!
    }

private var _volumeLow: ImageVector? = null
