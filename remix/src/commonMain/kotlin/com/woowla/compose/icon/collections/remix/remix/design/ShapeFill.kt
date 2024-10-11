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

public val DesignGroup.ShapeFill: ImageVector
    get() {
        if (_shapeFill != null) {
            return _shapeFill!!
        }
        _shapeFill = Builder(name = "ShapeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                curveTo(3.343f, 8.0f, 2.0f, 6.657f, 2.0f, 5.0f)
                curveTo(2.0f, 3.343f, 3.343f, 2.0f, 5.0f, 2.0f)
                curveTo(6.657f, 2.0f, 8.0f, 3.343f, 8.0f, 5.0f)
                curveTo(8.0f, 6.657f, 6.657f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(19.0f, 8.0f)
                curveTo(17.343f, 8.0f, 16.0f, 6.657f, 16.0f, 5.0f)
                curveTo(16.0f, 3.343f, 17.343f, 2.0f, 19.0f, 2.0f)
                curveTo(20.657f, 2.0f, 22.0f, 3.343f, 22.0f, 5.0f)
                curveTo(22.0f, 6.657f, 20.657f, 8.0f, 19.0f, 8.0f)
                close()
                moveTo(19.0f, 22.0f)
                curveTo(17.343f, 22.0f, 16.0f, 20.657f, 16.0f, 19.0f)
                curveTo(16.0f, 17.343f, 17.343f, 16.0f, 19.0f, 16.0f)
                curveTo(20.657f, 16.0f, 22.0f, 17.343f, 22.0f, 19.0f)
                curveTo(22.0f, 20.657f, 20.657f, 22.0f, 19.0f, 22.0f)
                close()
                moveTo(5.0f, 22.0f)
                curveTo(3.343f, 22.0f, 2.0f, 20.657f, 2.0f, 19.0f)
                curveTo(2.0f, 17.343f, 3.343f, 16.0f, 5.0f, 16.0f)
                curveTo(6.657f, 16.0f, 8.0f, 17.343f, 8.0f, 19.0f)
                curveTo(8.0f, 20.657f, 6.657f, 22.0f, 5.0f, 22.0f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.0f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(18.0f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _shapeFill!!
    }

private var _shapeFill: ImageVector? = null
