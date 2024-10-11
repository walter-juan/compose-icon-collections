package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.BasketballFill: ImageVector
    get() {
        if (_basketballFill != null) {
            return _basketballFill!!
        }
        _basketballFill = Builder(name = "BasketballFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.366f, 13.366f)
                lineTo(14.141f, 14.391f)
                curveTo(13.05f, 16.804f, 12.995f, 19.467f, 13.83f, 21.831f)
                curveTo(13.238f, 21.943f, 12.625f, 22.0f, 12.0f, 22.0f)
                curveTo(10.535f, 22.0f, 9.144f, 21.685f, 7.891f, 21.119f)
                lineTo(12.366f, 13.366f)
                close()
                moveTo(15.884f, 15.398f)
                lineTo(20.117f, 17.842f)
                curveTo(19.022f, 19.36f, 17.513f, 20.559f, 15.754f, 21.271f)
                curveTo(15.105f, 19.511f, 15.076f, 17.535f, 15.762f, 15.702f)
                lineTo(15.884f, 15.398f)
                close()
                moveTo(8.859f, 11.342f)
                lineTo(10.634f, 12.366f)
                lineTo(6.158f, 20.117f)
                curveTo(4.519f, 18.935f, 3.253f, 17.27f, 2.568f, 15.331f)
                curveTo(4.927f, 14.892f, 7.116f, 13.611f, 8.653f, 11.618f)
                lineTo(8.859f, 11.342f)
                close()
                moveTo(21.905f, 10.616f)
                curveTo(21.968f, 11.069f, 22.0f, 11.531f, 22.0f, 12.0f)
                curveTo(22.0f, 13.465f, 21.685f, 14.856f, 21.119f, 16.11f)
                lineTo(16.884f, 13.665f)
                curveTo(18.106f, 12.05f, 19.858f, 11.008f, 21.75f, 10.644f)
                lineTo(21.905f, 10.616f)
                close()
                moveTo(2.881f, 7.891f)
                lineTo(7.116f, 10.336f)
                curveTo(5.86f, 11.995f, 4.046f, 13.049f, 2.095f, 13.385f)
                curveTo(2.032f, 12.932f, 2.0f, 12.47f, 2.0f, 12.0f)
                curveTo(2.0f, 10.535f, 2.315f, 9.144f, 2.881f, 7.891f)
                close()
                moveTo(17.842f, 3.883f)
                curveTo(19.48f, 5.064f, 20.747f, 6.729f, 21.431f, 8.668f)
                curveTo(19.072f, 9.108f, 16.884f, 10.389f, 15.346f, 12.383f)
                lineTo(15.141f, 12.659f)
                lineTo(13.366f, 11.634f)
                lineTo(17.842f, 3.883f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(13.465f, 2.0f, 14.856f, 2.315f, 16.11f, 2.881f)
                lineTo(11.634f, 10.634f)
                lineTo(9.859f, 9.61f)
                curveTo(10.95f, 7.197f, 11.005f, 4.533f, 10.17f, 2.168f)
                curveTo(10.762f, 2.057f, 11.375f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.247f, 2.729f)
                curveTo(8.895f, 4.489f, 8.924f, 6.466f, 8.237f, 8.299f)
                lineTo(8.116f, 8.603f)
                lineTo(3.883f, 6.158f)
                curveTo(4.936f, 4.697f, 6.373f, 3.533f, 8.047f, 2.812f)
                lineTo(8.247f, 2.729f)
                close()
            }
        }
        .build()
        return _basketballFill!!
    }

private var _basketballFill: ImageVector? = null
