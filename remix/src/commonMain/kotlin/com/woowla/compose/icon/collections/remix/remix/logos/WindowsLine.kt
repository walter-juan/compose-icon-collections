package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.WindowsLine: ImageVector
    get() {
        if (_windowsLine != null) {
            return _windowsLine!!
        }
        _windowsLine = Builder(name = "WindowsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.001f, 2.5f)
                verticalLineTo(21.5f)
                lineTo(3.001f, 19.5f)
                verticalLineTo(4.5f)
                lineTo(21.001f, 2.5f)
                close()
                moveTo(19.001f, 12.999f)
                lineTo(12.001f, 13.0f)
                verticalLineTo(18.487f)
                lineTo(19.001f, 19.265f)
                verticalLineTo(12.999f)
                close()
                moveTo(5.001f, 17.71f)
                lineTo(10.001f, 18.265f)
                verticalLineTo(13.0f)
                lineTo(5.001f, 12.999f)
                verticalLineTo(17.71f)
                close()
                moveTo(19.001f, 10.999f)
                verticalLineTo(4.735f)
                lineTo(12.001f, 5.512f)
                verticalLineTo(11.0f)
                lineTo(19.001f, 10.999f)
                close()
                moveTo(10.001f, 5.734f)
                lineTo(5.001f, 6.29f)
                verticalLineTo(10.999f)
                lineTo(10.001f, 11.0f)
                verticalLineTo(5.734f)
                close()
            }
        }
        .build()
        return _windowsLine!!
    }

private var _windowsLine: ImageVector? = null
