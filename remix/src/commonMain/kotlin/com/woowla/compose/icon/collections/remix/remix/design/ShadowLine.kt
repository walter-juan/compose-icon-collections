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

public val DesignGroup.ShadowLine: ImageVector
    get() {
        if (_shadowLine != null) {
            return _shadowLine!!
        }
        _shadowLine = Builder(name = "ShadowLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                curveTo(2.448f, 2.0f, 2.0f, 2.448f, 2.0f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 17.552f, 2.448f, 18.0f, 3.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                curveTo(6.0f, 21.552f, 6.448f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 22.0f, 22.0f, 21.552f, 22.0f, 21.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 6.448f, 21.552f, 6.0f, 21.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                curveTo(18.0f, 2.448f, 17.552f, 2.0f, 17.0f, 2.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(18.0f, 11.561f)
                lineTo(20.0f, 13.561f)
                verticalLineTo(16.439f)
                lineTo(18.0f, 14.439f)
                verticalLineTo(11.561f)
                close()
                moveTo(18.0f, 9.439f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.439f)
                lineTo(18.0f, 9.439f)
                close()
                moveTo(18.0f, 17.0f)
                verticalLineTo(16.561f)
                lineTo(20.0f, 18.561f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.561f)
                lineTo(16.561f, 18.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 18.0f, 18.0f, 17.552f, 18.0f, 17.0f)
                close()
                moveTo(14.439f, 18.0f)
                lineTo(16.439f, 20.0f)
                horizontalLineTo(13.561f)
                lineTo(11.561f, 18.0f)
                horizontalLineTo(14.439f)
                close()
                moveTo(9.439f, 18.0f)
                lineTo(11.439f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.439f)
                close()
                moveTo(4.0f, 16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _shadowLine!!
    }

private var _shadowLine: ImageVector? = null
