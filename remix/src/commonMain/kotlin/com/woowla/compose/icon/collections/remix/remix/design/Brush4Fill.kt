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

public val DesignGroup.Brush4Fill: ImageVector
    get() {
        if (_brush4Fill != null) {
            return _brush4Fill!!
        }
        _brush4Fill = Builder(name = "Brush4Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.997f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.997f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.997f)
                close()
                moveTo(3.0f, 13.997f)
                verticalLineTo(3.997f)
                curveTo(3.0f, 3.444f, 3.448f, 2.997f, 4.0f, 2.997f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.269f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.997f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 2.997f, 21.0f, 3.444f, 21.0f, 3.997f)
                verticalLineTo(13.997f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.997f)
                curveTo(22.0f, 19.549f, 21.552f, 19.997f, 21.0f, 19.997f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.997f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.997f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 19.997f, 2.0f, 19.549f, 2.0f, 18.997f)
                verticalLineTo(13.997f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _brush4Fill!!
    }

private var _brush4Fill: ImageVector? = null
