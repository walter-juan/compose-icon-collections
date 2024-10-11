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

public val OthersGroup.GogglesFill: ImageVector
    get() {
        if (_gogglesFill != null) {
            return _gogglesFill!!
        }
        _gogglesFill = Builder(name = "GogglesFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
        return _gogglesFill!!
    }

private var _gogglesFill: ImageVector? = null
