package com.woowla.compose.icon.collections.devicons.devicons.tensorflow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.TensorflowGroup

public val TensorflowGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.08f, 0.0f)
                lineTo(7.16f, 31.39f)
                lineToRelative(-0.08f, 29.09f)
                lineToRelative(32.47f, -18.76f)
                verticalLineToRelative(73.2f)
                lineTo(62.08f, 128.0f)
                lineTo(62.08f, 0.0f)
                close()
                moveTo(65.93f, 0.0f)
                verticalLineToRelative(128.0f)
                lineToRelative(22.53f, -13.08f)
                lineTo(88.47f, 79.96f)
                lineToRelative(16.27f, 9.41f)
                lineToRelative(-0.1f, -25.45f)
                lineToRelative(-16.17f, -9.23f)
                lineTo(88.47f, 41.72f)
                lineToRelative(32.46f, 18.76f)
                lineToRelative(-0.08f, -29.09f)
                lineTo(65.93f, 0.0f)
                close()
                moveTo(61.09f, 1.7f)
                verticalLineToRelative(124.59f)
                lineToRelative(-20.56f, -11.94f)
                lineTo(40.53f, 40.01f)
                lineTo(8.07f, 58.76f)
                lineToRelative(0.08f, -26.8f)
                lineTo(61.09f, 1.7f)
                close()
                moveTo(66.92f, 1.7f)
                lineTo(119.85f, 31.96f)
                lineTo(119.93f, 58.76f)
                lineTo(87.48f, 40.0f)
                verticalLineToRelative(15.25f)
                lineToRelative(16.17f, 9.23f)
                lineToRelative(0.09f, 23.16f)
                lineToRelative(-16.27f, -9.4f)
                verticalLineToRelative(36.1f)
                lineToRelative(-20.56f, 11.94f)
                lineTo(66.92f, 1.7f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
