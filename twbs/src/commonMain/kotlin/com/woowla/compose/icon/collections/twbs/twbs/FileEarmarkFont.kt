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

public val Twbs.FileEarmarkFont: ImageVector
    get() {
        if (_fileEarmarkFont != null) {
            return _fileEarmarkFont!!
        }
        _fileEarmarkFont = Builder(name = "FileEarmarkFont", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.943f, 6.0f)
                horizontalLineTo(5.057f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.18f, -1.096f, 0.356f, -1.192f, 1.694f, -1.235f)
                lineToRelative(0.293f, -0.01f)
                verticalLineToRelative(5.09f)
                curveToRelative(0.0f, 0.47f, -0.1f, 0.582f, -0.898f, 0.655f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(9.41f)
                verticalLineToRelative(-0.5f)
                curveToRelative(-0.803f, -0.073f, -0.903f, -0.184f, -0.903f, -0.654f)
                verticalLineTo(6.755f)
                lineToRelative(0.298f, 0.01f)
                curveToRelative(1.338f, 0.043f, 1.514f, 0.14f, 1.694f, 1.235f)
                horizontalLineToRelative(0.5f)
                lineToRelative(-0.057f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(4.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(11.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 3.0f)
                lineTo(9.5f, 1.0f)
                lineTo(4.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 4.5f)
                close()
            }
        }
        .build()
        return _fileEarmarkFont!!
    }

private var _fileEarmarkFont: ImageVector? = null
