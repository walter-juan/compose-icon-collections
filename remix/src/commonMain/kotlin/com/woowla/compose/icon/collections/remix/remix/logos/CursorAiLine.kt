package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.CursorAiLine: ImageVector
    get() {
        if (_cursorAiLine != null) {
            return _cursorAiLine!!
        }
        _cursorAiLine = Builder(name = "CursorAiLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.55f, 1.354f)
                curveTo(11.828f, 1.194f, 12.172f, 1.194f, 12.45f, 1.354f)
                lineTo(21.121f, 6.33f)
                curveTo(21.355f, 6.465f, 21.5f, 6.714f, 21.5f, 6.983f)
                verticalLineTo(17.019f)
                lineTo(21.494f, 17.118f)
                curveTo(21.463f, 17.348f, 21.327f, 17.553f, 21.122f, 17.67f)
                lineTo(12.45f, 22.648f)
                lineTo(12.343f, 22.699f)
                curveTo(12.087f, 22.804f, 11.793f, 22.787f, 11.55f, 22.648f)
                lineTo(2.879f, 17.67f)
                curveTo(2.674f, 17.553f, 2.538f, 17.348f, 2.507f, 17.118f)
                lineTo(2.5f, 17.019f)
                verticalLineTo(6.983f)
                curveTo(2.5f, 6.714f, 2.645f, 6.465f, 2.879f, 6.33f)
                lineTo(11.55f, 1.354f)
                close()
                moveTo(4.5f, 7.705f)
                verticalLineTo(16.294f)
                lineTo(12.0f, 20.599f)
                verticalLineTo(12.305f)
                curveTo(12.0f, 12.116f, 11.899f, 11.942f, 11.734f, 11.847f)
                lineTo(4.509f, 7.699f)
                lineTo(4.5f, 7.705f)
                close()
                moveTo(13.354f, 19.822f)
                lineTo(19.5f, 16.294f)
                verticalLineTo(9.238f)
                lineTo(13.354f, 19.822f)
                close()
                moveTo(5.861f, 6.924f)
                horizontalLineTo(18.139f)
                lineTo(11.999f, 3.401f)
                lineTo(5.861f, 6.924f)
                close()
            }
        }
        .build()
        return _cursorAiLine!!
    }

private var _cursorAiLine: ImageVector? = null
