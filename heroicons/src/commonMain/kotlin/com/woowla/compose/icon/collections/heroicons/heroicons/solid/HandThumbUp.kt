package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.HandThumbUp: ImageVector
    get() {
        if (_handThumbUp != null) {
            return _handThumbUp!!
        }
        _handThumbUp = Builder(name = "HandThumbUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.493f, 18.5f)
                curveTo(7.068f, 18.5f, 6.673f, 18.264f, 6.518f, 17.868f)
                curveTo(6.183f, 17.019f, 6.0f, 16.093f, 6.0f, 15.125f)
                curveTo(6.0f, 13.376f, 6.599f, 11.767f, 7.602f, 10.491f)
                curveTo(7.753f, 10.299f, 7.975f, 10.182f, 8.202f, 10.094f)
                curveTo(8.675f, 9.911f, 9.093f, 9.58f, 9.414f, 9.17f)
                curveTo(10.187f, 8.184f, 11.162f, 7.363f, 12.276f, 6.77f)
                curveTo(12.998f, 6.386f, 13.624f, 5.814f, 13.928f, 5.055f)
                curveTo(14.141f, 4.523f, 14.25f, 3.956f, 14.25f, 3.383f)
                verticalLineTo(2.75f)
                curveTo(14.25f, 2.336f, 14.586f, 2.0f, 15.0f, 2.0f)
                curveTo(16.243f, 2.0f, 17.25f, 3.007f, 17.25f, 4.25f)
                curveTo(17.25f, 5.402f, 16.99f, 6.493f, 16.527f, 7.468f)
                curveTo(16.261f, 8.026f, 16.634f, 8.75f, 17.252f, 8.75f)
                horizontalLineTo(20.378f)
                curveTo(21.404f, 8.75f, 22.323f, 9.444f, 22.432f, 10.465f)
                curveTo(22.477f, 10.887f, 22.5f, 11.316f, 22.5f, 11.75f)
                curveTo(22.5f, 14.598f, 21.508f, 17.214f, 19.851f, 19.271f)
                curveTo(19.463f, 19.753f, 18.864f, 20.0f, 18.246f, 20.0f)
                horizontalLineTo(14.23f)
                curveTo(13.747f, 20.0f, 13.266f, 19.922f, 12.807f, 19.769f)
                lineTo(9.693f, 18.731f)
                curveTo(9.234f, 18.578f, 8.753f, 18.5f, 8.27f, 18.5f)
                horizontalLineTo(7.493f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.331f, 10.727f)
                curveTo(1.795f, 12.089f, 1.5f, 13.573f, 1.5f, 15.125f)
                curveTo(1.5f, 16.345f, 1.682f, 17.523f, 2.021f, 18.632f)
                curveTo(2.28f, 19.482f, 3.104f, 20.0f, 3.993f, 20.0f)
                horizontalLineTo(4.901f)
                curveTo(5.346f, 20.0f, 5.621f, 19.502f, 5.424f, 19.102f)
                curveTo(4.832f, 17.903f, 4.5f, 16.553f, 4.5f, 15.125f)
                curveTo(4.5f, 13.417f, 4.976f, 11.82f, 5.802f, 10.459f)
                curveTo(6.047f, 10.056f, 5.774f, 9.5f, 5.302f, 9.5f)
                horizontalLineTo(4.249f)
                curveTo(3.417f, 9.5f, 2.637f, 9.953f, 2.331f, 10.727f)
                close()
            }
        }
        .build()
        return _handThumbUp!!
    }

private var _handThumbUp: ImageVector? = null
