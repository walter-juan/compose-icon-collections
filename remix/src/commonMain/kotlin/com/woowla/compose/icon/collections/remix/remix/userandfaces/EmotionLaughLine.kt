package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.EmotionLaughLine: ImageVector
    get() {
        if (_emotionLaughLine != null) {
            return _emotionLaughLine!!
        }
        _emotionLaughLine = Builder(name = "EmotionLaughLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.0f, 11.0f, 15.667f, 11.333f, 17.0f, 12.0f)
                curveTo(17.0f, 14.761f, 14.761f, 17.0f, 12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                curveTo(8.333f, 11.333f, 10.0f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveTo(9.71f, 7.0f, 10.719f, 7.859f, 10.95f, 9.001f)
                horizontalLineTo(6.05f)
                curveTo(6.281f, 7.859f, 7.29f, 7.0f, 8.5f, 7.0f)
                close()
                moveTo(15.5f, 7.0f)
                curveTo(16.71f, 7.0f, 17.719f, 7.859f, 17.95f, 9.001f)
                horizontalLineTo(13.05f)
                curveTo(13.281f, 7.859f, 14.29f, 7.0f, 15.5f, 7.0f)
                close()
            }
        }
        .build()
        return _emotionLaughLine!!
    }

private var _emotionLaughLine: ImageVector? = null
