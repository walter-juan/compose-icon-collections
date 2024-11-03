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

public val Twbs.MagnetFill: ImageVector
    get() {
        if (_magnetFill != null) {
            return _magnetFill!!
        }
        _magnetFill = Builder(name = "MagnetFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(5.0f, 12.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _magnetFill!!
    }

private var _magnetFill: ImageVector? = null
