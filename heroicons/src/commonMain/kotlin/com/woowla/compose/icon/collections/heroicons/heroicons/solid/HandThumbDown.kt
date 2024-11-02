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

public val SolidGroup.HandThumbDown: ImageVector
    get() {
        if (_handThumbDown != null) {
            return _handThumbDown!!
        }
        _handThumbDown = Builder(name = "HandThumbDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.73f, 5.5f)
                lineTo(16.765f, 5.5f)
                curveTo(17.545f, 6.683f, 18.0f, 8.101f, 18.0f, 9.625f)
                curveTo(18.0f, 11.149f, 17.545f, 12.567f, 16.765f, 13.75f)
                lineTo(16.617f, 13.75f)
                curveTo(15.811f, 13.75f, 15.083f, 14.196f, 14.586f, 14.83f)
                curveTo(13.813f, 15.816f, 12.838f, 16.637f, 11.724f, 17.23f)
                curveTo(11.002f, 17.614f, 10.376f, 18.186f, 10.072f, 18.945f)
                curveTo(9.859f, 19.477f, 9.75f, 20.044f, 9.75f, 20.617f)
                verticalLineTo(21.25f)
                curveTo(9.75f, 21.664f, 9.414f, 22.0f, 9.0f, 22.0f)
                curveTo(7.757f, 22.0f, 6.75f, 20.993f, 6.75f, 19.75f)
                curveTo(6.75f, 18.598f, 7.01f, 17.507f, 7.473f, 16.532f)
                curveTo(7.739f, 15.974f, 7.366f, 15.25f, 6.748f, 15.25f)
                lineTo(3.622f, 15.25f)
                curveTo(2.596f, 15.25f, 1.677f, 14.556f, 1.568f, 13.535f)
                curveTo(1.523f, 13.113f, 1.5f, 12.684f, 1.5f, 12.25f)
                curveTo(1.5f, 9.402f, 2.492f, 6.786f, 4.149f, 4.729f)
                curveTo(4.537f, 4.247f, 5.136f, 4.0f, 5.754f, 4.0f)
                lineTo(9.77f, 4.0f)
                curveTo(10.253f, 4.0f, 10.734f, 4.078f, 11.193f, 4.231f)
                lineTo(14.307f, 5.269f)
                curveTo(14.766f, 5.422f, 15.247f, 5.5f, 15.73f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.669f, 14.023f)
                curveTo(22.205f, 12.661f, 22.5f, 11.177f, 22.5f, 9.625f)
                curveTo(22.5f, 8.405f, 22.318f, 7.227f, 21.979f, 6.118f)
                curveTo(21.72f, 5.268f, 20.896f, 4.75f, 20.007f, 4.75f)
                lineTo(19.099f, 4.75f)
                curveTo(18.654f, 4.75f, 18.379f, 5.248f, 18.576f, 5.648f)
                curveTo(19.167f, 6.847f, 19.5f, 8.197f, 19.5f, 9.625f)
                curveTo(19.5f, 11.333f, 19.024f, 12.93f, 18.198f, 14.291f)
                curveTo(17.953f, 14.694f, 18.226f, 15.25f, 18.698f, 15.25f)
                horizontalLineTo(19.751f)
                curveTo(20.583f, 15.25f, 21.364f, 14.797f, 21.669f, 14.023f)
                close()
            }
        }
        .build()
        return _handThumbDown!!
    }

private var _handThumbDown: ImageVector? = null
