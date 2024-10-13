package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlTumblr: ImageVector
    get() {
        if (_bxlTumblr != null) {
            return _bxlTumblr!!
        }
        _bxlTumblr = Builder(name = "BxlTumblr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.078f, 20.953f)
                curveToRelative(-2.692f, 0.0f, -4.699f, -1.385f, -4.699f, -4.7f)
                verticalLineToRelative(-5.308f)
                horizontalLineTo(6.931f)
                verticalLineTo(8.07f)
                curveToRelative(2.694f, -0.699f, 3.821f, -3.017f, 3.95f, -5.023f)
                horizontalLineToRelative(2.796f)
                verticalLineToRelative(4.558f)
                horizontalLineToRelative(3.263f)
                verticalLineToRelative(3.34f)
                horizontalLineToRelative(-3.263f)
                verticalLineToRelative(4.622f)
                curveToRelative(0.0f, 1.386f, 0.699f, 1.864f, 1.813f, 1.864f)
                horizontalLineToRelative(1.58f)
                verticalLineToRelative(3.522f)
                horizontalLineToRelative(-2.992f)
                close()
            }
        }
        .build()
        return _bxlTumblr!!
    }

private var _bxlTumblr: ImageVector? = null
