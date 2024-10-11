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

public val DesignGroup.LayoutVerticalLine: ImageVector
    get() {
        if (_layoutVerticalLine != null) {
            return _layoutVerticalLine!!
        }
        _layoutVerticalLine = Builder(name = "LayoutVerticalLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(3.0f, 4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(15.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(11.0f, 7.0f)
                lineTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(7.0f, 17.0f)
                lineTo(7.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                lineTo(9.0f, 17.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _layoutVerticalLine!!
    }

private var _layoutVerticalLine: ImageVector? = null
