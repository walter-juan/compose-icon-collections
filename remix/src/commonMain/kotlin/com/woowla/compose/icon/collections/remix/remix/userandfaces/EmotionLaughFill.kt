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

public val UserAndFacesGroup.EmotionLaughFill: ImageVector
    get() {
        if (_emotionLaughFill != null) {
            return _emotionLaughFill!!
        }
        _emotionLaughFill = Builder(name = "EmotionLaughFill", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(12.0f, 11.0f)
                curveTo(10.0f, 11.0f, 8.333f, 11.333f, 7.0f, 12.0f)
                curveTo(7.0f, 14.761f, 9.239f, 17.0f, 12.0f, 17.0f)
                curveTo(14.761f, 17.0f, 17.0f, 14.761f, 17.0f, 12.0f)
                curveTo(15.667f, 11.333f, 14.0f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveTo(7.348f, 7.0f, 6.378f, 7.779f, 6.088f, 8.84f)
                lineTo(6.05f, 9.001f)
                horizontalLineTo(10.95f)
                curveTo(10.719f, 7.859f, 9.71f, 7.0f, 8.5f, 7.0f)
                close()
                moveTo(15.5f, 7.0f)
                curveTo(14.348f, 7.0f, 13.378f, 7.779f, 13.088f, 8.84f)
                lineTo(13.05f, 9.001f)
                horizontalLineTo(17.95f)
                curveTo(17.719f, 7.859f, 16.71f, 7.0f, 15.5f, 7.0f)
                close()
            }
        }
        .build()
        return _emotionLaughFill!!
    }

private var _emotionLaughFill: ImageVector? = null
