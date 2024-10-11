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

public val OthersGroup.GogglesLine: ImageVector
    get() {
        if (_gogglesLine != null) {
            return _gogglesLine!!
        }
        _gogglesLine = Builder(name = "GogglesLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.718f, 10.147f)
                curveTo(3.285f, 10.701f, 3.0f, 11.446f, 3.0f, 12.5f)
                curveTo(3.0f, 13.515f, 3.371f, 14.552f, 3.964f, 15.322f)
                curveTo(4.56f, 16.095f, 5.294f, 16.5f, 6.0f, 16.5f)
                curveTo(6.762f, 16.5f, 7.514f, 16.066f, 8.538f, 15.408f)
                curveTo(9.587f, 14.735f, 10.706f, 14.0f, 12.0f, 14.0f)
                curveTo(13.294f, 14.0f, 14.413f, 14.735f, 15.462f, 15.408f)
                curveTo(16.486f, 16.066f, 17.238f, 16.5f, 18.0f, 16.5f)
                curveTo(18.706f, 16.5f, 19.44f, 16.095f, 20.036f, 15.322f)
                curveTo(20.629f, 14.552f, 21.0f, 13.515f, 21.0f, 12.5f)
                curveTo(21.0f, 11.446f, 20.715f, 10.701f, 20.282f, 10.147f)
                curveTo(19.839f, 9.58f, 19.183f, 9.139f, 18.326f, 8.808f)
                curveTo(16.581f, 8.132f, 14.251f, 8.0f, 12.0f, 8.0f)
                curveTo(9.749f, 8.0f, 7.419f, 8.132f, 5.673f, 8.808f)
                curveTo(4.817f, 9.139f, 4.161f, 9.58f, 3.718f, 10.147f)
                close()
                moveTo(4.952f, 6.942f)
                curveTo(7.081f, 6.118f, 9.751f, 6.0f, 12.0f, 6.0f)
                curveTo(14.249f, 6.0f, 16.919f, 6.118f, 19.049f, 6.942f)
                curveTo(20.13f, 7.361f, 21.129f, 7.983f, 21.858f, 8.916f)
                curveTo(22.597f, 9.862f, 23.0f, 11.054f, 23.0f, 12.5f)
                curveTo(23.0f, 13.97f, 22.475f, 15.433f, 21.621f, 16.542f)
                curveTo(20.769f, 17.647f, 19.503f, 18.5f, 18.0f, 18.5f)
                curveTo(16.575f, 18.5f, 15.344f, 17.709f, 14.425f, 17.12f)
                curveTo(13.719f, 16.667f, 12.883f, 16.0f, 12.0f, 16.0f)
                curveTo(11.117f, 16.0f, 10.28f, 16.667f, 9.575f, 17.12f)
                curveTo(8.656f, 17.709f, 7.425f, 18.5f, 6.0f, 18.5f)
                curveTo(4.497f, 18.5f, 3.231f, 17.647f, 2.379f, 16.542f)
                curveTo(1.525f, 15.433f, 1.0f, 13.97f, 1.0f, 12.5f)
                curveTo(1.0f, 11.054f, 1.402f, 9.862f, 2.142f, 8.916f)
                curveTo(2.871f, 7.983f, 3.87f, 7.361f, 4.952f, 6.942f)
                close()
            }
        }
        .build()
        return _gogglesLine!!
    }

private var _gogglesLine: ImageVector? = null
