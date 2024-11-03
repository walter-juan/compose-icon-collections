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

public val Twbs.PersonFillSlash: ImageVector
    get() {
        if (_personFillSlash != null) {
            return _personFillSlash!!
        }
        _personFillSlash = Builder(name = "PersonFillSlash", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.879f, 10.414f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, -3.465f, 3.465f)
                close()
                moveTo(14.586f, 11.121f)
                lineTo(11.121f, 14.586f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 3.465f, -3.465f)
                moveToRelative(-4.56f, -1.096f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 4.949f, 4.95f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.95f, -4.95f)
                close()
                moveTo(11.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                moveToRelative(-9.0f, 8.0f)
                curveToRelative(0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.256f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 8.0f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 1.544f, -3.393f)
                quadTo(8.844f, 9.002f, 8.0f, 9.0f)
                curveToRelative(-5.0f, 0.0f, -6.0f, 3.0f, -6.0f, 4.0f)
            }
        }
        .build()
        return _personFillSlash!!
    }

private var _personFillSlash: ImageVector? = null
