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

public val Twbs.Signpost2: ImageVector
    get() {
        if (_signpost2 != null) {
            return _signpost2!!
        }
        _signpost2 = Builder(name = "Signpost2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.414f)
                lineTo(7.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, 0.4f)
                lineTo(0.725f, 8.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.6f)
                lineToRelative(0.975f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, 0.4f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(15.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(9.0f, 7.0f)
                lineTo(9.0f, 6.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, -0.4f)
                lineToRelative(0.975f, -1.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.6f)
                lineTo(14.3f, 2.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, -0.4f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(-0.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                moveTo(13.5f, 3.0f)
                lineToRelative(0.75f, 1.0f)
                lineToRelative(-0.75f, 1.0f)
                lineTo(2.0f, 5.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(14.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.5f, 10.0f)
                lineToRelative(-0.75f, -1.0f)
                lineToRelative(0.75f, -1.0f)
                close()
            }
        }
        .build()
        return _signpost2!!
    }

private var _signpost2: ImageVector? = null
