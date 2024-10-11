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

public val BuildingsGroup.TentFill: ImageVector
    get() {
        if (_tentFill != null) {
            return _tentFill!!
        }
        _tentFill = Builder(name = "TentFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.866f, 3.0f)
                lineTo(22.103f, 19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(1.896f)
                lineTo(11.134f, 3.0f)
                curveTo(11.41f, 2.522f, 12.022f, 2.358f, 12.5f, 2.634f)
                curveTo(12.652f, 2.722f, 12.778f, 2.848f, 12.866f, 3.0f)
                close()
                moveTo(12.0f, 12.925f)
                lineTo(8.659f, 19.0f)
                horizontalLineTo(15.341f)
                lineTo(12.0f, 12.925f)
                close()
            }
        }
        .build()
        return _tentFill!!
    }

private var _tentFill: ImageVector? = null
