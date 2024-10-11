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

public val DesignGroup.TriangleLine: ImageVector
    get() {
        if (_triangleLine != null) {
            return _triangleLine!!
        }
        _triangleLine = Builder(name = "TriangleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.866f, 3.0f)
                lineTo(22.392f, 19.5f)
                curveTo(22.668f, 19.979f, 22.504f, 20.59f, 22.026f, 20.866f)
                curveTo(21.874f, 20.954f, 21.702f, 21.0f, 21.526f, 21.0f)
                horizontalLineTo(2.474f)
                curveTo(1.921f, 21.0f, 1.474f, 20.552f, 1.474f, 20.0f)
                curveTo(1.474f, 19.825f, 1.52f, 19.652f, 1.608f, 19.5f)
                lineTo(11.134f, 3.0f)
                curveTo(11.41f, 2.522f, 12.022f, 2.358f, 12.5f, 2.634f)
                curveTo(12.652f, 2.722f, 12.778f, 2.848f, 12.866f, 3.0f)
                close()
                moveTo(4.206f, 19.0f)
                horizontalLineTo(19.794f)
                lineTo(12.0f, 5.5f)
                lineTo(4.206f, 19.0f)
                close()
            }
        }
        .build()
        return _triangleLine!!
    }

private var _triangleLine: ImageVector? = null
