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

public val UserAndFacesGroup.EmotionSadLine: ImageVector
    get() {
        if (_emotionSadLine != null) {
            return _emotionSadLine!!
        }
        _emotionSadLine = Builder(name = "EmotionSadLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 12.727f, 21.923f, 13.435f, 21.775f, 14.118f)
                lineTo(19.993f, 12.335f)
                curveTo(19.998f, 12.224f, 20.0f, 12.112f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(13.302f, 20.0f, 14.532f, 19.689f, 15.619f, 19.137f)
                curveTo(15.774f, 19.383f, 15.958f, 19.615f, 16.172f, 19.828f)
                curveTo(16.474f, 20.131f, 16.813f, 20.375f, 17.173f, 20.56f)
                curveTo(15.664f, 21.474f, 13.894f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(19.0f, 14.172f)
                lineTo(20.414f, 15.586f)
                curveTo(21.195f, 16.367f, 21.195f, 17.633f, 20.414f, 18.414f)
                curveTo(19.633f, 19.195f, 18.367f, 19.195f, 17.586f, 18.414f)
                curveTo(16.84f, 17.669f, 16.806f, 16.481f, 17.484f, 15.695f)
                lineTo(17.586f, 15.586f)
                lineTo(19.0f, 14.172f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(13.466f, 15.0f, 14.785f, 15.631f, 15.7f, 16.637f)
                lineTo(14.755f, 17.496f)
                curveTo(13.965f, 17.183f, 13.018f, 17.0f, 12.0f, 17.0f)
                curveTo(10.982f, 17.0f, 10.035f, 17.183f, 9.245f, 17.496f)
                lineTo(8.3f, 16.637f)
                curveTo(9.215f, 15.631f, 10.534f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(8.5f, 10.0f)
                curveTo(9.328f, 10.0f, 10.0f, 10.672f, 10.0f, 11.5f)
                curveTo(10.0f, 12.328f, 9.328f, 13.0f, 8.5f, 13.0f)
                curveTo(7.672f, 13.0f, 7.0f, 12.328f, 7.0f, 11.5f)
                curveTo(7.0f, 10.672f, 7.672f, 10.0f, 8.5f, 10.0f)
                close()
                moveTo(15.5f, 10.0f)
                curveTo(16.328f, 10.0f, 17.0f, 10.672f, 17.0f, 11.5f)
                curveTo(17.0f, 12.328f, 16.328f, 13.0f, 15.5f, 13.0f)
                curveTo(14.672f, 13.0f, 14.0f, 12.328f, 14.0f, 11.5f)
                curveTo(14.0f, 10.672f, 14.672f, 10.0f, 15.5f, 10.0f)
                close()
            }
        }
        .build()
        return _emotionSadLine!!
    }

private var _emotionSadLine: ImageVector? = null
