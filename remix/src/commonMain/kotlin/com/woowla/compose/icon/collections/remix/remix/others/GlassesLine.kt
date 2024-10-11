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

public val OthersGroup.GlassesLine: ImageVector
    get() {
        if (_glassesLine != null) {
            return _glassesLine!!
        }
        _glassesLine = Builder(name = "GlassesLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                curveTo(4.343f, 9.0f, 3.0f, 10.343f, 3.0f, 12.0f)
                curveTo(3.0f, 13.657f, 4.343f, 15.0f, 6.0f, 15.0f)
                curveTo(7.657f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                curveTo(9.0f, 11.363f, 8.802f, 10.775f, 8.465f, 10.29f)
                curveTo(7.922f, 9.508f, 7.02f, 9.0f, 6.0f, 9.0f)
                close()
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 9.239f, 3.239f, 7.0f, 6.0f, 7.0f)
                curveTo(7.214f, 7.0f, 8.327f, 7.433f, 9.192f, 8.151f)
                curveTo(9.914f, 7.44f, 10.905f, 7.0f, 12.0f, 7.0f)
                curveTo(13.095f, 7.0f, 14.086f, 7.44f, 14.808f, 8.151f)
                curveTo(15.673f, 7.433f, 16.786f, 7.0f, 18.0f, 7.0f)
                curveTo(20.761f, 7.0f, 23.0f, 9.239f, 23.0f, 12.0f)
                curveTo(23.0f, 14.761f, 20.761f, 17.0f, 18.0f, 17.0f)
                curveTo(15.239f, 17.0f, 13.0f, 14.761f, 13.0f, 12.0f)
                curveTo(13.0f, 11.184f, 13.196f, 10.411f, 13.545f, 9.729f)
                curveTo(13.177f, 9.283f, 12.621f, 9.0f, 12.0f, 9.0f)
                curveTo(11.379f, 9.0f, 10.823f, 9.283f, 10.455f, 9.729f)
                curveTo(10.804f, 10.411f, 11.0f, 11.184f, 11.0f, 12.0f)
                curveTo(11.0f, 14.761f, 8.761f, 17.0f, 6.0f, 17.0f)
                curveTo(3.239f, 17.0f, 1.0f, 14.761f, 1.0f, 12.0f)
                close()
                moveTo(18.0f, 9.0f)
                curveTo(16.98f, 9.0f, 16.078f, 9.508f, 15.535f, 10.29f)
                curveTo(15.198f, 10.775f, 15.0f, 11.363f, 15.0f, 12.0f)
                curveTo(15.0f, 13.657f, 16.343f, 15.0f, 18.0f, 15.0f)
                curveTo(19.657f, 15.0f, 21.0f, 13.657f, 21.0f, 12.0f)
                curveTo(21.0f, 10.343f, 19.657f, 9.0f, 18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _glassesLine!!
    }

private var _glassesLine: ImageVector? = null
