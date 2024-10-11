package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.CloseCircleFill: ImageVector
    get() {
        if (_closeCircleFill != null) {
            return _closeCircleFill!!
        }
        _closeCircleFill = Builder(name = "CloseCircleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 10.586f)
                lineTo(9.172f, 7.757f)
                lineTo(7.757f, 9.172f)
                lineTo(10.586f, 12.0f)
                lineTo(7.757f, 14.828f)
                lineTo(9.172f, 16.243f)
                lineTo(12.0f, 13.414f)
                lineTo(14.828f, 16.243f)
                lineTo(16.243f, 14.828f)
                lineTo(13.414f, 12.0f)
                lineTo(16.243f, 9.172f)
                lineTo(14.828f, 7.757f)
                lineTo(12.0f, 10.586f)
                close()
            }
        }
        .build()
        return _closeCircleFill!!
    }

private var _closeCircleFill: ImageVector? = null
