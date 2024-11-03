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

public val Twbs.Explicit: ImageVector
    get() {
        if (_explicit != null) {
            return _explicit!!
        }
        _explicit = Builder(name = "Explicit", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.826f, 10.88f)
                horizontalLineTo(10.5f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(4.002f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.12f)
                horizontalLineTo(6.826f)
                verticalLineTo(7.4f)
                horizontalLineToRelative(3.457f)
                verticalLineToRelative(1.073f)
                horizontalLineTo(6.826f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.0f, 2.5f)
                verticalLineToRelative(11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.5f, 16.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.5f, 0.0f)
                close()
                moveTo(1.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 1.0f)
                horizontalLineToRelative(11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 2.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 13.5f)
                close()
            }
        }
        .build()
        return _explicit!!
    }

private var _explicit: ImageVector? = null
