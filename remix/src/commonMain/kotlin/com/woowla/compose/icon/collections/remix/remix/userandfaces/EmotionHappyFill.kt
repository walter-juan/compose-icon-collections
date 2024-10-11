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

public val UserAndFacesGroup.EmotionHappyFill: ImageVector
    get() {
        if (_emotionHappyFill != null) {
            return _emotionHappyFill!!
        }
        _emotionHappyFill = Builder(name = "EmotionHappyFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(7.0f, 13.0f)
                curveTo(7.0f, 15.761f, 9.239f, 18.0f, 12.0f, 18.0f)
                curveTo(14.761f, 18.0f, 17.0f, 15.761f, 17.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 14.657f, 13.657f, 16.0f, 12.0f, 16.0f)
                curveTo(10.343f, 16.0f, 9.0f, 14.657f, 9.0f, 13.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(8.828f, 11.0f, 9.5f, 10.328f, 9.5f, 9.5f)
                curveTo(9.5f, 8.672f, 8.828f, 8.0f, 8.0f, 8.0f)
                curveTo(7.172f, 8.0f, 6.5f, 8.672f, 6.5f, 9.5f)
                curveTo(6.5f, 10.328f, 7.172f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(16.828f, 11.0f, 17.5f, 10.328f, 17.5f, 9.5f)
                curveTo(17.5f, 8.672f, 16.828f, 8.0f, 16.0f, 8.0f)
                curveTo(15.172f, 8.0f, 14.5f, 8.672f, 14.5f, 9.5f)
                curveTo(14.5f, 10.328f, 15.172f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _emotionHappyFill!!
    }

private var _emotionHappyFill: ImageVector? = null