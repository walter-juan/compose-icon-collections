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

public val Twbs.Substack: ImageVector
    get() {
        if (_substack != null) {
            return _substack!!
        }
        _substack = Builder(name = "Substack", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.604f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(1.891f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.89f)
                close()
                moveTo(1.0f, 7.208f)
                verticalLineTo(16.0f)
                lineToRelative(7.0f, -3.926f)
                lineTo(15.0f, 16.0f)
                verticalLineTo(7.208f)
                close()
                moveTo(15.0f, 0.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(1.89f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _substack!!
    }

private var _substack: ImageVector? = null
