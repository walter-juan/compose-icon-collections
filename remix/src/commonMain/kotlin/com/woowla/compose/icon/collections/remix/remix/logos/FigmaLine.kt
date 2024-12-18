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

public val LogosGroup.FigmaLine: ImageVector
    get() {
        if (_figmaLine != null) {
            return _figmaLine!!
        }
        _figmaLine = Builder(name = "FigmaLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(5.0f, 3.791f, 6.791f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(17.209f, 2.0f, 19.0f, 3.791f, 19.0f, 6.0f)
                curveTo(19.0f, 7.195f, 18.476f, 8.267f, 17.646f, 9.0f)
                curveTo(18.476f, 9.733f, 19.0f, 10.805f, 19.0f, 12.0f)
                curveTo(19.0f, 14.209f, 17.209f, 16.0f, 15.0f, 16.0f)
                curveTo(14.271f, 16.0f, 13.588f, 15.805f, 13.0f, 15.465f)
                verticalLineTo(18.0f)
                curveTo(13.0f, 20.209f, 11.209f, 22.0f, 9.0f, 22.0f)
                curveTo(6.791f, 22.0f, 5.0f, 20.209f, 5.0f, 18.0f)
                curveTo(5.0f, 16.805f, 5.524f, 15.733f, 6.354f, 15.0f)
                curveTo(5.524f, 14.267f, 5.0f, 13.195f, 5.0f, 12.0f)
                curveTo(5.0f, 10.805f, 5.524f, 9.733f, 6.354f, 9.0f)
                curveTo(5.524f, 8.267f, 5.0f, 7.195f, 5.0f, 6.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineTo(9.0f)
                curveTo(7.895f, 10.0f, 7.0f, 10.895f, 7.0f, 12.0f)
                curveTo(7.0f, 13.105f, 7.895f, 14.0f, 9.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 13.105f, 13.895f, 14.0f, 15.0f, 14.0f)
                curveTo(16.105f, 14.0f, 17.0f, 13.105f, 17.0f, 12.0f)
                curveTo(17.0f, 10.895f, 16.105f, 10.0f, 15.0f, 10.0f)
                curveTo(13.895f, 10.0f, 13.0f, 10.895f, 13.0f, 12.0f)
                close()
                moveTo(15.0f, 8.0f)
                curveTo(16.105f, 8.0f, 17.0f, 7.105f, 17.0f, 6.0f)
                curveTo(17.0f, 4.895f, 16.105f, 4.0f, 15.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(9.0f, 4.0f)
                curveTo(7.895f, 4.0f, 7.0f, 4.895f, 7.0f, 6.0f)
                curveTo(7.0f, 7.105f, 7.895f, 8.0f, 9.0f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineTo(9.0f)
                curveTo(7.895f, 16.0f, 7.0f, 16.895f, 7.0f, 18.0f)
                curveTo(7.0f, 19.105f, 7.895f, 20.0f, 9.0f, 20.0f)
                curveTo(10.105f, 20.0f, 11.0f, 19.105f, 11.0f, 18.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _figmaLine!!
    }

private var _figmaLine: ImageVector? = null
