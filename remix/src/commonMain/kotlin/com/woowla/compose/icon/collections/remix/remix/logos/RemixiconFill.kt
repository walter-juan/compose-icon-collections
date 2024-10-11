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

public val LogosGroup.RemixiconFill: ImageVector
    get() {
        if (_remixiconFill != null) {
            return _remixiconFill!!
        }
        _remixiconFill = Builder(name = "RemixiconFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.53f, 17.529f)
                lineTo(20.001f, 21.0f)
                horizontalLineTo(3.001f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.668f)
                verticalLineTo(4.008f)
                curveTo(13.778f, 4.003f, 13.889f, 4.0f, 14.001f, 4.0f)
                curveTo(14.046f, 4.0f, 14.092f, 4.0f, 14.137f, 4.001f)
                curveTo(14.048f, 4.372f, 14.001f, 4.762f, 14.001f, 5.167f)
                curveTo(14.001f, 7.485f, 16.016f, 9.5f, 18.668f, 9.5f)
                curveTo(19.392f, 9.5f, 20.087f, 9.303f, 20.7f, 8.962f)
                curveTo(20.896f, 9.607f, 21.001f, 10.291f, 21.001f, 11.0f)
                curveTo(21.001f, 13.974f, 19.146f, 16.515f, 16.53f, 17.529f)
                close()
                moveTo(18.501f, 7.5f)
                curveTo(17.12f, 7.5f, 16.001f, 6.381f, 16.001f, 5.0f)
                curveTo(16.001f, 3.619f, 17.12f, 2.5f, 18.501f, 2.5f)
                curveTo(19.882f, 2.5f, 21.001f, 3.619f, 21.001f, 5.0f)
                curveTo(21.001f, 6.381f, 19.882f, 7.5f, 18.501f, 7.5f)
                close()
            }
        }
        .build()
        return _remixiconFill!!
    }

private var _remixiconFill: ImageVector? = null
