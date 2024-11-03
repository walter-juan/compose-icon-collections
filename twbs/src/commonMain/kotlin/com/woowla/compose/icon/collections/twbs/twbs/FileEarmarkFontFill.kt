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

public val Twbs.FileEarmarkFontFill: ImageVector
    get() {
        if (_fileEarmarkFontFill != null) {
            return _fileEarmarkFontFill!!
        }
        _fileEarmarkFontFill = Builder(name = "FileEarmarkFontFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.293f, 0.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.707f, 4.0f)
                lineTo(10.0f, 0.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.293f, 0.0f)
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                moveTo(5.057f, 6.0f)
                horizontalLineToRelative(5.886f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.18f, -1.096f, -0.356f, -1.192f, -1.694f, -1.235f)
                lineToRelative(-0.298f, -0.01f)
                verticalLineToRelative(5.09f)
                curveToRelative(0.0f, 0.47f, 0.1f, 0.582f, 0.903f, 0.655f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(6.59f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.799f, -0.073f, 0.898f, -0.184f, 0.898f, -0.654f)
                verticalLineTo(6.755f)
                lineToRelative(-0.293f, 0.01f)
                curveTo(5.856f, 6.808f, 5.68f, 6.905f, 5.5f, 8.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _fileEarmarkFontFill!!
    }

private var _fileEarmarkFontFill: ImageVector? = null
