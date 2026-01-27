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

public val SolidGroup.TarpDroplet: ImageVector
    get() {
        if (_tarpDroplet != null) {
            return _tarpDroplet!!
        }
        _tarpDroplet = Builder(name = "TarpDroplet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 160.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -26.9f, 64.0f, -60.0f)
                curveToRelative(0.0f, -24.0f, -33.7f, -70.1f, -52.2f, -93.5f)
                curveToRelative(-6.1f, -7.7f, -17.5f, -7.7f, -23.6f, 0.0f)
                curveToRelative(-18.5f, 23.4f, -52.2f, 69.5f, -52.2f, 93.5f)
                curveToRelative(0.0f, 33.1f, 28.7f, 60.0f, 64.0f, 60.0f)
                close()
                moveTo(368.0f, 96.0f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                reflectiveCurveTo(144.0f, 157.9f, 144.0f, 96.0f)
                curveToRelative(0.0f, -11.1f, 1.6f, -21.9f, 4.6f, -32.0f)
                lineTo(64.0f, 64.0f)
                curveTo(28.7f, 64.0f, 0.0f, 92.7f, 0.0f, 128.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(277.5f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, -6.7f, 45.3f, -18.7f)
                lineTo(493.3f, 322.7f)
                curveToRelative(12.0f, -12.0f, 18.7f, -28.3f, 18.7f, -45.3f)
                lineTo(512.0f, 128.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-84.6f, 0.0f)
                curveToRelative(3.0f, 10.1f, 4.6f, 20.9f, 4.6f, 32.0f)
                close()
                moveTo(453.5f, 272.0f)
                lineTo(336.0f, 389.5f)
                lineTo(336.0f, 296.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(93.5f, 0.0f)
                close()
                moveTo(96.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _tarpDroplet!!
    }

private var _tarpDroplet: ImageVector? = null
