package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.TentLine: ImageVector
    get() {
        if (_tentLine != null) {
            return _tentLine!!
        }
        _tentLine = Builder(name = "TentLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.103f, 19.0f)
                lineTo(12.866f, 3.0f)
                curveTo(12.778f, 2.848f, 12.652f, 2.722f, 12.5f, 2.634f)
                curveTo(12.022f, 2.358f, 11.41f, 2.522f, 11.134f, 3.0f)
                lineTo(1.896f, 19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(21.0f)
                curveTo(8.333f, 21.0f, 15.667f, 21.0f, 23.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.103f)
                close()
                moveTo(7.6f, 19.0f)
                horizontalLineTo(4.206f)
                lineTo(12.0f, 5.5f)
                lineTo(19.794f, 19.0f)
                horizontalLineTo(16.4f)
                lineTo(12.0f, 11.0f)
                lineTo(7.6f, 19.0f)
                close()
                moveTo(12.0f, 15.15f)
                lineTo(14.118f, 19.0f)
                horizontalLineTo(9.883f)
                lineTo(12.0f, 15.15f)
                close()
            }
        }
        .build()
        return _tentLine!!
    }

private var _tentLine: ImageVector? = null
