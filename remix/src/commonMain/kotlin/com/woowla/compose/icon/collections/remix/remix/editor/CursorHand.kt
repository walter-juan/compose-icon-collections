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

public val EditorGroup.CursorHand: ImageVector
    get() {
        if (_cursorHand != null) {
            return _cursorHand!!
        }
        _cursorHand = Builder(name = "CursorHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 0.5f)
                curveTo(10.88f, 0.5f, 12.0f, 1.619f, 12.0f, 3.0f)
                verticalLineTo(6.803f)
                curveTo(12.555f, 6.605f, 13.178f, 6.568f, 13.803f, 6.741f)
                lineTo(18.803f, 8.13f)
                curveTo(20.101f, 8.491f, 21.0f, 9.673f, 21.0f, 11.021f)
                verticalLineTo(15.501f)
                curveTo(20.999f, 19.643f, 17.642f, 23.001f, 13.5f, 23.001f)
                curveTo(11.042f, 23.001f, 9.171f, 22.308f, 7.683f, 21.002f)
                curveTo(6.234f, 19.729f, 5.225f, 17.938f, 4.334f, 15.901f)
                curveTo(3.404f, 13.776f, 2.889f, 12.481f, 2.609f, 11.724f)
                curveTo(2.253f, 10.76f, 2.746f, 9.413f, 4.086f, 9.319f)
                lineTo(4.334f, 9.309f)
                curveTo(5.381f, 9.294f, 6.277f, 9.66f, 7.0f, 10.26f)
                verticalLineTo(3.0f)
                curveTo(7.0f, 1.619f, 8.119f, 0.5f, 9.5f, 0.5f)
                close()
                moveTo(9.5f, 2.5f)
                curveTo(9.224f, 2.5f, 9.0f, 2.724f, 9.0f, 3.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.005f)
                lineTo(7.019f, 14.197f)
                curveTo(6.671f, 12.458f, 5.685f, 11.451f, 4.597f, 11.325f)
                curveTo(4.882f, 12.07f, 5.362f, 13.263f, 6.166f, 15.1f)
                curveTo(7.025f, 17.062f, 7.891f, 18.522f, 9.004f, 19.499f)
                curveTo(10.078f, 20.442f, 11.459f, 21.001f, 13.5f, 21.001f)
                curveTo(16.537f, 21.001f, 18.999f, 18.538f, 19.0f, 15.501f)
                verticalLineTo(11.021f)
                curveTo(19.0f, 10.571f, 18.7f, 10.177f, 18.267f, 10.057f)
                lineTo(13.267f, 8.668f)
                curveTo(12.63f, 8.491f, 12.0f, 8.97f, 12.0f, 9.631f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                curveTo(10.0f, 2.724f, 9.776f, 2.5f, 9.5f, 2.5f)
                close()
            }
        }
        .build()
        return _cursorHand!!
    }

private var _cursorHand: ImageVector? = null
