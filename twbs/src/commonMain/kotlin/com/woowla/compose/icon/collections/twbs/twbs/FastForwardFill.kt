package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FastForwardFill: ImageVector
    get() {
        if (_fastForwardFill != null) {
            return _fastForwardFill!!
        }
        _fastForwardFill = Builder(name = "FastForwardFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.596f, 7.304f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, true, 0.0f, 1.392f)
                lineToRelative(-6.363f, 3.692f)
                curveTo(0.713f, 12.69f, 0.0f, 12.345f, 0.0f, 11.692f)
                verticalLineTo(4.308f)
                curveToRelative(0.0f, -0.653f, 0.713f, -0.998f, 1.233f, -0.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.596f, 7.304f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, true, 0.0f, 1.392f)
                lineToRelative(-6.363f, 3.692f)
                curveTo(8.713f, 12.69f, 8.0f, 12.345f, 8.0f, 11.692f)
                verticalLineTo(4.308f)
                curveToRelative(0.0f, -0.653f, 0.713f, -0.998f, 1.233f, -0.696f)
                close()
            }
        }
        .build()
        return _fastForwardFill!!
    }

private var _fastForwardFill: ImageVector? = null
