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

public val EditorGroup.Number5: ImageVector
    get() {
        if (_number5 != null) {
            return _number5!!
        }
        _number5 = Builder(name = "Number5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.3f)
                lineTo(8.623f, 10.445f)
                curveTo(9.608f, 9.845f, 10.763f, 9.5f, 12.0f, 9.5f)
                curveTo(15.59f, 9.5f, 18.5f, 12.41f, 18.5f, 16.0f)
                curveTo(18.5f, 19.59f, 15.59f, 22.5f, 12.0f, 22.5f)
                curveTo(8.954f, 22.5f, 6.398f, 20.405f, 5.693f, 17.578f)
                lineTo(7.634f, 17.092f)
                curveTo(8.122f, 19.05f, 9.891f, 20.5f, 12.0f, 20.5f)
                curveTo(14.485f, 20.5f, 16.5f, 18.485f, 16.5f, 16.0f)
                curveTo(16.5f, 13.515f, 14.485f, 11.5f, 12.0f, 11.5f)
                curveTo(9.978f, 11.5f, 8.722f, 12.139f, 8.04f, 13.029f)
                lineTo(6.465f, 11.848f)
                lineTo(7.5f, 2.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _number5!!
    }

private var _number5: ImageVector? = null
