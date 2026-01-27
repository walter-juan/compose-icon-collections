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

public val SolidGroup.PesoSign: ImageVector
    get() {
        if (_pesoSign != null) {
            return _pesoSign!!
        }
        _pesoSign = Builder(name = "PesoSign", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 32.0f)
                curveTo(94.3f, 32.0f, 80.0f, 46.3f, 80.0f, 64.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-24.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-24.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 192.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(65.6f, 0.0f, 122.0f, -39.5f, 146.7f, -96.0f)
                lineToRelative(37.3f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-24.8f, 0.0f)
                curveToRelative(0.5f, -5.3f, 0.8f, -10.6f, 0.8f, -16.0f)
                reflectiveCurveToRelative(-0.3f, -10.7f, -0.8f, -16.0f)
                lineToRelative(24.8f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-37.3f, 0.0f)
                curveTo(362.0f, 71.5f, 305.6f, 32.0f, 240.0f, 32.0f)
                lineTo(112.0f, 32.0f)
                close()
                moveTo(311.6f, 128.0f)
                lineToRelative(-167.6f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(28.4f, 0.0f, 54.0f, 12.4f, 71.6f, 32.0f)
                close()
                moveTo(144.0f, 176.0f)
                lineToRelative(190.7f, 0.0f)
                curveToRelative(0.9f, 5.2f, 1.3f, 10.5f, 1.3f, 16.0f)
                reflectiveCurveToRelative(-0.5f, 10.8f, -1.3f, 16.0f)
                lineToRelative(-190.7f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                close()
                moveTo(311.6f, 256.0f)
                curveToRelative(-17.6f, 19.6f, -43.1f, 32.0f, -71.6f, 32.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(167.6f, 0.0f)
                close()
            }
        }
        .build()
        return _pesoSign!!
    }

private var _pesoSign: ImageVector? = null
