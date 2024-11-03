package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FunnelFill: ImageVector
    get() {
        if (_funnelFill != null) {
            return _funnelFill!!
        }
        _funnelFill = Builder(name = "FunnelFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 1.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.128f, 0.334f)
                lineTo(10.0f, 8.692f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.342f, 0.474f)
                lineToRelative(-3.0f, 1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 14.5f)
                verticalLineTo(8.692f)
                lineTo(1.628f, 3.834f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 1.5f, 3.5f)
                close()
            }
        }
        .build()
        return _funnelFill!!
    }

private var _funnelFill: ImageVector? = null
