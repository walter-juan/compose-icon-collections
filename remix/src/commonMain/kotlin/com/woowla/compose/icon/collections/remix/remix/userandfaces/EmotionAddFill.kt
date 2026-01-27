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

public val UserAndFacesGroup.EmotionAddFill: ImageVector
    get() {
        if (_emotionAddFill != null) {
            return _emotionAddFill!!
        }
        _emotionAddFill = Builder(name = "EmotionAddFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.586f, 2.0f, 13.16f, 2.053f, 13.719f, 2.149f)
                curveTo(13.26f, 2.997f, 13.0f, 3.968f, 13.0f, 5.0f)
                curveTo(13.0f, 8.314f, 15.686f, 11.0f, 19.0f, 11.0f)
                curveTo(20.031f, 11.0f, 21.002f, 10.739f, 21.85f, 10.28f)
                curveTo(21.947f, 10.839f, 22.0f, 11.413f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveTo(8.0f, 15.209f, 9.791f, 17.0f, 12.0f, 17.0f)
                curveTo(14.209f, 17.0f, 16.0f, 15.209f, 16.0f, 13.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _emotionAddFill!!
    }

private var _emotionAddFill: ImageVector? = null
