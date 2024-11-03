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

public val Twbs.Signpost2Fill: ImageVector
    get() {
        if (_signpost2Fill != null) {
            return _signpost2Fill!!
        }
        _signpost2Fill = Builder(name = "Signpost2Fill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.293f, 0.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 1.414f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, 0.4f)
                lineTo(0.725f, 8.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.6f)
                lineToRelative(0.975f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, 0.4f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, -0.4f)
                lineToRelative(0.975f, -1.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.6f)
                lineTo(14.3f, 2.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.8f, -0.4f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-0.586f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.293f, 0.707f)
            }
        }
        .build()
        return _signpost2Fill!!
    }

private var _signpost2Fill: ImageVector? = null
