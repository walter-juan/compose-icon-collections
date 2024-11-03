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

public val Twbs.StackOverflow: ImageVector
    get() {
        if (_stackOverflow != null) {
            return _stackOverflow!!
        }
        _stackOverflow = Builder(name = "StackOverflow", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.412f, 14.572f)
                verticalLineTo(10.29f)
                horizontalLineToRelative(1.428f)
                verticalLineTo(16.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-5.71f)
                horizontalLineToRelative(1.428f)
                verticalLineToRelative(4.282f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.857f, 13.145f)
                horizontalLineToRelative(7.137f)
                verticalLineToRelative(-1.428f)
                lineTo(3.857f, 11.717f)
                close()
                moveTo(10.254f, 0.0f)
                lineTo(9.108f, 0.852f)
                lineToRelative(4.26f, 5.727f)
                lineToRelative(1.146f, -0.852f)
                close()
                moveTo(6.714f, 3.377f)
                lineTo(12.198f, 7.944f)
                lineTo(13.111f, 6.847f)
                lineTo(7.627f, 2.28f)
                lineToRelative(-0.914f, 1.097f)
                close()
                moveTo(4.922f, 6.55f)
                lineToRelative(6.47f, 3.013f)
                lineToRelative(0.603f, -1.294f)
                lineToRelative(-6.47f, -3.013f)
                close()
                moveTo(3.997f, 9.894f)
                lineTo(10.982f, 11.363f)
                lineTo(11.276f, 9.965f)
                lineTo(4.291f, 8.497f)
                close()
            }
        }
        .build()
        return _stackOverflow!!
    }

private var _stackOverflow: ImageVector? = null
