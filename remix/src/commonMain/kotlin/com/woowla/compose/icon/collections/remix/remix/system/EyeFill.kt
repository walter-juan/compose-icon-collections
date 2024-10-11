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

public val SystemGroup.EyeFill: ImageVector
    get() {
        if (_eyeFill != null) {
            return _eyeFill!!
        }
        _eyeFill = Builder(name = "EyeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.182f, 12.0f)
                curveTo(2.122f, 6.88f, 6.608f, 3.0f, 12.0f, 3.0f)
                curveTo(17.392f, 3.0f, 21.878f, 6.88f, 22.819f, 12.0f)
                curveTo(21.878f, 17.12f, 17.392f, 21.0f, 12.0f, 21.0f)
                curveTo(6.608f, 21.0f, 2.122f, 17.12f, 1.182f, 12.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(14.762f, 17.0f, 17.0f, 14.761f, 17.0f, 12.0f)
                curveTo(17.0f, 9.239f, 14.762f, 7.0f, 12.0f, 7.0f)
                curveTo(9.239f, 7.0f, 7.0f, 9.239f, 7.0f, 12.0f)
                curveTo(7.0f, 14.761f, 9.239f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(10.343f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                curveTo(9.0f, 10.343f, 10.343f, 9.0f, 12.0f, 9.0f)
                curveTo(13.657f, 9.0f, 15.0f, 10.343f, 15.0f, 12.0f)
                curveTo(15.0f, 13.657f, 13.657f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _eyeFill!!
    }

private var _eyeFill: ImageVector? = null
