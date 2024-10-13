package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlMessenger: ImageVector
    get() {
        if (_bxlMessenger != null) {
            return _bxlMessenger!!
        }
        _bxlMessenger = Builder(name = "BxlMessenger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(-4.92f, 0.0f, -8.91f, 3.729f, -8.91f, 8.332f)
                curveToRelative(0.0f, 2.616f, 1.291f, 4.952f, 3.311f, 6.479f)
                lineTo(6.401f, 21.0f)
                lineToRelative(3.041f, -1.687f)
                curveToRelative(0.811f, 0.228f, 1.668f, 0.35f, 2.559f, 0.35f)
                curveToRelative(4.92f, 0.0f, 8.91f, -3.73f, 8.91f, -8.331f)
                curveTo(20.91f, 6.729f, 16.92f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.938f, 14.172f)
                lineTo(10.633f, 11.778f)
                lineTo(6.195f, 14.232f)
                lineTo(11.06f, 9.069f)
                lineTo(13.365f, 11.464f)
                lineTo(17.804f, 9.009f)
                lineTo(12.938f, 14.172f)
                close()
            }
        }
        .build()
        return _bxlMessenger!!
    }

private var _bxlMessenger: ImageVector? = null
