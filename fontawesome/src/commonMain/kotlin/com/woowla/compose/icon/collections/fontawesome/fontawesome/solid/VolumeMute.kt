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

public val SolidGroup.VolumeMute: ImageVector
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute = Builder(name = "VolumeMute", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
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
                moveTo(367.0f, 175.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(47.0f, 47.0f)
                lineToRelative(-47.0f, 47.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(47.0f, -47.0f)
                lineToRelative(47.0f, 47.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-47.0f, -47.0f)
                lineToRelative(47.0f, -47.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(-24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-47.0f, 47.0f)
                lineToRelative(-47.0f, -47.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                close()
            }
        }
        .build()
        return _volumeMute!!
    }

private var _volumeMute: ImageVector? = null
