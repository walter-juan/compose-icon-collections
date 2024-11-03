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

public val Twbs.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) {
            return _eyedropper!!
        }
        _eyedropper = Builder(name = "Eyedropper", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.354f, 0.646f)
                arcToRelative(1.207f, 1.207f, 0.0f, false, false, -1.708f, 0.0f)
                lineTo(8.5f, 3.793f)
                lineToRelative(-0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineTo(8.293f, 5.0f)
                lineToRelative(-7.147f, 7.146f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 1.0f, 12.5f)
                verticalLineToRelative(1.793f)
                lineToRelative(-0.854f, 0.853f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, 0.707f)
                lineTo(1.707f, 15.0f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.354f, -0.146f)
                lineTo(11.0f, 7.707f)
                lineToRelative(1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.708f)
                lineToRelative(-0.647f, -0.646f)
                lineToRelative(3.147f, -3.146f)
                arcToRelative(1.207f, 1.207f, 0.0f, false, false, 0.0f, -1.708f)
                close()
                moveTo(2.0f, 12.707f)
                lineToRelative(7.0f, -7.0f)
                lineTo(10.293f, 7.0f)
                lineToRelative(-7.0f, 7.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
