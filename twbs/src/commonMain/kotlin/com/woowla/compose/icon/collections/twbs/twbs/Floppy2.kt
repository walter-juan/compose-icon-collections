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

public val Twbs.Floppy2: ImageVector
    get() {
        if (_floppy2 != null) {
            return _floppy2!!
        }
        _floppy2 = Builder(name = "Floppy2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 0.0f)
                horizontalLineToRelative(11.586f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                lineToRelative(1.415f, 1.414f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 2.914f)
                verticalLineTo(14.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 14.5f)
                verticalLineToRelative(-13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 0.0f)
                moveTo(1.0f, 1.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 9.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineTo(2.914f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.146f, -0.353f)
                lineToRelative(-1.415f, -1.415f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.086f, 1.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 6.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 4.5f)
                verticalLineTo(1.0f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                moveToRelative(9.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _floppy2!!
    }

private var _floppy2: ImageVector? = null
