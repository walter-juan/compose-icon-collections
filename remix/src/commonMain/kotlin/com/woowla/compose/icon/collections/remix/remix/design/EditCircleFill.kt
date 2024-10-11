package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.EditCircleFill: ImageVector
    get() {
        if (_editCircleFill != null) {
            return _editCircleFill!!
        }
        _editCircleFill = Builder(name = "EditCircleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.626f, 3.128f)
                lineTo(9.291f, 10.463f)
                lineTo(9.299f, 14.71f)
                lineTo(13.537f, 14.702f)
                lineTo(20.868f, 7.371f)
                curveTo(21.591f, 8.754f, 22.0f, 10.328f, 22.0f, 11.997f)
                curveTo(22.0f, 17.52f, 17.523f, 21.997f, 12.0f, 21.997f)
                curveTo(6.477f, 21.997f, 2.0f, 17.52f, 2.0f, 11.997f)
                curveTo(2.0f, 6.474f, 6.477f, 1.997f, 12.0f, 1.997f)
                curveTo(13.669f, 1.997f, 15.242f, 2.406f, 16.626f, 3.128f)
                close()
                moveTo(20.485f, 2.097f)
                lineTo(21.899f, 3.511f)
                lineTo(12.707f, 12.704f)
                lineTo(11.295f, 12.706f)
                lineTo(11.293f, 11.29f)
                lineTo(20.485f, 2.097f)
                close()
            }
        }
        .build()
        return _editCircleFill!!
    }

private var _editCircleFill: ImageVector? = null
