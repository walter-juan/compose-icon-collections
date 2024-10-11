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

public val SystemGroup.ToggleFill: ImageVector
    get() {
        if (_toggleFill != null) {
            return _toggleFill!!
        }
        _toggleFill = Builder(name = "ToggleFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(19.866f, 5.0f, 23.0f, 8.134f, 23.0f, 12.0f)
                curveTo(23.0f, 15.866f, 19.866f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(4.134f, 19.0f, 1.0f, 15.866f, 1.0f, 12.0f)
                curveTo(1.0f, 8.134f, 4.134f, 5.0f, 8.0f, 5.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveTo(17.657f, 15.0f, 19.0f, 13.657f, 19.0f, 12.0f)
                curveTo(19.0f, 10.343f, 17.657f, 9.0f, 16.0f, 9.0f)
                curveTo(14.343f, 9.0f, 13.0f, 10.343f, 13.0f, 12.0f)
                curveTo(13.0f, 13.657f, 14.343f, 15.0f, 16.0f, 15.0f)
                close()
            }
        }
        .build()
        return _toggleFill!!
    }

private var _toggleFill: ImageVector? = null
