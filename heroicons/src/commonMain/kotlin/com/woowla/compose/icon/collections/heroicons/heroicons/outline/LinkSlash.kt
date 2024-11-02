package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.LinkSlash: ImageVector
    get() {
        if (_linkSlash != null) {
            return _linkSlash!!
        }
        _linkSlash = Builder(name = "LinkSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.181f, 8.68f)
                curveTo(13.63f, 8.895f, 14.051f, 9.188f, 14.423f, 9.56f)
                curveTo(15.922f, 11.059f, 16.142f, 13.353f, 15.084f, 15.085f)
                moveTo(5.316f, 12.303f)
                lineTo(3.559f, 14.06f)
                curveTo(1.802f, 15.818f, 1.802f, 18.667f, 3.559f, 20.425f)
                curveTo(5.317f, 22.183f, 8.166f, 22.183f, 9.923f, 20.425f)
                lineTo(13.052f, 17.296f)
                moveTo(18.666f, 11.681f)
                lineTo(20.423f, 9.924f)
                curveTo(22.18f, 8.166f, 22.18f, 5.317f, 20.423f, 3.559f)
                curveTo(18.666f, 1.802f, 15.816f, 1.802f, 14.059f, 3.559f)
                lineTo(9.559f, 8.06f)
                curveTo(9.301f, 8.318f, 9.08f, 8.6f, 8.898f, 8.899f)
                moveTo(10.801f, 15.304f)
                curveTo(10.352f, 15.09f, 9.931f, 14.796f, 9.559f, 14.424f)
                curveTo(9.067f, 13.933f, 8.713f, 13.355f, 8.497f, 12.741f)
                moveTo(15.084f, 15.085f)
                lineTo(20.991f, 20.993f)
                moveTo(15.084f, 15.085f)
                lineTo(8.898f, 8.899f)
                moveTo(2.991f, 2.991f)
                lineTo(8.898f, 8.899f)
            }
        }
        .build()
        return _linkSlash!!
    }

private var _linkSlash: ImageVector? = null
