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

public val Twbs.Link45deg: ImageVector
    get() {
        if (_link45deg != null) {
            return _link45deg!!
        }
        _link45deg = Builder(name = "Link45deg", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.715f, 6.542f)
                lineTo(3.343f, 7.914f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 4.243f, 4.243f)
                lineToRelative(1.828f, -1.829f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.586f, 5.5f)
                lineTo(8.0f, 6.086f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.154f, 0.199f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.861f, 3.337f)
                lineTo(6.88f, 11.45f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.83f, -2.83f)
                lineToRelative(0.793f, -0.792f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.128f, -1.287f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.586f, 4.672f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.414f, 9.5f)
                lineToRelative(0.775f, -0.776f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.896f, -3.346f)
                lineTo(9.12f, 3.55f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.83f, 2.83f)
                lineToRelative(-0.793f, 0.792f)
                curveToRelative(0.112f, 0.42f, 0.155f, 0.855f, 0.128f, 1.287f)
                lineToRelative(1.372f, -1.372f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -4.243f, -4.243f)
                close()
            }
        }
        .build()
        return _link45deg!!
    }

private var _link45deg: ImageVector? = null
