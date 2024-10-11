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

public val LogosGroup.BlueskyFill: ImageVector
    get() {
        if (_blueskyFill != null) {
            return _blueskyFill!!
        }
        _blueskyFill = Builder(name = "BlueskyFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.388f)
                curveTo(11.094f, 9.627f, 8.628f, 6.344f, 6.335f, 4.726f)
                curveTo(4.138f, 3.175f, 3.301f, 3.443f, 2.752f, 3.693f)
                curveTo(2.116f, 3.978f, 2.0f, 4.955f, 2.0f, 5.528f)
                curveTo(2.0f, 6.103f, 2.315f, 10.237f, 2.52f, 10.928f)
                curveTo(3.199f, 13.208f, 5.614f, 13.978f, 7.839f, 13.731f)
                curveTo(4.579f, 14.214f, 1.683f, 15.402f, 5.481f, 19.629f)
                curveTo(9.658f, 23.954f, 11.206f, 18.702f, 12.0f, 16.039f)
                curveTo(12.794f, 18.702f, 13.708f, 23.765f, 18.444f, 19.629f)
                curveTo(22.0f, 16.039f, 19.421f, 14.214f, 16.161f, 13.731f)
                curveTo(18.386f, 13.978f, 20.801f, 13.208f, 21.48f, 10.928f)
                curveTo(21.685f, 10.238f, 22.0f, 6.103f, 22.0f, 5.529f)
                curveTo(22.0f, 4.954f, 21.884f, 3.978f, 21.248f, 3.691f)
                curveTo(20.699f, 3.443f, 19.862f, 3.174f, 17.665f, 4.724f)
                curveTo(15.372f, 6.345f, 12.906f, 9.628f, 12.0f, 11.388f)
                close()
            }
        }
        .build()
        return _blueskyFill!!
    }

private var _blueskyFill: ImageVector? = null
