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

public val DesignGroup.FlipVerticalLine: ImageVector
    get() {
        if (_flipVerticalLine != null) {
            return _flipVerticalLine!!
        }
        _flipVerticalLine = Builder(name = "FlipVerticalLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 13.0f)
                lineTo(22.0f, 13.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(18.0f, 2.0f)
                curveTo(19.105f, 2.0f, 20.0f, 2.895f, 20.0f, 4.0f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 8.105f, 19.105f, 9.0f, 18.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                curveTo(4.895f, 9.0f, 4.0f, 8.105f, 4.0f, 7.0f)
                lineTo(4.0f, 4.0f)
                curveTo(4.0f, 2.895f, 4.895f, 2.0f, 6.0f, 2.0f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                lineTo(18.0f, 17.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(20.0f, 17.0f)
                curveTo(20.0f, 15.895f, 19.105f, 15.0f, 18.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                curveTo(4.895f, 15.0f, 4.0f, 15.895f, 4.0f, 17.0f)
                lineTo(4.0f, 20.0f)
                curveTo(4.0f, 21.105f, 4.895f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.105f, 22.0f, 20.0f, 21.105f, 20.0f, 20.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _flipVerticalLine!!
    }

private var _flipVerticalLine: ImageVector? = null
