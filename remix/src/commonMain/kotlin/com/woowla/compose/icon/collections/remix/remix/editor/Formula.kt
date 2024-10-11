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

public val EditorGroup.Formula: ImageVector
    get() {
        if (_formula != null) {
            return _formula!!
        }
        _formula = Builder(name = "Formula", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(7.791f, 2.0f, 6.0f, 3.791f, 6.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                curveTo(6.0f, 19.105f, 5.105f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(6.209f, 22.0f, 8.0f, 20.209f, 8.0f, 18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 4.895f, 8.895f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(15.202f, 16.997f)
                lineTo(11.891f, 21.0f)
                horizontalLineTo(14.486f)
                lineTo(16.5f, 18.566f)
                lineTo(18.514f, 21.0f)
                horizontalLineTo(21.109f)
                lineTo(17.798f, 16.997f)
                lineTo(21.105f, 13.0f)
                horizontalLineTo(18.509f)
                lineTo(16.5f, 15.428f)
                lineTo(14.491f, 13.0f)
                horizontalLineTo(11.896f)
                lineTo(15.202f, 16.997f)
                close()
            }
        }
        .build()
        return _formula!!
    }

private var _formula: ImageVector? = null
