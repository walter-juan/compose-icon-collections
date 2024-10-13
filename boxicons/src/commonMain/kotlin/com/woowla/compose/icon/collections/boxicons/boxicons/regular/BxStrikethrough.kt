package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxStrikethrough: ImageVector
    get() {
        if (_bxStrikethrough != null) {
            return _bxStrikethrough!!
        }
        _bxStrikethrough = Builder(name = "BxStrikethrough", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-4.0f, 0.0f, -4.0f, -1.816f, -4.0f, -2.5f)
                curveTo(8.0f, 7.882f, 8.0f, 6.0f, 12.0f, 6.0f)
                curveToRelative(2.8f, 0.0f, 2.99f, 1.678f, 3.0f, 2.014f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -1.384f, -1.045f, -4.0f, -5.0f, -4.0f)
                curveToRelative(-5.416f, 0.0f, -6.0f, 3.147f, -6.0f, 4.5f)
                curveToRelative(0.0f, 0.728f, 0.148f, 1.667f, 0.736f, 2.5f)
                lineTo(4.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-3.793f, 0.0f, -3.99f, -1.815f, -4.0f, -2.0f)
                lineTo(6.0f, 16.0f)
                curveToRelative(0.0f, 0.04f, 0.069f, 4.0f, 6.0f, 4.0f)
                curveToRelative(5.221f, 0.0f, 6.0f, -2.819f, 6.0f, -4.5f)
                curveToRelative(0.0f, -0.146f, -0.009f, -0.317f, -0.028f, -0.5f)
                horizontalLineToRelative(-2.006f)
                curveToRelative(0.032f, 0.2f, 0.034f, 0.376f, 0.034f, 0.5f)
                curveToRelative(0.0f, 0.684f, 0.0f, 2.5f, -4.0f, 2.5f)
                close()
            }
        }
        .build()
        return _bxStrikethrough!!
    }

private var _bxStrikethrough: ImageVector? = null
