package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ArrowRightDownBoxLine: ImageVector
    get() {
        if (_arrowRightDownBoxLine != null) {
            return _arrowRightDownBoxLine!!
        }
        _arrowRightDownBoxLine = Builder(name = "ArrowRightDownBoxLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 3.0f, 3.0f, 3.448f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.552f, 3.448f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 21.0f, 21.0f, 20.552f, 21.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.448f, 20.552f, 3.0f, 20.0f, 3.0f)
                close()
                moveTo(5.0f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.586f)
                lineTo(7.293f, 8.707f)
                lineTo(8.707f, 7.293f)
                lineTo(14.0f, 12.586f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _arrowRightDownBoxLine!!
    }

private var _arrowRightDownBoxLine: ImageVector? = null
