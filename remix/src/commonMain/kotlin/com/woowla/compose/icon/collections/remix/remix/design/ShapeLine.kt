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

public val DesignGroup.ShapeLine: ImageVector
    get() {
        if (_shapeLine != null) {
            return _shapeLine!!
        }
        _shapeLine = Builder(name = "ShapeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.829f, 20.0f)
                curveTo(7.417f, 21.165f, 6.306f, 22.0f, 5.0f, 22.0f)
                curveTo(3.343f, 22.0f, 2.0f, 20.657f, 2.0f, 19.0f)
                curveTo(2.0f, 17.694f, 2.835f, 16.583f, 4.0f, 16.171f)
                verticalLineTo(7.829f)
                curveTo(2.835f, 7.417f, 2.0f, 6.306f, 2.0f, 5.0f)
                curveTo(2.0f, 3.343f, 3.343f, 2.0f, 5.0f, 2.0f)
                curveTo(6.306f, 2.0f, 7.417f, 2.835f, 7.829f, 4.0f)
                horizontalLineTo(16.171f)
                curveTo(16.583f, 2.835f, 17.694f, 2.0f, 19.0f, 2.0f)
                curveTo(20.657f, 2.0f, 22.0f, 3.343f, 22.0f, 5.0f)
                curveTo(22.0f, 6.306f, 21.165f, 7.417f, 20.0f, 7.829f)
                verticalLineTo(16.171f)
                curveTo(21.165f, 16.583f, 22.0f, 17.694f, 22.0f, 19.0f)
                curveTo(22.0f, 20.657f, 20.657f, 22.0f, 19.0f, 22.0f)
                curveTo(17.694f, 22.0f, 16.583f, 21.165f, 16.171f, 20.0f)
                horizontalLineTo(7.829f)
                close()
                moveTo(7.829f, 18.0f)
                horizontalLineTo(16.171f)
                curveTo(16.472f, 17.148f, 17.148f, 16.472f, 18.0f, 16.171f)
                verticalLineTo(7.829f)
                curveTo(17.148f, 7.528f, 16.472f, 6.852f, 16.171f, 6.0f)
                horizontalLineTo(7.829f)
                curveTo(7.528f, 6.852f, 6.852f, 7.528f, 6.0f, 7.829f)
                verticalLineTo(16.171f)
                curveTo(6.852f, 16.472f, 7.528f, 17.148f, 7.829f, 18.0f)
                close()
                moveTo(5.0f, 6.0f)
                curveTo(5.552f, 6.0f, 6.0f, 5.552f, 6.0f, 5.0f)
                curveTo(6.0f, 4.448f, 5.552f, 4.0f, 5.0f, 4.0f)
                curveTo(4.448f, 4.0f, 4.0f, 4.448f, 4.0f, 5.0f)
                curveTo(4.0f, 5.552f, 4.448f, 6.0f, 5.0f, 6.0f)
                close()
                moveTo(19.0f, 6.0f)
                curveTo(19.552f, 6.0f, 20.0f, 5.552f, 20.0f, 5.0f)
                curveTo(20.0f, 4.448f, 19.552f, 4.0f, 19.0f, 4.0f)
                curveTo(18.448f, 4.0f, 18.0f, 4.448f, 18.0f, 5.0f)
                curveTo(18.0f, 5.552f, 18.448f, 6.0f, 19.0f, 6.0f)
                close()
                moveTo(19.0f, 20.0f)
                curveTo(19.552f, 20.0f, 20.0f, 19.552f, 20.0f, 19.0f)
                curveTo(20.0f, 18.448f, 19.552f, 18.0f, 19.0f, 18.0f)
                curveTo(18.448f, 18.0f, 18.0f, 18.448f, 18.0f, 19.0f)
                curveTo(18.0f, 19.552f, 18.448f, 20.0f, 19.0f, 20.0f)
                close()
                moveTo(5.0f, 20.0f)
                curveTo(5.552f, 20.0f, 6.0f, 19.552f, 6.0f, 19.0f)
                curveTo(6.0f, 18.448f, 5.552f, 18.0f, 5.0f, 18.0f)
                curveTo(4.448f, 18.0f, 4.0f, 18.448f, 4.0f, 19.0f)
                curveTo(4.0f, 19.552f, 4.448f, 20.0f, 5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _shapeLine!!
    }

private var _shapeLine: ImageVector? = null
