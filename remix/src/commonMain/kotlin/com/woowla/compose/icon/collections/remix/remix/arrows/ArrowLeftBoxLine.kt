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

public val ArrowsGroup.ArrowLeftBoxLine: ImageVector
    get() {
        if (_arrowLeftBoxLine != null) {
            return _arrowLeftBoxLine!!
        }
        _arrowLeftBoxLine = Builder(name = "ArrowLeftBoxLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(6.344f, 12.001f)
                lineTo(12.0f, 6.344f)
                lineTo(13.415f, 7.758f)
                lineTo(10.172f, 11.001f)
                horizontalLineTo(17.657f)
                verticalLineTo(13.001f)
                horizontalLineTo(10.172f)
                lineTo(13.415f, 16.244f)
                lineTo(12.0f, 17.658f)
                lineTo(6.344f, 12.001f)
                close()
            }
        }
        .build()
        return _arrowLeftBoxLine!!
    }

private var _arrowLeftBoxLine: ImageVector? = null
