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

public val Twbs.Tiktok: ImageVector
    get() {
        if (_tiktok != null) {
            return _tiktok!!
        }
        _tiktok = Builder(name = "Tiktok", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 0.0f)
                horizontalLineToRelative(1.98f)
                curveToRelative(0.144f, 0.715f, 0.54f, 1.617f, 1.235f, 2.512f)
                curveTo(12.895f, 3.389f, 13.797f, 4.0f, 15.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-1.753f, 0.0f, -3.07f, -0.814f, -4.0f, -1.829f)
                verticalLineTo(11.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -5.0f, -5.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _tiktok!!
    }

private var _tiktok: ImageVector? = null
