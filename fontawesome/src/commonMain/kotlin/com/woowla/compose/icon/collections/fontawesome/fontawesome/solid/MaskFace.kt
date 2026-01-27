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

public val SolidGroup.MaskFace: ImageVector
    get() {
        if (_maskFace != null) {
            return _maskFace!!
        }
        _maskFace = Builder(name = "MaskFace", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 64.0f)
                curveToRelative(-27.2f, 0.0f, -53.8f, 8.0f, -76.4f, 23.1f)
                lineToRelative(-37.1f, 24.8f)
                curveToRelative(-15.8f, 10.5f, -34.3f, 16.1f, -53.3f, 16.1f)
                lineTo(64.0f, 128.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                lineToRelative(0.0f, 78.7f)
                curveToRelative(0.0f, 62.6f, 45.2f, 116.0f, 107.0f, 126.3f)
                lineToRelative(97.9f, 16.3f)
                curveToRelative(33.0f, 22.0f, 72.6f, 34.7f, 115.1f, 34.7f)
                reflectiveCurveToRelative(82.2f, -12.8f, 115.1f, -34.7f)
                lineTo(533.0f, 396.9f)
                curveToRelative(61.7f, -10.3f, 107.0f, -63.7f, 107.0f, -126.3f)
                lineToRelative(0.0f, -78.7f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-89.2f, 0.0f)
                curveToRelative(-19.0f, 0.0f, -37.5f, -5.6f, -53.3f, -16.1f)
                lineTo(396.4f, 87.1f)
                curveTo(373.8f, 72.0f, 347.2f, 64.0f, 320.0f, 64.0f)
                close()
                moveTo(135.9f, 336.9f)
                lineToRelative(-18.4f, -3.1f)
                curveTo(86.6f, 328.7f, 64.0f, 302.0f, 64.0f, 270.7f)
                lineToRelative(0.0f, -78.7f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 35.0f, 8.6f, 67.9f, 23.9f, 96.9f)
                close()
                moveTo(522.5f, 333.8f)
                lineToRelative(-18.4f, 3.1f)
                curveTo(519.4f, 307.9f, 528.0f, 275.0f, 528.0f, 240.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, 78.7f)
                curveToRelative(0.0f, 31.3f, -22.6f, 58.0f, -53.5f, 63.1f)
                close()
                moveTo(192.0f, 232.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(208.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-208.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                close()
                moveTo(248.0f, 288.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-144.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _maskFace!!
    }

private var _maskFace: ImageVector? = null
