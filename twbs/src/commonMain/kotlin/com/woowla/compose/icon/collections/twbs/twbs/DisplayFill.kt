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

public val Twbs.DisplayFill: ImageVector
    get() {
        if (_displayFill != null) {
            return _displayFill!!
        }
        _displayFill = Builder(name = "DisplayFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                quadToRelative(0.0f, 1.0f, -0.25f, 1.5f)
                horizontalLineTo(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-0.75f)
                quadTo(10.0f, 13.0f, 10.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.0f, 0.0f, 2.0f, -2.0f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -2.0f, -2.0f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(2.0f)
                curveTo(0.0f, 2.0f, 0.0f, 4.0f, 0.0f, 4.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _displayFill!!
    }

private var _displayFill: ImageVector? = null
