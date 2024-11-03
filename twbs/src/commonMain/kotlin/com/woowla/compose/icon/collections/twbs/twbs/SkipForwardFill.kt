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

public val Twbs.SkipForwardFill: ImageVector
    get() {
        if (_skipForwardFill != null) {
            return _skipForwardFill!!
        }
        _skipForwardFill = Builder(name = "SkipForwardFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineTo(8.753f)
                lineToRelative(-6.267f, 3.636f)
                curveToRelative(-0.54f, 0.313f, -1.233f, -0.066f, -1.233f, -0.697f)
                verticalLineToRelative(-2.94f)
                lineToRelative(-6.267f, 3.636f)
                curveTo(0.693f, 12.703f, 0.0f, 12.324f, 0.0f, 11.693f)
                verticalLineTo(4.308f)
                curveToRelative(0.0f, -0.63f, 0.693f, -1.01f, 1.233f, -0.696f)
                lineTo(7.5f, 7.248f)
                verticalLineToRelative(-2.94f)
                curveToRelative(0.0f, -0.63f, 0.693f, -1.01f, 1.233f, -0.696f)
                lineTo(15.0f, 7.248f)
                verticalLineTo(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
            }
        }
        .build()
        return _skipForwardFill!!
    }

private var _skipForwardFill: ImageVector? = null
