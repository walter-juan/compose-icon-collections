package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.VimeoFill: ImageVector
    get() {
        if (_vimeoFill != null) {
            return _vimeoFill!!
        }
        _vimeoFill = Builder(name = "VimeoFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.174f, 8.301f)
                curveTo(0.893f, 7.888f, 0.922f, 7.888f, 1.502f, 7.379f)
                curveTo(2.734f, 6.297f, 3.896f, 5.113f, 5.238f, 4.167f)
                curveTo(6.453f, 3.315f, 8.064f, 2.765f, 9.165f, 4.12f)
                curveTo(10.179f, 5.369f, 10.203f, 7.262f, 10.46f, 8.77f)
                curveTo(10.717f, 10.334f, 10.963f, 11.934f, 11.511f, 13.431f)
                curveTo(11.663f, 13.851f, 11.953f, 14.647f, 12.479f, 14.714f)
                curveTo(13.157f, 14.807f, 13.847f, 13.618f, 14.162f, 13.174f)
                curveTo(14.979f, 11.995f, 16.087f, 10.405f, 15.947f, 8.888f)
                curveTo(15.809f, 7.276f, 14.068f, 7.579f, 12.981f, 7.964f)
                curveTo(13.156f, 6.155f, 14.839f, 4.121f, 16.461f, 3.433f)
                curveTo(18.18f, 2.72f, 20.737f, 2.732f, 21.601f, 4.671f)
                curveTo(22.524f, 6.773f, 21.694f, 9.214f, 20.689f, 11.119f)
                curveTo(19.593f, 13.187f, 18.18f, 15.101f, 16.671f, 16.889f)
                curveTo(15.34f, 18.477f, 13.765f, 20.219f, 11.78f, 20.978f)
                curveTo(9.514f, 21.842f, 8.171f, 20.158f, 7.399f, 18.208f)
                curveTo(6.556f, 16.085f, 6.137f, 13.702f, 5.529f, 11.491f)
                curveTo(5.273f, 10.557f, 4.969f, 9.494f, 4.362f, 8.723f)
                curveTo(3.57f, 7.728f, 2.67f, 8.663f, 1.888f, 9.2f)
                curveTo(1.619f, 8.933f, 1.397f, 8.593f, 1.174f, 8.301f)
                close()
            }
        }
        .build()
        return _vimeoFill!!
    }

private var _vimeoFill: ImageVector? = null
