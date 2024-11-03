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

public val Twbs.Sticky: ImageVector
    get() {
        if (_sticky != null) {
            return _sticky!!
        }
        _sticky = Builder(name = "Sticky", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 2.5f)
                verticalLineToRelative(11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 15.0f)
                horizontalLineToRelative(6.086f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.06f, -0.44f)
                lineToRelative(4.915f, -4.914f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 8.586f)
                lineTo(15.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 1.0f)
                close()
                moveTo(2.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(14.0f, 8.0f)
                lineTo(9.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 9.5f)
                lineTo(8.0f, 14.0f)
                lineTo(2.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(9.0f, 13.793f)
                lineTo(9.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(4.293f)
                close()
            }
        }
        .build()
        return _sticky!!
    }

private var _sticky: ImageVector? = null
