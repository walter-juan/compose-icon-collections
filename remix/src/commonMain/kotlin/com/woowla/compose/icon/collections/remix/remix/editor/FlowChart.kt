package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.FlowChart: ImageVector
    get() {
        if (_flowChart != null) {
            return _flowChart!!
        }
        _flowChart = Builder(name = "FlowChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 21.5f)
                curveTo(4.067f, 21.5f, 2.5f, 19.933f, 2.5f, 18.0f)
                curveTo(2.5f, 16.067f, 4.067f, 14.5f, 6.0f, 14.5f)
                curveTo(7.585f, 14.5f, 8.924f, 15.554f, 9.355f, 16.999f)
                lineTo(15.0f, 16.999f)
                verticalLineTo(15.0f)
                lineTo(17.0f, 14.999f)
                verticalLineTo(9.243f)
                lineTo(14.757f, 6.999f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.999f)
                horizontalLineTo(14.757f)
                lineTo(18.0f, 1.757f)
                lineTo(22.243f, 6.0f)
                lineTo(19.0f, 9.241f)
                verticalLineTo(14.999f)
                lineTo(21.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.999f)
                lineTo(9.355f, 19.0f)
                curveTo(8.925f, 20.446f, 7.585f, 21.5f, 6.0f, 21.5f)
                close()
                moveTo(6.0f, 16.5f)
                curveTo(5.172f, 16.5f, 4.5f, 17.172f, 4.5f, 18.0f)
                curveTo(4.5f, 18.829f, 5.172f, 19.5f, 6.0f, 19.5f)
                curveTo(6.828f, 19.5f, 7.5f, 18.829f, 7.5f, 18.0f)
                curveTo(7.5f, 17.172f, 6.828f, 16.5f, 6.0f, 16.5f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(18.0f, 4.586f)
                lineTo(16.586f, 6.0f)
                lineTo(18.0f, 7.414f)
                lineTo(19.414f, 6.0f)
                lineTo(18.0f, 4.586f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _flowChart!!
    }

private var _flowChart: ImageVector? = null
